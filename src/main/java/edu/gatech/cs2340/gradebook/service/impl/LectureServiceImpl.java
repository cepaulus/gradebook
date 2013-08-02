package edu.gatech.cs2340.gradebook.service.impl;

import edu.gatech.cs2340.gradebook.model.Lecture;
import edu.gatech.cs2340.gradebook.model.Section;
import edu.gatech.cs2340.gradebook.service.LectureService;
import edu.gatech.cs2340.gradebook.dao.LectureDAO;
import edu.gatech.cs2340.gradebook.dao.mock.LectureDAOMock;

/**
 * Service for Lectures
 *
 * @author Caroline Paulus
 */
public class LectureServiceImpl implements LectureService {

     private LectureDAO lectureDAO = new LectureDAOMock();

     @Override
     public Lecture addLecture(Lecture lecture) {
          return lectureDAO.addLecture(lecture);
     }

     @Override
     public Lecture addSectionToLecture(Lecture lecture, Section section) {
          return lectureDAO.addSectionToLecture(lecture, section);
     }

}
