package cn.xvkang.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.xvkang.h2.entity.XmClassZfTopAvg;

@Repository
public interface XmClassZfTopAvgRepository extends JpaRepository<XmClassZfTopAvg, Long> {
	@Modifying
	@Transactional
	public int deleteByUuid(String uuid);

	@Modifying
	@Transactional
	@Query("update XmClassZfTopAvg a set a.zfFirst25AvgMingci = ?1 where a.id= ?2")
	public int update25MingciById(Integer mingci, Long id);

	@Modifying
	@Transactional
	@Query("update XmClassZfTopAvg a set a.zfFirst50AvgMingci = ?1 where a.id = ?2")
	public int update50MingciById(Integer mingci, Long id);

	public List<XmClassZfTopAvg> findByUuidAndXmidOrderByZfFirst25AvgDesc(String uuid, String xmId);

	public List<XmClassZfTopAvg> findByUuidAndXmidOrderByZfFirst50AvgDesc(String uuid, String xmId);

	public XmClassZfTopAvg findByUuidAndXmidAndBj(String uuid, String xmId, String bj);

}
