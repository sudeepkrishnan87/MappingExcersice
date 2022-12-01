package com.example.mappingexcersice;

import com.example.mappingexcersice.manytomany.Students;
import com.example.mappingexcersice.manytomany.Teachers;
import com.example.mappingexcersice.onetomany.Course;
import com.example.mappingexcersice.onetomany.Subjects;
import com.example.mappingexcersice.onetoone.Address;
import com.example.mappingexcersice.onetoone.Person;
import com.example.mappingexcersice.repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MappingExcersiceApplication {

    public static void main(String[] args) {

       ConfigurableApplicationContext config= SpringApplication.run(MappingExcersiceApplication.class, args);
        PersonRepo prepo=config.getBean(PersonRepo.class);
        AddressRepo addRepo=config.getBean(AddressRepo.class);

        Person p=new Person();
        p.setName("Sudeep");
        //prepo.save(p);
        Address add=new Address();
        add.setHouseName("Mannurkundil");
        add.setPerson(p);
        addRepo.save(add);

        System.out.println("Person is ");
        prepo.findAll().forEach(per->System.out.println(per.getName()+""+per.getAdd().toString()));
        System.out.println("Address is ");
        addRepo.findAll().forEach(addr->System.out.println(addr.getHouseName()+""+addr.getPerson()));

        System.out.println("******************************************");

        CourseRepo crepo=config.getBean(CourseRepo.class);
        SubjectsRepo sRepo=config.getBean(SubjectsRepo.class);

        Course course=new Course();
        course.setCourseName("Bsc CS");

        Subjects subject1=new Subjects();
        subject1.setSubjectName("Maths");
        subject1.setCourse(course);

        Subjects subject2=new Subjects();
        subject2.setSubjectName("Computer science");
        subject2.setCourse(course);


        course.getSubjects().add(subject1);
        course.getSubjects().add(subject2);

        crepo.save(course);



     Teachers teacher1=new Teachers();
     Teachers teacher2=new Teachers();
     TeachersRepo teachersRepo=config.getBean(TeachersRepo.class);

     teacher1.setTeacherName("Scaler");
     teacher2.setTeacherName("Udemy");
     teachersRepo.save(teacher1);
     teachersRepo.save(teacher2);
     Students student1=new Students();
     Students student2=new Students();
     student1.setStudentName("Sudeep");
     student1.getTeachers().add(teacher1);
     student1.getTeachers().add(teacher2);
     student2.setStudentName("Shiji");
     student2.getTeachers().add(teacher2);

     StudentsRepo strepo=config.getBean(StudentsRepo.class);
     strepo.save(student1);
     strepo.save(student2);






    }

}
