package edu.gatech.cs2340.gradebook.model;

import edu.gatech.cs2340.gradebook.model.GradebookCategory;
import edu.gatech.cs2340.gradebook.creator.GradebookCategoryCreator;
import edu.gatech.cs2340.gradebook.creator
          .concrete.ConcreteGradebookCategoryCreator;

import static org.junit.Assert.*; 
import org.junit.Test;
import java.util.ArrayList;

/**
 * Test for Courses
 *
 * @author Caroline Paulus
 */
public class GradebookCategoryTest {

     @Test
     public void testCreateGradebookCategory() {
          String name = "Test";
          double weight = 0.2;

          GradebookCategoryCreator gradeBookCategoryCreator = 
                    new ConcreteGradebookCategoryCreator();
          GradebookCategory category = 
                    gradeBookCategoryCreator.createGradebookCategory(
                    name, weight);

          assertEquals(category.getName(), "Test");
     }

}
