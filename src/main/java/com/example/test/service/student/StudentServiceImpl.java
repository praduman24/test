package com.example.test.service.student;

import com.example.test.entity.Brand;
import com.example.test.entity.City;
import com.example.test.entity.Student;
import com.example.test.repository.StudentRepository;
import com.example.test.service.city.CityService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CityService cityService;

    @Transactional
    @Override
    public void saveStudent(Student student, City city, Brand brand) {
        studentRepository.save(student);
        cityService.saveCity(city, brand);
    }
}
