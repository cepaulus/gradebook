package edu.gatech.cs2340.gradebook.dao;

import edu.gatech.cs2340.gradebook.model.Course;
import edu.gatech.cs2340.gradebook.model.Lecture;

/**
 * Data Access Object for a Course
 *
 * @author Caroline Paulus
 */
public interface CourseDAO {

     /**
      * Adds a course to a database and returns it
      *
      * @param Course being added
      * @return  Course that was added
      */
     Course addCourse(Course course);
     /**
      * Adds a lecture to an existing course and returns updated course
      *
      * @param Course being added
      * @param Lecture being added to course
      * @return  Course that had a lecture added to it
      */
     Course addLectureToCourse(Course course, Lecture lecture);

}

