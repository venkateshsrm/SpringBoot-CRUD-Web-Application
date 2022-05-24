package com.venkat.StudentCRUD.Service;

import com.venkat.StudentCRUD.Entity.Student;

import java.util.List;

public interface StudentService {

    Student savestudent(Student student);
    List<Student> listStudent();
    Student updatestudent(Long studentId);
    void deletestudentbyId(Long studentId);
}
