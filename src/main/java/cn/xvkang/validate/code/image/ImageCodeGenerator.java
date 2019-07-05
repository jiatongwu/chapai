/**
 * 
 */
package cn.xvkang.validate.code.image;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.request.ServletWebRequest;

import com.google.code.kaptcha.Producer;

import cn.xvkang.properties.ApplicationProperties;
import cn.xvkang.utils.RandomStringUtil;
import cn.xvkang.validate.code.ValidateCodeGenerator;

/**
 * @author zhailiang
 *
 */
public class ImageCodeGenerator implements ValidateCodeGenerator {

	/**
	 * 系统配置
	 */
	// @Autowired
	private ApplicationProperties applicationProperties;
// @Resource
	private Producer captchaProducer;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.imooc.security.core.validate.code.ValidateCodeGenerator#generate(org.
	 * springframework.web.context.request.ServletWebRequest)
	 */

	@Override
	public ImageCode generate(ServletWebRequest request) {
		int length = applicationProperties.getImageCode().getLength();
		try {
			length = ServletRequestUtils.getRequiredIntParameter(request.getRequest(), "length");
		} catch (ServletRequestBindingException e) {
			e.printStackTrace();
		}
		int width = 80;
		int height = 30;
		try {
			width = ServletRequestUtils.getRequiredIntParameter(request.getRequest(), "width");
		} catch (ServletRequestBindingException e) {
			e.printStackTrace();
		}
		try {
			height = ServletRequestUtils.getRequiredIntParameter(request.getRequest(), "height");
		} catch (ServletRequestBindingException e) {
			e.printStackTrace();
		}

		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		Graphics g = image.getGraphics();

		Random random = new Random();

		g.setColor(getRandColor(200, 250));
		g.fillRect(0, 0, width, height);
		int fontSize = 20;
		try {
			fontSize = ServletRequestUtils.getRequiredIntParameter(request.getRequest(), "fontSize");
		} catch (ServletRequestBindingException e) {
			e.printStackTrace();
		}
		g.setFont(new Font("Times New Roman", Font.ITALIC, fontSize));
		g.setColor(getRandColor(160, 200));
		for (int i = 0; i < 155; i++) {
			int x = random.nextInt(width);
			int y = random.nextInt(height);
			int xl = random.nextInt(12);
			int yl = random.nextInt(12);
			g.drawLine(x, y, x + xl, y + yl);
		}

		String sRand = "";
		String randomString = RandomStringUtil.getRandomString(length);
		int jiange = 13;
		try {
			jiange = ServletRequestUtils.getRequiredIntParameter(request.getRequest(), "jiange");
		} catch (ServletRequestBindingException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < length; i++) {
			String rand = new Character(randomString.charAt(i)).toString();
			sRand += rand;
			g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
			g.drawString(rand, width / 2 - length / 2 * jiange + jiange * i, fontSize / 3 + height / 2);
		}
		g.dispose();
		return new ImageCode(image, sRand, applicationProperties.getImageCode().getValidateSecond());
	}

	/**
	 * 生成随机背景条纹
	 * 
	 * @param fc
	 * @param bc
	 * @return
	 */
	public Color getRandColor(int fc, int bc) {
		Random random = new Random();
		if (fc > 255) {
			fc = 255;
		}
		if (bc > 255) {
			bc = 255;
		}
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}

	public ApplicationProperties getApplicationProperties() {
		return applicationProperties;
	}

	public void setApplicationProperties(ApplicationProperties applicationProperties) {
		this.applicationProperties = applicationProperties;
	}

	public Producer getCaptchaProducer() {
		return captchaProducer;
	}

	public void setCaptchaProducer(Producer captchaProducer) {
		this.captchaProducer = captchaProducer;
	}

}
