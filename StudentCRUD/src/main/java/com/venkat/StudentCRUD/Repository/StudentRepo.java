package com.venkat.StudentCRUD.Repository;

import com.venkat.StudentCRUD.Entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{


}
