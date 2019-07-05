package cn.xvkang.service;

import java.util.List;

import cn.xvkang.h2.entity.Student;
import cn.xvkang.primaryentity.UserTable;
import cn.xvkang.slaveentity.Signup;

public interface TestService {
	List<UserTable> getAllUser();

	List<Signup> getAllSignup();

	List<Student> getAllStudent();
}
