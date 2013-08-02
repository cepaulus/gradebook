package edu.gatech.cs2340.gradebook.model;

/**
 * Contains the score and letter grade for any Gradable object
 *
 * @author Caroline Paulus
 */
public class Grade {

     private double score;
     private String letterGrade;

     public Grade(double score, String letterGrade) {
          this.score = score;
          this.letterGrade = letterGrade;
     }

     public double getScore() {
          return score;
     }

     public String getLetterGrade() {
          return letterGrade;
     }

}
