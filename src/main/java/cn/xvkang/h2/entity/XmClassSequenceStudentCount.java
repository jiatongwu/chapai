package cn.xvkang.h2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Xm_Class_Sequence_Student_Count",uniqueConstraints = {@UniqueConstraint(columnNames={"uuid","xmid", "bj","mingciduan"})})
public class XmClassSequenceStudentCount {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String xmid;
	private String bj;
	private String mingciduan;
	private Integer count;
	private String uuid;
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
	public String getBj() {
		return bj;
	}
	public void setBj(String bj) {
		this.bj = bj;
	}
	public String getMingciduan() {
		return mingciduan;
	}
	public void setMingciduan(String mingciduan) {
		this.mingciduan = mingciduan;
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
