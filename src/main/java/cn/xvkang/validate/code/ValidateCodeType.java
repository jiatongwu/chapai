/**
 * 
 */
package cn.xvkang.validate.code;

import cn.xvkang.utils.Constants;

/**
 * @author zhailiang
 *
 */
public enum ValidateCodeType {

	/**
	 * 短信验证码
	 */
	SMS {
		@Override
		public String getParamNameOnValidate() {
			return Constants.SMS_VALIDAE_PREFIX_NAME;
		}
	},
	/**
	 * 图片验证码
	 */
	IMAGE {
		@Override
		public String getParamNameOnValidate() {
			return Constants.IMAGE_VALIDAE_PREFIX_NAME;
		}
	};

	/**
	 * 校验时从请求中获取的参数的名字
	 * 
	 * @return
	 */
	public abstract String getParamNameOnValidate();

}
