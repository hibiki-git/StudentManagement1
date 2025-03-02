package raisetechsutudentmanagement.StudentManagement1.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raisetechsutudentmanagement.StudentManagement1.data.Student;
import raisetechsutudentmanagement.StudentManagement1.data.StudentsCourses;
import raisetechsutudentmanagement.StudentManagement1.repository.StudentRepository;

@Service
public class StudentService {

  private StudentRepository repository;

  @Autowired
  public StudentService(StudentRepository repository) {
    this.repository = repository;
  }
  public List<Student> searchStudentList() {
    //ここにリクエストの加工処理、入力チェックとか入る
    return repository.search();
  }
  public  List<StudentsCourses> searchstudentCourseList(){
    return repository.searchStudentsCourses();
  }
}
