package edu.gatech.cs2340.gradebook.dao;

import edu.gatech.cs2340.gradebook.model.GradebookItem;

/**
 * Data Access Object for a Gradebook Item
 *
 * @author Caroline Paulus
 */
public interface GradebookItemDAO {

     /**
      * Adds a gradebook item to a database and returns it
      *
      * @param Gradebook item being added
      * @return Gradebook item that was added
      */
     GradebookItem addGradebookItem(GradebookItem gradebookItem);

}

