package edu.gatech.cs2340.gradebook.creator;

import edu.gatech.cs2340.gradebook.model.GradebookItem;
import edu.gatech.cs2340.gradebook.model.GradebookCategory;

/**
 * Creates a new Gradebook Item
 *
 * @author Caroline Paulus
 */
public interface GradebookItemCreator {
     /**
      * Creates a new Gradebook Item and returns it
      *
      * @param name  Name of Gradebook Item
      * @param gradebookCategory  Category the GradebookItem falls under
      * @return new Gradebook Item
      */
     GradebookItem createGradebookItem(
          String name, GradebookCategory gradebookCategory);
     /**
      * Creates a new Gradebook Item and returns it
      *
      * @param name  Name of Gradebook Item
      * @param gradebookCategory  Category the GradebookItem falls under
      * @param score  Score the relevant student earned on the assignment
      * @return new Gradebook Item
      */
     GradebookItem createGradebookItem(
          String name, GradebookCategory gradebookCategory, double score);

}
