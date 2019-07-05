/**
 * 
 */
package cn.xvkang.validate.code.image;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

import cn.xvkang.validate.code.ValidateCode;

/**
 * @author zhailiang
 *
 */
public class ImageCode extends ValidateCode {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4058568768006166676L;

	private BufferedImage image;

	public ImageCode(BufferedImage image, String code, long expireIn) {
		super(code, expireIn);
		this.image = image;
	}

	public ImageCode(BufferedImage image, String code, LocalDateTime expireTime) {
		super(code, expireTime);
		this.image = image;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

}
