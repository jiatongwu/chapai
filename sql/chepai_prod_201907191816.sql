/*
Navicat SQL Server Data Transfer

Source Server         : localhost
Source Server Version : 105000
Source Host           : localhost:1433
Source Database       : chepai_prod
Source Schema         : dbo

Target Server Type    : SQL Server
Target Server Version : 105000
File Encoding         : 65001

Date: 2019-07-19 18:17:02
*/


-- ----------------------------
-- Table structure for log
-- ----------------------------
DROP TABLE [dbo].[log]
GO
CREATE TABLE [dbo].[log] (
[user_id] int NOT NULL ,
[operate_name] varchar(500) NOT NULL ,
[createtime] datetime NULL DEFAULT NULL ,
[id] int NOT NULL IDENTITY(1,1) ,
[user_agent] varchar(1000) NULL DEFAULT NULL ,
[client_ip] varchar(500) NULL DEFAULT NULL ,
[operate_username] varchar(100) NULL ,
[operate_user_phone] varchar(100) NULL ,
[operate_cph] varchar(100) NULL ,
[validEnd] datetime NULL 
)
GO
DBCC CHECKIDENT(N'[dbo].[log]', RESEED, 20)
GO

-- ----------------------------
-- Records of log
-- ----------------------------
SET IDENTITY_INSERT [dbo].[log] ON
GO


SET IDENTITY_INSERT [dbo].[log] OFF
GO

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE [dbo].[role]
GO
CREATE TABLE [dbo].[role] (
[id] int NOT NULL IDENTITY(1,1) ,
[name] nvarchar(32) NULL ,
[code] nvarchar(32) NULL ,
[describe] nvarchar(64) NULL ,
[time] nvarchar(32) NULL ,
[state] int NULL 
)


GO
DBCC CHECKIDENT(N'[dbo].[role]', RESEED, 4)
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'dbo', 
'TABLE', N'role', 
'COLUMN', N'id')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'角色id'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'role'
, @level2type = 'COLUMN', @level2name = N'id'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'角色id'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'role'
, @level2type = 'COLUMN', @level2name = N'id'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'dbo', 
'TABLE', N'role', 
'COLUMN', N'name')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'名称'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'role'
, @level2type = 'COLUMN', @level2name = N'name'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'名称'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'role'
, @level2type = 'COLUMN', @level2name = N'name'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'dbo', 
'TABLE', N'role', 
'COLUMN', N'code')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'值'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'role'
, @level2type = 'COLUMN', @level2name = N'code'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'值'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'role'
, @level2type = 'COLUMN', @level2name = N'code'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'dbo', 
'TABLE', N'role', 
'COLUMN', N'describe')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'描述'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'role'
, @level2type = 'COLUMN', @level2name = N'describe'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'描述'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'role'
, @level2type = 'COLUMN', @level2name = N'describe'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'dbo', 
'TABLE', N'role', 
'COLUMN', N'time')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'时间'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'role'
, @level2type = 'COLUMN', @level2name = N'time'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'时间'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'role'
, @level2type = 'COLUMN', @level2name = N'time'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'dbo', 
'TABLE', N'role', 
'COLUMN', N'state')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'状态  1：可用 2：禁用'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'role'
, @level2type = 'COLUMN', @level2name = N'state'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'状态  1：可用 2：禁用'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'role'
, @level2type = 'COLUMN', @level2name = N'state'
GO

-- ----------------------------
-- Records of role
-- ----------------------------
SET IDENTITY_INSERT [dbo].[role] ON
GO
INSERT INTO [dbo].[role] ([id], [name], [code], [describe], [time], [state]) VALUES (N'1', N'超级管理员', N'super_admin', null, null, N'1')
GO
GO
INSERT INTO [dbo].[role] ([id], [name], [code], [describe], [time], [state]) VALUES (N'2', N'管理员', N'admin_user', null, null, N'1')
GO
GO
INSERT INTO [dbo].[role] ([id], [name], [code], [describe], [time], [state]) VALUES (N'3', N'普通用户', N'normal_user', null, null, N'1')
GO
GO
INSERT INTO [dbo].[role] ([id], [name], [code], [describe], [time], [state]) VALUES (N'4', N'巡逻人员 ', N'xuluo_user', null, null, N'1')
GO
GO
SET IDENTITY_INSERT [dbo].[role] OFF
GO

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE [dbo].[role_permission]
GO
CREATE TABLE [dbo].[role_permission] (
[id] int NOT NULL IDENTITY(1,1) ,
[permission_id] int NULL ,
[role_id] int NULL ,
[menu_attribute] int NULL 
)


GO

-- ----------------------------
-- Records of role_permission
-- ----------------------------
SET IDENTITY_INSERT [dbo].[role_permission] ON
GO
SET IDENTITY_INSERT [dbo].[role_permission] OFF
GO

-- ----------------------------
-- Table structure for shenpi
-- ----------------------------
DROP TABLE [dbo].[shenpi]
GO
CREATE TABLE [dbo].[shenpi] (
[name] varchar(500) NOT NULL ,
[autoname] varchar(500) NOT NULL ,
[createtime] datetime NULL DEFAULT NULL ,
[updatetime] datetime NULL DEFAULT NULL ,
[ID] int NOT NULL IDENTITY(1,1) ,
[user_id] int NOT NULL ,
[status] int NULL 
)


GO

-- ----------------------------
-- Records of shenpi
-- ----------------------------
SET IDENTITY_INSERT [dbo].[shenpi] ON
GO
SET IDENTITY_INSERT [dbo].[shenpi] OFF
GO

-- ----------------------------
-- Table structure for shenpi_detail
-- ----------------------------
DROP TABLE [dbo].[shenpi_detail]
GO
CREATE TABLE [dbo].[shenpi_detail] (
[person_name] varchar(500) NOT NULL ,
[phone] varchar(500) NOT NULL ,
[home_address] varchar(500) NULL DEFAULT NULL ,
[chepaihao] varchar(500) NOT NULL ,
[chexing] varchar(500) NOT NULL ,
[valid_starttime] datetime NOT NULL ,
[valid_endtime] varchar(500) NOT NULL ,
[car_remark] varchar(500) NOT NULL ,
[ID] int NOT NULL IDENTITY(1,1) ,
[shenpi_id] int NOT NULL 
)


GO

-- ----------------------------
-- Records of shenpi_detail
-- ----------------------------
SET IDENTITY_INSERT [dbo].[shenpi_detail] ON
GO
SET IDENTITY_INSERT [dbo].[shenpi_detail] OFF
GO

-- ----------------------------
-- Table structure for sms_template
-- ----------------------------
DROP TABLE [dbo].[sms_template]
GO
CREATE TABLE [dbo].[sms_template] (
[name] varchar(500) NOT NULL ,
[content] varchar(4000) NOT NULL ,
[createtime] datetime NOT NULL ,
[id] int NOT NULL IDENTITY(1,1) 
)


GO
DBCC CHECKIDENT(N'[dbo].[sms_template]', RESEED, 2)
GO

-- ----------------------------
-- Records of sms_template
-- ----------------------------
SET IDENTITY_INSERT [dbo].[sms_template] ON
GO
INSERT INTO [dbo].[sms_template] ([name], [content], [createtime], [id]) VALUES (N'短信模板01', N'${personName}车牌${cph}，已经违规，请及时挪走。', N'2019-07-19 10:28:53.937', N'1')
GO
GO
SET IDENTITY_INSERT [dbo].[sms_template] OFF
GO

-- ----------------------------
-- Table structure for user_car_create
-- ----------------------------
DROP TABLE [dbo].[user_car_create]
GO
CREATE TABLE [dbo].[user_car_create] (
[user_id] int NOT NULL ,
[car_id] int NOT NULL ,
[createtime] datetime NOT NULL ,
[id] int NOT NULL IDENTITY(1,1) 
)


GO
DBCC CHECKIDENT(N'[dbo].[user_car_create]', RESEED, 33)
GO

-- ----------------------------
-- Records of user_car_create
-- ----------------------------
SET IDENTITY_INSERT [dbo].[user_car_create] ON
GO
INSERT INTO [dbo].[user_car_create] ([user_id], [car_id], [createtime], [id]) VALUES (N'2', N'170', N'2019-07-16 14:27:39.987', N'21')
GO
GO
INSERT INTO [dbo].[user_car_create] ([user_id], [car_id], [createtime], [id]) VALUES (N'2', N'171', N'2019-07-16 14:27:48.550', N'22')
GO
GO
INSERT INTO [dbo].[user_car_create] ([user_id], [car_id], [createtime], [id]) VALUES (N'2', N'172', N'2019-07-16 14:27:48.627', N'23')
GO
GO
INSERT INTO [dbo].[user_car_create] ([user_id], [car_id], [createtime], [id]) VALUES (N'2', N'173', N'2019-07-16 14:27:48.693', N'24')
GO
GO
INSERT INTO [dbo].[user_car_create] ([user_id], [car_id], [createtime], [id]) VALUES (N'2', N'174', N'2019-07-16 14:27:48.747', N'25')
GO
GO
INSERT INTO [dbo].[user_car_create] ([user_id], [car_id], [createtime], [id]) VALUES (N'2', N'175', N'2019-07-16 14:27:48.823', N'26')
GO
GO
INSERT INTO [dbo].[user_car_create] ([user_id], [car_id], [createtime], [id]) VALUES (N'2', N'176', N'2019-07-16 14:27:48.880', N'27')
GO
GO
INSERT INTO [dbo].[user_car_create] ([user_id], [car_id], [createtime], [id]) VALUES (N'2', N'177', N'2019-07-16 14:27:48.950', N'28')
GO
GO
INSERT INTO [dbo].[user_car_create] ([user_id], [car_id], [createtime], [id]) VALUES (N'2', N'178', N'2019-07-16 14:27:49.007', N'29')
GO
GO
INSERT INTO [dbo].[user_car_create] ([user_id], [car_id], [createtime], [id]) VALUES (N'2', N'179', N'2019-07-16 14:27:49.090', N'30')
GO
GO
INSERT INTO [dbo].[user_car_create] ([user_id], [car_id], [createtime], [id]) VALUES (N'2', N'180', N'2019-07-16 17:07:03.397', N'31')
GO
GO
INSERT INTO [dbo].[user_car_create] ([user_id], [car_id], [createtime], [id]) VALUES (N'2', N'181', N'2019-07-18 17:57:18.917', N'32')
GO
GO
INSERT INTO [dbo].[user_car_create] ([user_id], [car_id], [createtime], [id]) VALUES (N'2', N'182', N'2019-07-18 18:26:09.893', N'33')
GO
GO
SET IDENTITY_INSERT [dbo].[user_car_create] OFF
GO

-- ----------------------------
-- Table structure for user_person_create
-- ----------------------------
DROP TABLE [dbo].[user_person_create]
GO
CREATE TABLE [dbo].[user_person_create] (
[user_id] int NOT NULL ,
[person_id] int NOT NULL ,
[createtime] datetime NOT NULL ,
[id] int NOT NULL IDENTITY(1,1) 
)


GO
DBCC CHECKIDENT(N'[dbo].[user_person_create]', RESEED, 33)
GO

-- ----------------------------
-- Records of user_person_create
-- ----------------------------
SET IDENTITY_INSERT [dbo].[user_person_create] ON
GO
INSERT INTO [dbo].[user_person_create] ([user_id], [person_id], [createtime], [id]) VALUES (N'2', N'178', N'2019-07-16 14:27:39.920', N'21')
GO
GO
INSERT INTO [dbo].[user_person_create] ([user_id], [person_id], [createtime], [id]) VALUES (N'2', N'179', N'2019-07-16 14:27:48.523', N'22')
GO
GO
INSERT INTO [dbo].[user_person_create] ([user_id], [person_id], [createtime], [id]) VALUES (N'2', N'180', N'2019-07-16 14:27:48.600', N'23')
GO
GO
INSERT INTO [dbo].[user_person_create] ([user_id], [person_id], [createtime], [id]) VALUES (N'2', N'181', N'2019-07-16 14:27:48.673', N'24')
GO
GO
INSERT INTO [dbo].[user_person_create] ([user_id], [person_id], [createtime], [id]) VALUES (N'2', N'182', N'2019-07-16 14:27:48.727', N'25')
GO
GO
INSERT INTO [dbo].[user_person_create] ([user_id], [person_id], [createtime], [id]) VALUES (N'2', N'183', N'2019-07-16 14:27:48.793', N'26')
GO
GO
INSERT INTO [dbo].[user_person_create] ([user_id], [person_id], [createtime], [id]) VALUES (N'2', N'184', N'2019-07-16 14:27:48.857', N'27')
GO
GO
INSERT INTO [dbo].[user_person_create] ([user_id], [person_id], [createtime], [id]) VALUES (N'2', N'185', N'2019-07-16 14:27:48.930', N'28')
GO
GO
INSERT INTO [dbo].[user_person_create] ([user_id], [person_id], [createtime], [id]) VALUES (N'2', N'186', N'2019-07-16 14:27:48.983', N'29')
GO
GO
INSERT INTO [dbo].[user_person_create] ([user_id], [person_id], [createtime], [id]) VALUES (N'2', N'187', N'2019-07-16 14:27:49.047', N'30')
GO
GO
INSERT INTO [dbo].[user_person_create] ([user_id], [person_id], [createtime], [id]) VALUES (N'2', N'188', N'2019-07-16 17:07:03.337', N'31')
GO
GO
INSERT INTO [dbo].[user_person_create] ([user_id], [person_id], [createtime], [id]) VALUES (N'2', N'189', N'2019-07-18 17:57:18.870', N'32')
GO
GO
INSERT INTO [dbo].[user_person_create] ([user_id], [person_id], [createtime], [id]) VALUES (N'2', N'190', N'2019-07-18 18:26:09.873', N'33')
GO
GO
SET IDENTITY_INSERT [dbo].[user_person_create] OFF
GO

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE [dbo].[user_role]
GO
CREATE TABLE [dbo].[user_role] (
[id] int NOT NULL IDENTITY(1,1) ,
[user_id] int NULL ,
[role_id] int NULL 
)


GO
DBCC CHECKIDENT(N'[dbo].[user_role]', RESEED, 6)
GO

-- ----------------------------
-- Records of user_role
-- ----------------------------
SET IDENTITY_INSERT [dbo].[user_role] ON
GO
INSERT INTO [dbo].[user_role] ([id], [user_id], [role_id]) VALUES (N'1', N'2', N'1')
GO
GO
INSERT INTO [dbo].[user_role] ([id], [user_id], [role_id]) VALUES (N'5', N'6', N'2')
GO
GO
INSERT INTO [dbo].[user_role] ([id], [user_id], [role_id]) VALUES (N'6', N'7', N'4')
GO
GO
SET IDENTITY_INSERT [dbo].[user_role] OFF
GO

-- ----------------------------
-- Table structure for user_table
-- ----------------------------
DROP TABLE [dbo].[user_table]
GO
CREATE TABLE [dbo].[user_table] (
[id] int NOT NULL IDENTITY(1,1) ,
[username] nvarchar(16) NOT NULL ,
[password] nvarchar(64) NOT NULL ,
[name] nvarchar(16) NULL ,
[extend] nvarchar(32) NULL ,
[type] int NULL ,
[salt] nvarchar(100) NOT NULL ,
[create_time] datetime NULL ,
[disabled] int NOT NULL DEFAULT ((0)) 
)


GO
DBCC CHECKIDENT(N'[dbo].[user_table]', RESEED, 7)
GO

-- ----------------------------
-- Records of user_table
-- ----------------------------
SET IDENTITY_INSERT [dbo].[user_table] ON
GO
INSERT INTO [dbo].[user_table] ([id], [username], [password], [name], [extend], [type], [salt], [create_time], [disabled]) VALUES (N'2', N'admin', N'$2a$10$cPAK3QMTBci9Xbv/beEwk.krKhhF389JuVF3jZKwep9iNCgwjtsDi', N'超级管理员', null, null, N'123456', N'2019-07-14 15:36:05.063', N'0')
GO
GO
INSERT INTO [dbo].[user_table] ([id], [username], [password], [name], [extend], [type], [salt], [create_time], [disabled]) VALUES (N'6', N'管理员', N'$2a$10$J.md7X7CydBhygnusWkNGOjokdyWrxBOw7ltAQkzRqvQKJogfq4He', N'管理员', null, null, N'123456', N'2019-07-14 15:36:00.007', N'0')
GO
GO
INSERT INTO [dbo].[user_table] ([id], [username], [password], [name], [extend], [type], [salt], [create_time], [disabled]) VALUES (N'7', N'xunluo1', N'$2a$10$J.md7X7CydBhygnusWkNGOjokdyWrxBOw7ltAQkzRqvQKJogfq4He', N'巡逻人员1', null, null, N'123456', N'2019-07-17 15:29:14.973', N'0')
GO
GO
SET IDENTITY_INSERT [dbo].[user_table] OFF
GO

-- ----------------------------
-- Table structure for weiguijilu
-- ----------------------------
DROP TABLE [dbo].[weiguijilu]
GO
CREATE TABLE [dbo].[weiguijilu] (
[user_id] int NOT NULL ,
[remark] varchar(500) NOT NULL ,
[cph] varchar(500) NOT NULL ,
[createtime] datetime NOT NULL ,
[id] int NOT NULL IDENTITY(1,1) ,
[base64image] text NULL 
)


GO
DBCC CHECKIDENT(N'[dbo].[weiguijilu]', RESEED, 11)
GO

-- ----------------------------
-- Records of weiguijilu
-- ----------------------------
SET IDENTITY_INSERT [dbo].[weiguijilu] ON
GO
SET IDENTITY_INSERT [dbo].[weiguijilu] OFF
GO

-- ----------------------------
-- Indexes structure for table log
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table log
-- ----------------------------
ALTER TABLE [dbo].[log] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Indexes structure for table role
-- ----------------------------
CREATE UNIQUE INDEX [role_code_uk] ON [dbo].[role]
([code] ASC) 
WITH (IGNORE_DUP_KEY = ON, STATISTICS_NORECOMPUTE = ON)
GO

-- ----------------------------
-- Primary Key structure for table role
-- ----------------------------
ALTER TABLE [dbo].[role] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Indexes structure for table role_permission
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table role_permission
-- ----------------------------
ALTER TABLE [dbo].[role_permission] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Indexes structure for table shenpi
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table shenpi
-- ----------------------------
ALTER TABLE [dbo].[shenpi] ADD PRIMARY KEY NONCLUSTERED ([ID])
GO

-- ----------------------------
-- Indexes structure for table shenpi_detail
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table shenpi_detail
-- ----------------------------
ALTER TABLE [dbo].[shenpi_detail] ADD PRIMARY KEY NONCLUSTERED ([ID])
GO

-- ----------------------------
-- Indexes structure for table sms_template
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table sms_template
-- ----------------------------
ALTER TABLE [dbo].[sms_template] ADD PRIMARY KEY NONCLUSTERED ([id])
GO

-- ----------------------------
-- Indexes structure for table user_car_create
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table user_car_create
-- ----------------------------
ALTER TABLE [dbo].[user_car_create] ADD PRIMARY KEY NONCLUSTERED ([id])
GO

-- ----------------------------
-- Uniques structure for table user_car_create
-- ----------------------------
ALTER TABLE [dbo].[user_car_create] ADD UNIQUE ([user_id] ASC, [car_id] ASC)
GO

-- ----------------------------
-- Indexes structure for table user_person_create
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table user_person_create
-- ----------------------------
ALTER TABLE [dbo].[user_person_create] ADD PRIMARY KEY NONCLUSTERED ([id])
GO

-- ----------------------------
-- Uniques structure for table user_person_create
-- ----------------------------
ALTER TABLE [dbo].[user_person_create] ADD UNIQUE ([user_id] ASC, [person_id] ASC)
GO

-- ----------------------------
-- Indexes structure for table user_role
-- ----------------------------
CREATE UNIQUE INDEX [user_role_UN] ON [dbo].[user_role]
([user_id] ASC, [role_id] ASC) 
WITH (IGNORE_DUP_KEY = ON, STATISTICS_NORECOMPUTE = ON)
GO

-- ----------------------------
-- Primary Key structure for table user_role
-- ----------------------------
ALTER TABLE [dbo].[user_role] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Indexes structure for table user_table
-- ----------------------------
CREATE UNIQUE INDEX [user_UN] ON [dbo].[user_table]
([username] ASC) 
WITH (IGNORE_DUP_KEY = ON, STATISTICS_NORECOMPUTE = ON)
GO

-- ----------------------------
-- Primary Key structure for table user_table
-- ----------------------------
ALTER TABLE [dbo].[user_table] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Indexes structure for table weiguijilu
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table weiguijilu
-- ----------------------------
ALTER TABLE [dbo].[weiguijilu] ADD PRIMARY KEY NONCLUSTERED ([id])
GO
