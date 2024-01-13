package com.example.test;

import com.example.test.entity.Brand;
import com.example.test.entity.City;
import com.example.test.entity.Student;
import com.example.test.service.brand.BrandService;
import com.example.test.service.brand.BrandServiceImpl;
import com.example.test.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestApplication {



    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TestApplication.class, args);

       /* Student student = new Student("praduman yadav", 500L);
        City city = new City("gurgaon");
       // Brand brand = new Brand("nike","ggg");
        Brand brand = new Brand();

        StudentService studentService = (StudentService) context.getBean("studentServiceImpl");

        studentService.saveStudent(student,city,brand);*/

        BrandService brandService = (BrandService) context.getBean("brandServiceImpl");
        Brand brand = new Brand("nike","ggghhh");
        brandService.updateBrandLogo(brand);
    }



}
