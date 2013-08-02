package edu.gatech.cs2340.gradebook.dao.mock;

import edu.gatech.cs2340.gradebook.model.Lecture;
import edu.gatech.cs2340.gradebook.model.Section;
import edu.gatech.cs2340.gradebook.dao.LectureDAO;

/**
 * Mock Data Access Object for Lectures (Classes)
 * Used for testing purposes without a database
 *
 * @author Caroline Paulus
 */
public class LectureDAOMock implements LectureDAO {

     @Override
     public Lecture addLecture(Lecture lecture) {
          // TODO - add to mock "database"
          return lecture;
     }

     @Override
     public Lecture addSectionToLecture(Lecture lecture, Section section) {

          lecture.addSection(section);
          section.setLecture(lecture);
          return lecture;
     }

}

