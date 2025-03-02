package raisetechsutudentmanagement.StudentManagement1;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetechsutudentmanagement.StudentManagement1.data.Student;
import raisetechsutudentmanagement.StudentManagement1.data.StudentsCourses;
import raisetechsutudentmanagement.StudentManagement1.repository.StudentRepository;

@SpringBootApplication
public class StudentManagement1Application {
//http://localhost8080

  public static void main(String[] args) {
    SpringApplication.run(StudentManagement1Application.class, args);
  }
}
