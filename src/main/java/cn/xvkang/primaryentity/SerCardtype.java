package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class SerCardtype implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.850+08:00", comments="Source field: Ser_CardType.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.850+08:00", comments="Source field: Ser_CardType.CardCname")
    private String cardcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.850+08:00", comments="Source field: Ser_CardType.CardEname")
    private String cardename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.850+08:00", comments="Source field: Ser_CardType.Mark")
    private String mark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Ser_CardType
     *
     * @mbg.generated Thu Jul 18 14:55:17 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.850+08:00", comments="Source field: Ser_CardType.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.850+08:00", comments="Source field: Ser_CardType.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.850+08:00", comments="Source field: Ser_CardType.CardCname")
    public String getCardcname() {
        return cardcname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.850+08:00", comments="Source field: Ser_CardType.CardCname")
    public void setCardcname(String cardcname) {
        this.cardcname = cardcname == null ? null : cardcname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.850+08:00", comments="Source field: Ser_CardType.CardEname")
    public String getCardename() {
        return cardename;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.850+08:00", comments="Source field: Ser_CardType.CardEname")
    public void setCardename(String cardename) {
        this.cardename = cardename == null ? null : cardename.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.850+08:00", comments="Source field: Ser_CardType.Mark")
    public String getMark() {
        return mark;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.850+08:00", comments="Source field: Ser_CardType.Mark")
    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }
}