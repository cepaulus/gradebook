package edu.gatech.cs2340.gradebook.creator;

import edu.gatech.cs2340.gradebook.model.GradebookCategory;

/**
 * Creates a new Gradebook Category
 *
 * @author Caroline Paulus
 */
public interface GradebookCategoryCreator {

     GradebookCategory createGradebookCategory(
               String name, double weight);

}
