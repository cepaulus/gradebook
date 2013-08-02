package edu.gatech.cs2340.gradebook.dao.mock;

import edu.gatech.cs2340.gradebook.model.Student;
import edu.gatech.cs2340.gradebook.model.GradebookItem;
import edu.gatech.cs2340.gradebook.dao.StudentDAO;

/**
 * Mock Data Access Object for Students
 * Used for testing purposes without a database
 *
 * @author Caroline Paulus
 */
public class StudentDAOMock implements StudentDAO {

     @Override
     public Student addStudent(Student student) {
          // TODO - add to mock "database"
          return student;
     }

     @Override
     public Student addGradebookItemToStudent(
               Student student, GradebookItem gradebookItem) {

          student.addScoredAssignment(gradebookItem);
          return student;
     }

}

