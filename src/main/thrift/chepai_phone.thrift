
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

struct Person{
1: optional String username,
2: optional int age
}

exception DataException{
1: optional String message,
2: optional String date
}



service ChepaiPhoneService{

//Person getByUsername(1:required String username) throws (1: DataException dataException),
//void saveOne(1: required Person person) throws (1: DataException daaException)
String say(1:required String msg)throws (1:DataException dataException)

}

