package edu.gatech.cs2340.gradebook.service;

import edu.gatech.cs2340.gradebook.model.Student;
import edu.gatech.cs2340.gradebook.model.GradebookItem;

/**
 * Service for Students
 *
 * @author Caroline Paulus
 */
public interface StudentService {

     Student addStudent(Student student);

     Student addGradebookItemToStudent(
          Student student, GradebookItem gradebookItem);

}

