package edu.gatech.cs2340.gradebook.service;

import edu.gatech.cs2340.gradebook.model.Course;
import edu.gatech.cs2340.gradebook.model.Lecture;

/**
 * Service for Courses
 *
 * @author Caroline Paulus
 */
public interface CourseService {

     Course addCourse(Course course);

     Course addLectureToCourse(Course course, Lecture lecture);

}
