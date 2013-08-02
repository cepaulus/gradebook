package edu.gatech.cs2340.gradebook.calculator.impl;

import edu.gatech.cs2340.gradebook.model.Gradable;
import edu.gatech.cs2340.gradebook.model.Grade;
import edu.gatech.cs2340.gradebook.model.Student;
import edu.gatech.cs2340.gradebook.model.Section;
import edu.gatech.cs2340.gradebook.model.Lecture;
import edu.gatech.cs2340.gradebook.model.Course;
import edu.gatech.cs2340.gradebook.model.GradebookItem;
import edu.gatech.cs2340.gradebook.calculator.GradeCalculator;
import edu.gatech.cs2340.gradebook.calculator.GradeCalculatorHelper;

import java.util.ArrayList;

/**
 * Returns the grade/average grade for any gradable object
 *
 * @author Caroline Paulus
 */
public class GradeCalculatorImpl implements GradeCalculator {

     public static final double A_CONDITION = 0.9;
     public static final double B_CONDITION = 0.8;
     public static final double C_CONDITION = 0.7;
     public static final double D_CONDITION = 0.6;

     @Override
     public Grade getGrade(Gradable gradable) {
          if (gradable instanceof Student) {
               return calculateStudentGrade((Student) gradable);
          } else {
               if (gradable instanceof Section) {
                    return calculateSectionGrade((Section) gradable);
               } else {
                    if (gradable instanceof Lecture) {
                         return calculateLectureGrade((Lecture) gradable);
                    } else {
                         if (gradable instanceof Course) {
                              return calculateCourseGrade((Course) gradable);
                         }
                    }
               }
          }
          return null;
     }
     //TODO should be private
     public Grade calculateStudentGrade(Student student) {
          return student.getGradingScheme().getGrade();
     }
     //TODO should be private
     public GradeCalculatorHelper placeGradebookItemsIntoCategories(
               ArrayList<GradebookItem> items) {
          GradeCalculatorHelper helper = new GradeCalculatorHelperImpl();
          for (GradebookItem item : items) {
               helper.addEntry(item);
          }
          return helper;
     }

     //TODO should be private
     public String calculateLetterGradeFromScore(double score) {
          String letter;
          if (score >= A_CONDITION) {
               return "A";
          }
          if (score >= B_CONDITION) {
               return "B";
          }
          if (score >= C_CONDITION) {
               return "C";
          }
          if (score >= D_CONDITION) {
               return "D";
          }
          return "F";
     }

     public Grade calculateSectionGrade(Section section) {
          if (section.getStudents() == null
                    || section.getStudents().size() == 0) {
               System.out.println("Operation cannot be completed.");
               return null;
          }
          double allScores = 0.;
          int numStudents = section.getStudents().size();
          for (Student student : section.getStudents()) {
               Grade grade = calculateStudentGrade(student);
               allScores = allScores + grade.getScore();
          }
          double averageScore = allScores / numStudents;
          String letterGrade = calculateLetterGradeFromScore(averageScore);
          Grade grade = new Grade(averageScore, letterGrade);
          return grade;
     }

     public Grade calculateLectureGrade(Lecture lecture) {
          if (lecture.getSections() == null
                    || lecture.getSections().size() == 0) {
               System.out.println("Operation cannot be completed.");
               return null;
          }
          double allScores = 0.;
          int numSections = lecture.getSections().size();
          for (Section section : lecture.getSections()) {
               Grade grade = calculateSectionGrade(section);
               allScores = allScores + grade.getScore();
          }
          double averageScore = allScores / numSections;
          String letterGrade = calculateLetterGradeFromScore(averageScore);
          Grade grade = new Grade(averageScore, letterGrade);
          return grade;
     }

     public Grade calculateCourseGrade(Course course) {
          if (course.getLectures() == null
                    || course.getLectures().size() == 0) {
               System.out.println("Operation cannot be completed.");
               return null;
          }
          double allScores = 0.;
          int numLectures = course.getLectures().size();
          for (Lecture lecture : course.getLectures()) {
               Grade grade = calculateLectureGrade(lecture);
               allScores = allScores + grade.getScore();
          }
          double averageScore = allScores / numLectures;
          String letterGrade = calculateLetterGradeFromScore(averageScore);
          Grade grade = new Grade(averageScore, letterGrade);
          return grade;
     }

     @Override
     public double getScore(Gradable gradable) {
          return getGrade(gradable).getScore();
     }

     @Override
     public String getLetterGrade(Gradable gradable) {
          return getGrade(gradable).getLetterGrade();
     }

}
