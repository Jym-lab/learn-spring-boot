package com.minutes.springboot.learnjpaandhibernate.course;

import com.minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS Now!", "in28minutes"));
        repository.save((new Course(2, "Learn Azure Now!", "in28minutes")));
        repository.save((new Course(3, "Learn DevOps Now!", "in28minutes")));

        repository.deleteById(1L);
        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(3L));
        System.out.println("----------------------------------------------------------");
        System.out.println(repository.findAll());
        System.out.println("----------------------------------------------------------");
        System.out.println(repository.count());
        System.out.println("----------------------------------------------------------");
        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByName("Learn Azure Now!"));
        System.out.println(repository.findByName("Learn DevOps Now!"));
    }
}
