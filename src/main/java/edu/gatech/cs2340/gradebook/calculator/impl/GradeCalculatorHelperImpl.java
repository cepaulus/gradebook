package edu.gatech.cs2340.gradebook.calculator.impl;

import edu.gatech.cs2340.gradebook.model.GradebookItem;
import edu.gatech.cs2340.gradebook.model.GradebookCategory;
import edu.gatech.cs2340.gradebook.calculator.GradeCalculatorHelper;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Creates a list of Gradebook Items sorted by Gradebook Category
 *
 * @author Caroline Paulus
 */
public class GradeCalculatorHelperImpl implements GradeCalculatorHelper {

     private HashMap<GradebookCategory,
               ArrayList<GradebookItem>> assignmentsByCategory;
     private ArrayList<GradebookCategory> categories =
               new ArrayList<GradebookCategory>();


     public GradeCalculatorHelperImpl() {
          assignmentsByCategory = new HashMap<GradebookCategory,
                    ArrayList<GradebookItem>>();
     }

     @Override
     public void addEntry(GradebookItem item) {
          GradebookCategory category = item.getGradebookCategory();
          if (assignmentsByCategory.get(category) == null) {
               assignmentsByCategory.put(
                    category, new ArrayList<GradebookItem>());
               categories.add(category);
          }
          assignmentsByCategory.get(category).add(item);
     }

     @Override
     public double getTotalScore() {
          HashMap<GradebookCategory, Double> scores =
                                        getScoresByCategory();

          double totalScore = 0.0;
          for (GradebookCategory category : categories) {
               totalScore = totalScore + scores.get(category);
          }
          return totalScore;
     }

     @Override
     public double getTotalScaledScore() {
          HashMap<GradebookCategory, Double> scores =
                                        getScoresByCategory();

          double totalScore = 0.0;
          double totalWeight = 0.0;
          for (GradebookCategory category : categories) {
               totalScore = totalScore + scores.get(category);
               totalWeight = totalWeight + category.getWeight();
          }
          if (totalWeight != 1.0) {
               totalScore = totalScore / totalWeight;
          }
          return totalScore;
     }

     @Override
     public HashMap<GradebookCategory, Double>
                                   getScoresByCategory() {

          HashMap<GradebookCategory, Double> scores = new
                    HashMap<GradebookCategory, Double>();

          for (GradebookCategory category : categories) {
               double weight = category.getWeight();
               ArrayList<GradebookItem> items =
                         assignmentsByCategory.get(category);

               double categoryGrade = 0.;
               for (GradebookItem item : items) {
                    categoryGrade = categoryGrade + item.getScore();
               }
               categoryGrade = categoryGrade / items.size();
               categoryGrade = categoryGrade * weight;
               scores.put(category, categoryGrade);
          }
          return scores;
     }

     @Override
     public HashMap<GradebookCategory, ArrayList<GradebookItem>>
               getAssignmentsByCategory() {
                    return assignmentsByCategory;
     }

     @Override
     public ArrayList<GradebookCategory> getCategories() {
          return categories;
     }

     @Override
     public double getTotalWeight() {
          double totalWeight = 0.;
          for (GradebookCategory category : categories) {
               totalWeight = totalWeight + category.getWeight();
          }
          return totalWeight;
     }

}
