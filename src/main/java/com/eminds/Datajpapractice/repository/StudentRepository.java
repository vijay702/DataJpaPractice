package com.eminds.Datajpapractice.repository;

import com.eminds.Datajpapractice.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    public List<Student> findByName(String name);

    public List<Student> findByNameContaining(String name);

    List<Student> findByGuardianName(String guardianName);

    //JPQL
   @Query(" select  s from Student  s where s.email = ?1 ")
    Student getStudentByEmail(String email);


    @Query(" select  s.name  from Student  s where s.email = ?1 ")
    String getStudentNameByEmail(String name);
 }
