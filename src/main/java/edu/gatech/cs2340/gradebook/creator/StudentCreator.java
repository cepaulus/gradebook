package edu.gatech.cs2340.gradebook.creator;

import edu.gatech.cs2340.gradebook.model.Student;

/**
 * Creates a new Student
 *
 * @author Caroline Paulus
 */
public interface StudentCreator {
    /**
      * Creates a new Student and returns it
      *
      * @param name  Student's name
      * @return new Student
      */
     Student createStudent(String name);

}

