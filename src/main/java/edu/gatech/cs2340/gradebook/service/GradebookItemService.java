package edu.gatech.cs2340.gradebook.service;

import edu.gatech.cs2340.gradebook.model.GradebookItem;

/**
 * Service for Gradebook Items
 *
 * @author Caroline Paulus
 */
public interface GradebookItemService {
    /**
      * Adds a gradebook item to a database and returns it
      *
      * @param Gradebook item being added
      * @return Gradebook item that was added
      */
     GradebookItem addGradebookItem(
          GradebookItem gradebookItem);

}
