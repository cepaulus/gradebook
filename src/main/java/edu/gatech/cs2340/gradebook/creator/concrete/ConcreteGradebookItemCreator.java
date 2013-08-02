package edu.gatech.cs2340.gradebook.creator.concrete;

import edu.gatech.cs2340.gradebook.model.GradebookCategory;
import edu.gatech.cs2340.gradebook.model.GradebookItem;
import edu.gatech.cs2340.gradebook.creator.GradebookItemCreator;


/**
 * Creates a new Gradebook Item
 *
 * @author Caroline Paulus
 */
public class ConcreteGradebookItemCreator implements GradebookItemCreator {

     @Override
     public GradebookItem createGradebookItem(
               String name, GradebookCategory gradebookCategory) {

          GradebookItem gradebookItem =
                    new GradebookItem(name, gradebookCategory);
          return gradebookItem;
     }

     @Override
     public GradebookItem createGradebookItem(
               String name, GradebookCategory gradebookCategory,
               double score) {

          GradebookItem gradebookItem =
                    new GradebookItem(name, gradebookCategory, score);
          return gradebookItem;
     }

}
