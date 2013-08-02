package edu.gatech.cs2340.gradebook.model;

import edu.gatech.cs2340.gradebook.model.Course;
import edu.gatech.cs2340.gradebook.model.Lecture;
import edu.gatech.cs2340.gradebook.creator.CourseCreator;
import edu.gatech.cs2340.gradebook.creator.concrete.ConcreteCourseCreator;
import edu.gatech.cs2340.gradebook.service.CourseService;
import edu.gatech.cs2340.gradebook.service.impl.CourseServiceImpl;

import static org.junit.Assert.*; 
import org.junit.Test;
import java.util.ArrayList;

/**
 * Test for Courses
 *
 * @author Caroline Paulus
 */
public class CourseTest {

     @Test
     public void testCreateCourse() {
          String subject = "Computer Science";
          int courseNumber = 2340;
          String name = "Objects and Design";

          CourseCreator courseCreator = new ConcreteCourseCreator();
          Course csCourse = courseCreator.createCourse(
                    subject, courseNumber, name);

          assertEquals(csCourse.getCourseNumber(), 2340);
     }

     @Test
     public void testAddLectureToCourse() {
          String subject = "Calculus";
          int courseNumber = 2605;
          String name = "Calculus 3";

          Course course = new Course(subject, courseNumber, name);
          Lecture lecture = new Lecture("1:20 PM MWF");

          CourseService courseService = new CourseServiceImpl();
          course = courseService.addLectureToCourse(course, lecture);

          assertEquals(course.getLectures().get(0), lecture);
     }

}
