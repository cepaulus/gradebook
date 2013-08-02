package edu.gatech.cs2340.gradebook.creator;

import edu.gatech.cs2340.gradebook.model.Course;

import java.util.ArrayList;

/**
 * Creates a new Course
 *
 * @author Caroline Paulus
 */
public interface CourseCreator {

     Course createCourse(String subject, int courseNumber,
               String name);

     Course createCourse(String subject, int courseNumber,
               String name, ArrayList<Course> prerequisiteCourses);

}
