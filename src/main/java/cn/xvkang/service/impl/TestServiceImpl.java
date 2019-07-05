package cn.xvkang.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import cn.xvkang.h2.dao.StudentRepository;
import cn.xvkang.h2.entity.Student;
import cn.xvkang.primaryentity.UserTable;
import cn.xvkang.primarymapperdynamicsql.UserTableDynamicSqlMapper;
import cn.xvkang.service.TestService;
import cn.xvkang.slaveentity.Signup;
import cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlMapper;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private UserTableDynamicSqlMapper userDynamicSqlMapper;
	@Autowired
	private SignupDynamicSqlMapper signupDynamicSqlMapper;
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	@Qualifier("primaryTransactionManager")
	private PlatformTransactionManager primaryTransactionManager;
	@Autowired
	@Qualifier("slaveTransactionManager")
	private PlatformTransactionManager slaveTransactionManager;
	@Autowired
	@Qualifier("h2TransactionManager")
	private PlatformTransactionManager h2TransactionManager;

	@Override
	public List<UserTable> getAllUser() {
		TransactionTemplate transactionTemplate = new TransactionTemplate(primaryTransactionManager);
		transactionTemplate.execute(new TransactionCallback<Integer>() {

			@Override
			public Integer doInTransaction(TransactionStatus status) {
				UserTable u = new UserTable();
				u.setName("name");
				u.setPassword("password");
				u.setSalt("salt");
				u.setUsername("username");
				return userDynamicSqlMapper.insert(u);
			}
		});
		List<UserTable> users = userDynamicSqlMapper.selectByExample().build().execute();
		return users;
	}

	@Override
	public List<Signup> getAllSignup() {
		TransactionTemplate transactionTemplate = new TransactionTemplate(slaveTransactionManager);
		transactionTemplate.execute(new TransactionCallback<Integer>() {

			@Override
			public Integer doInTransaction(TransactionStatus status) {
				Signup signup = new Signup();
				signup.setAccountLocation("accountLocation");
				signup.setAddress("address");
				signup.setBirthCertificateImageFiles("birthCertificateImageFiles");
				signup.setBirthday("birthday");
				signup.setBirthdayDate(new Date());
				signup.setCensus("census");
				signup.setCreateTime(new Date());

				signup.setRegCode(2019001);
				signup.setPhone("phone");
				signup.setName("name");
				signup.setMotherWorkunit("motherWorkunit");
				signup.setMother("mother");
				signup.setIdcard("idcard");
				signup.setHouseCeritificateImageFiles("houseCeritificateImageFiles");
				signup.setGender("gender");
				signup.setFixedHouse("fixedHouse");
				signup.setFatherWorkunit("fatherWorkunit");
				signup.setFather("father");

				return signupDynamicSqlMapper.insert(signup);

			}
		});
		List<Signup> signups = signupDynamicSqlMapper.selectByExample().build().execute();
		return signups;
	}

	@Override
	public List<Student> getAllStudent() {
		TransactionTemplate transactionTemplate = new TransactionTemplate(h2TransactionManager);
		transactionTemplate.execute(new TransactionCallback<Void>() {

			@Override
			public Void doInTransaction(TransactionStatus status) {
				Student s = new Student();
				s.setName("zhangsan");
				studentRepository.save(s);
				return null;
			}
		});
		List<Student> students = studentRepository.findAll();

		return students;
	}

}
