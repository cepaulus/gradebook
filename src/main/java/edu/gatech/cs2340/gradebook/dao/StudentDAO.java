package edu.gatech.cs2340.gradebook.dao;

import edu.gatech.cs2340.gradebook.model.Student;
import edu.gatech.cs2340.gradebook.model.GradebookItem;

/**
 * Data Access Object for a Student
 *
 * @author Caroline Paulus
 */
public interface StudentDAO {

     Student addStudent(Student student);

     Student addGradebookItemToStudent(
          Student student, GradebookItem gradebookItem);

}

