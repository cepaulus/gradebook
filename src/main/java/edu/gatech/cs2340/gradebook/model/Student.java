package edu.gatech.cs2340.gradebook.model;

import java.util.ArrayList;


/**
 * An individual enrolled in a class
 *
 * @author Caroline Paulus
 */
public class Student implements Gradable {

     private String name;
     private ArrayList<GradebookItem> scoredAssignments;
     private GradingScheme gradingScheme;

     public Student(String name) {
          this.name = name;
          gradingScheme = new GradingScheme(this); // default grading scheme
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public ArrayList<GradebookItem> getScoredAssignments() {
          return scoredAssignments;
     }

     public void setScoredAssignments(
               ArrayList<GradebookItem> scoredAssignments) {
          this.scoredAssignments = scoredAssignments;
     }

     public void addScoredAssignment(GradebookItem scoredAssignment) {
          if (scoredAssignments == null) {
               scoredAssignments = new ArrayList<GradebookItem>();
          }
          scoredAssignments.add(scoredAssignment);
     }

     public void addScoredAssignment(
               GradebookItem scoredAssignment, double score) {
          GradebookItem copy = scoredAssignment.copy();
          copy.setScore(score);
          addScoredAssignment(copy);
     }

     public GradingScheme getGradingScheme() {
          return gradingScheme;
     }

     @Override
     public String toString() {
          return name + ": [" + scoredAssignments + "]";
     }

}
