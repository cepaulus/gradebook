package edu.gatech.cs2340.gradebook.dao.impl;

import edu.gatech.cs2340.gradebook.model.Student;
import edu.gatech.cs2340.gradebook.model.GradebookItem;
import edu.gatech.cs2340.gradebook.dao.StudentDAO;

/**
 * Data Access Object for a Student
 * Can be implemented with a database
 *
 * @author Caroline Paulus
 */
public class StudentDAOImpl implements StudentDAO {

     @Override
     public Student addStudent(Student student) {
          // TODO - for use with a database
          return null;
     }

     @Override
     public Student addGradebookItemToStudent(
               Student student, GradebookItem gradebookItem) {

          // TODO - for use with a database
          return null;
     }

}

