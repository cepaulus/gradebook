package edu.gatech.cs2340.gradebook.calculator;

import edu.gatech.cs2340.gradebook.model.Gradable;
import edu.gatech.cs2340.gradebook.model.Grade;
import edu.gatech.cs2340.gradebook.model.Lecture;
import edu.gatech.cs2340.gradebook.model.Student;
import edu.gatech.cs2340.gradebook.model.Section;
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
public class GradeCalculatorTest {

     @Test
     public void testPlaceGradebookItemsIntoCategories() {
          ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
          GradebookCategory hw = new GradebookCategory("HW", 0.2);
          GradebookCategory test = new GradebookCategory("Test", 0.3);

          GradebookItem item1 = new GradebookItem("HW1", hw, .95);
          GradebookItem item2 = new GradebookItem("HW2", hw, .80);
          GradebookItem item3 = new GradebookItem("Test1", test, .88);

          items.add(item1);
          items.add(item2);
          items.add(item3);

          GradeCalculatorImpl calculator = new GradeCalculatorImpl();
          GradeCalculatorHelper helper = 
                    calculator.placeGradebookItemsIntoCategories(items);

          assertEquals(helper.getCategories().get(0), hw);
          assertEquals(helper.getCategories().get(1), test);
     }

     @Test
     public void testCalculateLetterGradeFromScore() {
          double scoreA = .913;
          double scoreB = .865;
          double scoreC = .72;
          double scoreD = .60;
          double scoreF = .37;

          GradeCalculatorImpl calculator = new GradeCalculatorImpl();
          assertEquals(calculator.calculateLetterGradeFromScore(scoreA), "A");
          assertEquals(calculator.calculateLetterGradeFromScore(scoreB), "B");
          assertEquals(calculator.calculateLetterGradeFromScore(scoreC), "C");
          assertEquals(calculator.calculateLetterGradeFromScore(scoreD), "D");
          assertEquals(calculator.calculateLetterGradeFromScore(scoreF), "F");
     }

     @Test
     public void testGetGrade_Student() {
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
          Grade studentGrade = calculator.getGrade(student);

          double hwScore = ((.95 + .92 + .85 + 1.0)/4) * .2;
          double quizScore = ((.8 + .7 + .81)/3) * .15;
          double testScore = ((.88 + .79)/2) * .35;
          double examScore = (.89 * .3);
          double total = hwScore + quizScore + testScore + examScore;

          String letter = calculator.calculateLetterGradeFromScore(total);

          assertEquals(studentGrade.getScore(), total, 0);
          assertEquals(studentGrade.getLetterGrade(), letter);
     }

     @Test
     public void testGetGrade_Section() {
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

          Grade sectionGrade = calculator.getGrade(section);
          String letter = calculator.calculateLetterGradeFromScore(calculatedGrade);

          assertEquals(sectionGrade.getScore(), calculatedGrade, 0);
          assertEquals(sectionGrade.getLetterGrade(), letter);
     }

     @Test
     public void testGetGrade_Lecture() {
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

          Lecture lecture = new Lecture("Lecture");
          lecture.addSection(sectionA);
          lecture.addSection(sectionB);
          lecture.addSection(sectionC);

          double calculatedGrade = (1.0 + 0.9 + 0.8)/3;
          GradeCalculatorImpl calculator = new GradeCalculatorImpl();

          Grade lectureGrade = calculator.getGrade(lecture);
          String letter = calculator.calculateLetterGradeFromScore(
                    calculatedGrade);

          assertEquals(lectureGrade.getScore(), calculatedGrade, 0);
          assertEquals(lectureGrade.getLetterGrade(), letter);
     }

     @Test
     public void testGetGrade_Course() {
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

          Grade courseGrade = calculator.getGrade(course);
          String letter = calculator.calculateLetterGradeFromScore(calculatedGrade);

          assertEquals(courseGrade.getScore(), calculatedGrade, 0);
          assertEquals(courseGrade.getLetterGrade(), letter);
     }

}
