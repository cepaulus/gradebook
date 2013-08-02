package edu.gatech.cs2340.gradebook.creator.concrete;

import edu.gatech.cs2340.gradebook.model.Course;
import edu.gatech.cs2340.gradebook.creator.CourseCreator;
import edu.gatech.cs2340.gradebook.dao.CourseDAO;
import edu.gatech.cs2340.gradebook.dao.mock.CourseDAOMock;

import java.util.ArrayList;

/**
 * Creates a new Course
 *
 * @author Caroline Paulus
 */
public class ConcreteCourseCreator implements CourseCreator {

     private CourseDAO courseDAO = new CourseDAOMock();

     @Override
     public Course createCourse(String subject, int courseNumber,
               String name) {

          Course course = new Course(
               subject, courseNumber, name, new ArrayList<Course>());
          return course;
     }

     @Override
     public Course createCourse(String subject, int courseNumber,
               String name, ArrayList<Course> prerequisiteCourses) {

          Course course = new Course(
               subject, courseNumber, name, prerequisiteCourses);
          return course;
     }

}
