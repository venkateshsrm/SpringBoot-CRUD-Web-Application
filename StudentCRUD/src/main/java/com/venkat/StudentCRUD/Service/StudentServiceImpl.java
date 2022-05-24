package com.venkat.StudentCRUD.Service;

import com.venkat.StudentCRUD.Entity.Student;
import com.venkat.StudentCRUD.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;
    @Override
    public Student savestudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> listStudent() {
        return (List<Student>) studentRepo.findAll();
    }

    public Student updatestudent(Long studentId) {
        Student student1 = studentRepo.findById(studentId).get();
        
        return studentRepo.save(student1);
    }

    @Override
    public void deletestudentbyId(Long studentId) {
        studentRepo.deleteById(studentId);
    }
}
