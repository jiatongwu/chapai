/****** Object:  Table [dbo].[MYICVALID]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO


IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[QRCodeControl]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[QRCodeControl](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[MachineNo] [nvarchar](50) NULL,
	[ControlIP] [nvarchar](50) NULL,
	[HostIP] [nvarchar](50) NULL,
	[InOutFlag] [nvarchar](50) NULL,
	[BoundedControlID] [nvarchar](50) NULL
) ON [PRIMARY]
END
GO



IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYICVALID]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYICVALID](
	[CardNO] [varchar](30) NOT NULL,
	[OptDate] [datetime] NOT NULL,
	[NewStartDate] [datetime] NULL,
	[NewEndDate] [datetime] NULL,
	[NewEachDayStartTime] [char](20) NULL,
	[NewEachDayEndTime] [char](20) NULL,
	[ValidMachineID] [char](64) NULL,
	[OperatorCardNO] [varchar](30) NOT NULL,
	[OptType] [varchar](50) NOT NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYICVALID]') AND name = N'IX_MYICVALID')
CREATE NONCLUSTERED INDEX [IX_MYICVALID] ON [dbo].[MYICVALID] 
(
	[OptDate] DESC
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MYICMONEY]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYICMONEY]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYICMONEY](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[CardNO] [varchar](30) NOT NULL,
	[OptDate] [datetime] NULL,
	[SFJE] [money] NULL,
	[Balance] [money] NULL,
	[OperatorCardNO] [varchar](30) NULL,
	[OptType] [varchar](50) NULL,
	[NewStartDate] [datetime] NULL,
	[NewEndDate] [datetime] NULL,
	[LastEndDate] [datetime] NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYICMONEY]') AND name = N'IX_MYICMONEY')
CREATE NONCLUSTERED INDEX [IX_MYICMONEY] ON [dbo].[MYICMONEY] 
(
	[OptDate] DESC
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MYICLOST]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYICLOST]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYICLOST](
	[CardNO] [varchar](30) NOT NULL,
	[LossregDate] [datetime] NOT NULL,
	[OperatorCardNO] [varchar](30) NULL,
	[CardState] [char](1) NOT NULL,
	[CarLostOKID] [char](32) NULL,
	[CarLostOKNO] [bit] NULL,
	[CarUnLostOKNO] [bit] NULL,
	[MJLostOKID] [char](256) NOT NULL,
	[MJLostOKNO] [bit] NULL,
	[MJUnLostOKNO] [bit] NULL,
	[CarOptCard] [bit] NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYICLOST]') AND name = N'IX_MYICLOST')
CREATE NONCLUSTERED INDEX [IX_MYICLOST] ON [dbo].[MYICLOST] 
(
	[CardNO] ASC
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MYICIDSTATUS]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYICIDSTATUS]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYICIDSTATUS](
	[CardState] [varchar](30) NOT NULL,
	[CardState2] [varchar](1) NOT NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MYGANGWEIKOUSET]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYGANGWEIKOUSET]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYGANGWEIKOUSET](
	[CarChannel] [int] NOT NULL,
	[InOut] [int] NULL,
	[InOutName] [varchar](100) NULL,
	[CtrlNumber] [int] NULL,
	[OpenID] [int] NULL,
	[OpenType] [int] NULL,
	[VideoCardID] [int] NULL,
	[PersonVideo] [int] NULL,
	[BigSmall] [int] NULL,
	[CheckPortID] [int] NULL,
	[TempIn] [int] NULL,
	[TempOut] [int] NULL,
	[HasOutCard] [int] NULL,
	[IdentifyAddress] [varchar](15) NULL,
	[IdentifySignal] [int] NULL,
	[SubJH] [varchar](150) NULL,
	[XieYi] [int] NULL,
	[IP] [varchar](50) NULL,
	[PCName] [varchar](100) NOT NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYGANGWEIKOUSET]') AND name = N'IX_MYGANGWEIKOUSET')
CREATE NONCLUSTERED INDEX [IX_MYGANGWEIKOUSET] ON [dbo].[MYGANGWEIKOUSET] 
(
	[PCName] ASC
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MYFAXINGSSUE]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYFAXINGSSUE]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYFAXINGSSUE](
	[CardNO] [varchar](30) NOT NULL,
	[UserNO] [varchar](30) NOT NULL,
	[CardState] [char](1) NULL,
	[CardYJ] [money] NULL,
	[SubSystem] [varchar](5) NULL,
	[CarCardType] [varchar](20) NULL,
	[CarIssueDate] [datetime] NULL,
	[CarIssueUserCard] [varchar](30) NULL,
	[Balance] [money] NULL,
	[CarValidStartDate] [datetime] NULL,
	[CarValidEndDate] [datetime] NULL,
	[CPH] [varchar](20) NULL,
	[CarColor] [nvarchar](50) NULL,
	[CarType] [varchar](100) NULL,
	[CarPlace] [varchar](100) NULL,
	[CarWithdrawCardDate] [datetime] NULL,
	[CarWithdrawOptCard] [varchar](30) NULL,
	[CarValidMachine] [varchar](256) NULL,
	[CarValidZone] [varchar](16) NULL,
	[CarMemo] [varchar](255) NULL,
	[MJCardType] [varchar](20) NULL,
	[MJIssueDate] [datetime] NULL,
	[MJIssueUserCard] [varchar](30) NULL,
	[MJEndDate] [datetime] NULL,
	[MJValidStartTime] [char](2) NULL,
	[MJValidEndTime] [char](2) NULL,
	[MJValidMachine] [varchar](2560) NULL,
	[MJWithdrawCardDate] [datetime] NULL,
	[MJWithdrawOptCard] [varchar](30) NULL,
	[MJMemo] [varchar](255) NULL,
	[IssueDate] [datetime] NULL,
	[WithdrawDate] [datetime] NULL,
	[IssueUserCard] [varchar](30) NULL,
	[WithdrawUserCard] [varchar](30) NULL,
	[LossregDate] [datetime] NULL,
	[LossregUserCard] [varchar](30) NULL,
	[CardIDNO] [varchar](30) NULL,
	[DownloadSignal] [varchar](50) NULL,
	[CarPic] [varchar](256) NULL,
	[CarPhoto] [image] NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Tempnumber] [int] NULL,
	[TimeTeam] [varchar](20) NULL,
	[HolidayLimited] [varchar](20) NULL,
	[UserInfo] [varchar](250) NULL,
	[BackCardNum] [varchar](250) NULL,
	[CardIdLossState] [char](1) NULL,
	[CardIdUnLossState] [varchar](250) NULL,
	[UnLossDate] [datetime] NULL,
	[UnLossUer] [varchar](50) NULL,
	[MJBeginDate] [datetime] NULL,
	[CarFailID] [nvarchar](250) NULL,
	[CaRFailOKNO] [char](1) NULL,
	[DownLoadState] [char](2) NULL,
        [CardLossMachine] [varchar](256) NULL,
        [MjPassword] [varchar](20) NULL,
 CONSTRAINT [PK_MYFAXINGSSUE] PRIMARY KEY NONCLUSTERED 
(
	[ID] ASC
) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MYCOMPUTERSET]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO

alter table MYFAXINGSSUE add  MjEnabSysHoliday varchar(20) 
GO
alter table MYFAXINGSSUE add  MJJureTeam varchar(20)
GO
--2015-11-18
if NOT EXISTS (select * from   syscolumns where name='MJTCard' and id=(select id from  sysobjects where name='MYFAXINGSSUE')) 
alter table MYFAXINGSSUE add  MJTCard  bit default 0
GO
if NOT EXISTS (select * from   syscolumns where name='MonthType' and id=(select id from  sysobjects where name='MYFAXINGSSUE')) 
alter table MYFAXINGSSUE add  MonthType  int default 0
GO

SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYCOMPUTERSET]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYCOMPUTERSET](
	[PCName] [varchar](50) NOT NULL,
	[CtrlNumber] [int] NOT NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYCOMPUTERSET]') AND name = N'IX_MYCOMPUTERSET')
CREATE NONCLUSTERED INDEX [IX_MYCOMPUTERSET] ON [dbo].[MYCOMPUTERSET] 
(
	[PCName] ASC
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MyCommonality]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MyCommonality]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MyCommonality](
	[FileDate] [datetime] NOT NULL
) ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[MYCHECHANGXITONGSET]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYCHECHANGXITONGSET]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYCHECHANGXITONGSET](
	[StationNO] [int] NOT NULL,
	[CarparkNO] [int] NULL,
	[HasImage] [int] NULL,
	[ImageSave] [int] NULL,
	[SaveDays] [int] NULL,
	[ImagePath] [varchar](256) NULL,
	[TotalCarSpace] [int] NULL,
	[CarSpaceScreen] [int] NULL,
	[CarSpaceScreenNumber] [int] NULL,
	[CarSpaceScreenCom] [int] NULL,
	[FullSpaceLight] [int] NULL,
	[FullSpaceLightNumber] [int] NULL,
	[FullSpaceLightCom] [int] NULL,
	[MoneyScreen] [int] NULL,
	[MoneyScreenCom] [int] NULL,
	[BillPrint] [int] NULL,
	[Monitor01] [int] NULL,
	[Monitor02] [int] NULL,
	[FreeCarOK] [int] NULL,
	[TempFreeCarOK] [int] NULL,
	[ZJZP] [int] NULL,
	[ZPID] [int] NULL,
	[YKCSSF] [int] NULL,
	[CenterSFCS] [int] NULL,
	[CenterCSJE] [money] NULL,
	[SFOption] [int] NULL,
	[SFMode] [int] NULL,
	[HasPoint] [int] NULL,
	[PointNum] [int] NULL,
	[Discount] [int] NULL,
	[RealtimeDownload] [int] NULL,
	[DownloadCardValid] [int] NULL,
	[TimeLoadMode] [int] NULL,
	[TimeLoadInterval] [int] NULL,
	[InOutTimeInterval] [int] NULL,
	[PwdCheck] [int] NULL,
	[ShowDZState] [int] NULL,
	[ShowReceiveCardBox] [int] NULL,
	[CompareAccuracy] [int] NULL,
	[ControlInOut] [int] NULL,
	[VideoCardType] [int] NULL,
	[LoadCharge] [int] NULL,
	[ReadCardLogin] [int] NULL,
	[PCName] [varchar](100) NULL,
	[DisplayTime] [int] NULL,
	[VideoShiftTime] [int] NULL,
	[VideoBrightness] [int] NULL,
	[VideoResolution] [int] NULL,
	[VideoFour] [int] NULL,
	[PersonVideo] [int] NULL,
	[CtrlVolume] [varchar](20) NULL,
	[PrintFontSize] [int] NULL,
	[BillPrintAuto] [int] NULL,
	[TempCardPrePlate] [int] NULL,
	[AutoPrePlate] [int] NULL,
	[SetTempCardType] [int] NULL,
	[SetTempMoney] [int] NULL,
	[TempTypeDefineOK] [int] NULL,
	[TempTypeDefineString] [varchar](200) NULL,
	[IDSoftOpen] [int] NULL,
	[IDNoticeDay] [int] NULL,
	[IdSfCancel] [int] NULL,
	[IdReReadHandle] [int] NULL,
	[IdPlateDownLoad] [int] NULL,
	[ID1In1OutCardType] [varchar](200) NULL,
	[IDComfirmOpenEnable] [int] NULL,
	[IDComfirmOpenCardType] [varchar](200) NULL,
	[ForbidSamePosition] [int] NULL,
	[MonthYQRule] [int] NULL,
	[CtrlVoiceLedVersion] [int] NULL,
	[CtrlVoiceMode] [int] NULL,
	[PcTalkPlate] [int] NULL,
	[CtrlShowPlate] [int] NULL,
	[CtrlShowStayTime] [int] NULL,
	[CtrlShowRemainPos] [int] NULL,
	[CtrlShowInfo] [int] NULL,
	[CtrlShowCW] [int] NULL,
	[RemainPosLedShowInfo] [int] NULL,
	[RemainPosLedShowPlate] [int] NULL,
	[CarPosLedLen] [int] NULL,
	[SFLedType] [int] NULL,
	[SumMoneyHide] [int] NULL,
	[ExitOnlineByPwd] [int] NULL,
	[CtrlSetHasPwd] [int] NULL,
	[SoftOpenNoPlate] [int] NULL,
	[AreaDefault] [varchar](4) NULL,
	[OneKeyShortCut] [int] NULL,
	[CheDuiMode] [int] NULL,
	[InOutQueryName] [int] NULL,
	[ExceptionHandle] [int] NULL,
	[ShowTempCardNum] [int] NULL,
	[ReLoginPrint] [int] NULL,
	[FreeCardNoInPlace] [int] NULL,
	[CheckPortFirst] [int] NULL,
	[SaveDetailLog] [int] NULL,
	[OnlyShowThisRemainPos] [int] NULL,
	[TempCarPlaceNum] [int] NULL,
	[MonthCarPlaceNum] [int] NULL,
	[MoneyCarPlaceNum] [int] NULL,
	[bBarCodePrint] [int] NULL,
	[NetWorkVideo] [int] NULL,
	[NetWorkVideoType] [int] NULL,
	[IsCPHAuto] [int] NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYCHECHANGXITONGSET]') AND name = N'IX_MYCHECHANGXITONGSET')
CREATE NONCLUSTERED INDEX [IX_MYCHECHANGXITONGSET] ON [dbo].[MYCHECHANGXITONGSET] 
(
	[StationNO] ASC
) ON [PRIMARY]
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'ControlInOut'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'ID��һ��һ��' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'ControlInOut'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'DisplayTime'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'��ʾʱ��
' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'DisplayTime'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'VideoShiftTime'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'ͼ��Ա�ʱ��' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'VideoShiftTime'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'VideoBrightness'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'ͼ������
' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'VideoBrightness'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'VideoResolution'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'ͼ��ֱ���
' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'VideoResolution'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'VideoFour'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'������·ʵʱ���
' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'VideoFour'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'CtrlVolume'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'��������
' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'CtrlVolume'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'PrintFontSize'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'��ӡ����
' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'PrintFontSize'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'BillPrintAuto'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'�Զ���ӡ�շ�Ʊ��
' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'BillPrintAuto'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'TempCardPrePlate'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'��ʱ���볡Ԥ�ó��ƿ���' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'TempCardPrePlate'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'AutoPrePlate'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'��ʱ���Զ�����Ԥ�ô���' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'AutoPrePlate'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'SetTempCardType'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'��ʱ���շѿɸ��Ŀ���' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'SetTempCardType'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'SetTempMoney'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'��ʱ���ɸ����շѽ��' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'SetTempMoney'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'TempTypeDefineOK'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'�շѴ����շ������Զ���' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'TempTypeDefineOK'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'TempTypeDefineString'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'�շѴ����շ������Զ�����ϸ' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'TempTypeDefineString'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'IDSoftOpen'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'IDSoftOpen'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'IDNoticeDay'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'�̶�����Ч��ʣ��XX����ʾ' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'IDNoticeDay'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'IdSfCancel'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'ID��ʱ�������շѿ�ȡ��' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'IdSfCancel'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'IdReReadHandle'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'Զ����ID���ظ������Ż�����' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'IdReReadHandle'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'IdPlateDownLoad'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'ID���ѻ�������������ʾ����' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'IdPlateDownLoad'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'ID1In1OutCardType'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'ID�ֿ���һ��һ��' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'ID1In1OutCardType'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'IDComfirmOpenEnable'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'ID�ֿ���ȷ�Ͽ�բ' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'IDComfirmOpenEnable'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'IDComfirmOpenCardType'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'ID���ֿ���ȷ�Ͽ�բ' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'IDComfirmOpenCardType'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'ForbidSamePosition'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'�¿�����ͬ��λ�볡' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'ForbidSamePosition'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'MonthYQRule'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'�¿������շѹ���' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'MonthYQRule'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'CtrlVoiceLedVersion'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'����/��ʾ����3.0 or 4.1��' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'CtrlVoiceLedVersion'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'CtrlVoiceMode'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'����ģʽ����ӭ����/һ·˳�磩' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'CtrlVoiceMode'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'PcTalkPlate'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'����������������' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'PcTalkPlate'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'CtrlShowPlate'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'������������ʾ����' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'CtrlShowPlate'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'CtrlShowStayTime'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'������������ʾͣ��ʱ��' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'CtrlShowStayTime'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'CtrlShowRemainPos'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'���ƻ���ʾʣ�೵λ' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'CtrlShowRemainPos'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'CtrlShowInfo'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'���ƻ���ʾ������Ϣ' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'CtrlShowInfo'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'CtrlShowCW'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'���ƻ���ʾ��λ��' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'CtrlShowCW'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'RemainPosLedShowInfo'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'ʣ�೵λ����ʾ������Ϣ' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'RemainPosLedShowInfo'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'RemainPosLedShowPlate'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'ʣ�೵λ����ʾ����' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'RemainPosLedShowPlate'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'CarPosLedLen'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'ʣ�೵λ��ʾ��-ģʽ' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'CarPosLedLen'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'SFLedType'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'����շ���ʾ��-����' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'SFLedType'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'SumMoneyHide'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'���߼�ز���ʾ�ۼƽ��' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'SumMoneyHide'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'ExitOnlineByPwd'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'ƾ�����˳����߼��' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'ExitOnlineByPwd'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'CtrlSetHasPwd'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'ƾ���������ƻ�����' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'CtrlSetHasPwd'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'SoftOpenNoPlate'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'�����բ�����복��' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'SoftOpenNoPlate'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'AreaDefault'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'����ʡ��' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'AreaDefault'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'OneKeyShortCut'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'����һ��ʽ��ݼ�' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'OneKeyShortCut'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'CheDuiMode'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'���ó���ģʽ(��բ����)' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'CheDuiMode'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'InOutQueryName'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'�������¼��ʾ�������' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'InOutQueryName'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'ExceptionHandle'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'�����쳣����/�޿�����' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'ExceptionHandle'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'ShowTempCardNum'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'��ʾ�����������ڿ�Ƭ����' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'ShowTempCardNum'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'ReLoginPrint'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'�����¼�ɴ�ӡСƱ' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'ReLoginPrint'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'FreeCardNoInPlace'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'��ѿ������복λ��' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'FreeCardNoInPlace'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'CheckPortFirst'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'��⿨��������ȡ��¼' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'CheckPortFirst'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'SaveDetailLog'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'������ϸ��־' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'SaveDetailLog'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCHECHANGXITONGSET', N'COLUMN',N'OnlyShowThisRemainPos'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'����ʾ��ʱ�̶���ֵʣ�೵λ' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCHECHANGXITONGSET', @level2type=N'COLUMN',@level2name=N'OnlyShowThisRemainPos'
GO
/****** Object:  Table [dbo].[MYCHECHANGSTATUS]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYCHECHANGSTATUS]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYCHECHANGSTATUS](
	[PCName] [varchar](50) NOT NULL,
	[Online] [int] NOT NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MYCHECHANGPASS]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYCHECHANGPASS]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYCHECHANGPASS](
	[Pwd] [varchar](50) NULL,
	[PCName] [varchar](50) NOT NULL,
	[BakeupTime] [datetime] NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MYCHECHANGNORMALSHOUFEI]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYCHECHANGNORMALSHOUFEI]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYCHECHANGNORMALSHOUFEI](
	[CardType] [varchar](10) NOT NULL,
	[FreeMinute] [int] NOT NULL,
	[TopSF] [int] NOT NULL,
	[Hours] [int] NULL,
	[JE] [money] NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MYCARGOOUTRECORDREPORT]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO

--2017-08-05 [ITEMPMONEY]��int ��Ϊ money ����

IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYCARGOOUTRECORDREPORT]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYCARGOOUTRECORDREPORT](
	[CARDSNO] [varchar](50) NULL,
	[IMONTHA] [int] NULL,
	[IMONTHB] [int] NULL,
	[IMONTHC] [int] NULL,
	[IMONTHD] [int] NULL,
	[ISUMMONTH] [int] NULL,
	[IFREEA] [int] NULL,
	[IFREEB] [int] NULL,
	[ISUMFREE] [int] NULL,
	[ITEMPA] [int] NULL,
	[ITEMPB] [int] NULL,
	[ITEMPC] [int] NULL,
	[ITEMPD] [int] NULL,
	[ITEMPE] [int] NULL,
	[ITEMPF] [int] NULL,
	[ITEMPG] [int] NULL,
	[ITEMPH] [int] NULL,
	[ISUMTEMP] [int] NULL,
	[IMONEYA] [int] NULL,
	[IMONEYB] [int] NULL,
	[IMONEYC] [int] NULL,
	[IMONEYD] [int] NULL,
	[ISUMMONEY] [int] NULL,
	[IMONEY] [money] NULL,
	[ZSUMCAR] [int] NULL,
	[ZSUMMONEY] [money] NULL,
	[ITEMPFREE] [int] NULL,
	[ITEMPMONEY] [money] NULL,
	[IMONTHE] [int] NULL,
	[IMONTHF] [int] NULL,
	[IMONTHG] [int] NULL,
	[IMONTHH] [int] NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MYCARGOOUTRECORD]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYCARGOOUTRECORD]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYCARGOOUTRECORD](
    [ID] [bigint] IDENTITY(1,1) NOT NULL,
	[CardNO] [varchar](30) NOT NULL,
	[CPH] [varchar](20) NULL,
	[CardType] [varchar](20) NULL,
	[InTime] [datetime] NULL,
	[OutTime] [datetime] NULL,
	[InGateName] [varchar](100) NULL,
	[OutGateName] [varchar](100) NULL,
	[InOperatorCard] [varchar](30) NULL,
	[OutOperatorCard] [varchar](30) NULL,
	[InOperator] [varchar](50) NULL,
	[OutOperator] [varchar](50) NULL,
	[InPic] [varchar](255) NULL,
	[InUser] [varchar](255) NULL,
	[OutPic] [varchar](255) NULL,
	[OutUser] [varchar](255) NULL,
	[ZJPic] [varchar](255) NULL,
	[SFJE] [money] NULL,
	[Balance] [money] NULL,
	[YSJE] [money] NULL,
	[SFTime] [datetime] NULL,
	[SFOperator] [varchar](50) NULL,
	[SFOperatorCard] [varchar](30) NULL,
	[SFGate] [varchar](100) NULL,
	[OvertimeSymbol] [varchar](10) NULL,
	[OvertimeSFTime] [datetime] NULL,
	[OvertimeSFJE] [money] NULL,
	[CarparkNO] [int] NULL,
	[BigSmall] [int] NULL,
	[FreeReason] [varchar](100) NULL,
	[StayTime] [varchar](30) NULL,
	[Temp1] [varchar](50) NULL,
	[Temp2] [varchar](50) NULL,
	[Temp3] [varchar](50) NULL,
	[Temp4] [varchar](50) NULL,
	[Temp5] [varchar](50) NULL
) ON [PRIMARY]
END
GO
--�೵λ�೵��¼
if NOT EXISTS (select * from   syscolumns where name='bMorePaingCar' and id=(select id from  sysobjects where name='MYCARGOOUTRECORD')) 
BEGIN
alter table MYCARGOOUTRECORD add  bMorePaingCar  bit  default  0;
END
GO
--�Ƿ�Ϊ���ۼ�¼
if NOT EXISTS (select * from   syscolumns where name='bDZ' and id=(select id from  sysobjects where name='MYCARGOOUTRECORD')) 
BEGIN
alter table MYCARGOOUTRECORD add  bDZ  bit  default  0;
END
GO
--�Ƿ�Ϊ���ۼ�¼ԭ��
if NOT EXISTS (select * from syscolumns where name='strDZ' and id=(select id from  sysobjects where name='MYCARGOOUTRECORD')) 
BEGIN
	ALTER TABLE MYCARGOOUTRECORD ADD strDZ varchar(500) null
END
GO
SET ANSI_PADDING OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYCARGOOUTRECORD]') AND name = N'IX_MYCARGOOUTRECORD')
CREATE NONCLUSTERED INDEX [IX_MYCARGOOUTRECORD] ON [dbo].[MYCARGOOUTRECORD] 
(
	[InTime] DESC
) ON [PRIMARY]
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYCARGOOUTRECORD]') AND name = N'IX_MYCARGOOUTRECORD_1')
CREATE NONCLUSTERED INDEX [IX_MYCARGOOUTRECORD_1] ON [dbo].[MYCARGOOUTRECORD] 
(
	[OutTime] DESC
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MYCardType]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYCardType]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYCardType](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[CardType] [nvarchar](50) NOT NULL,
	[Identifying] [nvarchar](50) NOT NULL,
	[Enabled] [bit] NOT NULL,
	[Reamrks] [nvarchar](50) NULL,
 CONSTRAINT [PK_MYCardType] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_Description' , N'USER',N'dbo', N'TABLE',N'MYCardType', N'COLUMN',N'CardType'))
EXEC dbo.sp_addextendedproperty @name=N'MS_Description', @value=N'����' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'MYCardType', @level2type=N'COLUMN',@level2name=N'CardType'
GO
/****** Object:  Table [dbo].[MYCARCOMERECORD]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYCARCOMERECORD]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYCARCOMERECORD](
    [ID] [bigint] IDENTITY(1,1) NOT NULL,
	[CardNO] [varchar](30) NOT NULL,
	[CPH] [varchar](20) NULL,
	[CardType] [varchar](20) NULL,
	[InTime] [datetime] NULL,
	[OutTime] [datetime] NULL,
	[InGateName] [varchar](100) NULL,
	[OutGateName] [varchar](100) NULL,
	[InOperatorCard] [varchar](30) NULL,
	[OutOperatorCard] [varchar](30) NULL,
	[InOperator] [varchar](50) NULL,
	[OutOperator] [varchar](50) NULL,
	[InPic] [varchar](255) NULL,
	[InUser] [varchar](255) NULL,
	[OutPic] [varchar](255) NULL,
	[OutUser] [varchar](255) NULL,
	[ZJPic] [varchar](255) NULL,
	[SFJE] [money] NULL,
	[Balance] [money] NULL,
	[YSJE] [money] NULL,
	[SFTime] [datetime] NULL,
	[SFOperator] [varchar](50) NULL,
	[SFOperatorCard] [varchar](30) NULL,
	[SFGate] [varchar](100) NULL,
	[OvertimeSymbol] [varchar](10) NULL,
	[OvertimeSFTime] [datetime] NULL,
	[OvertimeSFJE] [money] NULL,
	[CarparkNO] [int] NULL,
	[BigSmall] [int] NULL,
	[FreeReason] [varchar](100) NULL,
	[StayTime] [varchar](30) NULL,
	[Temp1] [varchar](50) NULL,
	[Temp2] [varchar](50) NULL,
	[Temp3] [varchar](50) NULL,
	[Temp4] [varchar](50) NULL,
	[Temp5] [varchar](50) NULL
) ON [PRIMARY]
END
GO
--�೵λ�೵��¼
if NOT EXISTS (select * from   syscolumns where name='bMorePaingCar' and id=(select id from  sysobjects where name='MYCARCOMERECORD')) 
BEGIN
alter table MYCARCOMERECORD add  bMorePaingCar  bit  default  0;
END
GO
--�Ƿ�Ϊ���ۼ�¼
if NOT EXISTS (select * from   syscolumns where name='bDZ' and id=(select id from  sysobjects where name='MYCARCOMERECORD')) 
BEGIN
alter table MYCARCOMERECORD add  bDZ  bit  default  0;
END
GO
--�Ƿ�Ϊ���ۼ�¼ԭ��
if NOT EXISTS (select * from syscolumns where name='strDZ' and id=(select id from  sysobjects where name='MYCARCOMERECORD')) 
BEGIN
	ALTER TABLE MYCARCOMERECORD ADD strDZ varchar(500) null
END
GO
SET ANSI_PADDING OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYCARCOMERECORD]') AND name = N'IX_MYCARCOMERECORD')
CREATE NONCLUSTERED INDEX [IX_MYCARCOMERECORD] ON [dbo].[MYCARCOMERECORD] 
(
	[InTime] DESC
) ON [PRIMARY]
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYCARCOMERECORD]') AND name = N'IX_MYCARCOMERECORD_1')
CREATE NONCLUSTERED INDEX [IX_MYCARCOMERECORD_1] ON [dbo].[MYCARCOMERECORD] 
(
	[CardNO] DESC
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MYCAOZUOYUANGROUP]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYCAOZUOYUANGROUP]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYCAOZUOYUANGROUP](
	[GroupNo] [int] IDENTITY(1,1) NOT NULL,
	[GroupName] [nvarchar](20) NOT NULL,
	[Remarks] [nvarchar](200) NULL,
 CONSTRAINT [PK_MYCAOZUOYUANGROUP] PRIMARY KEY CLUSTERED 
(
	[GroupNo] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[MYCAOZUOYUAN]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYCAOZUOYUAN]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYCAOZUOYUAN](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[CardNO] [varchar](30) NOT NULL,
	[CardType] [varchar](20) NOT NULL,
	[UserNO] [varchar](30) NOT NULL,
	[UserName] [varchar](50) NOT NULL,
	[DeptName] [varchar](200) NOT NULL,
	[Pwd] [varchar](50) NOT NULL,
	[CardState] [int] NOT NULL,
	[UserLevel] [int] NOT NULL,
 CONSTRAINT [PK_MYCAOZUOYUAN] PRIMARY KEY NONCLUSTERED 
(
	[CardNO] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MYBUMENSET]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYBUMENSET]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYBUMENSET](
	[DeptNO] [varchar](50) NOT NULL,
	[DeptName] [varchar](256) NOT NULL,
	[DeptSymbol] [varchar](50) NOT NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[PID] [int] NOT NULL,
 CONSTRAINT [PK_MYBUMENSET] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MoneyScheme]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MoneyScheme]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MoneyScheme](
	[SchId] [int] IDENTITY(1,1) NOT NULL,
	[SchName] [varchar](50) NULL,
	[FieldName] [varchar](50) NULL,
	[Operators] [varchar](50) NULL,
	[Selectvalues] [varchar](50) NULL,
	[startime] [varchar](50) NULL,
	[endtime] [varchar](50) NULL,
 CONSTRAINT [PK__MoneySch__CAD9870B37F0F5ED] PRIMARY KEY CLUSTERED 
(
	[SchId] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MJSelectScheme]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MJSelectScheme]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MJSelectScheme](
	[SchId] [int] IDENTITY(1,1) NOT NULL,
	[SchName] [varchar](50) NULL,
	[FieldName] [varchar](50) NULL,
	[Operators] [varchar](50) NULL,
	[Selectvalues] [varchar](50) NULL,
	[startime] [varchar](50) NULL,
	[endtime] [varchar](50) NULL,
 CONSTRAINT [PK__MJSelect__CAD9870B196C6ECD] PRIMARY KEY CLUSTERED 
(
	[SchId] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[JJCNEWSHENZHEN]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCNEWSHENZHEN]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[JJCNEWSHENZHEN](
	[CardType] [varchar](10) NULL,
	[FirstChargeTimeHour] [int] NULL,
	[FirstChargeTimeMinute] [int] NULL,
	[CarParkType] [int] NULL,
	[ChargeByDay] [money] NULL,
	[FreeMinute] [int] NULL,
	[PeakStartHour] [int] NULL,
	[PeakStartMinute] [int] NULL,
	[PeakEndHour] [int] NULL,
	[PeakEndMinute] [int] NULL,
	[HolidayOneStartMonth] [int] NULL,
	[HolidayOneStartDay] [int] NULL,
	[HolidayOneEndMonth] [int] NULL,
	[HolidayOneEndDay] [int] NULL,
	[HolidayTwoStartMonth] [int] NULL,
	[HolidayTwoStartDay] [int] NULL,
	[HolidayTwoEndMonth] [int] NULL,
	[HolidayTwoEndDay] [int] NULL,
	[PeakChargeHour] [int] NULL,
	[PeakChargeMinute] [int] NULL,
	[NoPeakChargeHour] [int] NULL,
	[NoPeakChargeMinute] [int] NULL,
	[HolidayChargeHour] [int] NULL,
	[HolidayChargeMinute] [int] NULL,
	[PeakMoney] [money] NULL,
	[NoPeakMoney] [money] NULL,
	[HolidayMoney] [money] NULL,
	[WorkdayFirstHourMoney] [money] NULL,
	[HolidayFirstHourMoney] [money] NULL,
	[AllDayTopMoney] [money] NULL,
	[YesNoFreeTime] [int] NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[M_TimeOutSet]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[M_TimeOutSet]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[M_TimeOutSet](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[DevcNum] [int] NULL,
	[Doornum] [int] NULL,
	[Times] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[M_TimeGroup]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[M_TimeGroup]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[M_TimeGroup](
	[GroupID] [int] NOT NULL,
	[GroupName] [varchar](50) NOT NULL,
	[week] [int] NULL,
	[FirstBeginTime] [varchar](6) NULL,
	[FirstEndTime] [varchar](6) NULL,
	[OpenModel1] [varchar](10) NULL,
	[Status1] [varchar](10) NULL,
	[SecondBeginTime] [varchar](6) NULL,
	[SecondEndTime] [varchar](6) NULL,
	[OpenModel2] [varchar](10) NULL,
	[Status2] [varchar](10) NULL,
	[ThirdBeginTime] [varchar](6) NULL,
	[ThirdEndTime] [varchar](6) NULL,
	[OpenModel3] [varchar](10) NULL,
	[Status3] [varchar](10) NULL,
	[FourBeginTime] [varchar](6) NULL,
	[FourEndTime] [varchar](6) NULL,
	[OpenModel4] [varchar](10) NULL,
	[Status4] [varchar](10) NULL,
	[FiveBeginTime] [varchar](6) NULL,
	[FiveEndTime] [varchar](6) NULL,
	[OpenModel5] [varchar](10) NULL,
	[Status5] [varchar](10) NULL,
	[SixBeginTime] [varchar](6) NULL,
	[SixEndTime] [varchar](6) NULL,
	[OpenModel6] [varchar](10) NULL,
	[Status6] [varchar](10) NULL,
	[SevenBeginTime] [varchar](6) NULL,
	[SevenEndTime] [varchar](6) NULL,
	[OpenModel7] [varchar](10) NULL,
	[Status7] [varchar](10) NULL,
	[EightBeginTime] [varchar](6) NULL,
	[EightEndTime] [varchar](6) NULL,
	[OpenModel8] [varchar](10) NULL,
	[Status8] [varchar](10) NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[M_Rrecords_Filer]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[M_Rrecords_Filer]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[M_Rrecords_Filer](
	[CardID] [varchar](10) NOT NULL,
	[UserNo] [varchar](15) NOT NULL,
	[MachNo] [int] NOT NULL,
	[MachPlace] [varchar](256) NULL,
	[DoorNo] [int] NOT NULL,
	[DoorPlace] [varchar](256) NULL,
	[Events] [varchar](20) NULL,
	[OpenTime] [datetime] NOT NULL,
	[Password] [varchar](20) NULL,
	[PasswordType] [varchar](100) NOT NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[M_Records]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[M_Records]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[M_Records](
	[CardID] [varchar](10) NOT NULL,
	[UserNo] [varchar](15) NOT NULL,
	[MachNo] [int] NOT NULL,
	[MachPlace] [varchar](256) NULL,
	[DoorNo] [int] NOT NULL,
	[DoorPlace] [varchar](256) NULL,
	[Events] [varchar](100) NULL,
	[OpenTime] [datetime] NOT NULL,
	[Password] [varchar](20) NULL,
	[PasswordType] [varchar](100) NOT NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[M_Record]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[M_Record]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[M_Record](
	[CardID] [varchar](10) NOT NULL,
	[CardType] [varchar](10) NOT NULL,
	[UserNo] [varchar](15) NOT NULL,
	[UserName] [varchar](30) NOT NULL,
	[Dept] [varchar](50) NULL,
	[MachNo] [int] NOT NULL,
	[MachPlace] [varchar](256) NULL,
	[DoorNo] [int] NOT NULL,
	[DoorPlace] [varchar](256) NULL,
	[Events] [varchar](20) NULL,
	[OpenTime] [datetime] NOT NULL,
	[ControlType] [char](1) NOT NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[M_OutTimeBaoJingRec]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[M_OutTimeBaoJingRec]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[M_OutTimeBaoJingRec](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[DevcNum] [int] NULL,
	[Baojin] [varchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[M_OpenDoorModel]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[M_OpenDoorModel]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[M_OpenDoorModel](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[devcnum] [int] NULL,
	[OpenMode] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[M_NormalOpenDoorSet]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[M_NormalOpenDoorSet]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[M_NormalOpenDoorSet](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[DevcNum] [int] NULL,
	[DoorLeiBie] [int] NULL,
	[NorMalSet] [int] NULL,
	[stat1] [varchar](20) NULL,
	[End1] [varchar](20) NULL,
	[stat2] [varchar](20) NULL,
	[End2] [varchar](20) NULL,
	[stat3] [varchar](20) NULL,
	[End3] [varchar](20) NULL,
	[stat4] [varchar](20) NULL,
	[End4] [varchar](20) NULL,
 CONSTRAINT [PK__M_Normal__3213E83F78FF9F3B] PRIMARY KEY CLUSTERED 
(
	[id] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[M_DoorData]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[M_DoorData]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[M_DoorData](
	[MachNo] [int] NOT NULL,
	[Place] [varchar](50) NULL,
	[BaudRate] [int] NOT NULL,
	[ControlType] [int] NOT NULL,
	[IPadress] [varchar](50) NULL,
	[DoorNumber] [varchar](300) NULL,
	[DoorName] [varchar](200) NULL,
	[DoorNumber1] [varchar](50) NULL,
	[DoorName1] [varchar](200) NULL,
	[DoorNumber2] [varchar](50) NULL,
	[DoorName2] [varchar](200) NULL,
	[DoorNumber3] [varchar](50) NULL,
	[DoorName3] [varchar](200) NULL,
	[DoorNumber4] [varchar](50) NULL,
	[DoorName4] [varchar](200) NULL,
	[DoorLeibie] [varchar](50) NULL,
	[DoorLeibie1] [varchar](50) NULL,
	[DoorLeibie2] [varchar](50) NULL,
	[DoorLeibie3] [varchar](50) NULL,
	[DoorLeibie4] [varchar](50) NULL,
 CONSTRAINT [PK__M_DoorDa__1515B975799EBDB9] PRIMARY KEY CLUSTERED 
(
	[MachNo] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[M_Door_Holiday]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[M_Door_Holiday]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[M_Door_Holiday](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[sDate] [varchar](10) NOT NULL,
	[DevcNum] [int] NULL,
	[DoorLei] [int] NULL,
 CONSTRAINT [PK_M_Door_Holiday] PRIMARY KEY CLUSTERED 
(
	[id] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[M_CardType]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[M_CardType]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[M_CardType](
	[carid] [int] NOT NULL,
	[carCname] [varchar](50) NULL,
	[carEname] [varchar](50) NULL,
	[carMark] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[carid] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  UserDefinedFunction [dbo].[JJCZXT]    Script Date: 09/02/2013 15:59:50 ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCZXT]') AND xtype in (N'FN', N'IF', N'TF'))
BEGIN
execute dbo.sp_executesql @statement = N'
CREATE  FUNCTION [dbo].[JJCZXT](@VSTR VARCHAR(5))
RETURNS VARCHAR(30) AS
BEGIN
    DECLARE @I INT
    DECLARE @BACKVALUE VARCHAR(30)
    SET @BACKVALUE='''' 
    SET @I=1
    WHILE @I<=2
    BEGIN
      IF  @I=1 
        IF SUBSTRING(@VSTR,@I,1)=''1''
          SET @BACKVALUE=@BACKVALUE+''CarPark''
        ELSE  
          SET @BACKVALUE=@BACKVALUE+'' ''
      ELSE IF @I=2 
        IF SUBSTRING(@VSTR,@I,1)=''1''
          SET @BACKVALUE=RTRIM(@BACKVALUE)+'' AccessControl''
        ELSE 
          SET @BACKVALUE=@BACKVALUE+'' ''
       SET @I=@I+1
    END
    RETURN (LTRIM(RTRIM(@BACKVALUE)))
END
      
' 
END
GO
/****** Object:  UserDefinedFunction [dbo].[CALC16_10]    Script Date: 09/02/2013 15:59:50 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[CALC16_10]') AND xtype in (N'FN', N'IF', N'TF'))
BEGIN
execute dbo.sp_executesql @statement = N'
CREATE FUNCTION [dbo].[CALC16_10] (@D16 CHAR(4)) 
RETURNS CHAR(5) 
AS 
BEGIN
RETURN (RIGHT(''00000''+LTRIM(CASE WHEN SUBSTRING(@D16,1,1)=''F'' THEN 15 WHEN SUBSTRING(@D16,1,1)=''E'' THEN 14 WHEN SUBSTRING(@D16,1,1)=''D'' THEN 13 WHEN SUBSTRING(@D16,1,1)=''C'' THEN 12 WHEN SUBSTRING(@D16,1,1)=''B'' THEN ''11'' WHEN SUBSTRING(@D16,1,1)=''A'' THEN 10 ELSE SUBSTRING(@D16,1,1) END*16*16*16+
CASE WHEN SUBSTRING(@D16,2,1)=''F'' THEN 15 WHEN SUBSTRING(@D16,2,1)=''E'' THEN 14 WHEN SUBSTRING(@D16,2,1)=''D'' THEN 13 WHEN SUBSTRING(@D16,2,1)=''C'' THEN 12 WHEN SUBSTRING(@D16,2,1)=''B'' THEN ''11'' WHEN SUBSTRING(@D16,2,1)=''A'' THEN 10 ELSE SUBSTRING(@D16,2,1) END*16*16+
CASE WHEN SUBSTRING(@D16,3,1)=''F'' THEN 15 WHEN SUBSTRING(@D16,3,1)=''E'' THEN 14 WHEN SUBSTRING(@D16,3,1)=''D'' THEN 13 WHEN SUBSTRING(@D16,3,1)=''C'' THEN 12 WHEN SUBSTRING(@D16,3,1)=''B'' THEN ''11'' WHEN SUBSTRING(@D16,3,1)=''A'' THEN 10 ELSE SUBSTRING(@D16,3,1) END*16+
CASE WHEN SUBSTRING(@D16,4,1)=''F'' THEN 15 WHEN SUBSTRING(@D16,4,1)=''E'' THEN 14 WHEN SUBSTRING(@D16,4,1)=''D'' THEN 13 WHEN SUBSTRING(@D16,4,1)=''C'' THEN 12 WHEN SUBSTRING(@D16,4,1)=''B'' THEN ''11'' WHEN SUBSTRING(@D16,4,1)=''A'' THEN 10 ELSE SUBSTRING(@D16,4,1) END
)
,5)
)
END
' 
END
GO
/****** Object:  UserDefinedFunction [dbo].[CALC10_16]    Script Date: 09/02/2013 15:59:50 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[CALC10_16]') AND xtype in (N'FN', N'IF', N'TF'))
BEGIN
execute dbo.sp_executesql @statement = N'
CREATE FUNCTION [dbo].[CALC10_16] (@D10 INT) 
RETURNS CHAR(4) 
AS      
BEGIN   
RETURN  CASE WHEN (@D10%(16*16*16*16))/(16*16*16)=10 THEN ''A''
	    WHEN (@D10%(16*16*16*16))/(16*16*16)=11 THEN ''B''
	    WHEN (@D10%(16*16*16*16))/(16*16*16)=12 THEN ''C''
	    WHEN (@D10%(16*16*16*16))/(16*16*16)=13 THEN ''D''
	    WHEN (@D10%(16*16*16*16))/(16*16*16)=14 THEN ''E''
	    WHEN (@D10%(16*16*16*16))/(16*16*16)=15 THEN ''F''
	    ELSE CONVERT(CHAR(1),(@D10%(16*16*16*16))/(16*16*16)) END+
	CASE WHEN (@D10%(16*16*16))/(16*16)=10 THEN ''A''
	    WHEN (@D10%(16*16*16))/(16*16)=11 THEN ''B''
	    WHEN (@D10%(16*16*16))/(16*16)=12 THEN ''C''
	    WHEN (@D10%(16*16*16))/(16*16)=13 THEN ''D''
	    WHEN (@D10%(16*16*16))/(16*16)=14 THEN ''E''
	    WHEN (@D10%(16*16*16))/(16*16)=15 THEN ''F''
	    ELSE CONVERT(CHAR(1),(@D10%(16*16*16))/(16*16)) END+
	CASE WHEN (@D10%(16*16))/(16)=10 THEN ''A''
	    WHEN (@D10%(16*16))/(16)=11 THEN ''B''
	    WHEN (@D10%(16*16))/(16)=12 THEN ''C''
	    WHEN (@D10%(16*16))/(16)=13 THEN ''D''
	    WHEN (@D10%(16*16))/(16)=14 THEN ''E''
	    WHEN (@D10%(16*16))/(16)=15 THEN ''F''
	    ELSE CONVERT(CHAR(1),(@D10%(16*16))/(16)) END+
	CASE WHEN (@D10%(16))/(1)=10 THEN ''A''
	    WHEN (@D10%(16))/(1)=11 THEN ''B''
	    WHEN (@D10%(16))/(1)=12 THEN ''C''
	    WHEN (@D10%(16))/(1)=13 THEN ''D''
	    WHEN (@D10%(16))/(1)=14 THEN ''E''
	    WHEN (@D10%(16))/(1)=15 THEN ''F''
	    ELSE CONVERT(CHAR(1),(@D10%(16))/(1)) END
END     
' 
END
GO
/****** Object:  UserDefinedFunction [dbo].[BINTOHEX02]    Script Date: 09/02/2013 15:59:50 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[BINTOHEX02]') AND xtype in (N'FN', N'IF', N'TF'))
BEGIN
execute dbo.sp_executesql @statement = N'
CREATE  FUNCTION [dbo].[BINTOHEX02] (@STRBIN VARCHAR(256))
RETURNS VARCHAR(256) AS
BEGIN
    DECLARE @STRTEMP AS CHAR(1)
    DECLARE @STRHEX AS VARCHAR(256)
    DECLARE @I AS SMALLINT
    SET @STRHEX=''''
    SET @I=2
    WHILE @I<=LEN(@STRBIN)
        BEGIN
 	    SET @STRTEMP=
	    CASE SUBSTRING(@STRBIN,@I,1)
		WHEN ''0'' THEN ''1''
		WHEN ''1'' THEN ''0''
	    END
	    SET @STRHEX=@STRHEX+@STRTEMP
	    SET @I=@I+1
        END
    SET @STRHEX=@STRHEX+''1''
    RETURN (@STRHEX)
END
' 
END
GO
/****** Object:  UserDefinedFunction [dbo].[BINTOHEX]    Script Date: 09/02/2013 15:59:50 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[BINTOHEX]') AND xtype in (N'FN', N'IF', N'TF'))
BEGIN
execute dbo.sp_executesql @statement = N'
CREATE  FUNCTION [dbo].[BINTOHEX] (@STRBIN VARCHAR(256))
RETURNS VARCHAR(64) AS
BEGIN
    DECLARE @STRTEMP AS CHAR(1)
    DECLARE @STRHEX AS VARCHAR(64)
    DECLARE @I AS SMALLINT
    SET @STRHEX=''''
    SET @I=0
    WHILE @I<=LEN(@STRBIN)/4-1
        BEGIN
 	    SET @STRTEMP=
	    CASE SUBSTRING(@STRBIN,@I*4+1,4)
		WHEN ''0000'' THEN ''0''
		WHEN ''0001'' THEN ''1''
		WHEN ''0010'' THEN ''2''
		WHEN ''0011'' THEN ''3''
		WHEN ''0100'' THEN ''4''
		WHEN ''0101'' THEN ''5''
		WHEN ''0110'' THEN ''6''
		WHEN ''0111'' THEN ''7''
		WHEN ''1000'' THEN ''8''
		WHEN ''1001'' THEN ''9''
		WHEN ''1010'' THEN ''A''
		WHEN ''1011'' THEN ''B''
		WHEN ''1100'' THEN ''C''
		WHEN ''1101'' THEN ''D''
		WHEN ''1110'' THEN ''E''
		WHEN ''1111'' THEN ''F''
	    END
	    SET @STRHEX=@STRHEX+@STRTEMP
	    SET @I=@I+1
        END
    RETURN (@STRHEX)
END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[JJCInCarCharge]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCInCarCharge]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE  PROCEDURE [dbo].[JJCInCarCharge]
        @str  NVARCHAR(2500),        
        @IMONTH  INT=0 OUTPUT,
        @Yue  INT=0 OUTPUT,
        @Linshi  INT=0 OUTPUT,
        @ChuZhi  INT=0 OUTPUT,
        @MianFei  INT=0 OUTPUT
AS 
Declare @SQL as nvarchar(2500)
Declare @SQL1 as nvarchar(2500)
Declare @SQL2 as nvarchar(2500)
Declare @SQL3 as nvarchar(2500)
Declare @SQL4 as nvarchar(2500)
/*set @strsum=''select COUNT(*) from MYCARCOMERECORD where''+ @str*/
Begin
  Set @SQL = ''Set @Rows =(select COUNT(*) from vMycarcomerecord where ''+ @str+'')'';
    Execute sp_executesql @SQL, N''@Rows int output'', @IMONTH output;
     End 
Begin
  Set @SQL1 = ''Set @YueRows =(select COUNT(*) from vMycarcomerecord where left(CardType,3)="Mth" and ''+ @str+'')'';
   Execute sp_executesql @SQL1, N''@YueRows int output'', @Yue output;
      End 
  Begin
  Set @SQL2 = ''Set @LinshiRows =(select COUNT(*) from vMycarcomerecord where left(CardType,3)="Tmp" and ''+ @str+'')'';
   Execute sp_executesql @SQL2, N''@LinshiRows int output'', @Linshi output;
      End
 Begin
  Set @SQL3 = ''Set @ChuZhiRows =(select COUNT(*) from vMycarcomerecord where left(CardType,3)="Str" and ''+ @str+'')'';
   Execute sp_executesql @SQL3, N''@ChuZhiRows int output'', @ChuZhi output;
      End 
 Begin
  Set @SQL4 = ''Set @MianFeiRows =(select COUNT(*) from vMycarcomerecord where left(CardType,3)="Fre" and ''+ @str+'')'';
   Execute sp_executesql @SQL4, N''@MianFeiRows int output'', @MianFei output;
      End 
' 
END
GO
/****** Object:  Table [dbo].[CarChargeScheme]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[CarChargeScheme]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[CarChargeScheme](
	[SchId] [int] IDENTITY(1,1) NOT NULL,
	[SchName] [varchar](50) NULL,
	[FieldName] [varchar](50) NULL,
	[Operators] [varchar](50) NULL,
	[Selectvalues] [varchar](50) NULL,
	[startime] [varchar](50) NULL,
	[endtime] [varchar](50) NULL,
 CONSTRAINT [PK__CarCharg__CAD9870B210D9095] PRIMARY KEY CLUSTERED 
(
	[SchId] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  StoredProcedure [dbo].[JJCCarCharge]    Script Date: 04/19/2016 18:05:56 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCCarCharge]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'

CREATE  PROCEDURE [dbo].[JJCCarCharge]
        @str  NVARCHAR(2500),        
        @IMONTH  INT=0 OUTPUT,
        @Qt  INT=0 OUTPUT,
        @Yue  INT=0 OUTPUT,
        @YueL  INT=0 OUTPUT,
        @Linshi  INT=0 OUTPUT,
        @ChuZhi  INT=0 OUTPUT,
        @MianFei  INT=0 OUTPUT,
        @Charge  MONEY OUTPUT,
        @PerSon  INT=0 OUTPUT
AS 
Declare @SQL as nvarchar(2500)
Declare @SQL1 as nvarchar(2500)
Declare @SQL2 as nvarchar(2500)
Declare @SQL3 as nvarchar(2500)
Declare @SQL4 as nvarchar(2500)
Declare @SQL5 as nvarchar(2500)
Declare @SQL6 as nvarchar(2500)
Declare @SQL7 as nvarchar(2500)
Declare @SQL8 as nvarchar(2500)
/*set @strsum=''select COUNT(*) from MYCARCOMERECORD where''+ @str*/
Begin
  Set @SQL = ''Set @Rows =(select COUNT(*) from VStatistics where ''+ @str+'')'';
    Execute sp_executesql @SQL, N''@Rows int output'', @IMONTH output;
     End 
Begin
/* or left(CardType,1)="բ" or left(CardType,1)="��" or left(CardType,1)="ˢ" */
  Set @SQL1 = ''Set @QtRows =(select COUNT(*) from VStatistics where (left(CardType,3)="Opt") and ''+ @str+'')'';
   Execute sp_executesql @SQL1, N''@QtRows int output'', @Qt output;
      End 
Begin
  Set @SQL2 = ''Set @YueRows =(select COUNT(*) from VStatistics where left(CardType,3)="Mth" and ''+ @str+'')'';
   Execute sp_executesql @SQL2, N''@YueRows int output'', @Yue output;
      End 
 Begin
  Set @SQL3 = ''Set @YueLRows =(select COUNT(*) from VStatistics where left(CardType,3)="Mtp" and ''+ @str+'')'';
   Execute sp_executesql @SQL3, N''@YueLRows int output'', @YueL output;
      End 
  Begin
  Set @SQL4 = ''Set @LinshiRows =(select COUNT(*) from VStatistics where SFGate!="�����շѴ�" and left(CardType,3)="Tmp" and ''+ @str+'')'';
   Execute sp_executesql @SQL4, N''@LinshiRows int output'', @Linshi output;
      End
 Begin
  Set @SQL5 = ''Set @ChuZhiRows =(select COUNT(*) from VStatistics where left(CardType,3)="Str" and ''+ @str+'')'';
   Execute sp_executesql @SQL5, N''@ChuZhiRows int output'', @ChuZhi output;
      End 
 Begin
  Set @SQL6 = ''Set @MianFeiRows =(select COUNT(*) from VStatistics where left(CardType,3)="Fre" and ''+ @str+'')'';
   Execute sp_executesql @SQL6, N''@MianFeiRows int output'', @MianFei output;
      End 
  Begin
  Set @SQL7 = ''Set @ChargeRows =(select sum(SFJE) from VStatistics where ''+ @str+'')'';
   Execute sp_executesql @SQL7, N''@ChargeRows MONEY output'', @Charge output;
      End  
        Begin
  Set @SQL8 = ''Set @PerSonRows =(select COUNT(*) from VStatistics where CardType="Person" and ''+ @str+'')'';
   Execute sp_executesql @SQL8, N''@PerSonRows int output'', @PerSon output;
      End  ' 
END
GO
/****** Object:  Table [dbo].[IssueScheme]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[IssueScheme]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[IssueScheme](
	[SchId] [int] IDENTITY(1,1) NOT NULL,
	[SchName] [varchar](50) NULL,
	[FieldName] [varchar](50) NULL,
	[Operators] [varchar](50) NULL,
	[Selectvalues] [varchar](50) NULL,
	[startime] [varchar](50) NULL,
	[endtime] [varchar](50) NULL,
 CONSTRAINT [PK__IssueSch__CAD9870B34206509] PRIMARY KEY CLUSTERED 
(
	[SchId] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO


SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[InParkScheme]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[InParkScheme]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[InParkScheme](
	[SchId] [int] IDENTITY(1,1) NOT NULL,
	[SchName] [varchar](50) NULL,
	[FieldName] [varchar](50) NULL,
	[Operators] [varchar](50) NULL,
	[Selectvalues] [varchar](50) NULL,
	[startime] [varchar](50) NULL,
	[endtime] [varchar](50) NULL,
 CONSTRAINT [PK__InParkSc__CAD9870B24DE2179] PRIMARY KEY CLUSTERED 
(
	[SchId] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  UserDefinedFunction [dbo].[HEXTOBIN1]    Script Date: 09/02/2013 15:59:50 ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[HEXTOBIN1]') AND xtype in (N'FN', N'IF', N'TF'))
BEGIN
execute dbo.sp_executesql @statement = N'
CREATE FUNCTION [dbo].[HEXTOBIN1] (@STRHEX VARCHAR(2000))
RETURNS VARCHAR(8000) AS
BEGIN
    DECLARE @STRTEMP AS CHAR(4)
    DECLARE @STRBIN AS VARCHAR(8000)
    DECLARE @I AS SMALLINT
 
    SET @STRBIN=''''
    SET @I=1
    WHILE @I<=LEN(@STRHEX)
        BEGIN
 	    SET @STRTEMP=
	    CASE SUBSTRING(@STRHEX,@I,1)
		WHEN ''0'' THEN ''0000'' 
		WHEN ''1'' THEN ''1000'' --''0001''
		WHEN ''2'' THEN ''0100'' --''0010''
		WHEN ''3'' THEN ''1100'' --''0011''
		WHEN ''4'' THEN ''0010'' --''0100''
		WHEN ''5'' THEN ''1010'' --''0101''
		WHEN ''6'' THEN ''0110'' --''0110''
		WHEN ''7'' THEN ''1110'' --''0111''
		WHEN ''8'' THEN ''0001'' --''1000''
		WHEN ''9'' THEN ''1001'' --''1001''
		WHEN ''A'' THEN ''0101'' --''1010''
		WHEN ''B'' THEN ''1101'' --''1011''
		WHEN ''C'' THEN ''0011'' --''1100''
		WHEN ''D'' THEN ''1011'' --''1101''
		WHEN ''E'' THEN ''0111'' --''1110''
		WHEN ''F'' THEN ''1111''
	    END
	    SET @STRBIN=@STRBIN+@STRTEMP
	    SET @I=@I+1
        END
    RETURN (@STRBIN)
END
' 
END
GO
/****** Object:  UserDefinedFunction [dbo].[HEXTOBIN]    Script Date: 09/02/2013 15:59:50 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[HEXTOBIN]') AND xtype in (N'FN', N'IF', N'TF'))
BEGIN
execute dbo.sp_executesql @statement = N'
CREATE FUNCTION [dbo].[HEXTOBIN] (@STRHEX VARCHAR(2000))
RETURNS VARCHAR(8000) AS
BEGIN
    DECLARE @STRTEMP AS CHAR(4)
    DECLARE @STRBIN AS VARCHAR(8000)
    DECLARE @I AS SMALLINT
    SET @STRBIN=''''
    SET @I=1
    WHILE @I<=LEN(@STRHEX)
        BEGIN
 	    SET @STRTEMP=
	    CASE SUBSTRING(@STRHEX,@I,1)
		WHEN ''0'' THEN ''0000''
		WHEN ''1'' THEN ''0001''
		WHEN ''2'' THEN ''0010''
		WHEN ''3'' THEN ''0011''
		WHEN ''4'' THEN ''0100''
		WHEN ''5'' THEN ''0101''
		WHEN ''6'' THEN ''0110''
		WHEN ''7'' THEN ''0111''
		WHEN ''8'' THEN ''1000''
		WHEN ''9'' THEN ''1001''
		WHEN ''A'' THEN ''1010''
		WHEN ''B'' THEN ''1011''
		WHEN ''C'' THEN ''1100''
		WHEN ''D'' THEN ''1101''
		WHEN ''E'' THEN ''1110''
		WHEN ''F'' THEN ''1111''
	    END
	    SET @STRBIN=@STRBIN+@STRTEMP
	    SET @I=@I+1
        END
    RETURN (@STRBIN)
END
' 
END
GO
/****** Object:  Table [dbo].[DoorMjRealTimeStauts]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DoorMjRealTimeStauts]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[DoorMjRealTimeStauts](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[DoorName] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO

/****** Object:  StoredProcedure [dbo].[cg_DoBackupDiffPc]    Script Date: 09/22/2013 11:02:09 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[cg_DoBackupDiffPc]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'CREATE   PROCEDURE [dbo].[cg_DoBackupDiffPc]

@FileHead     varchar(50),
@isFullBackup    bit,                    -- 0 ��������    1 ��������
@FolderPath     varchar(50)     = ''D:\�����ļ�\bak\'',
@BackName    varchar(100)    = ''unknown'',        -- �����ִ�
@isAppendMedia  bit        = 1            -- 0 ����ý��    1 ׷�ӵ�ý�� 
AS
declare @DataBaseName    varchar(100)
declare @filePath varchar(150)
declare @sql varchar(1000)

Select @DataBaseName= Name From Master.dbo.SysDataBases Where DbId=(Select Dbid From Master.dbo.SysProcesses Where Spid = @@spid)
--select  @FolderPath=LoadRoute from DBO.tbSystemDataBak
--- print @FolderPath

select @filePath=@FolderPath +  @FileHead + ''_'' + case @isFullBackup when 1 then ''FullBackup'' when 0 then ''DifferBackup'' end  + ''_'' +
replace(replace(replace(  convert( nvarchar(100) ,getdate() , 120 ),''-'',''''),'' '',''''),'':'','''')+''.bak''
+ case @isFullBackup when 1 then '''' when 0 then replace(convert(nvarchar(15),getdate(),114),'':'','''')+''.bak'' end
--print(@filePath)

select @sql =''BACKUP DATABASE ['' + @DataBaseName + ''] TO DISK = '''''' 
+ @filePath + ''''''  WITH ''
+  case @isAppendMedia when 0 then ''INIT'' when 1 then ''NOINIT'' end 
+ '' ,  NOUNLOAD , ''
+ case @isFullBackup when 0 then ''DIFFERENTIAL , '' when 1 then '''' end    
+ ''  NAME = N'''''' + @BackName + ''����'''',  NOSKIP ,  STATS = 10,  NOFORMAT''

execute(@sql)
PRINT ''��ϲ�����ݳɹ�!''' 
END
GO



/****** Object:  StoredProcedure [dbo].[cg_DoBackupJob]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[cg_DoBackupJob]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N' 

CREATE PROCEDURE [dbo].[cg_DoBackupJob]
    @DataBaseName    varchar(100),
    @FileHead     varchar(50),
    @isFullBackup    bit,                    -- 0 ��������    1 ��������
    @FolderPath     varchar(50)     = ''D:\db_backup_Bak\'',
    @BackName    varchar(100)    = ''unknown'',        -- �����ִ�
    @isAppendMedia  bit        = 1            -- 0 ����ý��    1 ׷�ӵ�ý�� 

AS
    declare @filePath varchar(150)
    declare @sql varchar(1000)
    
    
    select @filePath=@FolderPath +  @FileHead + ''_'' + case @isFullBackup when 1 then ''FullBackup'' when 0 then ''DifferBackup'' end  + ''_'' + convert ( nvarchar(11) ,getdate() , 112 ) 
        + case @isFullBackup when 1 then '''' when 0 then replace(convert(nvarchar(15),getdate(),114),'':'','''') end
    --print(@filePath)

    select @sql =''BACKUP DATABASE ['' + @DataBaseName + ''] TO DISK = '''''' 
        + @filePath + ''''''  WITH ''
        +  case @isAppendMedia when 0 then ''INIT'' when 1 then ''NOINIT'' end 
        + '' ,  NOUNLOAD , ''
        + case @isFullBackup when 0 then ''DIFFERENTIAL , '' when 1 then '''' end    
        + ''  NAME = N'''''' + @BackName + ''����'''',  NOSKIP ,  STATS = 10,  NOFORMAT''

    execute(@sql)
    --print(@sql)
' 
END
GO
/****** Object:  Table [dbo].[tblQuery]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[tblQuery]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[tblQuery](
	[Window] [nvarchar](50) NULL,
	[SaveName] [nvarchar](50) NULL,
	[ShowField_CN] [nvarchar](50) NULL,
	[ShowField_EN] [varchar](50) NULL,
	[RealField] [varchar](50) NULL,
	[OP] [nvarchar](20) NULL,
	[SearchValue] [nvarchar](50) NULL,
	[DataType] [varchar](50) NULL,
	[Selected] [tinyint] NULL,
	[CurrentShow] [tinyint] NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tblOpenType]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[tblOpenType]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[tblOpenType](
	[ID] [smallint] NULL,
	[OpenType] [nvarchar](20) NULL
) ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[tblConstant]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[tblConstant]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[tblConstant](
	[Types] [varchar](100) NULL,
	[OrderNO] [smallint] NULL,
	[Keys] [varchar](50) NULL,
	[Value] [varchar](150) NULL,
	[Flag] [tinyint] NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[SelectLossScheme]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[SelectLossScheme]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[SelectLossScheme](
	[SchId] [int] IDENTITY(1,1) NOT NULL,
	[SchName] [varchar](50) NULL,
	[FieldName] [varchar](50) NULL,
	[Operators] [varchar](50) NULL,
	[Selectvalues] [varchar](50) NULL,
	[startime] [varchar](50) NULL,
	[endtime] [varchar](50) NULL,
 CONSTRAINT [PK__SelectLo__CAD9870B2C7F4341] PRIMARY KEY CLUSTERED 
(
	[SchId] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MYMIANFEISHIYOU]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYMIANFEISHIYOU]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYMIANFEISHIYOU](
	[ItemID] [int] NULL,
	[ItemDetail] [varchar](100) NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYMIANFEISHIYOU]') AND name = N'IX_MYMIANFEISHIYOU')
CREATE CLUSTERED INDEX [IX_MYMIANFEISHIYOU] ON [dbo].[MYMIANFEISHIYOU] 
(
	[ItemID] ASC
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MYMENJINRECORD]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYMENJINRECORD]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYMENJINRECORD](
	[CtrlNumber] [int] NOT NULL,
	[CardNO] [varchar](30) NOT NULL,
	[OpenDoorTime] [datetime] NOT NULL,
	[CardType] [varchar](20) NOT NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYMENJINRECORD]') AND name = N'IX_MYMENJINRECORD')
CREATE NONCLUSTERED INDEX [IX_MYMENJINRECORD] ON [dbo].[MYMENJINRECORD] 
(
	[OpenDoorTime] DESC
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MYJIBENZILIAO]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYJIBENZILIAO]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYJIBENZILIAO](
	[UserNO] [varchar](10) NOT NULL,
	[UserName] [varchar](50) NULL,
	[Sex] [varchar](10) NULL,
	[HomeAddress] [varchar](200) NULL,
	[DeptName] [varchar](200) NULL,
	[Job] [varchar](200) NULL,
	[WorkTime] [datetime] NULL,
	[BirthDate] [datetime] NULL,
	[IDCard] [varchar](50) NULL,
	[MaritalStatus] [varchar](10) NULL,
	[HighestDegree] [varchar](50) NULL,
	[PoliticalStatus] [varchar](50) NULL,
	[PicPath] [varchar](256) NULL,
	[School] [varchar](50) NULL,
	[Speciality] [varchar](50) NULL,
	[ForeignLanguage] [varchar](20) NULL,
	[Skill] [varchar](50) NULL,
	[TelNumber] [varchar](40) NULL,
	[MobNumber] [varchar](40) NULL,
	[ZipCode] [varchar](30) NULL,
	[NativePlace] [varchar](200) NULL,
	[CPH] [varchar](20) NULL,
	[CarType] [varchar](50) NULL,
	[CarColor] [varchar](50) NULL,
	[CarPic] [varchar](256) NULL,
	[CarPlace] [varchar](100) NULL,
	[PersonPhoto] [image] NULL,
	[CarPhoto] [image] NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
 CONSTRAINT [PK_MYJIBENZILIAO] PRIMARY KEY NONCLUSTERED 
(
	[ID] ASC
) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[PostPoneScheme]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[PostPoneScheme]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[PostPoneScheme](
	[SchId] [int] IDENTITY(1,1) NOT NULL,
	[SchName] [varchar](50) NULL,
	[FieldName] [varchar](50) NULL,
	[Operators] [varchar](50) NULL,
	[Selectvalues] [varchar](50) NULL,
	[startime] [varchar](50) NULL,
	[endtime] [varchar](50) NULL,
 CONSTRAINT [PK__PostPone__CAD9870B304FD425] PRIMARY KEY CLUSTERED 
(
	[SchId] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[OptLog]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[OptLog]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[OptLog](
	[OptCardNO] [varchar](10) NULL,
	[UserName] [varchar](50) NULL,
	[OptMenu] [varchar](400) NULL,
	[OptContent] [varchar](2000) NULL,
	[PCName] [varchar](50) NULL,
	[OptTime] [datetime] NOT NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MYZBPARK]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYZBPARK]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYZBPARK](
	[CtrlNumber] [int] NOT NULL,
	[Location] [varchar](256) NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYZBPARK]') AND name = N'IX_MYZBPARK')
CREATE NONCLUSTERED INDEX [IX_MYZBPARK] ON [dbo].[MYZBPARK] 
(
	[CtrlNumber] ASC
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MYWORKSTATIONSET]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYWORKSTATIONSET]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYWORKSTATIONSET](
	[CompanyName] [varchar](100) NULL,
	[ComPort] [smallint] NULL,
	[CarparkZone] [int] NULL,
	[MJZone] [int] NULL,
	[ParkSectorEnable] [tinyint] NULL,
	[DoorSectorEnable] [tinyint] NULL,
	[MJType] [int] NULL,
	[SysConfig] [varchar](8) NULL,
	[SysSize] [smallint] NULL,
	[LoginType] [smallint] NULL,
	[PersonPicCatch] [tinyint] NULL,
	[FXMachine] [tinyint] NULL,
	[FXMachineID] [tinyint] NULL,
	[PCName] [varchar](50) NOT NULL,
	[CtrIP] [varchar](50) NULL,
	[Language] [varchar](50) NULL,
	[ComParkPort] [smallint] NULL,
	[MJPort] [smallint] NULL,
	[ComMode] [int] NULL,
	[AutotoCheMointor]  [bit] default (0)
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
if NOT EXISTS (select * from   syscolumns where name='Helpflag' and id=(select id from  sysobjects where name='MYWORKSTATIONSET')) 
alter table MYWORKSTATIONSET add  [Helpflag]  bit  default  1;
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYWORKSTATIONSET]') AND name = N'IX_MYWORKSTATIONSET')
CREATE NONCLUSTERED INDEX [IX_MYWORKSTATIONSET] ON [dbo].[MYWORKSTATIONSET] 
(
	[PCName] ASC
) ON [PRIMARY]
GO

/****** Object:  Table [dbo].[MYVideoSet]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYVideoSet]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYVideoSet](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[VideoIP] [nvarchar](50) NOT NULL,
	[VideoPort] [nvarchar](50) NOT NULL,
	[VideoUserName] [nvarchar](50) NOT NULL,
	[VideoPassWord] [nvarchar](50) NULL,
	[PCName] [nvarchar](50) NOT NULL,
	[VideoType] [nvarchar](50) NULL,
 CONSTRAINT [PK_MYVideoSet] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[MYTEMPISSUE]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYTEMPISSUE]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYTEMPISSUE](
	[CardNO] [varchar](30) NOT NULL,
	[TempID] [varchar](30) NULL,
	[CardState] [char](1) NULL,
	[IssueDate] [datetime] NULL,
	[IssueUserCard] [varchar](30) NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MYTBMEISHUOSET]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYTBMEISHUOSET]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYTBMEISHUOSET](
	[CtrlNumber] [int] NOT NULL,
	[LockLocation] [varchar](100) NULL,
	[DeptName] [varchar](100) NULL,
	[DoorID] [varchar](50) NULL,
	[PCName] [varchar](100) NULL,
	[ProduceIndex] [varchar](50) NULL,
	[CtrlType] [varchar](50) NULL,
 CONSTRAINT [PK_MYTBMEISHUOSET] PRIMARY KEY NONCLUSTERED 
(
	[CtrlNumber] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MYSurplusCarScreen]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYSurplusCarScreen]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYSurplusCarScreen](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[CtrID] [int] NOT NULL,
	[SurplusID] [varchar](50) NOT NULL,
	[Speed] [varchar](50) NOT NULL,
	[StopTime] [varchar](50) NOT NULL,
	[Color] [varchar](50) NOT NULL,
	[SumTime] [varchar](50) NOT NULL,
	[PCName] [varchar](50) NOT NULL,
	[CPHEndStr] [varchar](255) NULL,
	[ShowWay] [varchar](50) NOT NULL,
	[Move] [varchar](50) NOT NULL,
	[Pattern] [varchar](50) NULL,
 CONSTRAINT [PK_MYSurplusCarScreen] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MYSQLNAMEPEIZHI]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYSQLNAMEPEIZHI]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYSQLNAMEPEIZHI](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[EN_Name] [nvarchar](50) NOT NULL,
	[CH_Name] [nvarchar](50) NOT NULL,
	[Type] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_MYSQLNAMEPEIZHI] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[MYSHOUFEIGUANGZOU]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYSHOUFEIGUANGZOU]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYSHOUFEIGUANGZOU](
	[CardType] [varchar](10) NOT NULL,
	[FreeMark] [int] NULL,
	[FreeTime] [int] NULL,
	[SFCycle] [int] NULL,
	[TimePeriod] [int] NULL,
	[WithinPeriodSF] [money] NULL,
	[WithoutPeriodSF] [money] NULL,
 CONSTRAINT [PK_MYSHOUFEIGUANGZOU] PRIMARY KEY NONCLUSTERED 
(
	[CardType] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MYRECORDQUERY]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYRECORDQUERY]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYRECORDQUERY](
    [ID] [bigint] IDENTITY(1,1) NOT NULL,
	[CardNO] [varchar](30) NOT NULL,
	[CPH] [varchar](20) NULL,
	[CardType] [varchar](20) NULL,
	[InTime] [datetime] NULL,
	[OutTime] [datetime] NULL,
	[InGateName] [varchar](100) NULL,
	[OutGateName] [varchar](100) NULL,
	[InOperatorCard] [varchar](30) NULL,
	[OutOperatorCard] [varchar](30) NULL,
	[InOperator] [varchar](50) NULL,
	[OutOperator] [varchar](50) NULL,
	[InPic] [varchar](255) NULL,
	[InUser] [varchar](255) NULL,
	[OutPic] [varchar](255) NULL,
	[OutUser] [varchar](255) NULL,
	[ZJPic] [varchar](255) NULL,
	[SFJE] [money] NULL,
	[Balance] [money] NULL,
	[YSJE] [money] NULL,
	[SFTime] [datetime] NULL,
	[SFOperator] [varchar](50) NULL,
	[SFOperatorCard] [varchar](30) NULL,
	[SFGate] [varchar](100) NULL,
	[OvertimeSymbol] [varchar](10) NULL,
	[OvertimeSFTime] [datetime] NULL,
	[OvertimeSFJE] [money] NULL,
	[CarparkNO] [int] NULL,
	[BigSmall] [int] NULL,
	[FreeReason] [varchar](100) NULL,
	[StayTime] [varchar](30) NULL,
	[Temp1] [varchar](50) NULL,
	[Temp2] [varchar](50) NULL,
	[Temp3] [varchar](50) NULL,
	[Temp4] [varchar](50) NULL,
	[Temp5] [varchar](50) NULL
) ON [PRIMARY]
END
GO
--�೵λ�೵��¼
if NOT EXISTS (select * from   syscolumns where name='bMorePaingCar' and id=(select id from  sysobjects where name='MYRECORDQUERY')) 
BEGIN
alter table MYRECORDQUERY add  bMorePaingCar  bit  default  0;
END
GO
--�Ƿ�Ϊ���ۼ�¼
if NOT EXISTS (select * from   syscolumns where name='bDZ' and id=(select id from  sysobjects where name='MYRECORDQUERY')) 
BEGIN
alter table MYRECORDQUERY add  bDZ  bit  default  0;
END
GO
--�Ƿ�Ϊ���ۼ�¼ԭ��
if NOT EXISTS (select * from syscolumns where name='strDZ' and id=(select id from  sysobjects where name='MYRECORDQUERY')) 
BEGIN
	ALTER TABLE MYRECORDQUERY ADD strDZ varchar(500) null
END
GO
SET ANSI_PADDING OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYRECORDQUERY]') AND name = N'IX_MYRECORDQUERY')
CREATE NONCLUSTERED INDEX [IX_MYRECORDQUERY] ON [dbo].[MYRECORDQUERY] 
(
	[OutTime] DESC
) ON [PRIMARY]
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYRECORDQUERY]') AND name = N'IX_MYRECORDQUERY_1')
CREATE NONCLUSTERED INDEX [IX_MYRECORDQUERY_1] ON [dbo].[MYRECORDQUERY] 
(
	[InTime] DESC
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MYRECORDMEMORY]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYRECORDMEMORY]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYRECORDMEMORY](
    [ID] [bigint] IDENTITY(1,1) NOT NULL,
	[CardNO] [varchar](30) NOT NULL,
	[CPH] [varchar](20) NULL,
	[CardType] [varchar](20) NULL,
	[InTime] [datetime] NULL,
	[OutTime] [datetime] NULL,
	[InGateName] [varchar](100) NULL,
	[OutGateName] [varchar](100) NULL,
	[InOperatorCard] [varchar](30) NULL,
	[OutOperatorCard] [varchar](30) NULL,
	[InOperator] [varchar](50) NULL,
	[OutOperator] [varchar](50) NULL,
	[InPic] [varchar](255) NULL,
	[InUser] [varchar](255) NULL,
	[OutPic] [varchar](255) NULL,
	[OutUser] [varchar](255) NULL,
	[ZJPic] [varchar](255) NULL,
	[SFJE] [money] NULL,
	[Balance] [money] NULL,
	[YSJE] [money] NULL,
	[SFTime] [datetime] NULL,
	[SFOperator] [varchar](50) NULL,
	[SFOperatorCard] [varchar](30) NULL,
	[SFGate] [varchar](100) NULL,
	[OvertimeSymbol] [varchar](10) NULL,
	[OvertimeSFTime] [datetime] NULL,
	[OvertimeSFJE] [money] NULL,
	[CarparkNO] [int] NULL,
	[BigSmall] [int] NULL,
	[FreeReason] [varchar](100) NULL,
	[StayTime] [varchar](30) NULL,
	[Temp1] [varchar](50) NULL,
	[Temp2] [varchar](50) NULL,
	[Temp3] [varchar](50) NULL,
	[Temp4] [varchar](50) NULL,
	[Temp5] [varchar](50) NULL
) ON [PRIMARY]
END
GO
--�೵λ�೵��¼
if NOT EXISTS (select * from   syscolumns where name='bMorePaingCar' and id=(select id from  sysobjects where name='MYRECORDMEMORY')) 
BEGIN
alter table MYRECORDMEMORY add  bMorePaingCar  bit  default  0;
END
GO
--�Ƿ�Ϊ���ۼ�¼
if NOT EXISTS (select * from   syscolumns where name='bDZ' and id=(select id from  sysobjects where name='MYRECORDMEMORY')) 
BEGIN
alter table MYRECORDMEMORY add  bDZ  bit  default  0;
END
GO
--�Ƿ�Ϊ���ۼ�¼ԭ��
if NOT EXISTS (select * from syscolumns where name='strDZ' and id=(select id from  sysobjects where name='MYRECORDMEMORY')) 
BEGIN
	ALTER TABLE MYRECORDMEMORY ADD strDZ varchar(500) null
END
GO
SET ANSI_PADDING OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYRECORDMEMORY]') AND name = N'IX_MYRECORDMEMORY')
CREATE NONCLUSTERED INDEX [IX_MYRECORDMEMORY] ON [dbo].[MYRECORDMEMORY] 
(
	[OutTime] DESC
) ON [PRIMARY]
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYRECORDMEMORY]') AND name = N'IX_MYRECORDMEMORY_1')
CREATE NONCLUSTERED INDEX [IX_MYRECORDMEMORY_1] ON [dbo].[MYRECORDMEMORY] 
(
	[InTime] DESC
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MYQUANXIANSET]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYQUANXIANSET]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYQUANXIANSET](
	[FormName] [varchar](100) NOT NULL,
	[MenuName] [varchar](50) NOT NULL,
	[MenuText] [varchar](50) NOT NULL,
	[ValidMark] [varchar](2500) NOT NULL,
	[KEYVALUE] [varchar](20) NOT NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYQUANXIANSET]') AND name = N'IX_MYQUANXIANSET')
CREATE NONCLUSTERED INDEX [IX_MYQUANXIANSET] ON [dbo].[MYQUANXIANSET] 
(
	[FormName] ASC
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MYPrint]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYPrint]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYPrint](
	[Title] [nvarchar](100) NULL,
	[FTitle] [nvarchar](200) NULL,
	[Footer] [nvarchar](500) NULL
) ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[MYPHOTOIMAGE]    Script Date: 09/02/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYPHOTOIMAGE]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYPHOTOIMAGE](
	[PicIndex] [varchar](30) NOT NULL,
	[PicTime] [datetime] NOT NULL,
	[PicContent] [image] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysindexes WHERE id = OBJECT_ID(N'[dbo].[MYPHOTOIMAGE]') AND name = N'IX_MYPHOTOIMAGE')
CREATE CLUSTERED INDEX [IX_MYPHOTOIMAGE] ON [dbo].[MYPHOTOIMAGE] 
(
	[PicTime] DESC
) ON [PRIMARY]
GO
/****** Object:  UserDefinedFunction [dbo].[VALIDNO2]    Script Date: 09/02/2013 15:59:50 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[VALIDNO2]') AND xtype in (N'FN', N'IF', N'TF'))
BEGIN
execute dbo.sp_executesql @statement = N'
CREATE FUNCTION [dbo].[VALIDNO2] (@STRHEX VARCHAR(2000))  
RETURNS VARCHAR(8000) AS  
BEGIN 
DECLARE @I AS SMALLINT	
DECLARE @STRTEMP AS VARCHAR(256)
DECLARE @STRBIN AS VARCHAR(8000)	
DECLARE @STRVALID AS VARCHAR(8000)
SET @STRBIN=DBO.HEXTOBIN(@STRHEX)	
SET @STRVALID=''''		
SET @I=1
WHILE @I<=LEN(@STRBIN)
BEGIN
  SET @STRTEMP=''''			
  IF SUBSTRING(@STRBIN,@I,1)=''0''
  SELECT @STRTEMP=LTRIM(RTRIM(ISNULL(DoorID,'''')))+''/'' FROM MYTBMEISHUOSET WHERE CtrlNumber=@I
  SET @STRVALID=@STRVALID+@STRTEMP
  SET @I=@I+1
END
RETURN (@STRVALID)		
END
' 
END
GO
/****** Object:  UserDefinedFunction [dbo].[VALIDNO1]    Script Date: 09/02/2013 15:59:50 ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[VALIDNO1]') AND xtype in (N'FN', N'IF', N'TF'))
BEGIN
execute dbo.sp_executesql @statement = N'
CREATE FUNCTION [dbo].[VALIDNO1] (@STRHEX VARCHAR(2000))  
RETURNS VARCHAR(8000) AS  
BEGIN 
    DECLARE @I AS SMALLINT	
    DECLARE @STRBIN AS VARCHAR(8000)	
    DECLARE @STRVALID AS VARCHAR(8000)
    SET @STRBIN=DBO.HEXTOBIN(@STRHEX)	
    SET @STRVALID=''''		
    SET @I=1
    WHILE @I<=LEN(@STRBIN)
	BEGIN
	    IF SUBSTRING(@STRBIN,@I,1)=''1''
              SET @STRVALID=@STRVALID+RTRIM(@I)+'' ''
	      SET @I=@I+1
	END
    RETURN (@STRVALID)		
END
' 
END
GO
/****** Object:  UserDefinedFunction [dbo].[VALIDNO]    Script Date: 09/02/2013 15:59:50 ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[VALIDNO]') AND xtype in (N'FN', N'IF', N'TF'))
BEGIN
execute dbo.sp_executesql @statement = N'
CREATE  FUNCTION [dbo].[VALIDNO] (@STRHEX VARCHAR(2000),@CARDNO VARCHAR(10)='''') 
RETURNS VARCHAR(8000) AS  
BEGIN 
    DECLARE @I AS SMALLINT	
    DECLARE @STRTEMP AS VARCHAR(256)
    DECLARE @STRBIN AS VARCHAR(8000)	
    DECLARE @STRVALID AS VARCHAR(8000)
    IF LEN(LTRIM(RTRIM(@CARDNO)))<=8		
	BEGIN
	    SET @STRBIN=DBO.HEXTOBIN(@STRHEX)	
	    SET @STRVALID=''''		
	    SET @I=1
	    WHILE @I<=LEN(@STRBIN)
		BEGIN			
		    IF SUBSTRING(@STRBIN,@I,1)=''0''
	                   SET @STRVALID=@STRVALID+RTRIM(@I)+'' ''
	                   SET @I=@I+1
		END	
	END
    ELSE			
	BEGIN
	    SET @STRBIN=@STRHEX	
	    SET @STRVALID=''''		
	    SET @I=0
	    WHILE @I<=LEN(@STRBIN)
		BEGIN			
		    IF SUBSTRING(@STRBIN,@I+1,1)=''1''
	                   SET @STRVALID=@STRVALID+RTRIM(@I)+'' ''
	                   SET @I=@I+1
		END
	
	END
RETURN (@STRVALID)		
END
      
' 
END
GO
/****** Object:  StoredProcedure [dbo].[MYMJICSTATUSS]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYMJICSTATUSS]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE   PROCEDURE [dbo].[MYMJICSTATUSS] AS
             IF  EXISTS(SELECT * FROM  MYICIDSTATUS  )
                 RETURN 
              ELSE                   
                 BEGIN
					INSERT INTO MYICIDSTATUS
					VALUES(''WaitforLossReg'',''1'')
			
					INSERT INTO MYICIDSTATUS
					VALUES(''LossReg'',''2'')
					INSERT INTO MYICIDSTATUS
					VALUES(''WaitforLossUnReg'',''3'')
					INSERT INTO MYICIDSTATUS
					VALUES(''LossUnReg'',''4'')
                     
                 END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[MYINITCAOZUOYUAN]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYINITCAOZUOYUAN]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE     PROCEDURE [dbo].[MYINITCAOZUOYUAN] AS
IF NOT EXISTS(SELECT TOP 1 * FROM MYCAOZUOYUAN WHERE LTRIM(CardNO)=''888888'' )
BEGIN
   INSERT INTO MYCAOZUOYUAN (CardNO,CardType,UserNO,UserName,Pwd,CardState) VALUES (''888888'',''��������Ա'',''888888'',''����Ա'','''',0)
END
IF NOT EXISTS(SELECT * FROM MYJIBENZILIAO WHERE UserNO=''888888'')
BEGIN
   INSERT INTO MYJIBENZILIAO(UserNO,UserName,DeptName) VALUES(''888888'',''����Ա'',''����'')
END
' 
END
GO
/****** Object:  View [dbo].[MJ_Recoredsview]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MJ_Recoredsview]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'create view  [dbo].[MJ_Recoredsview]
as
select * from M_Records
union all
select * from M_Rrecords_Filer'
GO
/****** Object:  StoredProcedure [dbo].[JJCMJCARDLOST]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCMJCARDLOST]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE  PROCEDURE [dbo].[JJCMJCARDLOST]
@LSSURE AS INT
 AS
IF @LSSURE=1
	BEGIN
		SELECT * FROM DBO.MYICLOST ,DBO.MYFAXINGSSUE
		WHERE DBO.MYICLOST.CardState=''1'' AND DBO.MYICLOST.MJLostOKNO=0 AND
		      DBO.MYICLOST.CardNO=DBO.MYFAXINGSSUE.CardNO AND RIGHT(LEFT(DBO.MYFAXINGSSUE.SubSystem,2),1)=''1''
	END
ELSE IF @LSSURE=2
	BEGIN
		SELECT * FROM DBO.MYICLOST ,DBO.MYFAXINGSSUE
		WHERE DBO.MYICLOST.CardState=''3'' AND DBO.MYICLOST.MJUnLostOKNO=0 AND 
                      DBO.MYICLOST.CardNO=DBO.MYFAXINGSSUE.CardNO AND RIGHT(LEFT(DBO.MYFAXINGSSUE.SubSystem,2),1)=''1''
	END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[JJCLEARALLDATA]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCLEARALLDATA]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE PROCEDURE [dbo].[JJCLEARALLDATA]
                @FDATE DATETIME ,
	        @EDATE DATETIME,
	        @FLAG INT,
                @COMPUTER VARCHAR(50)
 AS
 IF @FLAG=0
    BEGIN
	TRUNCATE TABLE MYCARCOMERECORD
	TRUNCATE TABLE MYCARGOOUTRECORD
	DELETE FROM    MYCOMPUTERSET       WHERE PCName=@COMPUTER
	DELETE FROM    MYCHECHANGXITONGSET WHERE PCName=@COMPUTER
	TRUNCATE TABLE MYRECORDMEMORY
        TRUNCATE TABLE MYCHECHANGNORMALSHOUFEI
        TRUNCATE TABLE MYSHOUFEIGUANGZOU
        DELETE FROM    MYGANGWEIKOUSET WHERE PCName=@COMPUTER
        DELETE FROM    MYCHECHANGPASS  WHERE PCName=@COMPUTER        
    END
 IF @FLAG=1
    BEGIN
	DELETE FROM MYCARCOMERECORD  WHERE InTime BETWEEN @FDATE AND @EDATE
	DELETE FROM MYCARGOOUTRECORD WHERE InTime BETWEEN @FDATE AND @EDATE
        DELETE FROM MYRECORDMEMORY   WHERE InTime BETWEEN @FDATE AND @EDATE	
    END
 IF @FLAG=2
    BEGIN
	DELETE FROM MYCARCOMERECORD WHERE InTime BETWEEN @FDATE AND @EDATE
    END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[JJCINITZB]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCINITZB]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE        PROCEDURE [dbo].[JJCINITZB] AS
TRUNCATE TABLE MYFAXINGSSUE
TRUNCATE TABLE MYICMONEY
TRUNCATE TABLE MYICVALID
TRUNCATE TABLE MYICLOST
TRUNCATE TABLE MYCAOZUOYUAN
TRUNCATE TABLE MYZBPARK
TRUNCATE TABLE MYJIBENZILIAO
TRUNCATE TABLE MYBUMENSET
TRUNCATE TABLE MYQUANXIANSET
TRUNCATE TABLE MYCOMPUTERSET
TRUNCATE TABLE MYTBMEISHUOSET
TRUNCATE TABLE MYGANGWEIKOUSET
TRUNCATE TABLE MYWORKSTATIONSET
TRUNCATE TABLE MYCHECHANGXITONGSET
TRUNCATE TABLE MYCHECHANGPASS
TRUNCATE TABLE MYCHECHANGNORMALSHOUFEI
TRUNCATE TABLE MYSHOUFEIGUANGZOU
TRUNCATE TABLE MYMENJINRECORD
TRUNCATE TABLE MYCARGOOUTRECORD
TRUNCATE TABLE MYCARCOMERECORD
TRUNCATE TABLE MYRECORDMEMORY
TRUNCATE TABLE MYRECORDQUERY
TRUNCATE TABLE MYCARGOOUTRECORDREPORT
TRUNCATE TABLE MYMIANFEISHIYOU 
' 
END
GO
/****** Object:  View [dbo].[VMYFAXINGSSUEType]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[VMYFAXINGSSUEType]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'CREATE VIEW [dbo].[VMYFAXINGSSUEType]
AS
SELECT     dbo.MYCardType.CardType AS CarCardType, dbo.MYFAXINGSSUE.UserNO, dbo.MYFAXINGSSUE.CardState, dbo.MYFAXINGSSUE.CardYJ, 
                      dbo.MYFAXINGSSUE.SubSystem, dbo.MYFAXINGSSUE.CarIssueDate, dbo.MYFAXINGSSUE.CarIssueUserCard, dbo.MYFAXINGSSUE.Balance, 
                      dbo.MYFAXINGSSUE.CardNO, dbo.MYFAXINGSSUE.CarValidStartDate, dbo.MYFAXINGSSUE.CarValidEndDate, dbo.MYFAXINGSSUE.CPH, 
                      dbo.MYFAXINGSSUE.CarColor, dbo.MYFAXINGSSUE.CarType, dbo.MYFAXINGSSUE.CarPlace, dbo.MYFAXINGSSUE.CarWithdrawCardDate, 
                      dbo.MYFAXINGSSUE.CarWithdrawOptCard, dbo.MYFAXINGSSUE.CarValidMachine, dbo.MYFAXINGSSUE.CarValidZone, dbo.MYFAXINGSSUE.CarMemo,
                       dbo.MYFAXINGSSUE.MJCardType, dbo.MYFAXINGSSUE.MJIssueDate, dbo.MYFAXINGSSUE.MJIssueUserCard, dbo.MYFAXINGSSUE.MJEndDate, 
                      dbo.MYFAXINGSSUE.MJValidStartTime, dbo.MYFAXINGSSUE.MJValidEndTime, dbo.MYFAXINGSSUE.MJValidMachine, 
                      dbo.MYFAXINGSSUE.MJWithdrawCardDate, dbo.MYFAXINGSSUE.MJWithdrawOptCard, dbo.MYFAXINGSSUE.MJMemo, 
                      dbo.MYFAXINGSSUE.IssueDate, dbo.MYFAXINGSSUE.WithdrawDate, dbo.MYFAXINGSSUE.IssueUserCard, dbo.MYFAXINGSSUE.WithdrawUserCard, 
                      dbo.MYFAXINGSSUE.LossregDate, dbo.MYFAXINGSSUE.LossregUserCard, dbo.MYFAXINGSSUE.CardIDNO, dbo.MYFAXINGSSUE.DownloadSignal, 
                      dbo.MYFAXINGSSUE.CarPic, dbo.MYFAXINGSSUE.CarPhoto, dbo.MYFAXINGSSUE.ID, dbo.MYFAXINGSSUE.CarCardType AS CardType, 
                      dbo.MYFAXINGSSUE.Tempnumber, dbo.MYFAXINGSSUE.TimeTeam, dbo.MYFAXINGSSUE.HolidayLimited, dbo.MYFAXINGSSUE.UserInfo
FROM         dbo.MYCardType INNER JOIN
                      dbo.MYFAXINGSSUE ON dbo.MYCardType.Identifying = dbo.MYFAXINGSSUE.CarCardType
'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPane1' , N'USER',N'dbo', N'VIEW',N'VMYFAXINGSSUEType', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[40] 4[20] 2[20] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "MYCardType"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 212
               Right = 172
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "MYFAXINGSSUE"
            Begin Extent = 
               Top = 6
               Left = 210
               Bottom = 178
               Right = 559
            End
            DisplayFlags = 280
            TopColumn = 44
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 1920
         Table = 2295
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'VMYFAXINGSSUEType'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPaneCount' , N'USER',N'dbo', N'VIEW',N'VMYFAXINGSSUEType', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'VMYFAXINGSSUEType'
GO
/****** Object:  View [dbo].[VMYFAXINGSSUE]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[VMYFAXINGSSUE]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'CREATE VIEW [dbo].[VMYFAXINGSSUE]
AS
SELECT     dbo.MYFAXINGSSUE.CardNO, dbo.MYFAXINGSSUE.UserNO, dbo.MYFAXINGSSUE.CardState, dbo.MYFAXINGSSUE.CardYJ, 
                      dbo.MYFAXINGSSUE.SubSystem, dbo.MYFAXINGSSUE.CarIssueDate, dbo.MYFAXINGSSUE.CarIssueUserCard, dbo.MYFAXINGSSUE.Balance, 
                      dbo.MYFAXINGSSUE.CarValidStartDate, dbo.MYFAXINGSSUE.CarValidEndDate, dbo.MYFAXINGSSUE.CPH, dbo.MYFAXINGSSUE.CarColor, 
                      dbo.MYFAXINGSSUE.CarType, dbo.MYFAXINGSSUE.CarPlace, dbo.MYFAXINGSSUE.CarWithdrawCardDate, dbo.MYFAXINGSSUE.CarWithdrawOptCard, 
                      dbo.MYFAXINGSSUE.CarValidMachine, dbo.MYFAXINGSSUE.CarValidZone, dbo.MYFAXINGSSUE.CarMemo, dbo.MYFAXINGSSUE.MJIssueDate, 
                      dbo.MYFAXINGSSUE.MJIssueUserCard, dbo.MYFAXINGSSUE.MJEndDate, dbo.MYFAXINGSSUE.MJValidStartTime, 
                      dbo.MYFAXINGSSUE.MJValidEndTime, dbo.MYFAXINGSSUE.MJValidMachine, dbo.MYFAXINGSSUE.MJWithdrawCardDate, 
                      dbo.MYFAXINGSSUE.MJWithdrawOptCard, dbo.MYFAXINGSSUE.MJMemo, dbo.MYFAXINGSSUE.IssueDate, dbo.MYFAXINGSSUE.WithdrawDate, 
                      dbo.MYFAXINGSSUE.IssueUserCard, dbo.MYFAXINGSSUE.WithdrawUserCard, dbo.MYFAXINGSSUE.LossregDate, 
                      dbo.MYFAXINGSSUE.LossregUserCard, dbo.MYFAXINGSSUE.CardIDNO, dbo.MYFAXINGSSUE.DownloadSignal, dbo.MYFAXINGSSUE.CarPic, 
                      dbo.MYFAXINGSSUE.CarPhoto, dbo.MYFAXINGSSUE.ID, ISNULL(dbo.MYJIBENZILIAO.UserName, '''') AS UserName, 
                      ISNULL(dbo.MYJIBENZILIAO.DeptName, '''') AS DeptName, dbo.MYJIBENZILIAO.PersonPhoto, dbo.MYCardType.CardType AS CarCardType, 
                      dbo.MYFAXINGSSUE.CarCardType AS CardType, dbo.MYFAXINGSSUE.Tempnumber, dbo.MYFAXINGSSUE.TimeTeam, 
                      dbo.MYFAXINGSSUE.HolidayLimited, dbo.MYFAXINGSSUE.UserInfo, dbo.MYFAXINGSSUE.CaRFailOKNO, dbo.MYFAXINGSSUE.CarFailID, 
                      dbo.MYFAXINGSSUE.CardIdLossState, dbo.MYFAXINGSSUE.BackCardNum, dbo.M_CardType.carCname AS MJCardType, dbo.MYFAXINGSSUE.CardLossMachine
FROM         dbo.MYFAXINGSSUE INNER JOIN
                      dbo.MYCardType ON dbo.MYFAXINGSSUE.CarCardType = dbo.MYCardType.Identifying INNER JOIN
                      dbo.M_CardType ON dbo.MYFAXINGSSUE.MJCardType = dbo.M_CardType.carid LEFT OUTER JOIN
                      dbo.MYJIBENZILIAO ON dbo.MYFAXINGSSUE.UserNO = dbo.MYJIBENZILIAO.UserNO
'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPane1' , N'USER',N'dbo', N'VIEW',N'VMYFAXINGSSUE', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[29] 4[33] 2[20] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "MYFAXINGSSUE"
            Begin Extent = 
               Top = 15
               Left = 175
               Bottom = 280
               Right = 365
            End
            DisplayFlags = 280
            TopColumn = 16
         End
         Begin Table = "MYCardType"
            Begin Extent = 
               Top = 12
               Left = 16
               Bottom = 127
               Right = 150
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "MYJIBENZILIAO"
            Begin Extent = 
               Top = 14
               Left = 468
               Bottom = 129
               Right = 632
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "M_CardType"
            Begin Extent = 
               Top = 169
               Left = 448
               Bottom = 284
               Right = 582
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 3615
         Alias = 1635
         Table = 2655
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'VMYFAXINGSSUE'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPaneCount' , N'USER',N'dbo', N'VIEW',N'VMYFAXINGSSUE', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'VMYFAXINGSSUE'
GO



--2017-04-01 add ZipCode
--2017-11-09 add dbo.MYJIBENZILIAO.HomeAddress
ALTER VIEW [dbo].[VMYFAXINGSSUE]
AS
SELECT     dbo.MYFAXINGSSUE.CardNO, dbo.MYFAXINGSSUE.UserNO, dbo.MYFAXINGSSUE.CardState, dbo.MYFAXINGSSUE.CardYJ, 
                      dbo.MYFAXINGSSUE.SubSystem, dbo.MYFAXINGSSUE.CarIssueDate, dbo.MYFAXINGSSUE.CarIssueUserCard, dbo.MYFAXINGSSUE.Balance, 
                      dbo.MYFAXINGSSUE.CarValidStartDate, dbo.MYFAXINGSSUE.CarValidEndDate, dbo.MYFAXINGSSUE.CPH, dbo.MYFAXINGSSUE.CarColor, 
                      dbo.MYFAXINGSSUE.CarType, dbo.MYFAXINGSSUE.CarPlace, dbo.MYFAXINGSSUE.CarWithdrawCardDate, dbo.MYFAXINGSSUE.CarWithdrawOptCard, 
                      dbo.MYFAXINGSSUE.CarValidMachine, dbo.MYFAXINGSSUE.CarValidZone, dbo.MYFAXINGSSUE.CarMemo, dbo.MYFAXINGSSUE.MJIssueDate, 
                      dbo.MYFAXINGSSUE.MJIssueUserCard, dbo.MYFAXINGSSUE.MJEndDate, dbo.MYFAXINGSSUE.MJValidStartTime, 
                      dbo.MYFAXINGSSUE.MJValidEndTime, dbo.MYFAXINGSSUE.MJValidMachine, dbo.MYFAXINGSSUE.MJWithdrawCardDate, 
                      dbo.MYFAXINGSSUE.MJWithdrawOptCard, dbo.MYFAXINGSSUE.MJMemo, dbo.MYFAXINGSSUE.IssueDate, dbo.MYFAXINGSSUE.WithdrawDate, 
                      dbo.MYFAXINGSSUE.IssueUserCard, dbo.MYFAXINGSSUE.WithdrawUserCard, dbo.MYFAXINGSSUE.LossregDate, 
                      dbo.MYFAXINGSSUE.LossregUserCard, dbo.MYFAXINGSSUE.CardIDNO, dbo.MYFAXINGSSUE.DownloadSignal, dbo.MYFAXINGSSUE.CarPic, 
                      dbo.MYFAXINGSSUE.CarPhoto, dbo.MYFAXINGSSUE.ID, ISNULL(dbo.MYJIBENZILIAO.UserName, '') AS UserName, 
                      ISNULL(dbo.MYJIBENZILIAO.DeptName, '') AS DeptName, dbo.MYJIBENZILIAO.PersonPhoto,dbo.MYJIBENZILIAO.ZipCode, dbo.MYCardType.CardType AS CarCardType, 
                      dbo.MYFAXINGSSUE.CarCardType AS CardType, dbo.MYFAXINGSSUE.Tempnumber, dbo.MYFAXINGSSUE.TimeTeam, 
                      dbo.MYFAXINGSSUE.HolidayLimited, dbo.MYFAXINGSSUE.UserInfo, dbo.MYFAXINGSSUE.CaRFailOKNO, dbo.MYFAXINGSSUE.CarFailID, 
                      dbo.MYFAXINGSSUE.CardIdLossState, dbo.MYFAXINGSSUE.BackCardNum, dbo.M_CardType.carCname AS MJCardType,
                      dbo.MYFAXINGSSUE.MjEnabSysHoliday,dbo.MYFAXINGSSUE.MJBeginDate,dbo.MYFAXINGSSUE.MJJureTeam,dbo.MYFAXINGSSUE.CardLossMachine, 
                      dbo.MYFAXINGSSUE.DownLoadState, dbo.MYFAXINGSSUE.MjPassword, dbo.MYFAXINGSSUE.MonthType, dbo.MYJIBENZILIAO.HomeAddress
FROM         dbo.MYFAXINGSSUE INNER JOIN
                      dbo.MYCardType ON dbo.MYFAXINGSSUE.CarCardType = dbo.MYCardType.Identifying INNER JOIN
                      dbo.M_CardType ON dbo.MYFAXINGSSUE.MJCardType = dbo.M_CardType.carid LEFT OUTER JOIN
                      dbo.MYJIBENZILIAO ON dbo.MYFAXINGSSUE.UserNO = dbo.MYJIBENZILIAO.UserNO


GO


/****** Object:  View [dbo].[vMYCHECHANGXITONGSET]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[vMYCHECHANGXITONGSET]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'CREATE VIEW [dbo].[vMYCHECHANGXITONGSET]
AS
SELECT     StationNO AS ��ͤ���, CarparkNO AS �������, HasImage AS ����ͼ��, ImageSave AS ͼ�����, SaveDays AS ��������, ImagePath AS ͼ��·��, 
                      TotalCarSpace AS �ܳ�λ��, CarSpaceScreen AS ��λ����, CarSpaceScreenNumber AS ��������, CarSpaceScreenCom AS ��������, 
                      FullSpaceLight AS ��λ����, FullSpaceLightNumber AS ��λ����, FullSpaceLightCom AS ��λ����, MoneyScreen AS �շ�����, 
                      MoneyScreenCom AS ��������, BillPrint AS Ʊ�ݴ�ӡ, Monitor01 AS ��ؿں�01, Monitor02 AS ��ؿں�02, FreeCarOK AS ������ѳ�, 
                      TempFreeCarOK AS �������⳵, ZJZP AS ֤��ץ��, ZPID AS ץ�Ŀں�, YKCSSF AS �¿���ʱ�շ�, CenterSFCS AS �����շѳ�ʱ, 
                      CenterCSJE AS ���ĳ�ʱ���, SFOption AS �շ�ѡ��, SFMode AS �շѷ�ʽ, HasPoint AS ��С����, PointNum AS С��λ��, Discount AS �����ۿ�, 
                      RealtimeDownload AS ʵʱ����, DownloadCardValid AS ������Ч����, TimeLoadMode AS ʱ����ط�ʽ, TimeLoadInterval AS ʱ����ؼ��, 
                      InOutTimeInterval AS ����ʱ����, PwdCheck AS ������, ShowDZState AS ��ʾ��բ״̬, ShowReceiveCardBox AS ��ʾ�տ���, 
                      CompareAccuracy AS �ԱȾ���, ControlInOut AS ID����1��1��, VideoCardType AS ��Ƶ����, LoadCharge AS �����շ�, ReadCardLogin AS ˢ����¼, 
                      DisplayTime AS ��ʾʱ��, VideoShiftTime AS ͼ��Ա�ʱ��, VideoBrightness AS ͼ������, VideoResolution AS ͼ��ֱ���, 
                      VideoFour AS ������·ʵʱ���, PersonVideo AS ����ץ��, CtrlVolume AS ��������, PrintFontSize AS ��ӡ����, BillPrintAuto AS �Զ���ӡ�շ�Ʊ��, 
                      TempCardPrePlate AS ��ʱ���볡Ԥ�ó��ƿ���, AutoPrePlate AS ��ʱ���Զ�����Ԥ�ô���, SetTempCardType AS ��ʱ���շѿɸ��Ŀ���, 
                      SetTempMoney AS ��ʱ���ɸ����շѽ��, TempTypeDefineOK AS �շѴ����շ������Զ���, TempTypeDefineString AS �շѴ����շ������Զ�����ϸ,
                       IDSoftOpen AS ID�������բ, IDNoticeDay AS �̶�����Ч��ʣ��XX����ʾ, IdSfCancel AS ID��ʱ�������շѿ�ȡ��, 
                      IdReReadHandle AS Զ����ID���ظ������Ż�����, IdPlateDownLoad AS ID���ѻ�������������ʾ����, ID1In1OutCardType AS ID�ֿ���һ��һ����ϸ,
                       IDComfirmOpenEnable AS ID���ֿ���ȷ�Ͽ�բ, IDComfirmOpenCardType AS ID���ֿ���ȷ�Ͽ�բ��ϸ, ForbidSamePosition AS �¿�����ͬ��λ�볡, 
                      MonthYQRule AS �¿������շѹ���, CtrlVoiceLedVersion AS ������ʾ���汾, CtrlVoiceMode AS ���������ģʽ, PcTalkPlate AS ����������������, 
                      CtrlShowPlate AS ���ƻ�������������ʾ����, CtrlShowStayTime AS ���ƻ�������������ʾͣ��ʱ��, CtrlShowRemainPos AS ���ƻ���ʾʣ�೵λ, 
                      CtrlShowInfo AS ���ƻ���ʾ������Ϣ, CtrlShowCW AS ���ƻ���ʾ��λ��, RemainPosLedShowInfo AS ʣ�೵λ����ʾ������Ϣ, 
                      RemainPosLedShowPlate AS ʣ�೵λ����ʾ����, CarPosLedLen AS ʣ�೵λ��ʾ��ģʽ, SFLedType AS ����շ���ʾ������, 
                      SumMoneyHide AS ���߼�ز���ʾ�ۼƽ��, ExitOnlineByPwd AS ƾ�����˳����߼��, CtrlSetHasPwd AS ƾ���������ƻ�����, 
                      SoftOpenNoPlate AS �����բ�����복��, AreaDefault AS ����Ĭ��ʡ��, OneKeyShortCut AS ����һ��ʽ��ݼ�, 
                      CheDuiMode AS ���ó���ģʽ��բ����, InOutQueryName AS �������¼��ʾ�������, ExceptionHandle AS �����쳣�����޿�����, 
                      ShowTempCardNum AS ��ʾ�����������ڿ�Ƭ����, ReLoginPrint AS �����¼�ɴ�ӡСƱ, FreeCardNoInPlace AS ��ѿ������복λ��, 
                      CheckPortFirst AS ��⿨��������ȡ��¼, SaveDetailLog AS ������ϸ��־, OnlyShowThisRemainPos AS ����ʾ��ʱ�̶���ֵʣ�೵λ, 
                      TempCarPlaceNum AS ��ʱ����λ, MonthCarPlaceNum AS �̶�����λ, MoneyCarPlaceNum AS ��ֵ����λ, PCName AS �������
FROM         dbo.MYCHECHANGXITONGSET
'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPane1' , N'USER',N'dbo', N'VIEW',N'vMYCHECHANGXITONGSET', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[26] 4[23] 2[37] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "MYCHECHANGXITONGSET"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 240
               Right = 276
            End
            DisplayFlags = 280
            TopColumn = 38
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 2160
         Alias = 2880
         Table = 2385
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'vMYCHECHANGXITONGSET'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPaneCount' , N'USER',N'dbo', N'VIEW',N'vMYCHECHANGXITONGSET', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'vMYCHECHANGXITONGSET'
GO
/****** Object:  View [dbo].[VMychechangNormalshoufei]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[VMychechangNormalshoufei]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'CREATE VIEW [dbo].[VMychechangNormalshoufei]
AS
SELECT     dbo.MYCHECHANGNORMALSHOUFEI.FreeMinute, dbo.MYCHECHANGNORMALSHOUFEI.TopSF, dbo.MYCHECHANGNORMALSHOUFEI.Hours, 
                      dbo.MYCHECHANGNORMALSHOUFEI.JE, dbo.MYCardType.CardType, dbo.MYCardType.Identifying
FROM         dbo.MYCHECHANGNORMALSHOUFEI INNER JOIN
                      dbo.MYCardType ON dbo.MYCHECHANGNORMALSHOUFEI.CardType = dbo.MYCardType.Identifying
'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPane1' , N'USER',N'dbo', N'VIEW',N'VMychechangNormalshoufei', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[32] 4[29] 2[20] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "MYCHECHANGNORMALSHOUFEI"
            Begin Extent = 
               Top = 39
               Left = 429
               Bottom = 187
               Right = 564
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "MYCardType"
            Begin Extent = 
               Top = 19
               Left = 167
               Bottom = 183
               Right = 301
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 900
         Table = 2670
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'VMychechangNormalshoufei'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPaneCount' , N'USER',N'dbo', N'VIEW',N'VMychechangNormalshoufei', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'VMychechangNormalshoufei'
GO
/****** Object:  StoredProcedure [dbo].[CardNoCancel]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[CardNoCancel]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
Create  PROCEDURE [dbo].[CardNoCancel]
                @CardNo VARCHAR(10),
	        @EDATE DATETIME,
	        @FLAG INT,
                @TEMPSTR VARCHAR(14)
 AS
 IF @FLAG=0
    BEGIN
	UPDATE dbo.MYICVALID SET CardNO=@CardNo+''-''+LEFT(@TEMPSTR,8) WHERE CardNO=@CardNo
	UPDATE dbo.MYICMONEY SET CardNO=@CardNo+''-''+LEFT(@TEMPSTR,8) WHERE CardNO=@CardNo
        UPDATE dbo.MYCARGOOUTRECORD SET CardNO=@CardNo+''-''+LEFT(@TEMPSTR,8) WHERE CardNO=@CardNo
    END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[CardIDUnProce]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON

GO
/****** Object:  StoredProcedure [dbo].[CardIDUnLossProce]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[CardIDUnLossProce]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'CREATE procedure  [dbo].[CardIDUnLossProce]  --���
(
@cardNo varchar(30),@UserId varchar(30)
)
 as
declare @cout int
declare @Return int --1ΪID�������� 2Ϊȫ��������
begin 
update dbo.MYFAXINGSSUE set
 UnLossDate =GETDATE() 
,UnLossUer=@UserId,
CardIdLossState=1 
where CardNO=@cardNo;
set @Return=1;
select @cout= COUNT(CardNO) from dbo.MYICLOST where CardNO=@cardNo;  
if @cout=0 
begin
update dbo.MYFAXINGSSUE set CardState=0 where CardNO=@cardNo;
set @Return=2;
end
return @Return
end' 
END
GO
/****** Object:  View [dbo].[CardIdProcess]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[CardIdProcess]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'CREATE view  [dbo].[CardIdProcess]
as
select m.CardNO as ''CardNO'',
 t.carCname  as ''MJCardType''
,m.UserNO as ''UserNO'',c.UserName as''UserName'', c.DeptName as DeptName,
case m.CardState
 when 1 then ''�ѷ���ʧָ��'' 
 when 2 then ''��ʧ���''
 when 3 then ''�ѷ����ָ��''
 when 4 then ''������''
 else ''�˿����'' end as ''State''
from dbo.MYFAXINGSSUE m
left join dbo.MYCAOZUOYUAN c on m.UserNO=c.UserNO
--left join dbo.MYBUMENSET b on c.DeptName=b.DeptNO
left join dbo.M_CardType t on m.MJCardType= t.carid
where m.CardState in (1,2,3,4,5) and LEN(m.CardNO)=8'
GO
/****** Object:  StoredProcedure [dbo].[CardIDProce]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[CardIDProce]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'CREATE procedure  [dbo].[CardIDProce]  --��ʧ�ɹ�
(
@cardNo varchar(30),@UserId varchar(30)
)
 as
declare @CarSate varchar(20)
declare @Return varchar(50)
begin 
update dbo.MYFAXINGSSUE set LossregDate=GETDATE() ,LossregUserCard=@UserId,CardIdLossState =1
where CardNO=@cardNo;
select @CarSate= CardState from MYICLOST where CardNO=@cardNo;
IF @CarSate=1 
BEGIN
UPDATE  dbo.MYFAXINGSSUE set CardState=2 where CardNO=@cardNo;--��ʧ�ɹ�
end
select @Return= CardState from  dbo.MYFAXINGSSUE;
return @Return;
end
' 
END
GO
/****** Object:  View [dbo].[JJCICLOST]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCICLOST]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'
CREATE VIEW [dbo].[JJCICLOST]
AS
SELECT DBO.MYICLOST.CardNO,DBO.MYICLOST.LossregDate,DBO.MYICLOST.OperatorCardNO,
	DBO.MYICLOST.MJLostOKNO,DBO.MYICLOST.MJUnLostOKNO , MYICIDSTATUS.CardState
FROM MYICLOST INNER JOIN
      MYICIDSTATUS ON MYICLOST.CardState = MYICIDSTATUS.CardState2
'
GO
/****** Object:  StoredProcedure [dbo].[JJCGETUPDATESTORE]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCGETUPDATESTORE]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE               PROCEDURE [dbo].[JJCGETUPDATESTORE]            
                 @NO       VARCHAR(30),            /*CardNO*/
                 @ENDDATE  DATETIME,               /*OutTime*/
                 @CARCARDS VARCHAR(20),            /*CPH*/
                 @CHARGE   MONEY ,                 /*��ȡ���*/
                 @GONAME   VARCHAR(100),           /*OutGateName*/
                 @GOPICTURE VARCHAR(256),          /*OutPic*/
                 @COMEDATE  DATETIME,              /*InTime*/
                 @IMONEY     MONEY,                /*ʣ����*/
                 @OPERATORCARD1   VARCHAR(30),
                 @OPERATORNAME1 VARCHAR(50),
                 @MYONOFFLINE   INT,               /*�ѻ�����*/
                 @MYIDICFLAG    INT,               /*IDIC��ʶ15IC 16ID*/
                 @MYKALEIHERE    VARCHAR(20),      /*����*/
                 @MYCHEPAICOLOR  VARCHAR(10),
                 @MYBIGSMALLINT  INT,
                 @MYCHECHANGBH   INT,
                 @SHOUFEIFLAG    INT,                  /*�����ʶ*/  
                 @MYMANGOPICT    VARCHAR(256)                
 AS
   
   DECLARE  @CCM VARCHAR(20)   
   DECLARE  @CCC VARCHAR(20)
   DECLARE  @COMENAME VARCHAR(50)
   DECLARE  @OPERATORCARD0  VARCHAR(30)
   DECLARE  @OPERATORNAME0  VARCHAR(50)
   DECLARE  @COMEPICTURE    VARCHAR(256)
   DECLARE  @MANCOMEPICT    VARCHAR(256)
   DECLARE  @MYCHAOSHISIGN  VARCHAR(10)
   DECLARE  @MYCHAOSHIDATE  DATETIME
   DECLARE  @OPERATORCARD2  VARCHAR(30)
   DECLARE  @OPERATORNAME2 VARCHAR(50)
   DECLARE  @MYSHOUFEIKOU  VARCHAR(100)
   DECLARE  @MYCHAOSHIJINER MONEY  
   DECLARE  @MYSHOUFEIDATE  DATETIME 
   DECLARE  @MYSHOUFEIJINER MONEY
   DECLARE  @XIAOCHEDATE    DATETIME 
   DECLARE  @MYMIANFEISHIYOU VARCHAR(100)
   DECLARE  @MYZHENGJIAN    VARCHAR(256)
   DECLARE  @MYYINGSHOUER   MONEY
            IF  ((@MYIDICFLAG=16) OR (@SHOUFEIFLAG=3))            /*IDIC��ʶ15IC 16ID  3Ϊ�����տ�*/
                BEGIN
                    IF @SHOUFEIFLAG=3
                    BEGIN
								SELECT TOP 1 @CCM=CardType,@CCC=CPH,
		                         @COMENAME=InGateName,@OPERATORCARD0=InOperatorCard,
		                         @OPERATORNAME0=InOperator,@COMEPICTURE=InPic,@MANCOMEPICT=InUser,
	                                 @XIAOCHEDATE=InTime,@MYSHOUFEIJINER=SFJE,
	                                 @MYCHAOSHISIGN=OvertimeSymbol,@MYCHAOSHIDATE=OvertimeSFTime,
	                                 @MYCHAOSHIJINER=OvertimeSFJE,@MYSHOUFEIDATE=SFTime,
	                                 @OPERATORCARD2=SFOperatorCard,@OPERATORNAME2=SFOperator,
	                                 @MYSHOUFEIKOU=SFGate,@MYMIANFEISHIYOU=FreeReason,
	                                 @MYZHENGJIAN=ZJPic,@MYYINGSHOUER=YSJE
		                 FROM MYCARCOMERECORD
		                      WHERE CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO)) AND BigSmall=@MYBIGSMALLINT ORDER BY InTime DESC  /*ID��ȡ�����һ��¼,�������������*/
                     END
                     ELSE  --16ID
                     BEGIN
                        if @MYONOFFLINE = 10  --�ѻ� ֻ���볡ʱ��С�ڳ���ʱ��ļ�¼��˳������  2016-02-19
                        begin
									SELECT TOP 1 @CCM=CardType,@CCC=CPH,
											 @COMENAME=InGateName,@OPERATORCARD0=InOperatorCard,@OPERATORCARD2=SFOperatorCard,@OPERATORNAME2=SFOperator,
											  @MYSHOUFEIKOU=SFGate,@OPERATORNAME0=InOperator,@COMEPICTURE=InPic,@MANCOMEPICT=InUser,@XIAOCHEDATE=InTime    --2016-02-19 ��� @XIAOCHEDATE=InTime                              
								   FROM MYCARCOMERECORD
										WHERE CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO)) AND BigSmall=@MYBIGSMALLINT and InTime <=@ENDDATE ORDER BY InTime 
		                  end
		                  else   --����
		                  begin
								SELECT TOP 1 @CCM=CardType,@CCC=CPH,
										 @COMENAME=InGateName,@OPERATORCARD0=InOperatorCard,@OPERATORCARD2=SFOperatorCard,@OPERATORNAME2=SFOperator,
										  @MYSHOUFEIKOU=SFGate,@OPERATORNAME0=InOperator,@COMEPICTURE=InPic,@MANCOMEPICT=InUser,@XIAOCHEDATE=InTime    --2016-02-19 ��� @XIAOCHEDATE=InTime                              
							   FROM MYCARCOMERECORD
								  WHERE CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO)) AND BigSmall=@MYBIGSMALLINT ORDER BY InTime DESC  /*ID��ȡ�����һ��¼,�������������*/
		                  end
		                  set @MYYINGSHOUER = @CHARGE  --2016-02-19
                     END
                     DELETE FROM MYCARCOMERECORD
                              WHERE CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO)) AND InTime=@XIAOCHEDATE AND BigSmall=@MYBIGSMALLINT                  
                     IF (@XIAOCHEDATE IS NOT NULL)
                        BEGIN
                                SET @COMEDATE=@XIAOCHEDATE
                          END
                     IF (@MYSHOUFEIJINER IS NOT NULL ) AND (@SHOUFEIFLAG=3)
                        BEGIN
                                SET @CHARGE=@MYSHOUFEIJINER
                          END
                END
            ELSE
                BEGIN
                     SELECT  @CCM=CardType,@CCC=CPH,
	                     @COMENAME=InGateName,@OPERATORCARD0=InOperatorCard,
	                     @OPERATORNAME0=InOperator,@COMEPICTURE=InPic,
                             @MANCOMEPICT=InUser,@MYZHENGJIAN=ZJPic,@MYSHOUFEIKOU=SFGate
	                 FROM MYCARCOMERECORD
	                      WHERE CarparkNO=@MYCHECHANGBH AND InTime=@COMEDATE AND CardNO=LTRIM(RTRIM(@NO)) AND BigSmall=@MYBIGSMALLINT                         /*IC*/
                     DELETE FROM MYCARCOMERECORD
                              WHERE CarparkNO=@MYCHECHANGBH AND InTime=@COMEDATE AND CardNO=LTRIM(RTRIM(@NO)) AND BigSmall=@MYBIGSMALLINT
							set @MYYINGSHOUER = @CHARGE  --2016-02-19
                END
            IF @CCM IS NULL 
                BEGIN
                    SET @CCM=@MYKALEIHERE
                    SET @CCC=@CARCARDS
                  END
			  if  (@CCC=''00000000'' or @CCC=''66666666'' or @CCC='''' or @CCC=''88888888'')
				BEGIN
					SET @CCC=@CARCARDS
				END
			  IF  (@MYCHAOSHIJINER IS  NULL)  
	        BEGIN
	                SET @MYCHAOSHIJINER=0                                                         
	        END
            IF @MYBIGSMALLINT=1
            BEGIN
                    SET @CHARGE=0
                    SET @IMONEY=0
                    SET @MYCHAOSHIJINER=0 
                    set @MYYINGSHOUER =0    --2016-02-19
            END
            IF @MYBIGSMALLINT=0
            BEGIN
                      IF  ((LEFT(RTRIM(@MYKALEIHERE),3)=''Mth'') AND (@CHARGE>0.0))
                      BEGIN
                           SET   @CCM=''Tmp'' + RIGHT(LTRIM(@MYKALEIHERE),1)
                           SET   @GONAME=RTRIM(@GONAME) + ''Overtime''
                      END
                      if(((LEFT(RTRIM(@MYKALEIHERE),3)=''Mtp'') AND (@CHARGE>0.0)))
                      BEGIN
                         SET   @CCM=@MYKALEIHERE
                      END
            END
            INSERT INTO MYCARGOOUTRECORD (CardNO,CardType,InTime,OutTime,CPH,SFJE,SFTime,
                       InGateName,OutGateName,InOperatorCard,InOperator,InPic,InUser,OutPic,OutUser,ZJPic,Balance,OutOperatorCard,
                       OutOperator,YSJE,BigSmall,CarparkNO,FreeReason,SFGate,SFOperatorCard,SFOperator,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE)
                  VALUES (@NO,@CCM,@COMEDATE,@ENDDATE,@CCC,@CHARGE,@MYSHOUFEIDATE,@COMENAME,@GONAME,@OPERATORCARD0,@OPERATORNAME0,
                          @COMEPICTURE,@MANCOMEPICT,@GOPICTURE,@MYMANGOPICT,@MYZHENGJIAN,@IMONEY,@OPERATORCARD1,@OPERATORNAME1,@MYYINGSHOUER,     --@CHARGE  2016-02-19
                          @MYBIGSMALLINT,@MYCHECHANGBH,@MYMIANFEISHIYOU,@MYSHOUFEIKOU,@OPERATORCARD2,@OPERATORNAME2,@MYCHAOSHISIGN,@MYCHAOSHIDATE,@MYCHAOSHIJINER)
             
            IF (@MYBIGSMALLINT=1 AND @MYONOFFLINE=20)  /*10�ѻ� 20����*/
            BEGIN	
          	    INSERT INTO MYCARGOOUTRECORD (CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5)	              
	               SELECT CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5 FROM MYCARCOMERECORD  WHERE CarparkNO=@MYCHECHANGBH AND BigSmall=@MYBIGSMALLINT AND CardNO=LTRIM(RTRIM(@NO))
	            DELETE FROM MYCARCOMERECORD WHERE CarparkNO=@MYCHECHANGBH AND BigSmall=@MYBIGSMALLINT AND CardNO=LTRIM(RTRIM(@NO))
            END                    
            IF (@MYBIGSMALLINT=0 AND @MYONOFFLINE=20)  /*10�ѻ� 20����*/   
            BEGIN
          	    INSERT INTO MYCARGOOUTRECORD (CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5)
	               SELECT CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5 FROM MYCARCOMERECORD  WHERE  CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO))
	            DELETE FROM MYCARCOMERECORD WHERE CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO))
            END 
' 
END
GO
/****** Object:  StoredProcedure [dbo].[JJCGETUPDATEFREE]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCGETUPDATEFREE]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE  PROCEDURE [dbo].[JJCGETUPDATEFREE]                            /* ��ѳ�¼��*/
                 @NO VARCHAR(30),                        
                 @ENDDATE DATETIME,            
                 @CARCARDS VARCHAR(20),                                      
                 @GONAME VARCHAR(100),                    
                 @GOPICTURE VARCHAR(256), 
                 @OPERATORCARD VARCHAR(30),
                 @OPERATORNAME VARCHAR(50),
                 @MYCHANGHAO  INT,
                 @MYDAXIAO    INT
 AS
   DECLARE  @CCN VARCHAR(30)
   DECLARE  @CCM VARCHAR(20)
   DECLARE  @DFD DATETIME
   DECLARE  @CCC VARCHAR(20)
   DECLARE  @CCOMENAME VARCHAR(100)
   DECLARE  @COPERATORCARDS VARCHAR(30)
   DECLARE  @COPERATORNAME VARCHAR(50)
   DECLARE  @CCOMEPICTURE VARCHAR(256)
  
           SELECT @CCN=CardNO,@CCM=CardType,@DFD=InTime,@CCC=CPH,
                  @CCOMENAME=InGateName,@COPERATORCARDS=InOperatorCard,
                  @COPERATORNAME=InOperator,@CCOMEPICTURE=InPic
                 FROM MYCARCOMERECORD
                 WHERE CPH=LTRIM(RTRIM(@CARCARDS)) AND CarparkNO=@MYCHANGHAO AND BigSmall=@MYDAXIAO
           INSERT INTO MYCARGOOUTRECORD (CardNO,CardType,InTime,OutTime,CPH,
                       InGateName,OutGateName,InOperatorCard,InOperator,InPic,OutPic,OutOperatorCard,OutOperator,CarparkNO,BigSmall)
                  VALUES (@CCN,@CCM,@DFD,@ENDDATE,@CCC,@CCOMENAME,@GONAME,@COPERATORCARDS,@COPERATORNAME,
                          @CCOMEPICTURE,@GOPICTURE,@OPERATORCARD,@OPERATORNAME,@MYCHANGHAO,@MYDAXIAO)
            DELETE FROM MYCARCOMERECORD
                 WHERE CPH=LTRIM(RTRIM(@CCC ))AND CarparkNO=@MYCHANGHAO AND BigSmall=@MYDAXIAO
' 
END
GO
/****** Object:  StoredProcedure [dbo].[JJCGETMONEYGZ]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCGETMONEYGZ]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE   PROCEDURE [dbo].[JJCGETMONEYGZ]
      @CARDTYPE VARCHAR(10),
      @COMETIME DATETIME,
      @GOTIME   DATETIME,
      @FLAG     INT,--Ϊ0���ڰ�ʱ�շѶ���һ�����շѣ�Ϊ1����һ�����շѶ��ⰴʱ�շѣ�Ϊ2���ڡ����ⶼ��ʱ�շ�
      @FEEMONEY NUMERIC(6,1) OUTPUT
AS
    DECLARE @FREEFLAG    INT
    DECLARE @FREEMINUTE  INT
    DECLARE @FEEPERIOD   INT
    DECLARE @HOURTERM    INT
    DECLARE @INFEE       MONEY
    DECLARE @OUTFEE      MONEY
    DECLARE @MINUTEVALUE INT
    DECLARE @HOURVALUE   INT
    DECLARE @PERIODVALUE INT
    DECLARE @FEEVALUE    NUMERIC(6,1)
    
    SELECT @FREEFLAG=0
    SELECT @FREEMINUTE=0
    SELECT @FEEPERIOD=0
    SELECT @HOURTERM=0
    SELECT @INFEE=0
    SELECT @OUTFEE=0
    SELECT @MINUTEVALUE=0
    SELECT @HOURVALUE=0
    SELECT @PERIODVALUE=0
    SELECT @FEEVALUE=0
    --���ݿ����MYSHOUFEIGUANGZOU�л�ȡMYCHECHANGNORMALSHOUFEI����
    SELECT @FREEFLAG=FreeMark,@FREEMINUTE=FreeTime,@FEEPERIOD=SFCycle,
           @HOURTERM=TimePeriod,@INFEE=WithinPeriodSF,@OUTFEE=WithoutPeriodSF
    FROM   MYSHOUFEIGUANGZOU
    WHERE  LEFT(LTRIM(RTRIM(CardType)),1)=RIGHT(LTRIM(RTRIM(@CARDTYPE)),1)
    
    IF @FEEPERIOD=0 SELECT @FEEPERIOD=12
    --�����ʱ��ֵ
    SELECT @MINUTEVALUE=DATEDIFF(MINUTE,@COMETIME,@GOTIME)
    SELECT @PERIODVALUE=@MINUTEVALUE /(@FEEPERIOD * 60)
    SELECT @HOURVALUE=(@MINUTEVALUE % (@FEEPERIOD * 60))/60
    IF ((@MINUTEVALUE % (@FEEPERIOD * 60)) % 60)>0 
        SELECT @HOURVALUE=@HOURVALUE +1
    
    --����MYCHECHANGNORMALSHOUFEI����SFJE
    IF @FREEFLAG>0 SELECT @FREEMINUTE=0   --С�����ʱ��
    IF @MINUTEVALUE < @FREEMINUTE
    BEGIN
       SELECT @FEEMONEY=0
       RETURN 
    END
    IF RIGHT(LTRIM(RTRIM(@CARDTYPE)),1)=''D''--D�࿨���μƷ�
    BEGIN       
       SELECT @FEEVALUE=@PERIODVALUE * @INFEE
       IF @HOURVALUE >0 SELECT @FEEVALUE=@FEEVALUE + @INFEE
       SELECT @FEEMONEY=@FEEVALUE
    END
    ELSE                                    --A��B��C�࿨
    BEGIN
       IF @FLAG=0                           --���ڰ�ʱ�Ʒѣ�����һ���ԼƷ�
       BEGIN
          SELECT @FEEVALUE=@PERIODVALUE * @OUTFEE
          IF @HOURVALUE < @HOURTERM 
              SELECT @FEEVALUE=@FEEVALUE + @HOURVALUE * @INFEE
          ELSE
              SELECT @FEEVALUE=@FEEVALUE + @OUTFEE
          SELECT @FEEMONEY=@FEEVALUE
          --RETURN
       END
       IF @FLAG=1                           --����һ���ԼƷѣ����ⰴʱ�Ʒ�
       BEGIN
          SELECT @FEEVALUE=@PERIODVALUE * (@INFEE + (@FEEPERIOD - @HOURTERM) * @OUTFEE)
          IF @HOURVALUE < @HOURTERM
              SELECT @FEEVALUE=@FEEVALUE + @INFEE
          ELSE
              SELECT @FEEVALUE=@FEEVALUE + @INFEE +(@HOURVALUE - @HOURTERM) * @OUTFEE
          SELECT @FEEMONEY=@FEEVALUE
          --RETURN
       END
       IF @FLAG=2                           --���ڰ�ʱ�Ʒѣ����ⰴʱ�Ʒ�
       BEGIN
          SELECT @FEEVALUE=@PERIODVALUE * (@INFEE * @HOURTERM +@OUTFEE * (@FEEPERIOD -@HOURTERM))
          IF @HOURVALUE < @HOURTERM
              SELECT @FEEVALUE=@FEEVALUE + @HOURVALUE * @INFEE
          ELSE
              SELECT @FEEVALUE=@FEEVALUE + @HOURTERM * @INFEE + (@HOURVALUE - @HOURTERM) * @OUTFEE
          SELECT @FEEMONEY=@FEEVALUE
       END
    END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[JJCGETMONEYBEIJING_Old]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCGETMONEYBEIJING_Old]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
create  PROCEDURE [dbo].[JJCGETMONEYBEIJING_Old]
@CardType VARCHAR(10),
@InTime DATETIME,
@OutTime DATETIME,
@SFJE MONEY OUTPUT
 AS
DECLARE @MINUTES AS INT
DECLARE @DAYS AS INT
DECLARE @TEMP_IN AS DATETIME
DECLARE @IN AS CHAR(5)
DECLARE @OUT AS CHAR(5)
DECLARE @SAME_DAY AS CHAR(5)
DECLARE @SAME_NIGHT AS CHAR(5)
DECLARE @TEMP_DAY1 AS VARCHAR(20)
DECLARE @TEMP_NIGHT1 AS VARCHAR(20)
DECLARE @TEMP_DAY2 AS VARCHAR(20)
DECLARE @TEMP_NIGHT2 AS VARCHAR(20)
DECLARE @DayStayMinutes INT             --����ͣ������
DECLARE @NightStayMinutes INT           --ҹ��ͣ������
DECLARE @ToAddMinutes INT                   --�������
DECLARE @DayMoney AS MONEY              --�����շ�
DECLARE @NightMoney AS MONEY              --ҹ���շ�
DECLARE @SumMoney AS MONEY               --�ϼ��շ�
DECLARE @FreeMinute AS INT
DECLARE @EathDayTopMoney AS MONEY        --ÿ��������Ѷ�
DECLARE @DayStartHour AS INT             --���쿪ʼСʱ
DECLARE @DayStartMinute AS INT           --���쿪ʼ����
DECLARE @NightStartHour AS INT           --ҹ�俪ʼСʱ
DECLARE @NightStartMinute AS INT            --ҹ�俪ʼ����
DECLARE @DayHalfHourMoney AS MONEY         --����ÿ��Сʱ�շѶ�
DECLARE @NightUnitTimeMoney AS MONEY     --ҹ��ÿ��ʱ��λ�շѶ�
DECLARE @NightCalcUnit AS MONEY           --ҹ���ʱ��λ
DECLARE @NightCalcMinute AS INT            --ҹ���ʱ����
DECLARE @DayStartTime AS CHAR(5)           --���쿪ʼʱ��
DECLARE @NightStartTime AS CHAR(5)          --ҹ�俪ʼʱ��
DECLARE @EVERYDAY_DAY_MINUTES AS INT
DECLARE @EVERYDAY_NIGHT_MINUTES AS INT
DECLARE @EVERYDAY_DAY_MONEY AS MONEY
DECLARE @EVERYDAY_NIGHT_MONEY AS MONEY
DECLARE @EVERYDAY_MONEY AS MONEY
DECLARE @TOTAL_DAYS_MONEY AS MONEY
IF LEFT(@CardType,4)<>''Temp'' AND LEFT(@CardType,4)<>''Stor'' AND LEFT(@CardType,4)<>''MthT''
	BEGIN
		SELECT @SFJE=0
		RETURN
	END
IF LEFT(@CardType,4)=''MthT''
	BEGIN
		SELECT @CardType=REPLACE(@CardType,''MthT'',''T'')
	END
SELECT @MINUTES=DATEDIFF(MINUTE,@InTime,@OutTime)
--�������ʱ��
SELECT TOP 1 @FreeMinute=FreeMinute FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
SELECT @FreeMinute=ISNULL(@FreeMinute,0)
IF @MINUTES<=0 OR @FreeMinute<0 OR @MINUTES<=@FreeMinute
	BEGIN
		SELECT @SFJE=0
		RETURN
	END
--����ÿ��������Ѷ�
SELECT TOP 1 @EathDayTopMoney=TopSF FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
SELECT @EathDayTopMoney=ISNULL(@EathDayTopMoney,0.00)
--�����ݿ��ȡ����
SELECT TOP 1 @DayStartHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=1
SELECT @DayStartHour=ISNULL(@DayStartHour,0)
SELECT TOP 1 @DayStartMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=2
SELECT @DayStartMinute=ISNULL(@DayStartMinute,0)
SELECT TOP 1 @NightStartHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=3
SELECT @NightStartHour=ISNULL(@NightStartHour,0)
SELECT TOP 1 @NightStartMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=4
SELECT @NightStartMinute=ISNULL(@NightStartMinute,0)
SELECT TOP 1 @DayHalfHourMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=5
SELECT @DayHalfHourMoney=ISNULL(@DayHalfHourMoney,0.00)
SELECT @DayHalfHourMoney=@DayHalfHourMoney/10
SELECT TOP 1 @NightUnitTimeMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=6
SELECT @NightUnitTimeMoney=ISNULL(@NightUnitTimeMoney,0.00)
SELECT @NightUnitTimeMoney=@NightUnitTimeMoney/10
SELECT TOP 1 @NightCalcUnit=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=7
SELECT @NightCalcUnit=ISNULL(@NightCalcUnit,0.00)
SELECT @NightCalcUnit=@NightCalcUnit/10
SELECT @NightCalcMinute=CONVERT(INT,@NightCalcUnit*60)
SELECT @DayStartTime=CONVERT(CHAR(5),CONVERT(DATETIME,CONVERT(VARCHAR(2),@DayStartHour)+'':''+CONVERT(VARCHAR(2),@DayStartMinute)),8)
SELECT @NightStartTime=CONVERT(CHAR(5),CONVERT(DATETIME,CONVERT(VARCHAR(2),@NightStartHour)+'':''+CONVERT(VARCHAR(2),@NightStartMinute)),8)
SELECT @EVERYDAY_DAY_MINUTES=DATEDIFF(MINUTE,@DayStartTime,@NightStartTime)
SELECT @EVERYDAY_NIGHT_MINUTES=DATEDIFF(MINUTE,''00:00'',@DayStartTime)+DATEDIFF(MINUTE,@NightStartTime,CONVERT(CHAR(10),DATEADD(DAY,1,@NightStartTime),120)+'' 00:00'')
IF (@EVERYDAY_DAY_MINUTES % 30)>0
	SELECT @EVERYDAY_DAY_MONEY=(@EVERYDAY_DAY_MINUTES /30+1)*@DayHalfHourMoney
ELSE
	SELECT @EVERYDAY_DAY_MONEY=(@EVERYDAY_DAY_MINUTES /30)*@DayHalfHourMoney
IF (@EVERYDAY_NIGHT_MINUTES % @NightCalcMinute)>0
	SELECT @EVERYDAY_NIGHT_MONEY=(@EVERYDAY_NIGHT_MINUTES/ @NightCalcMinute+1)*@NightUnitTimeMoney
ELSE
	SELECT @EVERYDAY_NIGHT_MONEY=(@EVERYDAY_NIGHT_MINUTES/ @NightCalcMinute)*@NightUnitTimeMoney
SELECT @EVERYDAY_MONEY=@EVERYDAY_DAY_MONEY+@EVERYDAY_NIGHT_MONEY
IF @EVERYDAY_MONEY>@EathDayTopMoney
	SELECT @EVERYDAY_MONEY=@EathDayTopMoney
--�������
SELECT @DAYS=DATEDIFF(DAY,@InTime,@OutTime)
SELECT @TEMP_IN=DATEADD(DAY,@DAYS,@InTime)
IF DATEDIFF(MINUTE,@TEMP_IN,@OutTime)<0
	BEGIN
		SELECT @TEMP_IN=DATEADD(DAY,-1,@TEMP_IN)
		SELECT @DAYS=@DAYS-1
	END
SELECT @TOTAL_DAYS_MONEY=@DAYS*@EVERYDAY_MONEY
--�����Σ����졢ҹ�䣩
IF DATEDIFF(DAY,@TEMP_IN,@OutTime)=0
	--ͬ��
	BEGIN
		SELECT @SAME_DAY=@DayStartTime		--07:00
		SELECT @SAME_NIGHT=@NightStartTime		--21:00
		SELECT @IN=CONVERT(CHAR(5),@TEMP_IN,8)
		SELECT @OUT=CONVERT(CHAR(5),@OutTime,8)
		
		IF DATEDIFF(MINUTE,@SAME_DAY,@IN)<0
			--00:00~07:00��
			BEGIN
				IF DATEDIFF(MINUTE,@SAME_DAY,@OUT)<=0
					--00:00~07:00��
					BEGIN
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@IN,@OUT)
						SELECT @DayStayMinutes=0
						--//
						IF (@DayStayMinutes % 30)>0
							SELECT @DayMoney=(@DayStayMinutes /30+1)*@DayHalfHourMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /30)*@DayHalfHourMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@EathDayTopMoney
							SELECT @SumMoney=@EathDayTopMoney
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@SAME_DAY,@OUT)>0 AND DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)<=0
					--07:00~21:00�� 	ҹ��������
					BEGIN
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@IN,@SAME_DAY)
						--ҹ��������
						IF @NightStayMinutes%@NightCalcMinute>0
							SELECT @ToAddMinutes=@NightCalcUnit*60-(@NightStayMinutes%@NightCalcMinute)
						ELSE
							SELECT @ToAddMinutes=0
						IF @ToAddMinutes>30
							SELECT @ToAddMinutes=30
						SELECT @SAME_DAY=CONVERT(CHAR(5),DATEADD(MINUTE,@ToAddMinutes,@SAME_DAY),8) 
						-------------------------
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@SAME_DAY,@OUT)
						--//
						IF (@DayStayMinutes % 30)>0
							SELECT @DayMoney=(@DayStayMinutes /30+1)*@DayHalfHourMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /30)*@DayHalfHourMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@EathDayTopMoney
							SELECT @SumMoney=@EathDayTopMoney
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)>0
					--21:00~����00:00�� 	�������ҹ��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@SAME_DAY,@SAME_NIGHT)
						--�������ҹ��
						IF @DayStayMinutes%30>0
							SELECT @ToAddMinutes=30-(@DayStayMinutes%30)
						ELSE
							SELECT @ToAddMinutes=0
						SELECT @SAME_NIGHT=CONVERT(CHAR(5),DATEADD(MINUTE,@ToAddMinutes,@SAME_NIGHT),8) 
						-------------------------
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@IN,@SAME_DAY)+DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)
						--//
						IF (@DayStayMinutes % 30)>0
							SELECT @DayMoney=(@DayStayMinutes /30+1)*@DayHalfHourMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /30)*@DayHalfHourMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@EathDayTopMoney
							SELECT @SumMoney=@EathDayTopMoney
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
			END
		
		IF DATEDIFF(MINUTE,@SAME_DAY,@IN)>=0 AND DATEDIFF(MINUTE,@SAME_NIGHT,@IN)<0
			--07:00~21:00��
			BEGIN
				IF DATEDIFF(MINUTE,@SAME_DAY,@OUT)>=0 AND DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)<=0
					--07:00~21:00��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@IN,@OUT)
						SELECT @NightStayMinutes=0
						--//
						IF (@DayStayMinutes % 30)>0
							SELECT @DayMoney=(@DayStayMinutes /30+1)*@DayHalfHourMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /30)*@DayHalfHourMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@EathDayTopMoney
							SELECT @SumMoney=@EathDayTopMoney
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)>0
					--21:00~����00:00��	�������ҹ��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@IN,@SAME_NIGHT)
						--�������ҹ��
						IF @DayStayMinutes%30>0
							SELECT @ToAddMinutes=30-(@DayStayMinutes%30)
						ELSE
							SELECT @ToAddMinutes=0
						SELECT @SAME_NIGHT=CONVERT(CHAR(5),DATEADD(MINUTE,@ToAddMinutes,@SAME_NIGHT),8) 
						-------------------------
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)
						--//
						IF (@DayStayMinutes % 30)>0
							SELECT @DayMoney=(@DayStayMinutes /30+1)*@DayHalfHourMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /30)*@DayHalfHourMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@EathDayTopMoney
							SELECT @SumMoney=@EathDayTopMoney
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
			END
		
		IF DATEDIFF(MINUTE,@SAME_NIGHT,@IN)>=0
			--21:00~����00:00��
			BEGIN
				IF DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)>=0
					--21:00~����00:00��
					BEGIN
						SELECT @DayStayMinutes=0
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@IN,@OUT)
						--//
						IF (@DayStayMinutes % 30)>0
							SELECT @DayMoney=(@DayStayMinutes /30+1)*@DayHalfHourMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /30)*@DayHalfHourMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@EathDayTopMoney
							SELECT @SumMoney=@EathDayTopMoney
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
			END
	END
ELSE
	--����(ֻ��һ�죬ʱ��ָ�����������Ϊ��ͬ����)
	BEGIN
		SELECT  @TEMP_DAY1=CONVERT(CHAR(10),@TEMP_IN,120) +'' ''+@DayStartTime		--����07:00
		SELECT @TEMP_NIGHT1=CONVERT(CHAR(10),@TEMP_IN,120)+'' ''+@NightStartTime		--ҹ��21:00
		--����
		SELECT  @TEMP_DAY2=CONVERT(CHAR(10),@OutTime,120) +'' ''+@DayStartTime	--����07:00
		SELECT @TEMP_NIGHT2=CONVERT(CHAR(10),@OutTime,120)+'' ''+@NightStartTime	--ҹ��21:00
		IF DATEDIFF(MINUTE,@TEMP_DAY1,@TEMP_IN)<0
			--00:00~07:00��
			BEGIN
				IF DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)<=0
					--��(��)��00:00~07:00��	�������ҹ��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@TEMP_DAY1,@TEMP_NIGHT1)
						--�������ҹ��
						IF @DayStayMinutes%30>0
							SELECT @ToAddMinutes=30-(@DayStayMinutes%30)
						ELSE
							SELECT @ToAddMinutes=0
						SELECT @TEMP_NIGHT1=CONVERT(VARCHAR(20),DATEADD(MINUTE,@ToAddMinutes,@TEMP_NIGHT1),120) 
						-------------------------
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@TEMP_DAY1)+DATEDIFF(MINUTE,@TEMP_NIGHT1,@OutTime)
						--//
						IF (@DayStayMinutes % 30)>0
							SELECT @DayMoney=(@DayStayMinutes /30+1)*@DayHalfHourMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /30)*@DayHalfHourMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@EathDayTopMoney
							SELECT @SumMoney=@EathDayTopMoney
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)>0 AND DATEDIFF(MINUTE,@TEMP_NIGHT2,@OutTime)<=0
					--��(��)��07:00~21:00��	ҹ��������
					BEGIN
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@TEMP_DAY1)+DATEDIFF(MINUTE,@TEMP_NIGHT1,@TEMP_DAY2)
						--ҹ��������
						IF @NightStayMinutes%@NightCalcMinute>0
							SELECT @ToAddMinutes=@NightCalcUnit*60-(@NightStayMinutes%@NightCalcMinute)
						ELSE
							SELECT @ToAddMinutes=0
						IF @ToAddMinutes>30
							SELECT @ToAddMinutes=30
						SELECT @TEMP_DAY2=CONVERT(VARCHAR(20),DATEADD(MINUTE,@ToAddMinutes,@TEMP_DAY2),120)
						-------------------------
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@TEMP_DAY1,@TEMP_NIGHT1)+DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)
						--//
						IF (@DayStayMinutes % 30)>0
							SELECT @DayMoney=(@DayStayMinutes /30+1)*@DayHalfHourMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /30)*@DayHalfHourMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@EathDayTopMoney
							SELECT @SumMoney=@EathDayTopMoney
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@TEMP_NIGHT2,@OutTime)>0
					--��(��)��21:00~00:00��	�������ҹ��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@TEMP_DAY1,@TEMP_NIGHT1)+DATEDIFF(MINUTE,@TEMP_DAY2,@TEMP_NIGHT2)
						--�������ҹ��
						IF @DayStayMinutes%30>0
							SELECT @ToAddMinutes=30-(@DayStayMinutes%30)
						ELSE
							SELECT @ToAddMinutes=0
						SELECT @TEMP_NIGHT2=CONVERT(VARCHAR(20),DATEADD(MINUTE,@ToAddMinutes,@TEMP_NIGHT2),120) 
						-------------------------
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@TEMP_DAY1)+DATEDIFF(MINUTE,@TEMP_NIGHT1,@TEMP_DAY2)+DATEDIFF(MINUTE,@TEMP_NIGHT2,@OutTime)
						--//
						IF (@DayStayMinutes % 30)>0
							SELECT @DayMoney=(@DayStayMinutes /30+1)*@DayHalfHourMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /30)*@DayHalfHourMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@EathDayTopMoney
							SELECT @SumMoney=@EathDayTopMoney
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
			END
		IF DATEDIFF(MINUTE,@TEMP_DAY1,@TEMP_IN)>=0 AND DATEDIFF(MINUTE,@TEMP_NIGHT1,@TEMP_IN)<0
			--07:00~21:00��
			BEGIN
				IF DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)<=0
					--��(��)��00:00~07:00��	�������ҹ��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@TEMP_NIGHT1)
						--�������ҹ��
						IF @DayStayMinutes%30>0
							SELECT @ToAddMinutes=30-(@DayStayMinutes%30)
						ELSE
							SELECT @ToAddMinutes=0
						SELECT @TEMP_NIGHT1=CONVERT(VARCHAR(20),DATEADD(MINUTE,@ToAddMinutes,@TEMP_NIGHT1),120) 
						-------------------------
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_NIGHT1,@OutTime)
						--//
						IF (@DayStayMinutes % 30)>0
							SELECT @DayMoney=(@DayStayMinutes /30+1)*@DayHalfHourMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /30)*@DayHalfHourMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@EathDayTopMoney
							SELECT @SumMoney=@EathDayTopMoney
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)>0 AND DATEDIFF(MINUTE,@TEMP_NIGHT2,@OutTime)<=0
					--��(��)��07:00~21:00��	ҹ��������
					BEGIN
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_NIGHT1,@TEMP_DAY2)
						--ҹ��������
						IF @NightStayMinutes%@NightCalcMinute>0
							SELECT @ToAddMinutes=@NightCalcUnit*60-(@NightStayMinutes%@NightCalcMinute)
						ELSE
							SELECT @ToAddMinutes=0
						IF @ToAddMinutes>30
							SELECT @ToAddMinutes=30
						SELECT @TEMP_DAY2=CONVERT(VARCHAR(20),DATEADD(MINUTE,@ToAddMinutes,@TEMP_DAY2),120)
						-------------------------
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@TEMP_NIGHT1)+DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)
						--//
						IF (@DayStayMinutes % 30)>0
							SELECT @DayMoney=(@DayStayMinutes /30+1)*@DayHalfHourMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /30)*@DayHalfHourMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@EathDayTopMoney
							SELECT @SumMoney=@EathDayTopMoney
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@TEMP_NIGHT2,@OutTime)>0
					--��(��)��21:00~00:00��	�������ҹ��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@TEMP_NIGHT1)+DATEDIFF(MINUTE,@TEMP_DAY2,@TEMP_NIGHT2)
						--�������ҹ��
						IF @DayStayMinutes%30>0
							SELECT @ToAddMinutes=30-(@DayStayMinutes%30)
						ELSE
							SELECT @ToAddMinutes=0
						SELECT @TEMP_NIGHT2=CONVERT(VARCHAR(20),DATEADD(MINUTE,@ToAddMinutes,@TEMP_NIGHT2),120) 
						-------------------------
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_NIGHT1,@TEMP_DAY2)+DATEDIFF(MINUTE,@TEMP_NIGHT2,@OutTime)
						--//
						IF (@DayStayMinutes % 30)>0
							SELECT @DayMoney=(@DayStayMinutes /30+1)*@DayHalfHourMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /30)*@DayHalfHourMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@EathDayTopMoney
							SELECT @SumMoney=@EathDayTopMoney
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
			END
		IF DATEDIFF(MINUTE,@TEMP_NIGHT1,@TEMP_IN)>=0
			--21:00~��(��)��00:00��
			BEGIN
				IF DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)<=0
					--��(��)��00:00~07:00��
					BEGIN
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@OutTime)
						SELECT @DayStayMinutes=0
						--//
						IF (@DayStayMinutes % 30)>0
							SELECT @DayMoney=(@DayStayMinutes /30+1)*@DayHalfHourMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /30)*@DayHalfHourMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@EathDayTopMoney
							SELECT @SumMoney=@EathDayTopMoney
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)>0 AND DATEDIFF(MINUTE,@TEMP_NIGHT2,@OutTime)<=0
					--��(��)��07:00~21:00��	ҹ��������
					BEGIN
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@TEMP_DAY2)
						--ҹ��������
						IF @NightStayMinutes%@NightCalcMinute>0
							SELECT @ToAddMinutes=@NightCalcUnit*60-(@NightStayMinutes%@NightCalcMinute)
						ELSE
							SELECT @ToAddMinutes=0
						IF @ToAddMinutes>30
							SELECT @ToAddMinutes=30
						SELECT @TEMP_DAY2=CONVERT(VARCHAR(20),DATEADD(MINUTE,@ToAddMinutes,@TEMP_DAY2),120)
						-------------------------
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)
						--//
						IF (@DayStayMinutes % 30)>0
							SELECT @DayMoney=(@DayStayMinutes /30+1)*@DayHalfHourMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /30)*@DayHalfHourMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@EathDayTopMoney
							SELECT @SumMoney=@EathDayTopMoney
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@TEMP_NIGHT2,@OutTime)>0
					--��(��)��21:00~00:00��	�������ҹ��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@TEMP_DAY2,@TEMP_NIGHT2)
						--�������ҹ��
						IF @DayStayMinutes%30>0
							SELECT @ToAddMinutes=30-(@DayStayMinutes%30)
						ELSE
							SELECT @ToAddMinutes=0
						SELECT @TEMP_NIGHT2=CONVERT(VARCHAR(20),DATEADD(MINUTE,@ToAddMinutes,@TEMP_NIGHT2),120) 
						-------------------------
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@TEMP_DAY2)+DATEDIFF(MINUTE,@TEMP_NIGHT2,@OutTime)
						--//
						IF (@DayStayMinutes % 30)>0
							SELECT @DayMoney=(@DayStayMinutes /30+1)*@DayHalfHourMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /30)*@DayHalfHourMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@EathDayTopMoney
							SELECT @SumMoney=@EathDayTopMoney
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
			END
	END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[JJCGETMONEYBEIJING]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCGETMONEYBEIJING]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE    PROCEDURE [dbo].[JJCGETMONEYBEIJING]
@CardType VARCHAR(10),
@InTime DATETIME,
@OutTime DATETIME,
@OutMoney MONEY OUTPUT
 AS
DECLARE @MINUTES AS INT
DECLARE @DAYS AS INT
DECLARE @TEMP_IN AS DATETIME
DECLARE @IN AS CHAR(5)
DECLARE @OUT AS CHAR(5)
DECLARE @SAME_DAY AS CHAR(5)
DECLARE @SAME_NIGHT AS CHAR(5)
DECLARE @TEMP_DAY1 AS VARCHAR(20)
DECLARE @TEMP_NIGHT1 AS VARCHAR(20)
DECLARE @TEMP_DAY2 AS VARCHAR(20)
DECLARE @TEMP_NIGHT2 AS VARCHAR(20)
DECLARE @DayStayMinutes INT						--����ͣ������				
DECLARE @NightStayMinutes INT					--ҹ��ͣ������
DECLARE @ToAddMinutes INT						--�������
DECLARE @FreeTimeNoPay AS INT					--���ʱ�䲻�Ʒ�
DECLARE @DayMoney AS MONEY						--�����շ�
DECLARE @NightMoney AS MONEY					--ҹ���շ�
DECLARE @SumMoney AS MONEY						--�ϼ��շ�
DECLARE @FreeMinute AS INT						--��ѷ���
DECLARE @DayMaxMoney AS MONEY					--ÿ��TopSF��
DECLARE @DayStartHour AS INT					--���쿪ʼHours
DECLARE @DayStartMinute AS INT					--���쿪ʼ����
DECLARE @NightStartHour AS INT					--ҹ�俪ʼHours
DECLARE @NightStartMinute AS INT				--ҹ�俪ʼ����
DECLARE @DayUnitTimeMoney AS MONEY				--����ÿ��ʱ��λ�շѶ�
DECLARE @NightUnitTimeMoney AS MONEY
DECLARE @NightCalcUnit AS MONEY					--ҹ���ʱ��λ
DECLARE @NightCalcMinute AS INT					--ҹ���ʱ����		
DECLARE @DayCalcMinute AS INT					--�����ʱ����
DECLARE @DayStartTime AS CHAR(5)					--���쿪ʼʱ��
DECLARE @NightStartTime AS CHAR(5)					--ҹ�俪ʼʱ��
DECLARE @EVERYDAY_DAY_MINUTES AS INT
DECLARE @EVERYDAY_NIGHT_MINUTES AS INT
DECLARE @EVERYDAY_DAY_MONEY AS MONEY
DECLARE @EVERYDAY_NIGHT_MONEY AS MONEY
DECLARE @EVERYDAY_MONEY AS MONEY
DECLARE @TOTAL_DAYS_MONEY AS MONEY
SELECT @MINUTES=DATEDIFF(MINUTE,@InTime,@OutTime)
--�������ʱ��
SELECT TOP 1 @FreeMinute=FreeMinute FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
SELECT @FreeMinute=ISNULL(@FreeMinute,0)
IF @MINUTES<=0 OR @FreeMinute<0 OR @MINUTES<=@FreeMinute
	BEGIN
		SELECT @OutMoney=0
		RETURN
	END
--*
SELECT TOP 1 @FreeTimeNoPay=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=30  
SELECT @FreeTimeNoPay=ISNULL(@FreeTimeNoPay,0)
IF @FreeTimeNoPay=1											
SELECT @InTime=DATEADD(MINUTE,@FreeMinute,@InTime)						
--*
--����ÿ��TopSF��
SELECT TOP 1 @DayMaxMoney=TopSF FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
SELECT @DayMaxMoney=ISNULL(@DayMaxMoney,0.00)
--�����ݿ��ȡ����
SELECT TOP 1 @DayStartHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=1
SELECT @DayStartHour=ISNULL(@DayStartHour,0)
SELECT TOP 1 @DayStartMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=2
SELECT @DayStartMinute=ISNULL(@DayStartMinute,0)
SELECT TOP 1 @NightStartHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=3
SELECT @NightStartHour=ISNULL(@NightStartHour,0)
SELECT TOP 1 @NightStartMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=4
SELECT @NightStartMinute=ISNULL(@NightStartMinute,0)
SELECT TOP 1 @DayUnitTimeMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=5
SELECT @DayUnitTimeMoney=ISNULL(@DayUnitTimeMoney,0.00)
--SELECT @DayUnitTimeMoney=@DayUnitTimeMoney/10
SELECT TOP 1 @NightUnitTimeMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=6
SELECT @NightUnitTimeMoney=ISNULL(@NightUnitTimeMoney,0.00)
--SELECT @NightUnitTimeMoney=@NightUnitTimeMoney/10
SELECT TOP 1 @NightCalcMinute=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=7
SELECT @NightCalcMinute=ISNULL(@NightCalcMinute,0.00)
SELECT TOP 1 @DayCalcMinute=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=8
SELECT @DayCalcMinute=ISNULL(@DayCalcMinute,0.00)
SELECT @DayStartTime=CONVERT(CHAR(5),CONVERT(DATETIME,CONVERT(VARCHAR(2),@DayStartHour)+'':''+CONVERT(VARCHAR(2),@DayStartMinute)),8)
SELECT @NightStartTime=CONVERT(CHAR(5),CONVERT(DATETIME,CONVERT(VARCHAR(2),@NightStartHour)+'':''+CONVERT(VARCHAR(2),@NightStartMinute)),8)
SELECT @EVERYDAY_DAY_MINUTES=DATEDIFF(MINUTE,@DayStartTime,@NightStartTime)
SELECT @EVERYDAY_NIGHT_MINUTES=DATEDIFF(MINUTE,''00:00'',@DayStartTime)+DATEDIFF(MINUTE,@NightStartTime,CONVERT(CHAR(10),DATEADD(DAY,1,@NightStartTime),120)+'' 00:00'')
IF (@EVERYDAY_DAY_MINUTES % @DayCalcMinute)>0
	SELECT @EVERYDAY_DAY_MONEY=(@EVERYDAY_DAY_MINUTES /@DayCalcMinute+1)*@DayUnitTimeMoney
ELSE
	SELECT @EVERYDAY_DAY_MONEY=(@EVERYDAY_DAY_MINUTES /@DayCalcMinute)*@DayUnitTimeMoney
IF (@EVERYDAY_NIGHT_MINUTES % @NightCalcMinute)>0
	SELECT @EVERYDAY_NIGHT_MONEY=(@EVERYDAY_NIGHT_MINUTES/ @NightCalcMinute+1)*@NightUnitTimeMoney
ELSE
	SELECT @EVERYDAY_NIGHT_MONEY=(@EVERYDAY_NIGHT_MINUTES/ @NightCalcMinute)*@NightUnitTimeMoney
SELECT @EVERYDAY_MONEY=@EVERYDAY_DAY_MONEY+@EVERYDAY_NIGHT_MONEY
IF @EVERYDAY_MONEY>@DayMaxMoney
	SELECT @EVERYDAY_MONEY=@DayMaxMoney
--����ͣ������
SELECT @DAYS=DATEDIFF(DAY,@InTime,@OutTime)
SELECT @TEMP_IN=DATEADD(DAY,@DAYS,@InTime)
IF DATEDIFF(MINUTE,@TEMP_IN,@OutTime)<0  --˵��С��24��Hours
	BEGIN
		SELECT @TEMP_IN=DATEADD(DAY,-1,@TEMP_IN)
		SELECT @DAYS=@DAYS-1
	END
SELECT @TOTAL_DAYS_MONEY=@DAYS*@EVERYDAY_MONEY
print ''@DAYS:'' + convert(varchar,@DAYS)
--0..7..21..0..7..21..0
--���������ࣺ���������ͬ�Ͳ���ͬ��ָ������<24Hours�ģ�����24Hours���Ѱ����촦���ˣ�
--��12�ֿ���
--���ͬ�գ��������볡ʱ�Σ�0..7..21..0 ��ÿ��ʱ���ְ�����ͬ�ĳ���ʱ��
--��1��0..7�룺 0..7����7..21����21..0��
--��2��7..21�룺7..21����21..0��
--��3��21..0�룺21..0��
--�����ͬ�գ�Ҳ�������볡ʱ�Σ�0..7..21..0 ��ÿ��ʱ���ְ�����ͬ�ĳ���ʱ��
--��1��0..7�룺 ����0..7��
--��2��7..21�룺����0..7����7..21��
--��3��21..0�룺����0..7����7..21����21..0��
--�����Σ����졢ҹ�䣩
IF DATEDIFF(DAY,@TEMP_IN,@OutTime)=0
	--ͬ��
	BEGIN
		SELECT @SAME_DAY=@DayStartTime		--07:00
		SELECT @SAME_NIGHT=@NightStartTime		--21:00
		SELECT @IN=CONVERT(CHAR(5),@TEMP_IN,8)
		SELECT @OUT=CONVERT(CHAR(5),@OutTime,8)
		
		IF DATEDIFF(MINUTE,@SAME_DAY,@IN)<0
			--00:00~07:00��
			BEGIN
				IF DATEDIFF(MINUTE,@SAME_DAY,@OUT)<=0
					--00:00~07:00��
					BEGIN
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@IN,@OUT)
						SELECT @DayStayMinutes=0
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@DayMaxMoney
							SELECT @SumMoney=@DayMaxMoney
						
						SELECT @OutMoney=@TOTAL_DAYS_MONEY+@SumMoney
 						
						print ''1 @OutMoney:'' + convert(varchar,@OutMoney)
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@SAME_DAY,@OUT)>0 AND DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)<=0
					--07:00~21:00�� 	ҹ��������
					BEGIN
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@IN,@SAME_DAY)
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@SAME_DAY,@OUT)
						
						--�������ͣ��ʱ�䲻���ε�ǰһ����ʱ��λ����ǰһ����ʱ��λ�շ�  2015-10-16
						if @DayStayMinutes + @NightStayMinutes <= @NightCalcMinute
						  begin
							 SELECT @OutMoney = @TOTAL_DAYS_MONEY + @NightUnitTimeMoney
							 print ''@OutMoney11111111:'' + convert(varchar,@OutMoney)
							 return
						  end
						
						
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@DayMaxMoney
							SELECT @SumMoney=@DayMaxMoney
						
						SELECT @OutMoney=@TOTAL_DAYS_MONEY+@SumMoney
						print ''2 @OutMoney:'' + convert(varchar,@OutMoney)
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)>0
					--21:00~����00:00�� 	�������ҹ��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@SAME_DAY,@SAME_NIGHT)
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@IN,@SAME_DAY)+DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)
						print ''@DayStayMinutes:'' + convert(varchar,@DayStayMinutes)
						print ''@NightStayMinutes:'' + convert(varchar,@NightStayMinutes)						
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						print ''@DayMoney��'' + convert(varchar,@DayMoney)
						IF @SumMoney>@DayMaxMoney
							SELECT @SumMoney=@DayMaxMoney
						
						SELECT @OutMoney=@TOTAL_DAYS_MONEY+@SumMoney
						print ''3 @OutMoney:'' + convert(varchar,@OutMoney)
						RETURN
						--//
					END
			END
		
		IF DATEDIFF(MINUTE,@SAME_DAY,@IN)>=0 AND DATEDIFF(MINUTE,@SAME_NIGHT,@IN)<0
			--07:00~21:00��
			BEGIN
				IF DATEDIFF(MINUTE,@SAME_DAY,@OUT)>=0 AND DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)<=0
					--07:00~21:00��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@IN,@OUT)
						SELECT @NightStayMinutes=0
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						print ''@DayMoney��'' + convert(varchar,@DayMoney) 
						IF @SumMoney>@DayMaxMoney
							SELECT @SumMoney=@DayMaxMoney
						SELECT @OutMoney=@TOTAL_DAYS_MONEY+@SumMoney
						print ''4 @OutMoney:'' + convert(varchar,@OutMoney)
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)>0
					--21:00~����00:00��	�������ҹ��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@IN,@SAME_NIGHT)
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)
						
						--�������ͣ��ʱ�䲻���ε�ǰһ����ʱ��λ����ǰһ����ʱ��λ�շ�  2015-10-16
						if @DayStayMinutes + @NightStayMinutes <= @DayCalcMinute
						  begin
							 SELECT @OutMoney = @TOTAL_DAYS_MONEY + @DayUnitTimeMoney
							 print ''@OutMoney2222222:'' + convert(varchar,@OutMoney)
							 return
						  end
						
						
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@DayMaxMoney
							SELECT @SumMoney=@DayMaxMoney
						
						SELECT @OutMoney=@TOTAL_DAYS_MONEY+@SumMoney
						print ''5 @OutMoney:'' + convert(varchar,@OutMoney)
						RETURN
						--//
					END
			END
		
		IF DATEDIFF(MINUTE,@SAME_NIGHT,@IN)>=0
			--21:00~����00:00��
			BEGIN
				IF DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)>=0
					--21:00~����00:00��
					BEGIN
						SELECT @DayStayMinutes=0
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@IN,@OUT)
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@DayMaxMoney
							SELECT @SumMoney=@DayMaxMoney
						
						SELECT @OutMoney=@TOTAL_DAYS_MONEY+@SumMoney
						print ''6 @OutMoney:'' + convert(varchar,@OutMoney)
						RETURN
						--//
					END
			END
	END
ELSE
	--����(ֻ��һ�죬ʱ��ָ�����������Ϊ��ͬ����)
	BEGIN
		SELECT  @TEMP_DAY1=CONVERT(CHAR(10),@TEMP_IN,120) +'' ''+@DayStartTime		--����07:00
		SELECT @TEMP_NIGHT1=CONVERT(CHAR(10),@TEMP_IN,120)+'' ''+@NightStartTime		--ҹ��21:00
		--����
		SELECT  @TEMP_DAY2=CONVERT(CHAR(10),@OutTime,120) +'' ''+@DayStartTime	--����07:00
		SELECT @TEMP_NIGHT2=CONVERT(CHAR(10),@OutTime,120)+'' ''+@NightStartTime	--ҹ��21:00
		IF DATEDIFF(MINUTE,@TEMP_DAY1,@TEMP_IN)<0
			--00:00~07:00��
			BEGIN
				IF DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)<=0
					--��(��)��00:00~07:00��	�������ҹ��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@TEMP_DAY1,@TEMP_NIGHT1)
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@TEMP_DAY1)+DATEDIFF(MINUTE,@TEMP_NIGHT1,@OutTime)
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@DayMaxMoney
							SELECT @SumMoney=@DayMaxMoney
						
						SELECT @OutMoney=@TOTAL_DAYS_MONEY+@SumMoney
						print ''7 @OutMoney:'' + convert(varchar,@OutMoney)
						RETURN
						--//
					END
            
			END
         
		IF DATEDIFF(MINUTE,@TEMP_DAY1,@TEMP_IN)>=0 AND DATEDIFF(MINUTE,@TEMP_NIGHT1,@TEMP_IN)<0
			--07:00~21:00��
			BEGIN
				IF DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)<=0
					--��(��)��00:00~07:00��	�������ҹ��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@TEMP_NIGHT1)
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_NIGHT1,@OutTime)
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@DayMaxMoney
							SELECT @SumMoney=@DayMaxMoney
						
						SELECT @OutMoney=@TOTAL_DAYS_MONEY+@SumMoney
						print ''8 @OutMoney:'' + convert(varchar,@OutMoney)
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)>0 AND DATEDIFF(MINUTE,@TEMP_NIGHT2,@OutTime)<=0
					--��(��)��07:00~21:00��	ҹ��������
					BEGIN
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_NIGHT1,@TEMP_DAY2)
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@TEMP_NIGHT1)+DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@DayMaxMoney
							SELECT @SumMoney=@DayMaxMoney
						
						SELECT @OutMoney=@TOTAL_DAYS_MONEY+@SumMoney
						print ''9 @OutMoney:'' + convert(varchar,@OutMoney)
						RETURN
						--//
					END
            
			END
		IF DATEDIFF(MINUTE,@TEMP_NIGHT1,@TEMP_IN)>=0
			--21:00~��(��)��00:00��
			BEGIN
				IF DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)<=0
					--��(��)��00:00~07:00��
					BEGIN
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@OutTime)
						SELECT @DayStayMinutes=0
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@DayMaxMoney
							SELECT @SumMoney=@DayMaxMoney
						
						SELECT @OutMoney=@TOTAL_DAYS_MONEY+@SumMoney
						print ''10 @OutMoney:'' + convert(varchar,@OutMoney)
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)>0 AND DATEDIFF(MINUTE,@TEMP_NIGHT2,@OutTime)<=0
					--��(��)��07:00~21:00��	ҹ��������
					BEGIN
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@TEMP_DAY2)
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)
						print ''@DayStayMinutes:'' + convert(varchar,@DayStayMinutes)
						print ''@NightStayMinutes:'' + convert(varchar,@NightStayMinutes)
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@DayMaxMoney
							SELECT @SumMoney=@DayMaxMoney
						
						SELECT @OutMoney=@TOTAL_DAYS_MONEY+@SumMoney
						print ''11 @OutMoney:'' + convert(varchar,@OutMoney)
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@TEMP_NIGHT2,@OutTime)>0
					--��(��)��21:00~00:00��	�������ҹ��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@TEMP_DAY2,@TEMP_NIGHT2)
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@TEMP_DAY2)+DATEDIFF(MINUTE,@TEMP_NIGHT2,@OutTime)
						print ''@DayStayMinutes:'' + convert(varchar,@DayStayMinutes)
						print ''@NightStayMinutes:'' + convert(varchar,@NightStayMinutes) 
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@DayMaxMoney
							SELECT @SumMoney=@DayMaxMoney
						
						SELECT @OutMoney=@TOTAL_DAYS_MONEY+@SumMoney
						print ''12 @OutMoney:'' + convert(varchar,@OutMoney)
						RETURN
						--//
					END
			END
	END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[JJCGETDATE]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCGETDATE]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE  PROCEDURE [dbo].[JJCGETDATE]                
                 @COMEDATE DATETIME            
 AS
          INSERT INTO MYRECORDMEMORY (CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5)  SELECT CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5 FROM MYCARGOOUTRECORD WHERE OutTime< @COMEDATE 
     
          DELETE FROM MYCARGOOUTRECORD WHERE OutTime< @COMEDATE
' 
END
GO
/****** Object:  StoredProcedure [dbo].[JJCGETDATAMONEY]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCGETDATAMONEY]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE  PROCEDURE [dbo].[JJCGETDATAMONEY]                  
                 @COMEDATE DATETIME,            
                 @LASTDATE DATETIME,
	         @FLAG INT
 AS
  
   TRUNCATE TABLE MYRECORDQUERY
IF @FLAG=1 
  BEGIN
   INSERT INTO MYRECORDQUERY (CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5)
          SELECT CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5 FROM MYCARGOOUTRECORD WHERE OutTime BETWEEN  @COMEDATE AND @LASTDATE  
  END   
IF @FLAG=2 
   BEGIN
    INSERT INTO MYRECORDQUERY (CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5)
          SELECT CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5 FROM MYRECORDMEMORY WHERE OutTime BETWEEN  @COMEDATE AND @LASTDATE  
    INSERT INTO MYRECORDQUERY (CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5)
          SELECT CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5 FROM MYCARGOOUTRECORD WHERE OutTime BETWEEN  @COMEDATE AND @LASTDATE  
   END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[JJCFINDCARRECORD]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCFINDCARRECORD]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE  PROCEDURE [dbo].[JJCFINDCARRECORD]                    --�ձ���
                  @OPERATORCARD VARCHAR(50),            --����Ա����(����)
                  @IMONEY MONEY,                      --���н��
                  @FIRSTDATE DATETIME,                --��ʼ����
                  @LASTDATE DATETIME,                 --��������
                  @FLAG INT,                          --��ʾ�ꡢ�¡���
                  @DATAINT DATETIME,                  --����
                  @IINT INT                           --����
AS 
   DECLARE @IMONTHA INT          --�¿�
   DECLARE @IMONTHB INT          --�¿�
   DECLARE @IMONTHC INT          --�¿�
   DECLARE @IMONTHD INT          --�¿�
   DECLARE @ISUMMONTH INT       --���¿���
   DECLARE @IFREEA INT       --��ѿ�
   DECLARE @IFREEB INT       --��ѿ�
   DECLARE @ISUMFREE INT     --�������
   DECLARE @ITEMPA INT      --��ʱ��
   DECLARE @ITEMPB INT      --��ʱ��
   DECLARE @ITEMPC INT      --��ʱ��
   DECLARE @ITEMPD INT      --��ʱ��
   DECLARE @IMONEYA INT     --��ֵ��
   DECLARE @IMONEYB INT     --��ֵ��
   DECLARE @IMONEYC INT     --��ֵ��
   DECLARE @IMONEYD INT     --��ֵ��
   DECLARE @ISUMTEMP INT    --��ʱ��������
   DECLARE @ISUMMONEY INT   --��ֵ��������
   DECLARE @ZSUMCAR INT     --���еĿ���
   DECLARE @ZSUMMONEY MONEY     --�ܽ��
   DECLARE @ITFREE INT          --���⳵
   DECLARE @MONTHTEMPMONEY MONEY --ÿ��ÿ�����ʱ���շ�
   DECLARE @MONEYDAY MONEY       --ÿ��ÿ�촢ֵ���շ�
         SELECT @IMONTHA=0
         SELECT @IMONTHB=0
         SELECT @IMONTHC=0
         SELECT @IMONTHD=0
         SELECT @ISUMMONTH=0
         SELECT @IFREEA=0
         SELECT @IFREEB=0
         SELECT @ISUMFREE=0
         SELECT @ITEMPB=0
         SELECT @ITEMPA=0
         SELECT @ITEMPC=0
         SELECT @ITEMPD=0
         SELECT @IMONEYA=0
         SELECT @IMONEYB=0
         SELECT @IMONEYC=0
         SELECT @IMONEYD=0
         SELECT @MONTHTEMPMONEY=0
         SELECT @ITFREE=0
         SELECT @MONEYDAY=0
 
   IF @FLAG=1   --������Ա
      BEGIN
         SELECT @IMONTHA=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthA''
         SELECT @IMONTHB=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthB''
         SELECT @IMONTHC=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthC''
         SELECT @IMONTHD=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthD''
         SELECT @IFREEA= COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''FreA''
         SELECT @IFREEB= COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''FreB''
           SELECT @ITFREE= COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''Tfr''
         SELECT @ITEMPA=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpA'' OR CardType=''MtpA'')
         SELECT @ITEMPB=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpB'' OR CardType=''MtpB'')
         SELECT @ITEMPC=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpC'' OR CardType=''MtpC'')
         SELECT @ITEMPD=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpD'' OR CardType=''MtpD'')
         SELECT @IMONEYA=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrA''
           SELECT @IMONEYB=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrB''
         SELECT @IMONEYC=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrC''
         SELECT @IMONEYD=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrD''
         SELECT @MONTHTEMPMONEY=SUM(CASE WHEN SFJE>0 THEN SFJE ELSE 0 END)
               FROM MYRECORDMEMORY
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (LEFT(CardType,3)=''Tmp'' OR LEFT(CardType,3)=''Mtp'')
         SELECT @MONEYDAY=SUM(CASE WHEN SFJE>0 THEN SFJE ELSE 0 END)
               FROM MYRECORDMEMORY
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND LEFT(CardType,3)=''Str''
         SELECT @ISUMMONTH=@IMONTHA+@IMONTHB+@IMONTHC+@IMONTHD
         SELECT @ISUMFREE=@IFREEA+@IFREEB
         SELECT @ISUMTEMP=@ITEMPA+@ITEMPB+@ITEMPC+@ITEMPD
         SELECT @ISUMMONEY=@IMONEYA+@IMONEYB+@IMONEYC+@IMONEYD
         SELECT @ZSUMCAR=@ISUMTEMP+@ISUMMONEY+@ISUMMONTH+@ISUMFREE+@ITFREE
         SELECT @ZSUMMONEY=@MONTHTEMPMONEY+@MONEYDAY
           INSERT INTO MYCARGOOUTRECORDREPORT (CARDSNO,IMONTHA,IMONTHB,IMONTHC,IMONTHD,ISUMMONTH,IFREEA,IFREEB,ISUMFREE,ITEMPA,ITEMPB,ITEMPC,ITEMPD,ISUMTEMP,
                       IMONEYA,IMONEYB,IMONEYC,IMONEYD,ISUMMONEY,IMONEY,ZSUMCAR,ZSUMMONEY,ITEMPFREE)
                  VALUES (@OPERATORCARD,@IMONTHA,@IMONTHB,@IMONTHC,@IMONTHD,@ISUMMONTH,@IFREEA,@IFREEB,@ISUMFREE,@ITEMPA,@ITEMPB,@ITEMPC,@ITEMPD,@ISUMTEMP,
                        @IMONEYA,@IMONEYB,@IMONEYC,@IMONEYD,@ISUMMONEY,@MONTHTEMPMONEY,@ZSUMCAR,@ZSUMMONEY,@ITFREE)
      END
 
   IF @FLAG=2   --���¼���
      BEGIN
           SELECT @MONTHTEMPMONEY=SUM(CASE WHEN SFJE>0 THEN SFJE ELSE 0 END) FROM  MYRECORDMEMORY
                  WHERE YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT)   AND (LEFT(CardType,3)=''Tmp'' OR LEFT(CardType,3)=''Mtp'' OR LEFT(CardType,3)=''Str'')
                  GROUP BY  YEAR(OutTime)+''-''+ MONTH(OutTime) +''-'' +DAY(OutTime)
         SELECT @IMONTHA=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                      AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthA''
         SELECT @IMONTHB=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                      AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthB''
         SELECT @IMONTHC=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                      AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthC''
         SELECT @IMONTHD=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                      AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthD''
         SELECT @IFREEA= COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                       AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''FreA''
         SELECT @IFREEB= COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                       AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''FreB''
         SELECT @ITFREE= COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                       AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''Tfr''
         SELECT @ITEMPA=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                       AND OutOperatorCard<>''''  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpA'' OR CardType=''MtpA'')
         SELECT @ITEMPB=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                     AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpB'' OR CardType=''MtpB'')
         SELECT @ITEMPC=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                     AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpC'' OR CardType=''MtpC'')
         SELECT @ITEMPD=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                     AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpD'' OR CardType=''MtpD'')
          SELECT @IMONEYA=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                       AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrA''
         SELECT @IMONEYB=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                    AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrB''
         SELECT @IMONEYC=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                       AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrC''
         SELECT @IMONEYD=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                       AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrD''
         SELECT @ISUMMONTH=@IMONTHA+@IMONTHB+@IMONTHC+@IMONTHD
         SELECT @ISUMFREE=@IFREEA+@IFREEB
         SELECT @ISUMTEMP=@ITEMPA+@ITEMPB+@ITEMPC+@ITEMPD
         SELECT @ISUMMONEY=@IMONEYA+@IMONEYB+@IMONEYC+@IMONEYD
         SELECT @ZSUMCAR=@ISUMTEMP+@ISUMMONEY+@ISUMMONTH+@ISUMFREE+@ITFREE
         SELECT @ZSUMMONEY=@MONTHTEMPMONEY
         DELETE FROM MYCARGOOUTRECORDREPORT WHERE CARDSNO=@OPERATORCARD   
           INSERT INTO MYCARGOOUTRECORDREPORT (CARDSNO,IMONTHA,IMONTHB,IMONTHC,IMONTHD,ISUMMONTH,IFREEA,IFREEB,ISUMFREE,ITEMPA,ITEMPB,ITEMPC,ITEMPD,ISUMTEMP,
                       IMONEYA,IMONEYB,IMONEYC,IMONEYD,ISUMMONEY,IMONEY,ZSUMCAR,ZSUMMONEY,ITEMPFREE)
                  VALUES (@OPERATORCARD,@IMONTHA,@IMONTHB,@IMONTHC,@IMONTHD,@ISUMMONTH,@IFREEA,@IFREEB,@ISUMFREE,@ITEMPA,@ITEMPB,@ITEMPC,@ITEMPD,@ISUMTEMP,
                        @IMONEYA,@IMONEYB,@IMONEYC,@IMONEYD,@ISUMMONEY,@MONTHTEMPMONEY,@ZSUMCAR,@ZSUMMONEY,@ITFREE)
      END
  IF @FLAG=3   --�������
      BEGIN
           SELECT @MONTHTEMPMONEY=SUM(CASE WHEN SFJE>0 THEN SFJE ELSE 0 END) FROM MYRECORDMEMORY
                  WHERE  (MONTH(InTime)=@IINT  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE )   AND (LEFT(CardType,3)=''Tmp'' OR LEFT(CardType,3)=''Mtp'' OR LEFT(CardType,3)=''Str'')
                  GROUP BY MONTH(OutTime) 
         SELECT @IMONTHA=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (MONTH(InTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthA''
         SELECT @IMONTHB=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (MONTH(InTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthB''
         SELECT @IMONTHC=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (MONTH(InTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthC''
         SELECT @IMONTHD=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (MONTH(InTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthD''
         SELECT @IFREEA= COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (MONTH(InTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''FreA''
         SELECT @IFREEB= COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (MONTH(InTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''FreB''
         SELECT @ITFREE= COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (MONTH(InTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''Tfr''   --����
         SELECT @ITEMPA=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (MONTH(InTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpA'' OR CardType=''MtpA'')
         SELECT @ITEMPB=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (MONTH(InTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpB'' OR CardType=''MtpB'')
          SELECT @ITEMPC=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (MONTH(InTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpC'' OR CardType=''MtpC'')
         SELECT @ITEMPD=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (MONTH(InTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpD'' OR CardType=''MtpD'')
         SELECT @IMONEYA=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (MONTH(InTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrA''
         SELECT @IMONEYB=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (MONTH(InTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrB''
         SELECT @IMONEYC=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (MONTH(InTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrC''
         SELECT @IMONEYD=COUNT(CardType)
               FROM MYRECORDMEMORY
               WHERE (MONTH(InTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrD''
         SELECT @ISUMMONTH=@IMONTHA+@IMONTHB+@IMONTHC+@IMONTHD
         SELECT @ISUMFREE=@IFREEA+@IFREEB
         SELECT @ISUMTEMP=@ITEMPA+@ITEMPB+@ITEMPC+@ITEMPD
         SELECT @ISUMMONEY=@IMONEYA+@IMONEYB+@IMONEYC+@IMONEYD
         SELECT @ZSUMCAR=@ISUMTEMP+@ISUMMONEY+@ISUMMONTH+@ISUMFREE+@ITFREE
         SELECT @ZSUMMONEY=@MONTHTEMPMONEY
         DELETE FROM MYCARGOOUTRECORDREPORT WHERE CARDSNO=@OPERATORCARD
           INSERT INTO MYCARGOOUTRECORDREPORT (CARDSNO,IMONTHA,IMONTHB,IMONTHC,IMONTHD,ISUMMONTH,IFREEA,IFREEB,ISUMFREE,ITEMPA,ITEMPB,ITEMPC,ITEMPD,ISUMTEMP,
                       IMONEYA,IMONEYB,IMONEYC,IMONEYD,ISUMMONEY,IMONEY,ZSUMCAR,ZSUMMONEY,ITEMPFREE)
                  VALUES (@OPERATORCARD,@IMONTHA,@IMONTHB,@IMONTHC,@IMONTHD,@ISUMMONTH,@IFREEA,@IFREEB,@ISUMFREE,@ITEMPA,@ITEMPB,@ITEMPC,@ITEMPD,@ISUMTEMP,
                        @IMONEYA,@IMONEYB,@IMONEYC,@IMONEYD,@ISUMMONEY,@MONTHTEMPMONEY,@ZSUMCAR,@ZSUMMONEY,@ITFREE)
      END
' 
END
GO
/****** Object:  View [dbo].[JJCDAYREPORT]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCDAYREPORT]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'
CREATE   VIEW [dbo].[JJCDAYREPORT] AS
 SELECT CARDSNO AS OperatorCardNO,ISNULL(IMONTHA,0) AS MonthA,ISNULL(IMONTHB,0) AS MonthB,ISNULL(IMONTHC,0) AS MonthC,ISNULL(IMONTHD,0) AS MonthD,ISNULL(ISUMMONTH,0) AS MonthTotal,ISNULL(IFREEA,0) AS FreeA,ISNULL(IFREEB,0) AS FreeB,ISNULL(ISUMFREE,0) AS FreeTotal,ISNULL(ITEMPA,0) AS TempA,ISNULL(ITEMPB,0) AS TempB,ISNULL(ITEMPC,0) AS TempC,ISNULL(ITEMPD,0) AS TempD,ISNULL(ITEMPE,0) AS TempE,ISNULL(ITEMPF,0) AS TempF,ISNULL(ITEMPG,0) AS TempG,ISNULL(ITEMPH,0) AS TempH,ISNULL(ISUMTEMP,0) AS TempTotal,ISNULL(IMONEY,0) AS TempSum,ISNULL(IMONEYA,0) AS StoreA,ISNULL(IMONEYB,0) AS StoreB,ISNULL(IMONEYC,0) AS StoreC,ISNULL(IMONEYD,0) AS StoreD,ISNULL(ISUMMONEY,0) AS StoreSum,ISNULL(ITEMPFREE,0) AS TmpFree,ISNULL(ZSUMCAR,0) AS TotalCars,ISNULL(ZSUMMONEY,0) AS TotalAmount FROM MYCARGOOUTRECORDREPORT
    
'
GO
/****** Object:  StoredProcedure [dbo].[JJCCOMERECORD]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCCOMERECORD]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE        PROCEDURE [dbo].[JJCCOMERECORD]
        @COMEOPERATOR  CHAR(10),
        @COMEDATE   DATETIME, 
        @MYCHANGHAO INT,              
        @IMONTH  INT=0 OUTPUT,
        @ITEMP  INT=0 OUTPUT,
        @IFREE  INT=0 OUTPUT,
        @IMONEY  INT=0 OUTPUT,
        @ISUM  INT=0 OUTPUT,
        @MMONEY MONEY=0.0 OUTPUT,
	@IOPEN  INT=0 OUTPUT,
        @nMONEY MONEY=0.0 OUTPUT
AS           
          SET @MMONEY=(SELECT SUM(SFJE) FROM MYCARGOOUTRECORD WHERE  CarparkNO=@MYCHANGHAO AND BigSmall=0 AND (LEFT(CardType,3)=''Tmp'' or LEFT(CardType,3)=''Mtp'') AND OutOperatorCard=@COMEOPERATOR AND OutTime>= @COMEDATE)
	      SET @nMONEY=(SELECT SUM(YSJE-SFJE) FROM MYCARGOOUTRECORD WHERE  CarparkNO=@MYCHANGHAO AND BigSmall=0 AND (LEFT(CardType,3)=''Tfr'' or LEFT(CardType,3)=''Tmp'')  AND OutOperatorCard=@COMEOPERATOR AND OutTime>= @COMEDATE)
          SET @IMONTH=(SELECT COUNT(*) FROM MYCARCOMERECORD WHERE CarparkNO=@MYCHANGHAO AND BigSmall=0 AND LEFT(CardType,3)=''Mth'' )
          SET @ITEMP=(SELECT COUNT(*) FROM MYCARCOMERECORD WHERE CarparkNO=@MYCHANGHAO AND BigSmall=0 AND LEFT(CardType,3)=''Tmp'' )
          SET @IFREE=(SELECT COUNT(*) FROM MYCARCOMERECORD WHERE CarparkNO=@MYCHANGHAO AND BigSmall=0 AND LEFT(CardType,3)=''Fre'' )
          SET @IMONEY=(SELECT COUNT(*) FROM MYCARCOMERECORD WHERE CarparkNO=@MYCHANGHAO AND BigSmall=0 AND LEFT(CardType,3)=''Str'') 
          SET @ISUM=(SELECT COUNT(*) FROM MYCARCOMERECORD WHERE CarparkNO=@MYCHANGHAO AND BigSmall=0 )     
	      SET @IOPEN=(SELECT COUNT(*) FROM MYCARGOOUTRECORD WHERE CarparkNO=@MYCHANGHAO AND BigSmall=0 AND LEFT(CardType,3)=''Per'' AND OutOperatorCard=@COMEOPERATOR AND OutTime>= @COMEDATE )
' 
END
GO
/****** Object:  StoredProcedure [dbo].[JJCT_GETMONEY_Old]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCT_GETMONEY_Old]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
create PROCEDURE [dbo].[JJCT_GETMONEY_Old]
@CardType VARCHAR(10),
@InTime DATETIME,
@OutTime DATETIME,
@SFJE MONEY OUTPUT
 AS
DECLARE @StayDays AS INT            --ͣ������
DECLARE @StayHours AS INT           --ͣ��Сʱ��
DECLARE @StayTotalMinutes AS INT    --��ͣ��������
DECLARE @FreeMinute AS INT
DECLARE @TopSF AS MONEY
--*
DECLARE @FreeTimeNoPay AS INT       --���ʱ�䲻�Ʒ�
DECLARE @MakeDayNight AS INT        --�ְ���ҹ���
DECLARE @IDCardSF AS INT            --ID���շ�
DECLARE @ChargeMode3 AS INT         --���μƷ�
DECLARE @ChargeMode2 AS INT         --���趨ʱ��Ʒ�
DECLARE @DayStartHour AS INT
DECLARE @NightStartHour AS INT
DECLARE @DayStartMinute AS INT
DECLARE @NightStartMinute AS INT
DECLARE @DayCalcUnitHour AS INT             --�����ʱ��λСʱ
DECLARE @NightCalcUnitHour AS INT           --ҹ���ʱ��λСʱ
DECLARE @DayCalcUnitMinute AS INT           --�����ʱ��λ����
DECLARE @NightCalcUnitMinute AS INT         --ҹ���ʱ��λ����
DECLARE @DayUnitTimeMoney AS MONEY          --����ÿ��ʱ��λ�շѶ�
DECLARE @NightUnitTimeMoney AS MONEY        --ҹ��ÿ��ʱ��λ�շѶ�
DECLARE @DayTopMoney AS MONEY               --��������շѶ�
DECLARE @NightTopMoney AS MONEY             --ҹ������շѶ�
DECLARE @DayFirstUnitMoney AS MONEY         --�����׼�ʱ��λ�շѶ�
DECLARE @NightFirstUnitMoney AS MONEY       --ҹ���׼�ʱ��λ�շѶ�
DECLARE @DayMinMoney AS MONEY               --��������շѶ�
DECLARE @NightMinMoney AS MONEY             --ҹ������շѶ�
DECLARE @DayFirstUnitHour AS INT                --�����׼�ʱ��λСʱ
DECLARE @NightFirstUnitHour AS INT              --ҹ���׼�ʱ��λСʱ
DECLARE @DayFirstUnitMinute AS INT              --�����׼�ʱ��λ����
DECLARE @NightFirstUnitMinute AS INT            --ҹ���׼�ʱ��λ����
DECLARE @DayCalcMinute AS INT               --�����ʱ����
DECLARE @NightCalcMinute AS INT             --ҹ���ʱ����
--DECLARE @�����ʱ��λ AS INT
--DECLARE @ҹ���ʱ��λ AS INT
DECLARE @DayStartTime AS CHAR(5)            --���쿪ʼʱ��
DECLARE @NightStartTime AS CHAR(5)          --ҹ�俪ʼʱ��
DECLARE @EVERYDAY_DAY_MINUTES AS INT
DECLARE @EVERYDAY_NIGHT_MINUTES AS INT
DECLARE @EVERYDAY_DAY_MONEY AS MONEY
DECLARE @EVERYDAY_NIGHT_MONEY AS MONEY
DECLARE @TOTAL_DAYS_MONEY AS MONEY
DECLARE @MINUTES AS INT
DECLARE @DAYS AS INT
DECLARE @TEMP_IN AS DATETIME
DECLARE @IN AS CHAR(5)
DECLARE @OUT AS CHAR(5)
DECLARE @SAME_DAY AS CHAR(5)
DECLARE @SAME_NIGHT AS CHAR(5)
DECLARE @TEMP_DAY1 AS VARCHAR(20)
DECLARE @TEMP_NIGHT1 AS VARCHAR(20)
DECLARE @TEMP_DAY2 AS VARCHAR(20)
DECLARE @TEMP_NIGHT2 AS VARCHAR(20)
DECLARE @DayStayMinutes INT          --����ͣ������
DECLARE @NightStayMinutes INT        --ҹ��ͣ������
DECLARE @ToAddMinutes INT            --�������
DECLARE @DayMoney AS MONEY           --�����շ�
DECLARE @NightMoney AS MONEY
DECLARE @SumMoney AS MONEY           --�ϼ��շ�
DECLARE @OvernightCharge AS MONEY    --��ҹ���ս��
--*
--���շѽ��=@StayDays_MONEY+@HOURS_MONEY
DECLARE @EVERYDAY_MONEY AS MONEY
DECLARE @DAYS_MONEY AS MONEY
DECLARE @HOURS_MONEY AS MONEY
SELECT @DayMoney = 0
SELECT @NightMoney = 0
SELECT @SumMoney = 0
SELECT @OvernightCharge = 0
SELECT @EVERYDAY_MONEY = 0
SELECT @DAYS_MONEY = 0
SELECT @HOURS_MONEY = 0
--*
IF LEFT(@CardType,4)=''MthT''
	BEGIN
		SELECT @CardType=REPLACE(@CardType,''MthT'',''T'')
	END 
--*
IF LEFT(@CardType,4)<>''Temp'' AND LEFT(@CardType,4)<>''Stor''
	BEGIN
		SELECT @SFJE=0
		RETURN
	END
SELECT @StayTotalMinutes=DATEDIFF(MINUTE,@InTime,@OutTime)
--�������ʱ��
SELECT TOP 1 @FreeMinute=FreeMinute FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
SELECT @FreeMinute=ISNULL(@FreeMinute,0)
IF @StayTotalMinutes<=@FreeMinute
	BEGIN
		SELECT @SFJE=0
		RETURN
	END
SELECT TOP 1 @TopSF=TopSF FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
SELECT @TopSF=ISNULL(@TopSF,0)
--*
SELECT TOP 1 @FreeTimeNoPay=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=30  
SELECT @FreeTimeNoPay=ISNULL(@FreeTimeNoPay,0)
IF @FreeTimeNoPay=1											
SELECT @InTime=DATEADD(MINUTE,@FreeMinute,@InTime)								
--*
--*
--�����ݿ��ȡ����
SELECT TOP 1 @MakeDayNight=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=40
SELECT @MakeDayNight=ISNULL(@MakeDayNight,0)
SELECT TOP 1 @IDCardSF=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=50
SELECT @IDCardSF=ISNULL(@IDCardSF,0)
SELECT TOP 1 @ChargeMode3=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=60
SELECT @ChargeMode3=ISNULL(@ChargeMode3,0)
SELECT TOP 1 @ChargeMode2=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=70
SELECT @ChargeMode2=ISNULL(@ChargeMode2,0)
SELECT TOP 1 @OvernightCharge=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=80
SELECT @OvernightCharge=ISNULL(@OvernightCharge,0)
SELECT TOP 1 @DayStartHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=31
SELECT @DayStartHour=ISNULL(@DayStartHour,0)
SELECT TOP 1 @NightStartHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=32
SELECT @NightStartHour=ISNULL(@NightStartHour,0)
SELECT TOP 1 @DayStartMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=41
SELECT @DayStartMinute=ISNULL(@DayStartMinute,0)
SELECT TOP 1 @NightStartMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=42
SELECT @NightStartHour=ISNULL(@NightStartHour,0)
SELECT TOP 1 @DayCalcUnitHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=51
SELECT @DayCalcUnitHour=ISNULL(@DayCalcUnitHour,0)
SELECT TOP 1 @NightCalcUnitHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=52
SELECT @NightCalcUnitHour=ISNULL(@NightCalcUnitHour,0)
SELECT TOP 1 @DayCalcUnitMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=61
SELECT @DayCalcUnitMinute=ISNULL(@DayCalcUnitMinute,0)
SELECT TOP 1 @NightCalcUnitMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=62
SELECT @NightCalcUnitMinute=ISNULL(@NightCalcUnitMinute,0)
SELECT TOP 1 @DayUnitTimeMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=71
SELECT @DayUnitTimeMoney=ISNULL(@DayUnitTimeMoney,0.00)
SELECT TOP 1 @NightUnitTimeMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=72
SELECT @NightUnitTimeMoney=ISNULL(@NightUnitTimeMoney,0.00)
SELECT TOP 1 @DayTopMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=81
SELECT @DayTopMoney=ISNULL(@DayTopMoney,0.00)
SELECT TOP 1 @NightTopMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=82
SELECT @NightTopMoney=ISNULL(@NightTopMoney,0.00)
SELECT TOP 1 @DayMinMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=91
SELECT @DayMinMoney=ISNULL(@DayMinMoney,0.00)
SELECT TOP 1 @NightMinMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=92
SELECT @NightMinMoney=ISNULL(@NightMinMoney,0.00)
SELECT TOP 1 @DayFirstUnitMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=101
SELECT @DayFirstUnitMoney=ISNULL(@DayFirstUnitMoney,0.00)
SELECT TOP 1 @NightFirstUnitMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=102
SELECT @NightFirstUnitMoney=ISNULL(@NightFirstUnitMoney,0.00)
SELECT TOP 1 @DayFirstUnitHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=111
SELECT @DayFirstUnitHour=ISNULL(@DayFirstUnitHour,0)
SELECT TOP 1 @NightFirstUnitHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=112
SELECT @NightFirstUnitHour=ISNULL(@NightFirstUnitHour,0)
SELECT TOP 1 @DayFirstUnitMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=121
SELECT @DayFirstUnitMinute=ISNULL(@DayFirstUnitMinute,0)
SELECT TOP 1 @NightFirstUnitMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=122
SELECT @NightFirstUnitMinute=ISNULL(@NightFirstUnitMinute,0)
select @DayFirstUnitMinute = @DayFirstUnitMinute + @DayFirstUnitHour*60
select @NightFirstUnitMinute = @NightFirstUnitMinute + @NightFirstUnitHour*60
SELECT @DayCalcMinute=@DayCalcUnitMinute+@DayCalcUnitHour*60
SELECT @NightCalcMinute=@NightCalcUnitMinute+@NightCalcUnitHour*60
--print ''@DayCalcMinute:'' + convert(varchar,@DayCalcMinute)
--print ''@NightCalcMinute:'' + convert(varchar,@NightCalcMinute)
SELECT @DayStartTime=CONVERT(CHAR(5),CONVERT(DATETIME,CONVERT(VARCHAR(2),@DayStartHour)+'':''+CONVERT(VARCHAR(2),@DayStartMinute)),8)
SELECT @NightStartTime=CONVERT(CHAR(5),CONVERT(DATETIME,CONVERT(VARCHAR(2),@NightStartHour)+'':''+CONVERT(VARCHAR(2),@NightStartMinute)),8)
SELECT @EVERYDAY_DAY_MINUTES=DATEDIFF(MINUTE,@DayStartTime,@NightStartTime) 
SELECT @EVERYDAY_NIGHT_MINUTES=DATEDIFF(MINUTE,''00:00'',@DayStartTime)+DATEDIFF(MINUTE,@NightStartTime,CONVERT(CHAR(10),DATEADD(DAY,1,@NightStartTime),120)+'' 00:00'')
--*
--��׼�շ� ============================================
IF @MakeDayNight=0 and @ChargeMode2=0 and @ChargeMode3=0 
BEGIN
	SELECT @StayDays=DATEDIFF(MINUTE,@InTime,@OutTime)/1440
	SELECT @StayHours=(DATEDIFF(MINUTE,@InTime,@OutTime) % 1440)/60	--ȥ��ͣ���������ͣ��Сʱ��
	IF ((DATEDIFF(MINUTE,@InTime,@OutTime) % 1440) % 60)>0			--����1Сʱ�İ�1Сʱ����
		SELECT @StayHours=@StayHours+1
	
	
	--����ͣ�������������
	
	SELECT TOP 1 @EVERYDAY_MONEY=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=24
	SELECT @EVERYDAY_MONEY=ISNULL(@EVERYDAY_MONEY,0)
	IF @EVERYDAY_MONEY>@TopSF
		SELECT @EVERYDAY_MONEY=@TopSF
	SELECT @DAYS_MONEY=@EVERYDAY_MONEY*@StayDays
	
	--�����ҹ���ս��
   set @OvernightCharge = DATEDIFF(DAY,@InTime,@OutTime) * @OvernightCharge
	
	--����ͣ��Сʱ���������
	SELECT TOP 1 @HOURS_MONEY=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=@StayHours
	SELECT @HOURS_MONEY=ISNULL(@HOURS_MONEY,0)
	IF @HOURS_MONEY>@TopSF
		SELECT @HOURS_MONEY=@TopSF
	--�ϼ�
	--SELECT @SFJE=@DAYS_MONEY+@HOURS_MONEY
	SELECT @SFJE=@DAYS_MONEY+@HOURS_MONEY+@OvernightCharge
	--GO
	RETURN
END
--�����շ� =============================================
IF @MakeDayNight=0 and @ChargeMode3=1 and @ChargeMode2=0
BEGIN
	SELECT @SFJE=@TopSF
	
	RETURN
END
--���趨ʱ���շ� ========================================
IF @MakeDayNight=0 and @ChargeMode3=0 and @ChargeMode2=1 
BEGIN
	SELECT @StayDays=DATEDIFF(MINUTE,@InTime,@OutTime)/1440
	
	SELECT @DayStayMinutes=DATEDIFF(MINUTE,@InTime,@OutTime) % 1440
	
	IF @StayDays=0 
		BEGIN
			IF @DayStayMinutes>@DayFirstUnitMinute
				BEGIN
					SELECT @StayHours=(@DayStayMinutes-@DayFirstUnitMinute)/@DayCalcUnitMinute	--ȥ��ͣ���������ͣ����λ��
					IF ((@DayStayMinutes-@DayFirstUnitMinute) % @DayCalcUnitMinute)>0			--����1����λ�İ�1����λ����
						SELECT @StayHours=@StayHours+1
					SELECT @HOURS_MONEY=@StayHours*@DayUnitTimeMoney+@DayFirstUnitMoney
				
				END
			ELSE
				BEGIN
					SELECT @HOURS_MONEY=@DayFirstUnitMoney
				END
		END 
	ELSE
		BEGIN
			SELECT @StayHours=@DayStayMinutes/@DayCalcUnitMinute	--ȥ��ͣ���������ͣ����λ��
			IF (@DayStayMinutes % @DayCalcUnitMinute)>0			--����1����λ�İ�1����λ����
				SELECT @StayHours=@StayHours+1
			SELECT @HOURS_MONEY=@StayHours*@DayUnitTimeMoney
		END
	
	--����ͣ�������������
	
	--SELECT TOP 1 @EVERYDAY_MONEY=��� FROM MYCHECHANGNORMALSHOUFEI WHERE ��Ƭ����=@��Ƭ���� AND Сʱ=24
	--SELECT @EVERYDAY_MONEY=ISNULL(@EVERYDAY_MONEY,0)
	--IF @EVERYDAY_MONEY>@TopSF
	SELECT @EVERYDAY_MONEY=@TopSF
	SELECT @DAYS_MONEY=@EVERYDAY_MONEY*@StayDays
	
	
	
	--����ͣ����λ���������
	
	IF @HOURS_MONEY>@TopSF
		SELECT @HOURS_MONEY=@TopSF
	
	--�ϼ�
	SELECT @SFJE=@DAYS_MONEY+@HOURS_MONEY
   print ''SFJE:'' + convert(varchar,@SFJE)
	--GO
	RETURN
END
--�ְ���ҹ����շ�============================================
--print ''@EVERYDAY_DAY_MINUTES:'' + convert(varchar,@EVERYDAY_DAY_MINUTES)
--print ''@EVERYDAY_NIGHT_MINUTES:'' + convert(varchar,@EVERYDAY_NIGHT_MINUTES)
--print ''@DayStartTime:'' + convert(varchar,@DayStartTime)
--print ''@NightStartTime:'' + convert(varchar,@NightStartTime)
declare @tmpHour as int
SELECT @TOTAL_DAYS_MONEY=0
SELECT @IN=CONVERT(CHAR(5),@InTime,8) --ȡ�볡��ʱ�䲿��
IF (@EVERYDAY_DAY_MINUTES % @DayCalcMinute)>0
   set @tmpHour = @EVERYDAY_DAY_MINUTES /@DayCalcMinute + 1
else
   set @tmpHour = @EVERYDAY_DAY_MINUTES /@DayCalcMinute   
--print ''@tmpHour1:'' + convert(varchar,@tmpHour)
if DATEDIFF(MINUTE,@DayStartTime,@IN)>=0 and DATEDIFF(MINUTE,@NightStartTime,@IN)<0  --�볡Ϊ����ʱ�Σ������Сʱ�շѣ����򲻼�
   if @DayCalcMinute > @DayFirstUnitMinute
      SELECT @EVERYDAY_DAY_MONEY=@tmpHour * @DayUnitTimeMoney + (@DayFirstUnitMoney - @DayUnitTimeMoney)
   else
	   SELECT @EVERYDAY_DAY_MONEY=@tmpHour * @DayUnitTimeMoney + (@DayFirstUnitMoney - @DayUnitTimeMoney * @DayFirstUnitMinute/@DayCalcMinute)
else
   SELECT @EVERYDAY_DAY_MONEY=@tmpHour * @DayUnitTimeMoney
--print ''@EVERYDAY_DAY_MONEY:'' + convert(varchar,@EVERYDAY_DAY_MONEY)
IF @EVERYDAY_DAY_MONEY>@DayTopMoney
	SELECT @EVERYDAY_DAY_MONEY=@DayTopMoney
IF (@EVERYDAY_NIGHT_MINUTES % @NightCalcMinute)>0
   set @tmpHour = @EVERYDAY_NIGHT_MINUTES / @NightCalcMinute + 1
else
   set @tmpHour = @EVERYDAY_NIGHT_MINUTES / @NightCalcMinute   
--print ''@tmpHour2:'' + convert(varchar,@tmpHour)
if DATEDIFF(MINUTE,@DayStartTime,@IN)>=0 and DATEDIFF(MINUTE,@NightStartTime,@IN)<0  --�볡Ϊ����ʱ�Σ��򲻼ӣ���ҹ��Σ����ҹ����Сʱ�շ�
   SELECT @EVERYDAY_NIGHT_MONEY=@tmpHour * @NightUnitTimeMoney
else
   if @NightCalcMinute > @NightFirstUnitMinute
      SELECT @EVERYDAY_NIGHT_MONEY=@tmpHour * @NightUnitTimeMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney)
   else
	   SELECT @EVERYDAY_NIGHT_MONEY=@tmpHour * @NightUnitTimeMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney * @NightFirstUnitMinute/@NightCalcMinute)
--print ''@EVERYDAY_NIGHT_MONEY:'' + convert(varchar,@EVERYDAY_NIGHT_MONEY)
IF @EVERYDAY_NIGHT_MONEY>@NightTopMoney
	SELECT @EVERYDAY_NIGHT_MONEY=@NightTopMoney
--ÿ������շ� = ÿ�����շ� + ÿҹ���շ�
SELECT @EVERYDAY_MONEY=@EVERYDAY_DAY_MONEY+@EVERYDAY_NIGHT_MONEY
IF @EVERYDAY_MONEY>@TopSF
	SELECT @EVERYDAY_MONEY=@TopSF
--����ͣ������
SELECT @StayDays=DATEDIFF(DAY,@InTime,@OutTime)
SELECT @TEMP_IN=DATEADD(DAY,@StayDays,@InTime)
IF DATEDIFF(MINUTE,@TEMP_IN,@OutTime)<0  --˵��С��24��Сʱ
	BEGIN
		SELECT @TEMP_IN=DATEADD(DAY,-1,@TEMP_IN)
		SELECT @StayDays=@StayDays-1
	END
print ''@StayDays:'' + convert(varchar,@StayDays)
if @StayDays>1  --����ÿ�����춼�������׼�ʱ�շѣ�����Ҫ�Ѻ�����׼�ʱ�շѼ���
   if DATEDIFF(MINUTE,@DayStartTime,@IN)>=0 and DATEDIFF(MINUTE,@NightStartTime,@IN)<0  --�볡Ϊ����ʱ��
	   if @DayCalcMinute > @DayFirstUnitMinute 
	      SELECT @TOTAL_DAYS_MONEY=@StayDays*@EVERYDAY_MONEY - (@StayDays-1) * (@DayFirstUnitMoney - @DayUnitTimeMoney)
	   else
	      SELECT @TOTAL_DAYS_MONEY=@StayDays*@EVERYDAY_MONEY - (@StayDays-1) * (@DayFirstUnitMoney - @DayUnitTimeMoney * (@DayFirstUnitMinute/@DayCalcMinute))
	else  --�볡Ϊҹ��
      if @NightCalcMinute > @NightFirstUnitMinute 
	      SELECT @TOTAL_DAYS_MONEY=@StayDays*@EVERYDAY_MONEY - (@StayDays-1) * (@NightFirstUnitMoney - @NightUnitTimeMoney)
	   else
	      SELECT @TOTAL_DAYS_MONEY=@StayDays*@EVERYDAY_MONEY - (@StayDays-1) * (@NightFirstUnitMoney - @NightUnitTimeMoney * (@NightFirstUnitMinute/@NightCalcMinute))
else
   SELECT @TOTAL_DAYS_MONEY=@StayDays*@EVERYDAY_MONEY
--print ''@TOTAL_DAYS_MONEY:'' + convert(varchar,@TOTAL_DAYS_MONEY)
--0..7..21..0..7..21..0
--���������ࣺ���������ͬ�Ͳ���ͬ��ָ������<24Сʱ�ģ�����24Сʱ���Ѱ����촦���ˣ�
--���ͬ�գ��������볡ʱ�Σ�0..7..21..0 ��ÿ��ʱ���ְ�����ͬ�ĳ���ʱ��
--��1��0..7�룺 0..7����7..21����21..0��
--��2��7..21�룺7..21����21..0��
--��3��21..0�룺21..0��
--�����ͬ�գ�Ҳ�������볡ʱ�Σ�0..7..21..0 ��ÿ��ʱ���ְ�����ͬ�ĳ���ʱ��
--��1��0..7�룺 ����0..7��
--��2��7..21�룺����0..7����7..21��
--��3��21..0�룺����0..7����7..21����21..0��
--�����Σ����졢ҹ�䣩
IF DATEDIFF(DAY,@TEMP_IN,@OutTime)=0
	--ͬ��
	BEGIN
		SELECT @SAME_DAY=@DayStartTime		--07:00
		SELECT @SAME_NIGHT=@NightStartTime		--21:00
		SELECT @IN=CONVERT(CHAR(5),@TEMP_IN,8)
		SELECT @OUT=CONVERT(CHAR(5),@OutTime,8)
		
		IF DATEDIFF(MINUTE,@SAME_DAY,@IN)<0   -----00:00~07:00 �� =======================================================================
			--00:00~07:00��
			BEGIN
				IF DATEDIFF(MINUTE,@SAME_DAY,@OUT)<=0   --00:00~07:00 �� >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					--00:00~07:00��
					BEGIN
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@IN,@OUT)
						SELECT @DayStayMinutes=0
						
						--print ''@NightFirstUnitMinute��'' + convert(varchar,@NightFirstUnitMinute)
						--print ''@NightStayMinutes��'' + convert(varchar,@NightStayMinutes)   
                  
						if @StayDays=0 and @NightFirstUnitMinute>0 and @NightStayMinutes>0  --ֻ�е�һ�����Ҫ��ȡ��Сʱ�շ�
                     set @NightMoney = @NightFirstUnitMoney
						--print ''@ҹ���׼�ʱ��λ�շѣ�'' + convert(varchar,@NightMoney)   
                  if (@StayDays=0 and @NightStayMinutes > @NightFirstUnitMinute) or @StayDays>0
                  begin
                     if @StayDays=0
                        set @NightStayMinutes = @NightStayMinutes - @NightFirstUnitMinute    --ȥ���׼�ʱ��λ���ʣ�����
                     IF (@NightStayMinutes % @NightCalcMinute)>0
								SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute+1)*@NightUnitTimeMoney
							ELSE
								SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute)*@NightUnitTimeMoney
                  end	                  
                  --print ''@NightMoney2��'' + convert(varchar,@NightMoney) 
	                  
                  
                  /*if @StayDays=0
                  begin
	                  if @NightFirstUnitMinute>0 and @NightStayMinutes>0  --ֻ�е�һ�����Ҫ��ȡ��Сʱ�շ�
	                     set @NightMoney = @NightFirstUnitMoney
	
							--print ''@ҹ���׼�ʱ��λ�շѣ�'' + convert(varchar,@NightMoney)   
	
	                  if @NightStayMinutes > @NightFirstUnitMinute
	                  begin
	                     set @NightStayMinutes = @NightStayMinutes - @NightFirstUnitMinute    --ȥ���׼�ʱ��λ���ʣ�����
	                     IF (@NightStayMinutes % @NightCalcMinute)>0
									SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute+1)*@NightUnitTimeMoney
								ELSE
									SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute)*@NightUnitTimeMoney
	                  end	                  
	                  --print ''@NightMoney2��'' + convert(varchar,@NightMoney) 
                  end
                  else
                  begin
                     IF (@NightStayMinutes % @NightCalcMinute)>0
									SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute+1)*@NightUnitTimeMoney
								ELSE
									SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute)*@NightUnitTimeMoney
                     --print ''@NightMoney3��'' + convert(varchar,@NightMoney) 
                  end
						*/
	
                  /*				
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney						
						
                  if @StayDays=0 --  ֻ�е�һ�����Ҫ��ȡ��Сʱ�շ�
                  begin		
							IF @NightStayMinutes>0	
                        if @NightCalcMinute > @NightFirstUnitMinute  --**************************************************************************
									SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney)
							   else
							      SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney * (@NightFirstUnitMinute/@NightCalcMinute))
								--SELECT @NightMoney=@NightMoney+(@NightFirstUnitMoney-@NightUnitTimeMoney)											
                  end
						*/
					
						IF @NightMoney>@NightTopMoney
						SELECT @NightMoney=@NightTopMoney
						
						IF @NightMoney<@NightMinMoney
						SELECT @NightMoney=@NightMinMoney						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@TopSF
							SELECT @SumMoney=@TopSF
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						--print ''1:'' + convert(varchar,@SFJE)
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@SAME_DAY,@OUT)>0 AND DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)<=0   --07:00~21:00 �� >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					--07:00~21:00�� 	ҹ��������
					BEGIN
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@IN,@SAME_DAY)
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@SAME_DAY,@OUT)
						--print ''@DayStayMinutes:'' + convert(varchar,@DayStayMinutes)
						--print ''@NightStayMinutes:'' + convert(varchar,@NightStayMinutes)
                  
					   --print ''@NightFirstUnitMinute��'' + convert(varchar,@NightFirstUnitMinute)
                  
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
                  
						if @StayDays=0 and @NightFirstUnitMinute>0 and @NightStayMinutes>0  --ֻ�е�һ�����Ҫ��ȡ��Сʱ�շ�
                     set @NightMoney = @NightFirstUnitMoney
						--print ''@ҹ���׼�ʱ��λ�շѣ�'' + convert(varchar,@NightMoney)   
                  if (@StayDays=0 and @NightStayMinutes > @NightFirstUnitMinute) or @StayDays>0
                  begin
                     if @StayDays=0
                        set @NightStayMinutes = @NightStayMinutes - @NightFirstUnitMinute    --ȥ���׼�ʱ��λ���ʣ�����
                     IF (@NightStayMinutes % @NightCalcMinute)>0
								SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute+1)*@NightUnitTimeMoney
							ELSE
								SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute)*@NightUnitTimeMoney
                  end	                  
                  --print ''@NightMoney2��'' + convert(varchar,@NightMoney) 
                  
						/*--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						if @StayDays=0
                  begin
							--IF @DayStayMinutes>0	
                     --   if @DayCalcMinute > @DayFirstUnitMinute
							--		  SELECT @DayMoney = @DayMoney + (@DayFirstUnitMoney - @DayUnitTimeMoney)
							--   else
							--      SELECT @DayMoney = @DayMoney + (@DayFirstUnitMoney - @DayUnitTimeMoney * (@DayFirstUnitMinute/@DayCalcMinute))							
							IF @NightStayMinutes>0	
                        if @NightCalcMinute > @NightFirstUnitMinute
									SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney)
							   else
							      SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney * (@NightFirstUnitMinute/@NightCalcMinute))
							   --SELECT @NightMoney=@NightMoney+(@NightFirstUnitMoney-@NightUnitTimeMoney)							
						end
						*/
                  
						IF @DayStayMinutes>0	
                  begin
							IF @DayMoney>@DayTopMoney
								SELECT @DayMoney=@DayTopMoney
							IF @DayMoney<@DayMinMoney
								SELECT @DayMoney=@DayMinMoney
                  end
                  IF @NightStayMinutes>0
						begin
							IF @NightMoney>@NightTopMoney
								SELECT @NightMoney=@NightTopMoney
							IF @NightMoney<@NightMinMoney
								SELECT @NightMoney=@NightMinMoney						
						end
	
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@TopSF
							SELECT @SumMoney=@TopSF
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						--print ''2:'' + convert(varchar,@SFJE)
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)>0  --21:00~����00:00 �� >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					--21:00~����00:00�� 	�������ҹ��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@SAME_DAY,@SAME_NIGHT)
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@IN,@SAME_DAY)+DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)
						--print ''@DayStayMinutes:'' + convert(varchar,@DayStayMinutes)
						--print ''@NightStayMinutes:'' + convert(varchar,@NightStayMinutes)
                  
					   --print ''@NightFirstUnitMinute��'' + convert(varchar,@NightFirstUnitMinute)
                  
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney                  
						
						if @StayDays=0 and @NightFirstUnitMinute>0 and @NightStayMinutes>0  --ֻ�е�һ�����Ҫ��ȡ��Сʱ�շ�
                     set @NightMoney = @NightFirstUnitMoney
						--print ''@ҹ���׼�ʱ��λ�շѣ�'' + convert(varchar,@NightMoney)   
                  if (@StayDays=0 and @NightStayMinutes > @NightFirstUnitMinute) or @StayDays>0
                  begin
                     if @StayDays=0
                        set @NightStayMinutes = @NightStayMinutes - @NightFirstUnitMinute    --ȥ���׼�ʱ��λ���ʣ�����
                     IF (@NightStayMinutes % @NightCalcMinute)>0
								SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute+1)*@NightUnitTimeMoney
							ELSE
								SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute)*@NightUnitTimeMoney
                  end	
                  --print ''@DayMoney��'' + convert(varchar,@DayMoney)                  
                  --print ''@NightMoney��'' + convert(varchar,@NightMoney)
						
                  /*
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						if @StayDays=0
                  begin						
							--IF @DayStayMinutes>0		
							--   if	@DayCalcMinute = 30
							--      SELECT @DayMoney=@DayMoney+(@DayFirstUnitMoney-@DayUnitTimeMoney*2)
	                  --   else
	                  --      SELECT @DayMoney=@DayMoney+(@DayFirstUnitMoney-@DayUnitTimeMoney)
							IF @NightStayMinutes>0	
                        if @NightCalcMinute > @NightFirstUnitMinute
									SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney)
							   else
							      SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney * (@NightFirstUnitMinute/@NightCalcMinute))
							   --SELECT @NightMoney=@NightMoney+(@NightFirstUnitMoney-@NightUnitTimeMoney)	
						end
						*/
						IF @DayStayMinutes>0	
                  begin
							IF @DayMoney>@DayTopMoney
								SELECT @DayMoney=@DayTopMoney
							IF @DayMoney<@DayMinMoney
								SELECT @DayMoney=@DayMinMoney
                  end
                  IF @NightStayMinutes>0
						begin
							IF @NightMoney>@NightTopMoney
								SELECT @NightMoney=@NightTopMoney
							IF @NightMoney<@NightMinMoney
								SELECT @NightMoney=@NightMinMoney						
						end
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@TopSF
							SELECT @SumMoney=@TopSF
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						--print ''3:'' + convert(varchar,@SFJE)
						RETURN
						--//
					END
			END
		
		IF DATEDIFF(MINUTE,@SAME_DAY,@IN)>=0 AND DATEDIFF(MINUTE,@SAME_NIGHT,@IN)<0  ---07:00~21:00 �� ==========================================
			--07:00~21:00��
			BEGIN
				IF DATEDIFF(MINUTE,@SAME_DAY,@OUT)>=0 AND DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)<=0  --07:00~21:00 �� >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					--07:00~21:00��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@IN,@OUT)
						SELECT @NightStayMinutes=0
                  --print ''@DayFirstUnitMinute��'' + convert(varchar,@DayFirstUnitMinute)
						--print ''@DayStayMinutes��'' + convert(varchar,@DayStayMinutes)                                     
                  
                  if @StayDays=0 and @DayFirstUnitMinute>0 and @DayStayMinutes>0  --ֻ�е�һ�����Ҫ��ȡ��Сʱ�շ�
                     set @DayMoney = @DayFirstUnitMoney
						--print ''@�����׼�ʱ��λ�շѣ�'' + convert(varchar,@DayMoney) 
                  --if @DayFirstUnitMinute>0 and @DayStayMinutes>0
                  --   set @DayMoney = @DayFirstUnitMoney
						--print ''@DayMoney1��'' + convert(varchar,@DayMoney)   
                  if (@StayDays=0 and @DayStayMinutes > @DayFirstUnitMinute) or @StayDays>0
                  begin
                     if @StayDays=0
                        set @DayStayMinutes = @DayStayMinutes - @DayFirstUnitMinute    --ȥ���׼�ʱ��λ���ʣ�����
                     IF (@DayStayMinutes % @DayCalcMinute)>0
								SELECT @DayMoney=@DayMoney + (@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
							ELSE
								SELECT @DayMoney=@DayMoney + (@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
                  end	
                  --print ''@DayMoney��'' + convert(varchar,@DayMoney)                  
                  --print ''@NightMoney��'' + convert(varchar,@NightMoney)
                  --if @DayStayMinutes > @DayFirstUnitMinute
                  --begin
                  --   set @DayStayMinutes = @DayStayMinutes - @DayFirstUnitMinute    --ȥ���׼�ʱ��λ���ʣ�����
                  --   IF (@DayStayMinutes % @DayCalcMinute)>0
						--		SELECT @DayMoney=@DayMoney + (@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						--	ELSE
						--		SELECT @DayMoney=@DayMoney + (@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
                  --end                  
                  --print ''@DayMoney2��'' + convert(varchar,@DayMoney)   
                  /*
						--==================================
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
												
						print ''@DayMoney1��'' + convert(varchar,@DayMoney)                  						
                  
                  if @StayDays=0
                  begin
							IF @DayStayMinutes>0
                        if @DayCalcMinute > @DayFirstUnitMinute  --**************************************************************************
									SELECT @DayMoney = @DayMoney + @DayFirstUnitMoney  --(@DayFirstUnitMoney - @DayUnitTimeMoney)
							   else
							      SELECT @DayMoney = @DayMoney + (@DayFirstUnitMoney - @DayUnitTimeMoney * (@DayFirstUnitMinute/@DayCalcMinute))
														   
                  end                  
						print ''@DayMoney2��'' + convert(varchar,@DayMoney) 
                  --//////////////////////////////////////////////////////////
                  */
                 						
						IF @DayStayMinutes>0	
                  begin
							IF @DayMoney>@DayTopMoney
								SELECT @DayMoney=@DayTopMoney
							IF @DayMoney<@DayMinMoney
								SELECT @DayMoney=@DayMinMoney
                  end
	
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						--print ''@SumMoney'' + convert(varchar,@SumMoney)                  						
						IF @SumMoney>@TopSF
							SELECT @SumMoney=@TopSF
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						--print convert(varchar,@SFJE)
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)>0   --21:00~����00:00 �� >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					--21:00~����00:00��	�������ҹ��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@IN,@SAME_NIGHT)
						--�������ҹ��
						--IF @DayStayMinutes % @DayCalcMinute>0
						--	SELECT @ToAddMinutes=@DayCalcMinute-(@DayStayMinutes%@DayCalcMinute)				
						--ELSE
						--	SELECT @ToAddMinutes=0
						--SELECT @SAME_NIGHT=CONVERT(CHAR(5),DATEADD(MINUTE,@ToAddMinutes,@SAME_NIGHT),8) 
						-------------------------
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)
						--print ''@DayStayMinutes:'' + convert(varchar,@DayStayMinutes)
						--print ''@NightStayMinutes:'' + convert(varchar,@NightStayMinutes)
                  
                  --�ȼ�����Сʱ�շ�
                  if @StayDays=0 and @DayFirstUnitMinute>0 and @DayStayMinutes>0  --ֻ�е�һ�����Ҫ��ȡ��Сʱ�շ�
                     set @DayMoney = @DayFirstUnitMoney
						--print ''@�����׼�ʱ��λ�շѣ�'' + convert(varchar,@DayMoney) 
                  
                  --��������շ�
                  if (@StayDays=0 and @DayStayMinutes > @DayFirstUnitMinute) or @StayDays>0
                  begin
                     if @StayDays=0
                        set @DayStayMinutes = @DayStayMinutes - @DayFirstUnitMinute    --ȥ���׼�ʱ��λ���ʣ�����
                     IF (@DayStayMinutes % @DayCalcMinute)>0
								SELECT @DayMoney=@DayMoney + (@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
							ELSE
								SELECT @DayMoney=@DayMoney + (@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
                  end                  
                  --print ''@DayMoney��'' + convert(varchar,@DayMoney) 
                  
                  --����ҹ���շ�
                  IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
                  --print ''@NightMoney��'' + convert(varchar,@NightMoney)
                  /*
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						if @StayDays=0
                  begin
							IF @DayStayMinutes>0	
								if @DayCalcMinute > @DayFirstUnitMinute  --**************************************************************************
									SELECT @DayMoney = @DayMoney + (@DayFirstUnitMoney - @DayUnitTimeMoney)
							   else
							      SELECT @DayMoney = @DayMoney + (@DayFirstUnitMoney - @DayUnitTimeMoney * (@DayFirstUnitMinute/@DayCalcMinute))	
						end			
                  */
						IF @DayStayMinutes>0	
                  begin
							IF @DayMoney>@DayTopMoney
								SELECT @DayMoney=@DayTopMoney
							IF @DayMoney<@DayMinMoney
								SELECT @DayMoney=@DayMinMoney
                  end
                  IF @NightStayMinutes>0
						begin
							IF @NightMoney>@NightTopMoney
								SELECT @NightMoney=@NightTopMoney
							IF @NightMoney<@NightMinMoney
								SELECT @NightMoney=@NightMinMoney						
						end
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@TopSF
							SELECT @SumMoney=@TopSF
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						--print convert(varchar,@SFJE)
						RETURN
						--//
					END
			END
		
		IF DATEDIFF(MINUTE,@SAME_NIGHT,@IN)>=0  --21:00~����00:00 ��   ===============================================================
			--21:00~����00:00��
			BEGIN
				IF DATEDIFF(MINUTE,@SAME_NIGHT,@OUT)>=0   --21:00~����00:00 �� >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					--21:00~����00:00��
					BEGIN
						SELECT @DayStayMinutes=0
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@IN,@OUT)
                  --print ''@DayStayMinutes:'' + convert(varchar,@DayStayMinutes)
						--print ''@NightStayMinutes:'' + convert(varchar,@NightStayMinutes)
                  
					   --print ''@NightFirstUnitMinute��'' + convert(varchar,@NightFirstUnitMinute)                  
						                  
						if @StayDays=0 and @NightFirstUnitMinute>0 and @NightStayMinutes>0  --ֻ�е�һ�����Ҫ��ȡ��Сʱ�շ�
                     set @NightMoney = @NightFirstUnitMoney
						--print ''@ҹ���׼�ʱ��λ�շѣ�'' + convert(varchar,@NightMoney)   
                  if (@StayDays=0 and @NightStayMinutes > @NightFirstUnitMinute) or @StayDays>0
                  begin
                     if @StayDays=0
                        set @NightStayMinutes = @NightStayMinutes - @NightFirstUnitMinute    --ȥ���׼�ʱ��λ���ʣ�����
                     IF (@NightStayMinutes % @NightCalcMinute)>0
								SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute+1)*@NightUnitTimeMoney
							ELSE
								SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute)*@NightUnitTimeMoney
                  end	
                  --print ''@DayMoney��'' + convert(varchar,@DayMoney)                  
                  --print ''@NightMoney��'' + convert(varchar,@NightMoney)
                  /*
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
								
						if @StayDays=0
                  begin							
							IF @NightStayMinutes>0	
                        if @NightCalcMinute > @NightFirstUnitMinute
									SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney)
							   else
							      SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney * (@NightFirstUnitMinute/@NightCalcMinute))							   
						end
						*/
                  IF @NightStayMinutes>0
						begin
							IF @NightMoney>@NightTopMoney
								SELECT @NightMoney=@NightTopMoney
							IF @NightMoney<@NightMinMoney
								SELECT @NightMoney=@NightMinMoney						
						end						
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@TopSF
							SELECT @SumMoney=@TopSF
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
			END
	END
ELSE --#############################################################################################
	--����(ֻ��һ�죬ʱ��ָ�����������Ϊ��ͬ����)
	BEGIN
		SELECT @TEMP_DAY1=CONVERT(CHAR(10),@TEMP_IN,120) +'' ''+@DayStartTime		--����07:00
		SELECT @TEMP_NIGHT1=CONVERT(CHAR(10),@TEMP_IN,120)+'' ''+@NightStartTime		--ҹ��21:00
		--����
		SELECT @TEMP_DAY2=CONVERT(CHAR(10),@OutTime,120) +'' ''+@DayStartTime	--����07:00
		SELECT @TEMP_NIGHT2=CONVERT(CHAR(10),@OutTime,120)+'' ''+@NightStartTime	--ҹ��21:00
		IF DATEDIFF(MINUTE,@TEMP_DAY1,@TEMP_IN)<0   --00:00~07:00 �� ================================================================
			--00:00~07:00��
			BEGIN
				IF DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)<=0  --��(��)��00:00~07:00 �� >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					--��(��)��00:00~07:00��	�������ҹ��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@TEMP_DAY1,@TEMP_NIGHT1)
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@TEMP_DAY1)+DATEDIFF(MINUTE,@TEMP_NIGHT1,@OutTime)
                  
						--print ''@DayStayMinutes:'' + convert(varchar,@DayStayMinutes)
						--print ''@NightStayMinutes:'' + convert(varchar,@NightStayMinutes)                  
					   --print ''@NightFirstUnitMinute��'' + convert(varchar,@NightFirstUnitMinute)              
						
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
                  
						if @StayDays=0 and @NightFirstUnitMinute>0 and @NightStayMinutes>0  --ֻ�е�һ�����Ҫ��ȡ��Сʱ�շ�
                     set @NightMoney = @NightFirstUnitMoney
						--print ''@ҹ���׼�ʱ��λ�շѣ�'' + convert(varchar,@NightMoney)   
                  if (@StayDays=0 and @NightStayMinutes > @NightFirstUnitMinute) or @StayDays>0
                  begin
                     if @StayDays=0
                        set @NightStayMinutes = @NightStayMinutes - @NightFirstUnitMinute    --ȥ���׼�ʱ��λ���ʣ�����
                     IF (@NightStayMinutes % @NightCalcMinute)>0
								SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute+1)*@NightUnitTimeMoney
							ELSE
								SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute)*@NightUnitTimeMoney
                  end	
                  --print ''@DayMoney��'' + convert(varchar,@DayMoney)                  
                  --print ''@NightMoney��'' + convert(varchar,@NightMoney)
						/*
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						if @StayDays=0
                  begin
							IF @NightStayMinutes>0	
                        if @NightCalcMinute > @NightFirstUnitMinute
									SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney)
							   else
							      SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney * (@NightFirstUnitMinute/@NightCalcMinute))
							   --SELECT @NightMoney=@NightMoney+(@NightFirstUnitMoney-@NightUnitTimeMoney)							
						end
						*/
						IF @DayStayMinutes>0	
                  begin
							IF @DayMoney>@DayTopMoney
								SELECT @DayMoney=@DayTopMoney
							IF @DayMoney<@DayMinMoney
								SELECT @DayMoney=@DayMinMoney
                  end
                  IF @NightStayMinutes>0
						begin
							IF @NightMoney>@NightTopMoney
								SELECT @NightMoney=@NightTopMoney
							IF @NightMoney<@NightMinMoney
								SELECT @NightMoney=@NightMinMoney						
						end
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@TopSF
							SELECT @SumMoney=@TopSF
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
			END
		IF DATEDIFF(MINUTE,@TEMP_DAY1,@TEMP_IN)>=0 AND DATEDIFF(MINUTE,@TEMP_NIGHT1,@TEMP_IN)<0  --07:00~21:00 �� =================================================
			--07:00~21:00��
			BEGIN
				IF DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)<=0   --��(��)��00:00~07:00 �� >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					--��(��)��00:00~07:00��	�������ҹ��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@TEMP_NIGHT1)
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_NIGHT1,@OutTime)
						--print ''@DayStayMinutes:'' + convert(varchar,@DayStayMinutes)
						--print ''@NightStayMinutes:'' + convert(varchar,@NightStayMinutes)
                  
                  --�ȼ�����Сʱ�շ�
                  if @StayDays=0 and @DayFirstUnitMinute>0 and @DayStayMinutes>0  --ֻ�е�һ�����Ҫ��ȡ��Сʱ�շ�
                     set @DayMoney = @DayFirstUnitMoney
						--print ''@�����׼�ʱ��λ�շѣ�'' + convert(varchar,@DayMoney) 
                  
                  --��������շ�
                  if (@StayDays=0 and @DayStayMinutes > @DayFirstUnitMinute) or @StayDays>0
                  begin
                     if @StayDays=0
                        set @DayStayMinutes = @DayStayMinutes - @DayFirstUnitMinute    --ȥ���׼�ʱ��λ���ʣ�����
                     IF (@DayStayMinutes % @DayCalcMinute)>0
								SELECT @DayMoney=@DayMoney + (@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
							ELSE
								SELECT @DayMoney=@DayMoney + (@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
                  end                  
                  --print ''@DayMoney��'' + convert(varchar,@DayMoney) 
                  
                  --����ҹ���շ�
                  IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
                  --print ''@NightMoney��'' + convert(varchar,@NightMoney)
                  /*
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						if @StayDays=0
                  begin							
							IF @NightStayMinutes>0	
                        if @NightCalcMinute > @NightFirstUnitMinute
									SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney)
							   else
							      SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney * (@NightFirstUnitMinute/@NightCalcMinute))
								--SELECT @NightMoney=@NightMoney+(@NightFirstUnitMoney-@NightUnitTimeMoney)	
						end
						*/
						IF @DayStayMinutes>0	
                  begin
							IF @DayMoney>@DayTopMoney
								SELECT @DayMoney=@DayTopMoney
							IF @DayMoney<@DayMinMoney
								SELECT @DayMoney=@DayMinMoney
                  end
                  IF @NightStayMinutes>0
						begin
							IF @NightMoney>@NightTopMoney
								SELECT @NightMoney=@NightTopMoney
							IF @NightMoney<@NightMinMoney
								SELECT @NightMoney=@NightMinMoney						
						end	
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@TopSF
							SELECT @SumMoney=@TopSF
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						--print ''@SFJE6��'' + convert(varchar,@SFJE)
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)>0 AND DATEDIFF(MINUTE,@TEMP_NIGHT2,@OutTime)<=0   --��(��)��07:00~21:00 �� >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					--��(��)��07:00~21:00��	ҹ��������
					BEGIN
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_NIGHT1,@TEMP_DAY2)
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@TEMP_NIGHT1)+DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)
						--print ''@DayStayMinutes:'' + convert(varchar,@DayStayMinutes)
						--print ''@NightStayMinutes:'' + convert(varchar,@NightStayMinutes)
                  
                  --�ȼ�����Сʱ�շ�
                  if @StayDays=0 and @DayFirstUnitMinute>0 and @DayStayMinutes>0  --ֻ�е�һ�����Ҫ��ȡ��Сʱ�շ�
                     set @DayMoney = @DayFirstUnitMoney
						--print ''@�����׼�ʱ��λ�շѣ�'' + convert(varchar,@DayMoney) 
                  
                  --��������շ�
                  if (@StayDays=0 and @DayStayMinutes > @DayFirstUnitMinute) or @StayDays>0
                  begin
                     if @StayDays=0
                        set @DayStayMinutes = @DayStayMinutes - @DayFirstUnitMinute    --ȥ���׼�ʱ��λ���ʣ�����
                     IF (@DayStayMinutes % @DayCalcMinute)>0
								SELECT @DayMoney=@DayMoney + (@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
							ELSE
								SELECT @DayMoney=@DayMoney + (@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
                  end                  
                  --print ''@DayMoney��'' + convert(varchar,@DayMoney) 
                  
                  --����ҹ���շ�
                  IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
                  --print ''@NightMoney��'' + convert(varchar,@NightMoney)
						/*
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						if @StayDays=0
                  begin							
							IF @NightStayMinutes>0	
                        if @NightCalcMinute > @NightFirstUnitMinute
									SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney)
							   else
							      SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney * (@NightFirstUnitMinute/@NightCalcMinute))
								--SELECT @NightMoney=@NightMoney+(@NightFirstUnitMoney-@NightUnitTimeMoney)	
						end
						*/
						IF @DayStayMinutes>0	
                  begin
							IF @DayMoney>@DayTopMoney
								SELECT @DayMoney=@DayTopMoney
							IF @DayMoney<@DayMinMoney
								SELECT @DayMoney=@DayMinMoney
                  end
                  IF @NightStayMinutes>0
						begin
							IF @NightMoney>@NightTopMoney
								SELECT @NightMoney=@NightTopMoney
							IF @NightMoney<@NightMinMoney
								SELECT @NightMoney=@NightMinMoney						
						end
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@TopSF
							SELECT @SumMoney=@TopSF
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						--print ''@SFJE7��'' + convert(varchar,@SFJE)
						RETURN
						--//
					END
			END
		IF DATEDIFF(MINUTE,@TEMP_NIGHT1,@TEMP_IN)>=0   -- 21:00~��(��)��00:00 �� =====================================================================
			--21:00~��(��)��00:00��
			BEGIN
				IF DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)<=0   --��(��)��00:00~07:00 �� >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					--��(��)��00:00~07:00��
					BEGIN
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@OutTime)
						SELECT @DayStayMinutes=0
						--print ''@DayStayMinutes:'' + convert(varchar,@DayStayMinutes)
						--print ''@NightStayMinutes:'' + convert(varchar,@NightStayMinutes)                  
					   --print ''@NightFirstUnitMinute��'' + convert(varchar,@NightFirstUnitMinute)
                
						if @StayDays=0 and @NightFirstUnitMinute>0 and @NightStayMinutes>0  --ֻ�е�һ�����Ҫ��ȡ��Сʱ�շ�
                     set @NightMoney = @NightFirstUnitMoney
						--print ''@ҹ���׼�ʱ��λ�շѣ�'' + convert(varchar,@NightMoney)   
                  if (@StayDays=0 and @NightStayMinutes > @NightFirstUnitMinute) or @StayDays>0
                  begin
                     if @StayDays=0
                        set @NightStayMinutes = @NightStayMinutes - @NightFirstUnitMinute    --ȥ���׼�ʱ��λ���ʣ�����
                     IF (@NightStayMinutes % @NightCalcMinute)>0
								SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute+1)*@NightUnitTimeMoney
							ELSE
								SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute)*@NightUnitTimeMoney
                  end	
                  --print ''@DayMoney��'' + convert(varchar,@DayMoney)                  
                  --print ''@NightMoney��'' + convert(varchar,@NightMoney)
						/*
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						if @StayDays=0
                  begin							
							IF @NightStayMinutes>0	
                        if @NightCalcMinute > @NightFirstUnitMinute
									SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney)
							   else
							      SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney * (@NightFirstUnitMinute/@NightCalcMinute))
								--SELECT @NightMoney=@NightMoney+(@NightFirstUnitMoney-@NightUnitTimeMoney)	
						end
						*/
						IF @DayStayMinutes>0	
                  begin
							IF @DayMoney>@DayTopMoney
								SELECT @DayMoney=@DayTopMoney
							IF @DayMoney<@DayMinMoney
								SELECT @DayMoney=@DayMinMoney
                  end
                  IF @NightStayMinutes>0
						begin
							IF @NightMoney>@NightTopMoney
								SELECT @NightMoney=@NightTopMoney
							IF @NightMoney<@NightMinMoney
								SELECT @NightMoney=@NightMinMoney						
						end	
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@TopSF
							SELECT @SumMoney=@TopSF
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)>0 AND DATEDIFF(MINUTE,@TEMP_NIGHT2,@OutTime)<=0  --��(��)��07:00~21:00 �� >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					--��(��)��07:00~21:00��	ҹ��������
					BEGIN
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@TEMP_DAY2)
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@TEMP_DAY2,@OutTime)
                  
						--print ''@DayStayMinutes:'' + convert(varchar,@DayStayMinutes)
						--print ''@NightStayMinutes:'' + convert(varchar,@NightStayMinutes)                  
					   --print ''@NightFirstUnitMinute��'' + convert(varchar,@NightFirstUnitMinute)              
						
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
                  
						if @StayDays=0 and @NightFirstUnitMinute>0 and @NightStayMinutes>0  --ֻ�е�һ�����Ҫ��ȡ��Сʱ�շ�
                     set @NightMoney = @NightFirstUnitMoney
						--print ''@ҹ���׼�ʱ��λ�շѣ�'' + convert(varchar,@NightMoney)   
                  if (@StayDays=0 and @NightStayMinutes > @NightFirstUnitMinute) or @StayDays>0
                  begin
                     if @StayDays=0
                        set @NightStayMinutes = @NightStayMinutes - @NightFirstUnitMinute    --ȥ���׼�ʱ��λ���ʣ�����
                     IF (@NightStayMinutes % @NightCalcMinute)>0
								SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute+1)*@NightUnitTimeMoney
							ELSE
								SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute)*@NightUnitTimeMoney
                  end	
                  --print ''@DayMoney��'' + convert(varchar,@DayMoney)                  
                  --print ''@NightMoney��'' + convert(varchar,@NightMoney)
                  /*
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						if @StayDays=0
                  begin							
							IF @NightStayMinutes>0	
                        if @NightCalcMinute > @NightFirstUnitMinute
									SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney)
							   else
							      SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney * (@NightFirstUnitMinute/@NightCalcMinute))
								--SELECT @NightMoney=@NightMoney+(@NightFirstUnitMoney-@NightUnitTimeMoney)							
						end
						*/
						IF @DayStayMinutes>0	
                  begin
							IF @DayMoney>@DayTopMoney
								SELECT @DayMoney=@DayTopMoney
							IF @DayMoney<@DayMinMoney
								SELECT @DayMoney=@DayMinMoney
                  end
                  IF @NightStayMinutes>0
						begin
							IF @NightMoney>@NightTopMoney
								SELECT @NightMoney=@NightTopMoney
							IF @NightMoney<@NightMinMoney
								SELECT @NightMoney=@NightMinMoney						
						end	
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@TopSF
							SELECT @SumMoney=@TopSF
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
				IF DATEDIFF(MINUTE,@TEMP_NIGHT2,@OutTime)>0   --��(��)��21:00~00:00 �� >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
					--��(��)��21:00~00:00��	�������ҹ��
					BEGIN
						SELECT @DayStayMinutes=DATEDIFF(MINUTE,@TEMP_DAY2,@TEMP_NIGHT2)
						SELECT @NightStayMinutes=DATEDIFF(MINUTE,@TEMP_IN,@TEMP_DAY2)+DATEDIFF(MINUTE,@TEMP_NIGHT2,@OutTime)
						--print ''@DayStayMinutes:'' + convert(varchar,@DayStayMinutes)
						--print ''@NightStayMinutes:'' + convert(varchar,@NightStayMinutes)                  
					   --print ''@NightFirstUnitMinute��'' + convert(varchar,@NightFirstUnitMinute)        
						
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
                  
						if @StayDays=0 and @NightFirstUnitMinute>0 and @NightStayMinutes>0  --ֻ�е�һ�����Ҫ��ȡ��Сʱ�շ�
                     set @NightMoney = @NightFirstUnitMoney
						--print ''@ҹ���׼�ʱ��λ�շѣ�'' + convert(varchar,@NightMoney)   
                  if (@StayDays=0 and @NightStayMinutes > @NightFirstUnitMinute) or @StayDays>0
                  begin
                     if @StayDays=0
                        set @NightStayMinutes = @NightStayMinutes - @NightFirstUnitMinute    --ȥ���׼�ʱ��λ���ʣ�����
                     IF (@NightStayMinutes % @NightCalcMinute)>0
								SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute+1)*@NightUnitTimeMoney
							ELSE
								SELECT @NightMoney=@NightMoney + (@NightStayMinutes /@NightCalcMinute)*@NightUnitTimeMoney
                  end	
                  --print ''@DayMoney��'' + convert(varchar,@DayMoney)                  
                  --print ''@NightMoney��'' + convert(varchar,@NightMoney)
						
						/*
						--//
						IF (@DayStayMinutes % @DayCalcMinute)>0
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute+1)*@DayUnitTimeMoney
						ELSE
							SELECT @DayMoney=(@DayStayMinutes /@DayCalcMinute)*@DayUnitTimeMoney
						
						IF (@NightStayMinutes % @NightCalcMinute)>0
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute+1)*@NightUnitTimeMoney
						ELSE
							SELECT @NightMoney=(@NightStayMinutes/ @NightCalcMinute)*@NightUnitTimeMoney
						
						if @StayDays=0
                  begin							
							IF @NightStayMinutes>0	
                        if @NightCalcMinute > @NightFirstUnitMinute
									SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney)
							   else
							      SELECT @NightMoney = @NightMoney + (@NightFirstUnitMoney - @NightUnitTimeMoney * (@NightFirstUnitMinute/@NightCalcMinute))
								--SELECT @NightMoney=@NightMoney+(@NightFirstUnitMoney-@NightUnitTimeMoney)	
						end
						*/
						IF @DayStayMinutes>0	
                  begin
							IF @DayMoney>@DayTopMoney
								SELECT @DayMoney=@DayTopMoney
							IF @DayMoney<@DayMinMoney
								SELECT @DayMoney=@DayMinMoney
                  end
                  IF @NightStayMinutes>0
						begin
							IF @NightMoney>@NightTopMoney
								SELECT @NightMoney=@NightTopMoney
							IF @NightMoney<@NightMinMoney
								SELECT @NightMoney=@NightMinMoney						
						end	
						SELECT @SumMoney=@DayMoney+@NightMoney
						
						IF @SumMoney>@TopSF
							SELECT @SumMoney=@TopSF
						
						SELECT @SFJE=@TOTAL_DAYS_MONEY+@SumMoney
						RETURN
						--//
					END
			END
	END
' 
END
GO


/****** Object:  StoredProcedure [dbo].[JJCT_GETMONEY]    Script Date: 10/10/2015 18:07:48 ******/
--IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[JJCT_GETMONEY]') AND type in (N'P', N'PC'))
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[JJCT_GETMONEY]') and OBJECTPROPERTY(id, N'IsProcedure') = 1)
DROP PROCEDURE [dbo].[JJCT_GETMONEY]
GO

/****** Object:  StoredProcedure [dbo].[JJCT_GETMONEY]    Script Date: 10/10/2015 18:07:48 ******/
SET ANSI_NULLS OFF
GO

SET QUOTED_IDENTIFIER OFF
GO

--�����ͬ������������Сʱ����
--�����С���㣬����㵥λΪ���ǡ�
--2015-10-10 ��5.1���µ��շѽű�����
--2015-10-16 ���ı����շ�JJCGETMONEYBEIJING������ҹ�ֽ��ͣ�ţ�ͣ��ʱ�䲻����ҹ�ֽ��ǰ��1����ʱ��λ�����ֽ��ǰ���շѱ�׼�ͼ�ʱ��λ�շ�
--2015-10-19 ����JJCT_GETMONEY�ı�׼�ְ���ҹ����շѣ��ϸ񰴶��շѣ�ֻ��һ���׼�ʱ��ÿ����������շѶ����İ�����շ���
--2017-12-07 JJCT_GETMONEY �ְ���ҹ����շѣ����ӡ��ϸ񰴶��շ�(���ж�ÿ������޶�)���Ĺ���

CREATE   PROCEDURE [dbo].[JJCT_GETMONEY]
@CardType VARCHAR(10),
@InTime DATETIME,
@OutTime DATETIME,
@OutMoney MONEY OUTPUT
 AS

set nocount on

set @OutMoney = 0
 
DECLARE @StayDays AS INT					--ͣ������
DECLARE @StayHours AS INT					--ͣ��Сʱ��
DECLARE @StayTotalMinutes AS INT			--��ͣ��������

DECLARE @FreeMinute AS INT					--��ѷ���
DECLARE @MaxMoney AS MONEY					--�������

--*
DECLARE @FreeTimeNoPay AS INT 				--���ʱ�䲻�Ʒ�
DECLARE @MakeDayNight AS INT 				--�ְ���ҹ���
DECLARE @IDCardSF AS INT 					--ID���շ�
DECLARE @ChargeMode3 AS INT 				--�����շ�
DECLARE @ChargeMode2 AS INT 				--���趨ʱ��Ʒ�	

DECLARE @DayStartHour AS INT				--���쿪ʼСʱ
DECLARE @NightStartHour AS INT				--ҹ�俪ʼСʱ
DECLARE @DayStartMinute AS INT				--���쿪ʼ����
DECLARE @NightStartMinute AS INT			--ҹ�俪ʼ����
DECLARE @DayCalcUnitHour AS INT				--�����ʱ��λСʱ
DECLARE @NightCalcUnitHour AS INT			--ҹ���ʱ��λСʱ
DECLARE @DayCalcUnitMinute AS INT			--�����ʱ��λ����
DECLARE @NightCalcUnitMinute AS INT			--ҹ���ʱ��λ����
DECLARE @DayUnitTimeMoney AS MONEY			--����ÿ��ʱ��λ�շѶ�
DECLARE @NightUnitTimeMoney AS MONEY		--ҹ��ÿ��ʱ��λ�շѶ�	
DECLARE @DayMaxMoney AS MONEY				--��������շѶ�
DECLARE @NightMaxMoney AS MONEY				--ҹ������շѶ�

DECLARE @DayFirstUnitMoney AS MONEY			--�����׼�ʱ��λ�շѶ�
DECLARE @NightFirstUnitMoney AS MONEY		--ҹ���׼�ʱ��λ�շѶ�
DECLARE @DayMinMoney AS MONEY				--��������շѶ�
DECLARE @NightMinMoney AS MONEY				--ҹ������շѶ�

DECLARE @DayFirstUnitHour AS INT			--�����׼�ʱ��λСʱ
DECLARE @NightFirstUnitHour AS INT			--ҹ���׼�ʱ��λСʱ
DECLARE @DayFirstUnitMinute AS INT			--�����׼�ʱ��λ����
DECLARE @NightFirstUnitMinute AS INT		--ҹ���׼�ʱ��λ����

DECLARE @DayCalcMinute AS INT				--�����ʱ����
DECLARE @NightCalcMinute AS INT				--ҹ���ʱ����
--DECLARE @�����ʱ��λ AS INT
--DECLARE @ҹ���ʱ��λ AS INT

DECLARE @DayStartTime AS CHAR(5)				--���쿪ʼʱ��
DECLARE @NightStartTime AS CHAR(5)				--ҹ�俪ʼʱ��

DECLARE @EVERYDAY_DAY_MINUTES AS INT
DECLARE @EVERYDAY_NIGHT_MINUTES AS INT

DECLARE @EVERYDAY_DAY_MONEY AS MONEY
DECLARE @EVERYDAY_NIGHT_MONEY AS MONEY

DECLARE @TOTAL_DAYS_MONEY AS MONEY

DECLARE @MINUTES AS INT
DECLARE @DAYS AS INT
DECLARE @TEMP_IN AS DATETIME

DECLARE @IN AS CHAR(5)
DECLARE @OUT AS CHAR(5)

DECLARE @SAME_DAY AS CHAR(5)
DECLARE @SAME_NIGHT AS CHAR(5)

DECLARE @TEMP_DAY1 AS VARCHAR(20)
DECLARE @TEMP_NIGHT1 AS VARCHAR(20)

DECLARE @TEMP_DAY2 AS VARCHAR(20)
DECLARE @TEMP_NIGHT2 AS VARCHAR(20)

DECLARE @DayStayMinutes INT						--����ͣ������
DECLARE @NightStayMinutes INT					--ҹ��ͣ������
DECLARE @ToAddMinutes INT						--�������

DECLARE @DayMoney AS MONEY						--�����շ�
DECLARE @NightMoney AS MONEY					--ҹ���շ�
DECLARE @SumMoney AS MONEY						--�ϼ��շ�

DECLARE @OvernightCharge AS MONEY					--��ҹ���ս��

DECLARE @StrictSegment as int     --�ϸ񰴶��շѣ����ж�ÿ������޶� 2017-12-07
set @StrictSegment = 0

--*

--���շѽ��=@StayDays_MONEY+@HOURS_MONEY
DECLARE @EVERYDAY_MONEY AS MONEY
DECLARE @DAYS_MONEY AS MONEY
DECLARE @HOURS_MONEY AS MONEY

SELECT @DayMoney = 0
SELECT @NightMoney = 0
SELECT @SumMoney = 0

SELECT @OvernightCharge = 0

SELECT @EVERYDAY_MONEY = 0
SELECT @DAYS_MONEY = 0
SELECT @HOURS_MONEY = 0

--*
IF LEFT(@CardType,3)='Mtp'
	BEGIN
		SELECT @CardType=REPLACE(@CardType,'Mtp','Tmp')
	END 
--*
IF LEFT(@CardType,3)<>'Tmp' AND LEFT(@CardType,3)<>'Str'
	BEGIN
		SELECT @OutMoney=0
		RETURN
	END
	
	
	
SELECT @StayTotalMinutes=DATEDIFF(MINUTE,@InTime,@OutTime)	

SELECT TOP 1 @FreeMinute=FreeMinute FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
SELECT @FreeMinute=ISNULL(@FreeMinute,0)
	
SELECT TOP 1 @ChargeMode3=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=60
SELECT @ChargeMode3=ISNULL(@ChargeMode3,0)

SELECT TOP 1 @MaxMoney=TopSF FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
SELECT @MaxMoney=ISNULL(@MaxMoney,0)

--�����շ�
if @ChargeMode3 =1 
begin
	if @FreeMinute = 0
   	   SELECT @OutMoney=@MaxMoney
    else
    begin
       IF @StayTotalMinutes<=@FreeMinute
			SELECT @OutMoney=0			
       else
         SELECT @OutMoney=@MaxMoney	
    end
	RETURN
end

--�������ʱ��
IF @StayTotalMinutes<=@FreeMinute
BEGIN
	SELECT @OutMoney=0
	RETURN
END
--*
SELECT TOP 1 @FreeTimeNoPay=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=30  
SELECT @FreeTimeNoPay=ISNULL(@FreeTimeNoPay,0)
IF @FreeTimeNoPay=1											
SELECT @InTime=DATEADD(MINUTE,@FreeMinute,@InTime)						
--*
--*
--�����ݿ��ȡ����
SELECT TOP 1 @MakeDayNight=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=40
SELECT @MakeDayNight=ISNULL(@MakeDayNight,0)
SELECT TOP 1 @IDCardSF=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=50
SELECT @IDCardSF=ISNULL(@IDCardSF,0)
SELECT TOP 1 @ChargeMode3=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=60
SELECT @ChargeMode3=ISNULL(@ChargeMode3,0)
SELECT TOP 1 @ChargeMode2=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=70
SELECT @ChargeMode2=ISNULL(@ChargeMode2,0)
SELECT TOP 1 @OvernightCharge=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=80
SELECT @OvernightCharge=ISNULL(@OvernightCharge,0)
SELECT TOP 1 @DayStartHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=31
SELECT @DayStartHour=ISNULL(@DayStartHour,0)
SELECT TOP 1 @NightStartHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=32
SELECT @NightStartHour=ISNULL(@NightStartHour,0)
SELECT TOP 1 @DayStartMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=41
SELECT @DayStartMinute=ISNULL(@DayStartMinute,0)
SELECT TOP 1 @NightStartMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=42
SELECT @NightStartMinute=ISNULL(@NightStartMinute,0)
SELECT TOP 1 @DayCalcUnitHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=51
SELECT @DayCalcUnitHour=ISNULL(@DayCalcUnitHour,0)
SELECT TOP 1 @NightCalcUnitHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=52
SELECT @NightCalcUnitHour=ISNULL(@NightCalcUnitHour,0)
SELECT TOP 1 @DayCalcUnitMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=61
SELECT @DayCalcUnitMinute=ISNULL(@DayCalcUnitMinute,0)
SELECT TOP 1 @NightCalcUnitMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=62
SELECT @NightCalcUnitMinute=ISNULL(@NightCalcUnitMinute,0)
SELECT TOP 1 @DayUnitTimeMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=71
SELECT @DayUnitTimeMoney=ISNULL(@DayUnitTimeMoney,0.00)
SELECT TOP 1 @NightUnitTimeMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=72
SELECT @NightUnitTimeMoney=ISNULL(@NightUnitTimeMoney,0.00)
SELECT TOP 1 @DayMaxMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=81
SELECT @DayMaxMoney=ISNULL(@DayMaxMoney,0.00)
SELECT TOP 1 @NightMaxMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=82
SELECT @NightMaxMoney=ISNULL(@NightMaxMoney,0.00)
SELECT TOP 1 @DayMinMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=91
SELECT @DayMinMoney=ISNULL(@DayMinMoney,0.00)
SELECT TOP 1 @NightMinMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=92
SELECT @NightMinMoney=ISNULL(@NightMinMoney,0.00)
SELECT TOP 1 @DayFirstUnitMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=101
SELECT @DayFirstUnitMoney=ISNULL(@DayFirstUnitMoney,0.00)
SELECT TOP 1 @NightFirstUnitMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=102
SELECT @NightFirstUnitMoney=ISNULL(@NightFirstUnitMoney,0.00)
SELECT TOP 1 @DayFirstUnitHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=111
SELECT @DayFirstUnitHour=ISNULL(@DayFirstUnitHour,0)
SELECT TOP 1 @NightFirstUnitHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=112
SELECT @NightFirstUnitHour=ISNULL(@NightFirstUnitHour,0)
SELECT TOP 1 @DayFirstUnitMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=121
SELECT @DayFirstUnitMinute=ISNULL(@DayFirstUnitMinute,0)
SELECT TOP 1 @NightFirstUnitMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=122
SELECT @NightFirstUnitMinute=ISNULL(@NightFirstUnitMinute,0)

--2017-12-07
SELECT TOP 1 @StrictSegment=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=131
SELECT @StrictSegment=ISNULL(@StrictSegment,0)



IF @MakeDayNight=0 and @ChargeMode3=0 and @ChargeMode2=1    --2013-05-31
begin
	select @DayFirstUnitMinute = @DayFirstUnitMinute
	select @NightFirstUnitMinute = @NightFirstUnitMinute

	SELECT @DayCalcMinute=@DayCalcUnitMinute
	SELECT @NightCalcMinute=@NightCalcUnitMinute
end
else
begin
	select @DayFirstUnitMinute = @DayFirstUnitMinute + @DayFirstUnitHour*60
	select @NightFirstUnitMinute = @NightFirstUnitMinute + @NightFirstUnitHour*60

	SELECT @DayCalcMinute=@DayCalcUnitMinute+@DayCalcUnitHour*60
	SELECT @NightCalcMinute=@NightCalcUnitMinute+@NightCalcUnitHour*60
end

--print '@DayCalcMinute:' + convert(varchar,@DayCalcMinute)
--print '@NightCalcMinute:' + convert(varchar,@NightCalcMinute)

SELECT @DayStartTime=CONVERT(CHAR(5),CONVERT(DATETIME,CONVERT(VARCHAR(2),@DayStartHour)+':'+CONVERT(VARCHAR(2),@DayStartMinute)),8)
SELECT @NightStartTime=CONVERT(CHAR(5),CONVERT(DATETIME,CONVERT(VARCHAR(2),@NightStartHour)+':'+CONVERT(VARCHAR(2),@NightStartMinute)),8)

SELECT @EVERYDAY_DAY_MINUTES=DATEDIFF(MINUTE,@DayStartTime,@NightStartTime) 
SELECT @EVERYDAY_NIGHT_MINUTES=DATEDIFF(MINUTE,'00:00',@DayStartTime)+DATEDIFF(MINUTE,@NightStartTime,CONVERT(CHAR(10),DATEADD(DAY,1,@NightStartTime),120)+' 00:00')

--*

--��׼�շ� ============================================
IF @MakeDayNight=0 and @ChargeMode3=0 and @ChargeMode2=0 
BEGIN
	SELECT @StayDays=DATEDIFF(MINUTE,@InTime,@OutTime)/1440
	SELECT @StayHours=(DATEDIFF(MINUTE,@InTime,@OutTime) % 1440)/60	--ȥ��ͣ���������ͣ��Hours��
	IF ((DATEDIFF(MINUTE,@InTime,@OutTime) % 1440) % 60)>0			--����1Hours�İ�1Hours����
		SELECT @StayHours=@StayHours+1
	
	
	--����ͣ�������������
	
	SELECT TOP 1 @EVERYDAY_MONEY=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=24
	SELECT @EVERYDAY_MONEY=ISNULL(@EVERYDAY_MONEY,0)
	IF @EVERYDAY_MONEY>@MaxMoney
		SELECT @EVERYDAY_MONEY=@MaxMoney
	SELECT @DAYS_MONEY=@EVERYDAY_MONEY*@StayDays
	
	--�����ҹ���ս��
   set @OvernightCharge = DATEDIFF(DAY,@InTime,@OutTime) * @OvernightCharge
	
	--����ͣ��Hours���������
	SELECT TOP 1 @HOURS_MONEY=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=@StayHours
	SELECT @HOURS_MONEY=ISNULL(@HOURS_MONEY,0)
	IF @HOURS_MONEY>@MaxMoney
		SELECT @HOURS_MONEY=@MaxMoney
	--�ϼ�
	--SELECT @OutMoney=@DAYS_MONEY+@HOURS_MONEY
	SELECT @OutMoney=@DAYS_MONEY+@HOURS_MONEY+@OvernightCharge
	--GO
	RETURN
END

--�����շ� =============================================
IF @MakeDayNight=0 and @ChargeMode3=1 and @ChargeMode2=0
BEGIN
	SELECT @OutMoney=@MaxMoney
	
	RETURN
END

--���趨ʱ���շ� =====2016-04-20 ��������Ĳ���ÿ������շ�����===================================
IF @MakeDayNight=0 and @ChargeMode3=0 and @ChargeMode2=1 
BEGIN
	SELECT @DayStayMinutes=DATEDIFF(MINUTE,@InTime,@OutTime) --% 1440	
	
	print '@DayStayMinutes:' + convert(varchar,@DayStayMinutes)
	
	--�����һ������շ� �� ֮��ÿ������շ�  -----------------------------------
	declare @FirstDayTopMoney as money   --��һ������շ�
	declare @SecondDayTopMoney as money  --֮��ÿ������շ� 
	
	SELECT @StayHours=(1440-@DayFirstUnitMinute)/@DayCalcMinute	--ȥ���׼�ʱ���ͣ��Сʱ��
	IF ((1440-@DayFirstUnitMinute) % @DayCalcMinute)>0			--����1����λ�İ�1����λ����
		SELECT @StayHours=@StayHours+1
	
	print '@StayHours:' + convert(varchar,@StayHours)
	
	SELECT @FirstDayTopMOney=@StayHours*@DayUnitTimeMoney+@DayFirstUnitMoney   
   --print '@FirstDayTopMOney:' + convert(varchar,@FirstDayTopMOney)
   		
	if @FirstDayTopMOney > @MaxMoney
	   set @FirstDayTopMOney = @MaxMoney
	print '@FirstDayTopMOney:' + convert(varchar,@FirstDayTopMOney)
	
	
	SELECT @StayHours=1440/@DayCalcMinute	
	IF (1440 % @DayCalcMinute)>0			--����1����λ�İ�1����λ����
		SELECT @StayHours=@StayHours+1	
	print '@StayHours:' + convert(varchar,@StayHours)
	
	SELECT @SecondDayTopMoney=@StayHours*@DayUnitTimeMoney
   --print '@SecondDayTopMoney:' + convert(varchar,@SecondDayTopMoney)
   		
	if @SecondDayTopMoney > @MaxMoney
	   set @SecondDayTopMoney = @MaxMoney
	print '@SecondDayTopMoney:' + convert(varchar,@SecondDayTopMoney)
	---------------------------------------------------------------------------	
	
	
	SELECT @StayDays=DATEDIFF(MINUTE,@InTime,@OutTime)/1440
	
	SELECT @DayStayMinutes=DATEDIFF(MINUTE,@InTime,@OutTime) % 1440
	
	IF @StayDays=0 
		BEGIN
			IF @DayStayMinutes>@DayFirstUnitMinute
				BEGIN
					SELECT @StayHours=(@DayStayMinutes-@DayFirstUnitMinute)/@DayCalcMinute	--ȥ��ͣ���������ͣ����λ��
					IF ((@DayStayMinutes-@DayFirstUnitMinute) % @DayCalcMinute)>0			--����1����λ�İ�1����λ����
						SELECT @StayHours=@StayHours+1
					SELECT @HOURS_MONEY=@StayHours*@DayUnitTimeMoney+@DayFirstUnitMoney
				
				END
			ELSE
				BEGIN
					SELECT @HOURS_MONEY=@DayFirstUnitMoney					
				END
		END 
	ELSE
		BEGIN
			SELECT @StayHours=@DayStayMinutes/@DayCalcMinute	--ȥ��ͣ���������ͣ����λ��
			IF (@DayStayMinutes % @DayCalcMinute)>0			--����1����λ�İ�1����λ����
				SELECT @StayHours=@StayHours+1
			SELECT @HOURS_MONEY=@StayHours*@DayUnitTimeMoney
		END
	
	--����ͣ����λ���������	
	IF @HOURS_MONEY>@MaxMoney
		SELECT @HOURS_MONEY=@MaxMoney
	print '@HOURS_MONEY:' + convert(varchar,@HOURS_MONEY)
	
	if @StayDays = 0    --����Ϊ0
	begin
		set @DAYS_MONEY = 0
	end
	else if @StayDays <=1    --����Ϊ1�������շѾ�Ϊ��һ������շ�
	begin
		set @DAYS_MONEY = @FirstDayTopMOney
	end
	else     --�������1���������շ�Ϊ��һ������շѣ������Ժ�ÿ������շ�
	begin
	   set @DAYS_MONEY = @FirstDayTopMOney + (@StayDays-1) * @SecondDayTopMoney
	end
	
	print '@DAYS_MONEY:' + convert(varchar,@DAYS_MONEY)		
	
	--�����ҹ���ս��  2015-12-05
   set @OvernightCharge = DATEDIFF(DAY,@InTime,@OutTime) * @OvernightCharge		
	
	--�ϼ�
	SELECT @OutMoney=@DAYS_MONEY+@HOURS_MONEY+@OvernightCharge
	print '@OutMoney:' + convert(varchar,@OutMoney)
	RETURN	
END


------�ְ���ҹ���================================================================================================
 
   declare @TmpInTime as datetime
   declare @TmpOutTime as datetime
   declare @�Ƿ�������Сʱ�շ� as int  --0:û�� 1��������Сʱ��
   declare @InTimePart AS CHAR(5)  --�볡��ʱ�䲿�֣��� 08:30
   declare @N as int   
   
   set @N =0	

   set @�Ƿ�������Сʱ�շ� = 0

   SELECT @StayDays=DATEDIFF(MINUTE,@InTime,@OutTime)/1440
   SELECT @StayTotalMinutes=(DATEDIFF(MINUTE,@InTime,@OutTime) % 1440)	--ȥ��ͣ���������ͣ��������
	
	--2017-07-07 ÿ������շѲ��ܴ��ڰ������+ҹ�����
	if @MaxMoney > @DayMaxMoney + @NightMaxMoney
		set @MaxMoney = @DayMaxMoney + @NightMaxMoney
	
   --2015-10-16   
	if @StrictSegment = 0 and @StayDays>0
   begin
		if @StayTotalMinutes = 0  --����������
      begin
			set @OutMoney = @StayDays * @MaxMoney
			print '@OutMoney: ' + convert(varchar,@OutMoney)
			return
      end

		set @InTime = DATEADD(day,@StayDays,@InTime)
		set @�Ƿ�������Сʱ�շ� = 1
   end
	

	--set @InTime = DATEADD(MINUTE,-(@���쿪ʼСʱ * 60 + @���쿪ʼ����),@InTime)
	--set @OutTime = DATEADD(MINUTE,-(@���쿪ʼСʱ * 60 + @���쿪ʼ����),@OutTime)
   
	print '�޸ĺ��볡ʱ��:' + convert(varchar,@InTime,120)
   print '�޸ĺ����ʱ��:' + convert(varchar,@OutTime,120)
	
	
	set @TmpInTime = @InTime
   
   print '@TmpInTime: ' + convert(varchar,@TmpInTime,120)

   /*
   SELECT @InTimePart=CONVERT(CHAR(5),@TmpInTime,8) --ȡ�볡��ʱ�䲿��         

   if DATEDIFF(MINUTE,@DayStartTime,@InTimePart)>=0 and DATEDIFF(MINUTE,@NightStartTime,@InTimePart)<0  --�볡Ϊ����   
   begin
      set @TmpInTime = dateadd(minute,@DayFirstUnitMinute,@TmpInTime)
   end
   else
   begin
		set @TmpInTime = dateadd(minute,@NightFirstUnitMinute,@TmpInTime)
   end
	print '@TmpInTime: ' + convert(varchar,@TmpInTime,120)

   if datediff(minute,@TmpInTime,@OutTime)<=0
      set @N = @N +1
   */   

	declare @����շ� AS money      
   declare @��һ���� as varchar(10)
   
   set @DayMoney = 0
   set @NightMoney = 0
   set @��һ���� = ''
	set @����շ�=0        

	while @N<1
	begin  
	      --if datediff(minute,@TmpInTime,@OutTime)<=0
	      --   SELECT @InTimePart=CONVERT(CHAR(5),@OutTime,8)  --ȡ������ʱ�䲿��         
	      --else
        SELECT @InTimePart=CONVERT(CHAR(5),@TmpInTime,8) --ȡ�볡��ʱ�䲿��
		
	     if DATEDIFF(MINUTE,@DayStartTime,@InTimePart)>=0 and DATEDIFF(MINUTE,@NightStartTime,@InTimePart)<0  --�볡Ϊ����
	      begin
	         --print '����==='
            
            if @��һ���� = '' or @��һ���� ='ҹ��'
            begin
               --set @������ʱ�� = 0
               set @NightMoney = @NightMoney + @����շ�
               --print '@NightMoney: ' + convert(varchar,@NightMoney)
               set @����շ� =0   
               --set @�Ƿ�������Сʱ�շ� = 0            
            end

            if @�Ƿ�������Сʱ�շ� = 0   --û����Сʱ�շ�
            begin
					--����ټ��� @�����׼�ʱ��λ���� �ͻ�絽ҹ��εĻ����ǾͰ� @TmpInTime ��ֵΪ ҹ�俪ʼʱ��
			      if DATEDIFF(MINUTE,@NightStartTime,@InTimePart)<0 and DATEDIFF(MINUTE,@NightStartTime,dateadd(minute,@DayFirstUnitMinute,@InTimePart))>=0
		         begin
		             set @TmpInTime = convert(varchar,@TmpInTime,23) + ' ' + @NightStartTime                     
		         end
		         else
	            begin                   
		             set @TmpInTime = dateadd(minute,@DayFirstUnitMinute,@TmpInTime)                
	            end
            end
            else
            begin
	            --����ټ��� @�����ʱ���� �ͻ�絽ҹ��εĻ����ǾͰ� @TmpInTime ��ֵΪ ҹ�俪ʼʱ��
			      if DATEDIFF(MINUTE,@NightStartTime,@InTimePart)<0 and DATEDIFF(MINUTE,@NightStartTime,dateadd(minute,@DayCalcMinute,@InTimePart))>=0
		         begin
		             set @TmpInTime = convert(varchar,@TmpInTime,23) + ' ' + @NightStartTime                     
		         end
		         else
	            begin                   
		             set @TmpInTime = dateadd(minute,@DayCalcMinute,@TmpInTime)                
	            end
            end
            
	         --print '@TmpInTime: ' + convert(varchar,@TmpInTime,120)				

	         if @�Ƿ�������Сʱ�շ� = 0   --û����Сʱ�շ�
	         begin
          	   --print '������Сʱ����'					

	            set @����շ� = @����շ� + @DayFirstUnitMoney
	            set @�Ƿ�������Сʱ�շ� = 1
               ----print '@����շ�: ' + convert(varchar,@����շ�)
	         end
	         else  --������Сʱ�շ�
	         begin
	            --print '���չ���Сʱ����'              

               set @����շ� = @����շ� + @DayUnitTimeMoney	            
	         end
	         
            if @����շ�>@DayMaxMoney
               set @����շ� = @DayMaxMoney

            --print '@����շ�: ' + convert(varchar,@����շ�)     

            set @��һ���� = '����'    
            
	      end      
         else  ----�볡Ϊҹ��------------------------------------------------------------------------
	      begin
	         --print 'ҹ��==='

			if @��һ���� = '' or @��һ���� ='����'
            begin
               set @DayMoney = @DayMoney + @����շ�
               set @����շ� =0		
               --set @�Ƿ�������Сʱ�շ� =0
               --print '@DayMoney: ' + convert(varchar,@DayMoney)
            end

            if @�Ƿ�������Сʱ�շ� = 0   --û����Сʱ�շ�
            begin
               --����ټ��� @ҹ���׼�ʱ��λ���� �ͻ�絽����εĻ����ǾͰ� @TmpOutTime ��ֵΪ ���쿪ʼʱ��
			      if DATEDIFF(MINUTE,@DayStartTime,@InTimePart)<0 and DATEDIFF(MINUTE,@DayStartTime,dateadd(minute,@NightFirstUnitMinute,@InTimePart))>=0
		         begin               
			         set @TmpInTime = convert(varchar,@TmpInTime,23) + ' ' + @DayStartTime
		         end
		         else
	            begin
		            set @TmpInTime = dateadd(minute,@NightFirstUnitMinute,@TmpInTime)
	            end
            end
            else
            begin
	            --����ټ��� @ҹ���ʱ���� �ͻ�絽����εĻ����ǾͰ� @TmpOutTime ��ֵΪ ���쿪ʼʱ��
			      if DATEDIFF(MINUTE,@DayStartTime,@InTimePart)<0 and DATEDIFF(MINUTE,@DayStartTime,dateadd(minute,@NightCalcMinute,@InTimePart))>=0
		         begin               
			         set @TmpInTime = convert(varchar,@TmpInTime,23) + ' ' + @DayStartTime
		         end
		         else
	            begin
		            set @TmpInTime = dateadd(minute,@NightCalcMinute,@TmpInTime)
	            end
            end
            
	         --print '@TmpInTime: ' + convert(varchar,@TmpInTime,120)    


            if @�Ƿ�������Сʱ�շ� = 0   --û����Сʱ�շ�
		 		begin
               --print '������Сʱ����'					

	            set @����շ� = @����շ� + @NightFirstUnitMoney
	            set @�Ƿ�������Сʱ�շ� = 1
               ----print '@����շ�: ' + convert(varchar,@����շ�)
		      end
	         else  --������Сʱ�շ�
			   begin
			      --print '���չ���Сʱ����'
					
               set @����շ� = @����շ� + @NightUnitTimeMoney
			   end	 

            if @����շ�>@NightMaxMoney
                set @����շ� = @NightMaxMoney

  	         --print '@����շ�: ' + convert(varchar,@����շ�)
            

            set @��һ���� = 'ҹ��'
	      end   
    
         --�˳�ѭ��
	      if datediff(minute,@TmpInTime,@OutTime)<=0
         begin
            --print '�˳�ѭ��'
            break
	      end
	      --print '  '
	end  --while



   SELECT @InTimePart=CONVERT(CHAR(5),@OutTime,8) --ȡ������ʱ�䲿��
	
   --if DATEDIFF(MINUTE,@DayStartTime,@InTimePart)>=0 and DATEDIFF(MINUTE,@NightStartTime,@InTimePart)<0  --����Ϊ����
   if @��һ���� ='����'
      set @DayMoney = @DayMoney + @����շ�
   else
      set @NightMoney = @NightMoney + @����շ�

       /* if @������ = '1'
           set @DayMoney = @DayMoney - @DayMaxMoney

        if @��ҹ��� = '1'
           set @NightMoney = @NightMoney - @NightMaxMoney
	*/

	set @OutMoney = @DayMoney + @NightMoney

   if @StrictSegment = 0
   begin
		if @OutMoney > @MaxMoney
			set @OutMoney = @MaxMoney	
		
		set @OutMoney = @OutMoney + @StayDays * @MaxMoney
   end
   
   --print ''
	print '@DayMoney: ' + convert(varchar,@DayMoney)
	print '@NightMoney: ' + convert(varchar,@NightMoney)
	print '�����շѽ��: ' + convert(varchar,@OutMoney)

   return

GO


/****** Object:  StoredProcedure [dbo].[JJCSZSTANDARD_2006]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCSZSTANDARD_2006]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE PROCEDURE [dbo].[JJCSZSTANDARD_2006]
@CPH NVARCHAR(20),
@CardType NVARCHAR(10),
@InTime DATETIME,
@OutTime DATETIME,
@SFJE AS MONEY OUTPUT
AS
SET DATEFIRST 7
IF (@OutTime<=@InTime)
BEGIN
   SET @SFJE=0
   RETURN
END
DECLARE @WDINT AS INTEGER
SET     @WDINT=2
DECLARE @FreeTime AS INTEGER
DECLARE @CarParkType AS CHAR(1)         --��������� 1����ṫ���ࡢ��ʱ��ͣ����   2��סլ��ͣ����
DECLARE @BREAK_DATETIME AS VARCHAR(128)
DECLARE @ScrollStartTime AS DATETIME       --������ʼʱ��
SET     @WDINT=2
SET     @BREAK_DATETIME=''2007-06-01 00:00:00''
IF ISDATE(@BREAK_DATETIME)=1
	SELECT @ScrollStartTime=CONVERT(DATETIME,@BREAK_DATETIME)
ELSE
	SELECT @ScrollStartTime=CONVERT(DATETIME,''2007-06-01 00:00:00'')
DECLARE @M AS INTEGER--�߷���
DECLARE @N AS INTEGER--�߷���
DECLARE @M_1 AS INTEGER--�Ǹ߷���
DECLARE @N_1 AS INTEGER--�Ǹ߷���
DECLARE @M_2 AS INTEGER--(������)
DECLARE @N_2 AS INTEGER--(����)
DECLARE @D AS INTEGER  --(����)
----------------------------------------------------------------
--��ṫ���ࡢ��ʱ��ͣ����
DECLARE @WD_FIRSTHOUR AS FLOAT--�����յ�һСʱ����(�߷���)
DECLARE @NWD_FIRSTHOUR AS FLOAT --�ǹ����յ�һСʱ����
DECLARE @DayMoney AS FLOAT --ÿ�����
DECLARE @NOWDAY_DTIME AS INT --�ǹ������շ�ʱ��(����Ϊ��λ)
DECLARE @NOWDAY_DTIMEFEE AS MONEY --�ǹ�����ʱ���շѶ�
DECLARE @NOTGF_DTIME AS INT --�Ǹ߷����շ�ʱ��(����Ϊ��λ)
DECLARE @NOTGF_DTIMEFEE AS MONEY--�Ǹ߷���ʱ���շѶ�
DECLARE @GF_DTIME AS INT --�߷����շ�ʱ��(����Ϊ��λ)
DECLARE @GF_DTIMEFEE AS MONEY --�߷���ʱ���շѶ�
DECLARE @GF_BEG_H AS INT --�߷�����ʼСʱ
DECLARE @GF_BEG_M AS INT --�߷�����ʼ����
DECLARE @GF_END_H AS INT --�߷��ڽ���Сʱ
DECLARE @GF_END_M AS INT --�߷��ڽ�������
DECLARE @GZ_MONTHBEG1 AS INT --�ǹ�������ʼ��
DECLARE @GZ_DAYBEG1 AS INT --�ǹ�������ʼ��
DECLARE @GZ_MONTHEND1 AS INT --�ǹ����ս�����
DECLARE @GZ_DAYEND1 AS INT --�ǹ����ս�����
DECLARE @GZ_MONTHBEG2 AS INT --�ǹ�������ʼ��
DECLARE @GZ_DAYBEG2 AS INT --�ǹ�������ʼ��
DECLARE @GZ_MONTHEND2 AS INT --�ǹ����ս�����
DECLARE @GZ_DAYEND2 AS INT --�ǹ����ս�����
DECLARE @GFDATETIME AS DATETIME
DECLARE @GFDATETIME2 AS DATETIME
DECLARE @FIRSTTIMEBETWEEN AS INT--�׶�SFTime(����)
DECLARE @FIRSTTIMEN AS INT --�ж�ʱ�����Ƿ񳬹��׶�
DECLARE @FIRSTTIMEM AS INT  --�ж�ʱ�����Ƿ񳬹��׶�
DECLARE @INCLUDEBOOL AS NVARCHAR(1) --YesNoFreeTime 
----------------------------------------------------------------------
--סլ��ͣ����
DECLARE @HOMEFIRSTHOUR AS FLOAT --סլ���һСʱ����
DECLARE @HOMESECONDLYHOUR AS FLOAT --סլ���һСʱ��ķ���
DECLARE @AREAMAX AS FLOAT 
DECLARE @HOMEDAYFEE AS FLOAT   
DECLARE @HOMEMONTHFEE AS FLOAT  
DECLARE @InTime2 AS DATETIME 
DECLARE @InTime3 AS DATETIME
DECLARE @PART_POINT AS DATETIME
DECLARE @M1 AS MONEY
DECLARE @M2 AS MONEY
DECLARE @C2 AS MONEY
SELECT TOP 1 @CarParkType=CarParkType,@GZ_MONTHBEG1=HolidayOneStartMonth,@GZ_DAYBEG1=HolidayOneStartDay,@GZ_MONTHEND1=HolidayOneEndMonth,@GZ_DAYEND1=HolidayOneEndDay,
	@GZ_MONTHBEG2=HolidayTwoStartMonth,@GZ_DAYBEG2=HolidayTwoStartDay,@GZ_MONTHEND2=HolidayTwoEndMonth,@GZ_DAYEND2=HolidayTwoEndDay,
	@FIRSTTIMEBETWEEN=(FirstChargeTimeHour*60+FirstChargeTimeMinute),@FreeTime=FreeMinute,@INCLUDEBOOL=YesNoFreeTime  FROM JJCNEWSHENZHEN WHERE CardType=@CardType
IF (@INCLUDEBOOL<>''1'') SET @FreeTime=-99999
IF DATEDIFF(MINUTE,@InTime,@OutTime)<=@FreeTime
    BEGIN
	SELECT @SFJE=0
	RETURN
    END
ELSE
    BEGIN
	SELECT @N_2=DATEDIFF(MINUTE,@InTime,@OutTime)/1440
	SELECT @M_2=DATEDIFF(MINUTE,@InTime,@OutTime) % 1440
             IF (@CarParkType=''1'')
	      BEGIN
			SELECT @WD_FIRSTHOUR=WorkdayFirstHourMoney,@NOWDAY_DTIME=(HolidayChargeHour*60+HolidayChargeMinute), @NOWDAY_DTIMEFEE=HolidayMoney,@NWD_FIRSTHOUR=HolidayFirstHourMoney,@NOTGF_DTIME=(NoPeakChargeHour*60+NoPeakChargeMinute),
				 @NOTGF_DTIMEFEE=NoPeakMoney,@GF_DTIME=(PeakChargeHour*60+PeakChargeMinute),@GF_DTIMEFEE=PeakMoney,@DayMoney=ChargeByDay,@FreeTime=FreeMinute,@GF_BEG_H=PeakStartHour, @GF_BEG_M=PeakStartMinute,
				 @GF_END_H=PeakEndHour,@GF_END_M=PeakEndMinute FROM JJCNEWSHENZHEN WHERE CardType=@CardType AND CarParkType=''1''
			SET @N=(SELECT CASE @GF_DTIME WHEN 0 THEN 0 ELSE (DATEDIFF(MINUTE,@InTime,@OutTime)/@GF_DTIME) END)
			SET @M=(SELECT CASE @GF_DTIME WHEN 0 THEN 0 ELSE (DATEDIFF(MINUTE,@InTime,@OutTime) % @GF_DTIME) END)
		
			SET @N_1=(SELECT CASE @NOTGF_DTIME WHEN 0 THEN 0 ELSE (DATEDIFF(MINUTE,@InTime,@OutTime)/@NOTGF_DTIME) END)
			SET @M_1=(SELECT CASE @NOTGF_DTIME WHEN 0 THEN 0 ELSE (DATEDIFF(MINUTE,@InTime,@OutTime) % @NOTGF_DTIME) END)
		
			SET @FIRSTTIMEN=DATEDIFF(MINUTE,@InTime,@OutTime) / 60
			SET @FIRSTTIMEM=DATEDIFF(MINUTE,@InTime,@OutTime) % 60
                                        SET @GFDATETIME=CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126)+SPACE(1)+CONVERT(NVARCHAR(2),@GF_BEG_H)+'':''+CONVERT(NVARCHAR(2),@GF_BEG_M)+'':''+CONVERT(NVARCHAR(2),DATEPART(SS,@InTime)))
			SET @GFDATETIME2=CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126)+SPACE(1)+CONVERT(NVARCHAR(2),@GF_END_H)+'':''+CONVERT(NVARCHAR(2),@GF_END_M)+'':''+CONVERT(NVARCHAR(2),DATEPART(SS,@InTime)))
			IF  (@DayMoney<=0)
				BEGIN				    
					DECLARE @GZDAYBEG1 AS DATETIME
					DECLARE @GZDAYEND1 AS DATETIME
					DECLARE @GZDAYBEG2 AS DATETIME
					DECLARE @GZDAYEND2 AS DATETIME
					SET @GZDAYBEG1=CONVERT(DATETIME,CONVERT(NVARCHAR(10),DATEPART(YY,@InTime))+''-''+CONVERT(NVARCHAR(2),@GZ_MONTHBEG1)+''-''+CONVERT(NVARCHAR(2),@GZ_DAYBEG1))
					SET @GZDAYEND1=CONVERT(DATETIME,CONVERT(NVARCHAR(10),DATEPART(YY,@InTime))+''-''+CONVERT(NVARCHAR(2),@GZ_MONTHEND1)+''-''+CONVERT(NVARCHAR(2),@GZ_DAYEND1))
					SET @GZDAYBEG2=CONVERT(DATETIME,CONVERT(NVARCHAR(10),DATEPART(YY,@InTime))+''-''+CONVERT(NVARCHAR(2),@GZ_MONTHBEG2)+''-''+CONVERT(NVARCHAR(2),@GZ_DAYBEG2))
					SET @GZDAYEND2=CONVERT(DATETIME,CONVERT(NVARCHAR(10),DATEPART(YY,@InTime))+''-''+CONVERT(NVARCHAR(2),@GZ_MONTHEND2)+''-''+CONVERT(NVARCHAR(2),@GZ_DAYEND2))
					IF ((@FIRSTTIMEN=0) OR (@FIRSTTIMEN=1 AND @FIRSTTIMEM=0))  
		                                                          IF ((@WDINT=0 AND (CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))<@GZDAYBEG1 OR CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))>@GZDAYEND2 
									OR (CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))>@GZDAYEND1 AND CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))<@GZDAYBEG2))   )
						          OR ((@WDINT=1 AND ((DATEPART(DW,@InTime)-1)<7) AND (CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))<@GZDAYBEG1 OR CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))>@GZDAYEND2 
									OR (CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))>@GZDAYEND1 AND CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))<@GZDAYBEG2))  ))
		                                                               OR ((@WDINT=2 AND ((DATEPART(DW,@InTime)-1)<6) AND ((DATEPART(DW,@InTime)-1)>0) AND (CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))<@GZDAYBEG1 OR CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))>@GZDAYEND2 
									OR (CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))>@GZDAYEND1 AND CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))<@GZDAYBEG2))   )))
				                                             BEGIN
			                                                                
				                                                      IF  (@InTime>=@GFDATETIME AND @InTime<@GFDATETIME2)
				                                                               BEGIN
									 SET @M1=@WD_FIRSTHOUR 
								          END
				                                                      ELSE
				                                                                SET @M1=@NOTGF_DTIMEFEE
				                                             END
		                                                           ELSE
		                                                                        BEGIN
		                                                                                          
		                                                                                          SET @M1=@NWD_FIRSTHOUR 
		                                                                        END
		                                        ELSE
		                                             BEGIN
	                                                                      
		                                                          IF ((@WDINT=0 AND (CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))<@GZDAYBEG1 OR CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))>@GZDAYEND2 
									OR (CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))>@GZDAYEND1 AND CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))<@GZDAYBEG2))    )
						          OR ((@WDINT=1 AND ((DATEPART(DW,@InTime)-1)<7) AND (CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))<@GZDAYBEG1 OR CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))>@GZDAYEND2 
									OR (CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))>@GZDAYEND1 AND CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))<@GZDAYBEG2))   ))
		                                                               OR ((@WDINT=2 AND ((DATEPART(DW,@InTime)-1)<6) AND ((DATEPART(DW,@InTime)-1)>0) AND (CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))<@GZDAYBEG1 OR CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))>@GZDAYEND2 
									OR (CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))>@GZDAYEND1 AND CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime,126))<@GZDAYBEG2))   )))
				                                             BEGIN
			                                                                
					                                                   IF  (@InTime>=@GFDATETIME AND @InTime<@GFDATETIME2)
										BEGIN
											SET @M1=@WD_FIRSTHOUR  
										END
					                                                   ELSE
										BEGIN
											SET @M1=@NOTGF_DTIMEFEE
										END
				                                             END
		                                                             ELSE
		                                                                        BEGIN
		                                                                                 
	                                                                                                  SET @M1=@NWD_FIRSTHOUR
		                                                                        END
                                                                                         SET @InTime2=DATEADD(MI,60,@InTime)
		                                                              
			                                                  WHILE(DATEDIFF(MI,@InTime2,@OutTime)>0)
			                                                           BEGIN									
									SET @GZDAYBEG1=CONVERT(DATETIME,CONVERT(NVARCHAR(10),DATEPART(YY,@InTime2))+''-''+CONVERT(NVARCHAR(2),@GZ_MONTHBEG1)+''-''+CONVERT(NVARCHAR(2),@GZ_DAYBEG1))
									SET @GZDAYEND1=CONVERT(DATETIME,CONVERT(NVARCHAR(10),DATEPART(YY,@InTime2))+''-''+CONVERT(NVARCHAR(2),@GZ_MONTHEND1)+''-''+CONVERT(NVARCHAR(2),@GZ_DAYEND1))
									SET @GZDAYBEG2=CONVERT(DATETIME,CONVERT(NVARCHAR(10),DATEPART(YY,@InTime2))+''-''+CONVERT(NVARCHAR(2),@GZ_MONTHBEG2)+''-''+CONVERT(NVARCHAR(2),@GZ_DAYBEG2))
									SET @GZDAYEND2=CONVERT(DATETIME,CONVERT(NVARCHAR(10),DATEPART(YY,@InTime2))+''-''+CONVERT(NVARCHAR(2),@GZ_MONTHEND2)+''-''+CONVERT(NVARCHAR(2),@GZ_DAYEND2))
	
			                                                                            IF ((@WDINT=0 AND (CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime2,126))<@GZDAYBEG1 OR CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime2,126))>@GZDAYEND2 
											OR (CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime2,126))>@GZDAYEND1 AND CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime2,126))<@GZDAYBEG2))    )
								          OR ((@WDINT=1 AND ((DATEPART(DW,@InTime2)-1)<7) AND (CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime2,126))<@GZDAYBEG1 OR CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime2,126))>@GZDAYEND2 
											OR (CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime2,126))>@GZDAYEND1 AND CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime2,126))<@GZDAYBEG2))    ))
				                                                               OR ((@WDINT=2 AND ((DATEPART(DW,@InTime2)-1)<6) AND ((DATEPART(DW,@InTime2)-1)>0) AND (CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime2,126))<@GZDAYBEG1 OR CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime2,126))>@GZDAYEND2 
											OR (CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime2,126))>@GZDAYEND1 AND CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime2,126))<@GZDAYBEG2))  )))
										BEGIN
										       
												SET @GFDATETIME=CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime2,126)+SPACE(1)+CONVERT(NVARCHAR(2),@GF_BEG_H)+'':''+CONVERT(NVARCHAR(2),@GF_BEG_M)+'':''+CONVERT(NVARCHAR(2),DATEPART(SS,@InTime2)))
												SET @GFDATETIME2=CONVERT(DATETIME,CONVERT(NVARCHAR(10),@InTime2,126)+SPACE(1)+CONVERT(NVARCHAR(2),@GF_END_H)+'':''+CONVERT(NVARCHAR(2),@GF_END_M)+'':''+CONVERT(NVARCHAR(2),DATEPART(SS,@InTime2)))
							                                                                  IF  (@InTime2>=@GFDATETIME AND @InTime2<@GFDATETIME2)--�ж��Ƿ�߷���
							                                                                           BEGIN
							                                                                                  SET @M1=@M1+@GF_DTIMEFEE
							                                                                                  SET @InTime2=DATEADD(MI,@GF_DTIME,@InTime2)
							                                                                           END
							                                                                  ELSE
							                                                                            BEGIN
							                                                                                  SET @M1=@M1+@NOTGF_DTIMEFEE
							                                                                                  SET @InTime2=DATEADD(MI,@NOTGF_DTIME,@InTime2)
							                                                                            END
										END
									ELSE
										BEGIN
			                                                                                              
			                                                                                                            SET @M1=@M1+@NOWDAY_DTIMEFEE
										               SET @InTime2=DATEADD(MI,@NOWDAY_DTIME,@InTime2)
										END
			                                                           END
	
		                                             END
				END
			ELSE
				BEGIN
					              IF (@N_2=0)
				                                 SET @D=1
				                           ELSE IF (@M_2>0)
				                                       SET @D=@N_2+1
			                                                ELSE
			                                                     SET @D=@N_2
				                           
				                           SET @M1=@D*@DayMoney  
				END
			IF @@ERROR<>0 
			             SELECT @SFJE=0
			ELSE
				SELECT @SFJE=@M1
                                        RETURN 
		
	      END
	ELSE
	                   BEGIN 
					 DECLARE @C24 AS MONEY
					DECLARE @M24 AS MONEY
					 DECLARE @InTime24 AS DATETIME
	                                                      DECLARE @M_MAX AS FLOAT 
	                                                      DECLARE @24HOUR AS INTEGER
	                                                      DECLARE @24HOUR_LEAVINGS AS INTEGER 
	                                                      DECLARE @HOUR AS INTEGER 
	                                                      DECLARE @HOUR_LEAVINGS AS INTEGER
			SELECT @HOMEFIRSTHOUR=WorkdayFirstHourMoney,@GF_DTIME=(PeakChargeHour*60+PeakChargeMinute),@GF_DTIMEFEE=PeakMoney,
				@AREAMAX=AllDayTopMoney,@DayMoney=ChargeByDay,@FreeTime=FreeMinute FROM JJCNEWSHENZHEN WHERE CardType=@CardType AND CarParkType=''2''
			IF  (@DayMoney<=0)
				BEGIN
					SET @InTime2=DATEADD(MI,@FIRSTTIMEBETWEEN,@InTime)
					SET @N_1=(SELECT CASE @GF_DTIME WHEN 0 THEN 0 ELSE (DATEDIFF(MINUTE,@InTime2,@OutTime)/@GF_DTIME) END)--��ʱ��λ����߷�ʱ��
					SET @M_1=(SELECT CASE @GF_DTIME WHEN 0 THEN 0 ELSE (DATEDIFF(MINUTE,@InTime2,@OutTime) % @GF_DTIME) END)
	
	                                                     IF (@M_1>0) SET @N_1=@N_1+1   	
					DECLARE @24AFTERN AS INT
					DECLARE @24AFTERM AS INT			
					IF (@N_2>0)
						BEGIN
							SET @24AFTERN=(SELECT CASE @GF_DTIME WHEN 0 THEN 0 ELSE (@M_2/@GF_DTIME) END)
							SET @24AFTERM=(SELECT CASE @GF_DTIME WHEN 0 THEN 0 ELSE (@M_2%@GF_DTIME) END)
							IF (@24AFTERM>0)  SET @24AFTERN=@24AFTERN+1
	
							IF (@24AFTERN*@GF_DTIMEFEE>=@AREAMAX)
								SET @M1=@N_2*@AREAMAX+@AREAMAX
							ELSE
								SET @M1=@N_2*@AREAMAX+@24AFTERN*@GF_DTIMEFEE
						END
					ELSE
						BEGIN
								SET @M1=@HOMEFIRSTHOUR+@N_1*@GF_DTIMEFEE
								IF (@M1>@AREAMAX) 
									SET @M1=@AREAMAX
						END
	
					IF @N_2>0
						SELECT @PART_POINT=DATEADD(MINUTE,-@N_2*1440,@OutTime)
					ELSE
						SELECT @PART_POINT=DATEADD(MINUTE,-1440,@OutTime)
	
					SET @InTime2=@PART_POINT
					IF (@N_2=0)
						SET @InTime24= (SELECT TOP 1 InTime FROM MYCARGOOUTRECORD WHERE InTime>=@ScrollStartTime AND InTime>=@PART_POINT AND OutTime>@PART_POINT AND CardType=@CardType AND CPH=@CPH AND SFJE>0)
					IF NOT  EXISTS(SELECT * FROM MYCARGOOUTRECORD WHERE InTime>=@ScrollStartTime AND InTime<@PART_POINT AND OutTime>@PART_POINT AND CardType=@CardType AND CPH=@CPH AND SFJE>0)
					BEGIN
						SET @InTime2= (SELECT TOP 1 InTime FROM MYCARGOOUTRECORD WHERE InTime>=@ScrollStartTime AND InTime>@PART_POINT AND OutTime>@PART_POINT AND CardType=@CardType AND CPH=@CPH AND SFJE>0)
					END
					IF (@InTime2=NULL) SET @InTime2=@InTime
				             SET @N=1	
					WHILE (EXISTS(SELECT * FROM MYCARGOOUTRECORD WHERE InTime>=@ScrollStartTime AND InTime<=@PART_POINT AND OutTime>@PART_POINT AND CardType=@CardType AND CPH=@CPH AND SFJE>0) AND @N<2)
					    BEGIN
						SELECT @N=@N+1
						SELECT @PART_POINT=DATEADD(MINUTE,-(@N_2+@N)*1440,@OutTime)
						SET @InTime2= (SELECT TOP 1 InTime FROM MYCARGOOUTRECORD WHERE InTime>=@ScrollStartTime AND InTime>=@PART_POINT AND OutTime>@PART_POINT AND CardType=@CardType AND CPH=@CPH AND SFJE>0)
					    END
					IF (@InTime2 IS NULL) SET @InTime2=@InTime
					SELECT @24HOUR=DATEDIFF(MINUTE,@InTime2,@OutTime)/1440
					SELECT @24HOUR_LEAVINGS=DATEDIFF(MINUTE,@InTime2,@OutTime) % 1440
	
					SET @24AFTERN=(SELECT CASE @GF_DTIME WHEN 0 THEN 0 ELSE (@24HOUR_LEAVINGS/@GF_DTIME) END)
					SET @24AFTERM=(SELECT CASE @GF_DTIME WHEN 0 THEN 0 ELSE (@24HOUR_LEAVINGS%@GF_DTIME) END)
	
					IF (@24AFTERM>0)  SET @24AFTERN=@24AFTERN+1
	
					IF (@24HOUR>0)
						BEGIN
							IF @24HOUR_LEAVINGS>0 SET @24HOUR=@24HOUR+1
							SET @M_MAX=@24HOUR*@AREAMAX
						END
					ELSE
						BEGIN
							SET @M_MAX=@AREAMAX
						END
					IF (@N_2=0)
					BEGIN
						SELECT @C24=SUM(SFJE) FROM MYCARGOOUTRECORD WHERE InTime>=@ScrollStartTime AND InTime>=@InTime24 AND OutTime<@OutTime AND CardType=@CardType AND CPH=@CPH AND SFJE>0
						SELECT @C24=ISNULL(@C24,0)
					END
					SELECT @C2=SUM(SFJE) FROM MYCARGOOUTRECORD WHERE InTime>=@ScrollStartTime AND InTime>=@InTime2 AND OutTime<@OutTime AND CardType=@CardType AND CPH=@CPH AND SFJE>0
					SELECT @C2=ISNULL(@C2,0)					
					SET @M24=0
					IF (@N_2=0)
					BEGIN
						IF (@M1>@AREAMAX-@C24)
							BEGIN
								SET @M24=@AREAMAX-@C24
							END
					END
				              IF (@M1>(@M_MAX-@C2))
						SET @M2=@M_MAX-@C2
					ELSE
						SET @M2=@M1
					IF ((@M2>@M24) AND (@M24>0)) SET @M2=@M24
					IF (@M2<0) SET @M2=0
					IF (@@ERROR<>0)
					   	SELECT @SFJE=0
					ELSE
						SELECT @SFJE=@M2
					RETURN
				END
			ELSE
				BEGIN
					IF (@N_2>0)
						BEGIN
							IF (@M_2>0) 
								SET @M1=(@N_2+1)*@DayMoney
							ELSE
								SET @M1=@N_2*@DayMoney
						END
					ELSE
						BEGIN
								SET @M1=@DayMoney
						END
					IF @N_2>0
						SELECT @PART_POINT=DATEADD(MINUTE,-@N_2*1440,@OutTime)
					ELSE
						SELECT @PART_POINT=DATEADD(MINUTE,-1440,@OutTime)
	
					SET @InTime2=@PART_POINT
					IF (@N_2=0)
						SET @InTime24= (SELECT TOP 1 InTime FROM MYCARGOOUTRECORD WHERE InTime>=@ScrollStartTime AND InTime>=@PART_POINT AND OutTime>@PART_POINT AND CardType=@CardType AND CPH=@CPH AND SFJE>0 ORDER BY InTime)
					IF NOT  EXISTS(SELECT * FROM MYCARGOOUTRECORD WHERE InTime>=@ScrollStartTime AND InTime<@PART_POINT AND OutTime>@PART_POINT AND CardType=@CardType AND CPH=@CPH AND SFJE>0)
					BEGIN
						SET @InTime2= (SELECT TOP 1 InTime FROM MYCARGOOUTRECORD WHERE InTime>=@ScrollStartTime AND InTime>@PART_POINT AND OutTime>@PART_POINT AND CardType=@CardType AND CPH=@CPH AND SFJE>0 ORDER BY InTime)
					END
					IF (@InTime2=NULL) SET @InTime2=@InTime
				             SET @N=1				
	
					WHILE (EXISTS(SELECT * FROM MYCARGOOUTRECORD WHERE InTime>=@ScrollStartTime AND InTime<=@PART_POINT AND OutTime>@PART_POINT AND CardType=@CardType AND CPH=@CPH AND SFJE>0) AND @N<2)
					    BEGIN
						SELECT @N=@N+1
						SELECT @PART_POINT=DATEADD(MINUTE,-(@N_2+@N)*1440,@OutTime)
						SET @InTime2= (SELECT TOP 1 InTime FROM MYCARGOOUTRECORD WHERE InTime>=@ScrollStartTime AND InTime>=@PART_POINT AND OutTime>@PART_POINT AND CardType=@CardType AND CPH=@CPH AND SFJE>0 ORDER BY InTime)
					    END	                                                    
					IF (@InTime2 IS NULL) SET @InTime2=@InTime
					SELECT @24HOUR=DATEDIFF(MINUTE,@InTime2,@OutTime)/1440
					SELECT @24HOUR_LEAVINGS=DATEDIFF(MINUTE,@InTime2,@OutTime) % 1440
	
					IF (@24HOUR>0)
						BEGIN
							IF @24HOUR_LEAVINGS>0 SET @24HOUR=@24HOUR+1
							SET @M_MAX=@24HOUR*@DayMoney
						END
					ELSE
						BEGIN
							SET @M_MAX=@DayMoney
						END
					IF (@N_2=0)
					BEGIN
						SELECT @C24=SUM(SFJE) FROM MYCARGOOUTRECORD WHERE InTime>=@ScrollStartTime AND InTime>=@InTime24 AND OutTime<@OutTime AND CardType=@CardType AND CPH=@CPH AND SFJE>0
						SELECT @C24=ISNULL(@C24,0)
					END				
					
					SELECT @C2=SUM(SFJE) FROM MYCARGOOUTRECORD WHERE InTime>=@ScrollStartTime AND InTime>=@InTime2 AND OutTime<@OutTime AND CardType=@CardType AND CPH=@CPH AND SFJE>0
					SELECT @C2=ISNULL(@C2,0)					
					SET @M24=0
					IF (@N_2=0)
					BEGIN
						IF (@M1>@DayMoney-@C24)
							BEGIN
								SET @M24=@DayMoney-@C24
							END
					END
				              IF (@M1>(@M_MAX-@C2))
						SET @M2=@M_MAX-@C2
					ELSE
						SET @M2=@M1
					IF ((@M2>@M24) AND (@M24>0)) SET @M2=@M24					
					IF (@M2<0) SET @M2=0
					IF (@@ERROR<>0)
					   	SELECT @SFJE=0
					ELSE
						SELECT @SFJE=@M2
					RETURN
				END
				
	                   END
    END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[JJCSUMYEAR]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCSUMYEAR]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE  PROCEDURE [dbo].[JJCSUMYEAR]                 
                 @IINT INT
 AS
        
        SELECT CARDSNO,SUM(IMONTHA) AS IMONTHA,SUM(IMONTHB) AS IMONTHB,SUM(IMONTHC) AS IMONTHC,SUM(IMONTHD) AS IMONTHD,SUM(ISUMMONTH) AS ISUMMONTH,
                       SUM(IFREEA) AS IFREEA,SUM(IFREEB) AS IFREEB ,SUM(ISUMFREE) AS ISUMFREE,SUM(ITEMPA) AS ITEMPA ,
                       SUM(ITEMPB) AS ITEMPB ,SUM(ITEMPC) AS ITEMPC,SUM(ITEMPD) AS ITEMPD,SUM(ITEMPE) AS ITEMPE,SUM(ITEMPF) AS ITEMPF,SUM(ITEMPG) AS ITEMPG,SUM(ITEMPH) AS ITEMPH,SUM(ISUMTEMP) AS ISUMTEMP,
                       SUM(IMONEYA) AS IMONEYA,SUM(IMONEYB) AS IMONEYB,SUM(IMONEYC) AS IMONEYC,SUM(IMONEYD) AS IMONEYD,
                       SUM(ISUMMONEY) AS ISUMMONEY,SUM(IMONEY) AS IMONEY,SUM(ZSUMCAR) AS ZSUMCAR,
                       SUM(ZSUMMONEY) AS ZSUMMONEY,SUM(ITEMPFREE) AS ITEMPFREE,SUM(ITEMPMONEY) AS ITEMPMONEY INTO #CCURSOR
        FROM  MYCARGOOUTRECORDREPORT GROUP BY CARDSNO
        TRUNCATE TABLE MYCARGOOUTRECORDREPORT
        
        INSERT MYCARGOOUTRECORDREPORT 
              SELECT * FROM #CCURSOR ORDER BY CONVERT(INT,CARDSNO)
' 
END
GO
/****** Object:  StoredProcedure [dbo].[JJCSAVEIDFX]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCSAVEIDFX]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE     PROCEDURE [dbo].[JJCSAVEIDFX] 
@CardNO VARCHAR(30),
@UserNO VARCHAR(30),
@CardYJ MONEY,
@CarCardType VARCHAR(20),
@CarIssueDate DATETIME,
@CarIssueUserCard VARCHAR(10),
@CarValidStartDate DATETIME,
@CarValidEndDate DATETIME,
@CPH VARCHAR(20),
@CarColor BIGINT,
@CarType VARCHAR(255),
@CarPlace VARCHAR(255),
@CarMemo VARCHAR(255),
@IssueDate DATETIME,
@IssueUserCard VARCHAR(10),
@CarValidMachine VARCHAR(256),
@UserName   VARCHAR(50),
@DeptName   VARCHAR(200),
@CarPic   VARCHAR(100)
AS
IF NOT EXISTS(SELECT * FROM MYFAXINGSSUE WHERE CardNO=@CardNO)
    BEGIN	
	IF LTRIM(RTRIM(@CarCardType))=''OperationCard''
                BEGIN
		INSERT INTO MYFAXINGSSUE (CardNO,UserNO,CardState,CardYJ,SubSystem,CarCardType,CarIssueDate,CarIssueUserCard,CarValidStartDate,CarValidEndDate,CPH,CarColor,CarType,CarPlace,CarMemo,IssueDate,IssueUserCard,CarValidMachine,CarPic)
		    VALUES
			                  (@CardNO,@UserNO,''0'',@CardYJ,''00000'',@CarCardType,@CarIssueDate,@CarIssueUserCard,@CarValidStartDate,@CarValidEndDate,@CPH,@CarColor,@CarType,@CarPlace,@CarMemo,@IssueDate,@IssueUserCard,@CarValidMachine,@CarPic)
                    DELETE FROM MYCAOZUOYUAN WHERE CardNO=@CardNO
                    INSERT INTO MYCAOZUOYUAN (CardNO,CardType,UserNO,UserName,DeptName,Pwd,CardState)VALUES(@CardNO,''OperationCard'',@UserNO,@UserName,@DeptName,'''',0)
                END
	ELSE
		BEGIN
			INSERT INTO MYFAXINGSSUE (CardNO,UserNO,CardState,CardYJ,SubSystem,CarCardType,CarIssueDate,CarIssueUserCard,CarValidStartDate,CarValidEndDate,CPH,CarColor,CarType,CarPlace,CarMemo,IssueDate,IssueUserCard,CarValidMachine,CarPic)
			    VALUES
				(@CardNO,@UserNO,''0'',@CardYJ,''10000'',@CarCardType,@CarIssueDate,@CarIssueUserCard,@CarValidStartDate,@CarValidEndDate,@CPH,@CarColor,@CarType,@CarPlace,@CarMemo,@IssueDate,@IssueUserCard,@CarValidMachine,@CarPic)
			INSERT INTO MYICVALID (CardNO,OptDate,NewStartDate,NewEndDate,OperatorCardNO,OptType) VALUES
				(@CardNO,@IssueDate,@CarValidStartDate,@CarValidEndDate,@IssueUserCard,''T'')
		END
    END
ELSE
	IF EXISTS(SELECT * FROM MYFAXINGSSUE WHERE CardNO=@CardNO AND SUBSTRING(SubSystem,1,1)=''0'')
	    BEGIN
		IF LTRIM(RTRIM(@CarCardType))=''OperationCard''
			BEGIN
				DELETE MYFAXINGSSUE WHERE CardNO=@CardNO AND SUBSTRING(SubSystem,1,1)=''0''
				INSERT INTO MYFAXINGSSUE (CardNO,UserNO,CardState,CardYJ,SubSystem,CarCardType,CarIssueDate,CarIssueUserCard,CarValidStartDate,CarValidEndDate,CPH,CarColor,CarType,CarPlace,CarMemo,IssueDate,IssueUserCard,CarValidMachine,CarPic)
				    VALUES
					(@CardNO,@UserNO,''0'',@CardYJ,''00000'',@CarCardType,@CarIssueDate,@CarIssueUserCard,@CarValidStartDate,@CarValidEndDate,@CPH,@CarColor,@CarType,@CarPlace,@CarMemo,@IssueDate,@IssueUserCard,@CarValidMachine,@CarPic)
                                DELETE FROM MYCAOZUOYUAN WHERE CardNO=@CardNO
                                INSERT INTO MYCAOZUOYUAN (CardNO,CardType,UserNO,UserName,DeptName,Pwd,CardState)VALUES(@CardNO,''OperationCard'',@UserNO,@UserName,@DeptName,'''',0)
			END
		ELSE
			BEGIN
				DELETE MYFAXINGSSUE WHERE CardNO=@CardNO AND SUBSTRING(SubSystem,1,1)=''0''
				INSERT INTO MYFAXINGSSUE (CardNO,UserNO,CardState,CardYJ,SubSystem,CarCardType,CarIssueDate,CarIssueUserCard,CarValidStartDate,CarValidEndDate,CPH,CarColor,CarType,CarPlace,CarMemo,IssueDate,IssueUserCard,CarValidMachine,CarPic)
				    VALUES
					(@CardNO,@UserNO,''0'',@CardYJ,''10000'',@CarCardType,@CarIssueDate,@CarIssueUserCard,@CarValidStartDate,@CarValidEndDate,@CPH,@CarColor,@CarType,@CarPlace,@CarMemo,@IssueDate,@IssueUserCard,@CarValidMachine,@CarPic)
				INSERT INTO MYICVALID (CardNO,OptDate,NewStartDate,NewEndDate,OperatorCardNO,OptType) VALUES
					(@CardNO,@IssueDate,@CarValidStartDate,@CarValidEndDate,@IssueUserCard,''T'')
			END
	    END
	ELSE
		BEGIN
			IF LTRIM(RTRIM(@CarCardType))=''OperationCard''
                                BEGIN
				UPDATE MYFAXINGSSUE SET UserNO=@UserNO,SubSystem=''00000'',CarCardType=@CarCardType,
					CarIssueDate=@CarIssueDate,CarIssueUserCard=@CarIssueUserCard,CPH=@CPH,
					CarColor=@CarColor,CarType=@CarType,CarPlace=@CarPlace,CarMemo=@CarMemo,CarValidMachine=@CarValidMachine,CarPic=@CarPic
				WHERE CardNO=@CardNO
                                 DELETE FROM MYCAOZUOYUAN WHERE CardNO=@CardNO
                                 INSERT INTO MYCAOZUOYUAN (CardNO,CardType,UserNO,UserName,DeptName,Pwd,CardState)VALUES(@CardNO,''OperationCard'',@UserNO,@UserName,@DeptName,'''',0)
                                END
			ELSE
				UPDATE MYFAXINGSSUE SET UserNO=@UserNO,CarCardType=@CarCardType,
					CarIssueDate=@CarIssueDate,CarIssueUserCard=@CarIssueUserCard,CPH=@CPH,
					CarColor=@CarColor,CarType=@CarType,CarPlace=@CarPlace,CarMemo=@CarMemo,CarValidMachine=@CarValidMachine,CarPic=@CarPic
				WHERE CardNO=@CardNO AND SUBSTRING(SubSystem,1,1)=''1''
		END
' 
END
GO
/****** Object:  View [dbo].[JJCRICMONEY]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCRICMONEY]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'
CREATE VIEW [dbo].[JJCRICMONEY]
AS
SELECT     dbo.MYICMONEY.CardNO, 
--dbo.MYFAXINGSSUE.MJCardType
case  dbo.MYFAXINGSSUE.MJCardType when 1 then ''����''  when 2 then ''�û���'' when 3 then ''��ʱ��'' else dbo.MYFAXINGSSUE.MJCardType end as ''MJCardType''

, ISNULL(dbo.MYJIBENZILIAO.UserName, '''') AS UserName, 
                      ISNULL(dbo.MYJIBENZILIAO.DeptName, '''') AS DeptName, dbo.MYICMONEY.OptDate, dbo.MYICMONEY.SFJE, dbo.MYICMONEY.OperatorCardNO, 
                      CASE DBO.MYICMONEY.OptType WHEN ''1'' THEN ''CarParkIssue'' WHEN ''3'' THEN ''CarParkRecharge'' WHEN ''5'' THEN ''CarParkWithdrawCard'' WHEN ''7''
                       THEN ''CardRefundment'' WHEN ''9'' THEN ''LossRegRefundment'' WHEN ''D'' THEN ''DepositRefundment'' WHEN ''E'' THEN ''CardDeposit'' WHEN ''F'' THEN ''MonthCardExtensionMoney''
                       END AS OptType, dbo.MYFAXINGSSUE.CPH, dbo.MYCardType.CardType AS CarCardType, dbo.MYICMONEY.NewStartDate, 
                      dbo.MYICMONEY.NewEndDate, dbo.MYICMONEY.LastEndDate
FROM         dbo.MYFAXINGSSUE INNER JOIN
                      dbo.MYCardType ON dbo.MYFAXINGSSUE.CarCardType = dbo.MYCardType.Identifying LEFT OUTER JOIN
                      dbo.MYJIBENZILIAO ON dbo.MYFAXINGSSUE.UserNO = dbo.MYJIBENZILIAO.UserNO RIGHT OUTER JOIN
                      dbo.MYICMONEY ON dbo.MYICMONEY.CardNO = dbo.MYFAXINGSSUE.CardNO

'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPane1' , N'USER',N'dbo', N'VIEW',N'JJCRICMONEY', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[40] 4[20] 2[20] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "MYFAXINGSSUE"
            Begin Extent = 
               Top = 0
               Left = 277
               Bottom = 181
               Right = 467
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "MYJIBENZILIAO"
            Begin Extent = 
               Top = 25
               Left = 722
               Bottom = 140
               Right = 886
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "MYICMONEY"
            Begin Extent = 
               Top = 133
               Left = 564
               Bottom = 248
               Right = 727
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "MYCardType"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 192
               Right = 172
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 1710
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'JJCRICMONEY'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPaneCount' , N'USER',N'dbo', N'VIEW',N'JJCRICMONEY', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'JJCRICMONEY'
GO
/****** Object:  View [dbo].[JJCRICLOST]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCRICLOST]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'
CREATE VIEW [dbo].[JJCRICLOST]
AS
SELECT DBO.MYFAXINGSSUE.CardNO,
      ISNULL(DBO.MYJIBENZILIAO.UserName, '''') AS UserName, 
      ISNULL(DBO.MYJIBENZILIAO.DeptName, '''') AS DeptName,
     DBO.MYICLOST.LossregDate,
     DBO.MYICLOST.OperatorCardNO,
     CardState=
	CASE MYICLOST.CardState
		WHEN ''1'' THEN ''WaitforLossReg''
		WHEN ''2'' THEN ''LossReg''
		WHEN ''3'' THEN ''WaitforLossUnReg''
		WHEN ''4'' THEN ''LossUnReg''
	END,CarValidEndDate
FROM DBO.MYFAXINGSSUE LEFT OUTER JOIN
      DBO.MYJIBENZILIAO ON DBO.MYFAXINGSSUE.UserNO = DBO.MYJIBENZILIAO.UserNO
INNER JOIN
      DBO.MYICLOST ON DBO.MYICLOST.CardNO = DBO.MYFAXINGSSUE.CardNO
   
'
GO
/****** Object:  StoredProcedure [dbo].[JJCREFRESSCARFREE]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCREFRESSCARFREE]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE PROCEDURE [dbo].[JJCREFRESSCARFREE]                    
                 @NO VARCHAR(30),                    
                 @CARDMODEL  VARCHAR(20),              
                 @FIRSTDATE DATETIME,                 
                 @CARCARDS VARCHAR(20) ,              
                 @IMONEY MONEY,
                 @ENDDATE DATETIME,
                 @COMENAME VARCHAR(100),
                 @FLAG INT,
	         @ZJPIC VARCHAR(256)
 AS
IF @FLAG=1
   BEGIN
        UPDATE  MYCARGOOUTRECORD  SET CardType=@CARDMODEL,SFJE=0,OutGateName=@COMENAME,ZJPic=@ZJPIC
               WHERE CardNO= @NO  AND InTime = @FIRSTDATE and OutTime=@ENDDATE and Bigsmall = 0   --�����볡ʱ��ʹ�С��ʶ 2015-10-13
   END
IF @FLAG=2
   BEGIN
	UPDATE  MYCARGOOUTRECORD  SET CardType=@CARDMODEL,OutGateName=@COMENAME,SFJE=@IMONEY
               WHERE CardNO= @NO AND InTime = @FIRSTDATE and OutTime=@ENDDATE and Bigsmall = 0
   END
IF @FLAG=3
   BEGIN
        UPDATE  MYCARGOOUTRECORD  SET OutGateName=@COMENAME
               WHERE CardNO= @NO  AND InTime = @FIRSTDATE and OutTime=@ENDDATE and Bigsmall = 0
   END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[CarCardState]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[CarCardState]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'CREATE procedure  [dbo].[CarCardState]  --��ʧ��ҳɹ�
(
@cardNo varchar(30), --��Ƭ���
@UserId varchar(30), --��ʧ����Ա
@CarFailID varchar(250),--����ʧ�ܻ���
@MJFailID varchar(150),--�Ž�ʧ�ܻ���
@SystemFlag INT=0,  --0��Ϊ����1���Ž�
@Flag INT=0,   --1:��ʧ��2 ��ʧOK��3����ң�0�����OK
@ISFlag int=0 --�Ƿ�������ȫ 0��������ȫ 1��û����ȫ����
)
 as
declare @CarSate varchar(50) --�Ž�״̬
declare @MJSate varchar(50)  --����״̬
declare @System varchar(50)
declare @Return varchar(50)
begin 
select @System= SubSystem from MYFAXINGSSUE where CardNO=@cardNo;
select @CarSate= CardIdLossState from MYFAXINGSSUE where CardNO=@cardNo;
select @MJSate= CaRFailOKNO from MYFAXINGSSUE where CardNO=@cardNo;
if @Flag=1 --��ʧ
begin
update dbo.MYFAXINGSSUE set CardIdLossState=''0'',CaRFailOKNO =''0'',CardState=1,LossregDate=GETDATE() ,LossregUserCard=@UserId,DownloadSignal=''00000000000000000000000000000000000000000000000000'' where CardNO=@cardNo;
end

if @Flag=3 --���
begin
update dbo.MYFAXINGSSUE set CardIdLossState=''0'',CaRFailOKNO =''0'',CardState=3, DownloadSignal=''00000000000000000000000000000000000000000000000000'' where CardNO=@cardNo;
end
if @Flag=2  --��ʧOK
begin
 if @SystemFlag=0
  begin
    if @ISFlag=0 --�Ƿ��������
    begin
      update dbo.MYFAXINGSSUE set CaRFailOKNO =''1'',CarFailID=''''
      where CardNO=@cardNo;
      if substring(@System,2,1)=1 --�жϿ��Ƿ�ͨ�Ž�ϵͳ
      begin
       if @CarSate=1
        begin
         UPDATE  dbo.MYFAXINGSSUE set CardState=2 where CardNO=@cardNo;--��ʧ�ɹ�
        end
      end
      else --���û��ͨ�Ž����������ֱ���޸Ŀ�Ƭ״̬
      begin
       UPDATE  dbo.MYFAXINGSSUE set CardState=2 where CardNO=@cardNo;--��ʧ�ɹ�
      end
    end
    else
    begin
      update dbo.MYFAXINGSSUE set CaRFailOKNO =''0'',CarFailID=@CarFailID
      where CardNO=@cardNo;
    end
  end
  else
  begin
    if @ISFlag=0 --�Ƿ��������
    begin
      update dbo.MYFAXINGSSUE set CardIdLossState =''1'',BackCardNum=''''
      where CardNO=@cardNo;
      if left(@System,1)=1 --�жϿ��Ƿ�ͨ����ϵͳ
      begin
       if @MJSate=1
        begin
         UPDATE  dbo.MYFAXINGSSUE set CardState=2 where CardNO=@cardNo;--��ʧ�ɹ�
        end
      end
      else --���û��ͨ�������������ֱ���޸Ŀ�Ƭ״̬
      begin
       UPDATE  dbo.MYFAXINGSSUE set CardState=2 where CardNO=@cardNo;--��ʧ�ɹ�
      end
    end
    else
    begin
      update dbo.MYFAXINGSSUE set CardIdLossState =''0'',BackCardNum=@MJFailID
      where CardNO=@cardNo;
    end
  end
end

if @Flag=0  --���
begin
 if @SystemFlag=0
  begin
    if @ISFlag=0 --�Ƿ��������
    begin
      update dbo.MYFAXINGSSUE set CaRFailOKNO =''1'',CarFailID=''''
      where CardNO=@cardNo;
      if substring(@System,2,1)=1 --�жϿ��Ƿ�ͨ�Ž�ϵͳ
      begin
       if @CarSate=1
        begin
         UPDATE  dbo.MYFAXINGSSUE set CardState=0 where CardNO=@cardNo;--��ҳɹ�
        end
      end
      else --���û��ͨ�Ž����������ֱ���޸Ŀ�Ƭ״̬
      begin
       UPDATE  dbo.MYFAXINGSSUE set CardState=0 where CardNO=@cardNo;--��ҳɹ�
      end
    end
    else
    begin
      update dbo.MYFAXINGSSUE set CaRFailOKNO =''0'',CarFailID=@CarFailID
      where CardNO=@cardNo;
    end
  end
  else
  begin
    if @ISFlag=0 --�Ƿ��������
    begin
      update dbo.MYFAXINGSSUE set CardIdLossState =''1'',BackCardNum=''''
      where CardNO=@cardNo;
      if left(@System,1)=1 --�жϿ��Ƿ�ͨ����ϵͳ
      begin
       if @MJSate=1
        begin
         UPDATE  dbo.MYFAXINGSSUE set CardState=0 where CardNO=@cardNo;--��ҳɹ�
        end
      end
      else --���û��ͨ�������������ֱ���޸Ŀ�Ƭ״̬
      begin
       UPDATE  dbo.MYFAXINGSSUE set CardState=0 where CardNO=@cardNo;--��ҳɹ�
      end
    end
    else
    begin
      update dbo.MYFAXINGSSUE set CardIdLossState =''0'',BackCardNum=@CarFailID
      where CardNO=@cardNo;
    end
  end
end
end
begin
select @Return= CardState from  dbo.MYFAXINGSSUE where CardNO=@cardNo;
return @Return;
end

' 
END
GO
/****** Object:  View [dbo].[JJCYEARREPORT]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCYEARREPORT]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'
CREATE   VIEW [dbo].[JJCYEARREPORT] AS
 SELECT CARDSNO AS Months,ISNULL(IMONTHA,0) AS MonthA,ISNULL(IMONTHB,0) AS MonthB,ISNULL(IMONTHC,0) AS MonthC,ISNULL(IMONTHD,0) AS MonthD,ISNULL(ISUMMONTH,0) AS MonthTotal,ISNULL(IFREEA,0) AS FreeA,ISNULL(IFREEB,0) AS FreeB,ISNULL(ISUMFREE,0) AS FreeTotal,ISNULL(ITEMPA,0) AS TempA,ISNULL(ITEMPB,0) AS TempB,ISNULL(ITEMPC,0) AS TempC,ISNULL(ITEMPD,0) AS TempD,ISNULL(ITEMPE,0) AS TempE,ISNULL(ITEMPF,0) AS TempF,ISNULL(ITEMPG,0) AS TempG,ISNULL(ITEMPH,0) AS TempH,ISNULL(ISUMTEMP,0) AS TempTotal,ISNULL(IMONEY,0) AS TempSum,ISNULL(IMONEYA,0) AS StoreA,ISNULL(IMONEYB,0) AS StoreB,ISNULL(IMONEYC,0) AS StoreC,ISNULL(IMONEYD,0) AS StoreD,ISNULL(ISUMMONEY,0) AS StoreSum,ISNULL(ITEMPFREE,0) AS TmpFree,ISNULL(ZSUMCAR,0) AS TotalCars,ISNULL(ZSUMMONEY,0) AS TotalAmount FROM MYCARGOOUTRECORDREPORT
'
GO
/****** Object:  StoredProcedure [dbo].[M_RecordFiling]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[M_RecordFiling]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'CREATE procedure [dbo].[M_RecordFiling](
 @DateTme datetime)
as
begin
begin
insert into M_Rrecords_Filer  select * from M_Records where convert(varchar(100),OpenTime,23)<=convert(varchar(100),@DateTme,23)
delete M_Records where  convert(varchar(100),OpenTime,23)<= convert(varchar(100),@DateTme,23)
end
return @@error
end' 
END
GO
/****** Object:  StoredProcedure [dbo].[M_RecordFilDelete]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[M_RecordFilDelete]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'create procedure [dbo].[M_RecordFilDelete](
 @DateTme datetime)
as
begin
begin
delete M_Rrecords_Filer where  convert(varchar(100),OpenTime,23)<= convert(varchar(100),@DateTme,23)
end
return @@error
end' 
END
GO
/****** Object:  StoredProcedure [dbo].[M_RecordDelte]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[M_RecordDelte]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'CREATE procedure [dbo].[M_RecordDelte](
 @dts datetime,@dte datetime)
as
begin
begin
delete M_Records where   OpenTime  between   @dts  and @dte;
end
return @@error
end' 
END
GO
/****** Object:  StoredProcedure [dbo].[M_RecordDelete]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[M_RecordDelete]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'CREATE procedure [dbo].[M_RecordDelete](
 @DateTme datetime)
as
begin
begin
delete M_Rrecords_Filer where  convert(varchar(100),OpenTime,23)<= convert(varchar(100),@DateTme,23)
end
return @@error
end' 
END
GO
/****** Object:  View [dbo].[JJCMONTHREPORT]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCMONTHREPORT]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'
CREATE  VIEW [dbo].[JJCMONTHREPORT] AS
 SELECT CARDSNO AS Days,ISNULL(IMONTHA,0) AS MonthA,ISNULL(IMONTHB,0) AS MonthB,ISNULL(IMONTHC,0) AS MonthC,ISNULL(IMONTHD,0) AS MonthD,ISNULL(ISUMMONTH,0) AS MonthTotal,ISNULL(IFREEA,0) AS FreeA,ISNULL(IFREEB,0) AS FreeB,ISNULL(ISUMFREE,0) AS FreeTotal,ISNULL(ITEMPA,0) AS TempA,ISNULL(ITEMPB,0) AS TempB,ISNULL(ITEMPC,0) AS TempC,ISNULL(ITEMPD,0) AS TempD,ISNULL(ITEMPE,0) AS TempE,ISNULL(ITEMPF,0) AS TempF,ISNULL(ITEMPG,0) AS TempG,ISNULL(ITEMPH,0) AS TempH,ISNULL(ISUMTEMP,0) AS TempTotal,ISNULL(IMONEY,0) AS TempSum,ISNULL(IMONEYA,0) AS StoreA,ISNULL(IMONEYB,0) AS StoreB,ISNULL(IMONEYC,0) AS StoreC,ISNULL(IMONEYD,0) AS StoreD,ISNULL(ISUMMONEY,0) AS StoreSum,ISNULL(ITEMPFREE,0) AS TmpFree,ISNULL(ZSUMCAR,0) AS TotalCars,ISNULL(ZSUMMONEY,0) AS TotalAmount FROM MYCARGOOUTRECORDREPORT
'
GO
/****** Object:  StoredProcedure [dbo].[JJCUPDATELOST]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCUPDATELOST]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE    PROCEDURE [dbo].[JJCUPDATELOST]                 
                 @CARDSNO VARCHAR(10),
                 @LOSTCARDSNO CHAR(32),
                 @FLAG INT,
                 @LOSTRESUME INT
 AS
IF @LOSTRESUME=1
   BEGIN
    IF @FLAG=1
       BEGIN
             UPDATE MYICLOST
             SET CarLostOKNO=1 ,CarLostOKID=LTRIM(RTRIM(@LOSTCARDSNO))
             WHERE CardNO=LTRIM(RTRIM(@CARDSNO)) 
       END 
   
    IF @FLAG=2
       BEGIN
             UPDATE MYICLOST
             SET CarLostOKID=LTRIM(RTRIM(@LOSTCARDSNO))
             WHERE CardNO=LTRIM(RTRIM(@CARDSNO)) 
       END 
   END
IF @LOSTRESUME=2
   BEGIN
    IF @FLAG=1
       BEGIN
             UPDATE MYICLOST
             SET CarUnLostOKNO=1 ,CarLostOKID=LTRIM(RTRIM(@LOSTCARDSNO))
             WHERE CardNO=LTRIM(RTRIM(@CARDSNO)) 
       END 
   
    IF @FLAG=2
       BEGIN
             UPDATE MYICLOST
             SET CarLostOKID=LTRIM(RTRIM(@LOSTCARDSNO))
             WHERE CardNO=LTRIM(RTRIM(@CARDSNO)) 
       END 
   END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[JJCTICLOST]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCTICLOST]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE    PROCEDURE [dbo].[JJCTICLOST]                 
                 @CARDSNO CHAR(10),
                 @LOSTRESUME INT
 AS
  DECLARE @FALG  INT
 
  IF @LOSTRESUME=1
     BEGIN
       UPDATE MYICLOST
             SET CardState=''2''
             WHERE CardNO=LTRIM(RTRIM(@CARDSNO)) 
           
       UPDATE MYFAXINGSSUE
              SET CardState=''2''
             WHERE CardNO=LTRIM(RTRIM(@CARDSNO))  AND (CardState <>''4'' OR CardState<>''6'')
     END
  IF @LOSTRESUME=2
     BEGIN
       UPDATE MYICLOST
             SET CardState=''2''
             WHERE CardNO=LTRIM(RTRIM(@CARDSNO)) 
       UPDATE MYFAXINGSSUE
              SET CardState=''0''
             WHERE CardNO=LTRIM(RTRIM(@CARDSNO))   AND (CardState <>''4'' OR CardState<>''6'')
       DELETE FROM MYICLOST  WHERE CardNO=LTRIM(RTRIM(@CARDSNO)) 
     END
' 
END
GO
/****** Object:  StoredProcedure [dbo].[JJCTGETWRITESTORE]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCTGETWRITESTORE]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE             PROCEDURE [dbo].[JJCTGETWRITESTORE]             /*�볡��¼*/
                 @NO         VARCHAR(30), 
                 @CARCARDS   VARCHAR(20),                    
                 @CARDMODEL  VARCHAR(20),             
                 @FIRSTDATE  DATETIME,                                
                 @COMENAME   VARCHAR(100),
                 @OPERATORCARDS VARCHAR(30),
                 @OPERATORNAME  VARCHAR(50),
                 @COMEPICTURE   VARCHAR(256),
                 @MYONLINEFLAG  INT,                   /*���ߺ��ѻ�*/
                 @MYIDICFLAG    INT,                   /*IDIC��ʶ*/
                 @MYCARCOLOR    VARCHAR(10),           /*������ɫ*/
                 @MYBIGSMALLINT INT,
                 @MYCHECHANGBH  INT,
                 @CHARGE   MONEY ,                         /*����SFJE*/
                 @SHOUFEIKOUNAME   VARCHAR(100),           /*����SFGate��*/
                 @SHOUFEIKAHAO VARCHAR(30),          /*SFOperator*/
                 @SHOUFEIYUAN  VARCHAR(50),          /*SFOperator*/
                 @SHOUFEIFLAG  INT,                  /*�����ʶ*/
                 @IMONEY       MONEY,                 /*ʣ����*/
                 @MYMANPICTURE VARCHAR(256)
 AS
 DECLARE @SHOUFEIDATE DATETIME
IF @SHOUFEIFLAG=2                        /*�����շ�*/
	BEGIN
	    SET @SHOUFEIDATE=@FIRSTDATE  /*SFTime*/
	END
IF  @MYONLINEFLAG=20           /*20����/10�ѻ�*/
    BEGIN 
          IF @MYBIGSMALLINT=1   /*0�󳵳� 1С����*/
                BEGIN
		  INSERT INTO MYCARGOOUTRECORD (CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5)           
	              SELECT CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5 FROM MYCARCOMERECORD WHERE CarparkNO=@MYCHECHANGBH AND BigSmall=@MYBIGSMALLINT AND CardNO=LTRIM(RTRIM(@NO)) 
	          DELETE FROM MYCARCOMERECORD WHERE CarparkNO=@MYCHECHANGBH AND BigSmall=@MYBIGSMALLINT AND CardNO=LTRIM(RTRIM(@NO)) 
                  END
          ELSE
                BEGIN
		  INSERT INTO MYCARGOOUTRECORD (CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5)	             
	              SELECT CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5 FROM MYCARCOMERECORD WHERE  CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO))  
	          DELETE FROM MYCARCOMERECORD WHERE  CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO)) 
                  END               
      END
INSERT INTO MYCARCOMERECORD (CardNO,CPH,CardType,InTime,OutTime,InGateName,InOperatorCard,InOperator,InPic,InUser,SFJE,Balance,YSJE,SFTime,SFOperatorCard,SFOperator,SFGate,CarparkNO,BigSmall)
               VALUES (@NO,@CARCARDS,@CARDMODEL,@FIRSTDATE,@FIRSTDATE,@COMENAME,@OPERATORCARDS,@OPERATORNAME,@COMEPICTURE,@MYMANPICTURE,@CHARGE,@IMONEY,@CHARGE,@SHOUFEIDATE,@SHOUFEIKAHAO,@SHOUFEIYUAN,@SHOUFEIKOUNAME,@MYCHECHANGBH,@MYBIGSMALLINT)
' 
END
GO
/****** Object:  View [dbo].[MJRecordViewEnglish]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MJRecordViewEnglish]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'CREATE view [dbo].[MJRecordViewEnglish]
 as 
select 
case  r.CardID  when ''00000000'' then '''' else r.CardID end  as [CardID],
 t.carEname  as ''MJCardType''
,r.UserNO,c.UserName,c.DeptName,
r.MachNo,r.MachPlace,r.DoorNo,r.DoorPlace,
case    r.[Events]
when ''01''   then case CardID when  ''00000000'' THEN ''PC Command to open the door'' else  ''Credit card to open the door''  end 
when ''21'' then ''No card''
when ''03'' then ''Card not download''
when ''22'' then ''5sis only allowed to read the same card a''
when ''23'' then ''This card on the door without opening''
when ''04'' then ''Check card expired''
when ''05'' then ''Card HOLIDAY LIMITED''
when ''06'' then ''Time limit''
when ''07'' then ''Normally closed during the card invalid''
when ''02'' then ''System open HOLIDAY LIMITED''
when ''08'' then ''Limit the number of temporary card''
when ''10'' then ''Input password wrong door''
else  r.[Events] end    as [Events]
,r.OpenTime,
case  d.ControlType when 0 then ''ID DoorCard''     when 1 then ''IC DoorCard'' else cast( d.ControlType as varchar(20)) end  as ''ControlType''
from  
dbo.MJ_Recoredsview r left join MYFAXINGSSUE f on   right(r.CardID ,8)=f.CardNO  
left join MYJIBENZILIAO  c on r.UserNO=c.UserNO
left join M_DoorData d on r.MachNo=d.MachNo
left join dbo.M_CardType t on f.MJCardType= t.carid    
 '
GO
/****** Object:  View [dbo].[MJRecordViewChanese]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MJRecordViewChanese]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'





CREATE view [dbo].[MJRecordViewChanese]
 as 
select 
case  r.CardID  when ''00000000'' then '''' else r.CardID end  as [CardID],
--case   f.MJCardType when 1 then ''����''  when 2 then ''�û���'' when 3 then ''��ʱ��'' else f.MJCardType end as ''MJCardType''
t.carCname  as ''MJCardType''
,r.UserNO,c.UserName,c.DeptName,
r.MachNo,r.MachPlace,r.DoorNo,r.DoorPlace,
case    r.[Events]
when ''01''   then case CardID when  ''00000000'' THEN ''PCָ���'' else  ''ˢ������''  end 
when ''21'' then ''û�п���''
when ''03'' then ''��û������''
when ''22'' then ''5s��ֻ�����ͬһ�ſ�һ��''
when ''23'' then ''�˿��ڴ����޿�ͨ''
when ''04'' then ''ֹ������''
when ''05'' then ''���ļ�������''
when ''06'' then ''ʱ��������''
when ''07'' then ''�����ڼ������Ч''
when ''02'' then ''ϵͳ�������ƿ���''
when ''08'' then ''��ʱ����������''
when ''10'' then ''���뿪�����벻��''
else  r.[Events] end    as [Events]
,r.OpenTime,
case  d.ControlType when 0 then ''ID���Ž�''     when 1 then ''IC���Ž�'' else cast( d.ControlType as varchar(20)) end  as ''ControlType''
from  
dbo.MJ_Recoredsview r left join MYFAXINGSSUE f on   right(r.CardID ,8)=f.CardNO  
left join MYJIBENZILIAO  c on r.UserNO=c.UserNO
left join M_DoorData d on r.MachNo=d.MachNo
left join dbo.M_CardType t on f.MJCardType= t.carid  


 


'
GO
/****** Object:  StoredProcedure [dbo].[JJCTFINDALLLOST]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCTFINDALLLOST]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE    PROCEDURE [dbo].[JJCTFINDALLLOST]                
                 @CARDSNO VARCHAR(30),          
                 @LOSTRESUME INT
  AS
  DECLARE @MJ BIT 
  SELECT  @MJ=RIGHT(LEFT(LTRIM(RTRIM(SubSystem)),2),1) FROM VMYFAXINGSSUE WHERE CardNO=LTRIM(RTRIM(@CARDSNO))
IF @LOSTRESUME=1
   BEGIN
      SELECT * FROM MYICLOST 
         WHERE  CardNO=LTRIM(RTRIM(@CARDSNO)) AND  CarLostOKNO=0 AND MJLostOKNO=@MJ 
   END
IF @LOSTRESUME=2
   BEGIN
      SELECT * FROM MYICLOST 
         WHERE  CardNO=LTRIM(RTRIM(@CARDSNO)) AND  CarUnLostOKNO=1 AND MJUnLostOKNO= @MJ   
   END
' 
END
GO
/****** Object:  View [dbo].[JJCMJLOST]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCMJLOST]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'
CREATE  VIEW [dbo].[JJCMJLOST]
AS
SELECT DBO.JJCICLOST.CardNO, DBO.JJCICLOST.LossregDate, DBO.JJCICLOST.OperatorCardNO, 
      DBO.JJCICLOST.CardState, DBO.MYJIBENZILIAO.UserName, DBO.MYJIBENZILIAO.DeptName
FROM DBO.JJCICLOST INNER JOIN
      DBO.MYFAXINGSSUE ON DBO.JJCICLOST.CardNO = DBO.MYFAXINGSSUE.CardNO INNER JOIN
      DBO.MYJIBENZILIAO ON DBO.MYFAXINGSSUE.UserNO = DBO.MYJIBENZILIAO.UserNO
	WHERE LEN(LTRIM(RTRIM(DBO.MYFAXINGSSUE.CardNO)))<8
'
GO
/****** Object:  StoredProcedure [dbo].[JJCMJICLOST]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCMJICLOST]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE  PROCEDURE [dbo].[JJCMJICLOST] 
(
 @ICLOSTCORDID VARCHAR(30),    
 @LOSTRESUME INT
)
  AS
  DECLARE @MJ BIT
  DECLARE @TC BIT  
SELECT @TC=LEFT(LTRIM(RTRIM(SubSystem)),1),@MJ=RIGHT(LEFT(RTRIM(LTRIM(SubSystem)),2),1) 
FROM   VMYFAXINGSSUE WHERE CardNO=LTRIM(RTRIM(@ICLOSTCORDID))
IF @LOSTRESUME=1
   BEGIN
	UPDATE MYICLOST SET MYICLOST.MJLostOKNO=1 WHERE MYICLOST.CardNO=@ICLOSTCORDID AND @MJ=1
        IF EXISTS(SELECT * FROM DBO.MYICLOST WHERE  CardNO=LTRIM(RTRIM(@ICLOSTCORDID)) 
				AND  CarLostOKNO=@TC   )	
	UPDATE MYICLOST SET MYICLOST.CardState=''2'' WHERE MYICLOST.CardNO=@ICLOSTCORDID AND @MJ=1
	IF  (SELECT TOP 1 MYFAXINGSSUE.CardState FROM DBO.MYFAXINGSSUE  
                        WHERE DBO.MYFAXINGSSUE.CardNO=@ICLOSTCORDID ) <>''4'' AND
	    (SELECT TOP 1 MYFAXINGSSUE.CardState FROM DBO.MYFAXINGSSUE  
                        WHERE DBO.MYFAXINGSSUE.CardNO=@ICLOSTCORDID ) <>''6''		
		BEGIN		
			UPDATE MYFAXINGSSUE SET MYFAXINGSSUE.CardState=''2'' WHERE MYFAXINGSSUE.CardNO=@ICLOSTCORDID			
			RETURN 	
		END		
   END
IF @LOSTRESUME=2
   BEGIN
	UPDATE DBO.MYICLOST  SET DBO.MYICLOST.MJUnLostOKNO=1 WHERE DBO.MYICLOST.CardNO=@ICLOSTCORDID AND @MJ=1
	
	IF EXISTS(SELECT * FROM MYICLOST  WHERE  DBO.MYICLOST.CardNO=LTRIM(RTRIM(@ICLOSTCORDID)) AND 
		  CarUnLostOKNO=@TC    )
	    BEGIN
		UPDATE MYICLOST SET MYICLOST.CardState=''4'' WHERE MYICLOST.CardNO=LTRIM(RTRIM(@ICLOSTCORDID))
		DELETE DBO.MYICLOST WHERE DBO.MYICLOST.CardNO=LTRIM(RTRIM(@ICLOSTCORDID))
		
		IF  (SELECT TOP 1 MYFAXINGSSUE.CardState FROM DBO.MYFAXINGSSUE  
	                        WHERE DBO.MYFAXINGSSUE.CardNO=@ICLOSTCORDID ) <>''4'' AND
		    (SELECT TOP 1 MYFAXINGSSUE.CardState FROM DBO.MYFAXINGSSUE  
	                        WHERE DBO.MYFAXINGSSUE.CardNO=@ICLOSTCORDID ) <>''6''		
			BEGIN
				UPDATE MYFAXINGSSUE SET MYFAXINGSSUE.CardState=''0'' WHERE MYFAXINGSSUE.CardNO=@ICLOSTCORDID				
				RETURN 
			END	
	    END
   END
' 
END
GO
/****** Object:  View [dbo].[JJCVICVALID]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCVICVALID]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'CREATE VIEW [dbo].[JJCVICVALID]
AS
SELECT     dbo.MYFAXINGSSUE.CarCardType AS CardType, 

case  dbo.MYFAXINGSSUE.MJCardType when 1 then ''����''  when 2 then ''�û���'' when 3 then ''��ʱ��'' else dbo.MYFAXINGSSUE.MJCardType end as ''MJCardType''

,
 ISNULL(dbo.MYJIBENZILIAO.UserName, '''') AS UserName, 
                      ISNULL(dbo.MYJIBENZILIAO.DeptName, '''') AS DeptName, dbo.MYICVALID.OptDate, dbo.MYICVALID.NewStartDate, dbo.MYICVALID.NewEndDate, 
                      dbo.MYICVALID.NewEachDayStartTime, dbo.MYICVALID.NewEachDayEndTime, 
                      CASE DBO.MYICVALID.OptType WHEN ''T'' THEN ''CarPark'' WHEN ''M'' THEN ''AccessControl'' END AS OptType, dbo.MYICVALID.OperatorCardNO, 
                      dbo.MYFAXINGSSUE.Balance, dbo.VALIDNO(dbo.MYFAXINGSSUE.CarValidMachine, dbo.MYFAXINGSSUE.CardNO) AS ValidMachineID, 
                      dbo.MYFAXINGSSUE.CPH, dbo.MYCardType.CardType AS CarCardType, dbo.MYICVALID.CardNO--, myicmoney.SFJE as ''ExtensionSum1''
FROM         dbo.MYFAXINGSSUE INNER JOIN
                      dbo.MYCardType ON dbo.MYFAXINGSSUE.CarCardType = dbo.MYCardType.Identifying LEFT OUTER JOIN
                      dbo.MYJIBENZILIAO ON dbo.MYFAXINGSSUE.UserNO = dbo.MYJIBENZILIAO.UserNO RIGHT OUTER JOIN
                      dbo.MYICVALID ON dbo.MYICVALID.CardNO = dbo.MYFAXINGSSUE.CardNO   

'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPane1' , N'USER',N'dbo', N'VIEW',N'JJCVICVALID', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[32] 4[29] 2[20] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "MYFAXINGSSUE"
            Begin Extent = 
               Top = 8
               Left = 256
               Bottom = 206
               Right = 446
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "MYCardType"
            Begin Extent = 
               Top = 50
               Left = 7
               Bottom = 165
               Right = 168
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "MYJIBENZILIAO"
            Begin Extent = 
               Top = 8
               Left = 505
               Bottom = 123
               Right = 669
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "MYICVALID"
            Begin Extent = 
               Top = 142
               Left = 487
               Bottom = 363
               Right = 677
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 1425
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'JJCVICVALID'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPaneCount' , N'USER',N'dbo', N'VIEW',N'JJCVICVALID', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'JJCVICVALID'
GO
/****** Object:  View [dbo].[vMycargooutrecord]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[vMycargooutrecord]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'CREATE VIEW [dbo].[vMycargooutrecord]
AS
SELECT     ISNULL(dbo.VMYFAXINGSSUE.UserNO, '''') AS UserNO, ISNULL(dbo.VMYFAXINGSSUE.UserName, '''') AS UserName, 
                      ISNULL(dbo.VMYFAXINGSSUE.DeptName, '''') AS DeptName, dbo.MYCARGOOUTRECORD.CardNO, dbo.MYCARGOOUTRECORD.CPH, 
                      dbo.MYCARGOOUTRECORD.CardType, dbo.MYCARGOOUTRECORD.InTime, dbo.MYCARGOOUTRECORD.OutTime, 
                      dbo.MYCARGOOUTRECORD.InGateName, dbo.MYCARGOOUTRECORD.OutGateName, dbo.MYCARGOOUTRECORD.InOperatorCard, 
                      dbo.MYCARGOOUTRECORD.OutOperatorCard, dbo.MYCARGOOUTRECORD.InOperator, dbo.MYCARGOOUTRECORD.OutOperator, 
                      dbo.MYCARGOOUTRECORD.InPic, dbo.MYCARGOOUTRECORD.InUser, dbo.MYCARGOOUTRECORD.OutPic, dbo.MYCARGOOUTRECORD.OutUser, 
                      dbo.MYCARGOOUTRECORD.ZJPic, dbo.MYCARGOOUTRECORD.SFJE, dbo.MYCARGOOUTRECORD.Balance, dbo.MYCARGOOUTRECORD.YSJE, 
                      dbo.MYCARGOOUTRECORD.SFTime, dbo.MYCARGOOUTRECORD.SFOperator, dbo.MYCARGOOUTRECORD.SFOperatorCard, 
                      dbo.MYCARGOOUTRECORD.SFGate, dbo.MYCARGOOUTRECORD.OvertimeSymbol, dbo.MYCARGOOUTRECORD.OvertimeSFTime, 
                      dbo.MYCARGOOUTRECORD.OvertimeSFJE, dbo.MYCARGOOUTRECORD.CarparkNO, dbo.MYCARGOOUTRECORD.BigSmall, 
                      dbo.MYCARGOOUTRECORD.FreeReason, dbo.MYCardType.CardType AS CarCardType,dbo.MYCARGOOUTRECORD.StayTime, 
                      dbo.MYCARGOOUTRECORD.Temp1, dbo.MYCARGOOUTRECORD.Temp2, dbo.MYCARGOOUTRECORD.Temp3, dbo.MYCARGOOUTRECORD.Temp4, 
                      dbo.MYCARGOOUTRECORD.Temp5, dbo.MYCARGOOUTRECORD.bMorePaingCar, dbo.MYCARGOOUTRECORD.bDZ, dbo.MYCARGOOUTRECORD.strDZ
FROM         dbo.MYCARGOOUTRECORD INNER JOIN
                      dbo.MYCardType ON dbo.MYCARGOOUTRECORD.CardType = dbo.MYCardType.Identifying LEFT OUTER JOIN
                      dbo.VMYFAXINGSSUE ON dbo.MYCARGOOUTRECORD.CardNO = dbo.VMYFAXINGSSUE.CardNO
'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPane1' , N'USER',N'dbo', N'VIEW',N'vMycargooutrecord', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[40] 4[20] 2[20] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "MYCARGOOUTRECORD"
            Begin Extent = 
               Top = 24
               Left = 283
               Bottom = 222
               Right = 449
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "VMYFAXINGSSUE"
            Begin Extent = 
               Top = 25
               Left = 517
               Bottom = 140
               Right = 707
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "MYCardType"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 221
               Right = 172
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 900
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'vMycargooutrecord'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPaneCount' , N'USER',N'dbo', N'VIEW',N'vMycargooutrecord', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'vMycargooutrecord'
GO
/****** Object:  View [dbo].[vMycarcomerecord]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[vMycarcomerecord]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'CREATE VIEW [dbo].[vMycarcomerecord]
AS
SELECT     ISNULL(dbo.VMYFAXINGSSUE.UserNO, '''') AS UserNO, ISNULL(dbo.VMYFAXINGSSUE.UserName, '''') AS UserName, ISNULL(dbo.VMYFAXINGSSUE.DeptName, '''') 
                      AS DeptName, dbo.MYCARCOMERECORD.CardNO, dbo.MYCARCOMERECORD.CPH, dbo.MYCARCOMERECORD.CardType, dbo.MYCARCOMERECORD.InTime, 
                      dbo.MYCARCOMERECORD.OutTime, dbo.MYCARCOMERECORD.InGateName, dbo.MYCARCOMERECORD.OutGateName, dbo.MYCARCOMERECORD.InOperatorCard, 
                      dbo.MYCARCOMERECORD.OutOperatorCard, dbo.MYCARCOMERECORD.InOperator, dbo.MYCARCOMERECORD.OutOperator, dbo.MYCARCOMERECORD.InPic, 
                      dbo.MYCARCOMERECORD.InUser, dbo.MYCARCOMERECORD.OutPic, dbo.MYCARCOMERECORD.OutUser, dbo.MYCARCOMERECORD.ZJPic, 
                      dbo.MYCARCOMERECORD.SFJE, dbo.MYCARCOMERECORD.Balance, dbo.MYCARCOMERECORD.YSJE, dbo.MYCARCOMERECORD.SFTime, 
                      dbo.MYCARCOMERECORD.SFOperator, dbo.MYCARCOMERECORD.SFOperatorCard, dbo.MYCARCOMERECORD.SFGate, dbo.MYCARCOMERECORD.OvertimeSymbol, 
                      dbo.MYCARCOMERECORD.OvertimeSFTime, dbo.MYCARCOMERECORD.OvertimeSFJE, dbo.MYCARCOMERECORD.CarparkNO, dbo.MYCARCOMERECORD.BigSmall, 
                      dbo.MYCARCOMERECORD.FreeReason, dbo.MYCardType.CardType AS CarCardType, dbo.MYCARCOMERECORD.Temp4
FROM         dbo.MYCardType RIGHT OUTER JOIN
                      dbo.MYCARCOMERECORD ON dbo.MYCardType.Identifying = dbo.MYCARCOMERECORD.CardType LEFT OUTER JOIN
                      dbo.VMYFAXINGSSUE ON dbo.MYCARCOMERECORD.CardNO = dbo.VMYFAXINGSSUE.CardNO
					  '
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPane1' , N'USER',N'dbo', N'VIEW',N'vMycarcomerecord', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[26] 4[36] 2[20] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "MYCARCOMERECORD"
            Begin Extent = 
               Top = 18
               Left = 300
               Bottom = 133
               Right = 466
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "VMYFAXINGSSUE"
            Begin Extent = 
               Top = 20
               Left = 563
               Bottom = 135
               Right = 753
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "MYCardType"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 121
               Right = 172
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 3195
         Table = 2505
         Output = 1785
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'vMycarcomerecord'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPaneCount' , N'USER',N'dbo', N'VIEW',N'vMycarcomerecord', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'vMycarcomerecord'
GO
/****** Object:  View [dbo].[vFileMycargooutrecord]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[vFileMycargooutrecord]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'CREATE VIEW [dbo].[vFileMycargooutrecord]
AS
SELECT     ISNULL(dbo.VMYFAXINGSSUE.UserNO, '''') AS UserNO, ISNULL(dbo.VMYFAXINGSSUE.UserName, '''') AS UserName, 
                      ISNULL(dbo.VMYFAXINGSSUE.DeptName, '''') AS DeptName, dbo.MYRECORDQUERY.CardNO, dbo.MYRECORDQUERY.CPH, 
                      dbo.MYRECORDQUERY.CardType, dbo.MYRECORDQUERY.InTime, dbo.MYRECORDQUERY.OutTime, dbo.MYRECORDQUERY.InGateName, 
                      dbo.MYRECORDQUERY.OutGateName, dbo.MYRECORDQUERY.InOperatorCard, dbo.MYRECORDQUERY.OutOperatorCard, 
                      dbo.MYRECORDQUERY.InOperator, dbo.MYRECORDQUERY.OutOperator, dbo.MYRECORDQUERY.InPic, dbo.MYRECORDQUERY.InUser, 
                      dbo.MYRECORDQUERY.OutPic, dbo.MYRECORDQUERY.OutUser, dbo.MYRECORDQUERY.ZJPic, dbo.MYRECORDQUERY.SFJE, 
                      dbo.MYRECORDQUERY.Balance, dbo.MYRECORDQUERY.YSJE, dbo.MYRECORDQUERY.SFTime, dbo.MYRECORDQUERY.SFOperator, 
                      dbo.MYRECORDQUERY.SFOperatorCard, dbo.MYRECORDQUERY.SFGate, dbo.MYRECORDQUERY.OvertimeSymbol, 
                      dbo.MYRECORDQUERY.OvertimeSFTime, dbo.MYRECORDQUERY.OvertimeSFJE, dbo.MYRECORDQUERY.CarparkNO, 
                      dbo.MYRECORDQUERY.BigSmall, dbo.MYRECORDQUERY.FreeReason, dbo.MYCardType.CardType AS CarCardType,
                      dbo.MYRECORDQUERY.StayTime, dbo.MYRECORDQUERY.Temp1, dbo.MYRECORDQUERY.Temp2, dbo.MYRECORDQUERY.Temp3, 
                      dbo.MYRECORDQUERY.Temp4, dbo.MYRECORDQUERY.Temp5, dbo.MYRECORDQUERY.bMorePaingCar, dbo.MYRECORDQUERY.bDZ, dbo.MYRECORDQUERY.strDZ, dbo.VMYFAXINGSSUE.HomeAddress
FROM         dbo.MYRECORDQUERY INNER JOIN
                      dbo.MYCardType ON dbo.MYRECORDQUERY.CardType = dbo.MYCardType.Identifying LEFT OUTER JOIN
                      dbo.VMYFAXINGSSUE ON dbo.MYRECORDQUERY.CardNO = dbo.VMYFAXINGSSUE.CardNO
'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPane1' , N'USER',N'dbo', N'VIEW',N'vFileMycargooutrecord', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[40] 4[20] 2[20] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "MYCardType"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 121
               Right = 172
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "MYRECORDQUERY"
            Begin Extent = 
               Top = 6
               Left = 412
               Bottom = 121
               Right = 578
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "VMYFAXINGSSUE"
            Begin Extent = 
               Top = 6
               Left = 210
               Bottom = 121
               Right = 400
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 900
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'vFileMycargooutrecord'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPaneCount' , N'USER',N'dbo', N'VIEW',N'vFileMycargooutrecord', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'vFileMycargooutrecord'
GO
/****** Object:  View [dbo].[RVMYFAXINGSSUE]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[RVMYFAXINGSSUE]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'
CREATE VIEW [dbo].[RVMYFAXINGSSUE]
AS
SELECT     dbo.MYFAXINGSSUE.CardNO, dbo.MYFAXINGSSUE.UserNO, dbo.MYFAXINGSSUE.CardState, dbo.MYFAXINGSSUE.CardYJ, 
                      dbo.JJCZXT(dbo.MYFAXINGSSUE.SubSystem) AS SubSystem, dbo.MYFAXINGSSUE.CarIssueDate, dbo.MYFAXINGSSUE.CarIssueUserCard, 
                      dbo.MYFAXINGSSUE.Balance, dbo.MYFAXINGSSUE.CarValidStartDate, dbo.MYFAXINGSSUE.CarValidEndDate, dbo.MYFAXINGSSUE.CPH, 
                      dbo.MYFAXINGSSUE.CarType, dbo.MYFAXINGSSUE.CarPlace, dbo.MYFAXINGSSUE.CarWithdrawCardDate, dbo.MYFAXINGSSUE.CarWithdrawOptCard, 
                      dbo.VALIDNO(LEFT(dbo.MYFAXINGSSUE.CarValidMachine, 64), dbo.MYFAXINGSSUE.CardNO) AS CarValidMachine, dbo.MYFAXINGSSUE.CarValidZone, 
                      dbo.MYFAXINGSSUE.CarMemo, 
                     -- dbo.MYFAXINGSSUE.MJCardType
                     -- ,
                       dbo.MYFAXINGSSUE.MJIssueDate, dbo.MYFAXINGSSUE.MJIssueUserCard, 
                      dbo.MYFAXINGSSUE.MJEndDate, dbo.MYFAXINGSSUE.MJValidStartTime, dbo.MYFAXINGSSUE.MJValidEndTime, 
                      dbo.VALIDNO(LEFT(dbo.MYFAXINGSSUE.MJValidMachine, 64), dbo.MYFAXINGSSUE.CardNO) AS MJValidMachine, 
                      dbo.MYFAXINGSSUE.MJWithdrawCardDate, dbo.MYFAXINGSSUE.MJWithdrawOptCard, dbo.MYFAXINGSSUE.MJMemo, 
                      dbo.MYFAXINGSSUE.IssueDate, dbo.MYFAXINGSSUE.WithdrawDate, dbo.MYFAXINGSSUE.IssueUserCard, dbo.MYFAXINGSSUE.WithdrawUserCard, 
                      dbo.MYFAXINGSSUE.LossregDate, dbo.MYFAXINGSSUE.LossregUserCard, ISNULL(dbo.MYJIBENZILIAO.UserName, '''') AS UserName, 
                      ISNULL(dbo.MYJIBENZILIAO.HomeAddress, '''') AS HomeAddress, ISNULL(dbo.MYJIBENZILIAO.DeptName, '''') AS DeptName, 
                      dbo.MYFAXINGSSUE.CardIDNO, dbo.MYFAXINGSSUE.DownloadSignal, dbo.MYFAXINGSSUE.CarPic, dbo.MYCardType.CardType AS CarCardType, 
                      dbo.MYFAXINGSSUE.CarCardType AS CardType,
                      case  dbo.MYFAXINGSSUE.MJCardType when 1 then ''����''  when 2 then ''�û���'' when 3 then ''��ʱ��'' else dbo.MYFAXINGSSUE.MJCardType end as ''MJCardType''

FROM         dbo.MYFAXINGSSUE INNER JOIN
                      dbo.MYCardType ON dbo.MYFAXINGSSUE.CarCardType = dbo.MYCardType.Identifying LEFT OUTER JOIN
                      dbo.MYJIBENZILIAO ON dbo.MYFAXINGSSUE.UserNO = dbo.MYJIBENZILIAO.UserNO

'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPane1' , N'USER',N'dbo', N'VIEW',N'RVMYFAXINGSSUE', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[40] 4[20] 2[20] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "MYFAXINGSSUE"
            Begin Extent = 
               Top = 4
               Left = 316
               Bottom = 236
               Right = 506
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "MYJIBENZILIAO"
            Begin Extent = 
               Top = 19
               Left = 592
               Bottom = 252
               Right = 756
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "MYCardType"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 121
               Right = 172
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 2430
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'RVMYFAXINGSSUE'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPaneCount' , N'USER',N'dbo', N'VIEW',N'RVMYFAXINGSSUE', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'RVMYFAXINGSSUE'
GO


--2017-04-01
--2017-11-09 add dbo.VMYFAXINGSSUE.HomeAddress
ALTER VIEW [dbo].[vMycargooutrecord]
AS
SELECT     ISNULL(dbo.VMYFAXINGSSUE.UserNO, '') AS UserNO, ISNULL(dbo.VMYFAXINGSSUE.UserName, '') AS UserName, 
                      ISNULL(dbo.VMYFAXINGSSUE.DeptName, '') AS DeptName, dbo.MYCARGOOUTRECORD.CardNO, dbo.MYCARGOOUTRECORD.CPH, 
                      dbo.MYCARGOOUTRECORD.CardType, dbo.MYCARGOOUTRECORD.InTime, dbo.MYCARGOOUTRECORD.OutTime, 
                      dbo.MYCARGOOUTRECORD.InGateName, dbo.MYCARGOOUTRECORD.OutGateName, dbo.MYCARGOOUTRECORD.InOperatorCard, 
                      dbo.MYCARGOOUTRECORD.OutOperatorCard, dbo.MYCARGOOUTRECORD.InOperator, dbo.MYCARGOOUTRECORD.OutOperator, 
                      dbo.MYCARGOOUTRECORD.InPic, dbo.MYCARGOOUTRECORD.InUser, dbo.MYCARGOOUTRECORD.OutPic, dbo.MYCARGOOUTRECORD.OutUser, 
                      dbo.MYCARGOOUTRECORD.ZJPic, dbo.MYCARGOOUTRECORD.SFJE, dbo.MYCARGOOUTRECORD.Balance, dbo.MYCARGOOUTRECORD.YSJE, 
                      dbo.MYCARGOOUTRECORD.SFTime, dbo.MYCARGOOUTRECORD.SFOperator, dbo.MYCARGOOUTRECORD.SFOperatorCard, 
                      dbo.MYCARGOOUTRECORD.SFGate, dbo.MYCARGOOUTRECORD.OvertimeSymbol, dbo.MYCARGOOUTRECORD.OvertimeSFTime, 
                      dbo.MYCARGOOUTRECORD.OvertimeSFJE, dbo.MYCARGOOUTRECORD.CarparkNO, dbo.MYCARGOOUTRECORD.BigSmall, 
                      dbo.MYCARGOOUTRECORD.FreeReason, dbo.MYCardType.CardType AS CarCardType,dbo.MYCARGOOUTRECORD.StayTime, 
                      dbo.MYCARGOOUTRECORD.Temp1, dbo.MYCARGOOUTRECORD.Temp2, dbo.MYCARGOOUTRECORD.Temp3, dbo.MYCARGOOUTRECORD.Temp4, 
                      dbo.MYCARGOOUTRECORD.Temp5, dbo.MYCARGOOUTRECORD.bMorePaingCar, dbo.MYCARGOOUTRECORD.bDZ, dbo.MYCARGOOUTRECORD.strDZ, dbo.VMYFAXINGSSUE.HomeAddress
FROM         dbo.MYCARGOOUTRECORD INNER JOIN
                      dbo.MYCardType ON dbo.MYCARGOOUTRECORD.CardType = dbo.MYCardType.Identifying LEFT OUTER JOIN
                      dbo.VMYFAXINGSSUE ON dbo.MYCARGOOUTRECORD.CardNO = dbo.VMYFAXINGSSUE.CardNO

GO




/****** Object:  View [dbo].[VStatistics]    Script Date: 03/23/2017 11:00:57 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[VStatistics]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'CREATE VIEW [dbo].[VStatistics]
AS
select * from vMycargooutrecord
UNION ALL 
select * from vFileMycargooutrecord 
'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPane1' , N'USER',N'dbo', N'VIEW',N'VStatistics', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[40] 4[20] 2[20] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "vMycargooutrecord"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 121
               Right = 204
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "vFileMycargooutrecord"
            Begin Extent = 
               Top = 6
               Left = 242
               Bottom = 121
               Right = 408
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 900
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'VStatistics'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPaneCount' , N'USER',N'dbo', N'VIEW',N'VStatistics', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'VStatistics'
GO
/****** Object:  View [dbo].[JJCICVALID]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCICVALID]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'CREATE VIEW [dbo].[JJCICVALID]
AS
SELECT     A.CardNO, A.MJCardType, A.UserName, A.DeptName, A.OptDate, A.NewStartDate, A.NewEndDate, A.NewEachDayStartTime, A.NewEachDayEndTime, 
                      A.OptType, A.OperatorCardNO, A.Balance, A.ValidMachineID, A.CPH, B.SFJE AS ExtensionSum, dbo.MYCardType.CardType AS CarCardType
FROM         dbo.JJCVICVALID AS A INNER JOIN
                      dbo.MYICMONEY AS B ON A.CardNO = B.CardNO AND CONVERT(varchar(10), A.OptDate, 120) = CONVERT(varchar(10), B.OptDate, 120) INNER JOIN
                      dbo.MYCardType ON A.CarCardType = dbo.MYCardType.Identifying
'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPane1' , N'USER',N'dbo', N'VIEW',N'JJCICVALID', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[40] 4[20] 2[20] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "A"
            Begin Extent = 
               Top = 10
               Left = 320
               Bottom = 231
               Right = 510
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "B"
            Begin Extent = 
               Top = 9
               Left = 668
               Bottom = 233
               Right = 831
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "MYCardType"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 121
               Right = 172
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 1950
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'JJCICVALID'
GO
IF NOT EXISTS (SELECT * FROM ::fn_listextendedproperty(N'MS_DiagramPaneCount' , N'USER',N'dbo', N'VIEW',N'JJCICVALID', NULL,NULL))
EXEC dbo.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'USER',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'JJCICVALID'
GO
/****** Object:  StoredProcedure [dbo].[JJCCARRECORDDAY]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCCARRECORDDAY]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE   PROCEDURE [dbo].[JJCCARRECORDDAY]                    --�ձ���
                  @OPERATORCARD VARCHAR(50),          --����Ա����(����)
                  @IMONEY MONEY,                      --���н��
                  @FIRSTDATE DATETIME,                --��ʼ����
                  @LASTDATE DATETIME,                 --��������
                  @FLAG INT,                          --��ʾ���ꡢ�¡���
                  @DATAINT DATETIME,                  --����
                  @IINT INT                           --����
AS 
   DECLARE @IMONTHA INT          --�¿�
   DECLARE @IMONTHB INT          --�¿�
   DECLARE @IMONTHC INT          --�¿�
   DECLARE @IMONTHD INT          --�¿�
   DECLARE @IMONTHE INT          --�¿�
   DECLARE @IMONTHF INT          --�¿�
   DECLARE @IMONTHG INT          --�¿�
   DECLARE @IMONTHH INT          --�¿�
   DECLARE @ISUMMONTH INT       --���¿���
   DECLARE @IFREEA INT       --��ѿ�
   DECLARE @IFREEB INT       --��ѿ�
   DECLARE @ISUMFREE INT     --�������
   DECLARE @ITEMPA INT      --��ʱ��
   DECLARE @ITEMPB INT      --��ʱ��
   DECLARE @ITEMPC INT      --��ʱ��
   DECLARE @ITEMPD INT      --��ʱ��
   DECLARE @ITEMPE INT      --��ʱ��
   DECLARE @ITEMPF INT      --��ʱ��
   DECLARE @ITEMPG INT      --��ʱ��
   DECLARE @ITEMPH INT      --��ʱ��
   DECLARE @IMONEYA INT     --��ֵ��
   DECLARE @IMONEYB INT     --��ֵ��
   DECLARE @IMONEYC INT     --��ֵ��
   DECLARE @IMONEYD INT     --��ֵ��
   DECLARE @ISUMTEMP INT    --��ʱ��������
   DECLARE @ISUMMONEY INT   --��ֵ��������
   DECLARE @ZSUMCAR INT     --���п���
   DECLARE @ZSUMMONEY MONEY --�ܽ��
   DECLARE @ITFREE INT      --���⳵
   DECLARE @ITMONEY MONEY      --���⳵���   
   DECLARE @MONTHTEMPMONEY MONEY --ÿ��ÿ�����ʱ���շ�
   DECLARE @MONEYDAY  MONEY      --ÿ��ÿ��Ĵ�ֵ���շ�
   DECLARE @TEMPMONEY MONEY      --ÿ��ÿ�����⳵���		
         SELECT @IMONTHA=0
         SELECT @IMONTHB=0
         SELECT @IMONTHC=0
         SELECT @IMONTHD=0
         SELECT @ISUMMONTH=0
         SELECT @IFREEA=0
         SELECT @IFREEB=0
         SELECT @ISUMFREE=0
         SELECT @ITEMPA=0
         SELECT @ITEMPB=0
         SELECT @ITEMPC=0
         SELECT @ITEMPD=0
         SELECT @ITEMPE=0
         SELECT @ITEMPF=0
         SELECT @ITEMPG=0
         SELECT @ITEMPH=0
         SELECT @IMONEYA=0
         SELECT @IMONEYB=0
         SELECT @IMONEYC=0
         SELECT @IMONEYD=0
         SELECT @MONTHTEMPMONEY=0
         SELECT @MONEYDAY=0
         SELECT @ITFREE=0
	 SELECT @TEMPMONEY=0
 
   IF @FLAG=1   --������Ա
      BEGIN       
         SELECT @IMONTHA=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthA''
        SELECT @IMONTHB=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthB''
         SELECT @IMONTHC=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthC''
         SELECT @IMONTHD=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthD''
         SELECT @IMONTHE=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthE''
         SELECT @IMONTHF=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthF''
         SELECT @IMONTHG=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthG''
         SELECT @IMONTHH=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthH''
          SELECT @IFREEA= COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''FreA''
         SELECT @IFREEB= COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''FreB''
         SELECT @ITFREE= COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''Tfr''
         SELECT @ITEMPA=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpA'' OR CardType=''MtpA'')
         SELECT @ITEMPB=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpB'' OR CardType=''MtpB'')
         SELECT @ITEMPC=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpC'' OR CardType=''MtpC'')
         SELECT @ITEMPD=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpD'' OR CardType=''MtpD'')
         SELECT @ITEMPE=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpE'' OR CardType=''MtpE'')
         SELECT @ITEMPF=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpF'' OR CardType=''MtpF'')
         SELECT @ITEMPG=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpG'' OR CardType=''MtpG'')
         SELECT @ITEMPH=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpH'' OR CardType=''MtpH'')
         SELECT @IMONEYA=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrA''
         SELECT @IMONEYB=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrB''
          SELECT @IMONEYC=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrC''
         SELECT @IMONEYD=COUNT(CardType)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrD''
         SELECT @MONTHTEMPMONEY=SUM(CASE WHEN SFJE>0 THEN SFJE ELSE 0 END)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (LEFT(LTRIM(RTRIM(CardType)),3)=''Tmp'' OR LEFT(LTRIM(RTRIM(CardType)),3)=''Mtp'')
               	 SELECT @TEMPMONEY=SUM(CASE WHEN YSJE>0 THEN YSJE ELSE 0 END)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (LEFT(LTRIM(RTRIM(CardType)),3)=''Tfr'')
         SELECT @MONEYDAY=SUM(CASE WHEN SFJE>0 THEN SFJE ELSE 0 END)
               FROM VStatistics
               WHERE (OutOperatorCard=@OPERATORCARD  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND LEFT(LTRIM(RTRIM(CardType)),3)=''Str''
         SELECT @MONTHTEMPMONEY=ISNULL(@MONTHTEMPMONEY,0)
         SELECT @ISUMMONTH=@IMONTHA+@IMONTHB+@IMONTHC+@IMONTHD
         SELECT @ISUMFREE=@IFREEA+@IFREEB
         SELECT @ISUMTEMP=@ITEMPA+@ITEMPB+@ITEMPC+@ITEMPD+@ITEMPE+@ITEMPF+@ITEMPG+@ITEMPH
         SELECT @ISUMMONEY=@IMONEYA+@IMONEYB+@IMONEYC+@IMONEYD
         SELECT @ZSUMCAR=@ISUMTEMP+@ISUMMONEY+@ISUMMONTH+@ISUMFREE+@ITFREE
         SELECT @ZSUMMONEY=@MONTHTEMPMONEY+ISNULL(@MONEYDAY,0) 
	 SELECT @ITMONEY=ISNULL(@TEMPMONEY,0) 
           INSERT INTO MYCARGOOUTRECORDREPORT (CARDSNO,IMONTHA,IMONTHB,IMONTHC,IMONTHD,IMONTHE,IMONTHF,IMONTHG,IMONTHH,ISUMMONTH,IFREEA,IFREEB,ISUMFREE,ITEMPA,ITEMPB,ITEMPC,ITEMPD,ITEMPE,ITEMPF,ITEMPG,ITEMPH,ISUMTEMP,
                       IMONEYA,IMONEYB,IMONEYC,IMONEYD,ISUMMONEY,IMONEY,ZSUMCAR,ZSUMMONEY,ITEMPFREE,ITEMPMONEY)
                  VALUES (@OPERATORCARD,@IMONTHA,@IMONTHB,@IMONTHC,@IMONTHD,@IMONTHE,@IMONTHF,@IMONTHG,@IMONTHH,@ISUMMONTH,@IFREEA,@IFREEB,@ISUMFREE,@ITEMPA,@ITEMPB,@ITEMPC,@ITEMPD,@ITEMPE,@ITEMPF,@ITEMPG,@ITEMPH,@ISUMTEMP,
                        @IMONEYA,@IMONEYB,@IMONEYC,@IMONEYD,@ISUMMONEY,@MONTHTEMPMONEY,@ZSUMCAR,@ZSUMMONEY,@ITFREE,@ITMONEY)
      END
  
   IF @FLAG=2   --����
      BEGIN
           SELECT @MONTHTEMPMONEY=SUM(CASE WHEN SFJE>0 THEN SFJE ELSE 0 END)  FROM  VStatistics
                  WHERE YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT)  AND (LEFT(CardType,3)=''Tmp'' OR LEFT(CardType,3)=''Mtp'')
                  GROUP BY  YEAR(OutTime)+''-''+ MONTH(OutTime) +''-'' +DAY(OutTime)
                     SELECT @TEMPMONEY=SUM(CASE WHEN YSJE>0 THEN YSJE ELSE 0 END)  FROM  VStatistics
                  WHERE YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT)  AND (LEFT(CardType,3)=''Tfr'')
                  GROUP BY  YEAR(OutTime)+''-''+ MONTH(OutTime) +''-'' +DAY(OutTime)		
           SELECT @MONEYDAY=SUM(CASE WHEN SFJE>0 THEN SFJE ELSE 0 END)
                  FROM VStatistics
                  WHERE YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT)  AND LEFT(CardType,3)=''Str''
                  GROUP BY  YEAR(OutTime)+''-''+ MONTH(OutTime) +''-'' +DAY(OutTime)
         SELECT @IMONTHA=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                      AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthA''
         SELECT @IMONTHB=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                      AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthB''
         SELECT @IMONTHC=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                      AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthC''
         SELECT @IMONTHD=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                      AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthD''
         SELECT @IMONTHE=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                      AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthE''
         SELECT @IMONTHF=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                      AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthF''
         SELECT @IMONTHG=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                      AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthG''
         SELECT @IMONTHH=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                      AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthH''
         SELECT @IFREEA= COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                       AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''FreA''
         SELECT @IFREEB= COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                       AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''FreB''
          SELECT @ITFREE= COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                       AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''Tfr''
           SELECT @ITEMPA=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                       AND OutOperatorCard<>''''  AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpA'' OR CardType=''MtpA'')
          SELECT @ITEMPB=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                     AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpB'' OR CardType=''MtpB'')
         SELECT @ITEMPC=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                     AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpC'' OR CardType=''MtpC'')
         SELECT @ITEMPD=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                     AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpD'' OR CardType=''MtpD'')
         SELECT @ITEMPE=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                     AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpE'' OR CardType=''MtpE'')
         SELECT @ITEMPF=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                     AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpF'' OR CardType=''MtpF'')
          SELECT @ITEMPG=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                     AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpG'' OR CardType=''MtpG'')
         SELECT @ITEMPH=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                     AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpH'' OR CardType=''MtpH'')
         SELECT @IMONEYA=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                       AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrA''
         SELECT @IMONEYB=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                    AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrB''
          SELECT @IMONEYC=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                       AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrC''
         SELECT @IMONEYD=COUNT(CardType)
               FROM VStatistics
               WHERE ((YEAR(OutTime)=YEAR(@DATAINT) AND MONTH(OutTime)=MONTH(@DATAINT) AND DAY(OutTime)=DAY(@DATAINT))
                       AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrD''
         SELECT @ISUMMONTH=@IMONTHA+@IMONTHB+@IMONTHC+@IMONTHD
         SELECT @ISUMFREE=@IFREEA+@IFREEB
         SELECT @ISUMTEMP=@ITEMPA+@ITEMPB+@ITEMPC+@ITEMPD+@ITEMPE+@ITEMPF+@ITEMPG+@ITEMPH
         SELECT @ISUMMONEY=@IMONEYA+@IMONEYB+@IMONEYC+@IMONEYD
         SELECT @ZSUMCAR=@ISUMTEMP+@ISUMMONEY+@ISUMMONTH+@ISUMFREE+@ITFREE
         SELECT @ZSUMMONEY=@MONTHTEMPMONEY+@MONEYDAY         
	 SELECT @ITMONEY=@TEMPMONEY
         DELETE FROM MYCARGOOUTRECORDREPORT WHERE CARDSNO=@OPERATORCARD
           INSERT INTO MYCARGOOUTRECORDREPORT (CARDSNO,IMONTHA,IMONTHB,IMONTHC,IMONTHD,IMONTHE,IMONTHF,IMONTHG,IMONTHH,ISUMMONTH,IFREEA,IFREEB,ISUMFREE,ITEMPA,ITEMPB,ITEMPC,ITEMPD,ITEMPE,ITEMPF,ITEMPG,ITEMPH,ISUMTEMP,
                       IMONEYA,IMONEYB,IMONEYC,IMONEYD,ISUMMONEY,IMONEY,ZSUMCAR,ZSUMMONEY,ITEMPFREE,ITEMPMONEY)
                  VALUES (@OPERATORCARD,@IMONTHA,@IMONTHB,@IMONTHC,@IMONTHD,@IMONTHE,@IMONTHF,@IMONTHG,@IMONTHH,@ISUMMONTH,@IFREEA,@IFREEB,@ISUMFREE,@ITEMPA,@ITEMPB,@ITEMPC,@ITEMPD,@ITEMPE,@ITEMPF,@ITEMPG,@ITEMPH,@ISUMTEMP,
                        @IMONEYA,@IMONEYB,@IMONEYC,@IMONEYD,@ISUMMONEY,@MONTHTEMPMONEY,@ZSUMCAR,@ZSUMMONEY,@ITFREE,@ITMONEY)
      END
  IF @FLAG=3   --����
      BEGIN
           SELECT @MONTHTEMPMONEY=SUM(CASE WHEN SFJE>0 THEN SFJE ELSE 0 END)  FROM  VStatistics
                  WHERE  MONTH(OutTime)=@IINT  AND (LEFT(CardType,3)=''Tmp'' OR LEFT(CardType,3)=''Mtp'')
                   GROUP BY MONTH(OutTime) 
                      SELECT @TEMPMONEY=SUM(CASE WHEN YSJE>0 THEN YSJE ELSE 0 END)  FROM  VStatistics
                  WHERE  MONTH(OutTime)=@IINT  AND (LEFT(CardType,3)=''Tfr'')
                   GROUP BY MONTH(OutTime)  
           SELECT @MONEYDAY=SUM(CASE WHEN SFJE>0 THEN SFJE ELSE 0 END)  FROM  VStatistics
                  WHERE  MONTH(OutTime)=@IINT  AND LEFT(CardType,3)=''Str''
                  GROUP BY MONTH(OutTime) 
         SELECT @IMONTHA=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthA''
         SELECT @IMONTHB=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthB''
         SELECT @IMONTHC=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthC''
         SELECT @IMONTHD=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthD''
         SELECT @IMONTHE=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthE''
         SELECT @IMONTHF=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthF''
         SELECT @IMONTHG=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthG''
         SELECT @IMONTHH=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''MthH''
         SELECT @IFREEA= COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''FreA''
         SELECT @IFREEB= COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''FreB''
         SELECT @ITFREE= COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''Tfr''
          SELECT @ITEMPA=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpA'' OR CardType=''MtpA'')
          SELECT @ITEMPB=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpB'' OR CardType=''MtpB'')
         SELECT @ITEMPC=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpC'' OR CardType=''MtpC'')
         SELECT @ITEMPD=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpD'' OR CardType=''MtpD'')
         SELECT @ITEMPE=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpE'' OR CardType=''MtpE'')
         SELECT @ITEMPF=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpF'' OR CardType=''MtpF'')
         SELECT @ITEMPG=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpG'' OR CardType=''MtpG'')
         SELECT @ITEMPH=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND (CardType=''TmpH'' OR CardType=''MtpH'')
         SELECT @IMONEYA=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrA''
         SELECT @IMONEYB=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrB''
         SELECT @IMONEYC=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrC''
         SELECT @IMONEYD=COUNT(CardType)
               FROM VStatistics
               WHERE (MONTH(OutTime)=@IINT AND OutOperatorCard<>'''' AND  OutTime BETWEEN  @FIRSTDATE AND @LASTDATE ) AND CardType=''StrD''
         SELECT @ISUMMONTH=@IMONTHA+@IMONTHB+@IMONTHC+@IMONTHD
         SELECT @ISUMFREE=@IFREEA+@IFREEB
         SELECT @ISUMTEMP=@ITEMPA+@ITEMPB+@ITEMPC+@ITEMPD+@ITEMPE+@ITEMPF+@ITEMPG+@ITEMPH
         SELECT @ISUMMONEY=@IMONEYA+@IMONEYB+@IMONEYC+@IMONEYD
         SELECT @ZSUMCAR=@ISUMTEMP+@ISUMMONEY+@ISUMMONTH+@ISUMFREE+@ITFREE
         SELECT @ZSUMMONEY=@MONTHTEMPMONEY+@MONEYDAY    
	 SELECT @ITMONEY=@TEMPMONEY	     
         DELETE FROM MYCARGOOUTRECORDREPORT WHERE CARDSNO=@OPERATORCARD 
           INSERT INTO MYCARGOOUTRECORDREPORT (CARDSNO,IMONTHA,IMONTHB,IMONTHC,IMONTHD,IMONTHE,IMONTHF,IMONTHG,IMONTHH,ISUMMONTH,IFREEA,IFREEB,ISUMFREE,ITEMPA,ITEMPB,ITEMPC,ITEMPD,ITEMPE,ITEMPF,ITEMPG,ITEMPH,ISUMTEMP,
                       IMONEYA,IMONEYB,IMONEYC,IMONEYD,ISUMMONEY,IMONEY,ZSUMCAR,ZSUMMONEY,ITEMPFREE,ITEMPMONEY)
                  VALUES (@OPERATORCARD,@IMONTHA,@IMONTHB,@IMONTHC,@IMONTHD,@IMONTHE,@IMONTHF,@IMONTHG,@IMONTHH,@ISUMMONTH,@IFREEA,@IFREEB,@ISUMFREE,@ITEMPA,@ITEMPB,@ITEMPC,@ITEMPD,@ITEMPE,@ITEMPF,@ITEMPG,@ITEMPH,@ISUMTEMP,
                        @IMONEYA,@IMONEYB,@IMONEYC,@IMONEYD,@ISUMMONEY,@MONTHTEMPMONEY,@ZSUMCAR,@ZSUMMONEY,@ITFREE,@ITMONEY)
      END
' 
END
GO
/****** Object:  Default [DF_MYBUMENSET_DeptName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYBUMENSET_DeptName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYBUMENSET_DeptName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYBUMENSET] ADD  CONSTRAINT [DF_MYBUMENSET_DeptName]  DEFAULT ('') FOR [DeptName]
END


END
GO
/****** Object:  Default [DF_MYCAOZUOYUAN_CardNO]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCAOZUOYUAN_CardNO]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCAOZUOYUAN_CardNO]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCAOZUOYUAN] ADD  CONSTRAINT [DF_MYCAOZUOYUAN_CardNO]  DEFAULT (space((0))) FOR [CardNO]
END


END
GO
/****** Object:  Default [DF_MYCAOZUOYUAN_CardType]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCAOZUOYUAN_CardType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCAOZUOYUAN_CardType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCAOZUOYUAN] ADD  CONSTRAINT [DF_MYCAOZUOYUAN_CardType]  DEFAULT (space((0))) FOR [CardType]
END


END
GO
/****** Object:  Default [DF_MYCAOZUOYUAN_UserNO]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCAOZUOYUAN_UserNO]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCAOZUOYUAN_UserNO]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCAOZUOYUAN] ADD  CONSTRAINT [DF_MYCAOZUOYUAN_UserNO]  DEFAULT (space((0))) FOR [UserNO]
END


END
GO
/****** Object:  Default [DF_MYCAOZUOYUAN_UserName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCAOZUOYUAN_UserName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCAOZUOYUAN_UserName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCAOZUOYUAN] ADD  CONSTRAINT [DF_MYCAOZUOYUAN_UserName]  DEFAULT (space((0))) FOR [UserName]
END


END
GO
/****** Object:  Default [DF_MYCAOZUOYUAN_DeptName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCAOZUOYUAN_DeptName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCAOZUOYUAN_DeptName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCAOZUOYUAN] ADD  CONSTRAINT [DF_MYCAOZUOYUAN_DeptName]  DEFAULT ('') FOR [DeptName]
END


END
GO
/****** Object:  Default [DF_MYCAOZUOYUAN_Pwd]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCAOZUOYUAN_Pwd]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCAOZUOYUAN_Pwd]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCAOZUOYUAN] ADD  CONSTRAINT [DF_MYCAOZUOYUAN_Pwd]  DEFAULT (space((0))) FOR [Pwd]
END


END
GO
/****** Object:  Default [DF_MYCAOZUOYUAN_CardState]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCAOZUOYUAN_CardState]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCAOZUOYUAN_CardState]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCAOZUOYUAN] ADD  CONSTRAINT [DF_MYCAOZUOYUAN_CardState]  DEFAULT ((0)) FOR [CardState]
END


END
GO
/****** Object:  Default [DF_MYCAOZUOYUAN_UserLevel]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCAOZUOYUAN_UserLevel]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCAOZUOYUAN_UserLevel]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCAOZUOYUAN] ADD  CONSTRAINT [DF_MYCAOZUOYUAN_UserLevel]  DEFAULT ((1)) FOR [UserLevel]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_CPH]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_CPH]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_CPH]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_CPH]  DEFAULT ('') FOR [CPH]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_CardType]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_CardType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_CardType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_CardType]  DEFAULT ('') FOR [CardType]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_InGateName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_InGateName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_InGateName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_InGateName]  DEFAULT ('') FOR [InGateName]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_OutGateName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_OutGateName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_OutGateName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_OutGateName]  DEFAULT ('') FOR [OutGateName]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_InOperatorCard]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_InOperatorCard]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_InOperatorCard]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_InOperatorCard]  DEFAULT ('') FOR [InOperatorCard]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_InOperator]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_InOperator]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_InOperator]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_InOperator]  DEFAULT ('') FOR [InOperator]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_InPic]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_InPic]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_InPic]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_InPic]  DEFAULT ('') FOR [InPic]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_InUser]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_InUser]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_InUser]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_InUser]  DEFAULT ('') FOR [InUser]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_OutPic]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_OutPic]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_OutPic]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_OutPic]  DEFAULT ('') FOR [OutPic]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_OutUser]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_OutUser]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_OutUser]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_OutUser]  DEFAULT ('') FOR [OutUser]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_ZJPic]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_ZJPic]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_ZJPic]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_ZJPic]  DEFAULT ('') FOR [ZJPic]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_SFJE]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_SFJE]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_SFJE]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_SFJE]  DEFAULT ((0)) FOR [SFJE]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_Balance]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_Balance]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_Balance]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_Balance]  DEFAULT ((0)) FOR [Balance]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_YSJE]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_YSJE]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_YSJE]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_YSJE]  DEFAULT ((0)) FOR [YSJE]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_SFOperator]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_SFOperator]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_SFOperator]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_SFOperator]  DEFAULT ('') FOR [SFOperator]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_SFOperatorCard]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_SFOperatorCard]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_SFOperatorCard]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_SFOperatorCard]  DEFAULT ('') FOR [SFOperatorCard]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_SFGate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_SFGate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_SFGate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_SFGate]  DEFAULT ('') FOR [SFGate]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_OvertimeSymbol]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_OvertimeSymbol]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_OvertimeSymbol]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_OvertimeSymbol]  DEFAULT ('') FOR [OvertimeSymbol]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_OvertimeSFJE]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_OvertimeSFJE]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_OvertimeSFJE]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_OvertimeSFJE]  DEFAULT ((0)) FOR [OvertimeSFJE]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_CarparkNO]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_CarparkNO]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_CarparkNO]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_CarparkNO]  DEFAULT ((0)) FOR [CarparkNO]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_BigSmall]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_BigSmall]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_BigSmall]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_BigSmall]  DEFAULT ((0)) FOR [BigSmall]
END


END
GO
/****** Object:  Default [DF_MYCARCOMERECORD_FreeReason]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARCOMERECORD_FreeReason]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARCOMERECORD_FreeReason]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARCOMERECORD] ADD  CONSTRAINT [DF_MYCARCOMERECORD_FreeReason]  DEFAULT ('') FOR [FreeReason]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_CPH]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_CPH]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_CPH]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_CPH]  DEFAULT ('') FOR [CPH]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_CardType]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_CardType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_CardType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_CardType]  DEFAULT ('') FOR [CardType]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_InGateName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_InGateName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_InGateName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_InGateName]  DEFAULT ('') FOR [InGateName]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_OutGateName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_OutGateName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_OutGateName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_OutGateName]  DEFAULT ('') FOR [OutGateName]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_InOperatorCard]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_InOperatorCard]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_InOperatorCard]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_InOperatorCard]  DEFAULT ('') FOR [InOperatorCard]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_InOperator]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_InOperator]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_InOperator]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_InOperator]  DEFAULT ('') FOR [InOperator]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_InPic]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_InPic]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_InPic]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_InPic]  DEFAULT ('') FOR [InPic]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_InUser]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_InUser]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_InUser]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_InUser]  DEFAULT ('') FOR [InUser]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_OutPic]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_OutPic]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_OutPic]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_OutPic]  DEFAULT ('') FOR [OutPic]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_OutUser]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_OutUser]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_OutUser]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_OutUser]  DEFAULT ('') FOR [OutUser]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_ZJPic]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_ZJPic]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_ZJPic]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_ZJPic]  DEFAULT ('') FOR [ZJPic]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_SFJE]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_SFJE]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_SFJE]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_SFJE]  DEFAULT ((0)) FOR [SFJE]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_Balance]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_Balance]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_Balance]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_Balance]  DEFAULT ((0)) FOR [Balance]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_YSJE]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_YSJE]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_YSJE]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_YSJE]  DEFAULT ((0)) FOR [YSJE]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_SFOperator]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_SFOperator]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_SFOperator]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_SFOperator]  DEFAULT ('') FOR [SFOperator]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_SFOperatorCard]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_SFOperatorCard]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_SFOperatorCard]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_SFOperatorCard]  DEFAULT ('') FOR [SFOperatorCard]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_SFGate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_SFGate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_SFGate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_SFGate]  DEFAULT ('') FOR [SFGate]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_OvertimeSymbol]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_OvertimeSymbol]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_OvertimeSymbol]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_OvertimeSymbol]  DEFAULT ('') FOR [OvertimeSymbol]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_OvertimeSFJE]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_OvertimeSFJE]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_OvertimeSFJE]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_OvertimeSFJE]  DEFAULT ((0)) FOR [OvertimeSFJE]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_CarparkNO]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_CarparkNO]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_CarparkNO]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_CarparkNO]  DEFAULT ((0)) FOR [CarparkNO]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_BigSmall]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_BigSmall]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_BigSmall]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_BigSmall]  DEFAULT ((0)) FOR [BigSmall]
END


END
GO
/****** Object:  Default [DF_MYCARGOOUTRECORD_FreeReason]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCARGOOUTRECORD_FreeReason]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCARGOOUTRECORD_FreeReason]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCARGOOUTRECORD] ADD  CONSTRAINT [DF_MYCARGOOUTRECORD_FreeReason]  DEFAULT ('') FOR [FreeReason]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGNORMALSHOUFEI_FreeMinute]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGNORMALSHOUFEI_FreeMinute]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGNORMALSHOUFEI_FreeMinute]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGNORMALSHOUFEI] ADD  CONSTRAINT [DF_MYCHECHANGNORMALSHOUFEI_FreeMinute]  DEFAULT ((0)) FOR [FreeMinute]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGNORMALSHOUFEI_TopSF]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGNORMALSHOUFEI_TopSF]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGNORMALSHOUFEI_TopSF]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGNORMALSHOUFEI] ADD  CONSTRAINT [DF_MYCHECHANGNORMALSHOUFEI_TopSF]  DEFAULT ((30)) FOR [TopSF]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGNORMALSHOUFEI_Hours]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGNORMALSHOUFEI_Hours]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGNORMALSHOUFEI_Hours]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGNORMALSHOUFEI] ADD  CONSTRAINT [DF_MYCHECHANGNORMALSHOUFEI_Hours]  DEFAULT ((1)) FOR [Hours]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGNORMALSHOUFEI_JE]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGNORMALSHOUFEI_JE]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGNORMALSHOUFEI_JE]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGNORMALSHOUFEI] ADD  CONSTRAINT [DF_MYCHECHANGNORMALSHOUFEI_JE]  DEFAULT ((0)) FOR [JE]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGPASS_Pwd]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGPASS_Pwd]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGPASS_Pwd]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGPASS] ADD  CONSTRAINT [DF_MYCHECHANGPASS_Pwd]  DEFAULT ('') FOR [Pwd]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGPASS_PCName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGPASS_PCName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGPASS_PCName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGPASS] ADD  CONSTRAINT [DF_MYCHECHANGPASS_PCName]  DEFAULT ('') FOR [PCName]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGPASS_BakeupTime]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGPASS_BakeupTime]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGPASS_BakeupTime]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGPASS] ADD  CONSTRAINT [DF_MYCHECHANGPASS_BakeupTime]  DEFAULT (((2000)-(1))-(1)) FOR [BakeupTime]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGSTATUS_PCName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGSTATUS_PCName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGSTATUS_PCName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGSTATUS] ADD  CONSTRAINT [DF_MYCHECHANGSTATUS_PCName]  DEFAULT ('') FOR [PCName]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGSTATUS_Online]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGSTATUS_Online]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGSTATUS_Online]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGSTATUS] ADD  CONSTRAINT [DF_MYCHECHANGSTATUS_Online]  DEFAULT ((0)) FOR [Online]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_StationNO]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_StationNO]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_StationNO]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_StationNO]  DEFAULT ((1)) FOR [StationNO]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_CarparkNO]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_CarparkNO]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_CarparkNO]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_CarparkNO]  DEFAULT ((0)) FOR [CarparkNO]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_HasImage]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_HasImage]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_HasImage]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_HasImage]  DEFAULT ((0)) FOR [HasImage]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_ImageSave]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_ImageSave]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_ImageSave]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_ImageSave]  DEFAULT ((1)) FOR [ImageSave]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_SaveDays]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_SaveDays]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_SaveDays]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_SaveDays]  DEFAULT ((0)) FOR [SaveDays]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_ImagePath]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_ImagePath]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_ImagePath]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_ImagePath]  DEFAULT ('') FOR [ImagePath]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_TotalCarSpace]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_TotalCarSpace]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_TotalCarSpace]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_TotalCarSpace]  DEFAULT ((9999)) FOR [TotalCarSpace]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_CarSpaceScreen]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_CarSpaceScreen]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_CarSpaceScreen]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_CarSpaceScreen]  DEFAULT ((0)) FOR [CarSpaceScreen]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_CarSpaceScreenNumber]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_CarSpaceScreenNumber]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_CarSpaceScreenNumber]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_CarSpaceScreenNumber]  DEFAULT ((0)) FOR [CarSpaceScreenNumber]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_CarSpaceScreenCom]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_CarSpaceScreenCom]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_CarSpaceScreenCom]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_CarSpaceScreenCom]  DEFAULT ((0)) FOR [CarSpaceScreenCom]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_FullSpaceLight]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_FullSpaceLight]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_FullSpaceLight]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_FullSpaceLight]  DEFAULT ((0)) FOR [FullSpaceLight]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_FullSpaceLightNumber]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_FullSpaceLightNumber]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_FullSpaceLightNumber]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_FullSpaceLightNumber]  DEFAULT ((0)) FOR [FullSpaceLightNumber]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_FullSpaceLightCom]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_FullSpaceLightCom]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_FullSpaceLightCom]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_FullSpaceLightCom]  DEFAULT ((0)) FOR [FullSpaceLightCom]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_MoneyScreen]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_MoneyScreen]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_MoneyScreen]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_MoneyScreen]  DEFAULT ((0)) FOR [MoneyScreen]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_MoneyScreenCom]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_MoneyScreenCom]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_MoneyScreenCom]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_MoneyScreenCom]  DEFAULT ((0)) FOR [MoneyScreenCom]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_BillPrint]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_BillPrint]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_BillPrint]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_BillPrint]  DEFAULT ((0)) FOR [BillPrint]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_Monitor01]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_Monitor01]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_Monitor01]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_Monitor01]  DEFAULT ((0)) FOR [Monitor01]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_Monitor02]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_Monitor02]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_Monitor02]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_Monitor02]  DEFAULT ((0)) FOR [Monitor02]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_FreeCarOK]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_FreeCarOK]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_FreeCarOK]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_FreeCarOK]  DEFAULT ((0)) FOR [FreeCarOK]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_TempFreeCarOK]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_TempFreeCarOK]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_TempFreeCarOK]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_TempFreeCarOK]  DEFAULT ((0)) FOR [TempFreeCarOK]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_ZJZP]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_ZJZP]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_ZJZP]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_ZJZP]  DEFAULT ((0)) FOR [ZJZP]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_ZPID]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_ZPID]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_ZPID]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_ZPID]  DEFAULT ((0)) FOR [ZPID]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_YKCSSF]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_YKCSSF]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_YKCSSF]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_YKCSSF]  DEFAULT ((0)) FOR [YKCSSF]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_CenterSFCS]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_CenterSFCS]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_CenterSFCS]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_CenterSFCS]  DEFAULT ((0)) FOR [CenterSFCS]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_CenterCSJE]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_CenterCSJE]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_CenterCSJE]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_CenterCSJE]  DEFAULT ((0.0)) FOR [CenterCSJE]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_SFOption]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_SFOption]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_SFOption]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_SFOption]  DEFAULT ((0)) FOR [SFOption]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_SFMode]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_SFMode]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_SFMode]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_SFMode]  DEFAULT ((0)) FOR [SFMode]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_HasPoint]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_HasPoint]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_HasPoint]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_HasPoint]  DEFAULT ((0)) FOR [HasPoint]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_PointNum]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_PointNum]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_PointNum]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_PointNum]  DEFAULT ((1)) FOR [PointNum]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_Discount]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_Discount]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_Discount]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_Discount]  DEFAULT ((0)) FOR [Discount]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_RealtimeDownload]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_RealtimeDownload]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_RealtimeDownload]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_RealtimeDownload]  DEFAULT ((0)) FOR [RealtimeDownload]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_DownloadCardValid]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_DownloadCardValid]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_DownloadCardValid]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_DownloadCardValid]  DEFAULT ((0)) FOR [DownloadCardValid]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_TimeLoadMode]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_TimeLoadMode]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_TimeLoadMode]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_TimeLoadMode]  DEFAULT ((0)) FOR [TimeLoadMode]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_TimeLoadInterval]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_TimeLoadInterval]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_TimeLoadInterval]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_TimeLoadInterval]  DEFAULT ((30)) FOR [TimeLoadInterval]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_InOutTimeInterval]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_InOutTimeInterval]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_InOutTimeInterval]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_InOutTimeInterval]  DEFAULT ((60)) FOR [InOutTimeInterval]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_PwdCheck]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_PwdCheck]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_PwdCheck]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_PwdCheck]  DEFAULT ((0)) FOR [PwdCheck]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_ShowDZState]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_ShowDZState]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_ShowDZState]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_ShowDZState]  DEFAULT ((0)) FOR [ShowDZState]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_ShowReceiveCardBox]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_ShowReceiveCardBox]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_ShowReceiveCardBox]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_ShowReceiveCardBox]  DEFAULT ((0)) FOR [ShowReceiveCardBox]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_CompareAccuracy]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_CompareAccuracy]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_CompareAccuracy]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_CompareAccuracy]  DEFAULT ((4)) FOR [CompareAccuracy]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_ControlInOut]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_ControlInOut]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_ControlInOut]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_ControlInOut]  DEFAULT ((0)) FOR [ControlInOut]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_VideoCardType]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_VideoCardType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_VideoCardType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_VideoCardType]  DEFAULT ((0)) FOR [VideoCardType]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_LoadCharge]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_LoadCharge]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_LoadCharge]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_LoadCharge]  DEFAULT ((0)) FOR [LoadCharge]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_ReadCardLogin]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_ReadCardLogin]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_ReadCardLogin]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_ReadCardLogin]  DEFAULT ((0)) FOR [ReadCardLogin]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_PCName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_PCName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_PCName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_PCName]  DEFAULT ('') FOR [PCName]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_DisplayTime]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_DisplayTime]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_DisplayTime]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_DisplayTime]  DEFAULT ((1)) FOR [DisplayTime]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_VideoShiftTime]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_VideoShiftTime]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_VideoShiftTime]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_VideoShiftTime]  DEFAULT ((30)) FOR [VideoShiftTime]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_VideoBrightness]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_VideoBrightness]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_VideoBrightness]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_VideoBrightness]  DEFAULT ((0)) FOR [VideoBrightness]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_VideoResolution]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_VideoResolution]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_VideoResolution]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_VideoResolution]  DEFAULT ((0)) FOR [VideoResolution]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_VideoFour]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_VideoFour]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_VideoFour]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_VideoFour]  DEFAULT ((0)) FOR [VideoFour]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_PersonVideo]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_PersonVideo]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_PersonVideo]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_PersonVideo]  DEFAULT ((0)) FOR [PersonVideo]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_CtrlVolume]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_CtrlVolume]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_CtrlVolume]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_CtrlVolume]  DEFAULT ('') FOR [CtrlVolume]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_PrintFontSize]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_PrintFontSize]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_PrintFontSize]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_PrintFontSize]  DEFAULT ((8)) FOR [PrintFontSize]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_BillPrintAuto]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_BillPrintAuto]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_BillPrintAuto]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_BillPrintAuto]  DEFAULT ((0)) FOR [BillPrintAuto]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_SetTempCardPlate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_SetTempCardPlate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_SetTempCardPlate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_SetTempCardPlate]  DEFAULT ((1)) FOR [TempCardPrePlate]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_AutoPrePlate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_AutoPrePlate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_AutoPrePlate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_AutoPrePlate]  DEFAULT ((0)) FOR [AutoPrePlate]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_SetTempCardType]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_SetTempCardType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_SetTempCardType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_SetTempCardType]  DEFAULT ((0)) FOR [SetTempCardType]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_SetTempMoney]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_SetTempMoney]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_SetTempMoney]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_SetTempMoney]  DEFAULT ((0)) FOR [SetTempMoney]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_TempTypeDefineOK]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_TempTypeDefineOK]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_TempTypeDefineOK]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_TempTypeDefineOK]  DEFAULT ((0)) FOR [TempTypeDefineOK]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_TempTypeDefineString]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_TempTypeDefineString]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_TempTypeDefineString]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_TempTypeDefineString]  DEFAULT ('') FOR [TempTypeDefineString]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_IDSoftOpen]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_IDSoftOpen]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_IDSoftOpen]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_IDSoftOpen]  DEFAULT ((1)) FOR [IDSoftOpen]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_IDNoticeDay_1]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_IDNoticeDay_1]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_IDNoticeDay_1]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_IDNoticeDay_1]  DEFAULT ((10)) FOR [IDNoticeDay]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_IdSfCancel]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_IdSfCancel]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_IdSfCancel]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_IdSfCancel]  DEFAULT ((0)) FOR [IdSfCancel]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_IdReReadHandle]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_IdReReadHandle]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_IdReReadHandle]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_IdReReadHandle]  DEFAULT ((0)) FOR [IdReReadHandle]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_IdPlateDownLoad]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_IdPlateDownLoad]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_IdPlateDownLoad]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_IdPlateDownLoad]  DEFAULT ((0)) FOR [IdPlateDownLoad]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_ID1In1OutCardType]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_ID1In1OutCardType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_ID1In1OutCardType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_ID1In1OutCardType]  DEFAULT ('') FOR [ID1In1OutCardType]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_IDComfirmOpenEnable]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_IDComfirmOpenEnable]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_IDComfirmOpenEnable]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_IDComfirmOpenEnable]  DEFAULT ((0)) FOR [IDComfirmOpenEnable]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_IDComfirmOpenCardType]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_IDComfirmOpenCardType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_IDComfirmOpenCardType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_IDComfirmOpenCardType]  DEFAULT ('') FOR [IDComfirmOpenCardType]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_ForbidSamePosition]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_ForbidSamePosition]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_ForbidSamePosition]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_ForbidSamePosition]  DEFAULT ((0)) FOR [ForbidSamePosition]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_MonthYQRule]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_MonthYQRule]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_MonthYQRule]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_MonthYQRule]  DEFAULT ((0)) FOR [MonthYQRule]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_CtrlVoiceLedVersion]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_CtrlVoiceLedVersion]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_CtrlVoiceLedVersion]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_CtrlVoiceLedVersion]  DEFAULT ((1)) FOR [CtrlVoiceLedVersion]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_CtrlVoiceMode]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_CtrlVoiceMode]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_CtrlVoiceMode]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_CtrlVoiceMode]  DEFAULT ((0)) FOR [CtrlVoiceMode]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_PcTalkPlate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_PcTalkPlate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_PcTalkPlate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_PcTalkPlate]  DEFAULT ((0)) FOR [PcTalkPlate]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_CtrlShowPlate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_CtrlShowPlate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_CtrlShowPlate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_CtrlShowPlate]  DEFAULT ((0)) FOR [CtrlShowPlate]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_CtrlShowStayTime]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_CtrlShowStayTime]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_CtrlShowStayTime]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_CtrlShowStayTime]  DEFAULT ((0)) FOR [CtrlShowStayTime]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_CtrlShowRemainPos]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_CtrlShowRemainPos]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_CtrlShowRemainPos]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_CtrlShowRemainPos]  DEFAULT ((0)) FOR [CtrlShowRemainPos]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_CtrlShowInfo]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_CtrlShowInfo]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_CtrlShowInfo]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_CtrlShowInfo]  DEFAULT ((0)) FOR [CtrlShowInfo]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_CtrlShowCW]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_CtrlShowCW]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_CtrlShowCW]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_CtrlShowCW]  DEFAULT ((0)) FOR [CtrlShowCW]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_RemainPosLedShowInfo]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_RemainPosLedShowInfo]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_RemainPosLedShowInfo]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_RemainPosLedShowInfo]  DEFAULT ((0)) FOR [RemainPosLedShowInfo]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_RemainPosLedShowPlate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_RemainPosLedShowPlate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_RemainPosLedShowPlate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_RemainPosLedShowPlate]  DEFAULT ((0)) FOR [RemainPosLedShowPlate]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_CarPosLedLen]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_CarPosLedLen]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_CarPosLedLen]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_CarPosLedLen]  DEFAULT ((6)) FOR [CarPosLedLen]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_SFLedType]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_SFLedType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_SFLedType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_SFLedType]  DEFAULT ((0)) FOR [SFLedType]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_SumMoneyHide]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_SumMoneyHide]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_SumMoneyHide]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_SumMoneyHide]  DEFAULT ((0)) FOR [SumMoneyHide]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_ExitOnlineByPwd]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_ExitOnlineByPwd]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_ExitOnlineByPwd]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_ExitOnlineByPwd]  DEFAULT ((0)) FOR [ExitOnlineByPwd]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_CtrlSetHasPwd]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_CtrlSetHasPwd]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_CtrlSetHasPwd]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_CtrlSetHasPwd]  DEFAULT ((0)) FOR [CtrlSetHasPwd]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_SoftOpenNoPlate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_SoftOpenNoPlate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_SoftOpenNoPlate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_SoftOpenNoPlate]  DEFAULT ((0)) FOR [SoftOpenNoPlate]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_AreaDefault]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_AreaDefault]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_AreaDefault]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_AreaDefault]  DEFAULT ('') FOR [AreaDefault]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_OneKeyShortCut]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_OneKeyShortCut]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_OneKeyShortCut]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_OneKeyShortCut]  DEFAULT ((0)) FOR [OneKeyShortCut]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_CheDuiMode]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_CheDuiMode]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_CheDuiMode]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_CheDuiMode]  DEFAULT ((0)) FOR [CheDuiMode]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_InOutQueryName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_InOutQueryName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_InOutQueryName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_InOutQueryName]  DEFAULT ((1)) FOR [InOutQueryName]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_ExceptionHandle]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_ExceptionHandle]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_ExceptionHandle]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_ExceptionHandle]  DEFAULT ((1)) FOR [ExceptionHandle]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_ShowTempCardNum]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_ShowTempCardNum]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_ShowTempCardNum]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_ShowTempCardNum]  DEFAULT ((0)) FOR [ShowTempCardNum]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_ReLoginPrint]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_ReLoginPrint]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_ReLoginPrint]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_ReLoginPrint]  DEFAULT ((0)) FOR [ReLoginPrint]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_FreeCardNoInPlace]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_FreeCardNoInPlace]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_FreeCardNoInPlace]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_FreeCardNoInPlace]  DEFAULT ((0)) FOR [FreeCardNoInPlace]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_CheckPortFirst]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_CheckPortFirst]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_CheckPortFirst]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_CheckPortFirst]  DEFAULT ((0)) FOR [CheckPortFirst]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_SaveDetailLog]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_SaveDetailLog]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_SaveDetailLog]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_SaveDetailLog]  DEFAULT ((0)) FOR [SaveDetailLog]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_OnlyShowThisRemainPos]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_OnlyShowThisRemainPos]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_OnlyShowThisRemainPos]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_OnlyShowThisRemainPos]  DEFAULT ((0)) FOR [OnlyShowThisRemainPos]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_TempCarPlaceNum]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_TempCarPlaceNum]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_TempCarPlaceNum]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_TempCarPlaceNum]  DEFAULT ((0)) FOR [TempCarPlaceNum]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_MonthCarPlaceNum]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_MonthCarPlaceNum]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_MonthCarPlaceNum]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_MonthCarPlaceNum]  DEFAULT ((0)) FOR [MonthCarPlaceNum]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_MoneyCarPlaceNum]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_MoneyCarPlaceNum]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_MoneyCarPlaceNum]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_MoneyCarPlaceNum]  DEFAULT ((0)) FOR [MoneyCarPlaceNum]
END


END
GO
/****** Object:  Default [DF_MYCHECHANGXITONGSET_bBarCodePrint]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCHECHANGXITONGSET_bBarCodePrint]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCHECHANGXITONGSET_bBarCodePrint]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCHECHANGXITONGSET] ADD  CONSTRAINT [DF_MYCHECHANGXITONGSET_bBarCodePrint]  DEFAULT ((0)) FOR [bBarCodePrint]
END


END
GO
/****** Object:  Default [DF_MYCOMPUTERSET_PCName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYCOMPUTERSET_PCName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYCOMPUTERSET_PCName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYCOMPUTERSET] ADD  CONSTRAINT [DF_MYCOMPUTERSET_PCName]  DEFAULT ('') FOR [PCName]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CardState]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CardState]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CardState]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CardState]  DEFAULT ('0') FOR [CardState]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CardYJ]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CardYJ]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CardYJ]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CardYJ]  DEFAULT ((0)) FOR [CardYJ]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CardLossMachine]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CardLossMachine]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CardLossMachine]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CardLossMachine]  DEFAULT ('FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF') FOR [CardLossMachine]
END


END
GO

/****** Object:  Default [DF_MYFAXINGSSUE_MjPassword]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_MjPassword]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_MjPassword]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_MjPassword]  DEFAULT ('888888') FOR [MjPassword]
END


END
GO


/****** Object:  Default [DF_MYFAXINGSSUE_SubSystem]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_SubSystem]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_SubSystem]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_SubSystem]  DEFAULT ('00000') FOR [SubSystem]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CarCardType]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CarCardType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CarCardType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CarCardType]  DEFAULT (space((1))) FOR [CarCardType]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CarIssueDate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CarIssueDate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CarIssueDate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CarIssueDate]  DEFAULT (NULL) FOR [CarIssueDate]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CarIssueUserCard]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CarIssueUserCard]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CarIssueUserCard]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CarIssueUserCard]  DEFAULT ('') FOR [CarIssueUserCard]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_Balance]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_Balance]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_Balance]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_Balance]  DEFAULT ((0)) FOR [Balance]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CarValidStartDate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CarValidStartDate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CarValidStartDate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CarValidStartDate]  DEFAULT (NULL) FOR [CarValidStartDate]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CarValidEndDate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CarValidEndDate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CarValidEndDate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CarValidEndDate]  DEFAULT (NULL) FOR [CarValidEndDate]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CPH]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CPH]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CPH]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CPH]  DEFAULT (space((1))) FOR [CPH]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CarColor]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CarColor]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CarColor]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CarColor]  DEFAULT ((0)) FOR [CarColor]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CarType]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CarType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CarType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CarType]  DEFAULT (space((1))) FOR [CarType]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CarPlace]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CarPlace]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CarPlace]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CarPlace]  DEFAULT (space((1))) FOR [CarPlace]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CarWithdrawCardDate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CarWithdrawCardDate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CarWithdrawCardDate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CarWithdrawCardDate]  DEFAULT (NULL) FOR [CarWithdrawCardDate]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CarWithdrawOptCard]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CarWithdrawOptCard]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CarWithdrawOptCard]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CarWithdrawOptCard]  DEFAULT ('') FOR [CarWithdrawOptCard]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CarValidMachine]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CarValidMachine]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CarValidMachine]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CarValidMachine]  DEFAULT (replicate('F',(256))) FOR [CarValidMachine]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CarValidZone]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CarValidZone]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CarValidZone]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CarValidZone]  DEFAULT (replicate('0',(16))) FOR [CarValidZone]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CarMemo]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CarMemo]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CarMemo]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CarMemo]  DEFAULT (space((1))) FOR [CarMemo]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_MJCardType]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_MJCardType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_MJCardType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_MJCardType]  DEFAULT (space((1))) FOR [MJCardType]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_MJIssueDate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_MJIssueDate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_MJIssueDate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_MJIssueDate]  DEFAULT (NULL) FOR [MJIssueDate]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_MJIssueUserCard]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_MJIssueUserCard]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_MJIssueUserCard]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_MJIssueUserCard]  DEFAULT ('') FOR [MJIssueUserCard]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_MJEndDate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_MJEndDate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_MJEndDate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_MJEndDate]  DEFAULT (getdate()) FOR [MJEndDate]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_MJValidStartTime]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_MJValidStartTime]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_MJValidStartTime]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_MJValidStartTime]  DEFAULT ('00') FOR [MJValidStartTime]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_MJValidEndTime]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_MJValidEndTime]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_MJValidEndTime]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_MJValidEndTime]  DEFAULT ('24') FOR [MJValidEndTime]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_MJValidMachine]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_MJValidMachine]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_MJValidMachine]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_MJValidMachine]  DEFAULT (replicate('F',(256))) FOR [MJValidMachine]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_MJWithdrawCardDate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_MJWithdrawCardDate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_MJWithdrawCardDate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_MJWithdrawCardDate]  DEFAULT (NULL) FOR [MJWithdrawCardDate]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_MJWithdrawOptCard]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_MJWithdrawOptCard]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_MJWithdrawOptCard]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_MJWithdrawOptCard]  DEFAULT ('') FOR [MJWithdrawOptCard]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_MJMemo]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_MJMemo]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_MJMemo]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_MJMemo]  DEFAULT (space((1))) FOR [MJMemo]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_IssueDate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_IssueDate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_IssueDate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_IssueDate]  DEFAULT (getdate()) FOR [IssueDate]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_WithdrawDate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_WithdrawDate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_WithdrawDate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_WithdrawDate]  DEFAULT (NULL) FOR [WithdrawDate]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_IssueUserCard]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_IssueUserCard]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_IssueUserCard]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_IssueUserCard]  DEFAULT ('') FOR [IssueUserCard]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_WithdrawUserCard]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_WithdrawUserCard]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_WithdrawUserCard]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_WithdrawUserCard]  DEFAULT ('') FOR [WithdrawUserCard]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_LossregDate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_LossregDate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_LossregDate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_LossregDate]  DEFAULT (NULL) FOR [LossregDate]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_LossregUserCard]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_LossregUserCard]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_LossregUserCard]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_LossregUserCard]  DEFAULT ('') FOR [LossregUserCard]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CardIDNO]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CardIDNO]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CardIDNO]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CardIDNO]  DEFAULT ('') FOR [CardIDNO]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_DownloadSignal]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_DownloadSignal]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_DownloadSignal]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_DownloadSignal]  DEFAULT ('00000000000000000000000000000000000000000000000000') FOR [DownloadSignal]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CarPic]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CarPic]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CarPic]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CarPic]  DEFAULT ('') FOR [CarPic]
END


END
GO
/****** Object:  Default [DF_MYFAXINGSSUE_CarPhoto]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYFAXINGSSUE_CarPhoto]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYFAXINGSSUE_CarPhoto]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYFAXINGSSUE] ADD  CONSTRAINT [DF_MYFAXINGSSUE_CarPhoto]  DEFAULT (NULL) FOR [CarPhoto]
END


END
GO
/****** Object:  Default [DF_MYGANGWEIKOUSET_CarChannel]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYGANGWEIKOUSET_CarChannel]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYGANGWEIKOUSET_CarChannel]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYGANGWEIKOUSET] ADD  CONSTRAINT [DF_MYGANGWEIKOUSET_CarChannel]  DEFAULT ((0)) FOR [CarChannel]
END


END
GO
/****** Object:  Default [DF_MYGANGWEIKOUSET_InOut]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYGANGWEIKOUSET_InOut]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYGANGWEIKOUSET_InOut]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYGANGWEIKOUSET] ADD  CONSTRAINT [DF_MYGANGWEIKOUSET_InOut]  DEFAULT ((0)) FOR [InOut]
END


END
GO
/****** Object:  Default [DF_MYGANGWEIKOUSET_InOutName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYGANGWEIKOUSET_InOutName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYGANGWEIKOUSET_InOutName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYGANGWEIKOUSET] ADD  CONSTRAINT [DF_MYGANGWEIKOUSET_InOutName]  DEFAULT ('') FOR [InOutName]
END


END
GO
/****** Object:  Default [DF_MYGANGWEIKOUSET_CtrlNumber]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYGANGWEIKOUSET_CtrlNumber]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYGANGWEIKOUSET_CtrlNumber]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYGANGWEIKOUSET] ADD  CONSTRAINT [DF_MYGANGWEIKOUSET_CtrlNumber]  DEFAULT ((1)) FOR [CtrlNumber]
END


END
GO
/****** Object:  Default [DF_MYGANGWEIKOUSET_OpenID]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYGANGWEIKOUSET_OpenID]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYGANGWEIKOUSET_OpenID]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYGANGWEIKOUSET] ADD  CONSTRAINT [DF_MYGANGWEIKOUSET_OpenID]  DEFAULT ((1)) FOR [OpenID]
END


END
GO
/****** Object:  Default [DF_MYGANGWEIKOUSET_OpenType]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYGANGWEIKOUSET_OpenType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYGANGWEIKOUSET_OpenType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYGANGWEIKOUSET] ADD  CONSTRAINT [DF_MYGANGWEIKOUSET_OpenType]  DEFAULT ((0)) FOR [OpenType]
END


END
GO
/****** Object:  Default [DF_MYGANGWEIKOUSET_VideoCardID]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYGANGWEIKOUSET_VideoCardID]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYGANGWEIKOUSET_VideoCardID]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYGANGWEIKOUSET] ADD  CONSTRAINT [DF_MYGANGWEIKOUSET_VideoCardID]  DEFAULT ((0)) FOR [VideoCardID]
END


END
GO
/****** Object:  Default [DF_MYGANGWEIKOUSET_PersonVideo]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYGANGWEIKOUSET_PersonVideo]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYGANGWEIKOUSET_PersonVideo]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYGANGWEIKOUSET] ADD  CONSTRAINT [DF_MYGANGWEIKOUSET_PersonVideo]  DEFAULT ((0)) FOR [PersonVideo]
END


END
GO
/****** Object:  Default [DF_MYGANGWEIKOUSET_BigSmall]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYGANGWEIKOUSET_BigSmall]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYGANGWEIKOUSET_BigSmall]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYGANGWEIKOUSET] ADD  CONSTRAINT [DF_MYGANGWEIKOUSET_BigSmall]  DEFAULT ((0)) FOR [BigSmall]
END


END
GO
/****** Object:  Default [DF_MYGANGWEIKOUSET_CheckPortID]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYGANGWEIKOUSET_CheckPortID]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYGANGWEIKOUSET_CheckPortID]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYGANGWEIKOUSET] ADD  CONSTRAINT [DF_MYGANGWEIKOUSET_CheckPortID]  DEFAULT ((0)) FOR [CheckPortID]
END


END
GO
/****** Object:  Default [DF_MYGANGWEIKOUSET_TempIn]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYGANGWEIKOUSET_TempIn]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYGANGWEIKOUSET_TempIn]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYGANGWEIKOUSET] ADD  CONSTRAINT [DF_MYGANGWEIKOUSET_TempIn]  DEFAULT ((0)) FOR [TempIn]
END


END
GO
/****** Object:  Default [DF_MYGANGWEIKOUSET_TempOut]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYGANGWEIKOUSET_TempOut]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYGANGWEIKOUSET_TempOut]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYGANGWEIKOUSET] ADD  CONSTRAINT [DF_MYGANGWEIKOUSET_TempOut]  DEFAULT ((0)) FOR [TempOut]
END


END
GO
/****** Object:  Default [DF_MYGANGWEIKOUSET_HasOutCard]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYGANGWEIKOUSET_HasOutCard]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYGANGWEIKOUSET_HasOutCard]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYGANGWEIKOUSET] ADD  CONSTRAINT [DF_MYGANGWEIKOUSET_HasOutCard]  DEFAULT ((0)) FOR [HasOutCard]
END


END
GO
/****** Object:  Default [DF_MYGANGWEIKOUSET_IdentifyAddress]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYGANGWEIKOUSET_IdentifyAddress]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYGANGWEIKOUSET_IdentifyAddress]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYGANGWEIKOUSET] ADD  CONSTRAINT [DF_MYGANGWEIKOUSET_IdentifyAddress]  DEFAULT ('') FOR [IdentifyAddress]
END


END
GO
/****** Object:  Default [DF_MYGANGWEIKOUSET_IdentifySignal]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYGANGWEIKOUSET_IdentifySignal]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYGANGWEIKOUSET_IdentifySignal]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYGANGWEIKOUSET] ADD  CONSTRAINT [DF_MYGANGWEIKOUSET_IdentifySignal]  DEFAULT ((0)) FOR [IdentifySignal]
END


END
GO
/****** Object:  Default [DF_MYGANGWEIKOUSET_SubJH]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYGANGWEIKOUSET_SubJH]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYGANGWEIKOUSET_SubJH]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYGANGWEIKOUSET] ADD  CONSTRAINT [DF_MYGANGWEIKOUSET_SubJH]  DEFAULT ('') FOR [SubJH]
END


END
GO
/****** Object:  Default [DF_MYGANGWEIKOUSET_XieYi]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYGANGWEIKOUSET_XieYi]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYGANGWEIKOUSET_XieYi]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYGANGWEIKOUSET] ADD  CONSTRAINT [DF_MYGANGWEIKOUSET_XieYi]  DEFAULT ((0)) FOR [XieYi]
END


END
GO
/****** Object:  Default [DF_MYGANGWEIKOUSET_IP]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYGANGWEIKOUSET_IP]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYGANGWEIKOUSET_IP]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYGANGWEIKOUSET] ADD  CONSTRAINT [DF_MYGANGWEIKOUSET_IP]  DEFAULT ('') FOR [IP]
END


END
GO
/****** Object:  Default [DF_MYGANGWEIKOUSET_PCName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYGANGWEIKOUSET_PCName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYGANGWEIKOUSET_PCName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYGANGWEIKOUSET] ADD  CONSTRAINT [DF_MYGANGWEIKOUSET_PCName]  DEFAULT ('') FOR [PCName]
END


END
GO
/****** Object:  Default [DF_ICLOST_LossregDate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICLOST_LossregDate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICLOST_LossregDate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICLOST] ADD  CONSTRAINT [DF_ICLOST_LossregDate]  DEFAULT (getdate()) FOR [LossregDate]
END


END
GO
/****** Object:  Default [DF_ICLOST_OperatorCardNO]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICLOST_OperatorCardNO]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICLOST_OperatorCardNO]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICLOST] ADD  CONSTRAINT [DF_ICLOST_OperatorCardNO]  DEFAULT ('') FOR [OperatorCardNO]
END


END
GO
/****** Object:  Default [DF_ICLOST_CardState]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICLOST_CardState]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICLOST_CardState]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICLOST] ADD  CONSTRAINT [DF_ICLOST_CardState]  DEFAULT ('1') FOR [CardState]
END


END
GO
/****** Object:  Default [DF_ICLOST_CarLostOKID]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICLOST_CarLostOKID]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICLOST_CarLostOKID]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICLOST] ADD  CONSTRAINT [DF_ICLOST_CarLostOKID]  DEFAULT ('00000000000000000000000000000000') FOR [CarLostOKID]
END


END
GO
/****** Object:  Default [DF_ICLOST_CarLostOKNO]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICLOST_CarLostOKNO]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICLOST_CarLostOKNO]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICLOST] ADD  CONSTRAINT [DF_ICLOST_CarLostOKNO]  DEFAULT ((0)) FOR [CarLostOKNO]
END


END
GO
/****** Object:  Default [DF_ICLOST_CarUnLostOKNO]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICLOST_CarUnLostOKNO]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICLOST_CarUnLostOKNO]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICLOST] ADD  CONSTRAINT [DF_ICLOST_CarUnLostOKNO]  DEFAULT ((0)) FOR [CarUnLostOKNO]
END


END
GO
/****** Object:  Default [DF_ICLOST_MJLostOKID]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICLOST_MJLostOKID]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICLOST_MJLostOKID]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICLOST] ADD  CONSTRAINT [DF_ICLOST_MJLostOKID]  DEFAULT (replicate('F',(256))) FOR [MJLostOKID]
END


END
GO
/****** Object:  Default [DF_ICLOST_MJLostOKNO]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICLOST_MJLostOKNO]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICLOST_MJLostOKNO]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICLOST] ADD  CONSTRAINT [DF_ICLOST_MJLostOKNO]  DEFAULT ((0)) FOR [MJLostOKNO]
END


END
GO
/****** Object:  Default [DF_ICLOST_MJUnLostOKNO]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICLOST_MJUnLostOKNO]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICLOST_MJUnLostOKNO]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICLOST] ADD  CONSTRAINT [DF_ICLOST_MJUnLostOKNO]  DEFAULT ((0)) FOR [MJUnLostOKNO]
END


END
GO
/****** Object:  Default [DF_ICLOST_CarOptCard]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICLOST_CarOptCard]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICLOST_CarOptCard]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICLOST] ADD  CONSTRAINT [DF_ICLOST_CarOptCard]  DEFAULT ((0)) FOR [CarOptCard]
END


END
GO
/****** Object:  Default [DF_ICMONEY_CardNO]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICMONEY_CardNO]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICMONEY_CardNO]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICMONEY] ADD  CONSTRAINT [DF_ICMONEY_CardNO]  DEFAULT ('') FOR [CardNO]
END


END
GO
/****** Object:  Default [DF_ICMONEY_OptDate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICMONEY_OptDate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICMONEY_OptDate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICMONEY] ADD  CONSTRAINT [DF_ICMONEY_OptDate]  DEFAULT (getdate()) FOR [OptDate]
END


END
GO
/****** Object:  Default [DF_ICMONEY_SFJE]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICMONEY_SFJE]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICMONEY_SFJE]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICMONEY] ADD  CONSTRAINT [DF_ICMONEY_SFJE]  DEFAULT ((0)) FOR [SFJE]
END


END
GO
/****** Object:  Default [DF_ICMONEY_Balance]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICMONEY_Balance]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICMONEY_Balance]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICMONEY] ADD  CONSTRAINT [DF_ICMONEY_Balance]  DEFAULT ((0)) FOR [Balance]
END


END
GO
/****** Object:  Default [DF_ICMONEY_OperatorCardNO]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICMONEY_OperatorCardNO]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICMONEY_OperatorCardNO]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICMONEY] ADD  CONSTRAINT [DF_ICMONEY_OperatorCardNO]  DEFAULT ('') FOR [OperatorCardNO]
END


END
GO
/****** Object:  Default [DF_ICMONEY_OptType]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICMONEY_OptType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICMONEY_OptType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICMONEY] ADD  CONSTRAINT [DF_ICMONEY_OptType]  DEFAULT ('') FOR [OptType]
END


END
GO
/****** Object:  Default [DF_ICVALID_OptDate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICVALID_OptDate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICVALID_OptDate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICVALID] ADD  CONSTRAINT [DF_ICVALID_OptDate]  DEFAULT (getdate()) FOR [OptDate]
END


END
GO
/****** Object:  Default [DF_ICVALID_NewStartDate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICVALID_NewStartDate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICVALID_NewStartDate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICVALID] ADD  CONSTRAINT [DF_ICVALID_NewStartDate]  DEFAULT (getdate()) FOR [NewStartDate]
END


END
GO
/****** Object:  Default [DF_ICVALID_NewEachDayStartTime]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICVALID_NewEachDayStartTime]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICVALID_NewEachDayStartTime]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICVALID] ADD  CONSTRAINT [DF_ICVALID_NewEachDayStartTime]  DEFAULT ('') FOR [NewEachDayStartTime]
END


END
GO
/****** Object:  Default [DF_ICVALID_NewEachDayEndTime]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICVALID_NewEachDayEndTime]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICVALID_NewEachDayEndTime]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICVALID] ADD  CONSTRAINT [DF_ICVALID_NewEachDayEndTime]  DEFAULT ('') FOR [NewEachDayEndTime]
END


END
GO
/****** Object:  Default [DF_ICVALID_ValidMachineID]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ICVALID_ValidMachineID]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ICVALID_ValidMachineID]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYICVALID] ADD  CONSTRAINT [DF_ICVALID_ValidMachineID]  DEFAULT ('') FOR [ValidMachineID]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_UserName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_UserName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_UserName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_UserName]  DEFAULT (space((1))) FOR [UserName]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_Sex]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_Sex]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_Sex]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_Sex]  DEFAULT ('Male') FOR [Sex]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_HomeAddress]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_HomeAddress]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_HomeAddress]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_HomeAddress]  DEFAULT ('') FOR [HomeAddress]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_DeptName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_DeptName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_DeptName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_DeptName]  DEFAULT ('') FOR [DeptName]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_Job]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_Job]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_Job]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_Job]  DEFAULT ('') FOR [Job]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_IDCard]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_IDCard]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_IDCard]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_IDCard]  DEFAULT ('') FOR [IDCard]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_MaritalStatus]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_MaritalStatus]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_MaritalStatus]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_MaritalStatus]  DEFAULT ('Single') FOR [MaritalStatus]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_HighestDegree]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_HighestDegree]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_HighestDegree]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_HighestDegree]  DEFAULT ('') FOR [HighestDegree]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_PoliticalStatus]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_PoliticalStatus]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_PoliticalStatus]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_PoliticalStatus]  DEFAULT ('') FOR [PoliticalStatus]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_PicPath]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_PicPath]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_PicPath]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_PicPath]  DEFAULT ('') FOR [PicPath]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_School]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_School]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_School]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_School]  DEFAULT ('') FOR [School]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_Speciality]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_Speciality]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_Speciality]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_Speciality]  DEFAULT ('') FOR [Speciality]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_ForeignLanguage]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_ForeignLanguage]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_ForeignLanguage]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_ForeignLanguage]  DEFAULT ('') FOR [ForeignLanguage]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_Skill]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_Skill]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_Skill]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_Skill]  DEFAULT ('') FOR [Skill]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_TelNumber]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_TelNumber]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_TelNumber]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_TelNumber]  DEFAULT ('') FOR [TelNumber]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_MobNumber]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_MobNumber]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_MobNumber]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_MobNumber]  DEFAULT ('') FOR [MobNumber]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_ZipCode]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_ZipCode]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_ZipCode]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_ZipCode]  DEFAULT ('') FOR [ZipCode]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_NativePlace]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_NativePlace]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_NativePlace]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_NativePlace]  DEFAULT ('') FOR [NativePlace]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_CPH]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_CPH]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_CPH]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_CPH]  DEFAULT ('') FOR [CPH]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_CarType]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_CarType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_CarType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_CarType]  DEFAULT ('') FOR [CarType]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_CarColor]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_CarColor]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_CarColor]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_CarColor]  DEFAULT ((16777215)) FOR [CarColor]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_CarPic]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_CarPic]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_CarPic]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_CarPic]  DEFAULT ('') FOR [CarPic]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_CarPlace]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_CarPlace]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_CarPlace]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_CarPlace]  DEFAULT ('') FOR [CarPlace]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_PersonPhoto]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_PersonPhoto]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_PersonPhoto]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_PersonPhoto]  DEFAULT (NULL) FOR [PersonPhoto]
END


END
GO
/****** Object:  Default [DF_MYJIBENZILIAO_CarPhoto]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYJIBENZILIAO_CarPhoto]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYJIBENZILIAO_CarPhoto]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYJIBENZILIAO] ADD  CONSTRAINT [DF_MYJIBENZILIAO_CarPhoto]  DEFAULT (NULL) FOR [CarPhoto]
END


END
GO
/****** Object:  Default [DF_MYMENJINRECORD_CtrlNumber]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYMENJINRECORD_CtrlNumber]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYMENJINRECORD_CtrlNumber]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYMENJINRECORD] ADD  CONSTRAINT [DF_MYMENJINRECORD_CtrlNumber]  DEFAULT ((0)) FOR [CtrlNumber]
END


END
GO
/****** Object:  Default [DF_MYMENJINRECORD_CardNO]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYMENJINRECORD_CardNO]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYMENJINRECORD_CardNO]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYMENJINRECORD] ADD  CONSTRAINT [DF_MYMENJINRECORD_CardNO]  DEFAULT ('') FOR [CardNO]
END


END
GO
/****** Object:  Default [DF_MYMENJINRECORD_OpenDoorTime]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYMENJINRECORD_OpenDoorTime]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYMENJINRECORD_OpenDoorTime]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYMENJINRECORD] ADD  CONSTRAINT [DF_MYMENJINRECORD_OpenDoorTime]  DEFAULT (((1900)-(1))-(1)) FOR [OpenDoorTime]
END


END
GO
/****** Object:  Default [DF_MYMENJINRECORD_CardType]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYMENJINRECORD_CardType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYMENJINRECORD_CardType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYMENJINRECORD] ADD  CONSTRAINT [DF_MYMENJINRECORD_CardType]  DEFAULT ('') FOR [CardType]
END


END
GO
/****** Object:  Default [DF_MYMIANFEISHIYOU_ItemID]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYMIANFEISHIYOU_ItemID]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYMIANFEISHIYOU_ItemID]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYMIANFEISHIYOU] ADD  CONSTRAINT [DF_MYMIANFEISHIYOU_ItemID]  DEFAULT ((0)) FOR [ItemID]
END


END
GO
/****** Object:  Default [DF_MYMIANFEISHIYOU_ItemDetail]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYMIANFEISHIYOU_ItemDetail]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYMIANFEISHIYOU_ItemDetail]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYMIANFEISHIYOU] ADD  CONSTRAINT [DF_MYMIANFEISHIYOU_ItemDetail]  DEFAULT ('') FOR [ItemDetail]
END


END
GO
/****** Object:  Default [DF_MYQUANXIANSET_FormName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYQUANXIANSET_FormName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYQUANXIANSET_FormName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYQUANXIANSET] ADD  CONSTRAINT [DF_MYQUANXIANSET_FormName]  DEFAULT ('') FOR [FormName]
END


END
GO
/****** Object:  Default [DF_MYQUANXIANSET_MenuName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYQUANXIANSET_MenuName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYQUANXIANSET_MenuName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYQUANXIANSET] ADD  CONSTRAINT [DF_MYQUANXIANSET_MenuName]  DEFAULT ('') FOR [MenuName]
END


END
GO
/****** Object:  Default [DF_MYQUANXIANSET_MenuText]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYQUANXIANSET_MenuText]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYQUANXIANSET_MenuText]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYQUANXIANSET] ADD  CONSTRAINT [DF_MYQUANXIANSET_MenuText]  DEFAULT ('') FOR [MenuText]
END


END
GO
/****** Object:  Default [DF_MYQUANXIANSET_ValidMark]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYQUANXIANSET_ValidMark]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYQUANXIANSET_ValidMark]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYQUANXIANSET] ADD  CONSTRAINT [DF_MYQUANXIANSET_ValidMark]  DEFAULT ('') FOR [ValidMark]
END


END
GO
/****** Object:  Default [DF_MYQUANXIANSET_KEYVALUE]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYQUANXIANSET_KEYVALUE]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYQUANXIANSET_KEYVALUE]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYQUANXIANSET] ADD  CONSTRAINT [DF_MYQUANXIANSET_KEYVALUE]  DEFAULT ('') FOR [KEYVALUE]
END


END
GO
/****** Object:  Default [DF_MYRECORDMEMORY_CPH]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDMEMORY_CPH]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDMEMORY_CPH]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDMEMORY] ADD  CONSTRAINT [DF_MYRECORDMEMORY_CPH]  DEFAULT ('') FOR [CPH]
END


END
GO
/****** Object:  Default [DF_MYRECORDMEMORY_CardType]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDMEMORY_CardType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDMEMORY_CardType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDMEMORY] ADD  CONSTRAINT [DF_MYRECORDMEMORY_CardType]  DEFAULT ('') FOR [CardType]
END


END
GO
/****** Object:  Default [DF_MYRECORDMEMORY_InGateName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDMEMORY_InGateName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDMEMORY_InGateName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDMEMORY] ADD  CONSTRAINT [DF_MYRECORDMEMORY_InGateName]  DEFAULT ('') FOR [InGateName]
END


END
GO
/****** Object:  Default [DF_MYRECORDMEMORY_OutGateName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDMEMORY_OutGateName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDMEMORY_OutGateName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDMEMORY] ADD  CONSTRAINT [DF_MYRECORDMEMORY_OutGateName]  DEFAULT ('') FOR [OutGateName]
END


END
GO
/****** Object:  Default [DF_MYRECORDMEMORY_InOperatorCard]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDMEMORY_InOperatorCard]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDMEMORY_InOperatorCard]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDMEMORY] ADD  CONSTRAINT [DF_MYRECORDMEMORY_InOperatorCard]  DEFAULT ('') FOR [InOperatorCard]
END


END
GO
/****** Object:  Default [DF_MYRECORDMEMORY_InOperator]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDMEMORY_InOperator]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDMEMORY_InOperator]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDMEMORY] ADD  CONSTRAINT [DF_MYRECORDMEMORY_InOperator]  DEFAULT ('') FOR [InOperator]
END


END
GO
/****** Object:  Default [DF_MYRECORDMEMORY_SFJE]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDMEMORY_SFJE]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDMEMORY_SFJE]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDMEMORY] ADD  CONSTRAINT [DF_MYRECORDMEMORY_SFJE]  DEFAULT ((0)) FOR [SFJE]
END


END
GO
/****** Object:  Default [DF_MYRECORDMEMORY_Balance]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDMEMORY_Balance]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDMEMORY_Balance]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDMEMORY] ADD  CONSTRAINT [DF_MYRECORDMEMORY_Balance]  DEFAULT ((0)) FOR [Balance]
END


END
GO
/****** Object:  Default [DF_MYRECORDMEMORY_YSJE]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDMEMORY_YSJE]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDMEMORY_YSJE]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDMEMORY] ADD  CONSTRAINT [DF_MYRECORDMEMORY_YSJE]  DEFAULT ((0)) FOR [YSJE]
END


END
GO
/****** Object:  Default [DF_MYRECORDMEMORY_SFOperator]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDMEMORY_SFOperator]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDMEMORY_SFOperator]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDMEMORY] ADD  CONSTRAINT [DF_MYRECORDMEMORY_SFOperator]  DEFAULT ('') FOR [SFOperator]
END


END
GO
/****** Object:  Default [DF_MYRECORDMEMORY_SFOperatorCard]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDMEMORY_SFOperatorCard]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDMEMORY_SFOperatorCard]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDMEMORY] ADD  CONSTRAINT [DF_MYRECORDMEMORY_SFOperatorCard]  DEFAULT ('') FOR [SFOperatorCard]
END


END
GO
/****** Object:  Default [DF_MYRECORDMEMORY_SFGate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDMEMORY_SFGate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDMEMORY_SFGate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDMEMORY] ADD  CONSTRAINT [DF_MYRECORDMEMORY_SFGate]  DEFAULT ('') FOR [SFGate]
END


END
GO
/****** Object:  Default [DF_MYRECORDMEMORY_OvertimeSymbol]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDMEMORY_OvertimeSymbol]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDMEMORY_OvertimeSymbol]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDMEMORY] ADD  CONSTRAINT [DF_MYRECORDMEMORY_OvertimeSymbol]  DEFAULT ('') FOR [OvertimeSymbol]
END


END
GO
/****** Object:  Default [DF_MYRECORDMEMORY_OvertimeSFJE]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDMEMORY_OvertimeSFJE]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDMEMORY_OvertimeSFJE]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDMEMORY] ADD  CONSTRAINT [DF_MYRECORDMEMORY_OvertimeSFJE]  DEFAULT ((0)) FOR [OvertimeSFJE]
END


END
GO
/****** Object:  Default [DF_MYRECORDMEMORY_CarparkNO]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDMEMORY_CarparkNO]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDMEMORY_CarparkNO]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDMEMORY] ADD  CONSTRAINT [DF_MYRECORDMEMORY_CarparkNO]  DEFAULT ((0)) FOR [CarparkNO]
END


END
GO
/****** Object:  Default [DF_MYRECORDMEMORY_BigSmall]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDMEMORY_BigSmall]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDMEMORY_BigSmall]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDMEMORY] ADD  CONSTRAINT [DF_MYRECORDMEMORY_BigSmall]  DEFAULT ((0)) FOR [BigSmall]
END


END
GO
/****** Object:  Default [DF_MYRECORDMEMORY_FreeReason]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDMEMORY_FreeReason]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDMEMORY_FreeReason]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDMEMORY] ADD  CONSTRAINT [DF_MYRECORDMEMORY_FreeReason]  DEFAULT ('') FOR [FreeReason]
END


END
GO
/****** Object:  Default [DF_MYRECORDQUERY_CPH]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDQUERY_CPH]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDQUERY_CPH]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDQUERY] ADD  CONSTRAINT [DF_MYRECORDQUERY_CPH]  DEFAULT ('') FOR [CPH]
END


END
GO
/****** Object:  Default [DF_MYRECORDQUERY_CardType]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDQUERY_CardType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDQUERY_CardType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDQUERY] ADD  CONSTRAINT [DF_MYRECORDQUERY_CardType]  DEFAULT ('') FOR [CardType]
END


END
GO
/****** Object:  Default [DF_MYRECORDQUERY_InGateName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDQUERY_InGateName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDQUERY_InGateName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDQUERY] ADD  CONSTRAINT [DF_MYRECORDQUERY_InGateName]  DEFAULT ('') FOR [InGateName]
END


END
GO
/****** Object:  Default [DF_MYRECORDQUERY_OutGateName]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDQUERY_OutGateName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDQUERY_OutGateName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDQUERY] ADD  CONSTRAINT [DF_MYRECORDQUERY_OutGateName]  DEFAULT ('') FOR [OutGateName]
END


END
GO
/****** Object:  Default [DF_MYRECORDQUERY_InOperatorCard]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDQUERY_InOperatorCard]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDQUERY_InOperatorCard]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDQUERY] ADD  CONSTRAINT [DF_MYRECORDQUERY_InOperatorCard]  DEFAULT ('') FOR [InOperatorCard]
END


END
GO
/****** Object:  Default [DF_MYRECORDQUERY_InOperator]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDQUERY_InOperator]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDQUERY_InOperator]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDQUERY] ADD  CONSTRAINT [DF_MYRECORDQUERY_InOperator]  DEFAULT ('') FOR [InOperator]
END


END
GO
/****** Object:  Default [DF_MYRECORDQUERY_SFJE]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDQUERY_SFJE]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDQUERY_SFJE]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDQUERY] ADD  CONSTRAINT [DF_MYRECORDQUERY_SFJE]  DEFAULT ((0)) FOR [SFJE]
END


END
GO
/****** Object:  Default [DF_MYRECORDQUERY_Balance]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDQUERY_Balance]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDQUERY_Balance]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDQUERY] ADD  CONSTRAINT [DF_MYRECORDQUERY_Balance]  DEFAULT ((0)) FOR [Balance]
END


END
GO
/****** Object:  Default [DF_MYRECORDQUERY_YSJE]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDQUERY_YSJE]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDQUERY_YSJE]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDQUERY] ADD  CONSTRAINT [DF_MYRECORDQUERY_YSJE]  DEFAULT ((0)) FOR [YSJE]
END


END
GO
/****** Object:  Default [DF_MYRECORDQUERY_SFOperator]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDQUERY_SFOperator]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDQUERY_SFOperator]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDQUERY] ADD  CONSTRAINT [DF_MYRECORDQUERY_SFOperator]  DEFAULT ('') FOR [SFOperator]
END


END
GO
/****** Object:  Default [DF_MYRECORDQUERY_SFOperatorCard]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDQUERY_SFOperatorCard]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDQUERY_SFOperatorCard]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDQUERY] ADD  CONSTRAINT [DF_MYRECORDQUERY_SFOperatorCard]  DEFAULT ('') FOR [SFOperatorCard]
END


END
GO
/****** Object:  Default [DF_MYRECORDQUERY_SFGate]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDQUERY_SFGate]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDQUERY_SFGate]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDQUERY] ADD  CONSTRAINT [DF_MYRECORDQUERY_SFGate]  DEFAULT ('') FOR [SFGate]
END


END
GO
/****** Object:  Default [DF_MYRECORDQUERY_OvertimeSymbol]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDQUERY_OvertimeSymbol]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDQUERY_OvertimeSymbol]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDQUERY] ADD  CONSTRAINT [DF_MYRECORDQUERY_OvertimeSymbol]  DEFAULT ('') FOR [OvertimeSymbol]
END


END
GO
/****** Object:  Default [DF_MYRECORDQUERY_OvertimeSFJE]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDQUERY_OvertimeSFJE]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDQUERY_OvertimeSFJE]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDQUERY] ADD  CONSTRAINT [DF_MYRECORDQUERY_OvertimeSFJE]  DEFAULT ((0)) FOR [OvertimeSFJE]
END


END
GO
/****** Object:  Default [DF_MYRECORDQUERY_CarparkNO]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDQUERY_CarparkNO]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDQUERY_CarparkNO]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDQUERY] ADD  CONSTRAINT [DF_MYRECORDQUERY_CarparkNO]  DEFAULT ((0)) FOR [CarparkNO]
END


END
GO
/****** Object:  Default [DF_MYRECORDQUERY_BigSmall]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDQUERY_BigSmall]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDQUERY_BigSmall]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDQUERY] ADD  CONSTRAINT [DF_MYRECORDQUERY_BigSmall]  DEFAULT ((0)) FOR [BigSmall]
END


END
GO
/****** Object:  Default [DF_MYRECORDQUERY_FreeReason]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYRECORDQUERY_FreeReason]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYRECORDQUERY_FreeReason]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYRECORDQUERY] ADD  CONSTRAINT [DF_MYRECORDQUERY_FreeReason]  DEFAULT ('') FOR [FreeReason]
END


END
GO
/****** Object:  Default [DF_MYSHOUFEIGUANGZOU_FreeMark]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYSHOUFEIGUANGZOU_FreeMark]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYSHOUFEIGUANGZOU_FreeMark]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYSHOUFEIGUANGZOU] ADD  CONSTRAINT [DF_MYSHOUFEIGUANGZOU_FreeMark]  DEFAULT ((0)) FOR [FreeMark]
END


END
GO
/****** Object:  Default [DF_MYSHOUFEIGUANGZOU_FreeTime]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYSHOUFEIGUANGZOU_FreeTime]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYSHOUFEIGUANGZOU_FreeTime]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYSHOUFEIGUANGZOU] ADD  CONSTRAINT [DF_MYSHOUFEIGUANGZOU_FreeTime]  DEFAULT ((0)) FOR [FreeTime]
END


END
GO
/****** Object:  Default [DF_MYSHOUFEIGUANGZOU_SFCycle]    Script Date: 09/02/2013 15:59:45 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYSHOUFEIGUANGZOU_SFCycle]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYSHOUFEIGUANGZOU_SFCycle]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYSHOUFEIGUANGZOU] ADD  CONSTRAINT [DF_MYSHOUFEIGUANGZOU_SFCycle]  DEFAULT ((12)) FOR [SFCycle]
END


END
GO
/****** Object:  Default [DF_MYSHOUFEIGUANGZOU_TimePeriod]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYSHOUFEIGUANGZOU_TimePeriod]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYSHOUFEIGUANGZOU_TimePeriod]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYSHOUFEIGUANGZOU] ADD  CONSTRAINT [DF_MYSHOUFEIGUANGZOU_TimePeriod]  DEFAULT ((3)) FOR [TimePeriod]
END


END
GO
/****** Object:  Default [DF_MYSHOUFEIGUANGZOU_WithinPeriodSF]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYSHOUFEIGUANGZOU_WithinPeriodSF]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYSHOUFEIGUANGZOU_WithinPeriodSF]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYSHOUFEIGUANGZOU] ADD  CONSTRAINT [DF_MYSHOUFEIGUANGZOU_WithinPeriodSF]  DEFAULT ((0)) FOR [WithinPeriodSF]
END


END
GO
/****** Object:  Default [DF_MYSHOUFEIGUANGZOU_WithoutPeriodSF]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYSHOUFEIGUANGZOU_WithoutPeriodSF]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYSHOUFEIGUANGZOU_WithoutPeriodSF]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYSHOUFEIGUANGZOU] ADD  CONSTRAINT [DF_MYSHOUFEIGUANGZOU_WithoutPeriodSF]  DEFAULT ((0)) FOR [WithoutPeriodSF]
END


END
GO
/****** Object:  Default [DF_MYTBMEISHUOSET_LockLocation]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYTBMEISHUOSET_LockLocation]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYTBMEISHUOSET_LockLocation]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYTBMEISHUOSET] ADD  CONSTRAINT [DF_MYTBMEISHUOSET_LockLocation]  DEFAULT ('') FOR [LockLocation]
END


END
GO
/****** Object:  Default [DF_MYTBMEISHUOSET_DeptName]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYTBMEISHUOSET_DeptName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYTBMEISHUOSET_DeptName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYTBMEISHUOSET] ADD  CONSTRAINT [DF_MYTBMEISHUOSET_DeptName]  DEFAULT ('') FOR [DeptName]
END


END
GO
/****** Object:  Default [DF_MYTBMEISHUOSET_DoorID]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYTBMEISHUOSET_DoorID]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYTBMEISHUOSET_DoorID]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYTBMEISHUOSET] ADD  CONSTRAINT [DF_MYTBMEISHUOSET_DoorID]  DEFAULT ('') FOR [DoorID]
END


END
GO
/****** Object:  Default [DF_MYTBMEISHUOSET_PCName]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYTBMEISHUOSET_PCName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYTBMEISHUOSET_PCName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYTBMEISHUOSET] ADD  CONSTRAINT [DF_MYTBMEISHUOSET_PCName]  DEFAULT ('') FOR [PCName]
END


END
GO
/****** Object:  Default [DF_MYTBMEISHUOSET_ProduceIndex]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYTBMEISHUOSET_ProduceIndex]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYTBMEISHUOSET_ProduceIndex]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYTBMEISHUOSET] ADD  CONSTRAINT [DF_MYTBMEISHUOSET_ProduceIndex]  DEFAULT ((0)) FOR [ProduceIndex]
END


END
GO
/****** Object:  Default [DF_MYTBMEISHUOSET_CtrlType]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYTBMEISHUOSET_CtrlType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYTBMEISHUOSET_CtrlType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYTBMEISHUOSET] ADD  CONSTRAINT [DF_MYTBMEISHUOSET_CtrlType]  DEFAULT ('0') FOR [CtrlType]
END


END
GO
/****** Object:  Default [DF_MYWORKSTATIONSET_CompanyName]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYWORKSTATIONSET_CompanyName]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYWORKSTATIONSET_CompanyName]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYWORKSTATIONSET] ADD  CONSTRAINT [DF_MYWORKSTATIONSET_CompanyName]  DEFAULT ('') FOR [CompanyName]
END


END
GO
/****** Object:  Default [DF_MYWORKSTATIONSET_ComPort]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYWORKSTATIONSET_ComPort]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYWORKSTATIONSET_ComPort]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYWORKSTATIONSET] ADD  CONSTRAINT [DF_MYWORKSTATIONSET_ComPort]  DEFAULT ((1)) FOR [ComPort]
END


END
GO
/****** Object:  Default [DF_MYWORKSTATIONSET_CarparkZone]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYWORKSTATIONSET_CarparkZone]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYWORKSTATIONSET_CarparkZone]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYWORKSTATIONSET] ADD  CONSTRAINT [DF_MYWORKSTATIONSET_CarparkZone]  DEFAULT ((15)) FOR [CarparkZone]
END


END
GO
/****** Object:  Default [DF_MYWORKSTATIONSET_MJZone]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYWORKSTATIONSET_MJZone]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYWORKSTATIONSET_MJZone]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYWORKSTATIONSET] ADD  CONSTRAINT [DF_MYWORKSTATIONSET_MJZone]  DEFAULT ((14)) FOR [MJZone]
END


END
GO
/****** Object:  Default [DF_MYWORKSTATIONSET_ParkSectorEnable]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYWORKSTATIONSET_ParkSectorEnable]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYWORKSTATIONSET_ParkSectorEnable]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYWORKSTATIONSET] ADD  CONSTRAINT [DF_MYWORKSTATIONSET_ParkSectorEnable]  DEFAULT ((1)) FOR [ParkSectorEnable]
END


END
GO
/****** Object:  Default [DF_MYWORKSTATIONSET_DoorSectorEnable]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYWORKSTATIONSET_DoorSectorEnable]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYWORKSTATIONSET_DoorSectorEnable]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYWORKSTATIONSET] ADD  CONSTRAINT [DF_MYWORKSTATIONSET_DoorSectorEnable]  DEFAULT ((0)) FOR [DoorSectorEnable]
END


END
GO
/****** Object:  Default [DF_MYWORKSTATIONSET_MJType]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYWORKSTATIONSET_MJType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYWORKSTATIONSET_MJType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYWORKSTATIONSET] ADD  CONSTRAINT [DF_MYWORKSTATIONSET_MJType]  DEFAULT ((0)) FOR [MJType]
END


END
GO
/****** Object:  Default [DF_MYWORKSTATIONSET_SysConfig]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYWORKSTATIONSET_SysConfig]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYWORKSTATIONSET_SysConfig]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYWORKSTATIONSET] ADD  CONSTRAINT [DF_MYWORKSTATIONSET_SysConfig]  DEFAULT ('00000000') FOR [SysConfig]
END


END
GO
/****** Object:  Default [DF_MYWORKSTATIONSET_SysSize]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYWORKSTATIONSET_SysSize]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYWORKSTATIONSET_SysSize]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYWORKSTATIONSET] ADD  CONSTRAINT [DF_MYWORKSTATIONSET_SysSize]  DEFAULT ((1)) FOR [SysSize]
END


END
GO
/****** Object:  Default [DF_MYWORKSTATIONSET_LoginType]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYWORKSTATIONSET_LoginType]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYWORKSTATIONSET_LoginType]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYWORKSTATIONSET] ADD  CONSTRAINT [DF_MYWORKSTATIONSET_LoginType]  DEFAULT ((0)) FOR [LoginType]
END


END
GO
/****** Object:  Default [DF_MYWORKSTATIONSET_PersonPicCatch]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYWORKSTATIONSET_PersonPicCatch]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYWORKSTATIONSET_PersonPicCatch]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYWORKSTATIONSET] ADD  CONSTRAINT [DF_MYWORKSTATIONSET_PersonPicCatch]  DEFAULT ((0)) FOR [PersonPicCatch]
END


END
GO
/****** Object:  Default [DF_MYWORKSTATIONSET_FXMachine]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYWORKSTATIONSET_FXMachine]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYWORKSTATIONSET_FXMachine]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYWORKSTATIONSET] ADD  CONSTRAINT [DF_MYWORKSTATIONSET_FXMachine]  DEFAULT ((1)) FOR [FXMachine]
END


END
GO
/****** Object:  Default [DF_MYWORKSTATIONSET_FXMachineID]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_MYWORKSTATIONSET_FXMachineID]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_MYWORKSTATIONSET_FXMachineID]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYWORKSTATIONSET] ADD  CONSTRAINT [DF_MYWORKSTATIONSET_FXMachineID]  DEFAULT ((0)) FOR [FXMachineID]
END


END
GO
/****** Object:  Default [DF_ZBPARK_Location]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_ZBPARK_Location]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_ZBPARK_Location]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[MYZBPARK] ADD  CONSTRAINT [DF_ZBPARK_Location]  DEFAULT ('') FOR [Location]
END


END
GO
/****** Object:  Default [DF_OptLog_OptTime]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_OptLog_OptTime]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_OptLog_OptTime]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[OptLog] ADD  CONSTRAINT [DF_OptLog_OptTime]  DEFAULT (getdate()) FOR [OptTime]
END


END
GO
/****** Object:  Default [DF_tblConstant_OrderNO]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_tblConstant_OrderNO]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_tblConstant_OrderNO]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[tblConstant] ADD  CONSTRAINT [DF_tblConstant_OrderNO]  DEFAULT ((0)) FOR [OrderNO]
END


END
GO
/****** Object:  Default [DF_tblConstant_Keys]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_tblConstant_Keys]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_tblConstant_Keys]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[tblConstant] ADD  CONSTRAINT [DF_tblConstant_Keys]  DEFAULT ('') FOR [Keys]
END


END
GO
/****** Object:  Default [DF_tblConstant_Value]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_tblConstant_Value]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_tblConstant_Value]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[tblConstant] ADD  CONSTRAINT [DF_tblConstant_Value]  DEFAULT ('') FOR [Value]
END


END
GO
/****** Object:  Default [DF_tblConstant_Flag]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_tblConstant_Flag]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_tblConstant_Flag]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[tblConstant] ADD  CONSTRAINT [DF_tblConstant_Flag]  DEFAULT ((1)) FOR [Flag]
END


END
GO
/****** Object:  Default [DF_tblQuery_Selected]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_tblQuery_Selected]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_tblQuery_Selected]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[tblQuery] ADD  CONSTRAINT [DF_tblQuery_Selected]  DEFAULT ((0)) FOR [Selected]
END
END
GO
/****** Object:  Default [DF_tblQuery_CurrentShow]    Script Date: 09/02/2013 15:59:46 ******/
IF Not EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DF_tblQuery_CurrentShow]') AND type = 'D')
BEGIN
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[DF_tblQuery_CurrentShow]') AND type = 'D')
BEGIN
ALTER TABLE [dbo].[tblQuery] ADD  CONSTRAINT [DF_tblQuery_CurrentShow]  DEFAULT ((0)) FOR [CurrentShow]
END
END

GO
truncate table  MYCardType
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('���⳵A','MthA',1,'MonthA')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('���⳵B','MthB',1,'MonthB')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('���⳵C','MthC',1,'MonthC')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('���⳵D','MthD',1,'MonthD')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('���⳵E','MthE',1,'MonthE')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('���⳵F','MthF',1,'MonthF')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('���⳵G','MthG',1,'MonthG')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('���⳵H','MthH',1,'MonthH')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('��ʱ��A','TmpA',1,'TempA')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('��ʱ��B','TmpB',1,'TempB')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('��ʱ��C','TmpC',1,'TempC')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('��ʱ��D','TmpD',1,'TempD')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('��ʱ��E','TmpE',1,'TempE')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('��ʱ��F','TmpF',1,'TempF')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('��ʱ��G','TmpG',1,'TempG')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('��ʱ��H','TmpH',1,'TempH')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('��ʱ�շ�','TmpJ',1,'TempJ')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('��ѳ�A','FreA',1,'FreeA')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('��ѳ�B','FreB',1,'FreeB')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('��ֵ��A','StrA',1,'StoreA')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('��ֵ��B','StrB',1,'StoreB')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('��ֵ��C','StrC',1,'StoreC')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('��ֵ��D','StrD',1,'StoreD')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('��������Ա','Opt',1,'Operator')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('��Ȩ����Ա','Ath',1,'Authorize')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('�γ�','Cnt',1,'Count')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('���ٳ�A','MtpA',1,'MonthTempA')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('���ٳ�B','MtpB',1,'MonthTempB')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('���ٳ�C','MtpC',1,'MonthTempC')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('���ٳ�D','MtpD',1,'MonthTempD')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('���ٳ�E','MtpE',1,'MonthTempE')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('���ٳ�F','MtpF',1,'MonthTempF')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('���ٳ�G','MtpG',1,'MonthTempG')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('���ٳ�H','MtpH',1,'MonthTempH')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('���⳵','Tfr',1,'TempFree')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('��ѳ�',0,0,0)
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('�˹���բ','Person',0,'Person')
GO
insert into MYCardType (CardType,Identifying,[Enabled],Reamrks) values('������Ӧ','������Ӧ',0,'������Ӧ')
GO
truncate table  M_CardType
GO
insert into M_CardType (carid,carCname) values('1','����')
GO
insert into M_CardType (carid,carCname) values('2','�û���')
GO
insert into M_CardType (carid,carCname) values('3','��ʱ��')
GO
truncate table  MYCAOZUOYUAN
GO
insert into MYCAOZUOYUAN(CardNO,CardType,UserNO,UserName,Pwd,CardState,UserLevel)values('888888','��������Ա','888888','����Ա','','0','1')
GO
truncate table  MYCAOZUOYUANGROUP
GO
insert into MYCAOZUOYUANGROUP(GroupName)values('����Ա��')
GO
insert into MYCAOZUOYUANGROUP(GroupName)values('�շ�Ա��')
GO
insert into MYCAOZUOYUANGROUP(GroupName)values('������')
GO
insert into MYJIBENZILIAO(UserNO,UserName,Sex,DeptName,WorkTime,BirthDate,MaritalStatus)values('888888','����Ա','��','����','2013-01-24 00:00:00','1980-01-01 00:00:00.000','δ��')
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportCarCharge',N'Ĭ��',N'�������',N'Card NO',N'CardNO',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportCarCharge',N'Ĭ��',N'���ƺ���',N'Vehicle No',N'CPH',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportCarCharge',N'Ĭ��',N'��������',N'Card Type',N'CarCardType',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportCarCharge',N'Ĭ��',N'�볡����',N'Entry Name',N'InGateName',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportCarCharge',N'Ĭ��',N'��������',N'Exit Name',N'OutGateName',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportCarCharge',N'Ĭ��',N'�볡����Ա',N'Entry Operator',N'InOperator',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportCarCharge',N'Ĭ��',N'��������Ա',N'Exit Operator',N'OutOperator',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportCarCharge',N'Ĭ��',N'�շѽ��',N'Money',N'SFJE',N'=',N'i',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportCarCharge',N'Ĭ��',N'Ӧ�ս��',N'Money Receivable',N'YSJE',N'=',N'i',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportCarCharge',N'Ĭ��',N'���ԭ��',N'Free Reason',N'FreeReason',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportCarCharge',N'Ĭ��',N'�������',N'CarparkNO',N'CarparkNO',N'=',N'i',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportCarCharge',N'Ĭ��',N'��С����',N'BigSmall',N'BigSmall',N'=',N'i',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportInPark',N'Ĭ��',N'�������',N'Card NO',N'CardNO',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportInPark',N'Ĭ��',N'���ƺ���',N'Vehicle No',N'CPH',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportInPark',N'Ĭ��',N'��������',N'Card Type',N'CarCardType',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportInPark',N'Ĭ��',N'�볡����',N'Entry Name',N'InGateName',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportInPark',N'Ĭ��',N'�볡����Ա',N'Entry Operator',N'InOperator',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportInPark',N'Ĭ��',N'��Ա���',N'User NO',N'UserNO',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportInPark',N'Ĭ��',N'��Ա����',N'User Name',N'UserName',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportInPark',N'Ĭ��',N'�շѽ��',N'Money',N'SFJE',N'=',N'i',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectIssue',N'Ĭ��',N'�������',N'Card NO',N'f.CardNO',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectIssue',N'Ĭ��',N'��Ա���',N'User NO',N'f.UserNO',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectIssue',N'Ĭ��',N'����״̬',N'Card State',N'f.CardState',N'=',N'i',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectIssue',N'Ĭ��',N'��������',N'Car Card Type',N'CardType',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectIssue',N'Ĭ��',N'��������',N'Car Issue Date',N'f.CarIssueDate',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectIssue',N'Ĭ��',N'�����˱��',N'Issue User Card',N'f.IssueUserCard',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectIssue',N'Ĭ��',N'���ƺ���',N'license plate number',N'f.CPH',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectIssue',N'Ĭ��',N'��������',N'Dept Name',N'j.DeptName',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectIssue',N'Ĭ��',N'��Ա����',N'User Name',N'j.UserName',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectIssue',N'Ĭ��',N'������λ',N'Car Place',N'f.CarPlace',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectIssue',N'Ĭ��',N'�ֻ�����',N'Mob Number',N'j.MobNumber',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectIssue',N'Ĭ��',N'��ͥסַ',N'Home Address',N'j.HomeAddress',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectMoney',N'Ĭ��',N'�������',N'Card NO',N'MYICMONEY.CardNO',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectMoney',N'Ĭ��',N'����Ա���',N'User NO',N'MYICMONEY.OperatorCardNO',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectMoney',N'Ĭ��',N'��������',N'Car Card Type',N'MYCardType.CardType',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectMoney',N'Ĭ��',N'��������',N'Opt Date',N'MYICMONEY.OptDate',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectMoney',N'Ĭ��',N'���ƺ���',N'license plate number',N'MYFAXINGSSUE.CPH',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectMoney',N'Ĭ��',N'��������',N'Dept Name',N'MYJIBENZILIAO.DeptName',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectMoney',N'Ĭ��',N'�ֻ�����',N'MobNumber',N'MYJIBENZILIAO.MobNumber',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectMoney',N'Ĭ��',N'��ͥסַ',N'HomeAddress',N'MYJIBENZILIAO.HomeAddress',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectMoney',N'Ĭ��',N'��ע',N'Remark',N'MYICMONEY.Remark',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectMoney',N'Ĭ��',N'��������',N'OptType',N'MYICMONEY.OptType',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectLoss',N'Ĭ��',N'�������',N'Card NO',N'CardNO',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectLoss',N'Ĭ��',N'��Ա���',N'User NO',N'LossregUserCard',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectLoss',N'Ĭ��',N'��������',N'Dept Name',N'DeptName',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectPostpone',N'Ĭ��',N'�������',N'Card NO',N'CardNO',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectPostpone',N'Ĭ��',N'��������',N'Car Card Type',N'CarCardType',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectPostpone',N'Ĭ��',N'���ƺ���',N'license plate number',N'CPH',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectPostpone',N'Ĭ��',N'��������',N'Dept Name',N'DeptName',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportCarCharge',N'Ĭ��',N'���ѳ���',N'SF Gate',N'SFGate',N'=',N's',0,0)
GO
--2017-11-30
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportCarCharge',N'Ĭ��',N'��ͥסַ',N'Address',N'HomeAddress',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'ReportCarCharge',N'Ĭ��',N'֧����ʽ',N'Pay Type',N'Temp5',N'=',N's',0,0)
GO

insert into MYPrint (Title,FTitle,Footer) values('           ͣ����ϵͳ','         ͣ����ϵͳ�з�','     ��ϵ�绰��xxxx-xxxxxxxx
     ��ϵ��ַ��XXXͣ����')
GO
------1.ȷ�����ݿ�������Ĵ����������----------------------------------------------------------
------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------
--���� �����洢���ݵ������Ϣ-------------------------------------------------------------------
------------------------------------------------------------------------------------------------
if exists(select * from  dbo.sysobjects where name=N'tbSystemDataBak')
drop table tbSystemDataBak
GO
CREATE TABLE [tbSystemDataBak] (
	[id] [int] IDENTITY (1, 1) NOT NULL ,
	[IsEnld] [bit] NULL ,
	[LoadRoute] [varchar] (100) COLLATE Chinese_PRC_CI_AS NULL ,
	[BakTime] [varchar] (20) COLLATE Chinese_PRC_CI_AS NULL ,
	 PRIMARY KEY  CLUSTERED 
	(
		[id]
	)  ON [PRIMARY] 
) ON [PRIMARY]
GO
------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------
------�����洢���� ��ҵ�������õĴ洢���̣����ݵĹ���-------------------------------------------
------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------
SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO

IF  EXISTS (SELECT * FROM dbo.sysobjects WHERE id = object_id(N'[dbo].[cg_DoBackupJob]')
 AND OBJECTPROPERTY(id, N'IsProcedure') = 1) 
DROP PROCEDURE [dbo].[cg_DoBackupJob]
GO
CREATE   PROCEDURE [dbo].[cg_DoBackupJob]
    
    @FileHead     varchar(50),
    @isFullBackup    bit,                    -- 0 ��������    1 ��������
    @FolderPath     varchar(50)     = 'D:\�����ļ�\bak\',
    @BackName    varchar(100)    = 'unknown',        -- �����ִ�
    @isAppendMedia  bit        = 1            -- 0 ����ý��    1 ׷�ӵ�ý�� 

AS
declare @DataBaseName    varchar(100)
    declare @filePath varchar(150)
    declare @sql varchar(1000)
    
         Select @DataBaseName= Name From Master.dbo.SysDataBases Where DbId=(Select Dbid From Master.dbo.SysProcesses Where Spid = @@spid)
   select  @FolderPath=LoadRoute from DBO.tbSystemDataBak
   
  --- print @FolderPath
   
    select @filePath=@FolderPath +  @FileHead + '_' + case @isFullBackup when 1 then 'FullBackup' when 0 then 'DifferBackup' end  + '_' +
replace(replace(replace(  convert( nvarchar(100) ,getdate() , 120 ),'-',''),' ',''),':','')
        + case @isFullBackup when 1 then '' when 0 then replace(convert(nvarchar(15),getdate(),114),':','') end
    --print(@filePath)

    select @sql ='BACKUP DATABASE [' + @DataBaseName + '] TO DISK = ''' 
        + @filePath + '''  WITH '
        +  case @isAppendMedia when 0 then 'INIT' when 1 then 'NOINIT' end 
        + ' ,  NOUNLOAD , '
        + case @isFullBackup when 0 then 'DIFFERENTIAL , ' when 1 then '' end    
        + '  NAME = N''' + @BackName + '����'',  NOSKIP ,  STATS = 10,  NOFORMAT'

    execute(@sql)
    --print(@sql)
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO

------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------
------�����洢���� ����ɾ����ҵJOB--------------------------------------------------------------
------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------
SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO
IF  EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[DeleteJob]')
 AND OBJECTPROPERTY(id, N'IsProcedure') = 1)
DROP PROCEDURE [dbo].[DeleteJob]
GO
create  proc DeleteJob  as

if exists( select * from msdb.dbo.sysjobs where name='znyktbak')
exec msdb.dbo.sp_delete_job @job_name = N'znyktbak' ;

GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO


------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------
------�����洢���������½���ҵJOB---------------------------------------------------------------
------------------------------------------------------------------------------------------------

IF  EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[CreateJob]')
 AND OBJECTPROPERTY(id, N'IsProcedure') = 1)
DROP PROCEDURE [dbo].[CreateJob]
GO
SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO
create    proc   CreateJob
  @taskname   varchar(100)='znyktbak', --task name   
  @sql   varchar(8000)='EXECUTE [cg_DoBackupJob]  ''znyktbak'',1 ', --slq command   
  @dbname   sysname='TCPTest', --   default the current db
  @freqtype   varchar(6)='day', --the frequence of time :month   ,week   ,day 
 @freqsubtype varchar(6)='no' ,--no, hour ,minute
  @fqinterval   int=1, --the execute times 
 @fqsubinterval int=1, --the sub interval
  @time   int=150000 -- execute on some time   format(hhmmss)
  as   

declare @BakTime VARCHAR(20);
   select   @BakTime=BakTime from dbo.tbSystemDataBak
 --  SET @BakTime=CAST( DATEPART(HOUR,@BakTime) as varchar(10))+CAST( DATEPART(MI,@BakTime)as varchar(10))+cast(DATEPART(ss,@BakTime)as varchar(10))
   print '����ʱ��'+ @BakTime
set @time=@BakTime


         Select @dbname= Name From Master.dbo.SysDataBases Where DbId=(Select Dbid From Master.dbo.SysProcesses Where Spid = @@spid)
 /*--creat task  
     
   --author:sky   2008.02.27   
     
  discription: 
      when @freqtype='week' when @fqinterval=
         1 = ������
         2 = ����һ
         4 = ���ڶ�
         8 = ������
         16 = ������
         32 = ������
         64 = ������
 */
   /*--eg. 
     
   --ÿ��ִ�е���ҵ   
   exec   Pro_AddTask   @taskname='mm',@sql='seleCT   *   from   syscolumns',@freqtype='month'   
     
   --ÿ��ִ�е���ҵ   
   exec   Pro_AddTask   @taskname='ww',@sql='select   *   from   syscolumns',@freqtype='week'   
     
   --ÿ��00000ִ�е���ҵ   
   exec   Pro_AddTask   @taskname='ab',@sql='select   *   from   syscolumns'   
    
  --ÿ��12:00:00��ҵ   
   exec   Pro_AddTask   @taskname='d12',@sql='select   *   from   syscolumns',@time=12000
   
  --ÿ����12:00:00��ҵ   
   exec   Pro_AddTask   @taskname='w12',@sql='select   *   from   syscolumns',@freqtype='week',@fqinterval=64,@time=12000
  
  --ÿ��20��12:00:00��ҵ   
   exec   Pro_AddTask   @taskname='m20',@sql='select   *   from   syscolumns',@freqtype='month',@fqinterval=20,@time=12000
  
   --*/   
  if   isnull(@dbname,'')=''   set   @dbname=db_name()   
  --create task   
  exec   msdb..sp_add_job   @job_name=@taskname 

  --create task step  
  exec   msdb..sp_add_jobstep   @job_name=@taskname,   
  @step_name   =   'data process',   
  @subsystem   =   'TSQL',   
  @database_name=@dbname,   
  @command   =   @sql,   
  @retry_attempts   =   5,     
  @retry_interval   =   5    
    
  --create schedule   
  declare   @ftype   int,@fstype   int,@ffactor   int   
  select   @ftype=case   @freqtype  
          when   'day'   then   4   
          when   'week'   then   8   
          when   'month'   then   16   
       end   
   ,@fstype=case   @freqsubtype   
       when   'no'   then   1   
       when   'hour' then  4
       when   'minutue' then 8
       else 0  
       end   
  set   @ffactor=case   @freqtype   when   'day'   then   0   else   1   end   
    
  EXEC   msdb..sp_add_jobschedule   @job_name=@taskname,     
  @name   =   'schedule',   
  @freq_type=@ftype   ,   ---4 ÿ��,8 ÿ��,16 ÿ��  
  @freq_interval=@fqinterval, --��ҵִ�е�����
  @freq_subday_type=@fstype, --�Ƿ��ظ�ִ��,0x1 ��ָ����ʱ��, 0x4 ����, 0x8 Сʱ
  @freq_subday_interval=@fqsubinterval,   --�ظ�����   
  @freq_recurrence_factor=@ffactor,   --�ظ�ִ��,������Ϊ1,��������Ϊ0
  @active_start_time=@time     --����00:00:00��ִ��   
  --   add the goal server   
  EXEC   msdb.dbo.sp_add_jobserver     
  @job_name   =   @taskname  ,   
  @server_name   =   N'(local)'

GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[CARQUERYNOWS2]') and OBJECTPROPERTY(id, N'IsProcedure') = 1)
drop procedure [dbo].[CARQUERYNOWS2]
GO

CREATE     PROCEDURE CARQUERYNOWS2
       @INCARPLATES  VARCHAR(15),
       @CPPRECISION  INT,
       @FORTIAOJIAN01  VARCHAR(10),  
       @FORTIAOJIAN02  VARCHAR(10)    
AS 
IF (@CPPRECISION<4 OR @CPPRECISION>6)
    BEGIN
        SET @CPPRECISION=4
     END
IF @CPPRECISION=4
   BEGIN
	SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE 
       ((SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	
	(SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1))) AND
                  (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02) 
   END 
IF @CPPRECISION=5
   BEGIN
	SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE                
       ((SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 	
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR         
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1))) AND 
                  (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02) 
        
   END 
IF @CPPRECISION=6
   BEGIN
	SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE 
	SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) 
    AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1) AND 
                 (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02) 
   END 






GO



if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[CARQUERYNOWS]') and OBJECTPROPERTY(id, N'IsProcedure') = 1)
drop procedure [dbo].[CARQUERYNOWS]
GO


CREATE    PROCEDURE CARQUERYNOWS
       @INCARPLATES  VARCHAR(15),
       @CPPRECISION  INT,
       @FORTIAOJIAN01  VARCHAR(10),  
       @FORTIAOJIAN02  VARCHAR(10)    
AS 
IF (@CPPRECISION<4 OR @CPPRECISION>6)
    BEGIN
        SET @CPPRECISION=4
     END
IF @CPPRECISION=4
   BEGIN
	SELECT CardNO,CarCardType,CPH,CarType,CarColor,CarValidEndDate  FROM MYFAXINGSSUE WHERE 
       ((SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	
	(SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1))) AND
                  (LEFT(CarCardType,3)=@FORTIAOJIAN01 OR LEFT(CarCardType,3)=@FORTIAOJIAN02) AND CardState='0' AND LTRIM(CPH)<>'' AND CPH IS NOT NULL
   END 
IF @CPPRECISION=5
   BEGIN
	SELECT CardNO,CarCardType,CPH,CarType,CarColor,CarValidEndDate  FROM MYFAXINGSSUE WHERE                
       ((SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 	
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR         
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1))) AND 
                  (LEFT(CarCardType,3)=@FORTIAOJIAN01 OR LEFT(CarCardType,3)=@FORTIAOJIAN02) AND CardState='0' AND LTRIM(CPH)<>'' AND CPH IS NOT NULL
        
   END 
IF @CPPRECISION=6
   BEGIN
	SELECT CardNO,CarCardType,CPH,CarType,CarColor,CarValidEndDate  FROM MYFAXINGSSUE WHERE 
	SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) 
    AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1) AND 
                 (LEFT(CarCardType,3)=@FORTIAOJIAN01 OR LEFT(CarCardType,3)=@FORTIAOJIAN02) AND CardState='0' AND LTRIM(CPH)<>'' AND CPH IS NOT NULL
   END 




GO


alter table M_TimeGroup add  TimCount varchar(20) default '8' 
GO
 create table M_DoorTypeName
 (DoorID int primary key ,
 DoorTypeC varchar(50),
 DoorTypeE varchar(50),
 DoorMark varchar(100) default null
 )
GO
 insert into M_DoorTypeName (DoorID,DoorTypeC,DoorTypeE)values(1,'�����1','DoorType1')
GO
 insert into M_DoorTypeName (DoorID,DoorTypeC,DoorTypeE)values(2,'�����2','DoorType2')
GO
 insert into M_DoorTypeName (DoorID,DoorTypeC,DoorTypeE)values(3,'�����3','DoorType3')
GO
 insert into M_DoorTypeName (DoorID,DoorTypeC,DoorTypeE)values(4,'�����4','DoorType4')
GO
 insert into M_DoorTypeName (DoorID,DoorTypeC,DoorTypeE)values(5,'�����5','DoorType5')
GO
 insert into M_DoorTypeName (DoorID,DoorTypeC,DoorTypeE)values(6,'�����6','DoorType6')
GO
 insert into M_DoorTypeName (DoorID,DoorTypeC,DoorTypeE)values(7,'�����7','DoorType7')
GO
 insert into M_DoorTypeName (DoorID,DoorTypeC,DoorTypeE)values(8,'�����8','DoorType8')
GO



SET ANSI_NULLS ON
GO


--drop table M_JurisdTeam
create table M_JurisdTeam(
id int identity primary key ,
JurName varchar(50),--Ȩ��������
CardType varchar(50),--����
TempNumber int, --��ʱ������
TeamName varchar(50),
MJBeginDate datetime,
MJEndDate datetime,
mark varchar(100),
UserInfo varchar(150),
HolidayLimited varchar(20),
MjEnabSysHoliday varchar(20),
MJValidMachine varchar(8000)
)

GO
if OBJECT_ID('M_SendData') is not null
drop table M_SendData
GO
create table M_SendData(
Id int identity primary key ,
DevcNum int ,
SendData varbinary(500),
InseDate datetime
)
GO

alter table  M_NormalOpenDoorSet  alter column stat1 varchar(1200) 
GO
if OBJECT_ID('M_DoorMapsB') is not null
drop table M_DoorMapsB
GO
create table M_DoorMapsB--�Ž���ͼ
(Mapid INT IDENTITY PRIMARY KEY,
MapName varchar(50),
MapLiu image,
AltDate Datetime
)
GO

if OBJECT_ID('M_DoorMapsDoorInfo') is not null
drop table M_DoorMapsDoorInfo
GO
create table M_DoorMapsDoorInfo--�Ž���ͼ ����Ϣ
(
 id int identity primary key,
 Mapid int ,--��ͼID
 Drawing varchar(50),--����
 DevcID varchar(20),--���ƻ�ID
 DevcName varchar(50),--���ƻ�����
 Doorid varchar(20),--��ID
 DoorName varchar(50) --�ŵ�����
)
GO
Alter Table OptLog ALTER column OptContent VARCHAR(8000)
GO
if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[MyVoice]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
begin
CREATE TABLE [MyVoice] (
[Number] [int]  NOT NULL,
[CardNO] [nvarchar]  (50) NOT NULL,
[StartTime] [datetime]  NOT NULL,
[EndTime] [datetime]  NOT NULL,
[InVoice] [nvarchar]  (100) NOT NULL,
[OutVoice] [nvarchar]  (100) NOT NULL)

ALTER TABLE [MyVoice] WITH NOCHECK ADD  CONSTRAINT [PK_MyVoice] PRIMARY KEY  NONCLUSTERED ( [Number] )
end
GO
if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[MyAutoCPHSet]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
begin
CREATE TABLE [MyAutoCPHSet] (
[AutoPlateEn] [bit]  NOT NULL,
[AutoPlateDBJD] [int]  NOT NULL,
[InAutoOpenModel] [int]  NOT NULL,
[OutAutoOpenModel] [int]  NOT NULL,
[CphDelay] [nvarchar]  (50) NULL,
[SameCphDelay] [nvarchar]  (50) NULL,
[AutoSetMinutes] [int]  NULL,
[AutoMinutes] [bit]  NULL,
[AutoColorSet] [int]  NULL,
[AutoDeleteImg] [int]  NULL,
[AutoPattern] [int]  NULL,
[AutoKZ] [bit]  NULL,
[AutoYTime] [int]  NULL,
[ReadCardTime] [int]  NULL,
[MaxPlateWidth] [int]  NULL,
[MinPlateWidth] [int]  NULL,
[OnlyLocation] [bit]  NULL,
[Darmpolice] [bit]  NULL,
[Embassy] [bit]  NULL,
[OnlyDyellow] [bit]  NULL,
[Tractor] [bit]  NULL,
[Army2] [bit]  NULL,
[ArmPol] [bit]  NULL,
[Indivi] [bit]  NULL,
[Yellow2] [bit]  NULL,
[PCName] [nvarchar]  (50) NULL,
[LocalProvince] [nvarchar]  (50) NULL,
[YImageSave] [nvarchar]  (1000) NULL,
[Night] [bit]  NULL)
end
GO
if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[MyHolidays]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
begin
CREATE TABLE [MyHolidays] (
[HolidaysTime] [datetime]  NOT NULL,
[HolidaysContent] [nvarchar]  (500) NOT NULL)
ALTER TABLE [MyHolidays] WITH NOCHECK ADD  CONSTRAINT [PK_MyHolidays] PRIMARY KEY  NONCLUSTERED ( [HolidaysTime] )
end
GO

if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[MyVoiceCardNO]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
begin
CREATE TABLE [MyVoiceCardNO] (
[VoiceCardNO] [nvarchar]  (50) NOT NULL,
[CtrlNumber] [int]  NOT NULL)
end
GO
if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[MyVoiceCardNOSET]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
begin
CREATE TABLE [MyVoiceCardNOSET] (
[CtrlNumber] [int]  NOT NULL,
[Voice] [nvarchar]  (200) NOT NULL)
ALTER TABLE [MyVoiceCardNOSET] WITH NOCHECK ADD  CONSTRAINT [PK_MyVoiceCardNOSET] PRIMARY KEY  NONCLUSTERED ( [CtrlNumber] )
end
GO

if not exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[MYZBPARK2]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
begin

	CREATE TABLE [dbo].[MYZBPARK2] (
		[CtrlNumber] [int] NOT NULL ,
		[Address] [varchar] (256) COLLATE Chinese_PRC_CI_AS NULL ,
		[Favorable] [money] NULL ,
		[Manner] [varchar] (50) COLLATE Chinese_PRC_CI_AS NULL ,
		[OutHour] [money] NULL ,
		[OutDayNo] [money] NULL 
	) ON [PRIMARY]
	
	ALTER TABLE [dbo].[MYZBPARK2] WITH NOCHECK ADD 
		CONSTRAINT [DF_ZBPARK2_Address] DEFAULT ('') FOR [Address]

end
GO
--2014-07-28 �޸ĳ���ʶ���������ݿ�ͳ����������ݿ�
if NOT EXISTS (select * from   syscolumns where name='InMothOpenModel' and id=(select id from  sysobjects where name='MyAutoCPHSet')) 
alter table MyAutoCPHSet add  [InMothOpenModel]  int  default  1;
GO
if NOT EXISTS (select * from   syscolumns where name='OutMothOpenModel' and id=(select id from  sysobjects where name='MyAutoCPHSet')) 
alter table MyAutoCPHSet add  [OutMothOpenModel]  int  default  1;
GO
if NOT EXISTS (select * from   syscolumns where name='InOutConfirm' and id=(select id from  sysobjects where name='MyAutoCPHSet')) 
alter table MyAutoCPHSet add  [InOutConfirm]  bit  default  1;
GO
if NOT EXISTS (select * from   syscolumns where name='OutConfirm' and id=(select id from  sysobjects where name='MyAutoCPHSet')) 
alter table MyAutoCPHSet add  [OutConfirm]  bit  default  1;
GO

if NOT EXISTS (select * from   syscolumns where name='ZGXE' and id=(select id from  sysobjects where name='MYCHECHANGXITONGSET')) 
alter table MYCHECHANGXITONGSET add  [ZGXE]  int  default  1;
GO
if NOT EXISTS (select * from   syscolumns where name='ZGXEType' and id=(select id from  sysobjects where name='MYCHECHANGXITONGSET')) 
alter table MYCHECHANGXITONGSET add  [ZGXEType]  int  default  1;
GO
if not exists (select * from sysobjects where id = OBJECT_ID('[MyNoCPH]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
begin
CREATE TABLE [MyNoCPH] (
[ID] [int]  IDENTITY (1, 1)  NOT NULL,
[InTime] [datetime]  NOT NULL,
[InPic] [nvarchar]  (1000) NOT NULL,
[InGateName] [nvarchar]  (100) NOT NULL)

ALTER TABLE [MyNoCPH] WITH NOCHECK ADD  CONSTRAINT [PK_MyNoCPH] PRIMARY KEY  NONCLUSTERED ( [ID] )
end
GO


if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[JJCT_DayMoneyLimit_0to0]') and OBJECTPROPERTY(id, N'IsProcedure') = 1)
drop procedure [dbo].[JJCT_DayMoneyLimit_0to0]
GO

SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO


--2014-07-28 ��� JJCT_DayMoneyLimit_0to0  ��ÿ���ν����շѲ������޶��0�㵽0��Ϊһ�죬ѭ����ѯ

CREATE   PROCEDURE JJCT_DayMoneyLimit_0to0
@CardNO VARCHAR(10),
@CardType VARCHAR(10),
@CPH VARCHAR(10),
@InTime DATETIME,
@OutTime DATETIME,
@CurrentSF MONEY,--VB ��ǰ�շ�  ��һ�μ�������շ�
@FinalSF MONEY OUTPUT--VB�����շ� ��һ��Ӧ���շ�
 AS

   set nocount on

	DECLARE @StopDays AS INT
	DECLARE @StopHours AS INT
	DECLARE @SumMinute AS INT
	
	DECLARE @FreMinute AS INT
	DECLARE @TopSF AS MONEY
	
	DECLARE @FreTimeNoSF AS INT 
	DECLARE @IsSumMaxXE AS INT   --ֻ����ID��ֵ��
	
	
	--���ڼ���ÿ���ۼ��շ��Ƿ񳬹��޶�
	declare @Time00 as datetime          --�볡ʱ�䵱��0��
	declare @FirstInTime as Datetime     --�볡ʱ�䵱���һ���շѼ�¼���볡ʱ��
	declare @FirstOutTime as Datetime
	declare @tmpInTime as datetime
	declare @SumMoney as money           --�볡ʱ�䵱��֮ǰ�����շ�
	declare @TmpOutTime as datetime
	declare @tmpDays as INT  --ͣ������
		--*
IF LEFT(@CardType,3)='Mtp'
	BEGIN
		SELECT @CardType=REPLACE(@CardType,'Mtp','Tmp')
	END 
--*
   if @CardNO = '' and @CPH=''
   begin
      set @FinalSF = @CurrentSF
      return
   end

	SELECT @SumMinute=DATEDIFF(MINUTE,@InTime,@OutTime)
	
	
	SELECT TOP 1 @TopSF=TopSF FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
	SELECT @TopSF=ISNULL(@TopSF,0)
	
	--*
   SELECT TOP 1 @FreMinute=FreeMinute FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
   SELECT @FreMinute=ISNULL(@FreMinute,0)
	SELECT TOP 1 @FreTimeNoSF=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=30  
	SELECT @FreTimeNoSF=ISNULL(@FreTimeNoSF,0)
	IF @FreTimeNoSF=1											
	SELECT @InTime=DATEADD(MINUTE,@FreMinute,@InTime)						
	--*

	--SELECT TOP 1 @IsSumMaxXE=CONVERT(INT,���) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Сʱ=123
	--SELECT @IsSumMaxXE=ISNULL(@�Ƿ������ۼ�����޶�,0)
	SELECT @IsSumMaxXE = 1

   
	set @FinalSF = @CurrentSF

	SELECT @StopDays=DATEDIFF(MINUTE,@InTime,@OutTime)/1440
	SELECT @StopHours=(DATEDIFF(MINUTE,@InTime,@OutTime) % 1440)/60	--ȥ��ͣ���������ͣ��Сʱ��

   IF ((DATEDIFF(MINUTE,@InTime,@OutTime) % 1440) % 60)>0			--����1Сʱ�İ�1Сʱ����
		SELECT @StopHours=@StopHours+1
	
   print '@StopDays:' + convert(varchar,@StopDays)	
   print '@StopHours:' + convert(varchar,@StopHours)

   --�����ۼ�ÿ������޶�====================================================
   if @IsSumMaxXE<>1
      return
   
   set @Time00 = CONVERT(CHAR(10),@InTime,120) +' 00:00:00'
   
   print '1 @Time00:' + CONVERT(varchar,@Time00,120)

   --��ѯ�볡ʱ�䵱���һ���շѼ�¼���볡ʱ��
   if @CPH <> ''
      select top 1 @FirstInTime = InTime,@FirstOutTime = OutTime from MYCARGOOUTRECORD where CPH = @CPH and SFJE>0 and OutTime>=@Time00 and OutTime<=@InTime order by InTime
   else
      select top 1 @FirstInTime = InTime,@FirstOutTime = OutTime from MYCARGOOUTRECORD where CardNO = @CardNO and SFJE>0 and OutTime>=@Time00 and OutTime<=@InTime order by InTime
   
   print '2 @FirstInTime:' + CONVERT(varchar,@FirstInTime,120)
          
   if @FirstInTime is null   
	   begin
		  set @tmpDays = DATEDIFF(DAY,@InTime,@OutTime)+1
		  set @SumMoney =0
	   end
   else
	   begin
		  while DATEDIFF(DAY,@FirstInTime,@FirstOutTime) > 0    --�����ʱ���������ͬһ�죬���ҵ�����볡ʱ�䵱��������շѼ�¼���볡ʱ��
		  begin   
			  set @Time00 = CONVERT(CHAR(10),@FirstInTime,120) +' 00:00:00'    --ȡ������볡ʱ�䵱��0��
			  --��ѯ����볡ʱ�䵱��������շѼ�¼���볡ʱ��
           select @tmpInTime = null
           if @CPH <> ''
              select top 1 @tmpInTime = InTime,@FirstOutTime = OutTime from MYCARGOOUTRECORD where CPH = @CPH and SFJE>0 and OutTime>=@Time00 and OutTime<=@FirstInTime order by InTime
           else
              select top 1 @tmpInTime = InTime,@FirstOutTime = OutTime from MYCARGOOUTRECORD where CardNO = @CardNO and SFJE>0 and OutTime>=@Time00 and OutTime<=@FirstInTime order by InTime

			  if @tmpInTime is null   --û�ҵ�
           begin
			     break
              --print 'is null'
           end
			  else
           begin
			     set @FirstInTime = @tmpInTime  --����ҵ�����ѭ���ж�������Ƿ�ͬһ�죬һֱ�ҵ���������û�п�����շѼ�¼Ϊֹ
			  end
		  end
	      
		  set @tmpDays = DATEDIFF(DAY,@FirstInTime,@OutTime)+1
		  
        print '3 @Time00:' + CONVERT(varchar,@Time00,120)
        print '4 @FirstInTime:' + CONVERT(varchar,@FirstInTime,120)
        print '5 SumDays��' + convert(varchar,@tmpDays)
        
		  --ͳ��֮ǰ�Ѿ����˶���Ǯ
        if @CPH <> ''
           select @SumMoney = sum(SFJE) from MYCARGOOUTRECORD where CPH = @CPH and SFJE>0 and OutTime>=@Time00 and OutTime<=@InTime
        else
   		  select @SumMoney = sum(SFJE) from MYCARGOOUTRECORD where CardNO = @CardNO and SFJE>0 and OutTime>=@Time00 and OutTime<=@InTime

        if @SumMoney is null
           set @SumMoney = 0
        print '6 BeforeSF��' + convert(varchar,@SumMoney)
   end
   
   --�ж��Ƿ񳬹��������
   if (@CurrentSF + @SumMoney)  > @tmpDays * @TopSF
   begin
      set @FinalSF = @tmpDays * @TopSF - @SumMoney
   end

   if @FinalSF<0 
      set  @FinalSF = 0
   
   print '7 FinalSF��' + convert(varchar,@FinalSF)
   --=======================================================================

	set nocount off

	RETURN



GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO


if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[JJCT_DayMoneyLimit_24H]') and OBJECTPROPERTY(id, N'IsProcedure') = 1)
drop procedure [dbo].[JJCT_DayMoneyLimit_24H]
GO

SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS OFF 
GO

--2014-07-28
--24Сʱ��ν����շѲ������޶�
--������ʱ����ǰ��24Сʱ���ҵ���һ���շѵ��볡��¼��
--�����շѼ�¼���볡ʱ�䵽��ǰ����ʱ��һ���м���24Сʱ���Ͱ�����24Сʱ������޶�


CREATE    PROCEDURE JJCT_DayMoneyLimit_24H
@CardNO VARCHAR(10),
@CardType VARCHAR(10),
@CPH VARCHAR(10),
@InTime DATETIME,
@OutTime DATETIME,
@CurrentSF MONEY,--VB ��ǰ�շ�  ��һ�μ�������շ�
@FinalSF MONEY OUTPUT--VB�����շ� ��һ��Ӧ���շ�
 AS

   set nocount on

	DECLARE @StopDays AS INT
	DECLARE @StopHours AS INT
	DECLARE @SumMinute AS INT
	
	DECLARE @FreMinute AS INT
	DECLARE @TopSF AS MONEY
	
	DECLARE @FreTimeNoSF AS INT 
	DECLARE @IsSumMaxXE AS INT   --ֻ����ID��ֵ��
	
	
	--���ڼ���ÿ���ۼ��շ��Ƿ񳬹��޶�
	declare @Time00 as datetime          --�볡ʱ�䵱��0��
	declare @FirstInTime as Datetime     --�볡ʱ�䵱���һ���շѼ�¼���볡ʱ��
	declare @FirstOutTime as Datetime
	declare @tmpInTime as datetime
	declare @SumMoney as money           --�볡ʱ�䵱��֮ǰ�����շ�
	declare @TmpOutTime as datetime
	declare @tmpDays as INT  --ͣ������
		--*
IF LEFT(@CardType,3)='Mtp'
	BEGIN
		SELECT @CardType=REPLACE(@CardType,'Mtp','Tmp')
	END 
--*
   if @CardNO = '' and @CPH=''
   begin
      set @FinalSF = @CurrentSF
      return
   end
	
	SELECT @SumMinute=DATEDIFF(MINUTE,@InTime,@OutTime)
	
	
	SELECT TOP 1 @TopSF=TopSF FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
	SELECT @TopSF=ISNULL(@TopSF,0)
	
	--*
   SELECT TOP 1 @FreMinute=FreeMinute FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
   SELECT @FreMinute=ISNULL(@FreMinute,0)
	SELECT TOP 1 @FreTimeNoSF=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=30  
	SELECT @FreTimeNoSF=ISNULL(@FreTimeNoSF,0)
	IF @FreTimeNoSF=1											
	SELECT @InTime=DATEADD(MINUTE,@FreMinute,@InTime)						
	--*

	--SELECT TOP 1 @�Ƿ������ۼ�����޶�=CONVERT(INT,���) FROM MYCHECHANGNORMALSHOUFEI WHERE ��Ƭ����=@��Ƭ���� AND Сʱ=123
	--SELECT @�Ƿ������ۼ�����޶�=ISNULL(@�Ƿ������ۼ�����޶�,0)
	SELECT @IsSumMaxXE = 1

   
	set @FinalSF = @CurrentSF

	SELECT @StopDays=DATEDIFF(MINUTE,@InTime,@OutTime)/1440

   if @StopDays >=1    --ͣ��ʱ����ڵ���24Сʱ���ϣ����ж�24Сʱ���ۼ��շ��޶�
   begin
      print '@StopDays >=1 FinalSF��' + convert(varchar,@FinalSF)
      return
   end

	SELECT @StopHours=(DATEDIFF(MINUTE,@InTime,@OutTime) % 1440)/60	--ȥ��ͣ���������ͣ��Сʱ��

   IF ((DATEDIFF(MINUTE,@InTime,@OutTime) % 1440) % 60)>0			--����1Сʱ�İ�1Сʱ����
		SELECT @StopHours=@StopHours+1
	
   print '@StopDays:' + convert(varchar,@StopDays)	
   print '@StopHours:' + convert(varchar,@StopHours)

   --�����ۼ�ÿ������޶�====================================================
   if @IsSumMaxXE<>1
      return
   
   --set @Time00 = CONVERT(CHAR(10),@InTime,120) +' 00:00:00'
   set @TmpOutTime = dateadd(day,-1,@OutTime)   --��ǰ��24Сʱ

   print '1 @TmpOutTime:' + CONVERT(varchar,@TmpOutTime,120)

   --��ѯ����ʱ����ǰ��24Сʱ�ĵ�һ���շѼ�¼���볡ʱ��
   if @CPH <> ''
      select top 1 @FirstInTime = InTime,@FirstOutTime = OutTime from MYCARGOOUTRECORD where CPH = @CPH and SFJE>0 and OutTime>=@TmpOutTime and OutTime< @OutTime order by InTime
   else   
      select top 1 @FirstInTime = InTime,@FirstOutTime = OutTime from MYCARGOOUTRECORD where CardNO = @CardNO and SFJE>0 and OutTime>=@TmpOutTime and OutTime< @OutTime order by InTime
   
   print '2 @FirstInTime:' + CONVERT(varchar,@FirstInTime,120)
          
   if @FirstInTime is null   --û�ҵ�24Сʱ���շѼ�¼����˴θ��ն��پͶ���
	   begin
		  --set @tmpDays = DATEDIFF(DAY,@�볡ʱ��,@����ʱ��)+1
		  --set @SumMoney =0
        print 'û�ҵ�24Сʱ���շѼ�¼ FinalSF��' + convert(varchar,@FinalSF)
        return
	   end
   else
	   begin 
         
         if @CPH <> ''
            select @SumMoney = sum(SFJE) from MYCARGOOUTRECORD where CPH = @CPH and SFJE>0 and OutTime>=@FirstInTime and OutTime < @OutTime                  
         else
            select @SumMoney = sum(SFJE) from MYCARGOOUTRECORD where CardNO = @CardNO and SFJE>0 and OutTime>=@FirstInTime and OutTime < @OutTime                  

         if @SumMoney is null
           set @SumMoney = 0

         --��һ���շѼ�¼�볡ʱ�䵽��ǰ����ʱ��һ������
         
         set @tmpDays = DATEDIFF(minute,@FirstInTime,@OutTime) / 1440
         if (DATEDIFF(MINUTE,@FirstInTime,@OutTime) % 1440) > 0 
             set @tmpDays = @tmpDays +1         
        
         print 'SumDays��' + convert(varchar,@tmpDays)
         print 'BeforeSF��' + convert(varchar,@SumMoney)
   
   end
   
   --�ж��Ƿ񳬹��������
   if (@CurrentSF + @SumMoney)  > @tmpDays * @TopSF
   begin
      set @FinalSF = @tmpDays * @TopSF - @SumMoney
   end

   if @FinalSF<0 
      set  @FinalSF = 0
   
   print 'FinalSF��' + convert(varchar,@FinalSF)
   --=======================================================================

	set nocount off

	RETURN


GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO



/****** Object:  StoredProcedure [dbo].[JJCT_DayMoneyLimit_0to0_V1]    Script Date: 04/13/2016 09:13:22 ******/
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[JJCT_DayMoneyLimit_0to0_V1]') and OBJECTPROPERTY(id, N'IsProcedure') = 1)
drop procedure [dbo].[JJCT_DayMoneyLimit_0to0_V1]
GO


/****** Object:  StoredProcedure [dbo].[JJCT_DayMoneyLimit_0to0_V1]    Script Date: 04/13/2016 10:20:46 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


--ÿ���ν����շѲ������޶��0�㵽0��Ϊһ�죬ѭ����ѯ
--2016-04-13 ��� С����λ���Ĳ������Ҹ�ΪV1�汾
--2016-05-12 ���Ĺ�ҹ�շѵļ��㷽ʽ
--2017-12-22 ����Mth��ΪTmp
CREATE   PROCEDURE [dbo].[JJCT_DayMoneyLimit_0to0_V1]
@CardNO VARCHAR(10),
@CardType VARCHAR(10),
@CPH VARCHAR(10),
@InTime DATETIME,
@OutTime DATETIME,
@PointNum int,   --С����λ�� 0��û��С����  1��1λС��   --2016-04-13
@CurrentSF MONEY,--VB ��ǰ�շ�  ��һ�μ�������շ�
@FinalSF MONEY OUTPUT--VB�����շ� ��һ��Ӧ���շ�
 AS
   set nocount on
	DECLARE @StopDays AS INT
	DECLARE @StopHours AS INT
	DECLARE @SumMinute AS INT
	
	DECLARE @FreMinute AS INT
	DECLARE @TopSF AS MONEY
	
	DECLARE @FreTimeNoSF AS INT 
	DECLARE @IsSumMaxXE AS INT   --ֻ����ID��ֵ��
	
	
	--���ڼ���ÿ���ۼ��շ��Ƿ񳬹��޶�
	declare @Time00 as datetime          --�볡ʱ�䵱��0��
	declare @FirstInTime as Datetime     --�볡ʱ�䵱���һ���շѼ�¼���볡ʱ��
	declare @FirstOutTime as Datetime
	declare @tmpInTime as datetime
	declare @SumMoney as money           --�볡ʱ�䵱��֮ǰ�����շ�
	declare @TmpOutTime as datetime
	declare @tmpDays as INT  --ͣ������
	
	DECLARE @OvernightCharge AS MONEY					--��ҹ���ս��   2016-02-23
	SELECT @OvernightCharge = 0
	
   if @CardNO = '' and @CPH=''
   begin
      set @FinalSF = @CurrentSF
      return
   end
   
   --2016-04-29
	--2017-12-22 ����Mth��ΪTmp
	IF LEFT(@CardType,3)='Mth'
	BEGIN
		SELECT @CardType=REPLACE(@CardType,'Mth','Tmp')
	END
	else IF LEFT(@CardType,3)='Mtp'
	BEGIN
		SELECT @CardType=REPLACE(@CardType,'Mtp','Tmp')
	END 
	IF LEFT(@CardType,3)<>'Tmp' AND LEFT(@CardType,3)<>'Str'
	BEGIN
		SELECT @FinalSF=0
		RETURN
	END
   
	SELECT @SumMinute=DATEDIFF(MINUTE,@InTime,@OutTime)
	
	
	SELECT TOP 1 @TopSF=TopSF FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
	SELECT @TopSF=ISNULL(@TopSF,0)
		
	
	--*
   SELECT TOP 1 @FreMinute=FreeMinute FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
   SELECT @FreMinute=ISNULL(@FreMinute,0)
	SELECT TOP 1 @FreTimeNoSF=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=30  
	SELECT @FreTimeNoSF=ISNULL(@FreTimeNoSF,0)
	IF @FreTimeNoSF=1											
	SELECT @InTime=DATEADD(MINUTE,@FreMinute,@InTime)	
	
	SELECT TOP 1 @OvernightCharge=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=80
   SELECT @OvernightCharge=ISNULL(@OvernightCharge,0)
   
   --����С����λ���ж�  --2016-04-13
   if @PointNum = 1 
   begin
		set @TopSF = @TopSF /10
		set @OvernightCharge = @OvernightCharge / 10    --2016-05-12
   end
   
   					
	--*
	--SELECT TOP 1 @IsSumMaxXE=CONVERT(INT,���) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Сʱ=123
	--SELECT @IsSumMaxXE=ISNULL(@�Ƿ������ۼ�����޶�,0)
	SELECT @IsSumMaxXE = 1
   
	set @FinalSF = @CurrentSF
	SELECT @StopDays=DATEDIFF(MINUTE,@InTime,@OutTime)/1440
	SELECT @StopHours=(DATEDIFF(MINUTE,@InTime,@OutTime) % 1440)/60	--ȥ��ͣ���������ͣ��Сʱ��
   IF ((DATEDIFF(MINUTE,@InTime,@OutTime) % 1440) % 60)>0			--����1Сʱ�İ�1Сʱ����
		SELECT @StopHours=@StopHours+1
	
   print '@StopDays:' + convert(varchar,@StopDays)	
   print '@StopHours:' + convert(varchar,@StopHours)
   --�����ۼ�ÿ������޶�====================================================
   if @IsSumMaxXE<>1
      return
   
   set @Time00 = CONVERT(CHAR(10),@InTime,120) +' 00:00:00'
   
   print '1 @Time00:' + CONVERT(varchar,@Time00,120)
   --��ѯ�볡ʱ�䵱���һ���շѼ�¼���볡ʱ��
   if @CPH <> ''
      select top 1 @FirstInTime = InTime,@FirstOutTime = OutTime from MYCARGOOUTRECORD where CPH = @CPH and SFJE>0 and OutTime>=@Time00 and OutTime<=@InTime order by InTime
   else
      select top 1 @FirstInTime = InTime,@FirstOutTime = OutTime from MYCARGOOUTRECORD where CardNO = @CardNO and SFJE>0 and OutTime>=@Time00 and OutTime<=@InTime order by InTime
   
   print '2 @FirstInTime:' + CONVERT(varchar,@FirstInTime,120)
          
   if @FirstInTime is null   
	   begin
		  set @tmpDays = DATEDIFF(DAY,@InTime,@OutTime)+1
		  set @SumMoney =0
	   end
   else
	   begin
		  while DATEDIFF(DAY,@FirstInTime,@FirstOutTime) > 0    --�����ʱ���������ͬһ�죬���ҵ�����볡ʱ�䵱��������շѼ�¼���볡ʱ��
		  begin   
			  set @Time00 = CONVERT(CHAR(10),@FirstInTime,120) +' 00:00:00'    --ȡ������볡ʱ�䵱��0��
			  --��ѯ����볡ʱ�䵱��������շѼ�¼���볡ʱ��
           select @tmpInTime = null
           if @CPH <> ''
              select top 1 @tmpInTime = InTime,@FirstOutTime = OutTime from MYCARGOOUTRECORD where CPH = @CPH and SFJE>0 and OutTime>=@Time00 and OutTime<=@FirstInTime order by InTime
           else
              select top 1 @tmpInTime = InTime,@FirstOutTime = OutTime from MYCARGOOUTRECORD where CardNO = @CardNO and SFJE>0 and OutTime>=@Time00 and OutTime<=@FirstInTime order by InTime
			  if @tmpInTime is null   --û�ҵ�
           begin
			     break
              --print 'is null'
           end
			  else
           begin
			     set @FirstInTime = @tmpInTime  --����ҵ�����ѭ���ж�������Ƿ�ͬһ�죬һֱ�ҵ���������û�п�����շѼ�¼Ϊֹ
			  end
		  end
	      
		  set @tmpDays = DATEDIFF(DAY,@FirstInTime,@OutTime)+1
		  
        print '3 @Time00:' + CONVERT(varchar,@Time00,120)
        print '4 @FirstInTime:' + CONVERT(varchar,@FirstInTime,120)
        print '5 SumDays��' + convert(varchar,@tmpDays)
        
		  --ͳ��֮ǰ�Ѿ����˶���Ǯ
        if @CPH <> ''
           select @SumMoney = sum(SFJE) from MYCARGOOUTRECORD where CPH = @CPH and SFJE>0 and OutTime>=@Time00 and OutTime<=@InTime
        else
   		  select @SumMoney = sum(SFJE) from MYCARGOOUTRECORD where CardNO = @CardNO and SFJE>0 and OutTime>=@Time00 and OutTime<=@InTime
        if @SumMoney is null
           set @SumMoney = 0
        print '6 BeforeSF��' + convert(varchar,@SumMoney)
   end
   
   --�����ҹ���ս�� 
   --if @FirstInTime is null   --2016-04-01 ����
   --   set @OvernightCharge = DATEDIFF(DAY,@InTime,@OutTime) * @OvernightCharge
   --else
   --   set @OvernightCharge = DATEDIFF(DAY,@FirstInTime,@OutTime) * @OvernightCharge
   
   --�ж��Ƿ񳬹��������   
   if (@CurrentSF + @SumMoney)  > @tmpDays * @TopSF          --+ @OvernightCharge
   begin
      set @FinalSF = (@tmpDays * @TopSF ) - @SumMoney
      print 'FinalSF(Over)��' + convert(varchar,@FinalSF)
   end
      
   if @FinalSF<0 
      set  @FinalSF = 0
   
   print '@OvernightCharge��' + convert(varchar,@OvernightCharge)   
   
   --2016-05-12 ֻ�ӵ���ͣ���Ŀ�ҹ���ã�ǰ��Ĳ��ù�
   if DATEDIFF(day,@InTime,@OutTime) >0
    	set @FinalSF = @FinalSF + @OvernightCharge
   
   print '7 FinalSF��' + convert(varchar,@FinalSF)
   --=======================================================================
	set nocount off
	RETURN


GO


/****** Object:  StoredProcedure [dbo].[JJCT_DayMoneyLimit_24H_V1]    Script Date: 04/13/2016 09:22:05 ******/
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[JJCT_DayMoneyLimit_24H_V1]') and OBJECTPROPERTY(id, N'IsProcedure') = 1)
drop procedure [dbo].[JJCT_DayMoneyLimit_24H_V1]
GO

/****** Object:  StoredProcedure [dbo].[JJCT_DayMoneyLimit_24H_V1]    Script Date: 04/13/2016 10:20:50 ******/
SET ANSI_NULLS OFF
GO

SET QUOTED_IDENTIFIER OFF
GO


--24Сʱ��ν����շѲ������޶�
--������ʱ����ǰ��24Сʱ���ҵ���һ���շѵ��볡��¼��
--�����շѼ�¼���볡ʱ�䵽��ǰ����ʱ��һ���м���24Сʱ���Ͱ�����24Сʱ������޶�
--2016-04-13 ��� С����λ���Ĳ������Ҹ�ΪV1�汾
--2016-05-12 ���Ĺ�ҹ�շѵļ��㷽ʽ
--2017-12-22 ����Mth��ΪTmp
CREATE    PROCEDURE [dbo].[JJCT_DayMoneyLimit_24H_V1]
@CardNO VARCHAR(10),
@CardType VARCHAR(10),
@CPH VARCHAR(10),
@InTime DATETIME,
@OutTime DATETIME,
@PointNum int,   --С����λ�� 0��û��С����  1��1λС��   --2016-04-13
@CurrentSF MONEY,--VB ��ǰ�շ�  ��һ�μ�������շ�
@FinalSF MONEY OUTPUT--VB�����շ� ��һ��Ӧ���շ�
 AS
   set nocount on
	DECLARE @StopDays AS INT
	DECLARE @StopHours AS INT
	DECLARE @SumMinute AS INT
	
	DECLARE @FreMinute AS INT
	DECLARE @TopSF AS MONEY
	
	DECLARE @FreTimeNoSF AS INT 
	DECLARE @IsSumMaxXE AS INT   --ֻ����ID��ֵ��
	
	
	--���ڼ���ÿ���ۼ��շ��Ƿ񳬹��޶�
	declare @Time00 as datetime          --�볡ʱ�䵱��0��
	declare @FirstInTime as Datetime     --�볡ʱ�䵱���һ���շѼ�¼���볡ʱ��
	declare @FirstOutTime as Datetime
	declare @tmpInTime as datetime
	declare @SumMoney as money           --�볡ʱ�䵱��֮ǰ�����շ�
	declare @TmpOutTime as datetime
	declare @tmpDays as INT  --ͣ������
	
	DECLARE @OvernightCharge AS MONEY					--��ҹ���ս��   2016-02-23
	SELECT @OvernightCharge = 0
		
	
   if @CardNO = '' and @CPH=''
   begin
      set @FinalSF = @CurrentSF
      return
   end
	
	--2016-04-29
	--2017-12-22 ����Mth��ΪTmp
	IF LEFT(@CardType,3)='Mth'
	BEGIN
		SELECT @CardType=REPLACE(@CardType,'Mth','Tmp')
	END
	else IF LEFT(@CardType,3)='Mtp'
	BEGIN
		SELECT @CardType=REPLACE(@CardType,'Mtp','Tmp')
	END 
	IF LEFT(@CardType,3)<>'Tmp' AND LEFT(@CardType,3)<>'Str'
	BEGIN
		SELECT @FinalSF=0
		RETURN
	END	
	
	SELECT @SumMinute=DATEDIFF(MINUTE,@InTime,@OutTime)
	
	
	SELECT TOP 1 @TopSF=TopSF FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
	SELECT @TopSF=ISNULL(@TopSF,0)
	
	
	--*
   SELECT TOP 1 @FreMinute=FreeMinute FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
   SELECT @FreMinute=ISNULL(@FreMinute,0)
	SELECT TOP 1 @FreTimeNoSF=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=30  
	SELECT @FreTimeNoSF=ISNULL(@FreTimeNoSF,0)
	IF @FreTimeNoSF=1											
	SELECT @InTime=DATEADD(MINUTE,@FreMinute,@InTime)			
	
	SELECT TOP 1 @OvernightCharge=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=80
   SELECT @OvernightCharge=ISNULL(@OvernightCharge,0)
	
	--����С����λ���ж�  --2016-04-13
   if @PointNum = 1 
   begin
		set @TopSF = @TopSF /10
		set @OvernightCharge = @OvernightCharge / 10    --2016-05-12
   end	
				
	--*
	--SELECT TOP 1 @�Ƿ������ۼ�����޶�=CONVERT(INT,���) FROM MYCHECHANGNORMALSHOUFEI WHERE ��Ƭ����=@��Ƭ���� AND Сʱ=123
	--SELECT @�Ƿ������ۼ�����޶�=ISNULL(@�Ƿ������ۼ�����޶�,0)
	SELECT @IsSumMaxXE = 1
   
	set @FinalSF = @CurrentSF
	SELECT @StopDays=DATEDIFF(MINUTE,@InTime,@OutTime)/1440
   if @StopDays >=1    --ͣ��ʱ����ڵ���24Сʱ���ϣ����ж�24Сʱ���ۼ��շ��޶�
   begin
      print '@StopDays >=1 FinalSF��' + convert(varchar,@FinalSF)
      return
   end
	SELECT @StopHours=(DATEDIFF(MINUTE,@InTime,@OutTime) % 1440)/60	--ȥ��ͣ���������ͣ��Сʱ��
   IF ((DATEDIFF(MINUTE,@InTime,@OutTime) % 1440) % 60)>0			--����1Сʱ�İ�1Сʱ����
		SELECT @StopHours=@StopHours+1
	
   print '@StopDays:' + convert(varchar,@StopDays)	
   print '@StopHours:' + convert(varchar,@StopHours)
   --�����ۼ�ÿ������޶�====================================================
   if @IsSumMaxXE<>1
      return
   
   --set @Time00 = CONVERT(CHAR(10),@InTime,120) +' 00:00:00'
   set @TmpOutTime = dateadd(day,-1,@OutTime)   --��ǰ��24Сʱ
   print '1 @TmpOutTime:' + CONVERT(varchar,@TmpOutTime,120)
   --��ѯ����ʱ����ǰ��24Сʱ�ĵ�һ���շѼ�¼���볡ʱ��
   if @CPH <> ''
      select top 1 @FirstInTime = InTime,@FirstOutTime = OutTime from MYCARGOOUTRECORD where CPH = @CPH and SFJE>0 and OutTime>=@TmpOutTime and OutTime< @OutTime order by InTime
   else   
      select top 1 @FirstInTime = InTime,@FirstOutTime = OutTime from MYCARGOOUTRECORD where CardNO = @CardNO and SFJE>0 and OutTime>=@TmpOutTime and OutTime< @OutTime order by InTime
   
   print '2 @FirstInTime:' + CONVERT(varchar,@FirstInTime,120)
          
   if @FirstInTime is null   --û�ҵ�24Сʱ���շѼ�¼����˴θ��ն��پͶ���
	   begin
		  --set @tmpDays = DATEDIFF(DAY,@�볡ʱ��,@����ʱ��)+1
		  --set @SumMoney =0
        print 'û�ҵ�24Сʱ���շѼ�¼ FinalSF��' + convert(varchar,@FinalSF)
        return
	   end
   else
	   begin 
         
         if @CPH <> ''
            select @SumMoney = sum(SFJE) from MYCARGOOUTRECORD where CPH = @CPH and SFJE>0 and OutTime>=@FirstInTime and OutTime < @OutTime                  
         else
            select @SumMoney = sum(SFJE) from MYCARGOOUTRECORD where CardNO = @CardNO and SFJE>0 and OutTime>=@FirstInTime and OutTime < @OutTime                  
         if @SumMoney is null
           set @SumMoney = 0
         --��һ���շѼ�¼�볡ʱ�䵽��ǰ����ʱ��һ������
         
         set @tmpDays = DATEDIFF(minute,@FirstInTime,@OutTime) / 1440
         if (DATEDIFF(MINUTE,@FirstInTime,@OutTime) % 1440) > 0 
             set @tmpDays = @tmpDays +1         
        
         print 'SumDays��' + convert(varchar,@tmpDays)
         print 'BeforeSF��' + convert(varchar,@SumMoney)
   
   end
      
   --�����ҹ���ս�� --2016-05-12 rem
   --if @FirstInTime is null   --2016-04-01 ����
   --   set @OvernightCharge = DATEDIFF(DAY,@InTime,@OutTime) * @OvernightCharge
   --else
   --   set @OvernightCharge = DATEDIFF(DAY,@FirstInTime,@OutTime) * @OvernightCharge
   
   --�ж��Ƿ񳬹��������
   if (@CurrentSF + @SumMoney)  > @tmpDays * @TopSF       --+ @OvernightCharge
   begin
      set @FinalSF = (@tmpDays * @TopSF ) - @SumMoney     --+ @OvernightCharge
      print 'FinalSF(Over)��' + convert(varchar,@FinalSF)
   end
     
   
   if @FinalSF<0 
      set  @FinalSF = 0
   
   print '@OvernightCharge��' + convert(varchar,@OvernightCharge)   
   
   --2016-05-12 ֻ�ӵ���ͣ���Ŀ�ҹ���ã�ǰ��Ĳ��ù�
   if DATEDIFF(day,@InTime,@OutTime) >0
    	set @FinalSF = @FinalSF + @OvernightCharge
   
   print 'FinalSF��' + convert(varchar,@FinalSF)
   --=======================================================================
	set nocount off
	RETURN


GO




--2014-07-28
if NOT EXISTS (select * from   syscolumns where name='Helpflag' and id=(select id from  sysobjects where name='MYWORKSTATIONSET')) 
alter table MYWORKSTATIONSET add  [Helpflag]  bit  default  1;
GO
if   EXISTS (select * from   syscolumns where name='stat1' and id=(select id from  sysobjects where name='M_NormalOpenDoorSet')) 
alter table  M_NormalOpenDoorSet  alter column stat1 varchar(1200) 
GO
--IF EXISTS(select 1 from sys.views where name='MJRecordViewEnglish')
ALTER view [dbo].[MJRecordViewEnglish]
as 
select 
case  r.CardID  when '' then '00000000' else r.CardID end  as [CardID],
 t.carEname  as 'MJCardType'
,r.UserNO,c.UserName,c.DeptName,
r.MachNo,r.MachPlace,r.DoorNo,r.DoorPlace,
case    r.[Events]
when '01'   then case CardID when  '00000000' THEN 'PC Command to open the door' else  'Credit card to open the door'  end 
when '21' then 'No card'
when '03' then 'Card not download'
when '22' then '5sis only allowed to read the same card a'
when '23' then 'This card on the door without opening'
when '04' then 'Check card expired'
when '05' then 'Card HOLIDAY LIMITED'
when '06' then 'Time limit'
when '07' then 'Normally closed during the card invalid'
when '02' then 'System open HOLIDAY LIMITED'
when '08' then 'Limit the number of temporary card'
when '10' then 'Input password wrong door'
else  r.[Events] end    as [Events]
,r.OpenTime,
case  d.ControlType when 0 then 'ID DoorCard'     when 1 then 'IC DoorCard' else cast( d.ControlType as varchar(20)) end  as 'ControlType'
from  
dbo.MJ_Recoredsview r left join MYFAXINGSSUE f on   right(r.CardID ,8)=f.CardNO  
left join MYJIBENZILIAO  c on r.UserNO=c.UserNO
left join M_DoorData d on r.MachNo=d.MachNo
left join dbo.M_CardType t on f.MJCardType= t.carid    
GO


--IF EXISTS(select 1 from sys.views where name='MJRecordViewChanese')
alter view [dbo].[MJRecordViewChanese]
 as 
select 
case  r.CardID  when '' then '00000000' else r.CardID end  as [CardID],
t.carCname  as 'MJCardType'
,r.UserNO,c.UserName,c.DeptName,
r.MachNo,r.MachPlace,r.DoorNo,r.DoorPlace,
case    r.[Events]
when '01'   then case CardID when  '00000000' THEN 'PCָ���' else  'ˢ������'  end 
when '21' then 'û�п���'
when '03' then '��û������'
when '22' then '5s��ֻ�����ͬһ�ſ�һ��'
when '23' then '�˿��ڴ����޿�ͨ'
when '04' then 'ֹ������'
when '05' then '���ļ�������'
when '06' then 'ʱ��������'
when '07' then '�����ڼ������Ч'
when '02' then 'ϵͳ�������ƿ���'
when '08' then '��ʱ����������'
when '10' then '���뿪�����벻��'
else  r.[Events] end    as [Events]
,r.OpenTime,jt.JurName,
case  d.ControlType when 0 then 'ID���Ž�'     when 1 then 'IC���Ž�' else cast( d.ControlType as varchar(20)) end  as 'ControlType'
from  
dbo.MJ_Recoredsview r left join MYFAXINGSSUE f on   right(r.CardID ,8)=f.CardNO  
left join MYJIBENZILIAO  c on r.UserNO=c.UserNO
left join M_DoorData d on r.MachNo=d.MachNo
left join dbo.M_CardType t on f.MJCardType= t.carid  
left join M_JurisdTeam jt on f.MJJureTeam =jt.id
GO

IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[OpenClosedDoorStaut]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
create table OpenClosedDoorStaut(
id int identity(1,1) primary key,
DevcNo int ,
Stuat varchar(500)
)
GO
if NOT EXISTS (select * from   syscolumns where name='MJTCard' and id=(select id from  sysobjects where name='MYFAXINGSSUE')) 
alter table MYFAXINGSSUE add  MJTCard  bit default 0
GO
/****** Object:  Table [dbo].[M_TimeGroup]  ���Ĭ�Ͽ�Ƭʱ�����ֵ   Script Date: 12/26/2013 15:59:45 ******/
Delete M_TimeGroup
GO
Begin
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',1,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',2,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',3,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',4,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',5,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',6,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',1,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',2,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',3,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',4,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',5,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',6,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',7,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',1,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',2,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',3,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',4,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',5,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',6,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',7,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',1,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',2,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',3,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',4,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',5,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',6,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',7,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',1,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',2,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',3,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',4,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',5,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',6,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',7,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',1,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',2,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',3,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',4,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',5,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',6,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',7,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert M_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',7,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
END
GO
/****** Object:  TABLE [dbo].[MJDownCardOutTimeSettb]    Script Date: 12/20/2013 10:30:43 ������ʱ���� ******/
if OBJECT_ID('MJDownCardOutTimeSettb') is  null
begin
create table MJDownCardOutTimeSettb 
(
outtime int
)
insert into MJDownCardOutTimeSettb values(1);
end
GO
/****** --------------------------- �����Ž��������-------------------------------*****/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO
/****** Object:  TABLE [dbo].[Dt_DoorData]    Script Date: 12/20/2013 10:30:43 ���ƻ��� ******/
SET ANSI_PADDING OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Dt_DoorData]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[Dt_DoorData](
	[DevcNo] [int] NULL,
	[Place] [varchar](50) NULL,
	[DevcType] [int] NULL,
	[DevcIpadress] [varchar](50) NULL,
	[TxType] [int] NULL
) ON [PRIMARY]
END

GO
if NOT EXISTS (select * from   syscolumns where name='TxType' and id=(select id from  sysobjects where name='Dt_DoorData'))
alter table Dt_DoorData add  TxType int default 0 
GO
/****** Object:  TABLE [dbo].[Dt_foorTb]    Script Date: 12/20/2013 10:30:43 ¥��� ******/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Dt_foorTb]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[Dt_foorTb](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[foorid] [int] NULL,
	[FoorName] [varchar](50) NULL,
	[devcNo] [int] NULL,
	[FoorNo] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END

GO
if exists(select d.name from  syscolumns a join sysobjects b on a.id=b.id join syscomments c on a.cdefault=c.id  
join sysobjects d on c.id=d.id where b.name='Dt_foorTb' and (a.name='foorid'))
ALTER TABLE Dt_foorTb ADD UNIQUE (foorid)
GO
if NOT EXISTS (select * from   syscolumns where name='DtZone' and id=(select id from  sysobjects where name='MYWORKSTATIONSET'))
alter table MYWORKSTATIONSET add  DtZone int default 7
GO
if NOT EXISTS (select * from   syscolumns where name='DtSectorEnable' and id=(select id from  sysobjects where name='MYWORKSTATIONSET'))
alter table MYWORKSTATIONSET add  DtSectorEnable bit default 1 
GO
update MYWORKSTATIONSET set DtZone=7;
GO
update MYWORKSTATIONSET set DtSectorEnable=1;
GO
/****** Object:  Table [dbo].[Dt_FaxingSsue]    Script Date: 11/19/2014 16:58:56 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING OFF
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Dt_FaxingSsue]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[Dt_FaxingSsue](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[CardNo] [varchar](20) NULL,
	[CardIDNO] [varchar](20) NULL,
	[CardIdIcflag] [int] NULL,
	[UserNo] [varchar](50) NULL,
	[CardState] [int] NULL,
	[IssDate] [datetime] NULL,
	[CardType] [int] NULL,
	[TemNum] [int] NULL,
	[TimeTeam] [int] NULL,
	[EndDate] [datetime] NULL,
	[PersonDevcID] [int] NULL,
	[PersonFoorid] [int] NULL,
	[Mark] [varchar](150) NULL,
	[Holiday] [varchar](10) NULL,
	[visitsFloor] [varchar](50) NULL,
	[isitsFlag] [varchar](8000) NULL,
	[CardExitflag] [bit] NULL,
	[CardDownFlag] [bit] NULL,
	[SfMoeny] [int] NULL,
	[fxmode] [int] NULL,
	[TineOnline] [text] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
if NOT EXISTS (select * from   syscolumns where name='SfMoeny' and id=(select id from  sysobjects where name='Dt_FaxingSsue')) 
alter table Dt_FaxingSsue add  [SfMoeny]  int  default  0;
GO
if NOT EXISTS (select * from   syscolumns where name='fxmode' and id=(select id from  sysobjects where name='Dt_FaxingSsue')) 
alter table Dt_FaxingSsue add  [fxmode]  int  default  1;
GO
if NOT EXISTS (select * from   syscolumns where name='TineOnline' and id=(select id from  sysobjects where name='Dt_FaxingSsue')) 
alter table Dt_FaxingSsue add  TineOnline  text   ;
GO
/****** Object:  TABLE [dbo].[Dt_Door_Holiday]    Script Date: 12/26/2013 10:30:43  ϵͳ���ձ� ******/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Dt_Door_Holiday]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[Dt_Door_Holiday](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[sDate] [varchar](10) NOT NULL,
	[DevcNum] [int] NULL,
 CONSTRAINT [PK_Dt_Door_Holiday] PRIMARY KEY CLUSTERED 
(
	[id] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
/****** Object:  Table [dbo].[Dt_TimeGroup]  ��Ƭʱ����   Script Date: 12/26/2013 15:59:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Dt_TimeGroup]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[Dt_TimeGroup](
	[GroupID] [int] NOT NULL,
	[GroupName] [varchar](50) NOT NULL,
	[week] [int] NULL,
	[FirstBeginTime] [varchar](6) NULL,
	[FirstEndTime] [varchar](6) NULL,
	[OpenModel1] [varchar](10) NULL,
	[Status1] [varchar](10) NULL,
	[SecondBeginTime] [varchar](6) NULL,
	[SecondEndTime] [varchar](6) NULL,
	[OpenModel2] [varchar](10) NULL,
	[Status2] [varchar](10) NULL,
	[ThirdBeginTime] [varchar](6) NULL,
	[ThirdEndTime] [varchar](6) NULL,
	[OpenModel3] [varchar](10) NULL,
	[Status3] [varchar](10) NULL,
	[FourBeginTime] [varchar](6) NULL,
	[FourEndTime] [varchar](6) NULL,
	[OpenModel4] [varchar](10) NULL,
	[Status4] [varchar](10) NULL,
	[FiveBeginTime] [varchar](6) NULL,
	[FiveEndTime] [varchar](6) NULL,
	[OpenModel5] [varchar](10) NULL,
	[Status5] [varchar](10) NULL,
	[SixBeginTime] [varchar](6) NULL,
	[SixEndTime] [varchar](6) NULL,
	[OpenModel6] [varchar](10) NULL,
	[Status6] [varchar](10) NULL,
	[SevenBeginTime] [varchar](6) NULL,
	[SevenEndTime] [varchar](6) NULL,
	[OpenModel7] [varchar](10) NULL,
	[Status7] [varchar](10) NULL,
	[EightBeginTime] [varchar](6) NULL,
	[EightEndTime] [varchar](6) NULL,
	[OpenModel8] [varchar](10) NULL,
	[Status8] [varchar](10) NULL,
	TimCount [varchar](20) NULL,
) ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[Dt_CardType]    Script Date: 11/19/2014 16:58:56 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Dt_CardType]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[Dt_CardType](
	[id] [int] NOT NULL,
	[CardCname] [varchar](50) NULL,
	[CardEname] [varchar](50) NULL,
	[Mark] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO

insert into Dt_CardType (id,CardCname,Mark)values(1,'��������','��������')
GO
insert into Dt_CardType (id,CardCname,Mark)values(2,'����','����')
GO
insert into Dt_CardType (id,CardCname,Mark)values(3,'ֵ�࿨','ֵ�࿨')
GO
insert into Dt_CardType (id,CardCname,Mark)values(4,'¥�㿨','¥�㿨')
GO
insert into Dt_CardType (id,CardCname,Mark)values(5,'��ʱ��','��ʱ��')
GO
insert into Dt_CardType (id,CardCname,Mark)values(6,'ʱ�俨','ʱ�俨')
GO
insert into Dt_CardType (id,CardCname,Mark)values(7,'�׿�','�׿�')
GO
insert into Dt_CardType (id,CardCname,Mark)values(8,'������','������')
GO
insert into Dt_CardType (id,CardCname,Mark)values(9,'���п�','���п�')
GO
Delete Dt_TimeGroup
GO
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',1,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',2,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',3,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',4,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',5,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',6,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',1,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',2,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',3,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',4,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',5,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',6,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',7,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',1,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',2,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',3,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',4,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',5,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',6,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',7,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',1,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',2,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',3,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',4,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',5,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',6,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',7,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',1,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',2,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',3,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',4,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',5,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',6,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',7,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',1,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',2,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',3,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',4,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',5,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',6,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',7,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Dt_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',7,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
GO

/****** Object:  Table [dbo].[Dt_TimingOpen]  �����û���ʱ������Ϣ   Script Date: 12/26/2013 15:59:45 ******/
IF NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[Dt_TimingOpen]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
create table Dt_TimingOpen(
id int identity primary key,
DevcNum int ,
NoMalSet int,
Week int,
star1 varchar(500),
end1 varchar(500),
star2 varchar(500),
end2 varchar(500),
star3 varchar(500),
end3 varchar(500),
star4 varchar(500),
end4 varchar(500),
FoorInfo varchar(500)
)
GO
IF NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[Dt_HordayStuat]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
create table Dt_HordayStuat(
id int identity primary key,
DevcNum int ,
FoorInfo varchar(500)
)
GO
/****** Object:  TABLE [dbo].[Dt_YanTimeSet]    Script Date: 04/24/2014 10:30:43 ��ʱ���� ******/
if OBJECT_ID('Dt_YanTimeSet') is  null
create table Dt_YanTimeSet
(
id int identity primary key,
DevcNum INT,
Yanshi int
)
GO
if OBJECT_ID('Dt_BaoJinSet') is  null
create table Dt_BaoJinSet
(
id int identity primary key,
DevcNum INT,
BaoJin int
)
GO
/****** Object:  TABLE [dbo].[Dt_Door_Holiday]    Script Date: 12/27/2013 10:30:43  ���б���ͼ ******/
IF  EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Dt_Faxingview]') AND OBJECTPROPERTY(id, N'IsView') = 1)
drop view Dt_Faxingview
GO
EXEC dbo.sp_executesql @statement = N'create view  [dbo].[Dt_Faxingview]
as
select f.CardNo,f.CardIDNO, f.UserNo,j.UserName,j.DeptName,f.CardState,ct.id as CardTyp,ct.CardCname as CardType,f.TemNum,t.GroupName,f.EndDate,d.Place,f.PersonFoorid,f.Mark,f.Holiday,f.visitsFloor,f.isitsFlag,f.SfMoeny ,f.TineOnline ,f.fxmode  
from Dt_FaxingSsue f 
 left join MYJIBENZILIAO j on f.UserNo= j.UserNO
 left join (select distinct( GroupID),GroupName from  Dt_TimeGroup)t on t.GroupID=f.TimeTeam
 left join Dt_CardType ct on f.CardType=ct.id
 left join Dt_DoorData d on f.PersonDevcID=d.DevcNo'
GO

/****** Object:  Table [dbo].[Dt_TimingOpen] ¥�����������ü�¼��   Script Date: 12/31/2013 15:59:45 ******/
if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[Dt_FoorOutSet]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
create table Dt_FoorOutSet
(
id int identity primary key,
DevcNo int,
Holid bit,
Foorkzout bit,
Foorhf bit,
BaoJin bit,
RecCunchu bit,
FoorInfo varchar(200)
)
GO
/****** Object:  Table [dbo].[Dt_ldTimes] ���ӶԽ�����ʱ�����ü�¼��   Script Date: 11/06/2014 15:59:45 ******/
if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[Dt_ldTimes]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
create table Dt_ldTimes
(
id int identity primary key,
DevcNo int,
times varchar(50)
)
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Dt_CardProcess]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'create view  [dbo].[Dt_CardProcess]
as
select case CardIdIcflag when 0 then   f.CardNo when 1 then f.CardIDNO end as ''CardNo'',f.CardIdIcflag,f.CardIDNO, f.UserNo,j.UserName,j.DeptName,
case f.CardState when 0 then ''����ʹ��'' when 1 then ''�ѷ���ʧָ��'' when 2 then ''��ʧ�ɹ�'' when 3 then ''�ѷ����ָ��'' when 4 then  ''��ҳɹ�'' when 5 then case  CardExitflag  when 1 then ''�˿��ɹ�''else ''�˿�'' end end ''CardState'',
d.CardCname as CardType ,f.TemNum,f.TimeTeam,f.EndDate,f.PersonDevcID,f.PersonFoorid,f.Mark,f.Holiday,f.visitsFloor,f.isitsFlag,
t.GroupName
from Dt_FaxingSsue f 
 left join MYJIBENZILIAO j on f.UserNo= j.UserNO
 left join (select distinct( GroupID),GroupName from  Dt_TimeGroup)t on t.GroupID=f.TimeTeam
 left join Dt_CardType d on f.CardType=d.id
'
GO

/****** Object:  TABLE [dbo].[Dt_ViewGuaShiJieGua]    Script Date: 01/03/2014 10:30:43  ��ʧ�����ͼ ******/
IF   EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Dt_ViewGuaShiJieGua]') AND OBJECTPROPERTY(id, N'IsView') = 1)
drop view Dt_ViewGuaShiJieGua
GO
EXEC dbo.sp_executesql @statement = N'create view  [dbo].[Dt_ViewGuaShiJieGua]
as
select  case CardIdIcflag when 0 then   f.CardNo when 1 then f.CardIDNO end as ''CardNo'',d.CardCname as CardType,f.UserNo,j.UserName,j.DeptName,
case f.CardState when 1 then ''�ѷ���ʧָ��'' when 3 then ''�ѷ����ָ��''  end as CardState,f.CardState as Cardsate,
f.PersonDevcID,de.DevcIpadress,de.TxType,f.CardIdIcflag,f.visitsFloor,f.CardType as CardTypee,f.TimeTeam ,f.Holiday,f.EndDate,ft.FoorNo as PersonFoorid,f.isitsFlag,f.fxmode  
from Dt_FaxingSsue f 
left join Dt_CardType d on f.CardType=d.id
left join MYJIBENZILIAO j on f.UserNo= j.UserNO 
left join Dt_DoorData de  on f.PersonDevcID=de.DevcNo
left join Dt_foorTb ft on f.PersonFoorid=ft.foorid and ft.devcNo=f.PersonDevcID
where f.CardState =1 or f.CardState=3 and len(f.CardIDNO)=8
'
GO
IF  EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Dt_ViewLoadDown]') AND OBJECTPROPERTY(id, N'IsView') = 1)
drop view Dt_ViewLoadDown
GO
EXEC dbo.sp_executesql @statement = N'create view  [dbo].[Dt_ViewLoadDown]
as
select  case CardIdIcflag when 0 then   f.CardNo when 1 then f.CardIDNO end as ''CardNo'',d.CardCname as CardType,f.UserNo,j.UserName,j.DeptName,
case f.CardState when 0 then ''����ʹ��'' when 5 then ''�˿�''  end as CardState,f.CardState as Cardsate,
f.PersonDevcID,de.Place,de.DevcIpadress, de.TxType,f.CardIdIcflag,f.visitsFloor,f.CardType as CardTypee,f.TimeTeam ,t.GroupName,f.Holiday,f.EndDate,ft.FoorNo as PerFoorid,f.PersonFoorid,f.isitsFlag,f.fxmode
from Dt_FaxingSsue f left join Dt_CardType d on f.CardType=d.id
left join MYJIBENZILIAO j on f.UserNo= j.UserNO 
left join Dt_DoorData de  on f.PersonDevcID=de.DevcNo
 left join (select distinct( GroupID),GroupName from  Dt_TimeGroup)t on t.GroupID=f.TimeTeam
 left join Dt_foorTb ft on f.PersonFoorid=ft.foorid and f.PersonDevcID=ft.devcNo
where f.CardState in (0 ,5 )and len(f.CardIDNO)=8   and f.CardDownFlag=0  and d.id in (2,3,4,5) and CardIdIcflag=1
'
GO
IF  EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Dt_SelectViewLoadDown]') AND OBJECTPROPERTY(id, N'IsView') = 1)
drop view Dt_SelectViewLoadDown
GO
EXEC dbo.sp_executesql @statement = N'create view  [dbo].[Dt_SelectViewLoadDown]
as
select  case CardIdIcflag when 0 then   f.CardNo when 1 then f.CardIDNO end as ''CardNo'',d.CardCname as CardType,f.UserNo,j.UserName,j.DeptName,
case f.CardState when 0 then ''����ʹ��'' when 5 then ''�˿�''  end as CardState,f.CardState as Cardsate,
f.PersonDevcID,de.Place,de.DevcIpadress, de.TxType,f.CardIdIcflag,f.visitsFloor,f.CardType as CardTypee,f.TimeTeam ,t.GroupName,f.Holiday,f.EndDate,ft.FoorNo as PerFoorid,f.PersonFoorid,f.isitsFlag
from Dt_FaxingSsue f left join Dt_CardType d on f.CardType=d.id
left join MYJIBENZILIAO j on f.UserNo= j.UserNO 
left join Dt_DoorData de  on f.PersonDevcID=de.DevcNo
 left join (select distinct( GroupID),GroupName from  Dt_TimeGroup)t on t.GroupID=f.TimeTeam
 left join Dt_foorTb ft on f.PersonFoorid=ft.foorid and f.PersonDevcID=ft.devcNo
where  len(f.CardIDNO)=8     and d.id in (2,3,4,5)  
'
GO
/****** Object:  TABLE [dbo].[Dt_ViewLoadDownAll]    Script Date: 01/08/2014 10:30:43  ����������ͼ ******/
IF   EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Dt_ViewLoadDownAll]') AND OBJECTPROPERTY(id, N'IsView') = 1)
drop view Dt_ViewLoadDownAll
GO
EXEC dbo.sp_executesql @statement = N'create view  [dbo].[Dt_ViewLoadDownAll]
as
select   case CardIdIcflag when 0 then   f.CardNo when 1 then f.CardIDNO end as ''CardNo'',d.CardCname as CardType,f.UserNo,j.UserName,j.DeptName,
case f.CardState when 0 then ''����ʹ��'' when 5 then ''�˿�''  end as CardState,
f.PersonDevcID,de.Place,de.DevcIpadress, de.TxType,f.CardIdIcflag,f.visitsFloor,f.CardType as CardTypee,f.TimeTeam ,t.GroupName,f.Holiday,f.EndDate,ft.FoorNo as PerFoorid,f.PersonFoorid,f.isitsFlag,f.fxmode
from Dt_FaxingSsue f left join Dt_CardType d on f.CardType=d.id
left join MYJIBENZILIAO j on f.UserNo= j.UserNO 
left join Dt_DoorData de  on f.PersonDevcID=de.DevcNo
left join (select distinct( GroupID),GroupName from  Dt_TimeGroup)t on t.GroupID=f.TimeTeam
left join Dt_foorTb ft on f.PersonFoorid=ft.foorid and f.PersonDevcID=ft.devcNo
where f.CardState in (0 ,5 )and len(f.CardIDNO)=8   and d.id in (2,3,4,5) and CardIdIcflag=1
'
GO
/****** Object:  Table [dbo].[Dt_Record] ˢ����¼��   Script Date: 01/10/2014 15:59:45 ******/
if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[Dt_Record]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
create table Dt_Record
(
CardNo varchar(40),--����
CardFlag varchar(20),--����� ID ����IC
--DevcPlace varchar(100),--������ַ
OpenTime datetime,--����ʱ�� 
DevcNo int,--���ݺ�
Foorflag varchar(500),-- �򿪵�¥��
Eventss varchar(100)--�����¼�
)
GO
/****** Object:  Table [dbo].[Dt_RealTimStuats] ���״̬��   Script Date: 01/10/2014 15:59:45 ******/
if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[Dt_RealTimStuats]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
create table Dt_RealTimStuats(
id int identity primary key,
DevcName varchar(100)
)
GO
/****** Object:  TABLE [dbo].[Dt_RecodView]    Script Date: 01/08/2014 10:30:43  ����������ͼ ******/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Dt_RecodView]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'create view  [dbo].[Dt_RecodView]
as
select case f.CardIdIcflag when 0 then f.CardNo when 1 then f.CardIDNO  END as Cardno,
d.CardCname as CardType ,f.UserNo,m.UserName,m.DeptName,j.DevcNo,j.Place 
,r.Eventss,r.OpenTime
,case f.CardIdIcflag when 0 then ''IC��'' when 1 then ''ID��''  END as ControlType
from Dt_Record r left join  Dt_FaxingSsue  f on  r.CardNo= case f.CardIdIcflag when 0 then f.CardNo when 1 then f.CardIDNO end
left join MYJIBENZILIAO m on f.UserNo=m.UserNO 
left join Dt_CardType d on f.CardType=d.id
left join Dt_DoorData j on j.DevcNo=r.DevcNo
'
GO
/****** Object:  Table [dbo].[DtSelectScheme] ��ѯ������   Script Date: 01/10/2014 15:59:45 ******/
if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[DtSelectScheme]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
create table DtSelectScheme(
SchId int identity primary key,
SchName varchar(50),
FieldName varchar(50),
Operators varchar(20),
Selectvalues varchar(100),
startime varchar(50),
endtime varchar(50)
)
GO
if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[Dt_OpenTimeWeek]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
create table Dt_OpenTimeWeek(
id int identity primary key,
DevcNum int ,
Week int,
startime varchar(20),
endtime varchar(20),
)
GO
if OBJECT_ID('Dt_SendData') is not null
drop table Dt_SendData
GO
create table Dt_SendData(
Id int identity primary key ,
DevcNum int ,
SendData varbinary(500),
InseDate datetime
)
GO
/*485�Ž����ݿ�ű�  -----------------------------------------------------------------------------------------------  20140307*/
/****** Object:  Table [dbo].[Ser_DoorData]  485���ƻ���Ϣ   Script Date: 02/22/2014 15:59:45 ******/
if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[Ser_DoorData]') and OBJECTPROPERTY(id, 'IsUserTable') = 1)
create table Ser_DoorData
(
DevcNo int,
Place varchar(100),
DevcType int,
Com int,
DoorInfo varchar(200)
)
GO
/****** Object:  Table [dbo].[Ser_Door_Holiday]  485�Ž�ϵͳ����   Script Date: 02/22/2014 15:59:45 ******/
if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[Ser_Door_Holiday]') and OBJECTPROPERTY(id, 'IsUserTable') = 1)
create table Ser_Door_Holiday
(
id int identity primary key,
sDate varchar(50),
DevcNum int,
Doorid int 
)
GO
/****** Object:  Table [dbo].[Ser_OutTimeBaoJingRec]  485�Ž�������¼����    Script Date: 02/24/2014 15:59:45 ******/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Ser_OutTimeBaoJingRec]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].Ser_OutTimeBaoJingRec(
	[id] [int] IDENTITY(1,1) NOT NULL,
	[DevcNum] [int] NULL,
	[Baojin] [varchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[Ser_TimingOpen]  �����û���ʱ������Ϣ   Script Date: 02/24/2014 15:59:45 ******/
if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[Ser_TimingOpen]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
create table Ser_TimingOpen(
id int identity primary key,
DevcNum int ,
DoorId int,
NoMalSet int,
Week int,
star1 varchar(500),
end1 varchar(500),
star2 varchar(500),
end2 varchar(500),
star3 varchar(500),
end3 varchar(500),
star4 varchar(500),
end4 varchar(500)
)
GO
/****** Object:  Table [dbo].[Ser_CardType]  485�����   Script Date: 02/24/2014 15:59:45 ******/
if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[Ser_CardType]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
create table Ser_CardType
(
id int  primary key,
CardCname varchar(50),
CardEname varchar(50),
Mark varchar(100)
)
GO
delete Ser_CardType
GO
insert into Ser_CardType (id,CardCname)values(1,'����')
GO
insert into Ser_CardType (id,CardCname)values(2,'��Ȩ��')
GO
insert into Ser_CardType (id,CardCname)values(3,'��ʱ��')
GO
insert into Ser_CardType (id,CardCname)values(4,'�׿�')
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Ser_ClosedDStaut]  485ǿ�ƹ���.sql   Script Date: 02/24/2014 15:59:45 ******/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Ser_ClosedDStaut]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
create table Ser_ClosedDStaut(
id int identity(1,1) primary key,
DevcNo int ,
Stuat varchar(500)
)
GO
/****** Object:  Table [dbo].[Ser_TimeGroup]   ��Ƭʱ�����   Script Date: 02/24/2014 15:59:45 ******/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Ser_TimeGroup]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[Ser_TimeGroup](
	[GroupID] [int] NOT NULL,
	[GroupName] [varchar](50) NOT NULL,
	[week] [int] NULL,
	[FirstBeginTime] [varchar](6) NULL,
	[FirstEndTime] [varchar](6) NULL,
	[OpenModel1] [varchar](10) NULL,
	[Status1] [varchar](10) NULL,
	[SecondBeginTime] [varchar](6) NULL,
	[SecondEndTime] [varchar](6) NULL,
	[OpenModel2] [varchar](10) NULL,
	[Status2] [varchar](10) NULL,
	[ThirdBeginTime] [varchar](6) NULL,
	[ThirdEndTime] [varchar](6) NULL,
	[OpenModel3] [varchar](10) NULL,
	[Status3] [varchar](10) NULL,
	[FourBeginTime] [varchar](6) NULL,
	[FourEndTime] [varchar](6) NULL,
	[OpenModel4] [varchar](10) NULL,
	[Status4] [varchar](10) NULL,
	[FiveBeginTime] [varchar](6) NULL,
	[FiveEndTime] [varchar](6) NULL,
	[OpenModel5] [varchar](10) NULL,
	[Status5] [varchar](10) NULL,
	[SixBeginTime] [varchar](6) NULL,
	[SixEndTime] [varchar](6) NULL,
	[OpenModel6] [varchar](10) NULL,
	[Status6] [varchar](10) NULL,
	[SevenBeginTime] [varchar](6) NULL,
	[SevenEndTime] [varchar](6) NULL,
	[OpenModel7] [varchar](10) NULL,
	[Status7] [varchar](10) NULL,
	[EightBeginTime] [varchar](6) NULL,
	[EightEndTime] [varchar](6) NULL,
	[OpenModel8] [varchar](10) NULL,
	[Status8] [varchar](10) NULL,
	TimCount [varchar](20) NULL,
) ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[Ser_TimeGroup]  ���Ĭ�Ͽ�Ƭʱ�����ֵ   Script Date: 02/24/2014 15:59:45 ******/
Delete Ser_TimeGroup
GO
Begin
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',1,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',2,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',3,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8')
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',4,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',5,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',6,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',1,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',2,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',3,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',4,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',5,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',6,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (1,'ʱ����һ',7,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',1,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',2,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',3,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',4,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',5,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',6,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (6,'��Чʱ����',7,'0000','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','2359','2359','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',1,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',2,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',3,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',4,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',5,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',6,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (5,'ʱ������',7,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',1,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',2,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',3,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',4,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',5,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',6,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (4,'ʱ������',7,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',1,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',2,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',3,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',4,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',5,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',6,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (3,'ʱ������',7,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
insert Ser_TimeGroup(GroupID,GroupName,week,FirstBeginTime,FirstEndTime,OpenModel1,Status1,SecondBeginTime,SecondEndTime,OpenModel2,Status2,ThirdBeginTime,ThirdEndTime,OpenModel3,Status3,FourBeginTime,FourEndTime,OpenModel4,Status4,FiveBeginTime,FiveEndTime,OpenModel5,Status5,SixBeginTime,SixEndTime,OpenModel6,Status6,SevenBeginTime,SevenEndTime,OpenModel7,Status7,EightBeginTime,EightEndTime,OpenModel8,Status8,TimCount) values (2,'ʱ�����',7,'00:00','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','23:59','23:59','1','1','8');
END
GO
/****** Object:  Table [dbo].[Ser_FaxingSsue]   ��Ƭ���б�   Script Date: 02/24/2014 15:59:45 ******/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Ser_FaxingSsue]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
create table Ser_FaxingSsue
(
ID int identity(1,1),
CardNo varchar(50),
CardIDNo varchar(50),
UserNo varchar(50),
CardState int,
IssDate datetime,
CardType int ,
TemNum int ,
TimeTeam int,
CaseCade int ,
EndDate datetime,
DoorMark varchar(200),
DoorPerInfo varchar(200),
Holiday varchar(20),
SysHoliday varchar(20),
DevcNum varchar(2000),
DoorNum varchar(8000),
CardDownFlag int 
)
GO
/****** Object:  TABLE [dbo].[Ser_FaxingView]    Script Date: 02/24/2014 10:30:43  ���б���ͼ ******/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Ser_FaxingView]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'create view  [dbo].[Ser_FaxingView]
as
select f.ID ,f.UserNo,j.UserName,j.DeptName,f.CardNo,f.CardState,f.CardIDNo
,ct.CardCname as CardType,f.TemNum,f.TimeTeam,t.GroupName,f.EndDate,f.CaseCade,f.DoorMark,
f.DoorPerInfo,f.Holiday,f.SysHoliday,f.DevcNum,f.DoorNum
 from Ser_FaxingSsue f left join MYJIBENZILIAO j on f.UserNo= j.UserNO
left join (select distinct( GroupID),GroupName from  Ser_TimeGroup)t on t.GroupID=f.TimeTeam
left join Ser_CardType ct on f.CardType=ct.id '
GO
/****** Object:  TABLE [dbo].[[Ser_ViewLoadDown]]    Script Date: 02/24/2014 10:30:43  ����������ͼ ******/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Ser_ViewLoadDown]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'create view  [dbo].[Ser_ViewLoadDown]
as
select f.CardNo,f.CardType,ct.CardCname as CardTypee,f.UserNo,j.UserName,j.DeptName,
case f.CardState when 0 then ''����ʹ��'' when 5 then ''�˿�''  end as CardState,f.CardState as Cardsatee,
f.CaseCade,f.DevcNum,f.DoorNum,f.EndDate,f.TemNum,f.TimeTeam,t.GroupName,f.Holiday,f.SysHoliday
from Ser_FaxingSsue f
left join Ser_CardType ct on f.CardType=ct.id
left join MYJIBENZILIAO j on f.UserNo= j.UserNO
left join (select distinct( GroupID),GroupName from  Ser_TimeGroup)t on t.GroupID=f.TimeTeam
where f.CardState in (0 ,5 )and len(f.CardNo)=8   and f.CardDownFlag=0   '
GO
/****** Object:  TABLE [dbo].[[Ser_ViewLoadDownALl]]    Script Date: 02/24/2014 10:30:43  ȫ�����¿���������ͼ ******/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Ser_ViewLoadDownALl]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'create view  [dbo].[Ser_ViewLoadDownALl]
as
select f.CardNo,f.CardType,ct.CardCname as CardTypee,f.UserNo,j.UserName,j.DeptName,
case f.CardState when 0 then ''����ʹ��'' when 5 then ''�˿�''  end as CardState,f.CardState as Cardsatee,
f.CaseCade,f.DevcNum,f.DoorNum,f.EndDate,f.TemNum,f.TimeTeam,t.GroupName,f.Holiday,f.SysHoliday
from Ser_FaxingSsue f
left join Ser_CardType ct on f.CardType=ct.id
left join MYJIBENZILIAO j on f.UserNo= j.UserNO
left join (select distinct( GroupID),GroupName from  Ser_TimeGroup)t on t.GroupID=f.TimeTeam
where f.CardState in (0 ,5 )and len(f.CardNo)=8  '
GO
/****** Object:  TABLE [dbo].[Ser_CardProcessView]    Script Date: 02/26/2014 10:30:43  ��Ƭ������ͼ ******/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Ser_CardProcessView]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'
create view  [dbo].[Ser_CardProcessView]
as
select f.ID ,f.UserNo,j.UserName,j.DeptName,f.CardNo,f.CardState ,
case f.CardState when 0 then ''����ʹ��'' when 1 then ''�ѷ���ʧָ��'' when 2 then ''��ʧ�ɹ�'' when 3 then ''�ѷ����ָ��'' when 4 then  ''��ҳɹ�'' when 5 then case  CardDownFlag  when 0 then ''�˿��ɹ�''else ''�˿�'' end end ''CardStatee'',
f.CardIDNo
,ct.CardCname as CardType,f.TemNum,f.TimeTeam,t.GroupName,f.EndDate,f.CaseCade,f.DoorMark,
f.DoorPerInfo,f.Holiday,f.SysHoliday,f.DevcNum,f.DoorNum
from Ser_FaxingSsue f left join MYJIBENZILIAO j on f.UserNo= j.UserNO
left join (select distinct( GroupID),GroupName from  Dt_TimeGroup)t on t.GroupID=f.TimeTeam
left join Ser_CardType ct on f.CardType=ct.id'
GO
 /****** Object:  TABLE [dbo].Ser_ViewGuaShiJieGua    Script Date: 02/26/2014 10:30:43  ��ʧ�����ͼ ******/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Ser_ViewGuaShiJieGua]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'create view  [dbo].[Ser_ViewGuaShiJieGua]
as
select f.CardNo,f.CardType,ct.CardCname as CardTypee,f.UserNo,j.UserName,j.DeptName,
case f.CardState when 1 then ''�ѷ���ʧָ��'' when 3 then ''�ѷ����ָ��''  end as CardState,f.CardState as Cardsatee,
f.CaseCade,f.DevcNum,f.DoorNum,f.EndDate,f.TemNum,f.TimeTeam,t.GroupName,f.Holiday,f.SysHoliday
from Ser_FaxingSsue f
left join Ser_CardType ct on f.CardType=ct.id
left join MYJIBENZILIAO j on f.UserNo= j.UserNO
left join (select distinct( GroupID),GroupName from  Ser_TimeGroup)t on t.GroupID=f.TimeTeam
WHERE f.CardState=1 or f.CardState=3 and len(f.CardNo)=8'
GO
/****** Object:  TABLE [dbo].Ser_LoadMonProcessCardView    Script Date: 02/26/2014 10:30:43  ��ʧ����˿�������ͼ ******/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Ser_LoadMonProcessCardView]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'
create view  [dbo].[Ser_LoadMonProcessCardView]
as
select f.CardNo,f.CardType,ct.CardCname as CardTypee,f.UserNo,j.UserName,j.DeptName,
f.CardState ,
f.CaseCade,f.DevcNum,f.DoorNum,f.EndDate,f.TemNum,f.TimeTeam,t.GroupName,f.Holiday,f.SysHoliday
from Ser_FaxingSsue f
left join Ser_CardType ct on f.CardType=ct.id
left join MYJIBENZILIAO j on f.UserNo= j.UserNO
left join (select distinct( GroupID),GroupName from  Ser_TimeGroup)t on t.GroupID=f.TimeTeam
WHERE f.CardState in(0,1 , 3 ,5 )and f.CardDownFlag=0 and len(f.CardNo)=8'
GO
/*-�����صĿ���ѡ��*/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Ser_DoorRealTimeStuats]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
create table Ser_DoorRealTimeStuats
(
id int identity primary key,
DoorName varchar(50)
)
GO
/*-��ͼģʽ*/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Ser_DoorMapsB]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
create table Ser_DoorMapsB--485�Ž���ͼ
(Mapid INT IDENTITY PRIMARY KEY,
MapName varchar(50),
MapLiu image,
AltDate Datetime
)
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Ser_DoorMapsDoorInfo]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
create table Ser_DoorMapsDoorInfo--485�Ž���ͼ ����Ϣ
(
 id int identity primary key,
 Mapid int ,--��ͼID
 Drawing varchar(50),--����
 DevcID varchar(20),--���ƻ�ID
 DevcName varchar(50),--���ƻ�����
 Doorid varchar(20),--��ID
 DoorName varchar(50) --�ŵ�����
)
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Ser_Records]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[Ser_Records](
	[CardID] [varchar](10) NOT NULL,
	[UserNo] [varchar](15) NOT NULL,
	[MachNo] [int] NOT NULL,
	[MachPlace] [varchar](256) NULL,
	[DoorNo] [int] NOT NULL,
	[DoorPlace] [varchar](256) NULL,
	[Events] [varchar](100) NULL,
	[OpenTime] [datetime] NOT NULL,
	[Password] [varchar](20) NULL,
	[PasswordType] [varchar](100) NOT NULL
) ON [PRIMARY]
END
GO

/*��ѯ�����洢��*/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[SerDoorSelectScheme]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[SerDoorSelectScheme](
[SchId] [int] IDENTITY(1,1) NOT NULL,
[SchName] [varchar](50) NULL,
[FieldName] [varchar](50) NULL,
[Operators] [varchar](50) NULL,
[Selectvalues] [varchar](50) NULL,
[startime] [varchar](50) NULL,
[endtime] [varchar](50) NULL,
CONSTRAINT [PK__SerSelect__CAD9870B196C6ECD] PRIMARY KEY CLUSTERED 
(
[SchId] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
/*��ѯ�����洢��*/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[SerFaxingSelectScheme]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].SerFaxingSelectScheme(
[SchId] [int] IDENTITY(1,1) NOT NULL,
[SchName] [varchar](50) NULL,
[FieldName] [varchar](50) NULL,
[Operators] [varchar](50) NULL,
[Selectvalues] [varchar](50) NULL,
[startime] [varchar](50) NULL,
[endtime] [varchar](50) NULL,
CONSTRAINT [PK__SerSelect__FaxingCAD9870B196C6ECD] PRIMARY KEY CLUSTERED 
(
[SchId] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
/*��ѯ������ͼ*/
/****** Object:  TABLE [dbo].[SerRecordViewChanese]    Script Date: 02/27/2014 10:30:43  ��ѯ������ͼ ******/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[SerRecordViewChanese]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'create  view [dbo].[SerRecordViewChanese]
as 
select 
case  r.CardID  when '''' then ''00000000'' else r.CardID end  as [CardID],
t.CardCname  as ''MJCardType''
,r.UserNO,c.UserName,c.DeptName,
r.MachNo,r.MachPlace,r.DoorNo,r.DoorPlace,
case    r.[Events]
when ''01''   then case CardID when  ''00000000'' THEN ''PCָ���'' else  ''ˢ������''  end 
when ''21'' then ''û�п���''
when ''03'' then ''��û������''
when ''22'' then ''5s��ֻ�����ͬһ�ſ�һ��''
when ''23'' then ''�˿��ڴ����޿�ͨ''
when ''04'' then ''ֹ������''
when ''05'' then ''���ļ�������''
when ''06'' then ''ʱ��������''
when ''07'' then ''�����ڼ������Ч''
when ''02'' then ''ϵͳ�������ƿ���''
when ''08'' then ''��ʱ����������''
when ''10'' then ''���뿪�����벻��''
else  r.[Events] end   as [Events]
,r.OpenTime,
case  d.DevcType when 0 then ''ID���Ž�''     when 1 then ''IC���Ž�'' else cast( d.DevcType as varchar(20)) end  as ''ControlType''
from  
dbo.Ser_Records r left join Ser_FaxingSsue f on   right(r.CardID ,8)=f.CardNO  
left join MYJIBENZILIAO  c on r.UserNO=c.UserNO
left join Ser_DoorData d on r.MachNo=d.DevcNo
left join dbo.Ser_CardType t on f.CardType= t.id  '
GO
/****** Object:  TABLE [dbo].[Ser_FaxingViewAll]    Script Date: 02/27/2014 10:30:43  �������� ******/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Ser_FaxingViewAll]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'
create view  [dbo].[Ser_FaxingViewAll]
as
select f.CardNo,f.CardType,ct.CardCname as CardTypee,f.UserNo,j.UserName,j.DeptName,
case f.CardState when 0 then ''����ʹ��'' when 5 then ''�˿�''  end as CardState,f.CardState as Cardsatee,
f.CaseCade,f.DevcNum,f.DoorNum,f.EndDate,f.TemNum,f.TimeTeam,t.GroupName,f.Holiday,f.SysHoliday,f.IssDate 
from Ser_FaxingSsue f
left join Ser_CardType ct on f.CardType=ct.id
left join MYJIBENZILIAO j on f.UserNo= j.UserNO
left join (select distinct( GroupID),GroupName from  Ser_TimeGroup)t on t.GroupID=f.TimeTeam
where f.CardState in (0 ,5 )and len(f.CardNo)=8 '
GO
------------����ģʽ����
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Ser_OpenDoorMode]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
create table Ser_OpenDoorMode--����ģʽ����
(
 id int identity primary key,
 Devcid int ,--���ƻ�ID
 Doorid int,--��ID
 DoorJl varchar(50) --��������
)
GO
------------��Ȩģʽ����
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Ser_TeQuanMode]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
create table Ser_TeQuanMode--����ģʽ����
(
 id int identity primary key,
 Devcid int ,--���ƻ�ID
 Doorid int,--��ID
 DoorMode varchar(50) --��Ȩģʽ
)
GO
/****** Object:  Table [dbo].[Ser_DoorData]  485�Ž���ʱ��¼����    Script Date: 02/24/2014 15:59:45 ******/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Ser_YanTimeSet]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].Ser_YanTimeSet(
	[id] [int] IDENTITY(1,1) primary key,
	[DevcNum] [int] NULL,
	[Yanshi] [varchar](20) )
END
GO
IF NOT exists (select * from sysobjects where id = OBJECT_ID('[MyParkingRecover]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
BEGIN
CREATE TABLE [MyParkingRecover] (
[CtrlNumber] [int]  NOT NULL,
[Instruct] [nvarchar]  (4000) NULL,
[Flag] [nvarchar]  (50) NULL)
END
GO
if NOT exists (select * from sysobjects where id = OBJECT_ID('[MyParkingGreeting]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
BEGIN
CREATE TABLE [MyParkingGreeting] (
[CtrlNumber] [int]  NOT NULL,
[Voice] [nvarchar]  (200) NULL,
[StartTime] [datetime]  NULL,
[EndTime] [datetime]  NULL,
[DredgeVoice] [bit]  NULL)
END
GO

if NOT  exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[Dt_qrsDoorDevcSet]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE Dt_qrsDoorDevcSet
(
DevcNum int primary key,
DoorNum int,
DoorPace varchar(50)
)
END
GO
/****** Object:  Table [dbo].[DtFxReportSelectScheme] ��ѯ������   Script Date: 01/10/2014 15:59:45 ******/
if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[DtFxReportSelectScheme]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
create table DtFxReportSelectScheme(
SchId int identity primary key,
SchName varchar(50),
FieldName varchar(50),
Operators varchar(20),
Selectvalues varchar(100),
startime varchar(50),
endtime varchar(50)
)
GO
if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[Dt_FlootSet]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
create table Dt_FlootSet
(
Floot int --32�㣬 1 64��
)
GO
if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[Qr_ComSet]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
create table Qr_ComSet
(
com int 
)
GO
if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[Qr_FaxingSsue]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
CREATE TABLE [dbo].[Qr_FaxingSsue](
	[Id] [int] IDENTITY(1,1) primary key,
	[Cardno] [varchar](50) NULL,
	[Userno] [varchar](50) NULL,
	[Cardstuat] [varchar](50) NULL,
	[Cardtype] [varchar](50) NULL,
	[Pasword] [varchar](50) NULL,
	[EndTime] [varchar](50) NULL,
	[StarHour] [varchar](50) NULL,
	[EndHour] [varchar](50) NULL,
	CardExitflag [varchar](50) NULL,
	[Mark] [varchar](200) NULL,
	[DevcInfo] [varchar](500) NULL,
	[IssDate]  [varchar](50) NULL
	)
GO
if NOT EXISTS (select * from sysobjects where id = OBJECT_ID('[Qr_Record]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
CREATE TABLE Qr_Record
(
Cardid varchar(50),
Cardtype varchar(50),
Userno varchar(50),
UserName varchar(50),
Department varchar(50),
Machno varchar(50),
Machplace varchar(50),
Doorno varchar(50),
Opentime varchar(50)
)
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Qr_YanTimeSet]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].Qr_YanTimeSet(
	[id] [int] IDENTITY(1,1) primary key,
	[DevcNum] [int] NULL,
	[Yanshi] [varchar](20) )
END
GO
 
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Dt_FaxingViewReport]')  AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'
CREATE view  Dt_FaxingViewReport
as
select f.CardNo,f.CardIDNO,case CardiDiCflag when 0 then ''IC��'' else ''ID��'' end as ''cardlei'', f.UserNo,j.UserName,j.DeptName,
 case f.CardState when 0 then ''����ʹ��''  when 1 then ''��ʧָ��''     when 2 then ''��ʧ''   when 3 then ''���ָ��''    when 4 then ''���''  when 5 then ''�˿�''      end as ''CardState'',
ct.CardCname as CardType,f.TemNum,t.GroupName,f.EndDate,f.Mark,
f.visitsFloor,f.isitsFlag,f.SfMoeny  ,case f.fxmode  when 1 then ''ͬ�����ģʽ'' when 2 then ''����ģʽ'' end as fxmode,f.IssDate
from Dt_FaxingSsue f 
 left join MYJIBENZILIAO j on f.UserNo= j.UserNO
 left join (select distinct( GroupID),GroupName from  Dt_TimeGroup)t on t.GroupID=f.TimeTeam
 left join Dt_CardType ct on f.CardType=ct.id
 left join Dt_DoorData d on f.PersonDevcID=d.DevcNo'   
GO
 /****** Object:  Table [dbo].[QrSelectScheme] ��ѯ������   Script Date: 12/17/2014 15:59:45 ******/
IF NOT EXISTS (select * from sysobjects where id = OBJECT_ID(N'[dbo].[QrSelectScheme]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
create table QrSelectScheme(
SchId int identity primary key,
SchName varchar(50),
FieldName varchar(50),
Operators varchar(50),
Selectvalues varchar(100),
startime varchar(50),
endtime varchar(50)
)
GO

if NOT EXISTS (select * from sysobjects where id = OBJECT_ID(N'[dbo].[QrFxSelectScheme]') and OBJECTPROPERTY(id, 'IsUserTable') = 1) 
create table QrFxSelectScheme(
SchId int identity primary key,
SchName varchar(50),
FieldName varchar(50),
Operators varchar(20),
Selectvalues varchar(100),
startime varchar(50),
endtime varchar(50)
)
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Qr_RecordView]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'
create view Qr_RecordView
as
select Cardid,
case  Cardtype when ''31'' then ''���ſ�'' when ''32'' then ''������'' when ''EE'' then ''�Ƿ���'' when ''FF'' then ''���ڿ�'' end as Cardtype,
Userno,UserName,Department,Machno,Machplace,Doorno,Opentime from dbo.Qr_Record'
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Qr_FaxingReportview]') AND OBJECTPROPERTY(id, N'IsView') = 1)
EXEC dbo.sp_executesql @statement = N'
 create view Qr_FaxingReportview 
 as 
 select f.Cardno,f.Userno,m.UserName,m.DeptName, 
 case f.Cardstuat when 0 then ''����ʹ��'' when 1 then ''��ʧָ��''  when 2 then ''��ʧ''    when 3 then ''���ָ��''   when 4 then ''���''   when 5 then ''�˿�'' 
 end as ''CardState'',case Cardtype when 1 then ''������'' when 0 then ''���ſ�'' end as Cardtype, EndTime,StarHour,EndHour,DevcInfo,Mark,f.IssDate 
 from  dbo.Qr_FaxingSsue f join dbo.MYJIBENZILIAO m on f.Userno=m.UserNO'
GO

IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[Qr_OutTimeBaoJingRec]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].Qr_OutTimeBaoJingRec(
	[id] [int] IDENTITY(1,1) NOT NULL,
	[DevcNum] [int] NULL,
	[Baojin] [varchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO

if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[CARQUERYNOWS2]') and OBJECTPROPERTY(id, N'IsProcedure') = 1)
drop procedure [dbo].[CARQUERYNOWS2]
GO

CREATE     PROCEDURE CARQUERYNOWS2
       @INCARPLATES  VARCHAR(15),
       @CPPRECISION  INT,
       @FORTIAOJIAN01  VARCHAR(10),  
       @FORTIAOJIAN02  VARCHAR(10)    
AS 
IF (@CPPRECISION<4 OR @CPPRECISION>6)
    BEGIN
        SET @CPPRECISION=4
     END
IF @CPPRECISION=4
   BEGIN
	SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE 
       ((SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	
	(SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1))) AND
                  (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02) 
   END 
IF @CPPRECISION=5
   BEGIN
	SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE                
       ((SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 	
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR         
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1))) AND 
                  (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02) 
        
   END 
IF @CPPRECISION=6
   BEGIN
	SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE 
	SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) 
    AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1) AND 
                 (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02) 
   END 






GO



if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[CARQUERYNOWS]') and OBJECTPROPERTY(id, N'IsProcedure') = 1)
drop procedure [dbo].[CARQUERYNOWS]
GO


CREATE    PROCEDURE CARQUERYNOWS
       @INCARPLATES  VARCHAR(15),
       @CPPRECISION  INT,
       @FORTIAOJIAN01  VARCHAR(10),  
       @FORTIAOJIAN02  VARCHAR(10)    
AS 
IF (@CPPRECISION<4 OR @CPPRECISION>6)
    BEGIN
        SET @CPPRECISION=4
     END
IF @CPPRECISION=4
   BEGIN
	SELECT CardNO,CarCardType,CPH,CarType,CarColor,CarValidEndDate  FROM MYFAXINGSSUE WHERE 
       ((SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	
	(SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1))) AND
                  (LEFT(CarCardType,3)=@FORTIAOJIAN01 OR LEFT(CarCardType,3)=@FORTIAOJIAN02) AND CardState='0' AND LTRIM(CPH)<>'' AND CPH IS NOT NULL
   END 
IF @CPPRECISION=5
   BEGIN
	SELECT CardNO,CarCardType,CPH,CarType,CarColor,CarValidEndDate  FROM MYFAXINGSSUE WHERE                
       ((SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 	
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR         
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1))) AND 
                  (LEFT(CarCardType,3)=@FORTIAOJIAN01 OR LEFT(CarCardType,3)=@FORTIAOJIAN02) AND CardState='0' AND LTRIM(CPH)<>'' AND CPH IS NOT NULL
        
   END 
IF @CPPRECISION=6
   BEGIN
	SELECT CardNO,CarCardType,CPH,CarType,CarColor,CarValidEndDate  FROM MYFAXINGSSUE WHERE 
	SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) 
    AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1) AND 
                 (LEFT(CarCardType,3)=@FORTIAOJIAN01 OR LEFT(CarCardType,3)=@FORTIAOJIAN02) AND CardState='0' AND LTRIM(CPH)<>'' AND CPH IS NOT NULL
   END 




GO


/****** Object:  Table [dbo].[MyHoliday]    Script Date: 12/08/2014 10:14:39 ******/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MyHoliday]') AND type in (N'U'))
BEGIN
	CREATE TABLE [dbo].[MyHoliday](
		[Dates] [smalldatetime] NOT NULL,
		[Types] [varchar](20) NULL
	) ON [PRIMARY]
END
GO


/****** Object:  UserDefinedFunction [dbo].[IsHoliday]    Script Date: 12/08/2014 10:11:37 ******/
IF  EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[IsHoliday]') AND type in (N'FN', N'IF', N'TF', N'FS', N'FT'))
DROP FUNCTION [dbo].[IsHoliday]
GO

/****** Object:  UserDefinedFunction [dbo].[IsHoliday]    Script Date: 12/08/2014 10:11:37 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO



--���أ�0--������    1--����
CREATE   function [dbo].[IsHoliday](@Date datetime)
returns INT as

begin
   declare @ret as int
   declare @Holiday as datetime
   declare @setDate as datetime

      

   set @setDate = convert(varchar(100),@Date,23)   --ֻȡǰ������ڲ��֣�ȥ��ʱ�䲿��

   --�жϹ�����
   select @Holiday=Dates from MyHoliday where Dates=@setDate and Types='WorkDay'

   if @Holiday is not null
      begin
         set @ret = 0
         return @ret
      end


   --�жϼ���
   if DATEPART(weekday,@Date) = '7' or DATEPART(weekday,@Date) = '1'  --7������  1������
      return 1
   
   select @Holiday=Dates from MyHoliday where Dates=@setDate and Types='Holiday'

   if @Holiday is null
      set @ret = 0
   else
      set @ret = 1

   return @ret

end
GO




/****** Object:  StoredProcedure [dbo].[JJCT_GETMONEY_SZ]    Script Date: 12/08/2014 10:11:18 ******/
IF  EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCT_GETMONEY_SZ]') AND type in (N'P', N'PC'))
DROP PROCEDURE [dbo].[JJCT_GETMONEY_SZ]
GO


/****** Object:  StoredProcedure [dbo].[JJCT_GETMONEY_SZ]    Script Date: 12/08/2014 10:11:18 ******/
SET ANSI_NULLS OFF
GO

SET QUOTED_IDENTIFIER OFF
GO



/*
�ְ����ҹ��ʱ���
�ϸ񰴶��շѣ�ÿ����������շѶ��������ÿ������շѶ�

�����շѱ�׼�����ֹ����պͷǹ������շ�(�ǹ����ղ�������ҹ���շ�)

*/

create    PROCEDURE [dbo].[JJCT_GETMONEY_SZ]
@CardType VARCHAR(10),
@InTime DATETIME,
@OutTime DATETIME,
@OutMoney MONEY OUTPUT
 AS

set nocount on

set @OutMoney = 0

DECLARE @StayDays AS INT				--@ͣ������
DECLARE @StayHours AS INT				--@ͣ��Сʱ��
DECLARE @StayTotalMinutes AS INT		--@��ͣ��������

DECLARE @FreeMinutes AS INT				--@��ѷ���
DECLARE @TopSF AS MONEY					--@�������

--*
DECLARE @FreeTimeNoCharge AS INT		--@���ʱ�䲻�Ʒ�
DECLARE @MakeDayNight AS INT			--@�ְ���ҹ���
DECLARE @IDCardSF AS INT				--@ID���շ�
DECLARE @ChargeMode3 AS INT				--@���μƷ�
DECLARE @ChargeMode2 AS INT				--@���趨ʱ��Ʒ�

DECLARE @DayStartHour AS INT			--@���쿪ʼСʱ
DECLARE @NightStartHour AS INT			--@ҹ�俪ʼСʱ
DECLARE @DayStartMinute AS INT			--@���쿪ʼ����
DECLARE @NightStartMinute AS INT		--@ҹ�俪ʼ����
DECLARE @DayCalcUnitHour AS INT			--@�����ʱ��λСʱ
DECLARE @NightCalcUnitHour AS INT		--@ҹ���ʱ��λСʱ
DECLARE @DayCalcUnitMinute AS INT		--@�����ʱ��λ����
DECLARE @NightCalcUnitMinute AS INT		--@ҹ���ʱ��λ����
DECLARE @DayUnitTimeMoney AS MONEY		--@����ÿ��ʱ��λ�շѶ�
DECLARE @NightUnitTimeMoney AS MONEY	--@ҹ��ÿ��ʱ��λ�շѶ�
DECLARE @DayMaxMoney AS MONEY			--@��������շѶ�
DECLARE @NightMaxMoney AS MONEY			--@ҹ������շѶ�

DECLARE @DayFirstUnitMoney AS MONEY		--@�����׼�ʱ��λ�շѶ�
DECLARE @NightFirstUnitMoney AS MONEY	--@ҹ���׼�ʱ��λ�շѶ�
DECLARE @DayMinMoney AS MONEY			--@��������շѶ�
DECLARE @NightMinMoney AS MONEY			--@ҹ������շѶ�

DECLARE @DayFirstUnitHour AS INT		--@�����׼�ʱ��λСʱ
DECLARE @NightFirstUnitHour AS INT		--@ҹ���׼�ʱ��λСʱ
DECLARE @DayFirstUnitMinute AS INT		--@�����׼�ʱ��λ����
DECLARE @NightFirstUnitMinute AS INT	--@ҹ���׼�ʱ��λ����

DECLARE @DayCalcMinute AS INT			--@�����ʱ����
DECLARE @NightCalcMinute AS INT			--@ҹ���ʱ����
--DECLARE @�����ʱ��λ AS INT
--DECLARE @ҹ���ʱ��λ AS INT

DECLARE @DayStartTime AS CHAR(5)		--@���쿪ʼʱ��
DECLARE @NightStartTime AS CHAR(5)		--@ҹ�俪ʼʱ��

DECLARE @EVERYDAY_DAY_MINUTES AS INT
DECLARE @EVERYDAY_NIGHT_MINUTES AS INT

DECLARE @EVERYDAY_DAY_MONEY AS MONEY
DECLARE @EVERYDAY_NIGHT_MONEY AS MONEY

DECLARE @TOTAL_DAYS_MONEY AS MONEY

DECLARE @MINUTES AS INT    --�ܵ�ͣ������
DECLARE @DAYS AS INT       --ͣ��������
DECLARE @TEMP_IN AS DATETIME

DECLARE @IN AS CHAR(5)
DECLARE @OUT AS CHAR(5)

DECLARE @SAME_DAY AS CHAR(5)
DECLARE @SAME_NIGHT AS CHAR(5)

DECLARE @TEMP_DAY1 AS VARCHAR(20)
DECLARE @TEMP_NIGHT1 AS VARCHAR(20)

DECLARE @TEMP_DAY2 AS VARCHAR(20)
DECLARE @TEMP_NIGHT2 AS VARCHAR(20)

DECLARE @DayStayMinutes INT			--@����ͣ������
DECLARE @NightStayMinutes INT		--@ҹ��ͣ������
DECLARE @ToAddMinutes INT			--@�������

DECLARE @DayMoney AS MONEY			--@�����շ�
DECLARE @NightMoney AS MONEY		--@ҹ���շ�
DECLARE @SumMoney AS MONEY			--@�ϼ��շ�

DECLARE @OverNightCharge AS MONEY	--@��ҹ���ս��

--*

--���շѽ��=@StayDays_MONEY+@HOURS_MONEY
DECLARE @EVERYDAY_MONEY AS MONEY
DECLARE @DAYS_MONEY AS MONEY
DECLARE @HOURS_MONEY AS MONEY

---==============================================
declare @HolidayCardType as varchar(10)			--@���տ���
declare @HolidayCalcUnitMinute as int			--@���ռ�ʱ��λ����	
declare @HolidayUnitTimeMoney as money			--@����ÿ��ʱ��λ�շѶ�
declare @HolidayFirstUnitMinute as int			--@�����׼�ʱ��λ����
declare @HolidayFirstUnitMoney as money			--@�����׼�ʱ��λ�շѶ�
declare @HolidayOneDayMaxMoney as money			--@����ÿ������޶�
--===============================================

SELECT @DayMoney = 0
SELECT @NightMoney = 0
SELECT @SumMoney = 0

SELECT @OverNightCharge = 0

SELECT @EVERYDAY_MONEY = 0
SELECT @DAYS_MONEY = 0
SELECT @HOURS_MONEY = 0

declare @TmpInTime as datetime
declare @TmpOutTime as datetime


--*
IF LEFT(@CardType,3)='Mtp'
	BEGIN
		SELECT @CardType=REPLACE(@CardType,'Mtp','Tmp')
	END 
--*
IF LEFT(@CardType,3)<>'Tmp' AND LEFT(@CardType,3)<>'Str'
	BEGIN
		SELECT @OutMoney=0
		RETURN
	END

if @CardType='TmpA'
   set @HolidayCardType='TmpE' 
else if @CardType='TmpB'
   set @HolidayCardType='TmpF' 
else if @CardType='TmpC'
   set @HolidayCardType='TmpG' 


SELECT TOP 1 @ChargeMode3=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=60
SELECT @ChargeMode3=ISNULL(@ChargeMode3,0)

SELECT TOP 1 @TopSF=TopSF FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
SELECT @TopSF=ISNULL(@TopSF,0)

if @ChargeMode3 =1 
begin
	SELECT @OutMoney=@TopSF	
	RETURN
end

SELECT @OutMoney=0

SELECT @StayTotalMinutes=DATEDIFF(MINUTE,@InTime,@OutTime)

print '@StayTotalMinutes:' + convert(varchar,@StayTotalMinutes)


--�������ʱ��
SELECT TOP 1 @FreeMinutes=FreeMinute FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
SELECT @FreeMinutes=ISNULL(@FreeMinutes,0)
IF @StayTotalMinutes<=@FreeMinutes
	BEGIN
		SELECT @OutMoney=0
      print 'Free'
		RETURN
	END

--*
SELECT TOP 1 @FreeTimeNoCharge=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=30  
SELECT @FreeTimeNoCharge=ISNULL(@FreeTimeNoCharge,0)
IF @FreeTimeNoCharge=1											
--  SELECT @OutTime=DATEADD(MINUTE,-@FreeMinutes,@OutTime)		--����ʱ���ȥ��ѷ���				
   SELECT @InTime=DATEADD(MINUTE,@FreeMinutes,@InTime)						
--*

print '@InTime:' + convert(varchar,@InTime,120)
print '@OutTime:' + convert(varchar,@OutTime,120)

set @MINUTES = DATEDIFF(minute,@InTime,@OutTime)


--*
--�����ݿ��ȡ����
SELECT TOP 1 @MakeDayNight=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=40
SELECT @MakeDayNight=ISNULL(@MakeDayNight,0)
SELECT TOP 1 @IDCardSF=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=50
SELECT @IDCardSF=ISNULL(@IDCardSF,0)
SELECT TOP 1 @ChargeMode3=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=60
SELECT @ChargeMode3=ISNULL(@ChargeMode3,0)
SELECT TOP 1 @ChargeMode2=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=70
SELECT @ChargeMode2=ISNULL(@ChargeMode2,0)

SELECT TOP 1 @OverNightCharge=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=80
SELECT @OverNightCharge=ISNULL(@OverNightCharge,0)

SELECT TOP 1 @DayStartHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=31
SELECT @DayStartHour=ISNULL(@DayStartHour,0)

SELECT TOP 1 @NightStartHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=32
SELECT @NightStartHour=ISNULL(@NightStartHour,0)

SELECT TOP 1 @DayStartMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=41
SELECT @DayStartMinute=ISNULL(@DayStartMinute,0)

SELECT TOP 1 @NightStartMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=42
SELECT @NightStartMinute=ISNULL(@NightStartMinute,0)

SELECT TOP 1 @DayCalcUnitHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=51
SELECT @DayCalcUnitHour=ISNULL(@DayCalcUnitHour,0)

SELECT TOP 1 @NightCalcUnitHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=52
SELECT @NightCalcUnitHour=ISNULL(@NightCalcUnitHour,0)

SELECT TOP 1 @DayCalcUnitMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=61
SELECT @DayCalcUnitMinute=ISNULL(@DayCalcUnitMinute,0)

SELECT TOP 1 @NightCalcUnitMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=62
SELECT @NightCalcUnitMinute=ISNULL(@NightCalcUnitMinute,0)

SELECT TOP 1 @DayUnitTimeMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=71
SELECT @DayUnitTimeMoney=ISNULL(@DayUnitTimeMoney,0.00)

SELECT TOP 1 @NightUnitTimeMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=72
SELECT @NightUnitTimeMoney=ISNULL(@NightUnitTimeMoney,0.00)

SELECT TOP 1 @DayMaxMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=81
SELECT @DayMaxMoney=ISNULL(@DayMaxMoney,0.00)

SELECT TOP 1 @NightMaxMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=82
SELECT @NightMaxMoney=ISNULL(@NightMaxMoney,0.00)

SELECT TOP 1 @DayMinMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=91
SELECT @DayMinMoney=ISNULL(@DayMinMoney,0.00)

SELECT TOP 1 @NightMinMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=92
SELECT @NightMinMoney=ISNULL(@NightMinMoney,0.00)

SELECT TOP 1 @DayFirstUnitMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=101
SELECT @DayFirstUnitMoney=ISNULL(@DayFirstUnitMoney,0.00)

SELECT TOP 1 @NightFirstUnitMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=102
SELECT @NightFirstUnitMoney=ISNULL(@NightFirstUnitMoney,0.00)

SELECT TOP 1 @DayFirstUnitHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=111
SELECT @DayFirstUnitHour=ISNULL(@DayFirstUnitHour,0)

SELECT TOP 1 @NightFirstUnitHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=112
SELECT @NightFirstUnitHour=ISNULL(@NightFirstUnitHour,0)

SELECT TOP 1 @DayFirstUnitMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=121
SELECT @DayFirstUnitMinute=ISNULL(@DayFirstUnitMinute,0)

SELECT TOP 1 @NightFirstUnitMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=122
SELECT @NightFirstUnitMinute=ISNULL(@NightFirstUnitMinute,0)


--==��������====================================
SELECT TOP 1 @HolidayOneDayMaxMoney=TopSF FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@HolidayCardType
SELECT @HolidayOneDayMaxMoney=ISNULL(@HolidayOneDayMaxMoney,0)

SELECT TOP 1 @HolidayCalcUnitMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@HolidayCardType AND Hours=61        ---------
SELECT @HolidayCalcUnitMinute=ISNULL(@HolidayCalcUnitMinute,0)

SELECT TOP 1 @HolidayUnitTimeMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@HolidayCardType AND Hours=71                  ---------
SELECT @HolidayUnitTimeMoney=ISNULL(@HolidayUnitTimeMoney,0.00)

SELECT TOP 1 @HolidayFirstUnitMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@HolidayCardType AND Hours=121       -------
SELECT @HolidayFirstUnitMinute=ISNULL(@HolidayFirstUnitMinute,0)

SELECT TOP 1 @HolidayFirstUnitMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@HolidayCardType AND Hours=101                 --------
SELECT @HolidayFirstUnitMoney=ISNULL(@HolidayFirstUnitMoney,0.00)
--=============================================




select @DayFirstUnitMinute = @DayFirstUnitMinute + @DayFirstUnitHour*60
select @NightFirstUnitMinute = @NightFirstUnitMinute + @NightFirstUnitHour*60

SELECT @DayCalcMinute=@DayCalcUnitMinute+@DayCalcUnitHour*60
SELECT @NightCalcMinute=@NightCalcUnitMinute+@NightCalcUnitHour*60

print '@DayCalcMinute:' + convert(varchar,@DayCalcMinute)
print '@NightCalcMinute:' + convert(varchar,@NightCalcMinute)

SELECT @DayStartTime=CONVERT(CHAR(5),CONVERT(DATETIME,CONVERT(VARCHAR(2),@DayStartHour)+':'+CONVERT(VARCHAR(2),@DayStartMinute)),8)
SELECT @NightStartTime=CONVERT(CHAR(5),CONVERT(DATETIME,CONVERT(VARCHAR(2),@NightStartHour)+':'+CONVERT(VARCHAR(2),@NightStartMinute)),8)

print '@DayStartTime:' + convert(varchar,@DayStartTime,120)
print '@NightStartTime:' + convert(varchar,@NightStartTime,120)

-----��Ϊ�ͻ�Ҫ���¿������������������������8��ǰ�뿪�����ʹ�ã�����������8����뿪����ʱ���շѣ�����8��ǰ��Ӧ����������
-----���԰Ѱ��쿪ʼʱ���ҹ�俪ʼʱ�䶼��ȥ8Сʱ����ʱ��α��00:00��12:00,12:00��00:00�������ж����ھͺ�׼��
declare @tmpDayStart as datetime
declare @tmpNightStart as datetime

set @tmpDayStart = '2013-03-20 ' + @DayStartTime    --����ϳ�һ���Ϸ���ʱ��
set @tmpNightStart = '2013-03-20 ' + @NightStartTime

--���ﲻ�ü�ȥ���쿪ʼ����
--set @tmpDayStart = DATEADD(MINUTE,-(@DayStartHour * 60 + @DayStartMinute),convert(datetime,@tmpDayStart))   --�ټ�ȥ���쿪ʼ����
--set @tmpNightStart = DATEADD(MINUTE,-(@DayStartHour * 60 + @DayStartMinute),convert(datetime,@tmpNightStart))

print '@tmpDayStart:' + convert(varchar,@tmpDayStart,120)
print '@tmpNightStart:' + convert(varchar,@tmpNightStart,120)

select @DayStartTime = CONVERT(CHAR(5),@tmpDayStart,8) --substring(convert(varchar,@tmpDayStart,108),1,5)    --ȡ�ұ�5λ
select @NightStartTime = CONVERT(CHAR(5),@tmpNightStart,8) --substring(convert(varchar,@tmpNightStart,108),1,5)

-------------

print '@DayStartTime:' + convert(varchar,@DayStartTime,120)
print '@NightStartTime:' + convert(varchar,@NightStartTime,120)

SELECT @EVERYDAY_DAY_MINUTES=DATEDIFF(MINUTE,@DayStartTime,@NightStartTime) 
SELECT @EVERYDAY_NIGHT_MINUTES=DATEDIFF(MINUTE,'00:00',@DayStartTime)+DATEDIFF(MINUTE,@NightStartTime,CONVERT(CHAR(10),DATEADD(DAY,1,@NightStartTime),120)+' 00:00')

--*

--��׼�շ� ============================================
IF @MakeDayNight=0 and @ChargeMode3=0 and @ChargeMode2=0 
BEGIN

	SELECT @StayDays=DATEDIFF(MINUTE,@InTime,@OutTime)/1440
	SELECT @StayHours=(DATEDIFF(MINUTE,@InTime,@OutTime) % 1440)/60	--ȥ��ͣ���������ͣ��Сʱ��
	IF ((DATEDIFF(MINUTE,@InTime,@OutTime) % 1440) % 60)>0			--����1Сʱ�İ�1Сʱ����
		SELECT @StayHours=@StayHours+1
	
	
	--����ͣ�������������
	
	SELECT TOP 1 @EVERYDAY_MONEY=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=24
	SELECT @EVERYDAY_MONEY=ISNULL(@EVERYDAY_MONEY,0)
	IF @EVERYDAY_MONEY>@TopSF
		SELECT @EVERYDAY_MONEY=@TopSF
	SELECT @DAYS_MONEY=@EVERYDAY_MONEY*@StayDays
	
	--�����ҹ���ս��
   set @OverNightCharge = DATEDIFF(DAY,@InTime,@OutTime) * @OverNightCharge
	
	--����ͣ��Сʱ���������
	SELECT TOP 1 @HOURS_MONEY=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=@StayHours
	SELECT @HOURS_MONEY=ISNULL(@HOURS_MONEY,0)
	IF @HOURS_MONEY>@TopSF
		SELECT @HOURS_MONEY=@TopSF
	--�ϼ�
	--SELECT @OutMoney=@DAYS_MONEY+@HOURS_MONEY
	SELECT @OutMoney=@DAYS_MONEY+@HOURS_MONEY+@OverNightCharge
	--GO
	RETURN
END

--�����շ� =============================================
IF @MakeDayNight=0 and @ChargeMode3=1 and @ChargeMode2=0
BEGIN

	SELECT @OutMoney=@TopSF
	
	RETURN
END

--���趨ʱ���շ� ========================================
IF @MakeDayNight=0 and @ChargeMode3=0 and @ChargeMode2=1 
BEGIN

	SELECT @StayDays=DATEDIFF(MINUTE,@InTime,@OutTime)/1440
	
	SELECT @DayStayMinutes=DATEDIFF(MINUTE,@InTime,@OutTime) % 1440
	
	IF @StayDays=0 
		BEGIN
			IF @DayStayMinutes>@DayFirstUnitMinute
				BEGIN
					SELECT @StayHours=(@DayStayMinutes-@DayFirstUnitMinute)/@DayCalcUnitMinute	--ȥ��ͣ���������ͣ����λ��
					IF ((@DayStayMinutes-@DayFirstUnitMinute) % @DayCalcUnitMinute)>0			--����1����λ�İ�1����λ����
						SELECT @StayHours=@StayHours+1
					SELECT @HOURS_MONEY=@StayHours*@DayUnitTimeMoney+@DayFirstUnitMoney
				
				END
			ELSE
				BEGIN
					SELECT @HOURS_MONEY=@DayFirstUnitMoney
				END
		END 
	ELSE
		BEGIN
			SELECT @StayHours=@DayStayMinutes/@DayCalcUnitMinute	--ȥ��ͣ���������ͣ����λ��
			IF (@DayStayMinutes % @DayCalcUnitMinute)>0			--����1����λ�İ�1����λ����
				SELECT @StayHours=@StayHours+1
			SELECT @HOURS_MONEY=@StayHours*@DayUnitTimeMoney
		END
	
	--����ͣ�������������
	
	--SELECT TOP 1 @EVERYDAY_MONEY=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=24
	--SELECT @EVERYDAY_MONEY=ISNULL(@EVERYDAY_MONEY,0)
	--IF @EVERYDAY_MONEY>@TopSF
	SELECT @EVERYDAY_MONEY=@TopSF
	SELECT @DAYS_MONEY=@EVERYDAY_MONEY*@StayDays

	
	
	
	--����ͣ����λ���������
	
	IF @HOURS_MONEY>@TopSF
		SELECT @HOURS_MONEY=@TopSF
	
	--�ϼ�
	SELECT @OutMoney=@DAYS_MONEY+@HOURS_MONEY
	--GO
	RETURN
END


   -------=================================================================================================
 
   declare @IsAddFirstHourMoney as int  --@�Ƿ�������Сʱ�շ�   0:û�� 1��������Сʱ��
   declare @OutTimePart AS CHAR(5)			--������ʱ�䲿�֣��� 08:30
   declare @Holidays as int				--���˶��ٸ�����
   declare @IsSameDay as datetime		--@�Ƚ�ͬһ��  ���ڼ�����˶����˼���
   declare @N as int   
   
   set @Holidays =0	
   set @IsSameDay = '1900-01-01'
   set @N =0

	--set @InTime = DATEADD(MINUTE,-(@DayStartHour * 60 + @DayStartMinute),@InTime)
	--set @OutTime = DATEADD(MINUTE,-(@DayStartHour * 60 + @DayStartMinute),@OutTime)
   
	--print '�޸ĺ��볡ʱ��:' + convert(varchar,@InTime,120)
   --print '�޸ĺ����ʱ��:' + convert(varchar,@OutTime,120)

	set @IsAddFirstHourMoney = 0
	
	set @TmpOutTime = @InTime
   
   print '@TmpOutTime: ' + convert(varchar,@TmpOutTime,120)

   /*
   SELECT @OutTimePart=CONVERT(CHAR(5),@TmpOutTime,8) --ȡ�볡��ʱ�䲿��         

   if DATEDIFF(MINUTE,@DayStartTime,@OutTimePart)>=0 and DATEDIFF(MINUTE,@NightStartTime,@OutTimePart)<0  --�볡Ϊ����   
   begin
      set @TmpOutTime = dateadd(minute,@DayFirstUnitMinute,@TmpOutTime)
   end
   else
   begin
		set @TmpOutTime = dateadd(minute,@NightFirstUnitMinute,@TmpOutTime)
   end
	print '@TmpOutTime: ' + convert(varchar,@TmpOutTime,120)

   if datediff(minute,@TmpOutTime,@OutTime)<=0
      set @N = @N +1
   */   
   
   declare @HolidayMoney AS money		--@�����շ�
   declare @TempSumMoney AS money		--@����շ�
   declare @IsFirstHour as int			--@�Ƿ�Ϊ��Сʱ
      
   declare @LastPart as varchar(10)		--@��һ����  �ǰ��죬����ҹ��

   set @DayMoney = 0
   set @NightMoney = 0
   set @LastPart = ''
   set @HolidayMoney = 0
	set @TempSumMoney = 0
   set @IsFirstHour = 0

	while @N<1
	begin             
        
        if dbo.IsHoliday(@TmpOutTime) = 0  --������        
        begin
           print '������===================='           
           SELECT @OutTimePart=CONVERT(CHAR(5),@TmpOutTime,8) --ȡʱ�䲿��
		
		     if DATEDIFF(MINUTE,@DayStartTime,@OutTimePart)>=0 and DATEDIFF(MINUTE,@NightStartTime,@OutTimePart)<0  --@TmpOutTimeΪ����
		     begin
		         print '����==='
		
	            if @LastPart = '' or @LastPart ='Night'
	            begin                    
	               set @NightMoney = @NightMoney + @TempSumMoney
	               print '@NightMoney: ' + convert(varchar,@NightMoney)
	               set @TempSumMoney =0               
                  --set @IsAddFirstHourMoney = 0    --ÿ���ηֱ�Ҫ����Сʱ�շ�
	            end
	
		         if @IsAddFirstHourMoney = 0   --û����Сʱ�շ�
		         begin
	          	   print '������Сʱ����'
		            set @TempSumMoney = @TempSumMoney + @DayFirstUnitMoney
		            set @IsAddFirstHourMoney = 1
                  set @IsFirstHour = 1
	               --print '@TempSumMoney: ' + convert(varchar,@TempSumMoney)
		         end
		         else  --������Сʱ�շ�
		         begin
		            print '���չ���Сʱ����'
		            set @TempSumMoney = @TempSumMoney + @DayUnitTimeMoney
                  set @IsFirstHour = 0
		            --print '@TempSumMoney: ' + convert(varchar,@TempSumMoney)
		         end
		         
	            if @TempSumMoney>@DayMaxMoney
	               set @TempSumMoney = @DayMaxMoney
	
	            print '@TempSumMoney: ' + convert(varchar,@TempSumMoney)
	
               if @IsFirstHour = 1 --��Сʱ
                  set @TmpOutTime = dateadd(minute,@DayFirstUnitMinute,@TmpOutTime)
               else
               begin
		            --����ټ��ϰ����ʱ���Ӿͻ�絽ҹ��εĻ����ǾͰ� @TmpOutTime ��ֵΪ ҹ�俪ʼʱ��
				      if DATEDIFF(MINUTE,@NightStartTime,@OutTimePart)<0 and DATEDIFF(MINUTE,@NightStartTime,dateadd(minute,@DayCalcMinute,@OutTimePart))>=0
			             set @TmpOutTime = convert(varchar,@TmpOutTime,23) + ' ' + @NightStartTime                     
			         else
				          set @TmpOutTime = dateadd(minute,@DayCalcMinute,@TmpOutTime)
	            end
	 	         print '@TmpOutTime: ' + convert(varchar,@TmpOutTime,120)                 
	                 
	            set @LastPart = 'Day'	--@��һ�����ǰ���           
	            
		      end      
	         else  ----@TmpOutTimeΪ ҹ��----------------------------------------------------------
		      begin
		         print 'ҹ��==='
	
	            if @LastPart = '' or @LastPart ='Day'  --@��һ�����ǰ��� 
	            begin
	               set @DayMoney = @DayMoney + @TempSumMoney
	               set @TempSumMoney =0		              
	               --set @IsAddFirstHourMoney = 0    --ÿ���ηֱ�Ҫ����Сʱ�շ�
						print '@DayMoney: ' + convert(varchar,@DayMoney)
	            end
               else if @LastPart = 'Holiday'  --����
               begin
                  set @HolidayMoney = @HolidayMoney + @TempSumMoney
	               set @TempSumMoney =0		              
	               --set @IsAddFirstHourMoney = 0    --ÿ���ηֱ�Ҫ����Сʱ�շ�
						print '@HolidayMoney: ' + convert(varchar,@HolidayMoney)
               end
	
	            if @IsAddFirstHourMoney = 0   --û����Сʱ�շ�
			 		begin
	               print '������Сʱ����'
		            set @TempSumMoney = @TempSumMoney + @NightFirstUnitMoney
		            set @IsAddFirstHourMoney = 1
                  set @IsFirstHour = 1
	               --print '@TempSumMoney: ' + convert(varchar,@TempSumMoney)
			      end
		         else  --������Сʱ�շ�
				   begin
				      print '���չ���Сʱ����'
	               set @TempSumMoney = @TempSumMoney + @NightUnitTimeMoney
                  set @IsFirstHour = 0
	               --print '@TempSumMoney: ' + convert(varchar,@TempSumMoney)
				   end	 
	
	            if @TempSumMoney>@NightMaxMoney
	                set @TempSumMoney = @NightMaxMoney
	
	  	         print '@TempSumMoney: ' + convert(varchar,@TempSumMoney)
	
               if @IsFirstHour = 1 --��Сʱ
                  set @TmpOutTime = dateadd(minute,@NightFirstUnitMinute,@TmpOutTime)
               else  --������Сʱ
               begin
	               if dbo.IsHoliday(dateadd(minute,@NightCalcMinute,@TmpOutTime)) = 1  --�������ѭ��ʱ������˼��գ���Ӽ���0�㿪ʼ�ۼ�
	               begin
	                  set @TmpOutTime = dateadd(day,1,@TmpOutTime)
	                  set @TmpOutTime = convert(varchar,@TmpOutTime,23) + ' 00:00:00'
	               end               
	               else
	               begin
			            --����ټ���ҹ���ʱ���Ӿͻ�絽����εĻ����ǾͰ� @TmpOutTime ��ֵΪ ���쿪ʼʱ��
					      if DATEDIFF(MINUTE,@DayStartTime,@OutTimePart)<0 and DATEDIFF(MINUTE,@DayStartTime,dateadd(minute,@NightCalcMinute,@OutTimePart))>=0            
					         set @TmpOutTime = convert(varchar,@TmpOutTime,23) + ' ' + @DayStartTime
				         else
				            set @TmpOutTime = dateadd(minute,@NightCalcMinute,@TmpOutTime)
		            end
		         end
               print '@TmpOutTime: ' + convert(varchar,@TmpOutTime,120)                 
	
	            set @LastPart = 'Night'
		      end   
         end   -- ������END
         else  -----------------------���� -------------------------------------------------------------------------------
         begin
            print '����====================='
            if datediff(DAY,@IsSameDay,@TmpOutTime)> 0   --�Ƚ��Ƿ�ͬһ��,������ǣ������+1
	         begin
	            set @Holidays = @Holidays + 1
	            set @IsSameDay = @TmpOutTime
	            print '@Holidays: ' + convert(varchar,@Holidays)
	         end


            if @LastPart = '' or @LastPart ='Night'    --��һ����Ҫôû�У�Ҫô�϶���ҹ��
            begin                    
               set @NightMoney = @NightMoney + @TempSumMoney
               print '@NightMoney: ' + convert(varchar,@NightMoney)
               set @TempSumMoney =0               
               --set @IsAddFirstHourMoney = 0    --ÿ���ηֱ�Ҫ����Сʱ�շ�
            end

	         if @IsAddFirstHourMoney = 0   --û����Сʱ�շ�
	         begin
          	   print '������Сʱ����'
	            set @TempSumMoney = @TempSumMoney + @HolidayFirstUnitMoney
	            set @IsAddFirstHourMoney = 1
               set @IsFirstHour = 1
               --print '@TempSumMoney: ' + convert(varchar,@TempSumMoney)
	         end
	         else  --������Сʱ�շ�
	         begin
	            print '���չ���Сʱ����'
	            set @TempSumMoney = @TempSumMoney + @HolidayUnitTimeMoney
               set @IsFirstHour = 0
	            --print '@TempSumMoney: ' + convert(varchar,@TempSumMoney)
	         end
            
				print '@TempSumMoney: ' + convert(varchar,@TempSumMoney)

				if @IsFirstHour = 1 --��Сʱ
               set @TmpOutTime = dateadd(minute,@HolidayFirstUnitMinute,@TmpOutTime)
            else  --������Сʱ
            begin
               if dbo.IsHoliday(dateadd(minute,@HolidayCalcUnitMinute,@TmpOutTime)) = 0  --�������ѭ��ʱ������˹����գ���ӹ�����0�㿪ʼ�ۼ�
               begin
                  set @TmpOutTime = dateadd(day,1,@TmpOutTime)
                  set @TmpOutTime = convert(varchar,@TmpOutTime,23) + ' 00:00:00'
               end
               else
               begin
                  set @TmpOutTime = dateadd(minute,@HolidayCalcUnitMinute,@TmpOutTime)
               end
            end
            print '@TmpOutTime: ' + convert(varchar,@TmpOutTime,120)  

            set @LastPart = 'Holiday'
         end
  
         --�˳�ѭ��
	      if datediff(minute,@TmpOutTime,@OutTime)<=0
            break
	
	      print '  '
	end  --while

	/*
   set @TmpOutTime = @InTime
   while datediff(DAY,@TmpOutTime,@OutTime)>=0   --�볡ʱ�� < ����ʱ��
   begin
      if dbo.IsHoliday(@TmpOutTime) = 1  --����
	   begin
			set @Holidays = @Holidays + 1
      end
      set @TmpOutTime = dateadd(DAY,1,@TmpOutTime)
   end
   */

   --print '@Holidays:' + convert(varchar,@Holidays)

   /*
   if @MINUTES % 1440 > 0
      set @DAYS = @MINUTES / 1440 +1
   else
      set @DAYS = @MINUTES / 1440  

   print '@DAYS:' + convert(varchar,@DAYS)
   
   --ÿ�����Ƿ����ÿ������շ�
        
	if @DayMoney > @DayMaxMoney * @DAYS
	   set @DayMoney = @DayMaxMoney * @DAYS
	
	if @NightMoney > @NightMaxMoney * @DAYS
	  set @NightMoney = @NightMaxMoney * @DAYS*/

   SELECT @OutTimePart=CONVERT(CHAR(5),@OutTime,8) --ȡ������ʱ�䲿��
	
   if dbo.IsHoliday(@OutTime) = 0  --������
   begin
      if @OutTimePart = '00:00'    --����ʱ�����ÿ�0��,��˵��֮ǰ@TempSumMoney����Ǽ����շ�
         set @HolidayMoney = @HolidayMoney + @TempSumMoney
      else if DATEDIFF(MINUTE,@DayStartTime,@OutTimePart)=0   --�������ʱ������Ϊ���쿪ʼʱ��(08:00),��˵��֮ǰ@TempSumMoney�����ҹ���շ�
         set @NightMoney = @NightMoney + @TempSumMoney
      else if DATEDIFF(MINUTE,@NightStartTime,@OutTimePart)=0   --�������ʱ������Ϊҹ�俪ʼʱ��(20:00),��˵��֮ǰ@TempSumMoney����ǰ����շ�
         set @DayMoney = @DayMoney + @TempSumMoney
	   else if DATEDIFF(MINUTE,@DayStartTime,@OutTimePart)>0 and DATEDIFF(MINUTE,@NightStartTime,@OutTimePart)<0  --����Ϊ����
	      set @DayMoney = @DayMoney + @TempSumMoney
	   else
	      set @NightMoney = @NightMoney + @TempSumMoney
   end
   else   --����
   begin
      if @OutTimePart = '00:00'    --����ʱ�����ÿ�0��,��˵��֮ǰ@TempSumMoney�����ҹ���շ�
         set @NightMoney = @NightMoney + @TempSumMoney
      else
         set @HolidayMoney = @HolidayMoney + @TempSumMoney
   end

   if @HolidayMoney > @HolidayOneDayMaxMoney * @Holidays
	   set @HolidayMoney = @HolidayOneDayMaxMoney * @Holidays


	set @OutMoney = @DayMoney + @NightMoney + @HolidayMoney
	
	--�Ƿ�������շѶ�
	--if @OutMoney > @TopSF * @DAYS
	   --set @OutMoney = @TopSF * @DAYS
	print ''
	print '@DayMoney: ' + convert(varchar,@DayMoney)
	print '@NightMoney: ' + convert(varchar,@NightMoney)
    print '@HolidayMoney: ' + convert(varchar,@HolidayMoney)
	print '�����շѽ��: ' + convert(varchar,@OutMoney)

   return
   
GO


SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[[MYOffLine]]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYOffLine](
	[CardNO] [nvarchar](50) NOT NULL,
	[CPHCardNO] [nvarchar](50) NULL,
	[DownLoadTime] [datetime] NULL,
	[State] [int] NULL
) ON [PRIMARY]
END
GO
/****** Object:  Table [dbo].[MYAutoTempDownLoad]    Script Date: 03/18/2015 14:44:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
if NOT exists (select * from sysobjects where id = OBJECT_ID('[MYAutoTempDownLoad]') and OBJECTPROPERTY(id, N'IsUserTable') = 1) 
BEGIN
CREATE TABLE [dbo].[MYAutoTempDownLoad](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[CPH] [nvarchar](50) NULL,
	[InTime] [datetime] NULL,
	[DownloadSignal] [nvarchar](50) NULL,
	[InOut] [int] NULL,
 CONSTRAINT [PK_MYAutoTempDownLoad] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
if NOT exists (select * from sysobjects where id = OBJECT_ID('[MYBlacklist]') and OBJECTPROPERTY(id, N'IsUserTable') = 1) 
BEGIN
CREATE TABLE [dbo].[MYBlacklist](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[CPH] [nvarchar](50) NOT NULL,
	[StartTime] [datetime] NOT NULL,
	[EndTime] [datetime] NOT NULL,
	[Reason] [nvarchar](500) NOT NULL,
	[DownloadSignal] [nvarchar](50) NOT NULL,
	[AddDelete] [int] NOT NULL,
 CONSTRAINT [PK_MYBlacklist] PRIMARY KEY NONCLUSTERED 
(
	[ID] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
if NOT EXISTS (select * from   syscolumns where name='CPHDownloadSignal' and id=(select id from  sysobjects where name='MYFAXINGSSUE')) 
BEGIN
ALTER TABLE MYFAXINGSSUE ADD CPHDownloadSignal varchar(50)  NULL DEFAULT ('00000000000000000000000000000000000000000000000000')
END
GO
if NOT EXISTS (select * from   syscolumns where name='Res1' and id=(select id from  sysobjects where name='MYFAXINGSSUE')) 
BEGIN
ALTER TABLE MYFAXINGSSUE ADD Res1 varchar(50)
END
GO
if NOT EXISTS (select * from   syscolumns where name='Res2' and id=(select id from  sysobjects where name='MYFAXINGSSUE')) 
BEGIN
ALTER TABLE MYFAXINGSSUE ADD Res2 varchar(50)
END
GO
if NOT EXISTS (select * from   syscolumns where name='Res2' and id=(select id from  sysobjects where name='MYFAXINGSSUE')) 
BEGIN
ALTER TABLE MYFAXINGSSUE ADD Res3 varchar(50)
END
GO
/****** Object:  Table [dbo].[MYZBPARKSet]    Script Date: 07/24/2015 17:12:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYZBPARKSet]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYZBPARKSet](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Address] [varchar](256) NULL,
	[Favorable] [money] NULL,
	[Manner] [varchar](50) NULL,
	[OutHour] [money] NULL,
	[OutDayNo] [money] NULL,
	[PCName] [varchar](50) NULL,
 CONSTRAINT [PK_MYZBPARKSet] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[MYZBPARKAutoCPH]    Script Date: 07/24/2015 17:12:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYZBPARKAutoCPH]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYZBPARKAutoCPH](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[CPH] [varchar](50) NOT NULL,
	[Address] [varchar](256) NULL,
	[Favorable] [money] NULL,
	[Manner] [varchar](50) NULL,
	[OutHour] [money] NULL,
	[OutDayNo] [money] NULL,
	[Enable] [bit] NULL,
	[PCName] [varchar](50) NULL,
	[OptTime] [datetime] NULL,
 CONSTRAINT [PK_MYZBPARKAutoCPH] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[AutoCPH]    Script Date: 09/18/2015 16:38:23 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[AutoCPH]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[AutoCPH](
	[CPH] [nvarchar](50) NOT NULL
) ON [PRIMARY]
END
GO



/****** Object:  StoredProcedure [dbo].[JJCGETMONEYBEIJING]    Script Date: 10/23/2015 12:09:14 ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER OFF
GO

ALTER    PROCEDURE [dbo].[JJCGETMONEYBEIJING]
@CardType VARCHAR(10),
@InTime DATETIME,
@OutTime DATETIME,
@OutMoney MONEY OUTPUT
 AS
DECLARE @MINUTES AS INT
DECLARE @DAYS AS INT
DECLARE @TEMP_IN AS DATETIME

DECLARE @IN AS CHAR(5)
DECLARE @OUT AS CHAR(5)

DECLARE @SAME_DAY AS CHAR(5)
DECLARE @SAME_NIGHT AS CHAR(5)
DECLARE @TEMP_DAY1 AS VARCHAR(20)
DECLARE @TEMP_NIGHT1 AS VARCHAR(20)
DECLARE @TEMP_DAY2 AS VARCHAR(20)
DECLARE @TEMP_NIGHT2 AS VARCHAR(20)
DECLARE @DayStayMinutes INT						--����ͣ������				
DECLARE @NightStayMinutes INT					--ҹ��ͣ������
DECLARE @ToAddMinutes INT						--�������
DECLARE @FreeTimeNoPay AS INT					--���ʱ�䲻�Ʒ�
DECLARE @DayMoney AS MONEY						--�����շ�
DECLARE @NightMoney AS MONEY					--ҹ���շ�
DECLARE @SumMoney AS MONEY						--�ϼ��շ�
DECLARE @FreeMinute AS INT						--��ѷ���
DECLARE @DayMaxMoney AS MONEY					--ÿ��TopSF��
DECLARE @DayStartHour AS INT					--���쿪ʼHours
DECLARE @DayStartMinute AS INT					--���쿪ʼ����
DECLARE @NightStartHour AS INT					--ҹ�俪ʼHours
DECLARE @NightStartMinute AS INT				--ҹ�俪ʼ����
DECLARE @DayUnitTimeMoney AS MONEY				--����ÿ��ʱ��λ�շѶ�
DECLARE @NightUnitTimeMoney AS MONEY
DECLARE @NightCalcUnit AS MONEY					--ҹ���ʱ��λ
DECLARE @NightCalcMinute AS INT					--ҹ���ʱ����		
DECLARE @DayCalcMinute AS INT					--�����ʱ����
DECLARE @DayStartTime AS CHAR(5)					--���쿪ʼʱ��
DECLARE @NightStartTime AS CHAR(5)					--ҹ�俪ʼʱ��


SELECT @MINUTES=DATEDIFF(MINUTE,@InTime,@OutTime)
--�������ʱ��
SELECT TOP 1 @FreeMinute=FreeMinute FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
SELECT @FreeMinute=ISNULL(@FreeMinute,0)
IF @MINUTES<=@FreeMinute
	BEGIN
		SELECT @OutMoney=0
		RETURN
	END
--*

SELECT TOP 1 @FreeTimeNoPay=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=30  
SELECT @FreeTimeNoPay=ISNULL(@FreeTimeNoPay,0)
IF @FreeTimeNoPay=1											
SELECT @InTime=DATEADD(MINUTE,@FreeMinute,@InTime)						
--*

--����ÿ��TopSF��
SELECT TOP 1 @DayMaxMoney=TopSF FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType
SELECT @DayMaxMoney=ISNULL(@DayMaxMoney,0.00)
--�����ݿ��ȡ����
SELECT TOP 1 @DayStartHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=1
SELECT @DayStartHour=ISNULL(@DayStartHour,0)
SELECT TOP 1 @DayStartMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=2
SELECT @DayStartMinute=ISNULL(@DayStartMinute,0)
SELECT TOP 1 @NightStartHour=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=3
SELECT @NightStartHour=ISNULL(@NightStartHour,0)
SELECT TOP 1 @NightStartMinute=CONVERT(INT,JE) FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=4
SELECT @NightStartMinute=ISNULL(@NightStartMinute,0)
SELECT TOP 1 @DayUnitTimeMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=5
SELECT @DayUnitTimeMoney=ISNULL(@DayUnitTimeMoney,0.00)
--SELECT @DayUnitTimeMoney=@DayUnitTimeMoney/10
SELECT TOP 1 @NightUnitTimeMoney=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=6
SELECT @NightUnitTimeMoney=ISNULL(@NightUnitTimeMoney,0.00)
--SELECT @NightUnitTimeMoney=@NightUnitTimeMoney/10
SELECT TOP 1 @NightCalcMinute=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=7
SELECT @NightCalcMinute=ISNULL(@NightCalcMinute,0.00)
SELECT TOP 1 @DayCalcMinute=JE FROM MYCHECHANGNORMALSHOUFEI WHERE CardType=@CardType AND Hours=8
SELECT @DayCalcMinute=ISNULL(@DayCalcMinute,0.00)

SELECT @DayStartTime=CONVERT(CHAR(5),CONVERT(DATETIME,CONVERT(VARCHAR(2),@DayStartHour)+':'+CONVERT(VARCHAR(2),@DayStartMinute)),8)
SELECT @NightStartTime=CONVERT(CHAR(5),CONVERT(DATETIME,CONVERT(VARCHAR(2),@NightStartHour)+':'+CONVERT(VARCHAR(2),@NightStartMinute)),8)

print '@InTime:' + convert(varchar,@InTime,120)
print '@OutTime:' + convert(varchar,@OutTime,120)	

print '@DayStartTime:' + convert(varchar,@DayStartTime,120)
print '@NightStartTime:' + convert(varchar,@NightStartTime,120)


   declare @TmpInTime as datetime
   declare @InTimePart AS CHAR(5)  --�볡��ʱ�䲿�֣��� 08:30
   declare @OutTimePart AS CHAR(5)  --������ʱ�䲿�֣��� 08:30

   declare @N as int      

   set @N =0	

	SELECT @DAYS=DATEDIFF(MINUTE,@InTime,@OutTime)/1440
	SELECT @MINUTES=DATEDIFF(MINUTE,@InTime,@OutTime) % 1440   	--ȥ��ͣ���������ͣ��������
	
	
	if @DAYS = 0
	begin
	   SELECT @InTimePart=CONVERT(CHAR(5),@InTime,8) --ȡ�볡��ʱ�䲿�� 
	   SELECT @OutTimePart=CONVERT(CHAR(5),@OutTime,8) --ȡ������ʱ�䲿��
	   
	   --@MINUTES<=@DayCalcMinute���Ұ���絽ҹ�䣬�򰴰�����շ�
	   if @MINUTES<=@DayCalcMinute and (DATEDIFF(MINUTE,@DayStartTime,@InTimePart)>=0 and DATEDIFF(MINUTE,@NightStartTime,@InTimePart)<0) and DATEDIFF(MINUTE,@NightStartTime,@OutTimePart)>0
	   begin
		  set @OutMoney = @DayUnitTimeMoney
		  print '1111�����շѽ��: ' + convert(varchar,@OutMoney)
		  return
	   end
	   
	   --@MINUTES<=@NightCalcMinute����ҹ��絽���죬��ҹ����շ�
	   if @MINUTES<=@NightCalcMinute and (DATEDIFF(MINUTE,@DayStartTime,@InTimePart)<0 and DATEDIFF(MINUTE,@DayStartTime,@OutTimePart)>=0)
	   begin
		  set @OutMoney = @NightUnitTimeMoney
		  print '2222�����շѽ��: ' + convert(varchar,@OutMoney)
		  return
	   end	
	end
		
	
	
   --2015-10-16
   if @DAYS>0
   begin

      if @MINUTES = 0  --����������
      begin
		 set @OutMoney = @DAYS * @DayMaxMoney
		 return
      end

		set @InTime = DATEADD(day,@DAYS,@InTime)
   end

	--set @InTime = DATEADD(MINUTE,-(@���쿪ʼСʱ * 60 + @���쿪ʼ����),@InTime)
	--set @OutTime = DATEADD(MINUTE,-(@���쿪ʼСʱ * 60 + @���쿪ʼ����),@OutTime)
   
	
	set @TmpInTime = @InTime   
   print '@TmpInTime: ' + convert(varchar,@TmpInTime,120)

     

   declare @����շ� AS money      
   declare @��һ���� as varchar(10)
   
   set @DayMoney = 0
   set @NightMoney = 0
   set @��һ���� = ''
	set @����շ�=0        

	while @N<1
	begin  

        SELECT @InTimePart=CONVERT(CHAR(5),@TmpInTime,8) --ȡ�볡��ʱ�䲿��
		
	     if DATEDIFF(MINUTE,@DayStartTime,@InTimePart)>=0 and DATEDIFF(MINUTE,@NightStartTime,@InTimePart)<0  --�볡Ϊ����
	      begin
	         print '����==='
            
            if @��һ���� = '' or @��һ���� ='ҹ��'
            begin
               --set @������ʱ�� = 0
               set @NightMoney = @NightMoney + @����շ�
               print '@NightMoney: ' + convert(varchar,@NightMoney)
               set @����շ� =0 
            end

            
            --����ټ��� @DayCalcMinute �ͻ�絽ҹ��εĻ����ǾͰ� @TmpInTime ��ֵΪ ҹ�俪ʼʱ��
		      if DATEDIFF(MINUTE,@NightStartTime,@InTimePart)<0 and DATEDIFF(MINUTE,@NightStartTime,dateadd(minute,@DayCalcMinute,@InTimePart))>=0
	         begin
	             set @TmpInTime = convert(varchar,@TmpInTime,23) + ' ' + @NightStartTime                     
	         end
	         else
             begin                   
	             set @TmpInTime = dateadd(minute,@DayCalcMinute,@TmpInTime)                
             end            
            
	         print '@TmpInTime: ' + convert(varchar,@TmpInTime,120)				

             set @����շ� = @����շ� + @DayUnitTimeMoney	            
            
             print '@����շ�: ' + convert(varchar,@����շ�)     

             set @��һ���� = '����'    
            
	      end      
         else  ----�볡Ϊҹ��------------------------------------------------------------------------
	      begin
	         print 'ҹ��==='

			 if @��һ���� = '' or @��һ���� ='����'
             begin
                set @DayMoney = @DayMoney + @����շ�
                set @����շ� =0		
                --set @�Ƿ�������Сʱ�շ� =0
                print '@DayMoney: ' + convert(varchar,@DayMoney)
             end

            
             --����ټ��� @NightCalcMinute �ͻ�絽����εĻ����ǾͰ� @TmpOutTime ��ֵΪ ���쿪ʼʱ��
		     if DATEDIFF(MINUTE,@DayStartTime,@InTimePart)<0 and DATEDIFF(MINUTE,@DayStartTime,dateadd(minute,@NightCalcMinute,@InTimePart))>=0
	         begin               
		         set @TmpInTime = convert(varchar,@TmpInTime,23) + ' ' + @DayStartTime
	         end
	         else
             begin
	            set @TmpInTime = dateadd(minute,@NightCalcMinute,@TmpInTime)
             end            
            
	         print '@TmpInTime: ' + convert(varchar,@TmpInTime,120)    
	
             set @����շ� = @����շ� + @NightUnitTimeMoney
			   
  	         print '@����շ�: ' + convert(varchar,@����շ�)
            
             set @��һ���� = 'ҹ��'
	      end   
    
         --�˳�ѭ��
	      if datediff(minute,@TmpInTime,@OutTime)<=0
          begin
             print '�˳�ѭ��'
             break
	      end
	      print '  '
	end  --while



   SELECT @InTimePart=CONVERT(CHAR(5),@OutTime,8) --ȡ������ʱ�䲿��
	
   if DATEDIFF(MINUTE,@DayStartTime,@InTimePart)>=0 and DATEDIFF(MINUTE,@NightStartTime,@InTimePart)<0  --����Ϊ����
      set @DayMoney = @DayMoney + @����շ�
   else
      set @NightMoney = @NightMoney + @����շ�


	set @OutMoney = @DayMoney + @NightMoney

	if @OutMoney > @DayMaxMoney
      set @OutMoney = @DayMaxMoney	
	
	set @OutMoney = @OutMoney + @DAYS * @DayMaxMoney

   print ''
	print '@DayMoney: ' + convert(varchar,@DayMoney)
	print '@NightMoney: ' + convert(varchar,@NightMoney)
	print '�����շѽ��: ' + convert(varchar,@OutMoney)

   return
GO

if NOT EXISTS (select * from   syscolumns where name='Pattern' and id=(select id from  sysobjects where name='MYSurplusCarScreen')) 
BEGIN
	ALTER TABLE MYSurplusCarScreen ADD Pattern varchar(50)
END
GO

if NOT EXISTS (select * from   syscolumns where name='Helpflag' and id=(select id from  sysobjects where name='MYWORKSTATIONSET')) 
alter table MYWORKSTATIONSET add  [Helpflag]  bit  default  1;
GO
if NOT EXISTS (select * from   syscolumns where name='AutotoCheMointor' and id=(select id from  sysobjects where name='MYWORKSTATIONSET')) 
alter table MYWORKSTATIONSET add  [AutotoCheMointor]  bit  default  0;
GO
if NOT EXISTS (select * from   syscolumns where name='bMonthFdSf' and id=(select id from  sysobjects where name='MYCHECHANGXITONGSET')) 
alter table MYCHECHANGXITONGSET add  bMonthFdSf  int  default  0;
GO
if NOT EXISTS (select * from   syscolumns where name='FsectorEnable' and id=(select id from  sysobjects where name='MYWORKSTATIONSET')) 
alter table MYWORKSTATIONSET add  FsectorEnable  bit  default  0;
GO
if NOT EXISTS (select * from   syscolumns where name='DoorfZone' and id=(select id from  sysobjects where name='MYWORKSTATIONSET')) 
alter table MYWORKSTATIONSET add  DoorfZone  int  default  8;
GO



EXEC dbo.sp_executesql @statement = N'Alter VIEW [dbo].[VMYFAXINGSSUEType]
AS
SELECT     dbo.MYCardType.CardType AS CarCardType, dbo.MYFAXINGSSUE.UserNO, dbo.MYFAXINGSSUE.CardState, dbo.MYFAXINGSSUE.CardYJ, 
                      dbo.MYFAXINGSSUE.SubSystem, dbo.MYFAXINGSSUE.CarIssueDate, dbo.MYFAXINGSSUE.CarIssueUserCard, dbo.MYFAXINGSSUE.Balance, 
                      dbo.MYFAXINGSSUE.CardNO, dbo.MYFAXINGSSUE.CarValidStartDate, dbo.MYFAXINGSSUE.CarValidEndDate, dbo.MYFAXINGSSUE.CPH, 
                      dbo.MYFAXINGSSUE.CarColor, dbo.MYFAXINGSSUE.CarType, dbo.MYFAXINGSSUE.CarPlace, dbo.MYFAXINGSSUE.CarWithdrawCardDate, 
                      dbo.MYFAXINGSSUE.CarWithdrawOptCard, dbo.MYFAXINGSSUE.CarValidMachine, dbo.MYFAXINGSSUE.CarValidZone, dbo.MYFAXINGSSUE.CarMemo,
                       dbo.MYFAXINGSSUE.MJCardType, dbo.MYFAXINGSSUE.MJIssueDate, dbo.MYFAXINGSSUE.MJIssueUserCard, dbo.MYFAXINGSSUE.MJEndDate, 
                      dbo.MYFAXINGSSUE.MJValidStartTime, dbo.MYFAXINGSSUE.MJValidEndTime, dbo.MYFAXINGSSUE.MJValidMachine, 
                      dbo.MYFAXINGSSUE.MJWithdrawCardDate, dbo.MYFAXINGSSUE.MJWithdrawOptCard, dbo.MYFAXINGSSUE.MJMemo, 
                      dbo.MYFAXINGSSUE.IssueDate, dbo.MYFAXINGSSUE.WithdrawDate, dbo.MYFAXINGSSUE.IssueUserCard, dbo.MYFAXINGSSUE.WithdrawUserCard, 
                      dbo.MYFAXINGSSUE.LossregDate, dbo.MYFAXINGSSUE.LossregUserCard, dbo.MYFAXINGSSUE.CardIDNO, dbo.MYFAXINGSSUE.DownloadSignal, 
                      dbo.MYFAXINGSSUE.CarPic, dbo.MYFAXINGSSUE.CarPhoto, dbo.MYFAXINGSSUE.ID, dbo.MYFAXINGSSUE.CarCardType AS CardType, 
                      dbo.MYFAXINGSSUE.Tempnumber, dbo.MYFAXINGSSUE.TimeTeam, dbo.MYFAXINGSSUE.HolidayLimited, dbo.MYFAXINGSSUE.UserInfo, dbo.MYFAXINGSSUE.MonthType, dbo.MYFAXINGSSUE.CPHDownloadSignal
FROM         dbo.MYCardType INNER JOIN
                      dbo.MYFAXINGSSUE ON dbo.MYCardType.Identifying = dbo.MYFAXINGSSUE.CarCardType
'
GO


--2015-11-20 ����CARQUERYNOWS_FX����ѯ���б�ĳ��ƺţ���Ϊ3�ֿ���һ���ѯ
if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[CARQUERYNOWS_FX]') and OBJECTPROPERTY(id, N'IsProcedure') = 1)
drop procedure [dbo].[CARQUERYNOWS_FX]
GO

CREATE    PROCEDURE CARQUERYNOWS_FX
       @INCARPLATES  VARCHAR(15),
       @CPPRECISION  INT,
       @FORTIAOJIAN01  VARCHAR(10),  
       @FORTIAOJIAN02  VARCHAR(10),
       @FORTIAOJIAN03  VARCHAR(10)    
AS 
IF (@CPPRECISION<4 OR @CPPRECISION>6)
IF (@CPPRECISION<4 OR @CPPRECISION>6)
    BEGIN
        SET @CPPRECISION=4
     END
IF @CPPRECISION=4
   BEGIN
	SELECT CardNO,CarCardType,CPH,CarType,CarColor,CarValidEndDate FROM MYFAXINGSSUE WHERE 
       ((SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	
	(SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1))) AND
                  (LEFT(CarCardType,3)=@FORTIAOJIAN01 OR LEFT(CarCardType,3)=@FORTIAOJIAN02 OR LEFT(CarCardType,3)=@FORTIAOJIAN03) AND CardState='0' AND LTRIM(CPH)<>'' AND CPH IS NOT NULL
   END 
IF @CPPRECISION=5
   BEGIN
	SELECT CardNO,CarCardType,CPH,CarType,CarColor,CarValidEndDate  FROM MYFAXINGSSUE WHERE                
       ((SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 	
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR         
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1))) AND 
                  (LEFT(CarCardType,3)=@FORTIAOJIAN01 OR LEFT(CarCardType,3)=@FORTIAOJIAN02 OR LEFT(CarCardType,3)=@FORTIAOJIAN03) AND CardState='0' AND LTRIM(CPH)<>'' AND CPH IS NOT NULL
        
   END 
IF @CPPRECISION=6
   BEGIN
	SELECT CardNO,CarCardType,CPH,CarType,CarColor,CarValidEndDate  FROM MYFAXINGSSUE WHERE 
	SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) 
    AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1) AND 
                 (LEFT(CarCardType,3)=@FORTIAOJIAN01 OR LEFT(CarCardType,3)=@FORTIAOJIAN02 OR LEFT(CarCardType,3)=@FORTIAOJIAN03) AND CardState='0' AND LTRIM(CPH)<>'' AND CPH IS NOT NULL
   END 
GO


--2015-11-21
if NOT EXISTS (select * from   syscolumns where name='ImageAutoDel' and id=(select id from  sysobjects where name='MYCHECHANGXITONGSET')) 
alter table MYCHECHANGXITONGSET add  ImageAutoDel  int not null default  0;
GO

if NOT EXISTS (select * from   syscolumns where name='ImageAutoDelTime' and id=(select id from  sysobjects where name='MYCHECHANGXITONGSET')) 
alter table MYCHECHANGXITONGSET add  ImageAutoDelTime  int not null default  1;
GO

--2015-12-08 MYWORKSTATIONSET �� ����APP����ͣ���ֶ�
if NOT EXISTS (select * from   syscolumns where name='AppEnable' and id=(select id from  sysobjects where name='MYWORKSTATIONSET')) 
alter table MYWORKSTATIONSET add  AppEnable  bit null default  0;
GO
--2016-01-20 MYWORKSTATIONSET 
if NOT EXISTS (select * from   syscolumns where name='TXXieYi' and id=(select id from  sysobjects where name='MYWORKSTATIONSET')) 
alter table MYWORKSTATIONSET add  TXXieYi  varchar(50) null default  0;
GO
if NOT EXISTS (select * from   syscolumns where name='SystemModel' and id=(select id from  sysobjects where name='MYWORKSTATIONSET')) 
alter table MYWORKSTATIONSET add  SystemModel  bit null default  0;
GO
if NOT EXISTS (select * from   syscolumns where name='TraditionReport' and id=(select id from  sysobjects where name='MYWORKSTATIONSET')) 
alter table MYWORKSTATIONSET add  TraditionReport  bit null default  0;
GO
if NOT EXISTS (select * from   syscolumns where name='Res1' and id=(select id from  sysobjects where name='MYWORKSTATIONSET')) 
alter table MYWORKSTATIONSET add  Res1  varchar(50) null default  0;
GO
if NOT EXISTS (select * from   syscolumns where name='Res2' and id=(select id from  sysobjects where name='MYWORKSTATIONSET')) 
alter table MYWORKSTATIONSET add  Res2  varchar(50) null default  0;
GO
if NOT EXISTS (select * from   syscolumns where name='Res3' and id=(select id from  sysobjects where name='MYWORKSTATIONSET')) 
alter table MYWORKSTATIONSET add  Res3  varchar(50) null default  0;
GO
--2015-12-18  ��������Ĭ�����30��
delete from MYZBPARK
GO
insert into MYZBPARK(CtrlNumber,Location) values (1,1)
GO
insert into MYZBPARK(CtrlNumber,Location) values (2,2)
GO
insert into MYZBPARK(CtrlNumber,Location) values (3,3)
GO
insert into MYZBPARK(CtrlNumber,Location) values (4,4)
GO
insert into MYZBPARK(CtrlNumber,Location) values (5,5)
GO
insert into MYZBPARK(CtrlNumber,Location) values (6,6)
GO
insert into MYZBPARK(CtrlNumber,Location) values (7,7)
GO
insert into MYZBPARK(CtrlNumber,Location) values (8,8)
GO
insert into MYZBPARK(CtrlNumber,Location) values (9,9)
GO
insert into MYZBPARK(CtrlNumber,Location) values (10,10)
GO
insert into MYZBPARK(CtrlNumber,Location) values (11,11)
GO
insert into MYZBPARK(CtrlNumber,Location) values (12,12)
GO
insert into MYZBPARK(CtrlNumber,Location) values (13,13)
GO
insert into MYZBPARK(CtrlNumber,Location) values (14,14)
GO
insert into MYZBPARK(CtrlNumber,Location) values (15,15)
GO
insert into MYZBPARK(CtrlNumber,Location) values (16,16)
GO
insert into MYZBPARK(CtrlNumber,Location) values (17,17)
GO
insert into MYZBPARK(CtrlNumber,Location) values (18,18)
GO
insert into MYZBPARK(CtrlNumber,Location) values (19,19)
GO
insert into MYZBPARK(CtrlNumber,Location) values (20,20)
GO
insert into MYZBPARK(CtrlNumber,Location) values (21,21)
GO
insert into MYZBPARK(CtrlNumber,Location) values (22,22)
GO
insert into MYZBPARK(CtrlNumber,Location) values (23,23)
GO
insert into MYZBPARK(CtrlNumber,Location) values (24,24)
GO
insert into MYZBPARK(CtrlNumber,Location) values (25,25)
GO
insert into MYZBPARK(CtrlNumber,Location) values (26,26)
GO
insert into MYZBPARK(CtrlNumber,Location) values (27,27)
GO
insert into MYZBPARK(CtrlNumber,Location) values (28,28)
GO
insert into MYZBPARK(CtrlNumber,Location) values (29,29)
GO
insert into MYZBPARK(CtrlNumber,Location) values (30,30)
GO

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
--�����볡ʱ��ʹ�С��ʶ 2015-10-13
--Ӧ�ս����շѿ����޸� 2016-01-05
ALTER PROCEDURE [dbo].[JJCREFRESSCARFREE]                    
                 @NO VARCHAR(30),                    
                 @CARDMODEL  VARCHAR(20),              
                 @FIRSTDATE DATETIME,                 
                 @CARCARDS VARCHAR(20) ,              
                 @IMONEY MONEY,
                 @ENDDATE DATETIME,
                 @COMENAME VARCHAR(100),
                 @FLAG INT,
	             @ZJPIC VARCHAR(256),
	             @YSJE MONEY,
	             @SFGateNAME VARCHAR(100),
	             @FreeReason  VARCHAR(100),
	             @PayType  VARCHAR(100)
 AS
IF @FLAG=1
   BEGIN
        UPDATE  MYCARGOOUTRECORD  SET CardType=@CARDMODEL,SFJE=0,OutGateName=@COMENAME,ZJPic=@ZJPIC
               WHERE CardNO= @NO  AND InTime = @FIRSTDATE and OutTime=@ENDDATE and Bigsmall = 0   
   END
IF @FLAG=2
   BEGIN
	UPDATE  MYCARGOOUTRECORD  SET CardType=@CARDMODEL,OutGateName=@COMENAME,SFJE=@IMONEY,YSJE=@YSJE,SFGate=@SFGateNAME,FreeReason=@FreeReason,Temp5=@PayType
               WHERE CardNO= @NO AND InTime = @FIRSTDATE and OutTime=@ENDDATE and Bigsmall = 0
   END
IF @FLAG=3
   BEGIN
        UPDATE  MYCARGOOUTRECORD  SET OutGateName=@COMENAME
               WHERE CardNO= @NO  AND InTime = @FIRSTDATE and OutTime=@ENDDATE and Bigsmall = 0
   END
GO

/****** Object:  Table [dbo].[MYjiaojieWorkTable]    Script Date: 02/25/2016 15:34:23 ******/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYjiaojieWorkTable]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYjiaojieWorkTable](
	[JiaoWorkName] [varchar](50) NULL,
	[JieWorkName] [varchar](50) NULL,
	[GoWorkTime] [datetime] NULL,
	[AfterWorkTime] [datetime] NULL,
	[StopYingSF] [money] NULL,
	[StopShiSF] [money] NULL,
	[ValueCardDeduct] [money] NULL,
	[ATypeSF] [money] NULL,
	[BTypeSF] [money] NULL,
	[CTypeSF] [money] NULL,
	[DTypeSF] [money] NULL,
	[ETypeSF] [money] NULL,
	[FTypeSF] [money] NULL,
	[GTypeSF] [money] NULL,
	[HTypeSF] [money] NULL,
	[SendCard] [int] NULL,
	[RetrieveCard] [int] NULL,
	[InZongNumber] [int] NULL,
	[OutZongNumber] [int] NULL,
	[ATypeCarNum] [int] NULL,
	[BTypeCarNum] [int] NULL,
	[CTypeCarNum] [int] NULL,
	[DTypeCarNum] [int] NULL,
	[ETypeCarNum] [int] NULL,
	[FTypeCarNum] [int] NULL,
	[GTypeCarNum] [int] NULL,
	[HTypeCarNum] [int] NULL,
	[RenGOpen] [int] NULL,
	[ShouGOpen] [int] NULL,
	[SFCarNum] [int] NULL,
	[MFCarNum] [int] NULL,
	[HappenSFCarNum] [int] NULL,
	[Remarks] [varchar](100) NULL
) ON [PRIMARY]
end
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectJiaoJie',N'Ĭ��',N'������',N'JiaoWork Name',N'JiaoWorkName',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectJiaoJie',N'Ĭ��',N'�Ӱ���',N'JieWork Name',N'JieWorkName',N'=',N's',0,0)
GO

--2016-04-07
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectCancel',N'Ĭ��',N'���ƺ���',N'Car Number',N'CPH',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectCancel',N'Ĭ��',N'��Ա���',N'User NO',N'UserNO',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectCancel',N'Ĭ��',N'��Ա����',N'User Name',N'UserName',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectCancel',N'Ĭ��',N'ע������Ա��',N'Cancel UserName',N'CancelUserName',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectCancel',N'Ĭ��',N'ע��ʱ��',N'Cancel Time',N'CancelTime',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectCancel',N'Ĭ��',N'�������',N'Card NO',N'CardNO',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectCancel',N'Ĭ��',N'��ͥסַ',N'Home Address',N'HomeAddress',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectCancel',N'Ĭ��',N'��������',N'Dept Name',N'DeptName',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectCancel',N'Ĭ��',N'�����˱��',N'Issue UserCard',N'IssueUserCard',N'=',N's',0,0)
GO
INSERT [tblQuery] ([Window],[SaveName],[ShowField_CN],[ShowField_EN],[RealField],[OP],[DataType],[Selected],[CurrentShow]) VALUES ( N'SelectCancel',N'Ĭ��',N'ע������Ա���',N'Cancel CardNO',N'CancelCardNO',N'=',N's',0,0)
GO



IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MYCarCancelTable]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MYCarCancelTable](
	[UserNO] [varchar](50) NOT NULL,
	[CardNO] [varchar](50) NOT NULL,
	[UserName] [varchar](50) NULL,
	[Sex] [varchar](50) NULL,
	[HomeAddress] [varchar](100) NULL,
	[DeptName] [varchar](100) NULL,
	[TelNumber] [varchar](50) NULL,
	[MobNumber] [varchar](50) NULL,
	[IssueUserCard] [varchar](50) NULL,
	[CPH] [varchar](50) NULL,
	[CarCardType] [varchar](50) NULL,
	[CarIssueDate] [varchar](50) NULL,
	[Balance] [money] NULL,
	[CarValidStartDate] [datetime] NULL,
	[CarValidEndDate] [datetime] NULL,
	[CancelCardNO] [varchar](50) NULL,
	[CancelTime] [datetime] NULL,
	[CancelUserName] [varchar](50) NULL
) ON [PRIMARY]
END
GO

/****** Object:  Table [dbo].[CancelScheme]    Script Date: 04/11/2016 15:44:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[CancelScheme]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[CancelScheme](
	[SchId] [int] IDENTITY(1,1) NOT NULL,
	[SchName] [varchar](50) NULL,
	[FieldName] [varchar](50) NULL,
	[Operators] [varchar](50) NULL,
	[Selectvalues] [varchar](50) NULL,
	[startime] [varchar](50) NULL,
	[endtime] [varchar](50) NULL,
 CONSTRAINT [PK_CancelScheme] PRIMARY KEY CLUSTERED 
(
	[SchId] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO

/****** Object:  Table [dbo].[JiaoJieScheme]    Script Date: 04/11/2016 15:44:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JiaoJieScheme]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[JiaoJieScheme](
	[SchId] [int] IDENTITY(1,1) NOT NULL,
	[SchName] [varchar](50) NULL,
	[FieldName] [varchar](50) NULL,
	[Operators] [varchar](50) NULL,
	[Selectvalues] [varchar](50) NULL,
	[startime] [varchar](50) NULL,
	[endtime] [varchar](50) NULL,
 CONSTRAINT [PK_JiaoJieScheme] PRIMARY KEY CLUSTERED 
(
	[SchId] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO

--2016-05-20 ���ھƵ����
if not exists (select * from dbo.sysobjects where id = object_id(N'[MyFreeCPH]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
begin
	CREATE TABLE [MyFreeCPH] (
		[ID] [bigint] IDENTITY (1, 1) NOT NULL ,
		[CPH] [varchar] (20) COLLATE Chinese_PRC_CI_AS NOT NULL ,
		[FreeStartTime] [datetime] NULL ,
		[Sign] [smallint] NULL CONSTRAINT [DF_MyFreeCPH_Sign] DEFAULT (0),
		[Remarks] [varchar] (50) COLLATE Chinese_PRC_CI_AS NULL ,
		[FreeEndTime] [datetime] NULL,
		[AddTime] [datetime] NULL
	) ON [PRIMARY]
end
GO

if NOT EXISTS (select * from syscolumns where name='Operator' and id=(select id from  sysobjects where name='MyFreeCPH')) 
BEGIN
	ALTER TABLE MyFreeCPH ADD Operator varchar(50) null
END
GO

if NOT EXISTS (select * from syscolumns where name='PCName' and id=(select id from  sysobjects where name='MyFreeCPH')) 
BEGIN
	ALTER TABLE MyFreeCPH ADD PCName varchar(50) null
END
GO

if NOT EXISTS (select * from syscolumns where name='Operator' and id=(select id from  sysobjects where name='MYZBPARKAutoCPH')) 
BEGIN
	ALTER TABLE MYZBPARKAutoCPH ADD Operator varchar(50) null
END
GO
---2016-06-16 th

/****** Object:  StoredProcedure [dbo].[JJCGETUPDATESTORE_New]    Script Date: 06/16/2016 22:52:17 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCGETUPDATESTORE_New]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'CREATE  PROCEDURE [dbo].[JJCGETUPDATESTORE_New]            
                 @NO       VARCHAR(30),            /*CardNO*/
                 @ENDDATE  DATETIME,               /*OutTime*/
                 @CARCARDS VARCHAR(20),            /*CPH*/
                 @CHARGE   MONEY ,                 /*��ȡ���*/
                 @GONAME   VARCHAR(100),           /*OutGateName*/
                 @GOPICTURE VARCHAR(256),          /*OutPic*/
                 @COMEDATE  DATETIME,              /*InTime*/
                 @IMONEY     MONEY,                /*ʣ����*/
                 @OPERATORCARD1   VARCHAR(30),
                 @OPERATORNAME1 VARCHAR(50),
                 @MYONOFFLINE   INT,               /*�ѻ�����*/
                 @MYIDICFLAG    INT,               /*IDIC��ʶ15IC 16ID*/
                 @MYKALEIHERE    VARCHAR(20),      /*����*/
                 @MYCHEPAICOLOR  VARCHAR(10),
                 @MYBIGSMALLINT  INT,
                 @MYCHECHANGBH   INT,
                 @SHOUFEIFLAG    INT,                  /*�����ʶ*/  
                 @MYMANGOPICT    VARCHAR(256),  
                 @YSJE   MONEY ,  
                 @FreeReason VARCHAR(100),   
                 @StayTime  VARCHAR(30)        
 AS
   
   DECLARE  @CCM VARCHAR(20)   
   DECLARE  @CCC VARCHAR(20)
   DECLARE  @COMENAME VARCHAR(50)
   DECLARE  @OPERATORCARD0  VARCHAR(30)
   DECLARE  @OPERATORNAME0  VARCHAR(50)
   DECLARE  @COMEPICTURE    VARCHAR(256)
   DECLARE  @MANCOMEPICT    VARCHAR(256)
   DECLARE  @MYCHAOSHISIGN  VARCHAR(10)
   DECLARE  @MYCHAOSHIDATE  DATETIME
   DECLARE  @OPERATORCARD2  VARCHAR(30)
   DECLARE  @OPERATORNAME2 VARCHAR(50)
   DECLARE  @MYSHOUFEIKOU  VARCHAR(100)
   DECLARE  @MYCHAOSHIJINER MONEY  
   DECLARE  @MYSHOUFEIDATE  DATETIME 
   DECLARE  @MYSHOUFEIJINER MONEY
   DECLARE  @XIAOCHEDATE    DATETIME 
   DECLARE  @MYMIANFEISHIYOU VARCHAR(100)
   DECLARE  @MYZHENGJIAN    VARCHAR(256)
   DECLARE  @MYYINGSHOUER   MONEY
            IF  ((@MYIDICFLAG=16) OR (@SHOUFEIFLAG=3))            /*IDIC��ʶ15IC 16ID  3Ϊ�����տ�*/
                BEGIN
                    IF @SHOUFEIFLAG=3
                    BEGIN
		            SELECT TOP 1 @CCM=CardType,@CCC=CPH,
		                         @COMENAME=InGateName,@OPERATORCARD0=InOperatorCard,
		                         @OPERATORNAME0=InOperator,@COMEPICTURE=InPic,@MANCOMEPICT=InUser,
	                                 @XIAOCHEDATE=InTime,@MYSHOUFEIJINER=SFJE,
	                                 @MYCHAOSHISIGN=OvertimeSymbol,@MYCHAOSHIDATE=OvertimeSFTime,
	                                 @MYCHAOSHIJINER=OvertimeSFJE,@MYSHOUFEIDATE=SFTime,
	                                 @OPERATORCARD2=SFOperatorCard,@OPERATORNAME2=SFOperator,
	                                 @MYSHOUFEIKOU=SFGate,@MYMIANFEISHIYOU=FreeReason,
	                                 @MYZHENGJIAN=ZJPic,@MYYINGSHOUER=YSJE
		                 FROM MYCARCOMERECORD
		                      WHERE CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO)) AND BigSmall=@MYBIGSMALLINT ORDER BY InTime DESC  /*ID��ȡ�����һ��¼,�������������*/
                     END
                     ELSE	--16ID
                     BEGIN
                        if @MYONOFFLINE = 10  --�ѻ� ֻ���볡ʱ��С�ڳ���ʱ��ļ�¼��˳������  2016-02-19
                        begin
									SELECT TOP 1 @CCM=CardType,@CCC=CPH,
											 @COMENAME=InGateName,@OPERATORCARD0=InOperatorCard,@OPERATORCARD2=SFOperatorCard,@OPERATORNAME2=SFOperator,
											  @MYSHOUFEIKOU=SFGate,@OPERATORNAME0=InOperator,@COMEPICTURE=InPic,@MANCOMEPICT=InUser,@XIAOCHEDATE=InTime    --2016-02-19 ��� @XIAOCHEDATE=InTime                              
								   FROM MYCARCOMERECORD
										WHERE CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO)) AND BigSmall=@MYBIGSMALLINT and InTime <=@ENDDATE ORDER BY InTime 
		                  end
		                  else   --����
		                  begin
									SELECT TOP 1 @CCM=CardType,@CCC=CPH,
											 @COMENAME=InGateName,@OPERATORCARD0=InOperatorCard,@OPERATORCARD2=SFOperatorCard,@OPERATORNAME2=SFOperator,
											  @MYSHOUFEIKOU=SFGate,@OPERATORNAME0=InOperator,@COMEPICTURE=InPic,@MANCOMEPICT=InUser,@XIAOCHEDATE=InTime    --2016-02-19 ��� @XIAOCHEDATE=InTime                              
								   FROM MYCARCOMERECORD
										WHERE CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO)) AND BigSmall=@MYBIGSMALLINT ORDER BY InTime DESC  /*ID��ȡ�����һ��¼,�������������*/
		                  end
		                  set @MYYINGSHOUER = @CHARGE  --2016-02-19
                     END                     
                     DELETE FROM MYCARCOMERECORD
                              WHERE CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO)) AND InTime=@XIAOCHEDATE AND BigSmall=@MYBIGSMALLINT                  
                     IF (@XIAOCHEDATE IS NOT NULL)
                        BEGIN
                             SET @COMEDATE=@XIAOCHEDATE
                        END
                     IF (@MYSHOUFEIJINER IS NOT NULL ) AND (@SHOUFEIFLAG=3)
                        BEGIN
                                SET @CHARGE=@MYSHOUFEIJINER
                        END
                END
            ELSE
                BEGIN
                    SELECT  @CCM=CardType,@CCC=CPH,
	                     @COMENAME=InGateName,@OPERATORCARD0=InOperatorCard,
	                     @OPERATORNAME0=InOperator,@COMEPICTURE=InPic,
                             @MANCOMEPICT=InUser,@MYZHENGJIAN=ZJPic,@MYSHOUFEIKOU=SFGate
	                 FROM MYCARCOMERECORD
	                      WHERE CarparkNO=@MYCHECHANGBH AND InTime=@COMEDATE AND CardNO=LTRIM(RTRIM(@NO)) AND BigSmall=@MYBIGSMALLINT                         /*IC*/
                     DELETE FROM MYCARCOMERECORD
                              WHERE CarparkNO=@MYCHECHANGBH AND InTime=@COMEDATE AND CardNO=LTRIM(RTRIM(@NO)) AND BigSmall=@MYBIGSMALLINT
                    set @MYYINGSHOUER = @CHARGE  --2016-02-19
                END
            IF @CCM IS NULL 
            BEGIN
                    SET @CCM=@MYKALEIHERE
                    SET @CCC=@CARCARDS
            END            
            if  (@CCC=''00000000'' or @CCC=''66666666'' or @CCC='''' or @CCC=''88888888'')
            BEGIN
               SET @CCC=@CARCARDS
            END         
	        IF  (@MYCHAOSHIJINER IS  NULL)  
	        BEGIN
	                SET @MYCHAOSHIJINER=0                                                         
	        END	          
            IF @MYBIGSMALLINT=1
            BEGIN
                    SET @CHARGE=0
                    SET @IMONEY=0
                    SET @MYCHAOSHIJINER=0 
                    set @MYYINGSHOUER =0    --2016-02-19
            END            
            IF @MYBIGSMALLINT=0
            BEGIN
                      IF  ((LEFT(RTRIM(@MYKALEIHERE),3)=''Mth'') AND (@CHARGE>0.0))
                      BEGIN
                           SET   @CCM=''Tmp'' + RIGHT(LTRIM(@MYKALEIHERE),1)
                           SET   @GONAME=RTRIM(@GONAME) + ''Overtime''
                      END
                      if(((LEFT(RTRIM(@MYKALEIHERE),3)=''Mtp'') AND (@CHARGE>0.0)))
                      BEGIN
                         SET   @CCM=@MYKALEIHERE
                      END
            END
            set     @MYMIANFEISHIYOU= @FreeReason --��ֵ���ԭ��
            set @MYYINGSHOUER=@YSJE --��ֵӦ�ս��
            INSERT INTO MYCARGOOUTRECORD (CardNO,CardType,InTime,OutTime,CPH,SFJE,SFTime,
                       InGateName,OutGateName,InOperatorCard,InOperator,InPic,InUser,OutPic,OutUser,ZJPic,Balance,OutOperatorCard,
                       OutOperator,YSJE,BigSmall,CarparkNO,FreeReason,SFGate,SFOperatorCard,SFOperator,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,StayTime)
                  VALUES (@NO,@CCM,@COMEDATE,@ENDDATE,@CCC,@CHARGE,@MYSHOUFEIDATE,@COMENAME,@GONAME,@OPERATORCARD0,@OPERATORNAME0,
                          @COMEPICTURE,@MANCOMEPICT,@GOPICTURE,@MYMANGOPICT,@MYZHENGJIAN,@IMONEY,@OPERATORCARD1,@OPERATORNAME1,@MYYINGSHOUER,     --@CHARGE  2016-02-19
                          @MYBIGSMALLINT,@MYCHECHANGBH,@MYMIANFEISHIYOU,@MYSHOUFEIKOU,@OPERATORCARD2,@OPERATORNAME2,@MYCHAOSHISIGN,@MYCHAOSHIDATE,@MYCHAOSHIJINER,@StayTime)
             
            IF (@MYBIGSMALLINT=1 AND @MYONOFFLINE=20)  /*10�ѻ� 20����*/
            BEGIN	
          	    INSERT INTO MYCARGOOUTRECORD (CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5)	              
	               SELECT CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5 FROM MYCARCOMERECORD  WHERE CarparkNO=@MYCHECHANGBH AND BigSmall=@MYBIGSMALLINT AND CardNO=LTRIM(RTRIM(@NO))
	            DELETE FROM MYCARCOMERECORD WHERE CarparkNO=@MYCHECHANGBH AND BigSmall=@MYBIGSMALLINT AND CardNO=LTRIM(RTRIM(@NO))
            END 
                               
            IF (@MYBIGSMALLINT=0 AND @MYONOFFLINE=20)  /*10�ѻ� 20����*/   
            BEGIN	
          	    INSERT INTO MYCARGOOUTRECORD (CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5)
	               SELECT CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5 FROM MYCARCOMERECORD  WHERE  CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO))
	            DELETE FROM MYCARCOMERECORD WHERE CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO))
            END 
' 
END
GO
--2016-12-29 WJ��ͷ�ĳ�����8λ��ֻ�ԱȺ�5λ  ��������Դ��������
/****** Object:  StoredProcedure [dbo].[CARQUERYNOWS2]    Script Date: 12/29/2016 17:57:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
ALTER     PROCEDURE [dbo].[CARQUERYNOWS2]
       @INCARPLATES  VARCHAR(15),
       @CPPRECISION  INT,
       @FORTIAOJIAN01  VARCHAR(10),  
       @FORTIAOJIAN02  VARCHAR(10)    
AS 
IF (@CPPRECISION<4 OR @CPPRECISION>6)
    BEGIN
        SET @CPPRECISION=4
     END
     
     --WJ��ͷ�ĳ�����8λ��ֻ�ԱȺ�5λ  2016-06-17
     if len(@INCARPLATES)>7 and SUBSTRING(@INCARPLATES,1,2) = 'WJ'
     begin
		SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE 
	       SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1) 
           AND SUBSTRING(CPH,8,1)=SUBSTRING(@INCARPLATES,8,1) AND SUBSTRING(CPH,1,2) = 'WJ' AND
             (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02) 
     end
     if len(@INCARPLATES)>7 and (SUBSTRING(@INCARPLATES,3,1)='D' or SUBSTRING(@INCARPLATES,3,1)='F' or SUBSTRING(@INCARPLATES,8,1)='D' or SUBSTRING(@INCARPLATES,8,1)='F')
     begin
	SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE 
	SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) 
    AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1) AND SUBSTRING(CPH,8,1)=SUBSTRING(@INCARPLATES,8,1) AND
                 (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02)
                  return
     end
     
IF @CPPRECISION=4
   BEGIN
	SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE 
       ((SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	
	(SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1))) AND
                  (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02)  and len(CPH)=7
   END 
IF @CPPRECISION=5
   BEGIN
	SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE                
       ((SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 	
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR         
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1))) AND 
                  (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02)  and len(CPH)=7
        
   END 
IF @CPPRECISION=6
   BEGIN
	SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE 
	SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) 
    AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1) AND 
                 (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02)  and len(CPH)=7
   END
GO



--2016-12-29 WJ��ͷ�ĳ�����8λ��ֻ�ԱȺ�5λ ��������Դ����
/****** Object:  StoredProcedure [dbo].[CARQUERYNOWS_FX]    Script Date: 12/29/2016 17:35:02 ******/
SET ANSI_NULLS OFF
GO
SET QUOTED_IDENTIFIER OFF
GO
ALTER    PROCEDURE [dbo].[CARQUERYNOWS_FX]
       @INCARPLATES  VARCHAR(15),
       @CPPRECISION  INT,
       @FORTIAOJIAN01  VARCHAR(10),  
       @FORTIAOJIAN02  VARCHAR(10),
       @FORTIAOJIAN03  VARCHAR(10)    
AS 
IF (@CPPRECISION<4 OR @CPPRECISION>6)
IF (@CPPRECISION<4 OR @CPPRECISION>6)
    BEGIN
        SET @CPPRECISION=4
     END
     
     --WJ��ͷ�ĳ�����8λ��ֻ�ԱȺ�5λ  2016-06-17
     if len(@INCARPLATES)>7 and SUBSTRING(@INCARPLATES,1,2) = 'WJ'
     begin
        SELECT CardNO,CarCardType,CPH,CarType,CarColor,CarValidEndDate  FROM MYFAXINGSSUE WHERE 
	        SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1) 
            AND SUBSTRING(CPH,8,1)=SUBSTRING(@INCARPLATES,8,1) AND 
             (LEFT(CarCardType,3)=@FORTIAOJIAN01 OR LEFT(CarCardType,3)=@FORTIAOJIAN02 OR LEFT(CarCardType,3)=@FORTIAOJIAN03) AND CardState='0' AND LTRIM(CPH)<>'' AND CPH IS NOT NULL and SUBSTRING(CPH,1,2) = 'WJ'
             
        return
     end
     
     if len(@INCARPLATES)>7 and (SUBSTRING(@INCARPLATES,3,1)='D' or SUBSTRING(@INCARPLATES,3,1)='F' or SUBSTRING(@INCARPLATES,8,1)='D' or SUBSTRING(@INCARPLATES,8,1)='F')
     begin
     SELECT CardNO,CarCardType,CPH,CarType,CarColor,CarValidEndDate  FROM MYFAXINGSSUE WHERE 
	SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) 
    AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1) AND SUBSTRING(CPH,8,1)=SUBSTRING(@INCARPLATES,8,1) AND 
                 (LEFT(CarCardType,3)=@FORTIAOJIAN01 OR LEFT(CarCardType,3)=@FORTIAOJIAN02 OR LEFT(CarCardType,3)=@FORTIAOJIAN03) AND CardState='0' AND LTRIM(CPH)<>'' AND CPH IS NOT NULL
                  return
     end
     
IF @CPPRECISION=4
   BEGIN
	SELECT CardNO,CarCardType,CPH,CarType,CarColor,CarValidEndDate FROM MYFAXINGSSUE WHERE 
       ((SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	
	(SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1))) AND
                  (LEFT(CarCardType,3)=@FORTIAOJIAN01 OR LEFT(CarCardType,3)=@FORTIAOJIAN02 OR LEFT(CarCardType,3)=@FORTIAOJIAN03) AND CardState='0' AND LTRIM(CPH)<>'' AND CPH IS NOT NULL and len(CPH)=7
   END 
IF @CPPRECISION=5
   BEGIN
	SELECT CardNO,CarCardType,CPH,CarType,CarColor,CarValidEndDate  FROM MYFAXINGSSUE WHERE                
       ((SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 	
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR         
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1))) AND 
                  (LEFT(CarCardType,3)=@FORTIAOJIAN01 OR LEFT(CarCardType,3)=@FORTIAOJIAN02 OR LEFT(CarCardType,3)=@FORTIAOJIAN03) AND CardState='0' AND LTRIM(CPH)<>'' AND CPH IS NOT NULL and len(CPH)=7
        
   END 
IF @CPPRECISION=6
   BEGIN
	SELECT CardNO,CarCardType,CPH,CarType,CarColor,CarValidEndDate  FROM MYFAXINGSSUE WHERE 
	SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) 
    AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1) AND 
                 (LEFT(CarCardType,3)=@FORTIAOJIAN01 OR LEFT(CarCardType,3)=@FORTIAOJIAN02 OR LEFT(CarCardType,3)=@FORTIAOJIAN03) AND CardState='0' AND LTRIM(CPH)<>'' AND CPH IS NOT NULL and len(CPH)=7
   END
   
   
GO
--2016-06-22 ���ܱ�������Ӧ�ս���ֶ�
if NOT EXISTS (select * from syscolumns where name='ZSumYSJE' and id=(select id from  sysobjects where name='MYCARGOOUTRECORDREPORT')) 
BEGIN
	ALTER TABLE MYCARGOOUTRECORDREPORT ADD ZSumYSJE money null
END
GO
if NOT EXISTS (select * from syscolumns where name='WXPay' and id=(select id from  sysobjects where name='MYCARGOOUTRECORDREPORT')) 
BEGIN
	ALTER TABLE MYCARGOOUTRECORDREPORT ADD WXPay money null
END
GO
if NOT EXISTS (select * from syscolumns where name='ZFBPay' and id=(select id from  sysobjects where name='MYCARGOOUTRECORDREPORT')) 
BEGIN
	ALTER TABLE MYCARGOOUTRECORDREPORT ADD ZFBPay money null
END
GO
if NOT EXISTS (select * from syscolumns where name='CashPay' and id=(select id from  sysobjects where name='MYCARGOOUTRECORDREPORT')) 
BEGIN
	ALTER TABLE MYCARGOOUTRECORDREPORT ADD CashPay money null
END
GO
--2016-06-29 �ѻ�����������ʱ�� ���Ӵ�С������ʶ
if NOT EXISTS (select * from syscolumns where name='iBigSmall' and id=(select id from  sysobjects where name='MYAutoTempDownLoad')) 
BEGIN
	ALTER TABLE MYAutoTempDownLoad ADD iBigSmall int NULL DEFAULT 0; 
END
GO
update MYAutoTempDownLoad set iBigSmall=0
GO

--2016-07-05 ����ɨ��֧������
/****** Object:  Table [dbo].[MyScanCodePay]    Script Date: 07/05/2016 09:25:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MyScanCodePay]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MyScanCodePay](
	[SMPayment] [bit] NULL,
	[WXAppID] [varchar](255) NULL,
	[WXMCHID] [varchar](255) NULL,
	[WXKEY] [varchar](255) NULL,
	[ZFBAppID] [varchar](255) NULL,
	[ZFBPID] [varchar](255) NULL,
	[StrTemp1] [varchar](255) NULL,
	[StrTemp2] [varchar](255) NULL,
	[StrTemp3] [varchar](255) NULL,
	[StrTemp4] [varchar](255) NULL,
	[StrTemp5] [varchar](255) NULL
) ON [PRIMARY]
END
GO
SET ANSI_PADDING OFF
GO


--2016-04-18
/****** Object:  Table [dbo].[tSpecialCPH]    Script Date: 04/14/2016 11:28:28 ******/
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[tSpecialCPH]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
begin
	CREATE TABLE [dbo].[tSpecialCPH](
		[ID] [bigint] IDENTITY(1,1) NOT NULL,
		[Type] [int] NULL,
		[CPH] [varchar](50) NULL,
		[Mode] [varchar](50) NULL,
		[Show] [varchar](50) NULL
	) ON [PRIMARY]
end
GO

SET ANSI_PADDING OFF
GO
--2016-08-12
/****** Object:  Table [dbo].[MyEncryption]    Script Date: 08/12/2016 10:31:43 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[MyEncryption]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[MyEncryption](
	[SQLkey] [nvarchar](255) NULL
) ON [PRIMARY]
END
GO
--2016-09-27
if NOT EXISTS (select * from syscolumns where name='MonthOutChargeType' and id=(select id from  sysobjects where name='MYCHECHANGXITONGSET')) 
BEGIN
	ALTER TABLE MYCHECHANGXITONGSET ADD MonthOutChargeType varchar(100) null
END
GO
--2016-09-08  �������� ���߼�س������볡��ťȨ��   ���Ƴ�����ĳһ���ٳ������շ�
if NOT EXISTS (select * from   syscolumns where name='CarInGate' and id=(select id from  sysobjects where name='MyAutoCPHSet')) 
alter table MyAutoCPHSet add  [CarInGate]  bit  default  1;
GO
if NOT EXISTS (select * from   syscolumns where name='CarOutGate' and id=(select id from  sysobjects where name='MyAutoCPHSet')) 
alter table MyAutoCPHSet add  [CarOutGate]  bit  default  1;
GO
if NOT EXISTS (select * from   syscolumns where name='CarYellowTmp' and id=(select id from  sysobjects where name='MyAutoCPHSet')) 
alter table MyAutoCPHSet add  [CarYellowTmp]  bit  default  1;
GO
if NOT EXISTS (select * from syscolumns where name='CarYellowTmpType' and id=(select id from  sysobjects where name='MyAutoCPHSet')) 
BEGIN
	ALTER TABLE MyAutoCPHSet ADD [CarYellowTmpType] varchar(100) null
END
GO
if NOT EXISTS (select * from syscolumns where name='Remark' and id=(select id from  sysobjects where name='MYICMONEY')) 
BEGIN
	ALTER TABLE MYICMONEY ADD [Remark] varchar(255) null
END
GO
if NOT exists (select * from sysobjects where id = OBJECT_ID('[MYAutoTempChange]') and OBJECTPROPERTY(id, N'IsUserTable') = 1) 
BEGIN
CREATE TABLE [dbo].[MYAutoTempChange](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[CPH] [nvarchar](50) NULL,
	[CarCardType] [nvarchar](50) NULL,
	[InTime] [datetime] NULL,
	[CarValidStartDate] [datetime] NULL,
	[CarValidEndDate] [datetime] NULL,
	[DownloadSignal] [nvarchar](50) NULL,
	[InOut] [int] NULL,
 CONSTRAINT [PK_MYAutoTempChange] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
/****** Object:  StoredProcedure [dbo].[CARQUERYNOWS_Come]    Script Date: 08/01/2016 14:21:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[CARQUERYNOWS_Come]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'Create     PROCEDURE [dbo].[CARQUERYNOWS_Come]
       @INCARPLATES  VARCHAR(15),
       @CPPRECISION  INT,
       @FORTIAOJIAN01  VARCHAR(10),  
       @FORTIAOJIAN02  VARCHAR(10),
       @BIGSMALLINT  INT    
AS 
IF (@CPPRECISION<4 OR @CPPRECISION>6)
    BEGIN
        SET @CPPRECISION=4
     END
     
     --WJ��ͷ�ĳ���,ֻ�ԱȺ�5λ  2016-07-19
     if SUBSTRING(@INCARPLATES,1,2) = ''WJ''
     begin
        if len(@INCARPLATES)=7
        begin
			SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE 
			   SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,8,1)=SUBSTRING(@INCARPLATES,7,1) 
			   AND SUBSTRING(CPH,1,2) = ''WJ'' AND (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02) and BigSmall=@BIGSMALLINT              
            return
        end
        else if len(@INCARPLATES)>7 
        begin
			SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE 
			   SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1) 
			   AND SUBSTRING(CPH,8,1)=SUBSTRING(@INCARPLATES,8,1) AND SUBSTRING(CPH,1,2) = ''WJ'' AND
				 (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02) and BigSmall=@BIGSMALLINT               
            return
         end 
     end
     
     
IF @CPPRECISION=4
   BEGIN
	SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE 
       ((SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	
	(SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1))) AND
                  (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02) and BigSmall=@BIGSMALLINT  
   END 
IF @CPPRECISION=5
   BEGIN
	SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE                
       ((SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 	
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR         
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1))) AND 
                  (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02)  and BigSmall=@BIGSMALLINT 
        
   END 
IF @CPPRECISION=6
   BEGIN
	SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE 
	SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) 
    AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1) AND 
                 (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02) and BigSmall=@BIGSMALLINT  
   END
' 
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
ALTER   PROCEDURE [dbo].[cg_DoBackupJob]
    
    @FileHead     varchar(50),
    @isFullBackup    bit,                    -- 0 ��������    1 ��������
    @FolderPath     varchar(50)     = 'D:\�����ļ�\bak\',
    @BackName    varchar(100)    = 'unknown',        -- �����ִ�
    @isAppendMedia  bit        = 1            -- 0 ����ý��    1 ׷�ӵ�ý�� 
AS
declare @DataBaseName    varchar(100)
    declare @filePath varchar(150)
    declare @sql varchar(1000)
    
         Select @DataBaseName= Name From Master.dbo.SysDataBases Where DbId=(Select Dbid From Master.dbo.SysProcesses Where Spid = @@spid)
   select  @FolderPath=LoadRoute from DBO.tbSystemDataBak
   
  --- print @FolderPath
   
    select @filePath=@FolderPath +  @FileHead + '_' + case @isFullBackup when 1 then 'FullBackup' when 0 then 'DifferBackup' end  + '_' +
replace(replace(replace(  convert( nvarchar(100) ,getdate() , 120 ),'-',''),' ',''),':','')+'.bak'
        + case @isFullBackup when 1 then '' when 0 then replace(convert(nvarchar(15),getdate(),114),':','') end
    --print(@filePath)
    select @sql ='BACKUP DATABASE [' + @DataBaseName + '] TO DISK = ''' 
        + @filePath + '''  WITH '
        +  case @isAppendMedia when 0 then 'INIT' when 1 then 'NOINIT' end 
        + ' ,  NOUNLOAD , '
        + case @isFullBackup when 0 then 'DIFFERENTIAL , ' when 1 then '' end    
        + '  NAME = N''' + @BackName + '����'',  NOSKIP ,  STATS = 10,  NOFORMAT'
    execute(@sql)
GO
--2016-12-29 �������ܳ�������
/****** Object:  StoredProcedure [dbo].[CARQUERYNOWS_Come]    Script Date: 12/29/2016 17:54:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
ALTER     PROCEDURE [dbo].[CARQUERYNOWS_Come]
       @INCARPLATES  VARCHAR(15),
       @CPPRECISION  INT,
       @FORTIAOJIAN01  VARCHAR(10),  
       @FORTIAOJIAN02  VARCHAR(10),
       @BIGSMALLINT  INT    
AS 
IF (@CPPRECISION<4 OR @CPPRECISION>6)
    BEGIN
        SET @CPPRECISION=4
     END
     
     --WJ��ͷ�ĳ���,ֻ�ԱȺ�5λ  2016-07-19
     if SUBSTRING(@INCARPLATES,1,2) = 'WJ'
     begin
        if len(@INCARPLATES)=7
        begin
			SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE 
			   SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,8,1)=SUBSTRING(@INCARPLATES,7,1) 
			   AND SUBSTRING(CPH,1,2) = 'WJ' AND (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02) and BigSmall=@BIGSMALLINT              
            return
        end
        else if len(@INCARPLATES)>7 
        begin
			SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE 
			   SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1) 
			   AND SUBSTRING(CPH,8,1)=SUBSTRING(@INCARPLATES,8,1) AND SUBSTRING(CPH,1,2) = 'WJ' AND
				 (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02) and BigSmall=@BIGSMALLINT               
            return
         end 
     end
     if len(@INCARPLATES)>7 and (SUBSTRING(@INCARPLATES,3,1)='D' or SUBSTRING(@INCARPLATES,3,1)='F' or SUBSTRING(@INCARPLATES,8,1)='D' or SUBSTRING(@INCARPLATES,8,1)='F')
     begin
	SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE 
	SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) 
    AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1) AND SUBSTRING(CPH,8,1)=SUBSTRING(@INCARPLATES,8,1) AND
                 (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02) and BigSmall=@BIGSMALLINT  
                  return
     end
     
IF @CPPRECISION=4
   BEGIN
	SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE 
       ((SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	
	(SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR
	
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	
	(SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1))) AND
                  (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02) and BigSmall=@BIGSMALLINT  and len(CPH)=7  
   END 
IF @CPPRECISION=5
   BEGIN
	SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE                
       ((SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1)) OR 	
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR         
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
        (SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1)) OR 
	(SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1))) AND 
                  (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02)  and BigSmall=@BIGSMALLINT  and len(CPH)=7 
        
   END 
IF @CPPRECISION=6
   BEGIN
	SELECT CardNO,InTime,CPH,CardType,InPic  FROM MYCARCOMERECORD WHERE 
	SUBSTRING(CPH,2,1)=SUBSTRING(@INCARPLATES,2,1) AND SUBSTRING(CPH,3,1)=SUBSTRING(@INCARPLATES,3,1) AND SUBSTRING(CPH,4,1)=SUBSTRING(@INCARPLATES,4,1) AND SUBSTRING(CPH,5,1)=SUBSTRING(@INCARPLATES,5,1) 
    AND SUBSTRING(CPH,6,1)=SUBSTRING(@INCARPLATES,6,1) AND SUBSTRING(CPH,7,1)=SUBSTRING(@INCARPLATES,7,1) AND 
                 (LEFT(CardType,3)=@FORTIAOJIAN01 OR LEFT(CardType,3)=@FORTIAOJIAN02) and BigSmall=@BIGSMALLINT and len(CPH)=7 
   END
GO

--2017-03-10
if NOT EXISTS (select * from syscolumns where name='MothRetentionTemp' and id=(select id from  sysobjects where name='MYCHECHANGXITONGSET')) 
BEGIN
	ALTER TABLE MYCHECHANGXITONGSET ADD MothRetentionTemp varchar(100) null
END
GO
if NOT EXISTS (select * from   syscolumns where name='TempFirstRecord' and id=(select id from  sysobjects where name='MYCHECHANGXITONGSET')) 
alter table MYCHECHANGXITONGSET add  TempFirstRecord  bit  default  1;
GO

/****** Object:  Table [dbo].[OptLog]    Script Date: 09/02/2013 15:59:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[OptStateLog]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[OptStateLog](
	[OptCardNO] [varchar](10) NULL,
	[UserName] [varchar](50) NULL,
	[OptMenu] [varchar](400) NULL,
	[OptContent] [varchar](2000) NULL,
	[PCName] [varchar](50) NULL,
	[OptTime] [datetime] NOT NULL
) ON [PRIMARY]
END
GO
---th 2017-03-21
/****** Object:  StoredProcedure [dbo].[JJCTGETWRITESTORE_New]    Script Date: 09/02/2013 15:59:49 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[JJCTGETWRITESTORE_New]') AND OBJECTPROPERTY(id,N'IsProcedure') = 1)
BEGIN
EXEC dbo.sp_executesql @statement = N'
CREATE             PROCEDURE [dbo].[JJCTGETWRITESTORE_New]             /*�볡��¼*/
                 @NO         VARCHAR(30), 
                 @CARCARDS   VARCHAR(20),                    
                 @CARDMODEL  VARCHAR(20),             
                 @FIRSTDATE  DATETIME,                                
                 @COMENAME   VARCHAR(100),
                 @OPERATORCARDS VARCHAR(30),
                 @OPERATORNAME  VARCHAR(50),
                 @COMEPICTURE   VARCHAR(256),
                 @MYONLINEFLAG  INT,                   /*���ߺ��ѻ�*/
                 @MYIDICFLAG    INT,                   /*IDIC��ʶ*/
                 @MYCARCOLOR    VARCHAR(10),           /*������ɫ*/
                 @MYBIGSMALLINT INT,
                 @MYCHECHANGBH  INT,
                 @CHARGE   MONEY ,                         /*����SFJE*/
                 @SHOUFEIKOUNAME   VARCHAR(100),           /*����SFGate��*/
                 @SHOUFEIKAHAO VARCHAR(30),          /*SFOperator*/
                 @SHOUFEIYUAN  VARCHAR(50),          /*SFOperator*/
                 @SHOUFEIFLAG  INT,                  /*�����ʶ*/
                 @IMONEY       MONEY,                 /*ʣ����*/
                 @MYMANPICTURE VARCHAR(256),
                 @bMorePaingCar BIT
 AS
 DECLARE @SHOUFEIDATE DATETIME
IF @SHOUFEIFLAG=2                        /*�����շ�*/
	BEGIN
	    SET @SHOUFEIDATE=@FIRSTDATE  /*SFTime*/
	END
IF  @MYONLINEFLAG=20           /*20����/10�ѻ�*/
    BEGIN 
          IF @MYBIGSMALLINT=1   /*0�󳵳� 1С����*/
                BEGIN
		  INSERT INTO MYCARGOOUTRECORD (CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5,bMorePaingCar)           
	              SELECT CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5,bMorePaingCar FROM MYCARCOMERECORD WHERE CarparkNO=@MYCHECHANGBH AND BigSmall=@MYBIGSMALLINT AND CardNO=LTRIM(RTRIM(@NO)) 
	          DELETE FROM MYCARCOMERECORD WHERE CarparkNO=@MYCHECHANGBH AND BigSmall=@MYBIGSMALLINT AND CardNO=LTRIM(RTRIM(@NO)) 
                  END
          ELSE
                BEGIN
		  INSERT INTO MYCARGOOUTRECORD (CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5,bMorePaingCar)	             
	              SELECT CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5,bMorePaingCar FROM MYCARCOMERECORD WHERE  CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO))  
	          DELETE FROM MYCARCOMERECORD WHERE  CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO)) 
                  END               
      END
INSERT INTO MYCARCOMERECORD (CardNO,CPH,CardType,InTime,OutTime,InGateName,InOperatorCard,InOperator,InPic,InUser,SFJE,Balance,YSJE,SFTime,SFOperatorCard,SFOperator,SFGate,CarparkNO,BigSmall,bMorePaingCar)
               VALUES (@NO,@CARCARDS,@CARDMODEL,@FIRSTDATE,@FIRSTDATE,@COMENAME,@OPERATORCARDS,@OPERATORNAME,@COMEPICTURE,@MYMANPICTURE,@CHARGE,@IMONEY,@CHARGE,@SHOUFEIDATE,@SHOUFEIKAHAO,@SHOUFEIYUAN,@SHOUFEIKOUNAME,@MYCHECHANGBH,@MYBIGSMALLINT,@bMorePaingCar)
' 
END
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

/****** Object:  StoredProcedure [dbo].[JJCREFRESSCARFREE]    Script Date: 03/21/2017 17:52:20 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
--�����볡ʱ��ʹ�С��ʶ 2015-10-13
--Ӧ�ս����շѿ����޸� 2016-01-05
ALTER PROCEDURE [dbo].[JJCREFRESSCARFREE]                    
                 @NO VARCHAR(30),                    
                 @CARDMODEL  VARCHAR(20),              
                 @FIRSTDATE DATETIME,                 
                 @CARCARDS VARCHAR(20) ,              
                 @IMONEY MONEY,
                 @ENDDATE DATETIME,
                 @COMENAME VARCHAR(100),
                 @FLAG INT,
	             @ZJPIC VARCHAR(256),
	             @YSJE MONEY,
	             @SFGateNAME VARCHAR(100),
	             @FreeReason  VARCHAR(100),
	             @PayType  VARCHAR(100),
	             @bDZ  bit,
	             @strDZ  VARCHAR(500)
 AS
IF @FLAG=1
   BEGIN
        UPDATE  MYCARGOOUTRECORD  SET CardType=@CARDMODEL,SFJE=0,OutGateName=@COMENAME,ZJPic=@ZJPIC,bDZ=@bDZ,strDZ=@strDZ
               WHERE CardNO= @NO  AND InTime = @FIRSTDATE and OutTime=@ENDDATE and Bigsmall = 0   
   END
IF @FLAG=2
   BEGIN
	UPDATE  MYCARGOOUTRECORD  SET CardType=@CARDMODEL,OutGateName=@COMENAME,SFJE=@IMONEY,YSJE=@YSJE,SFGate=@SFGateNAME,FreeReason=@FreeReason,Temp5=@PayType,bDZ=@bDZ,strDZ=@strDZ
               WHERE CardNO= @NO AND InTime = @FIRSTDATE and OutTime=@ENDDATE and Bigsmall = 0
   END
IF @FLAG=3
   BEGIN
        UPDATE  MYCARGOOUTRECORD  SET OutGateName=@COMENAME
               WHERE CardNO= @NO  AND InTime = @FIRSTDATE and OutTime=@ENDDATE and Bigsmall = 0
   END
GO


--2017-05-02 th  ����@QRCode  ��ά���ͷ�ֶ�
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

ALTER             PROCEDURE [dbo].[JJCTGETWRITESTORE_New]             /*�볡��¼*/
                 @NO         VARCHAR(30), 
                 @CARCARDS   VARCHAR(20),                    
                 @CARDMODEL  VARCHAR(20),             
                 @FIRSTDATE  DATETIME,                                
                 @COMENAME   VARCHAR(100),
                 @OPERATORCARDS VARCHAR(30),
                 @OPERATORNAME  VARCHAR(50),
                 @COMEPICTURE   VARCHAR(256),
                 @MYONLINEFLAG  INT,                   /*���ߺ��ѻ�*/
                 @MYIDICFLAG    INT,                   /*IDIC��ʶ*/
                 @MYCARCOLOR    VARCHAR(10),           /*������ɫ*/
                 @MYBIGSMALLINT INT,
                 @MYCHECHANGBH  INT,
                 @CHARGE   MONEY ,                         /*����SFJE*/
                 @SHOUFEIKOUNAME   VARCHAR(100),           /*����SFGate��*/
                 @SHOUFEIKAHAO VARCHAR(30),          /*SFOperator*/
                 @SHOUFEIYUAN  VARCHAR(50),          /*SFOperator*/
                 @SHOUFEIFLAG  INT,                  /*�����ʶ*/
                 @IMONEY       MONEY,                 /*ʣ����*/
                 @MYMANPICTURE VARCHAR(256),
                 @bMorePaingCar BIT,
                 @QRCode  VARCHAR(50)
 AS
 DECLARE @SHOUFEIDATE DATETIME
IF @SHOUFEIFLAG=2                        /*�����շ�*/
	BEGIN
	    SET @SHOUFEIDATE=@FIRSTDATE  /*SFTime*/
	END
IF  @MYONLINEFLAG=20           /*20����/10�ѻ�*/
    BEGIN 
          IF @MYBIGSMALLINT=1   /*0�󳵳� 1С����*/
                BEGIN
		  INSERT INTO MYCARGOOUTRECORD (CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5,bMorePaingCar)           
	              SELECT CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5,bMorePaingCar FROM MYCARCOMERECORD WHERE CarparkNO=@MYCHECHANGBH AND BigSmall=@MYBIGSMALLINT AND CardNO=LTRIM(RTRIM(@NO)) 
	          DELETE FROM MYCARCOMERECORD WHERE CarparkNO=@MYCHECHANGBH AND BigSmall=@MYBIGSMALLINT AND CardNO=LTRIM(RTRIM(@NO)) 
                  END
          ELSE
                BEGIN
		  INSERT INTO MYCARGOOUTRECORD (CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5,bMorePaingCar)	             
	              SELECT CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5,bMorePaingCar FROM MYCARCOMERECORD WHERE  CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO))  
	          DELETE FROM MYCARCOMERECORD WHERE  CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO)) 
                  END               
      END
INSERT INTO MYCARCOMERECORD (CardNO,CPH,CardType,InTime,OutTime,InGateName,InOperatorCard,InOperator,InPic,InUser,SFJE,Balance,YSJE,SFTime,SFOperatorCard,SFOperator,SFGate,CarparkNO,BigSmall,bMorePaingCar,Temp4)
               VALUES (@NO,@CARCARDS,@CARDMODEL,@FIRSTDATE,@FIRSTDATE,@COMENAME,@OPERATORCARDS,@OPERATORNAME,@COMEPICTURE,@MYMANPICTURE,@CHARGE,@IMONEY,@CHARGE,@SHOUFEIDATE,@SHOUFEIKAHAO,@SHOUFEIYUAN,@SHOUFEIKOUNAME,@MYCHECHANGBH,@MYBIGSMALLINT,@bMorePaingCar,@QRCode)
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
ALTER  PROCEDURE [dbo].[JJCGETUPDATESTORE_New]            
                 @NO       VARCHAR(30),            /*CardNO*/
                 @ENDDATE  DATETIME,               /*OutTime*/
                 @CARCARDS VARCHAR(20),            /*CPH*/
                 @CHARGE   MONEY ,                 /*��ȡ���*/
                 @GONAME   VARCHAR(100),           /*OutGateName*/
                 @GOPICTURE VARCHAR(256),          /*OutPic*/
                 @COMEDATE  DATETIME,              /*InTime*/
                 @IMONEY     MONEY,                /*ʣ����*/
                 @OPERATORCARD1   VARCHAR(30),
                 @OPERATORNAME1 VARCHAR(50),
                 @MYONOFFLINE   INT,               /*�ѻ�����*/
                 @MYIDICFLAG    INT,               /*IDIC��ʶ15IC 16ID*/
                 @MYKALEIHERE    VARCHAR(20),      /*����*/
                 @MYCHEPAICOLOR  VARCHAR(10),
                 @MYBIGSMALLINT  INT,
                 @MYCHECHANGBH   INT,
                 @SHOUFEIFLAG    INT,                  /*�����ʶ*/  
                 @MYMANGOPICT    VARCHAR(256),  
                 @YSJE   MONEY ,  
                 @FreeReason VARCHAR(100),   
                 @StayTime  VARCHAR(30),
                 @QRCode  VARCHAR(50)        
 AS

   DECLARE  @CCM VARCHAR(20)   
   DECLARE  @CCC VARCHAR(20)
   DECLARE  @COMENAME VARCHAR(50)
   DECLARE  @OPERATORCARD0  VARCHAR(30)
   DECLARE  @OPERATORNAME0  VARCHAR(50)
   DECLARE  @COMEPICTURE    VARCHAR(256)
   DECLARE  @MANCOMEPICT    VARCHAR(256)
   DECLARE  @MYCHAOSHISIGN  VARCHAR(10)
   DECLARE  @MYCHAOSHIDATE  DATETIME
   DECLARE  @OPERATORCARD2  VARCHAR(30)
   DECLARE  @OPERATORNAME2 VARCHAR(50)
   DECLARE  @MYSHOUFEIKOU  VARCHAR(100)
   DECLARE  @MYCHAOSHIJINER MONEY  
   DECLARE  @MYSHOUFEIDATE  DATETIME 
   DECLARE  @MYSHOUFEIJINER MONEY
   DECLARE  @XIAOCHEDATE    DATETIME 
   DECLARE  @MYMIANFEISHIYOU VARCHAR(100)
   DECLARE  @MYZHENGJIAN    VARCHAR(256)
   DECLARE  @MYYINGSHOUER   MONEY
   DECLARE @bMorePaingCar BIT
   set @MYSHOUFEIKOU=''
            IF  ((@MYIDICFLAG=16) OR (@SHOUFEIFLAG=3))            /*IDIC��ʶ15IC 16ID  3Ϊ�����տ�*/
                BEGIN
                    IF @SHOUFEIFLAG=3
                    BEGIN
		            SELECT TOP 1 @CCM=CardType,@CCC=CPH,
		                         @COMENAME=InGateName,@OPERATORCARD0=InOperatorCard,
		                         @OPERATORNAME0=InOperator,@COMEPICTURE=InPic,@MANCOMEPICT=InUser,
	                                 @XIAOCHEDATE=InTime,@MYSHOUFEIJINER=SFJE,
	                                 @MYCHAOSHISIGN=OvertimeSymbol,@MYCHAOSHIDATE=OvertimeSFTime,
	                                 @MYCHAOSHIJINER=OvertimeSFJE,@MYSHOUFEIDATE=SFTime,
	                                 @OPERATORCARD2=SFOperatorCard,@OPERATORNAME2=SFOperator,
	                                 @MYSHOUFEIKOU=SFGate,@MYMIANFEISHIYOU=FreeReason,
	                                 @MYZHENGJIAN=ZJPic,@MYYINGSHOUER=YSJE,@bMorePaingCar=bMorePaingCar
		                 FROM MYCARCOMERECORD
		                      WHERE CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO)) AND BigSmall=@MYBIGSMALLINT ORDER BY InTime DESC  /*ID��ȡ�����һ��¼,�������������*/
                     END
                     ELSE	--16ID
                     BEGIN
                        if @MYONOFFLINE = 10  --�ѻ� ֻ���볡ʱ��С�ڳ���ʱ��ļ�¼��˳������  2016-02-19
                        begin
									SELECT TOP 1 @CCM=CardType,@CCC=CPH,
											 @COMENAME=InGateName,@OPERATORCARD0=InOperatorCard,@OPERATORCARD2=SFOperatorCard,@OPERATORNAME2=SFOperator,
											  @MYSHOUFEIKOU=SFGate,@OPERATORNAME0=InOperator,@COMEPICTURE=InPic,@MANCOMEPICT=InUser,@XIAOCHEDATE=InTime,@bMorePaingCar=bMorePaingCar,    --2016-02-19 ��� @XIAOCHEDATE=InTime                              
											  @MYCHAOSHIDATE=OvertimeSFTime,@MYSHOUFEIDATE=SFTime  --2017-08-30 ���SFTime
								   FROM MYCARCOMERECORD
										WHERE CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO)) AND BigSmall=@MYBIGSMALLINT and InTime <=@ENDDATE ORDER BY InTime 
		                  end
		                  else   --����
		                  begin
									SELECT TOP 1 @CCM=CardType,@CCC=CPH,
											 @COMENAME=InGateName,@OPERATORCARD0=InOperatorCard,@OPERATORCARD2=SFOperatorCard,@OPERATORNAME2=SFOperator,
											  @MYSHOUFEIKOU=SFGate,@OPERATORNAME0=InOperator,@COMEPICTURE=InPic,@MANCOMEPICT=InUser,@XIAOCHEDATE=InTime,@bMorePaingCar=bMorePaingCar,    --2016-02-19 ��� @XIAOCHEDATE=InTime                              
											  @MYCHAOSHIDATE=OvertimeSFTime,@MYSHOUFEIDATE=SFTime  --2017-08-30 ���SFTime
								   FROM MYCARCOMERECORD
										WHERE CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO)) AND BigSmall=@MYBIGSMALLINT ORDER BY InTime DESC  /*ID��ȡ�����һ��¼,�������������*/
		                  end
		                  set @MYYINGSHOUER = @CHARGE  --2016-02-19
                     END                     
                     DELETE FROM MYCARCOMERECORD
                              WHERE CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO)) AND InTime=@XIAOCHEDATE AND BigSmall=@MYBIGSMALLINT                  
                     IF (@XIAOCHEDATE IS NOT NULL)
                        BEGIN
                             SET @COMEDATE=@XIAOCHEDATE
                        END
                     IF (@MYSHOUFEIJINER IS NOT NULL ) AND (@SHOUFEIFLAG=3)
                        BEGIN
                                SET @CHARGE=@MYSHOUFEIJINER
                        END
                END
            ELSE
                BEGIN
                    SELECT  @CCM=CardType,@CCC=CPH,
	                     @COMENAME=InGateName,@OPERATORCARD0=InOperatorCard,@OPERATORCARD2=SFOperatorCard,@OPERATORNAME2=SFOperator,
	                     @OPERATORNAME0=InOperator,@COMEPICTURE=InPic,
                             @MANCOMEPICT=InUser,@MYZHENGJIAN=ZJPic,@MYSHOUFEIKOU=SFGate,@bMorePaingCar=bMorePaingCar,@MYCHAOSHIDATE=OvertimeSFTime,@MYSHOUFEIDATE=SFTime  --2017-08-30 ���SFTime
	                 FROM MYCARCOMERECORD
	                      WHERE CarparkNO=@MYCHECHANGBH AND InTime=@COMEDATE AND CardNO=LTRIM(RTRIM(@NO)) AND BigSmall=@MYBIGSMALLINT                         /*IC*/
                     DELETE FROM MYCARCOMERECORD
                              WHERE CarparkNO=@MYCHECHANGBH AND InTime=@COMEDATE AND CardNO=LTRIM(RTRIM(@NO)) AND BigSmall=@MYBIGSMALLINT
                    set @MYYINGSHOUER = @CHARGE  --2016-02-19
                END
            IF @CCM IS NULL 
            BEGIN
                    SET @CCM=@MYKALEIHERE
                    SET @CCC=@CARCARDS
            END            
            if  (@CCC='00000000' or @CCC='66666666' or @CCC='' or @CCC='88888888')
            BEGIN
               SET @CCC=@CARCARDS
            END         
	        IF  (@MYCHAOSHIJINER IS  NULL)  
	        BEGIN
	                SET @MYCHAOSHIJINER=0                                                         
	        END	          
            IF @MYBIGSMALLINT=1
            BEGIN
                    SET @CHARGE=0
                    SET @IMONEY=0
                    SET @MYCHAOSHIJINER=0 
                    set @MYYINGSHOUER =0    --2016-02-19
            END            
            IF @MYBIGSMALLINT=0
            BEGIN
                      IF  ((LEFT(RTRIM(@MYKALEIHERE),3)='Mth') AND (@CHARGE>0.0))
                      BEGIN
                           SET   @CCM='Tmp' + RIGHT(LTRIM(@MYKALEIHERE),1)
                           SET   @GONAME=RTRIM(@GONAME) + 'Overtime'
                      END
                      if(((LEFT(RTRIM(@MYKALEIHERE),3)='Mtp') AND (@CHARGE>0.0)))
                      BEGIN
                         SET   @CCM=@MYKALEIHERE
                      END
            END
            set     @MYMIANFEISHIYOU= @FreeReason --��ֵ���ԭ��
            set @MYYINGSHOUER=@YSJE --��ֵӦ�ս��
            INSERT INTO MYCARGOOUTRECORD (CardNO,CardType,InTime,OutTime,CPH,SFJE,SFTime,
                       InGateName,OutGateName,InOperatorCard,InOperator,InPic,InUser,OutPic,OutUser,ZJPic,Balance,OutOperatorCard,
                       OutOperator,YSJE,BigSmall,CarparkNO,FreeReason,SFGate,SFOperatorCard,SFOperator,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,StayTime,bMorePaingCar,Temp4)
                  VALUES (@NO,@CCM,@COMEDATE,@ENDDATE,@CCC,@CHARGE,@MYSHOUFEIDATE,@COMENAME,@GONAME,@OPERATORCARD0,@OPERATORNAME0,
                          @COMEPICTURE,@MANCOMEPICT,@GOPICTURE,@MYMANGOPICT,@MYZHENGJIAN,@IMONEY,@OPERATORCARD1,@OPERATORNAME1,@MYYINGSHOUER,     --@CHARGE  2016-02-19
                          @MYBIGSMALLINT,@MYCHECHANGBH,@MYMIANFEISHIYOU,@MYSHOUFEIKOU,@OPERATORCARD2,@OPERATORNAME2,@MYCHAOSHISIGN,@MYCHAOSHIDATE,@MYCHAOSHIJINER,@StayTime,@bMorePaingCar,@QRCode)
             
            IF (@MYBIGSMALLINT=1 AND @MYONOFFLINE=20)  /*10�ѻ� 20����*/
            BEGIN	
          	    INSERT INTO MYCARGOOUTRECORD (CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5,bMorePaingCar)	              
	               SELECT CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5,bMorePaingCar FROM MYCARCOMERECORD  WHERE CarparkNO=@MYCHECHANGBH AND BigSmall=@MYBIGSMALLINT AND CardNO=LTRIM(RTRIM(@NO))
	            DELETE FROM MYCARCOMERECORD WHERE CarparkNO=@MYCHECHANGBH AND BigSmall=@MYBIGSMALLINT AND CardNO=LTRIM(RTRIM(@NO))
            END 
                               
            IF (@MYBIGSMALLINT=0 AND @MYONOFFLINE=20)  /*10�ѻ� 20����*/   
            BEGIN	
          	    INSERT INTO MYCARGOOUTRECORD (CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5,bMorePaingCar)
	               SELECT CardNO,CPH,CardType,InTime,OutTime,InGateName,OutGateName,InOperatorCard,OutOperatorCard,InOperator,OutOperator,InPic,InUser,OutPic,OutUser,ZJPic,SFJE,Balance,YSJE,SFTime,SFOperator,SFOperatorCard,SFGate,OvertimeSymbol,OvertimeSFTime,OvertimeSFJE,CarparkNO,BigSmall,FreeReason,StayTime,Temp1,Temp2,Temp3,Temp4,Temp5,bMorePaingCar FROM MYCARCOMERECORD  WHERE  CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO))
	            DELETE FROM MYCARCOMERECORD WHERE CarparkNO=@MYCHECHANGBH AND CardNO=LTRIM(RTRIM(@NO))
            END
GO

---����������ר�ñ�
if NOT EXISTS (select * from   syscolumns where name='CouldPark' and id=(select id from  sysobjects where name='MYWORKSTATIONSET')) 
alter table MYWORKSTATIONSET add  CouldPark  bit  default  0;
GO

if NOT EXISTS (select * from   syscolumns where name='AndroidIP' and id=(select id from  sysobjects where name='MYGANGWEIKOUSET')) 
alter table MYGANGWEIKOUSET add  AndroidIP  varchar(50);         --2017-06-26 �����ֶΰ�׿����IP
GO


--�����볡��ʱ�� ������������в����¼ 
if OBJECT_ID('zh_EnterCar') is not null
drop table zh_EnterCar
GO
create table zh_EnterCar
(
id int identity(1,1),
orderNo varchar(50),--������yyyyMMddHHmmssfff-���ƺź�6λ ���Ƴ�Ϊ���ź�6λ
carNo varchar(50),--���ƺ� ���Ƴ�Ϊ  ���Ƴ�+����
carType varchar(50),--���� TmpA
enterTime varchar(50),--yyyy-MM-dd HH:mm:ss
gateName varchar(100),--�������
operatorName  varchar(50),--����Ա����
reserveOrderNo  varchar(50),--ԤԼ����
imgpath varchar(500),--ͼƬ·��
lockstuat int,--����״̬1Ϊ����
walletTotalMoney decimal(8,2),--�˻�Ǯ��
imgflag  int,--����0�����ϴ��ɹ����޸�Ϊ1
synflag int--����0�����ϴ��ɹ����޸�Ϊ1
)
EXECUTE sp_addextendedproperty N'MS_Description', '�����볡��ʱ�� ������������в����¼ ', N'user', N'dbo', N'table', N'zh_EnterCar', NULL, NULL 
exec sp_addextendedproperty N'MS_Description', N'����', N'user', N'dbo', N'table', N'zh_EnterCar', N'column', N'id'
exec sp_addextendedproperty N'MS_Description', N'������yyyyMMddHHmmssfff-���ƺź�6λ ���Ƴ�Ϊ���ź�6λ', N'user', N'dbo', N'table', N'zh_EnterCar', N'column', N'orderNo'
exec sp_addextendedproperty N'MS_Description', N'���ƺ� ���Ƴ�Ϊ  ���Ƴ�+����', N'user', N'dbo', N'table', N'zh_EnterCar', N'column', N'carNo'
exec sp_addextendedproperty N'MS_Description', N'������ TmpA', N'user', N'dbo', N'table', N'zh_EnterCar', N'column', N'carType'
exec sp_addextendedproperty N'MS_Description', N'�볡ʱ��:yyyy-MM-dd HH:mm:ss', N'user', N'dbo', N'table', N'zh_EnterCar', N'column', N'enterTime'
exec sp_addextendedproperty N'MS_Description', N'���������:��ڳ���1', N'user', N'dbo', N'table', N'zh_EnterCar', N'column', N'gateName'
exec sp_addextendedproperty N'MS_Description', N'����Ա����', N'user', N'dbo', N'table', N'zh_EnterCar', N'column', N'operatorName'
exec sp_addextendedproperty N'MS_Description', N'����Ա����', N'user', N'dbo', N'table', N'zh_EnterCar', N'column', N'reserveOrderNo'
exec sp_addextendedproperty N'MS_Description', N'�볡ͼƬ·��', N'user', N'dbo', N'table', N'zh_EnterCar', N'column', N'imgpath'
exec sp_addextendedproperty N'MS_Description', N'����״̬1Ϊ���� 0Ϊ����', N'user', N'dbo', N'table', N'zh_EnterCar', N'column', N'lockstuat'
exec sp_addextendedproperty N'MS_Description', N'�˻�Ǯ��', N'user', N'dbo', N'table', N'zh_EnterCar', N'column', N'walletTotalMoney'
exec sp_addextendedproperty N'MS_Description', N'�ϴ�ͼƬ״̬,Ĭ������0�����ϴ��ɹ���״̬�޸�Ϊ1', N'user', N'dbo', N'table', N'zh_EnterCar', N'column', N'imgflag'
exec sp_addextendedproperty N'MS_Description', N'�ϴ���¼״̬,Ĭ������0�����ϴ��ɹ���״̬�޸�Ϊ1', N'user', N'dbo', N'table', N'zh_EnterCar', N'column', N'synflag'
GO
--����ʶ������˹��޸� 
if OBJECT_ID('zh_UpdateCar') is not null
drop table zh_UpdateCar
GO
create table zh_UpdateCar
(
id int identity(1,1),
orderNo varchar(50),--������yyyyMMddHHmmssfff-���ƺź�6λ ���Ƴ�Ϊ���ź�6λ
carNo varchar(50),--���ƺ� ���Ƴ�Ϊ  ���Ƴ�+����
synflag int--����0�����ϴ��ɹ����޸�Ϊ1
)
EXECUTE sp_addextendedproperty N'MS_Description', '�����볡��ʱ�� ������������в����¼ ', N'user', N'dbo', N'table', N'zh_UpdateCar', NULL, NULL 
exec sp_addextendedproperty N'MS_Description', N'����', N'user', N'dbo', N'table', N'zh_UpdateCar', N'column', N'id'
exec sp_addextendedproperty N'MS_Description', N'������yyyyMMddHHmmssfff-���ƺź�6λ ���Ƴ�Ϊ���ź�6λ', N'user', N'dbo', N'table', N'zh_UpdateCar', N'column', N'orderNo'
exec sp_addextendedproperty N'MS_Description', N'���ƺ� ���Ƴ�Ϊ  ���Ƴ�+����', N'user', N'dbo', N'table', N'zh_UpdateCar', N'column', N'carNo'
exec sp_addextendedproperty N'MS_Description', N'�ϴ���¼״̬,Ĭ������0�����ϴ��ɹ���״̬�޸�Ϊ1', N'user', N'dbo', N'table', N'zh_UpdateCar', N'column', N'synflag'
GO
--�����ļ�¼��
if OBJECT_ID('zh_OutCar') is not null
drop table zh_OutCar
GO
create table zh_OutCar
(
id int identity(1,1),
orderNo varchar(50),--��ѯzh_EnterCar���е�id���ĳ�����ͬ��orderno
carNo varchar(50),--���ƺ� ���Ƴ�Ϊ  ���Ƴ�+����
carType varchar(50),--���� TmpA
outTime varchar(50),--yyyy-MM-dd HH:mm:ss
gateName varchar(100),--��������
operatorName  varchar(50),--����Ա����
imgpath varchar(500),--ͼƬ·��
totalAmount decimal(8,2), --�����ܽ��
couponId int, --�Ż�ȯID
couponMoney decimal(8,2), --�Żݽ��
walletPayMoney decimal(8,2), --Ǯ��֧�����
ycflag int,--Ĭ������0  1��ʾֻ�г���û���볡�ķ����쳣
imgflag  int,--����0�����ϴ��ɹ����޸�Ϊ1
synflag int--����0�����ϴ��ɹ����޸�Ϊ1
)
EXECUTE sp_addextendedproperty N'MS_Description', '����������ʱ�� ������������в����¼ ', N'user', N'dbo', N'table', N'zh_OutCar', NULL, NULL 
exec sp_addextendedproperty N'MS_Description', N'����', N'user', N'dbo', N'table', N'zh_OutCar', N'column', N'id'
exec sp_addextendedproperty N'MS_Description', N'������:��ѯ�����볡ʱ��zh_EnterCar���е�id���ĳ�����ͬ�����볡ʱ����ͬ��orderno', N'user', N'dbo', N'table', N'zh_OutCar', N'column', N'orderNo'
exec sp_addextendedproperty N'MS_Description', N'���ƺ� ���Ƴ�Ϊ  ���Ƴ�+����', N'user', N'dbo', N'table', N'zh_OutCar', N'column', N'carNo'
exec sp_addextendedproperty N'MS_Description', N'���� TmpA', N'user', N'dbo', N'table', N'zh_OutCar', N'column', N'carType'
exec sp_addextendedproperty N'MS_Description', N'����ʱ��:��ʽ��yyyy-MM-dd HH:mm:ss', N'user', N'dbo', N'table', N'zh_OutCar', N'column', N'OutTime'
exec sp_addextendedproperty N'MS_Description', N'����ͨ������ ��:���ڳ���1', N'user', N'dbo', N'table', N'zh_OutCar', N'column', N'gateName'
exec sp_addextendedproperty N'MS_Description', N'����Ա����', N'user', N'dbo', N'table', N'zh_OutCar', N'column', N'operatorName'
exec sp_addextendedproperty N'MS_Description', N'����ͼƬ·��', N'user', N'dbo', N'table', N'zh_OutCar', N'column', N'imgpath'
exec sp_addextendedproperty N'MS_Description', N'�����ܽ��', N'user', N'dbo', N'table', N'zh_OutCar', N'column', N'totalAmount'
exec sp_addextendedproperty N'MS_Description', N'�Ż�ȯID', N'user', N'dbo', N'table', N'zh_OutCar', N'column', N'couponId'
exec sp_addextendedproperty N'MS_Description', N'�Żݽ��', N'user', N'dbo', N'table', N'zh_OutCar', N'column', N'couponMoney'
exec sp_addextendedproperty N'MS_Description', N'Ǯ��֧�����', N'user', N'dbo', N'table', N'zh_OutCar', N'column', N'walletPayMoney'
exec sp_addextendedproperty N'MS_Description', N'Ĭ������0  1��ʾֻ�г���û���볡�ķ����쳣', N'user', N'dbo', N'table', N'zh_OutCar', N'column', N'ycflag'
exec sp_addextendedproperty N'MS_Description', N'�ϴ�ͼƬ״̬,Ĭ������0�����ϴ��ɹ���״̬�޸�Ϊ1', N'user', N'dbo', N'table', N'zh_OutCar', N'column', N'imgflag'
exec sp_addextendedproperty N'MS_Description', N'�ϴ���¼״̬,Ĭ������0�����ϴ��ɹ���״̬�޸�Ϊ1', N'user', N'dbo', N'table', N'zh_OutCar', N'column', N'synflag'
GO
---��λԤ��
if OBJECT_ID('zh_ReserveCar') is not null
drop table zh_ReserveCar
GO
create table zh_ReserveCar
(id int identity(1,1),
orderNo varchar(50),--ԤԼ������
carNo varchar(50),--���ƺ���
expirationTime varchar(50),--����ʱ��
stuat int, --״̬
alterTime varchar(50)--�յ�֪ͨʱ��
)
EXECUTE sp_addextendedproperty N'MS_Description', '�յ�ԤԼ֪ͨ���ñ����֪ͨ ', N'user', N'dbo', N'table', N'zh_ReserveCar', NULL, NULL 
exec sp_addextendedproperty N'MS_Description', N'����', N'user', N'dbo', N'table', N'zh_ReserveCar', N'column', N'id'
exec sp_addextendedproperty N'MS_Description', N'ԤԼ������', N'user', N'dbo', N'table', N'zh_ReserveCar', N'column', N'orderNo'
exec sp_addextendedproperty N'MS_Description', N'���ƺ���', N'user', N'dbo', N'table', N'zh_ReserveCar', N'column', N'carNo'
exec sp_addextendedproperty N'MS_Description', N'����ʱ�� :��ʽ��yyyy-MM-dd HH:mm:ss', N'user', N'dbo', N'table', N'zh_ReserveCar', N'column', N'expirationTime'
exec sp_addextendedproperty N'MS_Description', N'״̬', N'user', N'dbo', N'table', N'zh_ReserveCar', N'column', N'stuat'
exec sp_addextendedproperty N'MS_Description', N'�յ�֪ͨʱ�� :��ʽ��yyyy-MM-dd HH:mm:ss', N'user', N'dbo', N'table', N'zh_ReserveCar', N'column', N'alterTime'
GO
--�¿���Ϣ��
if OBJECT_ID('zh_MthCar') is not null
drop table zh_MthCar
GO
create table zh_MthCar
(id int identity(1,1),
carNo varchar(50),
carType varchar(50),
beginTime varchar(50),
endTime varchar(50),
iusseTime varchar(50),
userNo varchar(50),
userName varchar(50),--����
homeAddress varchar(50),--��ͥסַ
mobNumber varchar(50),--�ֻ�����
carSpalcesNum varchar(50),--��λ����
stuat int, --״̬
synflag int--����0�����ϴ��ɹ����޸�Ϊ1
)
EXECUTE sp_addextendedproperty N'MS_Description', '��ͨ�¿�������ñ������Ϣ״̬Ϊ1 ���ע���ͱ����ҵ�������еĳ�����Ϣ��״̬��Ϊ0 ��������ھ��½�һ����¼״̬Ϊ0', N'user', N'dbo', N'table', N'zh_MthCar', NULL, NULL 
exec sp_addextendedproperty N'MS_Description', N'���ƺ���', N'user', N'dbo', N'table', N'zh_MthCar', N'column', N'carNo'
exec sp_addextendedproperty N'MS_Description', N'�������� ��:MthA', N'user', N'dbo', N'table', N'zh_MthCar', N'column', N'carType'
exec sp_addextendedproperty N'MS_Description', N'���⳵��ʼ���� :��ʽ��yyyy-MM-dd HH:mm:ss', N'user', N'dbo', N'table', N'zh_MthCar', N'column', N'beginTime'
exec sp_addextendedproperty N'MS_Description', N'���⳵��������:��ʽ��yyyy-MM-dd HH:mm:ss', N'user', N'dbo', N'table', N'zh_MthCar', N'column', N'endTime'
exec sp_addextendedproperty N'MS_Description', N'���⳵��������:��ʽ��yyyy-MM-dd HH:mm:ss', N'user', N'dbo', N'table', N'zh_MthCar', N'column', N'iusseTime'
exec sp_addextendedproperty N'MS_Description', N'�û������� ����', N'user', N'dbo', N'table', N'zh_MthCar', N'column', N'userNo'
exec sp_addextendedproperty N'MS_Description', N'��ͥסַ', N'user', N'dbo', N'table', N'zh_MthCar', N'column', N'homeAddress'
exec sp_addextendedproperty N'MS_Description', N'�ֻ�����', N'user', N'dbo', N'table', N'zh_MthCar', N'column', N'mobNumber'
exec sp_addextendedproperty N'MS_Description', N'��λ����', N'user', N'dbo', N'table', N'zh_MthCar', N'column', N'carSpalcesNum'
exec sp_addextendedproperty N'MS_Description', N'״̬1Ϊ��Ч 0ΪʧЧ', N'user', N'dbo', N'table', N'zh_MthCar', N'column', N'stuat'
exec sp_addextendedproperty N'MS_Description', N'�ϴ�״̬,Ĭ������0�����ϴ��ɹ���״̬�޸�Ϊ1', N'user', N'dbo', N'table', N'zh_MthCar', N'column', N'synflag'
GO
--��ֵ���ڱ�
if OBJECT_ID('zh_MthCarCharge') is not null
drop table zh_MthCarCharge
GO
create table zh_MthCarCharge
(id int identity(1,1),
carNo varchar(50),
beginTime varchar(50),--��ʼ����
endTime varchar(50),--��������
chargeTime varchar(50),--�ɷ�ʱ��
chargeMoney money,--�ɷѽ��
synflag int--����0�����ϴ��ɹ����޸�Ϊ1
)
EXECUTE sp_addextendedproperty N'MS_Description', '���⳵��ֵ����Ҫ��ñ������Ϣ', N'user', N'dbo', N'table', N'zh_MthCarCharge', NULL, NULL 
exec sp_addextendedproperty N'MS_Description', N'���ƺ���', N'user', N'dbo', N'table', N'zh_MthCarCharge', N'column', N'carNo'
exec sp_addextendedproperty N'MS_Description', N'��ʼ���� ��:MthA', N'user', N'dbo', N'table', N'zh_MthCarCharge', N'column', N'beginTime'
exec sp_addextendedproperty N'MS_Description', N'�������� ��:MthA', N'user', N'dbo', N'table', N'zh_MthCarCharge', N'column', N'endTime'
exec sp_addextendedproperty N'MS_Description', N'�ɷ�ʱ�� ��:MthA', N'user', N'dbo', N'table', N'zh_MthCarCharge', N'column', N'chargeTime'
exec sp_addextendedproperty N'MS_Description', N'�ɷѽ�� ��:MthA', N'user', N'dbo', N'table', N'zh_MthCarCharge', N'column', N'chargeMoney'
exec sp_addextendedproperty N'MS_Description', N'�ϴ�״̬,Ĭ������0�����ϴ��ɹ���״̬�޸�Ϊ1 ��:MthA', N'user', N'dbo', N'table', N'zh_MthCarCharge', N'column', N'synflag'
GO
--�û���
if OBJECT_ID('zh_Person') is not null
drop table zh_Person
GO
create table zh_Person
(id int identity(1,1),
userNo varchar(50),--�û�����
userName varchar(50),--����
sex varchar(50),--�Ա�
homeAddress varchar(50),--��ͥסַ
mobNumber varchar(50),--�ֻ�����
carSpalcesNum varchar(50),--��λ����
synflag int--����0�����ϴ��ɹ����޸�Ϊ1
)
EXECUTE sp_addextendedproperty N'MS_Description', '�û���', N'user', N'dbo', N'table', N'zh_Person', NULL, NULL 
exec sp_addextendedproperty N'MS_Description', N'�û�����', N'user', N'dbo', N'table', N'zh_Person', N'column', N'userNo'
exec sp_addextendedproperty N'MS_Description', N'���� ��:����', N'user', N'dbo', N'table', N'zh_Person', N'column', N'userName'
exec sp_addextendedproperty N'MS_Description', N'�Ա�', N'user', N'dbo', N'table', N'zh_Person', N'column', N'sex'
exec sp_addextendedproperty N'MS_Description', N'��ͥסַ', N'user', N'dbo', N'table', N'zh_Person', N'column', N'homeAddress'
exec sp_addextendedproperty N'MS_Description', N'�ֻ�����', N'user', N'dbo', N'table', N'zh_Person', N'column', N'mobNumber'
exec sp_addextendedproperty N'MS_Description', N'��λ����', N'user', N'dbo', N'table', N'zh_Person', N'column', N'carSpalcesNum'
exec sp_addextendedproperty N'MS_Description', N'�ϴ�״̬,Ĭ������0�����ϴ��ɹ���״̬�޸�Ϊ1 ', N'user', N'dbo', N'table', N'zh_Person', N'column', N'synflag'
GO
--�Ż�ȯ��
if OBJECT_ID('zh_Coupon') is not null
drop table zh_Coupon
GO
create table zh_Coupon
(id int identity(1,1),
orderNo varchar(50),--�������
carNo varchar(50),--���ƺ���
couponType varchar(50),--�Ż�����101������102�Ż�ʱ��103�����Ż�
couponValue varchar(50),--�Ż�ֵ
invalidTime datetime,--ʧЧʱ��
couponId varchar(50),--�Ż�ȯID
merchantId varchar(50),--�̼�ID
merchantName varchar(50),--�̼�����
couponStatus int,--�Ż�ȯ״̬
alterTime  varchar(50)--�·�ʱ��
)
EXECUTE sp_addextendedproperty N'MS_Description', '�Ż�ȯ��', N'user', N'dbo', N'table', N'zh_Coupon', NULL, NULL 
exec sp_addextendedproperty N'MS_Description', N'�������', N'user', N'dbo', N'table', N'zh_Coupon', N'column', N'orderNo'
exec sp_addextendedproperty N'MS_Description', N'���ƺ���', N'user', N'dbo', N'table', N'zh_Coupon', N'column', N'carNo'
exec sp_addextendedproperty N'MS_Description', N'�Ż�����101������102�Ż�ʱ��103�����Ż�', N'user', N'dbo', N'table', N'zh_Coupon', N'column', N'couponType'
exec sp_addextendedproperty N'MS_Description', N'�Ż�ֵ', N'user', N'dbo', N'table', N'zh_Coupon', N'column', N'couponValue'
exec sp_addextendedproperty N'MS_Description', N'ʧЧʱ��', N'user', N'dbo', N'table', N'zh_Coupon', N'column', N'invalidTime'
exec sp_addextendedproperty N'MS_Description', N'�Ż�ȯID', N'user', N'dbo', N'table', N'zh_Coupon', N'column', N'couponId'
exec sp_addextendedproperty N'MS_Description', N'�̼�ID', N'user', N'dbo', N'table', N'zh_Coupon', N'column', N'merchantId'
exec sp_addextendedproperty N'MS_Description', N'�̼�����', N'user', N'dbo', N'table', N'zh_Coupon', N'column', N'merchantName'
exec sp_addextendedproperty N'MS_Description', N'�Ż�ȯ״̬', N'user', N'dbo', N'table', N'zh_Coupon', N'column', N'couponStatus'
exec sp_addextendedproperty N'MS_Description', N'�·�ʱ��', N'user', N'dbo', N'table', N'zh_Coupon', N'column', N'alterTime'
GO
if OBJECT_ID('zh_SentryBox') is not null
drop table zh_SentryBox
GO
create table zh_SentryBox
(id int identity(1,1),
sentrybox_No varchar(50),--��ͤ����
vehichlejson varchar(2000),--������Ϣjson�ַ���
eidtTime varchar(50),--�޸�����
synflag int--����0�����ϴ��ɹ����޸�Ϊ1
)
EXECUTE sp_addextendedproperty N'MS_Description', '��ͤ������Ϣ��', N'user', N'dbo', N'table', N'zh_SentryBox', NULL, NULL 
exec sp_addextendedproperty N'MS_Description', N'��ͤ���', N'user', N'dbo', N'table', N'zh_SentryBox', N'column', N'sentrybox_No'
exec sp_addextendedproperty N'MS_Description', N'������Ϣjson�ַ���', N'user', N'dbo', N'table', N'zh_SentryBox', N'column', N'vehichlejson'
exec sp_addextendedproperty N'MS_Description', N'�޸�����', N'user', N'dbo', N'table', N'zh_SentryBox', N'column', N'eidtTime'
exec sp_addextendedproperty N'MS_Description', N'����0�����ϴ��ɹ����޸�Ϊ1', N'user', N'dbo', N'table', N'zh_SentryBox', N'column', N'synflag'
GO
if OBJECT_ID('zh_EstCarEnter') is not null
drop table zh_EstCarEnter
GO
create table zh_EstCarEnter
(id int identity(1,1),
orderNo varchar(50),--Ԥ�볡������
carNo  varchar(50),--���⳵��
carType varchar(50),--��������
enterTime dateTime,--�볡ʱ��
imgpath varchar(500),--ͼƬ·��
gateName varchar(50),--�������
synflag int--����0�����ϴ��ɹ����޸�Ϊ1
)
EXECUTE sp_addextendedproperty N'MS_Description', 'Ԥ�볡������Ϣ��', N'user', N'dbo', N'table', N'zh_EstCarEnter', NULL, NULL 
exec sp_addextendedproperty N'MS_Description', N'Ԥ�볡������', N'user', N'dbo', N'table', N'zh_EstCarEnter', N'column', N'orderNo'
exec sp_addextendedproperty N'MS_Description', N'���ͺ�', N'user', N'dbo', N'table', N'zh_EstCarEnter', N'column', N'carType'
exec sp_addextendedproperty N'MS_Description', N'���⳵��', N'user', N'dbo', N'table', N'zh_EstCarEnter', N'column', N'carNo'
exec sp_addextendedproperty N'MS_Description', N'�볡ʱ��', N'user', N'dbo', N'table', N'zh_EstCarEnter', N'column', N'enterTime'
exec sp_addextendedproperty N'MS_Description', N'ͼƬ·��', N'user', N'dbo', N'table', N'zh_EstCarEnter', N'column', N'imgpath'
exec sp_addextendedproperty N'MS_Description', N'�������', N'user', N'dbo', N'table', N'zh_EstCarEnter', N'column', N'gateName'
exec sp_addextendedproperty N'MS_Description', N'����0�����ϴ��ɹ����޸�Ϊ1', N'user', N'dbo', N'table', N'zh_EstCarEnter', N'column', N'synflag'
GO
if OBJECT_ID('zh_EstCarOut') is not null
drop table zh_EstCarOut
GO
create table zh_EstCarOut
(id int identity(1,1),
orderNo varchar(50),--Ԥ����������
carNo  varchar(50),--���⳵��
carType varchar(50),--��������
outTime dateTime,--����ʱ��
imgpath varchar(500),--ͼƬ·��
gateName varchar(50),--��������
ctlNo  int,--���ƻ�����
synflag int--����0�����ϴ��ɹ����޸�Ϊ1
)
EXECUTE sp_addextendedproperty N'MS_Description', 'Ԥ�볡������Ϣ��', N'user', N'dbo', N'table', N'zh_EstCarOut', NULL, NULL 
exec sp_addextendedproperty N'MS_Description', N'Ԥ�볡������', N'user', N'dbo', N'table', N'zh_EstCarOut', N'column', N'orderNo'
exec sp_addextendedproperty N'MS_Description', N'���ͺ�', N'user', N'dbo', N'table', N'zh_EstCarOut', N'column', N'carType'
exec sp_addextendedproperty N'MS_Description', N'���⳵��', N'user', N'dbo', N'table', N'zh_EstCarOut', N'column', N'carNo'
exec sp_addextendedproperty N'MS_Description', N'�볡ʱ��', N'user', N'dbo', N'table', N'zh_EstCarOut', N'column', N'outTime'
exec sp_addextendedproperty N'MS_Description', N'ͼƬ·��', N'user', N'dbo', N'table', N'zh_EstCarOut', N'column', N'imgpath'
exec sp_addextendedproperty N'MS_Description', N'�������', N'user', N'dbo', N'table', N'zh_EstCarOut', N'column', N'gateName'
exec sp_addextendedproperty N'MS_Description', N'���ƻ�����', N'user', N'dbo', N'table', N'zh_EstCarOut', N'column', N'ctlNo'
exec sp_addextendedproperty N'MS_Description', N'����0�����ϴ��ɹ����޸�Ϊ1', N'user', N'dbo', N'table', N'zh_EstCarOut', N'column', N'synflag'
GO
--��ʱ���ɷѱ�
if OBJECT_ID('zh_PayOrder') is not null
drop table zh_PayOrder
GO
create table zh_PayOrder
(
id int identity(1,1),
payOrderNo varchar(50),
orderNo varchar(50),
carNo varchar(50),
carType varchar(50),
payTime varchar(50),--֧��ʱ��
payMoney money,--�ɷѽ��
payType varchar(50),--֧����ʽ
enterTime  varchar(50),--�볡ʱ��
synflag int --����0�����ϴ��ɹ����޸�Ϊ1
)
EXECUTE sp_addextendedproperty N'MS_Description', '��ʱ���ɷѱ����Ҫ��ñ������Ϣ', N'user', N'dbo', N'table', N'zh_PayOrder', NULL, NULL 
exec sp_addextendedproperty N'MS_Description', N'֧����������', N'user', N'dbo', N'table', N'zh_PayOrder', N'column', N'payOrderNo'
exec sp_addextendedproperty N'MS_Description', N'ͣ������', N'user', N'dbo', N'table', N'zh_PayOrder', N'column', N'orderNo'
exec sp_addextendedproperty N'MS_Description', N'���ƺ���', N'user', N'dbo', N'table', N'zh_PayOrder', N'column', N'carNo'
exec sp_addextendedproperty N'MS_Description', N'��������', N'user', N'dbo', N'table', N'zh_PayOrder', N'column', N'carType'
exec sp_addextendedproperty N'MS_Description', N'֧��ʱ��', N'user', N'dbo', N'table', N'zh_PayOrder', N'column', N'payTime'
exec sp_addextendedproperty N'MS_Description', N'֧�����', N'user', N'dbo', N'table', N'zh_PayOrder', N'column', N'payMoney'
exec sp_addextendedproperty N'MS_Description', N'�볡ʱ��', N'user', N'dbo', N'table', N'zh_PayOrder', N'column', N'enterTime'
exec sp_addextendedproperty N'MS_Description', N'�ϴ�״̬,Ĭ������0�����ϴ��ɹ���״̬�޸�Ϊ1 ��:MthA', N'user', N'dbo', N'table', N'zh_PayOrder', N'column', N'synflag'
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[My_Authorization]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[My_Authorization](
	[bAuthorization] [bit] NULL
) ON [PRIMARY]
END
GO
--2017-08-31 th ����֧������Կ����
/****** Object:  Table [dbo].[My_ZFBKeySet]    Script Date: 08/31/2017 16:52:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[dbo].[My_ZFBKeySet]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [dbo].[My_ZFBKeySet](
	[alipay_rsa_public_key] [nvarchar](4000) NULL,
	[rsa_private_key] [nvarchar](4000) NULL,
	[Rs1] [nvarchar](4000) NULL,
	[Rs2] [nvarchar](4000) NULL,
	[Rs3] [nvarchar](4000) NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
 CONSTRAINT [PK_My_ZFBKeySet] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO



---============================================== ͨ�����ñ� czh 2017-11-14 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
IF NOT EXISTS (SELECT * FROM dbo.sysobjects WHERE id = OBJECT_ID(N'[InOutPermition]') AND OBJECTPROPERTY(id, N'IsUserTable') = 1)
BEGIN
CREATE TABLE [InOutPermition](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[CtrlNumbers] [nvarchar](100) NOT NULL,
	[CardTypes] [nvarchar](100) NOT NULL,
	[WeekDays] [nvarchar](50) NOT NULL,
	[TimeBegin] [datetime] NOT NULL,
	[TimeEnd] [datetime] NOT NULL,
 CONSTRAINT [PK_InOutPermition] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
) ON [PRIMARY]
) ON [PRIMARY]
END
GO
---============================================ ͨ�����ñ� czh 2017-11-14 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


--2017-11-22
if NOT EXISTS (select * from   syscolumns where name='freeReason' and id=(select id from  sysobjects where name='zh_OutCar')) 
alter table zh_OutCar add  freeReason  varchar(255);
GO

--2017-12-25
if NOT EXISTS (select * from   syscolumns where name='bStartReservation' and id=(select id from  sysobjects where name='MYCHECHANGXITONGSET')) 
alter table MYCHECHANGXITONGSET add  bStartReservation  bit  default  1;
GO



---==============================================�⼸��ʼ�շ��������� ==================================================
--2015-10-20 ������ݿ�汾��  
if not exists (select * from dbo.sysobjects where id = object_id(N'[tblDBVersion]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
begin
	CREATE TABLE [tblDBVersion] (
		[DBVer] [int] NULL CONSTRAINT [DF_tblDBVersion_DBVer] DEFAULT (0),
		[upd_Time] [datetime] NULL	
	) ON [PRIMARY]
end 
GO

--+++++++++++++++++++������������ݿ⣬�ǵø�������İ汾�� ++++++++++++++++++++++++
insert into tblDBVersion (DBVer,upd_Time) values(18, getDate()) 
GO

--2015-10-10 ��5.1���µ��շѽű�����
--2015-10-16 ���ı����շ�JJCGETMONEYBEIJING������ҹ�ֽ��ͣ�ţ�ͣ��ʱ�䲻����ҹ�ֽ��ǰ��1����ʱ��λ�����ֽ��ǰ���շѱ�׼�ͼ�ʱ��λ�շ�
--2015-10-19 ����JJCT_GETMONEY�ı�׼�ְ���ҹ����շѣ��ϸ񰴶��շѣ�ֻ��һ���׼�ʱ��ÿ����������շѶ����İ�����շ���
--2015-10-20 ������ݿ�汾��
--2015-10-23 ���ı����շѣ�JJCGETMONEYBEIJING�����ϸ񰴶��շ�
--2015-11-05 IC�����������ֶ� �½������ڡ��½������ڡ��ϴν������ڣ�������ͼ[JJCRICMONEY]
--                MYCARCOMERECORD��MYCARGOOUTRECORD��MYRECORDMEMORY��MYRECORDQUERY ������5���ֶΣ�ID��StayTime��Temp1��Temp2��Temp3,Temp4,Temp5
--                ���´洢����[JJCTGETWRITESTORE]��[JJCGETUPDATESTORE]��[JJCGETDATE]��[JJCGETDATAMONEY]����ͼvMycargooutrecord��vFileMycargooutrecord
--2015-11-14 MYWORKSTATIONSET�������ֶ�[AutotoCheMointor]�����桰��¼�Զ������߼�ش��ڡ�������
--2015-11-18 Ϊ�˼���TCPһ��ͨ��MYWORKSTATIONSET�������˼����ֶ�,MYFAXINGSSUE�������������ֶ�,������[VMYFAXINGSSUE]
--                ������[JJCCOMERECORD]�ġ���ѽ�ͳ��ʱ������
--2015-11-20 ����CARQUERYNOWS_FX����ѯ���б�ĳ��ƺţ���Ϊ3�ֿ���һ���ѯ
--2015-11-21 �������ñ�[MYCHECHANGXITONGSET],�����ֶ�ImageAutoDel(ͼƬ�Զ�ɾ��)��ImageAutoDelTime(�Զ�ɾ��ʱ���)
--2015-12-03 [VMYFAXINGSSUEType] ����ֶ�:CPHDownloadSignal
--2015-12-05 [JJCT_GETMONEY]���趨ʱ���շѣ����ӹ�ҹ�շѽ��
--2015-12-08 MYWORKSTATIONSET �� ����APP����ͣ���ֶ�
--2015-12-11 MYFAXINGSSUE ��CPHDownloadSignal DownloadSignal ��Ĭ��ֵ  MYZBPARK ����30��Ĭ�ϻ���MYCardType�����ӿ���'������Ӧ'
--2016-04-06 ���ӽ��Ӱ�MYjiaojieWorkTable�� �����Ӱ౨��Ĳ�ѯ����,����ע�����MYCarCancelTable
--2016-04-07 ����ע�����Ĳ�ѯ����
--2016-05-20 ���ӱ�[MyFreeCPH]�����ھƵ����
--				  ��MyFreeCPH�������ֶ�Operator��PCName
--                ��MYZBPARKAutoCPH�����ֶ�Operator
--2016-06-16 
-- dbo.JJCT_DayMoneyLimit_0to0_V1 �� dbo.JJCT_DayMoneyLimit_24H_V1 ���С����λ���Ĳ���
-- [JJCGETUPDATESTORE] ����IC ����ͳ������������,ID����ѯ�볡��¼�������ﲻ�Ա��볡ʱ��
-- ����JJCT_GETMONEY�����趨ʱ���շѣ�����Ĳ���ÿ������շ�����
-- ����[JJCT_DayMoneyLimit_0to0_V1]��[JJCT_DayMoneyLimit_24H_V1]���������ٿ��ж�
-- ����[JJCT_DayMoneyLimit_0to0_V1]��[JJCT_DayMoneyLimit_24H_V1]�����Ĺ�ҹ�շѵļ��㷽ʽ
-- ���������շ�JJCT_GETMONEY_SZ�Ĳ�����
---���ӳ����������JJCGETUPDATESTORE_New
--����CARQUERYNOWS2��CARQUERYNOWS_FX, WJ��ͷ�ĳ�����8λ��ֻ�ԱȺ�5λ
--2016-09-27 V.2 MYCHECHANGXITONGSET�������ֶ�MonthOutChargeType���¿���������Ӧ��ʱ���շѣ� �����շѲ�ѯ ���ӡ���Ա��š��͡���Ա�������Ĳ�ѯ����
--2016-11-25 �������ݿ� CARQUERYNOWS_Come
--2017-03-22 ����JJCGETUPDATESssTORE_New ����ԭʼ��¼���鵵����������ֶ�  bMorePaingCar bDZ strDZ ���� JJCTGETWRITESTORE_New  ������ͼ vMycargooutrecord
--2017-07-07 V.8 ����JJCT_GETMONEY������ҹ����շѣ�ÿ������շѲ��ܴ��ڰ������+ҹ�����
--2017-08-05 V.11 MYCARGOOUTRECORDREPORT������⿨����ֶ�[ITEMPMONEY]��int ��Ϊ money ����
--2017-08-30 V.12 ����JJCGETUPDATESTORE_New �����볡��¼��SFTime���浽������¼��
--2017-08-31 V.13 th ����֧������Կ���� My_ZFBKeySet
--2017-11-09 V.14 [VMYFAXINGSSUE]��[vMycargooutrecord]��vFileMycargooutrecord ��� HomeAddress �ֶ�
--2017-11-14 V.15 ����ͨ�����ñ�[InOutPermition]
--2017-11-22 V.16 �Ƴ����������������ԭ���ֶ�
--2017-12-04 V.17 zh_PayOrder�� ���� ֧����ʽ �ֶΣ����������Ӳ�ѯ��������ͥסַ��֧����ʽ
--2017-12-07      JJCT_GETMONEY �ְ���ҹ����շѣ����ӡ��ϸ񰴶��շ�(���ж�ÿ������޶�)���Ĺ���
--2017-12-22 V.18 ����[JJCT_DayMoneyLimit_0to0_V1]��[JJCT_DayMoneyLimit_24H_V1],����Mth��ΪTmp
