package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class DtCardtype implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.965+08:00", comments="Source field: Dt_CardType.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.965+08:00", comments="Source field: Dt_CardType.CardCname")
    private String cardcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.966+08:00", comments="Source field: Dt_CardType.CardEname")
    private String cardename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.966+08:00", comments="Source field: Dt_CardType.Mark")
    private String mark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Dt_CardType
     *
     * @mbg.generated Fri Jul 19 09:31:21 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.965+08:00", comments="Source field: Dt_CardType.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.965+08:00", comments="Source field: Dt_CardType.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.966+08:00", comments="Source field: Dt_CardType.CardCname")
    public String getCardcname() {
        return cardcname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.966+08:00", comments="Source field: Dt_CardType.CardCname")
    public void setCardcname(String cardcname) {
        this.cardcname = cardcname == null ? null : cardcname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.966+08:00", comments="Source field: Dt_CardType.CardEname")
    public String getCardename() {
        return cardename;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.966+08:00", comments="Source field: Dt_CardType.CardEname")
    public void setCardename(String cardename) {
        this.cardename = cardename == null ? null : cardename.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.966+08:00", comments="Source field: Dt_CardType.Mark")
    public String getMark() {
        return mark;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.966+08:00", comments="Source field: Dt_CardType.Mark")
    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }
}