package edu.gatech.cs2340.gradebook.calculator;

import edu.gatech.cs2340.gradebook.model.Gradable;
import edu.gatech.cs2340.gradebook.model.Grade;
import edu.gatech.cs2340.gradebook.model.Student;
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
public class StudentGradeCalculatorTest {

     @Test
     public void testCalculateStudentGrade() {
          Student student = new Student("David");
          ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
          GradebookCategory hw = new GradebookCategory("HW", 0.2);
          GradebookCategory test = new GradebookCategory("Test", 0.35);
          GradebookCategory quiz = new GradebookCategory("Quiz", 0.15);
          GradebookCategory finalExam = new GradebookCategory("FinalExam", 0.3);

          GradebookItem hw1 = new GradebookItem("HW1", hw, .95);
          GradebookItem quiz1 = new GradebookItem("Quiz1", quiz, .80);
          GradebookItem hw2 = new GradebookItem("HW2", hw, .92);
          GradebookItem test1 = new GradebookItem("Test1", test, .88);
          GradebookItem hw3 = new GradebookItem("HW3", hw, .85);
          GradebookItem quiz2 = new GradebookItem("Quiz2", quiz, .70);
          GradebookItem hw4 = new GradebookItem("HW4", hw, 1.0);
          GradebookItem quiz3 = new GradebookItem("Quiz3", quiz, .81);
          GradebookItem test2 = new GradebookItem("Test2", test, .79);
          GradebookItem finalExam1 = new GradebookItem(
                    "FinalExam1", finalExam, .89);

          student.addScoredAssignment(hw1);
          student.addScoredAssignment(quiz1);
          student.addScoredAssignment(hw2);
          student.addScoredAssignment(test1);
          student.addScoredAssignment(hw3);
          student.addScoredAssignment(quiz2);
          student.addScoredAssignment(hw4);
          student.addScoredAssignment(quiz3);
          student.addScoredAssignment(test2);
          student.addScoredAssignment(finalExam1);

          GradeCalculatorImpl calculator = new GradeCalculatorImpl();
          Grade studentGrade = calculator.calculateStudentGrade(student);

          double hwScore = ((.95 + .92 + .85 + 1.0)/4) * .2;
          double quizScore = ((.8 + .7 + .81)/3) * .15;
          double testScore = ((.88 + .79)/2) * .35;
          double examScore = (.89 * .3);
          double total = hwScore + quizScore + testScore + examScore;

          String letter = calculator.calculateLetterGradeFromScore(total);

          assertEquals(studentGrade.getScore(), total, 0);
          assertEquals(studentGrade.getLetterGrade(), letter);
     }

}
