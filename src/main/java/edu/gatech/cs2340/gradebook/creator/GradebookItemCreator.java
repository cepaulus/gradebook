package edu.gatech.cs2340.gradebook.creator;

import edu.gatech.cs2340.gradebook.model.GradebookItem;
import edu.gatech.cs2340.gradebook.model.GradebookCategory;

/**
 * Creates a new Gradebook Item
 *
 * @author Caroline Paulus
 */
public interface GradebookItemCreator {

     GradebookItem createGradebookItem(
          String name, GradebookCategory gradebookCategory);

     GradebookItem createGradebookItem(
          String name, GradebookCategory gradebookCategory, double score);

}
