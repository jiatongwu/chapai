package cn.xvkang.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.xvkang.h2.entity.XmSubClassTopAvg;

@Repository
public interface XmSubClassTopAvgRepository extends JpaRepository<XmSubClassTopAvg, Long> {
	@Modifying
	@Transactional
	public int deleteByUuid(String uuid);

	@Modifying
	@Transactional
	@Query("update XmSubClassTopAvg a set a.first25Mingci = ?1 where a.id= ?2")
	public int update25MingciById(Integer mingci, Long id);

	@Modifying
	@Transactional
	@Query("update XmSubClassTopAvg a set a.first50Mingci = ?1 where a.id = ?2")
	public int update50MingciById(Integer mingci, Long id);

	// @Query("from XmSubClassTopAvg a where a.uuid=?1 and a.xmid=?2 and a.subid=?3
	// and a.bj=?4")
	public XmSubClassTopAvg findByUuidAndXmidAndSubidAndBj(String uuid, String xmId, String subid, String bj);

	@Query("select max(a.first25Avg) from XmSubClassTopAvg a  where a.uuid = ?1 and a.xmid=?2 and a.subid=?3")
	public Double selectMax25AvgScore(String uuid, String xmId, String subid);

	@Query("select min(a.first25Avg) from XmSubClassTopAvg a  where a.uuid = ?1 and a.xmid=?2 and a.subid=?3")
	public Double selectMin25AvgScore(String uuid, String xmId, String subid);

	@Query("select max(a.first50Avg) from XmSubClassTopAvg a  where a.uuid = ?1 and a.xmid=?2 and a.subid=?3")
	public Double selectMax50AvgScore(String uuid, String xmId, String subid);

	@Query("select min(a.first50Avg) from XmSubClassTopAvg a  where a.uuid = ?1 and a.xmid=?2 and a.subid=?3")
	public Double selectMin50AvgScore(String uuid, String xmId, String subid);

	@Query("select avg(a.first50Avg) from XmSubClassTopAvg a  where a.uuid = ?1 and a.xmid=?2 and a.subid=?3")
	public Double selectAvg50AvgScore(String uuid, String xmId, String subid);

	@Query("select avg(a.first25Avg) from XmSubClassTopAvg a  where a.uuid = ?1 and a.xmid=?2 and a.subid=?3")
	public Double selectAvg25AvgScore(String uuid, String xmId, String subid);

	public List<XmSubClassTopAvg> findByUuidAndXmidAndSubidOrderByFirst25AvgDesc(String uuid, String xmId,
			String subid);

	public List<XmSubClassTopAvg> findByUuidAndXmidAndSubidOrderByFirst50AvgDesc(String uuid, String xmId,
			String subid);
}
