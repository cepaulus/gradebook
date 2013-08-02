package edu.gatech.cs2340.gradebook.service.impl;

import edu.gatech.cs2340.gradebook.model.Student;
import edu.gatech.cs2340.gradebook.model.GradebookItem;
import edu.gatech.cs2340.gradebook.service.StudentService;
import edu.gatech.cs2340.gradebook.dao.StudentDAO;
import edu.gatech.cs2340.gradebook.dao.mock.StudentDAOMock;

/**
 * Service for Students
 *
 * @author Caroline Paulus
 */
public class StudentServiceImpl implements StudentService {

     private StudentDAO studentDAO = new StudentDAOMock();

     @Override
     public Student addStudent(Student student) {
          return studentDAO.addStudent(student);
     }

     @Override
     public Student addGradebookItemToStudent(
               Student student, GradebookItem gradebookItem) {

          return studentDAO.addGradebookItemToStudent(
               student, gradebookItem);
     }

}
