package edu.gatech.cs2340.gradebook.model;

import edu.gatech.cs2340.gradebook.model.Lecture;
import edu.gatech.cs2340.gradebook.creator.LectureCreator;
import edu.gatech.cs2340.gradebook.creator.concrete.ConcreteLectureCreator;
import edu.gatech.cs2340.gradebook.service.LectureService;
import edu.gatech.cs2340.gradebook.service.impl.LectureServiceImpl;

import static org.junit.Assert.*; 
import org.junit.Test;
import java.util.ArrayList;

/**
 * Test for Courses
 *
 * @author Caroline Paulus
 */
public class LectureTest {

     @Test
     public void testCreateLecture() {

          String description = "MWF 10:00 - 11:00 AM";
          LectureCreator lectureCreator = new ConcreteLectureCreator();

          Lecture lecture = lectureCreator.createLecture(description);
          assertEquals(lecture.getDescription(), "MWF 10:00 - 11:00 AM");
          assertNull(lecture.getSections());
     }

     @Test
     public void testAddSectionToLecture() {

          LectureService lectureService = new LectureServiceImpl();
          Section section = new Section("A");
          Lecture lecture = new Lecture("test lecture");
          lectureService.addSectionToLecture(lecture, section);

          assertEquals(lecture.getSections().get(0).getSectionId(), "A");
     }

}
