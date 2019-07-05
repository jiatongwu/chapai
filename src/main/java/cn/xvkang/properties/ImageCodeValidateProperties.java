package cn.xvkang.properties;

public class ImageCodeValidateProperties {

	private int length = 6;
	private long validateSecond = 1200;
	private int width;
	private int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public long getValidateSecond() {
		return validateSecond;
	}

	public void setValidateSecond(long validateSecond) {
		this.validateSecond = validateSecond;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
