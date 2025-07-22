package solution;

//Implement a Student Management System
//File: StudentManagement.java
//Instructions: Create a Student class with id, name, and grade. Add a method to print student details. Then, in another class, manage a list of students and support adding, removing, and listing students.
//Input: Add student: John, ID: 1, Grade: A
//Output: Student Added: John (1), Grade: A

import java.util.ArrayList;
import java.util.List;

enum Grade{
    A,
    B,
    C,
    D,
    E,
}

class Student{
    private int id;
    private String name;
    private Grade grade;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setGrade(Grade grade){
        this.grade = grade;
    }

    public Grade getGrade(){
        return grade;
    }
}


public class StudentManagement {
     List<Student> studentList = new ArrayList<>();

     public List<Student> getStudentList(){
         return studentList;
     }

     public void addStudent(Student student){
         studentList.add(student);
     }

}
