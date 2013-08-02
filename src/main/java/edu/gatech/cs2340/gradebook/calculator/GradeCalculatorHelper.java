package edu.gatech.cs2340.gradebook.calculator;

import edu.gatech.cs2340.gradebook.model.GradebookItem;
import edu.gatech.cs2340.gradebook.model.GradebookCategory;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Creates a list of Gradebook Items sorted by Gradebook Category
 *
 * @author Caroline Paulus
 */
public interface GradeCalculatorHelper {

     void addEntry(GradebookItem item);

     double getTotalScore();

     double getTotalScaledScore();

     HashMap<GradebookCategory, Double> getScoresByCategory();

     HashMap<GradebookCategory, ArrayList<GradebookItem>>
          getAssignmentsByCategory();

     ArrayList<GradebookCategory> getCategories();

     double getTotalWeight();

}
