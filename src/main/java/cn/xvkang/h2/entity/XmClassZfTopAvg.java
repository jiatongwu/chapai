package cn.xvkang.h2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Xm_Class_Zf_Top_Avg", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "uuid","xmid", "bj" }) })
public class XmClassZfTopAvg {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String uuid;
	private String xmid;
	private String bj;
	private Double zfFirst25Avg;
	private Integer zfFirst25AvgMingci;
	private Double zfFirst50Avg;
	private Integer zfFirst50AvgMingci;

	public Long getId() {
		return id;
	}
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getXmid() {
		return xmid;
	}

	public void setXmid(String xmid) {
		this.xmid = xmid;
	}

	public String getBj() {
		return bj;
	}

	public void setBj(String bj) {
		this.bj = bj;
	}

	public Double getZfFirst25Avg() {
		return zfFirst25Avg;
	}

	public void setZfFirst25Avg(Double zfFirst25Avg) {
		this.zfFirst25Avg = zfFirst25Avg;
	}

	public Integer getZfFirst25AvgMingci() {
		return zfFirst25AvgMingci;
	}

	public void setZfFirst25AvgMingci(Integer zfFirst25AvgMingci) {
		this.zfFirst25AvgMingci = zfFirst25AvgMingci;
	}

	public Double getZfFirst50Avg() {
		return zfFirst50Avg;
	}

	public void setZfFirst50Avg(Double zfFirst50Avg) {
		this.zfFirst50Avg = zfFirst50Avg;
	}

	public Integer getZfFirst50AvgMingci() {
		return zfFirst50AvgMingci;
	}

	public void setZfFirst50AvgMingci(Integer zfFirst50AvgMingci) {
		this.zfFirst50AvgMingci = zfFirst50AvgMingci;
	}

}
