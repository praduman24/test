package com.example.test.service.student;

import com.example.test.entity.Brand;
import com.example.test.entity.City;
import com.example.test.entity.Student;

public interface StudentService {
    void saveStudent(Student student, City city, Brand brand);
}
