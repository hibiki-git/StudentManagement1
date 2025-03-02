package raisetechsutudentmanagement.StudentManagement1.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

  private int id;
  private String name;
  private String furigana;
  private String nickname;
  private String mailAddress;
  private String address;
  private int age;
  private String gender;
}
