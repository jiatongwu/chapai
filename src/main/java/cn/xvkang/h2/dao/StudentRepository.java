package cn.xvkang.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.xvkang.h2.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	

}
