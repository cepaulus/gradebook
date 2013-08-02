package edu.gatech.cs2340.gradebook.model;

import edu.gatech.cs2340.gradebook.model.GradebookItem;
import edu.gatech.cs2340.gradebook.model.GradebookCategory;
import edu.gatech.cs2340.gradebook.creator.GradebookItemCreator;
import edu.gatech.cs2340.gradebook.creator
          .concrete.ConcreteGradebookItemCreator;

import static org.junit.Assert.*; 
import org.junit.Test;
import java.util.ArrayList;

/**
 * Test for Courses
 *
 * @author Caroline Paulus
 */
public class GradebookItemTest {

     @Test
     public void testCreateGradebookItem() {
          String name = "Exam 1";
          GradebookCategory category = new GradebookCategory("Test", 0.2);

          GradebookItemCreator gradebookItemCreator = 
                    new ConcreteGradebookItemCreator();
          GradebookItem gradebookItem = 
                    gradebookItemCreator.createGradebookItem(
                    name, category);

          assertEquals(gradebookItem.getGradebookCategory().getWeight(), 0.2, 0);
     }

     @Test
     public void testCreateGradebookItemWithScore() {
          String name = "Quiz 1";
          GradebookCategory category = new GradebookCategory("Quiz", 0.25);
          double score = .9;

          GradebookItemCreator gradebookItemCreator = 
                    new ConcreteGradebookItemCreator();
          GradebookItem gradebookItem = 
                    gradebookItemCreator.createGradebookItem(
                    name, category, score);

          assertEquals(gradebookItem.getScore(), 0.9, 0);
     }

}
