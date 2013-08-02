package edu.gatech.cs2340.gradebook.creator.concrete;

import edu.gatech.cs2340.gradebook.model.GradebookCategory;
import edu.gatech.cs2340.gradebook.creator.GradebookCategoryCreator;

/**
 * Creates a new Gradebook Category
 *
 * @author Caroline Paulus
 */
public class ConcreteGradebookCategoryCreator
               implements GradebookCategoryCreator {

     @Override
     public GradebookCategory createGradebookCategory(
               String name, double weight) {

          GradebookCategory gradebookCategory
                    = new GradebookCategory(name, weight);
          return gradebookCategory;
     }

}
