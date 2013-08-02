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
     /**
      * Adds a Gradebook Item to the internal category/item mapping
      *
      * @param Gradebook item being added
      */
     void addEntry(GradebookItem item);
     /**
      * Returns the sum of all gradebook items' respective scores
      *
      * @return
      */
     double getTotalScore();
     /**
      * Returns the sum of all gradebook items' scores, scaled to out of 100%
      *
      * @return
      */
     double getTotalScaledScore();
     /**
      * Returns the internal HashMap scoresByCategory
      *
      * @return
      */
     HashMap<GradebookCategory, Double> getScoresByCategory();
     /**
      * Returns the internal HashMap assignmentsByCategory
      *
      * @return
      */
     HashMap<GradebookCategory, ArrayList<GradebookItem>>
          getAssignmentsByCategory();
     /**
      * Returns a list of all categories
      *
      * @return
      */
     ArrayList<GradebookCategory> getCategories();
     /**
      * Returns the sum of all gradebook categories' weights
      *
      * @return
      */
     double getTotalWeight();

}
