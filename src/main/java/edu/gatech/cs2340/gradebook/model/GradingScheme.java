package edu.gatech.cs2340.gradebook.model;

import edu.gatech.cs2340.gradebook.calculator.GradeCalculatorHelper;
import edu.gatech.cs2340.gradebook.calculator.impl.GradeCalculatorImpl;

/**
 * Algorithm for computing a student's grade and score
 *
 * @author Caroline Paulus
 */
public class GradingScheme {

     private Student student;

     private boolean dropLowestHWGrade = false;
     private boolean dropLowestQuizGrade = false;
     private boolean dropLowestTestGrade = false;

     public GradingScheme(Student student) {
          this.student = student;
     }

     public Grade getGrade() {
          if (student.getScoredAssignments() == null
                    || student.getScoredAssignments().size() == 0) {
               System.out.println("Operation cannot be completed.");
               return null;
          }
          GradeCalculatorImpl gradeCalculator = new GradeCalculatorImpl();
          GradeCalculatorHelper helper =
               gradeCalculator.placeGradebookItemsIntoCategories(
               student.getScoredAssignments());

          double score = helper.getTotalScore();
          String letterGrade =
               gradeCalculator.calculateLetterGradeFromScore(score);
          Grade grade = new Grade(score, letterGrade);
          return grade;
     }

     private Student getStudent() {
          return student;
     }

     private boolean getDropLowestHWGrade() {
          return dropLowestHWGrade;
     }

     private void setDropLowestHWGrade(boolean bool) {
          dropLowestHWGrade = bool;
     }

     private boolean getDropLowestQuizGrade() {
          return dropLowestQuizGrade;
     }

     private void setDropLowestQuizGrade(boolean bool) {
          dropLowestQuizGrade = bool;
     }

     private boolean getDropLowestTestGrade() {
          return dropLowestTestGrade;
     }

     private void setDropLowestTestGrade(boolean bool) {
          dropLowestTestGrade = bool;
     }

}
