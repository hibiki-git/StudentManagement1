package raisetechsutudentmanagement.StudentManagement1.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.css.CSSStyleSheet;
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
    // 年齢が30代の人のみを抽出する
    // 抽出したリストをコントローラーに返す
    List<Student>students = repository.searchStudent();
    students = students.stream()
        .filter(v -> v.getAge() >= 30 && v.getAge() > 40)
        .collect(Collectors.toList());
    return students;
  }
  public  List<StudentsCourses> searchstudentCourseList(){
    // 「Javaコース」のコース情報のみを抽出する
    // 抽出したリストをコントローラーに返す
  List<StudentsCourses>studentsCourses = repository.searchStudentsCourses();
  studentsCourses = studentsCourses.stream()
      .filter(v -> v.getCourseName().contains("Java"))
      .collect(Collectors.toList());
  return studentsCourses;
  }
}
