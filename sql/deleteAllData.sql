delete from weiguijilu;
delete from log;
delete from send_sms_log;
select cardNo from MYFAXINGSSUE where userno !='';
delete from MYICMONEY where cardno in 
('');
delete from MYICVALID where cardno in 
('');
delete from MYFAXINGSSUE where cardno in 
('');
delete from MYJIBENZILIAO where userno!='';

