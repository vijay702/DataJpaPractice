package com.eminds.Datajpapractice.repository;

import com.eminds.Datajpapractice.entity.Guardian;
import com.eminds.Datajpapractice.entity.Student;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {


    @Autowired
    private StudentRepository studentRepository;



    @Test
    public void saveStudent(){
        Student student = Student.builder().email("vijyyes15@yahoo.com")
                .name("vijay").build();
                //.guardianName(" saritha")
               // .guardianMobile("9025524688").build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudents(){

        List<Student> students = studentRepository.findAll();

       System.out.println(students);

    }


    @Test
    public void savestudentWithGuardan(){

        Guardian guardian = Guardian.builder()
                .name("saritha")
                .mobile("9090018882")
                .build();

        Student student = Student.builder()
                .name("vijay yes")
                .email("vij1677@yahooo.com")
                .guardian(guardian)
                .build() ;


        studentRepository.save(student);
    }

    @Test
    public void printStudentByFirstName(){

        List<Student> students = studentRepository.findByName("vijay");

        System.out.println(" Students = "  + students);


    }

    @Test
    public void printStudentByFirstNameContaining(){

        List<Student> students = studentRepository.findByNameContaining("vi");

        System.out.println(" Students = "  + students);


    }

    @Test
    public void  printByGuardianName(){
        List<Student> students = studentRepository.findByGuardianName("saritha");
        System.out.println(" Students = "  + students);


    }




}