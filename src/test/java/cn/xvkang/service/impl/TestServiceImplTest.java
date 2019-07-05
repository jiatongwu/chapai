package cn.xvkang.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.xvkang.h2.entity.Student;
import cn.xvkang.primaryentity.UserTable;
import cn.xvkang.service.TestService;
import cn.xvkang.slaveentity.Signup;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceImplTest {
	@Autowired
	private TestService testService;

	@Test
	public void getAllUserTest() {
		List<UserTable> allUser = testService.getAllUser();
		System.out.println(allUser);
	}

	@Test
	public void getAllSignupTest() {
		List<Signup> allSignup = testService.getAllSignup();
		System.out.println(allSignup);
	}

	@Test
	public void getAllStudentTest() {
		List<Student> allStudent = testService.getAllStudent();
		System.out.println(allStudent);
	}

}
