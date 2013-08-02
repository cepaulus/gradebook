package edu.gatech.cs2340.gradebook.dao;

import edu.gatech.cs2340.gradebook.model.GradebookCategory;

/**
 * Data Access Object for a Gradebook Category
 *
 * @author Caroline Paulus
 */
public interface GradebookCategoryDAO {
     /**
      * Adds a gradebook category to a database and returns it
      *
      * @param Gradebook category being added
      * @return Gradebook category that was added
      */
     GradebookCategory addGradebookCategory(
          GradebookCategory gradebookCategory);

}

