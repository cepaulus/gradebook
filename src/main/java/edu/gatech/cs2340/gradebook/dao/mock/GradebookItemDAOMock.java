package edu.gatech.cs2340.gradebook.dao.mock;

import edu.gatech.cs2340.gradebook.model.GradebookItem;
import edu.gatech.cs2340.gradebook.dao.GradebookItemDAO;

/**
 * Mock Data Access Object for Gradebook Items
 * Used for testing purposes without a database
 *
 * @author Caroline Paulus
 */
public class GradebookItemDAOMock implements GradebookItemDAO {

     @Override
     public GradebookItem addGradebookItem(
                    GradebookItem gradebookItem) {
          // TODO - add to mock "database"
          return gradebookItem;
     }

}

