package edu.gatech.cs2340.gradebook.model;

import java.util.ArrayList;

/**
 * A list of students enrolled in a particular class
 *
 * @author Caroline Paulus
 */
public class Section implements Gradable {

     private String sectionId;
     private Lecture lecture;
     private ArrayList<Student> students;

     public Section(String sectionId) {
          this.sectionId = sectionId;
     }

     public Section(String sectionId, Lecture lecture,
               ArrayList<Student> students) {
          this.sectionId = sectionId;
          this.lecture = lecture;
          this.students = students;
     }

     public String getSectionId() {
          return sectionId;
     }

     public Lecture getLecture() {
          return lecture;
     }

     public void setLecture(Lecture lecture) {
          this.lecture = lecture;
     }

     public ArrayList<Student> getStudents() {
          return students;
     }

     public void setStudents(ArrayList<Student> students) {
          this.students = students;
     }

     public void addStudent(Student student) {
          if (students == null) {
               students = new ArrayList<Student>();
          }
          students.add(student);
     }

     public void removeStudent(Student student) {
          students.remove(student);
     }

}
