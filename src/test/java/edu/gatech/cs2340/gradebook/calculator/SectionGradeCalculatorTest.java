package edu.gatech.cs2340.gradebook.calculator;

import edu.gatech.cs2340.gradebook.model.Gradable;
import edu.gatech.cs2340.gradebook.model.Grade;
import edu.gatech.cs2340.gradebook.model.Student;
import edu.gatech.cs2340.gradebook.model.Section;
import edu.gatech.cs2340.gradebook.model.GradebookItem;
import edu.gatech.cs2340.gradebook.model.GradebookCategory;
import edu.gatech.cs2340.gradebook.calculator.GradeCalculator;
import edu.gatech.cs2340.gradebook.calculator.impl.GradeCalculatorImpl;
import edu.gatech.cs2340.gradebook.calculator.impl.GradeCalculatorHelperImpl;

import static org.junit.Assert.*; 
import org.junit.Test;
import java.util.ArrayList;

/**
 * Test for Courses
 *
 * @author Caroline Paulus
 */
public class SectionGradeCalculatorTest {

     @Test
     public void testCalculateSectionGrade() {
          Student student1 = new Student("Student1");
          Student student2 = new Student("Student2");
          Student student3 = new Student("Student3");
          Student student4 = new Student("Student4");

          GradebookCategory hw = new GradebookCategory("HW", 0.25);
          GradebookCategory test = new GradebookCategory("Test", 0.25);
          GradebookCategory quiz = new GradebookCategory("Quiz", 0.25);
          GradebookCategory finalExam = new GradebookCategory("FinalExam", 0.25);

          GradebookItem hwAvg = new GradebookItem("hwAvg", hw);
          GradebookItem testAvg = new GradebookItem("testAvg", test);
          GradebookItem quizAvg = new GradebookItem("quizAvg", quiz);
          GradebookItem finalExam1 = new GradebookItem("finalExam", finalExam);

          // student 1 grade should be a 100%
          student1.addScoredAssignment(hwAvg, 1.0);
          student1.addScoredAssignment(testAvg, 1.0);
          student1.addScoredAssignment(quizAvg, 1.0);
          student1.addScoredAssignment(finalExam1, 1.0);

          // student 2 grade should be a 90%
          student2.addScoredAssignment(hwAvg, 0.9);
          student2.addScoredAssignment(testAvg, 0.9);
          student2.addScoredAssignment(quizAvg, 0.9);
          student2.addScoredAssignment(finalExam1, 0.9);

          // student 3 grade should be a 80%
          student3.addScoredAssignment(hwAvg, 0.8);
          student3.addScoredAssignment(testAvg, 0.8);
          student3.addScoredAssignment(quizAvg, 0.8);
          student3.addScoredAssignment(finalExam1, 0.8);

          // student 4 grade should be a 70%
          student4.addScoredAssignment(hwAvg, 0.7);
          student4.addScoredAssignment(testAvg, 0.7);
          student4.addScoredAssignment(quizAvg, 0.7);
          student4.addScoredAssignment(finalExam1, 0.7);

          Section section = new Section("Section");
          section.addStudent(student1);
          section.addStudent(student2);
          section.addStudent(student3);
          section.addStudent(student4);

          double calculatedGrade = (1.0 + 0.9 + 0.8 + .7)/4;
          GradeCalculatorImpl calculator = new GradeCalculatorImpl();

          Grade sectionGrade = calculator.calculateSectionGrade(section);
          System.out.println("Section Grade: " + sectionGrade.getScore());
          System.out.println("Calculated Grade: " + calculatedGrade);
          assertEquals(sectionGrade.getScore(), calculatedGrade, 0.0);
     }


}
