package raisetechsutudentmanagement.StudentManagement1.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import raisetechsutudentmanagement.StudentManagement1.data.Student;
import raisetechsutudentmanagement.StudentManagement1.data.StudentsCourses;

//DB(MySql)を操作するインターフェース
@Mapper
public interface StudentRepository {

  //＃{}は引数(String name)で入れたものを自動で入れてくれるO／Rマッパーの機能
  @Select("SELECT * FROM students")
  List<Student> search();

  @Select("SELECT * FROM students_courses")
  List<StudentsCourses> searchStudentsCourses();
}
