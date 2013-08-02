package edu.gatech.cs2340.gradebook.service;

import edu.gatech.cs2340.gradebook.model.GradebookCategory;

/**
 * Service for Gradebook Categories
 *
 * @author Caroline Paulus
 */
public interface GradebookCategoryService {
    /**
      * Adds a gradebook category to a database and returns it
      *
      * @param Gradebook category being added
      * @return Gradebook category that was added
      */
     GradebookCategory addGradebookCategory(
               GradebookCategory gradebookCategory);

}
