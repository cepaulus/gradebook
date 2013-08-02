package edu.gatech.cs2340.gradebook.dao;

import edu.gatech.cs2340.gradebook.model.Course;
import edu.gatech.cs2340.gradebook.model.Lecture;

/**
 * Data Access Object for a Course
 *
 * @author Caroline Paulus
 */
public interface CourseDAO {

     Course addCourse(Course course);

     Course addLectureToCourse(Course course, Lecture lecture);

}

