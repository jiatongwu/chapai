package cn.xvkang.h2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Xm_Sub_Class_Top_Avg", uniqueConstraints = { @UniqueConstraint(columnNames = { "uuid","xmid", "subid", "bj" }) })
public class XmSubClassTopAvg {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String uuid;
	private String xmid;
	private String subid;
	private String bj;
	private Double first25Avg;
	private Integer first25Mingci;
	private Double first50Avg;
	private Integer first50Mingci;

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

	public String getSubid() {
		return subid;
	}

	public void setSubid(String subid) {
		this.subid = subid;
	}

	public String getBj() {
		return bj;
	}

	public void setBj(String bj) {
		this.bj = bj;
	}

	public Double getFirst25Avg() {
		return first25Avg;
	}

	public void setFirst25Avg(Double first25Avg) {
		this.first25Avg = first25Avg;
	}

	public Integer getFirst25Mingci() {
		return first25Mingci;
	}

	public void setFirst25Mingci(Integer first25Mingci) {
		this.first25Mingci = first25Mingci;
	}

	public Double getFirst50Avg() {
		return first50Avg;
	}

	public void setFirst50Avg(Double first50Avg) {
		this.first50Avg = first50Avg;
	}

	public Integer getFirst50Mingci() {
		return first50Mingci;
	}

	public void setFirst50Mingci(Integer first50Mingci) {
		this.first50Mingci = first50Mingci;
	}

}
