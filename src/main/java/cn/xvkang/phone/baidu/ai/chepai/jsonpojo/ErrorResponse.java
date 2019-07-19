package cn.xvkang.phone.baidu.ai.chepai.jsonpojo;

public class ErrorResponse {
	private long log_id;

	private int error_code;

	private String error_msg;

	public void setLog_id(long log_id) {
		this.log_id = log_id;
	}

	public long getLog_id() {
		return this.log_id;
	}

	public void setError_code(int error_code) {
		this.error_code = error_code;
	}

	public int getError_code() {
		return this.error_code;
	}

	public void setError_msg(String error_msg) {
		this.error_msg = error_msg;
	}

	public String getError_msg() {
		return this.error_msg;
	}
}
