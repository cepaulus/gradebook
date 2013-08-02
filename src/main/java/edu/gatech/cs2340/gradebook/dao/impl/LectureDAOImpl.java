package edu.gatech.cs2340.gradebook.dao.impl;

import edu.gatech.cs2340.gradebook.model.Lecture;
import edu.gatech.cs2340.gradebook.model.Section;
import edu.gatech.cs2340.gradebook.dao.LectureDAO;

/**
 * Data Access Object for a Lecture (Class)
 * Can be implemented with a database
 *
 * @author Caroline Paulus
 */
public class LectureDAOImpl implements LectureDAO {

     @Override
     public Lecture addLecture(Lecture lecture) {
          // TODO - for use with a database
          return null;
     }


     @Override
     public Lecture addSectionToLecture(Lecture lecture, Section section) {
          // TODO - for use with a database
          return null;
     }

}

