package raisetechsutudentmanagement.StudentManagement1;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetechsutudentmanagement.StudentManagement1.data.Student;
import raisetechsutudentmanagement.StudentManagement1.data.StudentsCourses;
import raisetechsutudentmanagement.StudentManagement1.service.StudentService;

@RestController
public class StudentController {

  private StudentService service;
  @Autowired
  public StudentController(StudentService service) {
    this.service = service;
  }

  @GetMapping("/studentList")
  public List<Student> getStudentList() {
    return service.searchStudentList();
  }
  @GetMapping("/studentsCourseList")
  public  List<StudentsCourses> getstudentCourseList(){
    return service.searchstudentCourseList();
  }
}
