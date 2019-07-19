package cn.xvkang.phone.baidu.ai.chepai.jsonpojo;

import java.util.List;

public class Words_result {
	private String color;

	private String number;

	private List<Double> probability;

	private List<Vertexes_location> vertexes_location;

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return this.number;
	}

	public void setProbability(List<Double> probability) {
		this.probability = probability;
	}

	public List<Double> getProbability() {
		return this.probability;
	}

	public void setVertexes_location(List<Vertexes_location> vertexes_location) {
		this.vertexes_location = vertexes_location;
	}

	public List<Vertexes_location> getVertexes_location() {
		return this.vertexes_location;
	}
}
