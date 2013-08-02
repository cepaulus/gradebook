package edu.gatech.cs2340.gradebook.creator;

import edu.gatech.cs2340.gradebook.model.Course;

import java.util.ArrayList;

/**
 * Creates a new Course
 *
 * @author Caroline Paulus
 */
public interface CourseCreator {
     /**
      * Creates a new Course with no prerequisites and returns it
      *
      * @param subject  Name of broad subject Course falls under
      * @param courseNumber  ID number of Course
      * @param name  Name of Course
      * @return new Course
      */
     Course createCourse(String subject, int courseNumber,
               String name);
     /**
      * Creates a new Course with a list of prerequisites and returns it
      *
      * @param subject  Name of broad subject Course falls under
      * @param courseNumber  ID number of Course
      * @param name  Name of Course
      * @param prerequisiteCourses  List of prerequisite Courses
      * @return new Course
      */
     Course createCourse(String subject, int courseNumber,
               String name, ArrayList<Course> prerequisiteCourses);

}
