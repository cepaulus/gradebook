package edu.gatech.cs2340.gradebook.dao;

import edu.gatech.cs2340.gradebook.model.GradebookCategory;

/**
 * Data Access Object for a Gradebook Category
 *
 * @author Caroline Paulus
 */
public interface GradebookCategoryDAO {

     GradebookCategory addGradebookCategory(
          GradebookCategory gradebookCategory);

}

