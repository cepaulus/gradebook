package edu.gatech.cs2340.gradebook.model;

import java.util.ArrayList;

/**
 * Semester-long treatment of a set of material within a larger subject
 *
 * @author Caroline Paulus
 */
public class Course implements Gradable {

     private String subject; //TODO string?
     private int courseNumber;
     private String name;
     private ArrayList<Course> prerequisiteCourses;
     private ArrayList<Lecture> lectures;

     public Course(String subject, int courseNumber, String name,
          ArrayList<Course> prerequisiteCourses) {
          this.subject = subject;
          this.courseNumber = courseNumber;
          this.name = name;
          this.prerequisiteCourses = prerequisiteCourses;
     }

     public Course(String subject, int courseNumber, String name) {
          this(subject, courseNumber, name, new ArrayList<Course>());
     }

     public String getSubject() {
          return subject;
     }

     public void setSubject(String subject) {
          this.subject = subject;
     }

     public int getCourseNumber() {
          return courseNumber;
     }

     public void setCourseNumber(int courseNumber) {
          this.courseNumber = courseNumber;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public ArrayList<Course> getPrerequisiteCourses() {
          return prerequisiteCourses;
     }

     public void setPrerequisiteCourses(
          ArrayList<Course> prerequisiteCourses) {
          this.prerequisiteCourses = prerequisiteCourses;
     }

     public ArrayList<Lecture> getLectures() {
          return lectures;
     }

     public void setLectures(ArrayList<Lecture> lectures) {
          this.lectures = lectures;
     }

     public void addLecture(Lecture lecture) {
          if (lectures == null) {
               lectures = new ArrayList<Lecture>();
          }
          lectures.add(lecture);
     }

     @Override
     public String toString() {
          return (courseNumber + " " + name);
     }

}
