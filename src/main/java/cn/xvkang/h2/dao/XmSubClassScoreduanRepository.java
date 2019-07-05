package cn.xvkang.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.xvkang.h2.entity.XmSubClassScoreduan;

@Repository
public interface XmSubClassScoreduanRepository extends JpaRepository<XmSubClassScoreduan, Long> {
	@Modifying
	@Transactional
	public int deleteByUuid(String uuid);

	@Query("select distinct a.subid from  XmSubClassScoreduan a  where a.uuid = ?1 and a.xmid=?2")
	public List<String> selectDistinctSubidByUUidAndXmId(String uuid, String xmid);

//	@Query("select a.count from  XmSubClassScoreduan a  where a.uuid = ?1 and a.xmid=?2 and a.subid=?3 and a.bj=?4 and a.fengshuduan=?5F")
//	public Integer findCountByUk(String uuid, String xmid, String subid, String bj, String fengshuduan);
	public XmSubClassScoreduan findByUuidAndXmidAndSubidAndBjAndFengshuduan(String uuid, String xmid, String subid,
			String bj, String fengshuduan);
}
