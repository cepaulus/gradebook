package edu.gatech.cs2340.gradebook.creator;

import edu.gatech.cs2340.gradebook.model.GradebookCategory;

/**
 * Creates a new Gradebook Category
 *
 * @author Caroline Paulus
 */
public interface GradebookCategoryCreator {
     /**
      * Creates a new Gradebook Category and returns it
      *
      * @param name  Name of Gradebook Category
      * @param weight  Weight of gradebook category as a decimal
      * @return new Gradebook Category
      */
     GradebookCategory createGradebookCategory(
               String name, double weight);

}
