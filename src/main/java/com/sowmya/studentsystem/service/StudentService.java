package com.sowmya.studentsystem.service;

import com.sowmya.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();

}
