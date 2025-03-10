package raisetechsutudentmanagement.StudentManagement1.data;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentsCourses {
  private int courseId;
  private int studentId;
  private String courseName;
  private LocalDateTime courseStartDate;
  private LocalDateTime courseEndDate;

}
