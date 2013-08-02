package edu.gatech.cs2340.gradebook.dao;

import edu.gatech.cs2340.gradebook.model.Student;
import edu.gatech.cs2340.gradebook.model.GradebookItem;

/**
 * Data Access Object for a Student
 *
 * @author Caroline Paulus
 */
public interface StudentDAO {
     /**
      * Adds a student to a database and returns it
      *
      * @param Student being added
      * @return Student that was added
      */
     Student addStudent(Student student);
     /**
      * Adds a gradebook item to an existing student and returns the student
      *
      * @param Student getting a gradebook item added to it
      * @param Gradebook item being added to the student
      * @return Student with gradebook item added to it
      */
     Student addGradebookItemToStudent(
          Student student, GradebookItem gradebookItem);

}

