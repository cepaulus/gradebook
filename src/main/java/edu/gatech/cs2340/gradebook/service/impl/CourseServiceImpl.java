package edu.gatech.cs2340.gradebook.service.impl;

import edu.gatech.cs2340.gradebook.model.Course;
import edu.gatech.cs2340.gradebook.model.Lecture;
import edu.gatech.cs2340.gradebook.service.CourseService;
import edu.gatech.cs2340.gradebook.dao.CourseDAO;
import edu.gatech.cs2340.gradebook.dao.mock.CourseDAOMock;
/**
 * Service for Courses
 *
 * @author Caroline Paulus
 */
public class CourseServiceImpl implements CourseService {

     private CourseDAO courseDAO = new CourseDAOMock();

     @Override
     public Course addCourse(Course course) {

          return courseDAO.addCourse(course);
     }

     @Override
     public Course addLectureToCourse(Course course, Lecture lecture) {

          return courseDAO.addLectureToCourse(course, lecture);
     }

}
