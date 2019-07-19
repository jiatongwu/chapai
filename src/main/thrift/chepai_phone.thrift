
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
2:optional String base64image
}
struct SendPhotoResponseData{
1: optional Result_Code code,
2: optional UploadPhotoResultEnum uploadPhotoResultEnum
}

exception DataException{
1: optional String message,
2: optional String date
}



service ChepaiPhoneService{

//Person getByUsername(1:required String username) throws (1: DataException dataException),
//void saveOne(1: required Person person) throws (1: DataException daaException)
String say(1:required String msg)throws (1:DataException dataException),
SendPhotoResponseData uploadPhoto(1:required SendPhotoRequestData request)throws (1:DataException dataException),



























String login(1:required String username,2:required String password,3:required String imei)throws (1:DataException dataException)





























}

