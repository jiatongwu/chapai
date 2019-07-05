package cn.xvkang.h2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Xm_Sub_Class_Scoreduan",uniqueConstraints = {@UniqueConstraint(columnNames={"uuid","xmid","subid", "bj","fengshuduan"})})
public class XmSubClassScoreduan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String uuid;
	private String xmid;
	private String subid;
	private String bj;
	private String fengshuduan;
	private Integer count;
	
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
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
	public String getFengshuduan() {
		return fengshuduan;
	}
	public void setFengshuduan(String fengshuduan) {
		this.fengshuduan = fengshuduan;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
