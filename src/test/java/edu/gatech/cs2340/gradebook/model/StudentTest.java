package edu.gatech.cs2340.gradebook.model;

import edu.gatech.cs2340.gradebook.model.Student;
import edu.gatech.cs2340.gradebook.model.GradebookItem;
import edu.gatech.cs2340.gradebook.model.GradebookCategory;
import edu.gatech.cs2340.gradebook.creator.StudentCreator;
import edu.gatech.cs2340.gradebook.creator.concrete.ConcreteStudentCreator;
import edu.gatech.cs2340.gradebook.service.StudentService;
import edu.gatech.cs2340.gradebook.service.impl.StudentServiceImpl;

import static org.junit.Assert.*; 
import org.junit.Test;
import java.util.ArrayList;

/**
 * Test for Courses
 *
 * @author Caroline Paulus
 */
public class StudentTest {

     @Test
     public void testCreateStudent() {
          String name = "Caroline";

          StudentCreator studentCreator = new ConcreteStudentCreator();
          Student student = studentCreator.createStudent(name);

          assertEquals("Caroline", student.getName());
     }

          @Test
     public void testAddGradebookItemToStudent() {
          Student student = new Student("Caroline");
          GradebookCategory category = 
                    new GradebookCategory("Homework", .15);
          GradebookItem homework1 = 
                    new GradebookItem("Homework 1", category);

          StudentService studentService = new StudentServiceImpl();
          studentService.addGradebookItemToStudent(student, homework1);

          assertEquals(student.getScoredAssignments().get(0).getName(),
                    "Homework 1");
     }

}
