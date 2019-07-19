package cn.xvkang.phone.baidu.ai.chepai.jsonpojo;

public class OkResponse {

	private long log_id;

	private Words_result words_result;

	public void setLog_id(long log_id) {
		this.log_id = log_id;
	}

	public long getLog_id() {
		return this.log_id;
	}

	public void setWords_result(Words_result words_result) {
		this.words_result = words_result;
	}

	public Words_result getWords_result() {
		return this.words_result;
	}

}
