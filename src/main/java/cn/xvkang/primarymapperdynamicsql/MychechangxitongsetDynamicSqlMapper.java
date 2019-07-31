package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MychechangxitongsetDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Mychechangxitongset;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface MychechangxitongsetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.009+08:00", comments="Source Table: MYCHECHANGXITONGSET")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.009+08:00", comments="Source Table: MYCHECHANGXITONGSET")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.009+08:00", comments="Source Table: MYCHECHANGXITONGSET")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Mychechangxitongset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.009+08:00", comments="Source Table: MYCHECHANGXITONGSET")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MychechangxitongsetResult", value = {
        @Result(column="StationNO", property="stationno", jdbcType=JdbcType.INTEGER),
        @Result(column="CarparkNO", property="carparkno", jdbcType=JdbcType.INTEGER),
        @Result(column="HasImage", property="hasimage", jdbcType=JdbcType.INTEGER),
        @Result(column="ImageSave", property="imagesave", jdbcType=JdbcType.INTEGER),
        @Result(column="SaveDays", property="savedays", jdbcType=JdbcType.INTEGER),
        @Result(column="ImagePath", property="imagepath", jdbcType=JdbcType.VARCHAR),
        @Result(column="TotalCarSpace", property="totalcarspace", jdbcType=JdbcType.INTEGER),
        @Result(column="CarSpaceScreen", property="carspacescreen", jdbcType=JdbcType.INTEGER),
        @Result(column="CarSpaceScreenNumber", property="carspacescreennumber", jdbcType=JdbcType.INTEGER),
        @Result(column="CarSpaceScreenCom", property="carspacescreencom", jdbcType=JdbcType.INTEGER),
        @Result(column="FullSpaceLight", property="fullspacelight", jdbcType=JdbcType.INTEGER),
        @Result(column="FullSpaceLightNumber", property="fullspacelightnumber", jdbcType=JdbcType.INTEGER),
        @Result(column="FullSpaceLightCom", property="fullspacelightcom", jdbcType=JdbcType.INTEGER),
        @Result(column="MoneyScreen", property="moneyscreen", jdbcType=JdbcType.INTEGER),
        @Result(column="MoneyScreenCom", property="moneyscreencom", jdbcType=JdbcType.INTEGER),
        @Result(column="BillPrint", property="billprint", jdbcType=JdbcType.INTEGER),
        @Result(column="Monitor01", property="monitor01", jdbcType=JdbcType.INTEGER),
        @Result(column="Monitor02", property="monitor02", jdbcType=JdbcType.INTEGER),
        @Result(column="FreeCarOK", property="freecarok", jdbcType=JdbcType.INTEGER),
        @Result(column="TempFreeCarOK", property="tempfreecarok", jdbcType=JdbcType.INTEGER),
        @Result(column="ZJZP", property="zjzp", jdbcType=JdbcType.INTEGER),
        @Result(column="ZPID", property="zpid", jdbcType=JdbcType.INTEGER),
        @Result(column="YKCSSF", property="ykcssf", jdbcType=JdbcType.INTEGER),
        @Result(column="CenterSFCS", property="centersfcs", jdbcType=JdbcType.INTEGER),
        @Result(column="CenterCSJE", property="centercsje", jdbcType=JdbcType.DECIMAL),
        @Result(column="SFOption", property="sfoption", jdbcType=JdbcType.INTEGER),
        @Result(column="SFMode", property="sfmode", jdbcType=JdbcType.INTEGER),
        @Result(column="HasPoint", property="haspoint", jdbcType=JdbcType.INTEGER),
        @Result(column="PointNum", property="pointnum", jdbcType=JdbcType.INTEGER),
        @Result(column="Discount", property="discount", jdbcType=JdbcType.INTEGER),
        @Result(column="RealtimeDownload", property="realtimedownload", jdbcType=JdbcType.INTEGER),
        @Result(column="DownloadCardValid", property="downloadcardvalid", jdbcType=JdbcType.INTEGER),
        @Result(column="TimeLoadMode", property="timeloadmode", jdbcType=JdbcType.INTEGER),
        @Result(column="TimeLoadInterval", property="timeloadinterval", jdbcType=JdbcType.INTEGER),
        @Result(column="InOutTimeInterval", property="inouttimeinterval", jdbcType=JdbcType.INTEGER),
        @Result(column="PwdCheck", property="pwdcheck", jdbcType=JdbcType.INTEGER),
        @Result(column="ShowDZState", property="showdzstate", jdbcType=JdbcType.INTEGER),
        @Result(column="ShowReceiveCardBox", property="showreceivecardbox", jdbcType=JdbcType.INTEGER),
        @Result(column="CompareAccuracy", property="compareaccuracy", jdbcType=JdbcType.INTEGER),
        @Result(column="ControlInOut", property="controlinout", jdbcType=JdbcType.INTEGER),
        @Result(column="VideoCardType", property="videocardtype", jdbcType=JdbcType.INTEGER),
        @Result(column="LoadCharge", property="loadcharge", jdbcType=JdbcType.INTEGER),
        @Result(column="ReadCardLogin", property="readcardlogin", jdbcType=JdbcType.INTEGER),
        @Result(column="PCName", property="pcname", jdbcType=JdbcType.VARCHAR),
        @Result(column="DisplayTime", property="displaytime", jdbcType=JdbcType.INTEGER),
        @Result(column="VideoShiftTime", property="videoshifttime", jdbcType=JdbcType.INTEGER),
        @Result(column="VideoBrightness", property="videobrightness", jdbcType=JdbcType.INTEGER),
        @Result(column="VideoResolution", property="videoresolution", jdbcType=JdbcType.INTEGER),
        @Result(column="VideoFour", property="videofour", jdbcType=JdbcType.INTEGER),
        @Result(column="PersonVideo", property="personvideo", jdbcType=JdbcType.INTEGER),
        @Result(column="CtrlVolume", property="ctrlvolume", jdbcType=JdbcType.VARCHAR),
        @Result(column="PrintFontSize", property="printfontsize", jdbcType=JdbcType.INTEGER),
        @Result(column="BillPrintAuto", property="billprintauto", jdbcType=JdbcType.INTEGER),
        @Result(column="TempCardPrePlate", property="tempcardpreplate", jdbcType=JdbcType.INTEGER),
        @Result(column="AutoPrePlate", property="autopreplate", jdbcType=JdbcType.INTEGER),
        @Result(column="SetTempCardType", property="settempcardtype", jdbcType=JdbcType.INTEGER),
        @Result(column="SetTempMoney", property="settempmoney", jdbcType=JdbcType.INTEGER),
        @Result(column="TempTypeDefineOK", property="temptypedefineok", jdbcType=JdbcType.INTEGER),
        @Result(column="TempTypeDefineString", property="temptypedefinestring", jdbcType=JdbcType.VARCHAR),
        @Result(column="IDSoftOpen", property="idsoftopen", jdbcType=JdbcType.INTEGER),
        @Result(column="IDNoticeDay", property="idnoticeday", jdbcType=JdbcType.INTEGER),
        @Result(column="IdSfCancel", property="idsfcancel", jdbcType=JdbcType.INTEGER),
        @Result(column="IdReReadHandle", property="idrereadhandle", jdbcType=JdbcType.INTEGER),
        @Result(column="IdPlateDownLoad", property="idplatedownload", jdbcType=JdbcType.INTEGER),
        @Result(column="ID1In1OutCardType", property="id1in1outcardtype", jdbcType=JdbcType.VARCHAR),
        @Result(column="IDComfirmOpenEnable", property="idcomfirmopenenable", jdbcType=JdbcType.INTEGER),
        @Result(column="IDComfirmOpenCardType", property="idcomfirmopencardtype", jdbcType=JdbcType.VARCHAR),
        @Result(column="ForbidSamePosition", property="forbidsameposition", jdbcType=JdbcType.INTEGER),
        @Result(column="MonthYQRule", property="monthyqrule", jdbcType=JdbcType.INTEGER),
        @Result(column="CtrlVoiceLedVersion", property="ctrlvoiceledversion", jdbcType=JdbcType.INTEGER),
        @Result(column="CtrlVoiceMode", property="ctrlvoicemode", jdbcType=JdbcType.INTEGER),
        @Result(column="PcTalkPlate", property="pctalkplate", jdbcType=JdbcType.INTEGER),
        @Result(column="CtrlShowPlate", property="ctrlshowplate", jdbcType=JdbcType.INTEGER),
        @Result(column="CtrlShowStayTime", property="ctrlshowstaytime", jdbcType=JdbcType.INTEGER),
        @Result(column="CtrlShowRemainPos", property="ctrlshowremainpos", jdbcType=JdbcType.INTEGER),
        @Result(column="CtrlShowInfo", property="ctrlshowinfo", jdbcType=JdbcType.INTEGER),
        @Result(column="CtrlShowCW", property="ctrlshowcw", jdbcType=JdbcType.INTEGER),
        @Result(column="RemainPosLedShowInfo", property="remainposledshowinfo", jdbcType=JdbcType.INTEGER),
        @Result(column="RemainPosLedShowPlate", property="remainposledshowplate", jdbcType=JdbcType.INTEGER),
        @Result(column="CarPosLedLen", property="carposledlen", jdbcType=JdbcType.INTEGER),
        @Result(column="SFLedType", property="sfledtype", jdbcType=JdbcType.INTEGER),
        @Result(column="SumMoneyHide", property="summoneyhide", jdbcType=JdbcType.INTEGER),
        @Result(column="ExitOnlineByPwd", property="exitonlinebypwd", jdbcType=JdbcType.INTEGER),
        @Result(column="CtrlSetHasPwd", property="ctrlsethaspwd", jdbcType=JdbcType.INTEGER),
        @Result(column="SoftOpenNoPlate", property="softopennoplate", jdbcType=JdbcType.INTEGER),
        @Result(column="AreaDefault", property="areadefault", jdbcType=JdbcType.VARCHAR),
        @Result(column="OneKeyShortCut", property="onekeyshortcut", jdbcType=JdbcType.INTEGER),
        @Result(column="CheDuiMode", property="cheduimode", jdbcType=JdbcType.INTEGER),
        @Result(column="InOutQueryName", property="inoutqueryname", jdbcType=JdbcType.INTEGER),
        @Result(column="ExceptionHandle", property="exceptionhandle", jdbcType=JdbcType.INTEGER),
        @Result(column="ShowTempCardNum", property="showtempcardnum", jdbcType=JdbcType.INTEGER),
        @Result(column="ReLoginPrint", property="reloginprint", jdbcType=JdbcType.INTEGER),
        @Result(column="FreeCardNoInPlace", property="freecardnoinplace", jdbcType=JdbcType.INTEGER),
        @Result(column="CheckPortFirst", property="checkportfirst", jdbcType=JdbcType.INTEGER),
        @Result(column="SaveDetailLog", property="savedetaillog", jdbcType=JdbcType.INTEGER),
        @Result(column="OnlyShowThisRemainPos", property="onlyshowthisremainpos", jdbcType=JdbcType.INTEGER),
        @Result(column="TempCarPlaceNum", property="tempcarplacenum", jdbcType=JdbcType.INTEGER),
        @Result(column="MonthCarPlaceNum", property="monthcarplacenum", jdbcType=JdbcType.INTEGER),
        @Result(column="MoneyCarPlaceNum", property="moneycarplacenum", jdbcType=JdbcType.INTEGER),
        @Result(column="bBarCodePrint", property="bbarcodeprint", jdbcType=JdbcType.INTEGER),
        @Result(column="NetWorkVideo", property="networkvideo", jdbcType=JdbcType.INTEGER),
        @Result(column="NetWorkVideoType", property="networkvideotype", jdbcType=JdbcType.INTEGER),
        @Result(column="IsCPHAuto", property="iscphauto", jdbcType=JdbcType.INTEGER),
        @Result(column="ZGXE", property="zgxe", jdbcType=JdbcType.INTEGER),
        @Result(column="ZGXEType", property="zgxetype", jdbcType=JdbcType.INTEGER),
        @Result(column="bMonthFdSf", property="bmonthfdsf", jdbcType=JdbcType.INTEGER),
        @Result(column="ImageAutoDel", property="imageautodel", jdbcType=JdbcType.INTEGER),
        @Result(column="ImageAutoDelTime", property="imageautodeltime", jdbcType=JdbcType.INTEGER),
        @Result(column="MonthOutChargeType", property="monthoutchargetype", jdbcType=JdbcType.VARCHAR),
        @Result(column="MothRetentionTemp", property="mothretentiontemp", jdbcType=JdbcType.VARCHAR),
        @Result(column="TempFirstRecord", property="tempfirstrecord", jdbcType=JdbcType.BIT),
        @Result(column="bStartReservation", property="bstartreservation", jdbcType=JdbcType.BIT)
    })
    List<Mychechangxitongset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.009+08:00", comments="Source Table: MYCHECHANGXITONGSET")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.009+08:00", comments="Source Table: MYCHECHANGXITONGSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mychechangxitongset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.009+08:00", comments="Source Table: MYCHECHANGXITONGSET")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mychechangxitongset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.009+08:00", comments="Source Table: MYCHECHANGXITONGSET")
    default int insert(Mychechangxitongset record) {
        return insert(SqlBuilder.insert(record)
                .into(mychechangxitongset)
                .map(stationno).toProperty("stationno")
                .map(carparkno).toProperty("carparkno")
                .map(hasimage).toProperty("hasimage")
                .map(imagesave).toProperty("imagesave")
                .map(savedays).toProperty("savedays")
                .map(imagepath).toProperty("imagepath")
                .map(totalcarspace).toProperty("totalcarspace")
                .map(carspacescreen).toProperty("carspacescreen")
                .map(carspacescreennumber).toProperty("carspacescreennumber")
                .map(carspacescreencom).toProperty("carspacescreencom")
                .map(fullspacelight).toProperty("fullspacelight")
                .map(fullspacelightnumber).toProperty("fullspacelightnumber")
                .map(fullspacelightcom).toProperty("fullspacelightcom")
                .map(moneyscreen).toProperty("moneyscreen")
                .map(moneyscreencom).toProperty("moneyscreencom")
                .map(billprint).toProperty("billprint")
                .map(monitor01).toProperty("monitor01")
                .map(monitor02).toProperty("monitor02")
                .map(freecarok).toProperty("freecarok")
                .map(tempfreecarok).toProperty("tempfreecarok")
                .map(zjzp).toProperty("zjzp")
                .map(zpid).toProperty("zpid")
                .map(ykcssf).toProperty("ykcssf")
                .map(centersfcs).toProperty("centersfcs")
                .map(centercsje).toProperty("centercsje")
                .map(sfoption).toProperty("sfoption")
                .map(sfmode).toProperty("sfmode")
                .map(haspoint).toProperty("haspoint")
                .map(pointnum).toProperty("pointnum")
                .map(discount).toProperty("discount")
                .map(realtimedownload).toProperty("realtimedownload")
                .map(downloadcardvalid).toProperty("downloadcardvalid")
                .map(timeloadmode).toProperty("timeloadmode")
                .map(timeloadinterval).toProperty("timeloadinterval")
                .map(inouttimeinterval).toProperty("inouttimeinterval")
                .map(pwdcheck).toProperty("pwdcheck")
                .map(showdzstate).toProperty("showdzstate")
                .map(showreceivecardbox).toProperty("showreceivecardbox")
                .map(compareaccuracy).toProperty("compareaccuracy")
                .map(controlinout).toProperty("controlinout")
                .map(videocardtype).toProperty("videocardtype")
                .map(loadcharge).toProperty("loadcharge")
                .map(readcardlogin).toProperty("readcardlogin")
                .map(pcname).toProperty("pcname")
                .map(displaytime).toProperty("displaytime")
                .map(videoshifttime).toProperty("videoshifttime")
                .map(videobrightness).toProperty("videobrightness")
                .map(videoresolution).toProperty("videoresolution")
                .map(videofour).toProperty("videofour")
                .map(personvideo).toProperty("personvideo")
                .map(ctrlvolume).toProperty("ctrlvolume")
                .map(printfontsize).toProperty("printfontsize")
                .map(billprintauto).toProperty("billprintauto")
                .map(tempcardpreplate).toProperty("tempcardpreplate")
                .map(autopreplate).toProperty("autopreplate")
                .map(settempcardtype).toProperty("settempcardtype")
                .map(settempmoney).toProperty("settempmoney")
                .map(temptypedefineok).toProperty("temptypedefineok")
                .map(temptypedefinestring).toProperty("temptypedefinestring")
                .map(idsoftopen).toProperty("idsoftopen")
                .map(idnoticeday).toProperty("idnoticeday")
                .map(idsfcancel).toProperty("idsfcancel")
                .map(idrereadhandle).toProperty("idrereadhandle")
                .map(idplatedownload).toProperty("idplatedownload")
                .map(id1in1outcardtype).toProperty("id1in1outcardtype")
                .map(idcomfirmopenenable).toProperty("idcomfirmopenenable")
                .map(idcomfirmopencardtype).toProperty("idcomfirmopencardtype")
                .map(forbidsameposition).toProperty("forbidsameposition")
                .map(monthyqrule).toProperty("monthyqrule")
                .map(ctrlvoiceledversion).toProperty("ctrlvoiceledversion")
                .map(ctrlvoicemode).toProperty("ctrlvoicemode")
                .map(pctalkplate).toProperty("pctalkplate")
                .map(ctrlshowplate).toProperty("ctrlshowplate")
                .map(ctrlshowstaytime).toProperty("ctrlshowstaytime")
                .map(ctrlshowremainpos).toProperty("ctrlshowremainpos")
                .map(ctrlshowinfo).toProperty("ctrlshowinfo")
                .map(ctrlshowcw).toProperty("ctrlshowcw")
                .map(remainposledshowinfo).toProperty("remainposledshowinfo")
                .map(remainposledshowplate).toProperty("remainposledshowplate")
                .map(carposledlen).toProperty("carposledlen")
                .map(sfledtype).toProperty("sfledtype")
                .map(summoneyhide).toProperty("summoneyhide")
                .map(exitonlinebypwd).toProperty("exitonlinebypwd")
                .map(ctrlsethaspwd).toProperty("ctrlsethaspwd")
                .map(softopennoplate).toProperty("softopennoplate")
                .map(areadefault).toProperty("areadefault")
                .map(onekeyshortcut).toProperty("onekeyshortcut")
                .map(cheduimode).toProperty("cheduimode")
                .map(inoutqueryname).toProperty("inoutqueryname")
                .map(exceptionhandle).toProperty("exceptionhandle")
                .map(showtempcardnum).toProperty("showtempcardnum")
                .map(reloginprint).toProperty("reloginprint")
                .map(freecardnoinplace).toProperty("freecardnoinplace")
                .map(checkportfirst).toProperty("checkportfirst")
                .map(savedetaillog).toProperty("savedetaillog")
                .map(onlyshowthisremainpos).toProperty("onlyshowthisremainpos")
                .map(tempcarplacenum).toProperty("tempcarplacenum")
                .map(monthcarplacenum).toProperty("monthcarplacenum")
                .map(moneycarplacenum).toProperty("moneycarplacenum")
                .map(bbarcodeprint).toProperty("bbarcodeprint")
                .map(networkvideo).toProperty("networkvideo")
                .map(networkvideotype).toProperty("networkvideotype")
                .map(iscphauto).toProperty("iscphauto")
                .map(zgxe).toProperty("zgxe")
                .map(zgxetype).toProperty("zgxetype")
                .map(bmonthfdsf).toProperty("bmonthfdsf")
                .map(imageautodel).toProperty("imageautodel")
                .map(imageautodeltime).toProperty("imageautodeltime")
                .map(monthoutchargetype).toProperty("monthoutchargetype")
                .map(mothretentiontemp).toProperty("mothretentiontemp")
                .map(tempfirstrecord).toProperty("tempfirstrecord")
                .map(bstartreservation).toProperty("bstartreservation")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.010+08:00", comments="Source Table: MYCHECHANGXITONGSET")
    default int insertSelective(Mychechangxitongset record) {
        return insert(SqlBuilder.insert(record)
                .into(mychechangxitongset)
                .map(stationno).toPropertyWhenPresent("stationno", record::getStationno)
                .map(carparkno).toPropertyWhenPresent("carparkno", record::getCarparkno)
                .map(hasimage).toPropertyWhenPresent("hasimage", record::getHasimage)
                .map(imagesave).toPropertyWhenPresent("imagesave", record::getImagesave)
                .map(savedays).toPropertyWhenPresent("savedays", record::getSavedays)
                .map(imagepath).toPropertyWhenPresent("imagepath", record::getImagepath)
                .map(totalcarspace).toPropertyWhenPresent("totalcarspace", record::getTotalcarspace)
                .map(carspacescreen).toPropertyWhenPresent("carspacescreen", record::getCarspacescreen)
                .map(carspacescreennumber).toPropertyWhenPresent("carspacescreennumber", record::getCarspacescreennumber)
                .map(carspacescreencom).toPropertyWhenPresent("carspacescreencom", record::getCarspacescreencom)
                .map(fullspacelight).toPropertyWhenPresent("fullspacelight", record::getFullspacelight)
                .map(fullspacelightnumber).toPropertyWhenPresent("fullspacelightnumber", record::getFullspacelightnumber)
                .map(fullspacelightcom).toPropertyWhenPresent("fullspacelightcom", record::getFullspacelightcom)
                .map(moneyscreen).toPropertyWhenPresent("moneyscreen", record::getMoneyscreen)
                .map(moneyscreencom).toPropertyWhenPresent("moneyscreencom", record::getMoneyscreencom)
                .map(billprint).toPropertyWhenPresent("billprint", record::getBillprint)
                .map(monitor01).toPropertyWhenPresent("monitor01", record::getMonitor01)
                .map(monitor02).toPropertyWhenPresent("monitor02", record::getMonitor02)
                .map(freecarok).toPropertyWhenPresent("freecarok", record::getFreecarok)
                .map(tempfreecarok).toPropertyWhenPresent("tempfreecarok", record::getTempfreecarok)
                .map(zjzp).toPropertyWhenPresent("zjzp", record::getZjzp)
                .map(zpid).toPropertyWhenPresent("zpid", record::getZpid)
                .map(ykcssf).toPropertyWhenPresent("ykcssf", record::getYkcssf)
                .map(centersfcs).toPropertyWhenPresent("centersfcs", record::getCentersfcs)
                .map(centercsje).toPropertyWhenPresent("centercsje", record::getCentercsje)
                .map(sfoption).toPropertyWhenPresent("sfoption", record::getSfoption)
                .map(sfmode).toPropertyWhenPresent("sfmode", record::getSfmode)
                .map(haspoint).toPropertyWhenPresent("haspoint", record::getHaspoint)
                .map(pointnum).toPropertyWhenPresent("pointnum", record::getPointnum)
                .map(discount).toPropertyWhenPresent("discount", record::getDiscount)
                .map(realtimedownload).toPropertyWhenPresent("realtimedownload", record::getRealtimedownload)
                .map(downloadcardvalid).toPropertyWhenPresent("downloadcardvalid", record::getDownloadcardvalid)
                .map(timeloadmode).toPropertyWhenPresent("timeloadmode", record::getTimeloadmode)
                .map(timeloadinterval).toPropertyWhenPresent("timeloadinterval", record::getTimeloadinterval)
                .map(inouttimeinterval).toPropertyWhenPresent("inouttimeinterval", record::getInouttimeinterval)
                .map(pwdcheck).toPropertyWhenPresent("pwdcheck", record::getPwdcheck)
                .map(showdzstate).toPropertyWhenPresent("showdzstate", record::getShowdzstate)
                .map(showreceivecardbox).toPropertyWhenPresent("showreceivecardbox", record::getShowreceivecardbox)
                .map(compareaccuracy).toPropertyWhenPresent("compareaccuracy", record::getCompareaccuracy)
                .map(controlinout).toPropertyWhenPresent("controlinout", record::getControlinout)
                .map(videocardtype).toPropertyWhenPresent("videocardtype", record::getVideocardtype)
                .map(loadcharge).toPropertyWhenPresent("loadcharge", record::getLoadcharge)
                .map(readcardlogin).toPropertyWhenPresent("readcardlogin", record::getReadcardlogin)
                .map(pcname).toPropertyWhenPresent("pcname", record::getPcname)
                .map(displaytime).toPropertyWhenPresent("displaytime", record::getDisplaytime)
                .map(videoshifttime).toPropertyWhenPresent("videoshifttime", record::getVideoshifttime)
                .map(videobrightness).toPropertyWhenPresent("videobrightness", record::getVideobrightness)
                .map(videoresolution).toPropertyWhenPresent("videoresolution", record::getVideoresolution)
                .map(videofour).toPropertyWhenPresent("videofour", record::getVideofour)
                .map(personvideo).toPropertyWhenPresent("personvideo", record::getPersonvideo)
                .map(ctrlvolume).toPropertyWhenPresent("ctrlvolume", record::getCtrlvolume)
                .map(printfontsize).toPropertyWhenPresent("printfontsize", record::getPrintfontsize)
                .map(billprintauto).toPropertyWhenPresent("billprintauto", record::getBillprintauto)
                .map(tempcardpreplate).toPropertyWhenPresent("tempcardpreplate", record::getTempcardpreplate)
                .map(autopreplate).toPropertyWhenPresent("autopreplate", record::getAutopreplate)
                .map(settempcardtype).toPropertyWhenPresent("settempcardtype", record::getSettempcardtype)
                .map(settempmoney).toPropertyWhenPresent("settempmoney", record::getSettempmoney)
                .map(temptypedefineok).toPropertyWhenPresent("temptypedefineok", record::getTemptypedefineok)
                .map(temptypedefinestring).toPropertyWhenPresent("temptypedefinestring", record::getTemptypedefinestring)
                .map(idsoftopen).toPropertyWhenPresent("idsoftopen", record::getIdsoftopen)
                .map(idnoticeday).toPropertyWhenPresent("idnoticeday", record::getIdnoticeday)
                .map(idsfcancel).toPropertyWhenPresent("idsfcancel", record::getIdsfcancel)
                .map(idrereadhandle).toPropertyWhenPresent("idrereadhandle", record::getIdrereadhandle)
                .map(idplatedownload).toPropertyWhenPresent("idplatedownload", record::getIdplatedownload)
                .map(id1in1outcardtype).toPropertyWhenPresent("id1in1outcardtype", record::getId1in1outcardtype)
                .map(idcomfirmopenenable).toPropertyWhenPresent("idcomfirmopenenable", record::getIdcomfirmopenenable)
                .map(idcomfirmopencardtype).toPropertyWhenPresent("idcomfirmopencardtype", record::getIdcomfirmopencardtype)
                .map(forbidsameposition).toPropertyWhenPresent("forbidsameposition", record::getForbidsameposition)
                .map(monthyqrule).toPropertyWhenPresent("monthyqrule", record::getMonthyqrule)
                .map(ctrlvoiceledversion).toPropertyWhenPresent("ctrlvoiceledversion", record::getCtrlvoiceledversion)
                .map(ctrlvoicemode).toPropertyWhenPresent("ctrlvoicemode", record::getCtrlvoicemode)
                .map(pctalkplate).toPropertyWhenPresent("pctalkplate", record::getPctalkplate)
                .map(ctrlshowplate).toPropertyWhenPresent("ctrlshowplate", record::getCtrlshowplate)
                .map(ctrlshowstaytime).toPropertyWhenPresent("ctrlshowstaytime", record::getCtrlshowstaytime)
                .map(ctrlshowremainpos).toPropertyWhenPresent("ctrlshowremainpos", record::getCtrlshowremainpos)
                .map(ctrlshowinfo).toPropertyWhenPresent("ctrlshowinfo", record::getCtrlshowinfo)
                .map(ctrlshowcw).toPropertyWhenPresent("ctrlshowcw", record::getCtrlshowcw)
                .map(remainposledshowinfo).toPropertyWhenPresent("remainposledshowinfo", record::getRemainposledshowinfo)
                .map(remainposledshowplate).toPropertyWhenPresent("remainposledshowplate", record::getRemainposledshowplate)
                .map(carposledlen).toPropertyWhenPresent("carposledlen", record::getCarposledlen)
                .map(sfledtype).toPropertyWhenPresent("sfledtype", record::getSfledtype)
                .map(summoneyhide).toPropertyWhenPresent("summoneyhide", record::getSummoneyhide)
                .map(exitonlinebypwd).toPropertyWhenPresent("exitonlinebypwd", record::getExitonlinebypwd)
                .map(ctrlsethaspwd).toPropertyWhenPresent("ctrlsethaspwd", record::getCtrlsethaspwd)
                .map(softopennoplate).toPropertyWhenPresent("softopennoplate", record::getSoftopennoplate)
                .map(areadefault).toPropertyWhenPresent("areadefault", record::getAreadefault)
                .map(onekeyshortcut).toPropertyWhenPresent("onekeyshortcut", record::getOnekeyshortcut)
                .map(cheduimode).toPropertyWhenPresent("cheduimode", record::getCheduimode)
                .map(inoutqueryname).toPropertyWhenPresent("inoutqueryname", record::getInoutqueryname)
                .map(exceptionhandle).toPropertyWhenPresent("exceptionhandle", record::getExceptionhandle)
                .map(showtempcardnum).toPropertyWhenPresent("showtempcardnum", record::getShowtempcardnum)
                .map(reloginprint).toPropertyWhenPresent("reloginprint", record::getReloginprint)
                .map(freecardnoinplace).toPropertyWhenPresent("freecardnoinplace", record::getFreecardnoinplace)
                .map(checkportfirst).toPropertyWhenPresent("checkportfirst", record::getCheckportfirst)
                .map(savedetaillog).toPropertyWhenPresent("savedetaillog", record::getSavedetaillog)
                .map(onlyshowthisremainpos).toPropertyWhenPresent("onlyshowthisremainpos", record::getOnlyshowthisremainpos)
                .map(tempcarplacenum).toPropertyWhenPresent("tempcarplacenum", record::getTempcarplacenum)
                .map(monthcarplacenum).toPropertyWhenPresent("monthcarplacenum", record::getMonthcarplacenum)
                .map(moneycarplacenum).toPropertyWhenPresent("moneycarplacenum", record::getMoneycarplacenum)
                .map(bbarcodeprint).toPropertyWhenPresent("bbarcodeprint", record::getBbarcodeprint)
                .map(networkvideo).toPropertyWhenPresent("networkvideo", record::getNetworkvideo)
                .map(networkvideotype).toPropertyWhenPresent("networkvideotype", record::getNetworkvideotype)
                .map(iscphauto).toPropertyWhenPresent("iscphauto", record::getIscphauto)
                .map(zgxe).toPropertyWhenPresent("zgxe", record::getZgxe)
                .map(zgxetype).toPropertyWhenPresent("zgxetype", record::getZgxetype)
                .map(bmonthfdsf).toPropertyWhenPresent("bmonthfdsf", record::getBmonthfdsf)
                .map(imageautodel).toPropertyWhenPresent("imageautodel", record::getImageautodel)
                .map(imageautodeltime).toPropertyWhenPresent("imageautodeltime", record::getImageautodeltime)
                .map(monthoutchargetype).toPropertyWhenPresent("monthoutchargetype", record::getMonthoutchargetype)
                .map(mothretentiontemp).toPropertyWhenPresent("mothretentiontemp", record::getMothretentiontemp)
                .map(tempfirstrecord).toPropertyWhenPresent("tempfirstrecord", record::getTempfirstrecord)
                .map(bstartreservation).toPropertyWhenPresent("bstartreservation", record::getBstartreservation)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.010+08:00", comments="Source Table: MYCHECHANGXITONGSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mychechangxitongset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, stationno, carparkno, hasimage, imagesave, savedays, imagepath, totalcarspace, carspacescreen, carspacescreennumber, carspacescreencom, fullspacelight, fullspacelightnumber, fullspacelightcom, moneyscreen, moneyscreencom, billprint, monitor01, monitor02, freecarok, tempfreecarok, zjzp, zpid, ykcssf, centersfcs, centercsje, sfoption, sfmode, haspoint, pointnum, discount, realtimedownload, downloadcardvalid, timeloadmode, timeloadinterval, inouttimeinterval, pwdcheck, showdzstate, showreceivecardbox, compareaccuracy, controlinout, videocardtype, loadcharge, readcardlogin, pcname, displaytime, videoshifttime, videobrightness, videoresolution, videofour, personvideo, ctrlvolume, printfontsize, billprintauto, tempcardpreplate, autopreplate, settempcardtype, settempmoney, temptypedefineok, temptypedefinestring, idsoftopen, idnoticeday, idsfcancel, idrereadhandle, idplatedownload, id1in1outcardtype, idcomfirmopenenable, idcomfirmopencardtype, forbidsameposition, monthyqrule, ctrlvoiceledversion, ctrlvoicemode, pctalkplate, ctrlshowplate, ctrlshowstaytime, ctrlshowremainpos, ctrlshowinfo, ctrlshowcw, remainposledshowinfo, remainposledshowplate, carposledlen, sfledtype, summoneyhide, exitonlinebypwd, ctrlsethaspwd, softopennoplate, areadefault, onekeyshortcut, cheduimode, inoutqueryname, exceptionhandle, showtempcardnum, reloginprint, freecardnoinplace, checkportfirst, savedetaillog, onlyshowthisremainpos, tempcarplacenum, monthcarplacenum, moneycarplacenum, bbarcodeprint, networkvideo, networkvideotype, iscphauto, zgxe, zgxetype, bmonthfdsf, imageautodel, imageautodeltime, monthoutchargetype, mothretentiontemp, tempfirstrecord, bstartreservation)
                .from(mychechangxitongset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.010+08:00", comments="Source Table: MYCHECHANGXITONGSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mychechangxitongset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, stationno, carparkno, hasimage, imagesave, savedays, imagepath, totalcarspace, carspacescreen, carspacescreennumber, carspacescreencom, fullspacelight, fullspacelightnumber, fullspacelightcom, moneyscreen, moneyscreencom, billprint, monitor01, monitor02, freecarok, tempfreecarok, zjzp, zpid, ykcssf, centersfcs, centercsje, sfoption, sfmode, haspoint, pointnum, discount, realtimedownload, downloadcardvalid, timeloadmode, timeloadinterval, inouttimeinterval, pwdcheck, showdzstate, showreceivecardbox, compareaccuracy, controlinout, videocardtype, loadcharge, readcardlogin, pcname, displaytime, videoshifttime, videobrightness, videoresolution, videofour, personvideo, ctrlvolume, printfontsize, billprintauto, tempcardpreplate, autopreplate, settempcardtype, settempmoney, temptypedefineok, temptypedefinestring, idsoftopen, idnoticeday, idsfcancel, idrereadhandle, idplatedownload, id1in1outcardtype, idcomfirmopenenable, idcomfirmopencardtype, forbidsameposition, monthyqrule, ctrlvoiceledversion, ctrlvoicemode, pctalkplate, ctrlshowplate, ctrlshowstaytime, ctrlshowremainpos, ctrlshowinfo, ctrlshowcw, remainposledshowinfo, remainposledshowplate, carposledlen, sfledtype, summoneyhide, exitonlinebypwd, ctrlsethaspwd, softopennoplate, areadefault, onekeyshortcut, cheduimode, inoutqueryname, exceptionhandle, showtempcardnum, reloginprint, freecardnoinplace, checkportfirst, savedetaillog, onlyshowthisremainpos, tempcarplacenum, monthcarplacenum, moneycarplacenum, bbarcodeprint, networkvideo, networkvideotype, iscphauto, zgxe, zgxetype, bmonthfdsf, imageautodel, imageautodeltime, monthoutchargetype, mothretentiontemp, tempfirstrecord, bstartreservation)
                .from(mychechangxitongset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.010+08:00", comments="Source Table: MYCHECHANGXITONGSET")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mychechangxitongset record) {
        return UpdateDSL.updateWithMapper(this::update, mychechangxitongset)
                .set(stationno).equalTo(record::getStationno)
                .set(carparkno).equalTo(record::getCarparkno)
                .set(hasimage).equalTo(record::getHasimage)
                .set(imagesave).equalTo(record::getImagesave)
                .set(savedays).equalTo(record::getSavedays)
                .set(imagepath).equalTo(record::getImagepath)
                .set(totalcarspace).equalTo(record::getTotalcarspace)
                .set(carspacescreen).equalTo(record::getCarspacescreen)
                .set(carspacescreennumber).equalTo(record::getCarspacescreennumber)
                .set(carspacescreencom).equalTo(record::getCarspacescreencom)
                .set(fullspacelight).equalTo(record::getFullspacelight)
                .set(fullspacelightnumber).equalTo(record::getFullspacelightnumber)
                .set(fullspacelightcom).equalTo(record::getFullspacelightcom)
                .set(moneyscreen).equalTo(record::getMoneyscreen)
                .set(moneyscreencom).equalTo(record::getMoneyscreencom)
                .set(billprint).equalTo(record::getBillprint)
                .set(monitor01).equalTo(record::getMonitor01)
                .set(monitor02).equalTo(record::getMonitor02)
                .set(freecarok).equalTo(record::getFreecarok)
                .set(tempfreecarok).equalTo(record::getTempfreecarok)
                .set(zjzp).equalTo(record::getZjzp)
                .set(zpid).equalTo(record::getZpid)
                .set(ykcssf).equalTo(record::getYkcssf)
                .set(centersfcs).equalTo(record::getCentersfcs)
                .set(centercsje).equalTo(record::getCentercsje)
                .set(sfoption).equalTo(record::getSfoption)
                .set(sfmode).equalTo(record::getSfmode)
                .set(haspoint).equalTo(record::getHaspoint)
                .set(pointnum).equalTo(record::getPointnum)
                .set(discount).equalTo(record::getDiscount)
                .set(realtimedownload).equalTo(record::getRealtimedownload)
                .set(downloadcardvalid).equalTo(record::getDownloadcardvalid)
                .set(timeloadmode).equalTo(record::getTimeloadmode)
                .set(timeloadinterval).equalTo(record::getTimeloadinterval)
                .set(inouttimeinterval).equalTo(record::getInouttimeinterval)
                .set(pwdcheck).equalTo(record::getPwdcheck)
                .set(showdzstate).equalTo(record::getShowdzstate)
                .set(showreceivecardbox).equalTo(record::getShowreceivecardbox)
                .set(compareaccuracy).equalTo(record::getCompareaccuracy)
                .set(controlinout).equalTo(record::getControlinout)
                .set(videocardtype).equalTo(record::getVideocardtype)
                .set(loadcharge).equalTo(record::getLoadcharge)
                .set(readcardlogin).equalTo(record::getReadcardlogin)
                .set(pcname).equalTo(record::getPcname)
                .set(displaytime).equalTo(record::getDisplaytime)
                .set(videoshifttime).equalTo(record::getVideoshifttime)
                .set(videobrightness).equalTo(record::getVideobrightness)
                .set(videoresolution).equalTo(record::getVideoresolution)
                .set(videofour).equalTo(record::getVideofour)
                .set(personvideo).equalTo(record::getPersonvideo)
                .set(ctrlvolume).equalTo(record::getCtrlvolume)
                .set(printfontsize).equalTo(record::getPrintfontsize)
                .set(billprintauto).equalTo(record::getBillprintauto)
                .set(tempcardpreplate).equalTo(record::getTempcardpreplate)
                .set(autopreplate).equalTo(record::getAutopreplate)
                .set(settempcardtype).equalTo(record::getSettempcardtype)
                .set(settempmoney).equalTo(record::getSettempmoney)
                .set(temptypedefineok).equalTo(record::getTemptypedefineok)
                .set(temptypedefinestring).equalTo(record::getTemptypedefinestring)
                .set(idsoftopen).equalTo(record::getIdsoftopen)
                .set(idnoticeday).equalTo(record::getIdnoticeday)
                .set(idsfcancel).equalTo(record::getIdsfcancel)
                .set(idrereadhandle).equalTo(record::getIdrereadhandle)
                .set(idplatedownload).equalTo(record::getIdplatedownload)
                .set(id1in1outcardtype).equalTo(record::getId1in1outcardtype)
                .set(idcomfirmopenenable).equalTo(record::getIdcomfirmopenenable)
                .set(idcomfirmopencardtype).equalTo(record::getIdcomfirmopencardtype)
                .set(forbidsameposition).equalTo(record::getForbidsameposition)
                .set(monthyqrule).equalTo(record::getMonthyqrule)
                .set(ctrlvoiceledversion).equalTo(record::getCtrlvoiceledversion)
                .set(ctrlvoicemode).equalTo(record::getCtrlvoicemode)
                .set(pctalkplate).equalTo(record::getPctalkplate)
                .set(ctrlshowplate).equalTo(record::getCtrlshowplate)
                .set(ctrlshowstaytime).equalTo(record::getCtrlshowstaytime)
                .set(ctrlshowremainpos).equalTo(record::getCtrlshowremainpos)
                .set(ctrlshowinfo).equalTo(record::getCtrlshowinfo)
                .set(ctrlshowcw).equalTo(record::getCtrlshowcw)
                .set(remainposledshowinfo).equalTo(record::getRemainposledshowinfo)
                .set(remainposledshowplate).equalTo(record::getRemainposledshowplate)
                .set(carposledlen).equalTo(record::getCarposledlen)
                .set(sfledtype).equalTo(record::getSfledtype)
                .set(summoneyhide).equalTo(record::getSummoneyhide)
                .set(exitonlinebypwd).equalTo(record::getExitonlinebypwd)
                .set(ctrlsethaspwd).equalTo(record::getCtrlsethaspwd)
                .set(softopennoplate).equalTo(record::getSoftopennoplate)
                .set(areadefault).equalTo(record::getAreadefault)
                .set(onekeyshortcut).equalTo(record::getOnekeyshortcut)
                .set(cheduimode).equalTo(record::getCheduimode)
                .set(inoutqueryname).equalTo(record::getInoutqueryname)
                .set(exceptionhandle).equalTo(record::getExceptionhandle)
                .set(showtempcardnum).equalTo(record::getShowtempcardnum)
                .set(reloginprint).equalTo(record::getReloginprint)
                .set(freecardnoinplace).equalTo(record::getFreecardnoinplace)
                .set(checkportfirst).equalTo(record::getCheckportfirst)
                .set(savedetaillog).equalTo(record::getSavedetaillog)
                .set(onlyshowthisremainpos).equalTo(record::getOnlyshowthisremainpos)
                .set(tempcarplacenum).equalTo(record::getTempcarplacenum)
                .set(monthcarplacenum).equalTo(record::getMonthcarplacenum)
                .set(moneycarplacenum).equalTo(record::getMoneycarplacenum)
                .set(bbarcodeprint).equalTo(record::getBbarcodeprint)
                .set(networkvideo).equalTo(record::getNetworkvideo)
                .set(networkvideotype).equalTo(record::getNetworkvideotype)
                .set(iscphauto).equalTo(record::getIscphauto)
                .set(zgxe).equalTo(record::getZgxe)
                .set(zgxetype).equalTo(record::getZgxetype)
                .set(bmonthfdsf).equalTo(record::getBmonthfdsf)
                .set(imageautodel).equalTo(record::getImageautodel)
                .set(imageautodeltime).equalTo(record::getImageautodeltime)
                .set(monthoutchargetype).equalTo(record::getMonthoutchargetype)
                .set(mothretentiontemp).equalTo(record::getMothretentiontemp)
                .set(tempfirstrecord).equalTo(record::getTempfirstrecord)
                .set(bstartreservation).equalTo(record::getBstartreservation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.010+08:00", comments="Source Table: MYCHECHANGXITONGSET")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mychechangxitongset record) {
        return UpdateDSL.updateWithMapper(this::update, mychechangxitongset)
                .set(stationno).equalToWhenPresent(record::getStationno)
                .set(carparkno).equalToWhenPresent(record::getCarparkno)
                .set(hasimage).equalToWhenPresent(record::getHasimage)
                .set(imagesave).equalToWhenPresent(record::getImagesave)
                .set(savedays).equalToWhenPresent(record::getSavedays)
                .set(imagepath).equalToWhenPresent(record::getImagepath)
                .set(totalcarspace).equalToWhenPresent(record::getTotalcarspace)
                .set(carspacescreen).equalToWhenPresent(record::getCarspacescreen)
                .set(carspacescreennumber).equalToWhenPresent(record::getCarspacescreennumber)
                .set(carspacescreencom).equalToWhenPresent(record::getCarspacescreencom)
                .set(fullspacelight).equalToWhenPresent(record::getFullspacelight)
                .set(fullspacelightnumber).equalToWhenPresent(record::getFullspacelightnumber)
                .set(fullspacelightcom).equalToWhenPresent(record::getFullspacelightcom)
                .set(moneyscreen).equalToWhenPresent(record::getMoneyscreen)
                .set(moneyscreencom).equalToWhenPresent(record::getMoneyscreencom)
                .set(billprint).equalToWhenPresent(record::getBillprint)
                .set(monitor01).equalToWhenPresent(record::getMonitor01)
                .set(monitor02).equalToWhenPresent(record::getMonitor02)
                .set(freecarok).equalToWhenPresent(record::getFreecarok)
                .set(tempfreecarok).equalToWhenPresent(record::getTempfreecarok)
                .set(zjzp).equalToWhenPresent(record::getZjzp)
                .set(zpid).equalToWhenPresent(record::getZpid)
                .set(ykcssf).equalToWhenPresent(record::getYkcssf)
                .set(centersfcs).equalToWhenPresent(record::getCentersfcs)
                .set(centercsje).equalToWhenPresent(record::getCentercsje)
                .set(sfoption).equalToWhenPresent(record::getSfoption)
                .set(sfmode).equalToWhenPresent(record::getSfmode)
                .set(haspoint).equalToWhenPresent(record::getHaspoint)
                .set(pointnum).equalToWhenPresent(record::getPointnum)
                .set(discount).equalToWhenPresent(record::getDiscount)
                .set(realtimedownload).equalToWhenPresent(record::getRealtimedownload)
                .set(downloadcardvalid).equalToWhenPresent(record::getDownloadcardvalid)
                .set(timeloadmode).equalToWhenPresent(record::getTimeloadmode)
                .set(timeloadinterval).equalToWhenPresent(record::getTimeloadinterval)
                .set(inouttimeinterval).equalToWhenPresent(record::getInouttimeinterval)
                .set(pwdcheck).equalToWhenPresent(record::getPwdcheck)
                .set(showdzstate).equalToWhenPresent(record::getShowdzstate)
                .set(showreceivecardbox).equalToWhenPresent(record::getShowreceivecardbox)
                .set(compareaccuracy).equalToWhenPresent(record::getCompareaccuracy)
                .set(controlinout).equalToWhenPresent(record::getControlinout)
                .set(videocardtype).equalToWhenPresent(record::getVideocardtype)
                .set(loadcharge).equalToWhenPresent(record::getLoadcharge)
                .set(readcardlogin).equalToWhenPresent(record::getReadcardlogin)
                .set(pcname).equalToWhenPresent(record::getPcname)
                .set(displaytime).equalToWhenPresent(record::getDisplaytime)
                .set(videoshifttime).equalToWhenPresent(record::getVideoshifttime)
                .set(videobrightness).equalToWhenPresent(record::getVideobrightness)
                .set(videoresolution).equalToWhenPresent(record::getVideoresolution)
                .set(videofour).equalToWhenPresent(record::getVideofour)
                .set(personvideo).equalToWhenPresent(record::getPersonvideo)
                .set(ctrlvolume).equalToWhenPresent(record::getCtrlvolume)
                .set(printfontsize).equalToWhenPresent(record::getPrintfontsize)
                .set(billprintauto).equalToWhenPresent(record::getBillprintauto)
                .set(tempcardpreplate).equalToWhenPresent(record::getTempcardpreplate)
                .set(autopreplate).equalToWhenPresent(record::getAutopreplate)
                .set(settempcardtype).equalToWhenPresent(record::getSettempcardtype)
                .set(settempmoney).equalToWhenPresent(record::getSettempmoney)
                .set(temptypedefineok).equalToWhenPresent(record::getTemptypedefineok)
                .set(temptypedefinestring).equalToWhenPresent(record::getTemptypedefinestring)
                .set(idsoftopen).equalToWhenPresent(record::getIdsoftopen)
                .set(idnoticeday).equalToWhenPresent(record::getIdnoticeday)
                .set(idsfcancel).equalToWhenPresent(record::getIdsfcancel)
                .set(idrereadhandle).equalToWhenPresent(record::getIdrereadhandle)
                .set(idplatedownload).equalToWhenPresent(record::getIdplatedownload)
                .set(id1in1outcardtype).equalToWhenPresent(record::getId1in1outcardtype)
                .set(idcomfirmopenenable).equalToWhenPresent(record::getIdcomfirmopenenable)
                .set(idcomfirmopencardtype).equalToWhenPresent(record::getIdcomfirmopencardtype)
                .set(forbidsameposition).equalToWhenPresent(record::getForbidsameposition)
                .set(monthyqrule).equalToWhenPresent(record::getMonthyqrule)
                .set(ctrlvoiceledversion).equalToWhenPresent(record::getCtrlvoiceledversion)
                .set(ctrlvoicemode).equalToWhenPresent(record::getCtrlvoicemode)
                .set(pctalkplate).equalToWhenPresent(record::getPctalkplate)
                .set(ctrlshowplate).equalToWhenPresent(record::getCtrlshowplate)
                .set(ctrlshowstaytime).equalToWhenPresent(record::getCtrlshowstaytime)
                .set(ctrlshowremainpos).equalToWhenPresent(record::getCtrlshowremainpos)
                .set(ctrlshowinfo).equalToWhenPresent(record::getCtrlshowinfo)
                .set(ctrlshowcw).equalToWhenPresent(record::getCtrlshowcw)
                .set(remainposledshowinfo).equalToWhenPresent(record::getRemainposledshowinfo)
                .set(remainposledshowplate).equalToWhenPresent(record::getRemainposledshowplate)
                .set(carposledlen).equalToWhenPresent(record::getCarposledlen)
                .set(sfledtype).equalToWhenPresent(record::getSfledtype)
                .set(summoneyhide).equalToWhenPresent(record::getSummoneyhide)
                .set(exitonlinebypwd).equalToWhenPresent(record::getExitonlinebypwd)
                .set(ctrlsethaspwd).equalToWhenPresent(record::getCtrlsethaspwd)
                .set(softopennoplate).equalToWhenPresent(record::getSoftopennoplate)
                .set(areadefault).equalToWhenPresent(record::getAreadefault)
                .set(onekeyshortcut).equalToWhenPresent(record::getOnekeyshortcut)
                .set(cheduimode).equalToWhenPresent(record::getCheduimode)
                .set(inoutqueryname).equalToWhenPresent(record::getInoutqueryname)
                .set(exceptionhandle).equalToWhenPresent(record::getExceptionhandle)
                .set(showtempcardnum).equalToWhenPresent(record::getShowtempcardnum)
                .set(reloginprint).equalToWhenPresent(record::getReloginprint)
                .set(freecardnoinplace).equalToWhenPresent(record::getFreecardnoinplace)
                .set(checkportfirst).equalToWhenPresent(record::getCheckportfirst)
                .set(savedetaillog).equalToWhenPresent(record::getSavedetaillog)
                .set(onlyshowthisremainpos).equalToWhenPresent(record::getOnlyshowthisremainpos)
                .set(tempcarplacenum).equalToWhenPresent(record::getTempcarplacenum)
                .set(monthcarplacenum).equalToWhenPresent(record::getMonthcarplacenum)
                .set(moneycarplacenum).equalToWhenPresent(record::getMoneycarplacenum)
                .set(bbarcodeprint).equalToWhenPresent(record::getBbarcodeprint)
                .set(networkvideo).equalToWhenPresent(record::getNetworkvideo)
                .set(networkvideotype).equalToWhenPresent(record::getNetworkvideotype)
                .set(iscphauto).equalToWhenPresent(record::getIscphauto)
                .set(zgxe).equalToWhenPresent(record::getZgxe)
                .set(zgxetype).equalToWhenPresent(record::getZgxetype)
                .set(bmonthfdsf).equalToWhenPresent(record::getBmonthfdsf)
                .set(imageautodel).equalToWhenPresent(record::getImageautodel)
                .set(imageautodeltime).equalToWhenPresent(record::getImageautodeltime)
                .set(monthoutchargetype).equalToWhenPresent(record::getMonthoutchargetype)
                .set(mothretentiontemp).equalToWhenPresent(record::getMothretentiontemp)
                .set(tempfirstrecord).equalToWhenPresent(record::getTempfirstrecord)
                .set(bstartreservation).equalToWhenPresent(record::getBstartreservation);
    }
}