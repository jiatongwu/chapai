package cn.xvkang.utils;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JjwtUtils {
	public static final String SECRET_KEY = "fenghua_school_sec_kkkkkkkkkkkkkkkkkkkkkkkkkkkkkk";

	@SuppressWarnings("deprecation")
	public static String createJWT(String id, String issuer, String subject, long ttlMillis,
			Map<String, String> customPropertiesMap) {

		// The JWT signature algorithm we will be using to sign the token
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

		long nowMillis = System.currentTimeMillis();
		Date now = new Date(nowMillis);

		// We will sign our JWT with our ApiKey secret
		byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(SECRET_KEY);
		Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

		// Let's set the JWT Claims
		JwtBuilder builder = Jwts.builder().setId(id).setIssuedAt(now).setSubject(subject).setIssuer(issuer)
				.signWith(signatureAlgorithm, signingKey);

		// if it has been specified, let's add the expiration
		if (ttlMillis > 0) {
			long expMillis = nowMillis + ttlMillis;
			Date exp = new Date(expMillis);
			builder.setExpiration(exp);
		}
		if (customPropertiesMap != null) {
			for (String key : customPropertiesMap.keySet()) {
				String value = customPropertiesMap.get(key);
				if (value != null) {
					builder.claim(key, value);
				}
			}
		}

		// Builds the JWT and serializes it to a compact, URL-safe string
		return builder.compact();
	}

	public static Claims decodeJWT(String jwt) {
		// This line will throw an exception if it is not a signed JWS (as expected)
		Claims claims = null;
		try {
			claims = Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary(SECRET_KEY)).parseClaimsJws(jwt)
					.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return claims;
	}

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("key01", "value01");
		map.put("key02", "value02");
		String createJWT = createJWT("8", "fenghua_school_baoming", "subject8", 8000, map);
		System.out.println(createJWT);

		Claims decodeJWT = decodeJWT(createJWT );
		if(decodeJWT!=null) {
		String value = (String) decodeJWT.get("key01");
		System.out.println(value);
		}else {
			System.out.println("错误的格式");
		}
	}
}
