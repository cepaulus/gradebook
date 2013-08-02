package edu.gatech.cs2340.gradebook.dao.mock;

import edu.gatech.cs2340.gradebook.model.GradebookCategory;
import edu.gatech.cs2340.gradebook.dao.GradebookCategoryDAO;

/**
 * Mock Data Access Object for Gradebook Categories
 * Used for testing purposes without a database
 *
 * @author Caroline Paulus
 */
public class GradebookCategoryDAOMock implements GradebookCategoryDAO {

     @Override
     public GradebookCategory addGradebookCategory(
               GradebookCategory gradebookCategory) {
          // TODO - add to mock "database"
          return gradebookCategory;
     }

}

