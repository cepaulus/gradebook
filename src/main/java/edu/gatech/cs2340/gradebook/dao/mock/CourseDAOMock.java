package edu.gatech.cs2340.gradebook.dao.mock;

import edu.gatech.cs2340.gradebook.model.Course;
import edu.gatech.cs2340.gradebook.model.Lecture;
import edu.gatech.cs2340.gradebook.dao.CourseDAO;

/**
 * Mock Data Access Object for Courses
 * Used for testing purposes without a database
 *
 * @author Caroline Paulus
 */
public class CourseDAOMock implements CourseDAO {

     @Override
     public Course addCourse(Course course) {
          // TODO - add to mock "database"
          return course;
     }

     @Override
     public Course addLectureToCourse(Course course, Lecture lecture) {
          course.addLecture(lecture);
          return course;
     }

}

