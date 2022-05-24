package com.venkat.StudentCRUD.Controller;

import com.venkat.StudentCRUD.Entity.Student;
import com.venkat.StudentCRUD.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    @RequestMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    @GetMapping("/student")
    public List<Student> fetchStudentList(){
        return studentService.listStudent();
    }

    @PostMapping("/student")
    public  Student addStudents(@RequestBody Student student){
        return studentService.savestudent(student);
    }

    @PutMapping("/student/{studentId}")
    public Student updateStudents(@RequestBody Student student, @PathVariable("studentId") Long studentId){
        return studentService.updatestudent(studentId);
    }
    @DeleteMapping("/student/{studentId}")
    public  String deleteStudentById(@PathVariable("studentId") Long studentId){
        studentService.deletestudentbyId(studentId);
        return "Deleted Successfully";

    }

}
