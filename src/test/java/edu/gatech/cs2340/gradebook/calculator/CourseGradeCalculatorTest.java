package edu.gatech.cs2340.gradebook.calculator;

import edu.gatech.cs2340.gradebook.model.Gradable;
import edu.gatech.cs2340.gradebook.model.Grade;
import edu.gatech.cs2340.gradebook.model.Student;
import edu.gatech.cs2340.gradebook.model.Section;
import edu.gatech.cs2340.gradebook.model.Lecture;
import edu.gatech.cs2340.gradebook.model.Course;
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
public class CourseGradeCalculatorTest {

    @Test
     public void testCalculateCourseGrade() {
          Student student1 = new Student("Student1");
          Student student2 = new Student("Student2");
          Student student3 = new Student("Student3");
          Student student4 = new Student("Student4");
          Student student5 = new Student("Student5");
          Student student6 = new Student("Student6");

          GradebookCategory hw = new GradebookCategory("HW", 0.25);
          GradebookCategory test = new GradebookCategory("Test", 0.25);
          GradebookCategory quiz = new GradebookCategory("Quiz", 0.25);
          GradebookCategory finalExam = new GradebookCategory("FinalExam", 0.25);

          GradebookItem hwAvg = new GradebookItem("hwAvg", hw);
          GradebookItem testAvg = new GradebookItem("testAvg", test);
          GradebookItem quizAvg = new GradebookItem("quizAvg", quiz);
          GradebookItem finalExam1 = new GradebookItem("finalExam", finalExam);

          // grades for students 1 and 2 should be a 100%
          student1.addScoredAssignment(hwAvg, 1.0);
          student1.addScoredAssignment(testAvg, 1.0);
          student1.addScoredAssignment(quizAvg, 1.0);
          student1.addScoredAssignment(finalExam1, 1.0);
          student2.addScoredAssignment(hwAvg, 1.0);
          student2.addScoredAssignment(testAvg, 1.0);
          student2.addScoredAssignment(quizAvg, 1.0);
          student2.addScoredAssignment(finalExam1, 1.0);

          // grades for students 3 and 4 should be a 90%
          student3.addScoredAssignment(hwAvg, 0.9);
          student3.addScoredAssignment(testAvg, 0.9);
          student3.addScoredAssignment(quizAvg, 0.9);
          student3.addScoredAssignment(finalExam1, 0.9);
          student4.addScoredAssignment(hwAvg, 0.9);
          student4.addScoredAssignment(testAvg, 0.9);
          student4.addScoredAssignment(quizAvg, 0.9);
          student4.addScoredAssignment(finalExam1, 0.9);

          // grades for students 5 and 6 should be a 80%
          student5.addScoredAssignment(hwAvg, 0.8);
          student5.addScoredAssignment(testAvg, 0.8);
          student5.addScoredAssignment(quizAvg, 0.8);
          student5.addScoredAssignment(finalExam1, 0.8);
          student6.addScoredAssignment(hwAvg, 0.8);
          student6.addScoredAssignment(testAvg, 0.8);
          student6.addScoredAssignment(quizAvg, 0.8);
          student6.addScoredAssignment(finalExam1, 0.8);

          Section sectionA = new Section("A");
          Section sectionB = new Section("B");
          Section sectionC = new Section("C");
          sectionA.addStudent(student1);
          sectionA.addStudent(student2);
          sectionB.addStudent(student3);
          sectionB.addStudent(student4);
          sectionC.addStudent(student5);
          sectionC.addStudent(student6);

          Lecture lecture1 = new Lecture("Lecture1");
          Lecture lecture2 = new Lecture("Lecture2");
          lecture1.addSection(sectionA);
          lecture1.addSection(sectionB);
          lecture2.addSection(sectionC);

          String subject  = "subject";
          int courseNumber = 1234;
          String name = "name";
          Course course = new Course(subject, courseNumber, name);
          course.addLecture(lecture1);
          course.addLecture(lecture2);

          double calculatedGrade = (.95 + 0.8)/2;
          GradeCalculatorImpl calculator = new GradeCalculatorImpl();

          Grade courseGrade = calculator.calculateCourseGrade(course);
          assertEquals(courseGrade.getScore(), calculatedGrade, 0);
     }

}
