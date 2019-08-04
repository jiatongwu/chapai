
namespace java cn.xvkang.phone.thrift
typedef i16 short
typedef i32 int
typedef i64 long
typedef bool boolean
typedef string String

enum TOperation {
  ADD = 1,
  SUBTRACT = 2,
  MULTIPLY = 3,
  DIVIDE = 4
}

enum Result_Code{
OK=1,
ERROR=2,
NOT_LOGIN=3
}

enum UploadPhotoResultEnum{
SHIBIE_BULIAO=1,
SEND_SMS_ERROR=2,
SAVE_TO_DATABASE_ERROR=3,
CPH_NOT_EXIST=4
}
struct Person{
1: optional String username,
2: optional int age
}

struct SendPhotoRequestData{
1:optional String jwt,
2:optional String base64image,
3:optional int smsTemplateId,
4:optional String cph
}
struct SendPhotoResponseData{
1: optional Result_Code code,
2: optional UploadPhotoResultEnum uploadPhotoResultEnum
}


struct GetWeiguiRequestData{
1:optional String jwt,
2:optional String date,
4:optional String cph,
5:optional int pageNum
}
struct Weiguijilu{
1: optional String createtime,
2: optional String personName,
3: optional String cph,
4: optional String base64image,
5: optional int id
}
struct GetWeiguiResponseData{
1: optional Result_Code code,
2: optional list<Weiguijilu> weiguijilus,
3: optional int totalPage,
4: optional int pageNum
}


struct GetAllSmsTemplateRequest{

}
struct GetAllSmsTemplateOneItem{
1:optional int id,
2:optional String name,
3:optional String content
}
struct GetAllSmsTemplateResponse{
1:optional list<GetAllSmsTemplateOneItem> smsTemplates,
2:optional int count
}

exception DataException{
1: optional String message,
2: optional String date
}


struct GetOneWeiguijiluRequest{
1:optional int id
}

struct ResetPwdRequest{
1:optional String oldPwd,
2:optional String newPwd,
3:optional String jwt
}
struct ResetPwdResponse{
1:optional Result_Code result_code
}

enum GetCarPersonTypeEnum{
PHOTO=1,
CPH=2
}
struct GetCarPersonRequest{
1:optional GetCarPersonTypeEnum getCarPersonTypeEnum,
2:optional String imageOrCph
}
struct GetCarPersonPojo{
1:optional String personName,
2:optional String phone,
3:optional String cph
}
struct GetCarPersonResponse{
1: optional Result_Code code,
2:optional list<GetCarPersonPojo> carPersons
}





service ChepaiPhoneService{
//Person getByUsername(1:required String username) throws (1: DataException dataException),
//void saveOne(1: required Person person) throws (1: DataException daaException)
String say(1:required String msg)throws (1:DataException dataException),
String autologin(1:required String jwt)throws (1:DataException dataException),
SendPhotoResponseData uploadPhoto(1:required SendPhotoRequestData request)throws (1:DataException dataException),
GetAllSmsTemplateResponse GetAllsmsTemplateResponse(1:required GetAllSmsTemplateRequest request)throws (1:DataException dataException),
GetWeiguiResponseData GetWeiguijiluResponse(1:required GetWeiguiRequestData request)throws (1:DataException dataException),
Weiguijilu getOneWeiguijilu(1:required GetOneWeiguijiluRequest request)throws (1:DataException dataException),
ResetPwdResponse resetPwd(1:required ResetPwdRequest request)throws (1:DataException dataException),
void logout(1:required String jwt)throws (1:DataException dataException),

GetCarPersonResponse getCarPersonByPhotoOrCph(1:required GetCarPersonRequest request)throws (1:DataException dataException),

String login(1:required String username,2:required String password,3:required String imei)throws (1:DataException dataException)
}

