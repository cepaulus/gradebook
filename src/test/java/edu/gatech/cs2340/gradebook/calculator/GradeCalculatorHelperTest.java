package edu.gatech.cs2340.gradebook.calculator;

import edu.gatech.cs2340.gradebook.model.Gradable;
import edu.gatech.cs2340.gradebook.model.Grade;
import edu.gatech.cs2340.gradebook.model.GradebookItem;
import edu.gatech.cs2340.gradebook.model.GradebookCategory;
import edu.gatech.cs2340.gradebook.calculator.GradeCalculatorHelper;
import edu.gatech.cs2340.gradebook.calculator.impl.GradeCalculatorHelperImpl;

import static org.junit.Assert.*; 
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Test for Courses
 *
 * @author Caroline Paulus
 */
public class GradeCalculatorHelperTest {

     @Test
     public void testAddEntry() {
          GradeCalculatorHelper helper = new GradeCalculatorHelperImpl();
          GradebookCategory category = new GradebookCategory("Tests", 0.2);
          GradebookItem midterm = new GradebookItem("Midterm", category);

          helper.addEntry(midterm);
          HashMap<GradebookCategory, ArrayList<GradebookItem>> map = 
                    helper.getAssignmentsByCategory();
          assertEquals(map.get(category).get(0), midterm);
     }

     @Test
     public void testGetCategories() {
          ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
          GradebookCategory hw = new GradebookCategory("HW", 0.2);
          GradebookCategory test = new GradebookCategory("Test", 0.3);
          GradebookCategory quiz = new GradebookCategory("Quiz", 0.15);

          GradebookItem item1 = new GradebookItem("HW1", hw, .95);
          GradebookItem item2 = new GradebookItem("Quiz1", quiz, .79);
          GradebookItem item3 = new GradebookItem("Test1", test, .88);
          GradebookItem item4 = new GradebookItem("HW2", hw, .80);


          GradeCalculatorHelper helper = new GradeCalculatorHelperImpl();
          helper.addEntry(item1);
          helper.addEntry(item2);
          helper.addEntry(item3);

          assertEquals(helper.getCategories().get(0), hw);
          assertEquals(helper.getCategories().get(1), quiz);
          assertEquals(helper.getCategories().get(2), test);
     }

     @Test
     public void testGetTotalWeight() {
          ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
          GradebookCategory hw = new GradebookCategory("HW", 0.2);
          GradebookCategory test = new GradebookCategory("Test", 0.3);

          GradebookItem item1 = new GradebookItem("HW1", hw, .95);
          GradebookItem item2 = new GradebookItem("HW2", hw, .80);
          GradebookItem item3 = new GradebookItem("Test1", test, .88);
          

          GradeCalculatorHelper helper = new GradeCalculatorHelperImpl();
          helper.addEntry(item1);
          helper.addEntry(item2);
          helper.addEntry(item3);

          assertEquals(helper.getTotalWeight(), 0.5, 0);
     }

     @Test
     public void testGetScoresByCategory() {
          ArrayList<GradebookItem> items = new ArrayList<GradebookItem>();
          GradebookCategory hw = new GradebookCategory("HW", 0.2);
          GradebookCategory test = new GradebookCategory("Test", 0.3);

          GradebookItem hw1 = new GradebookItem("HW1", hw, .80);
          GradebookItem hw2 = new GradebookItem("HW2", hw, .90);
          GradebookItem hw3 = new GradebookItem("HW3", hw, .70);
          GradebookItem hw4 = new GradebookItem("HW4", hw, 1.0);
          GradebookItem test1 = new GradebookItem("Test1", test, .85);
          GradebookItem test2 = new GradebookItem("Test2", test, .95);
          

          GradeCalculatorHelper helper = new GradeCalculatorHelperImpl();
          helper.addEntry(hw1);
          helper.addEntry(hw2);
          helper.addEntry(hw3);
          helper.addEntry(hw4);
          helper.addEntry(test1);
          helper.addEntry(test2);

          HashMap<GradebookCategory, Double> scores =  
                                   helper.getScoresByCategory();
          double hwGrade = ((.8 + .9 + .7 + 1)/4)*.2;
          double testGrade = ((.85 + .95)/2)*.3;
          assertEquals(scores.get(hw), hwGrade, 0);
          assertEquals(scores.get(test), testGrade, 0);
     }

}
