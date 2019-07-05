package cn.xvkang.utils;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TonglianSmsUtils {
	private static Logger logger = LoggerFactory.getLogger(TonglianSmsUtils.class);

	/**
	 * 发送成功返回 <?xml version="1.0" encoding="utf-8"?>
	 * <CSubmitState xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi=
	 * "http://www.w3.org/2001/XMLSchema-instance" xmlns="http://tempuri.org/">
	 * <State>0</State> <MsgID>1905200901088109033</MsgID> <MsgState>提交成功</MsgState>
	 * <Reserve>1</Reserve> </CSubmitState> 发送失败返回 <?xml version="1.0"
	 * encoding="utf-8"?>
	 * <CSubmitState xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi=
	 * "http://www.w3.org/2001/XMLSchema-instance" xmlns="http://tempuri.org/">
	 * <State>1038</State> <MsgID>0</MsgID>
	 * <MsgState>产品1012808266要求强制签名，账号DLXINKAO,企业代码,签名 【校园报系统】 未报备</MsgState>
	 * <Reserve>0</Reserve> </CSubmitState>
	 * 
	 * <?xml version="1.0" encoding="utf-8"?>
	 * <CSubmitState xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi=
	 * "http://www.w3.org/2001/XMLSchema-instance" xmlns="http://tempuri.org/">
	 * <State>1038</State> <MsgID>0</MsgID>
	 * <MsgState>产品1012808266要求强制签名，账号DLXINKAO,企业代码,签名 【校园报系统】 未报备</MsgState>
	 * <Reserve>0</Reserve> </CSubmitState>
	 */
	public static boolean sendSms(String smsUrl, String smsName, String smsPwd, String smsPrdid, String sms_sign,
			String phone, String msg) {

		try (CloseableHttpClient closeableHttpClient = HttpClients.createDefault();) {
//			sms_url=https://seccf.51welink.com/submitdata/service.asmx/g_Submit
//				sms_name=dlxinkao
//				sms_pwd=YsrGj22D
//				sms_prdid=1012808
//				sms_sign=【校园报名系统】

			HttpPost httpPost = new HttpPost(smsUrl);
			httpPost.setHeader("Connection", "close");
			List<NameValuePair> form = new ArrayList<>();
			form.add(new BasicNameValuePair("sname", smsName));
			form.add(new BasicNameValuePair("spwd", smsPwd));
			form.add(new BasicNameValuePair("scorpid", ""));
			form.add(new BasicNameValuePair("sprdid", smsPrdid));
			form.add(new BasicNameValuePair("sdst", phone));
			form.add(new BasicNameValuePair("smsg", msg + sms_sign));
			UrlEncodedFormEntity entity = new UrlEncodedFormEntity(form, "UTF-8");
			httpPost.setEntity(entity);
			
			CloseableHttpResponse response = closeableHttpClient.execute(httpPost);
			HttpEntity responseHttpEntity = response.getEntity();
			InputStream responseInputStream = responseHttpEntity.getContent();
			// List<String> readLines = IOUtils.readLines(responseInputStream, "UTF-8");
			// if (readLines != null && readLines.size() > 0) {
			// String responseUtf8String = StringUtils.join(readLines, "");

			SAXReader saxReader = new SAXReader();
			Document document = saxReader.read(responseInputStream);
			String responseXml = document.asXML();
			logger.info("======>发送短信验证码," + phone + ",返回的结果," + responseXml);
			// Node selectSingleNode = document.selectSingleNode("/CSubmitState/State");
			Node selectSingleNode = document.selectSingleNode("//*[local-name()='State']");
			if (selectSingleNode != null) {
				String state = selectSingleNode.getStringValue();
				if ("0".equals(state)) {
					// 发送成功
					return true;
				}
			}

			// }
			closeableHttpClient.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

}
