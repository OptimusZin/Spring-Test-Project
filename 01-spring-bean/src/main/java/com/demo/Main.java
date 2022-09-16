package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@Import(ProjectConfig.class)
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Student student = context.getBean("student" , Student.class);
        student.setGrade(5.6);
        student.setName("Saw Gyi");
        student.setSchool("Ba Ka");
        System.out.println("Name " + student.getName());
        System.out.println("Grade " + student.getGrade());
        System.out.println("School " + student.getSchool());
        context.close();


     /*   Student student = new Student();
        student.setGrade(5.6);
        student.setName("Saw Gyi");
        student.setSchool("Ba Ka");

        System.out.println("Name " + student.getName());
        System.out.println("Grade " + student.getGrade());
        System.out.println("School " + student.getSchool());

     */
//         ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext( "beans.xml");
//         Student student = beanFactory.getBean( "student" , Student.class);
//
//         beanFactory.registerShutdownHook();



        //((FileSystemXmlApplicationContext) beanFactory).close();

    }
}

