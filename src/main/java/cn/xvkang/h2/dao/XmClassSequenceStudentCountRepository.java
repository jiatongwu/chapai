package cn.xvkang.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.xvkang.h2.entity.XmClassSequenceStudentCount;

@Repository
public interface XmClassSequenceStudentCountRepository extends JpaRepository<XmClassSequenceStudentCount, Long> {
	@Modifying
	@Transactional
	public Integer deleteByUuid(String uuid);

	@Query("select sum(a.count) from XmClassSequenceStudentCount a where a.uuid=?1 and a.xmid=?2 and a.mingciduan=?3")
	public Integer selectSumCount(String uuid, String xmid, String mingciduan);

}
