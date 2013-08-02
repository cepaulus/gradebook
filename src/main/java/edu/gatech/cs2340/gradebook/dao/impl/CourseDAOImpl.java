package edu.gatech.cs2340.gradebook.dao.impl;

import edu.gatech.cs2340.gradebook.model.Course;
import edu.gatech.cs2340.gradebook.model.Lecture;
import edu.gatech.cs2340.gradebook.dao.CourseDAO;

/**
 * Data Access Object for a Course
 * Can be implemented with a database
 *
 * @author Caroline Paulus
 */
public class CourseDAOImpl implements CourseDAO {

     @Override
     public Course addCourse(Course course) {
          // TODO - for use with a database
          return null;
     }

     @Override
     public Course addLectureToCourse(Course course, Lecture lecture) {
          // TODO - for use with a database
          return null;
     }

}

