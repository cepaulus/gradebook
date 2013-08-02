package edu.gatech.cs2340.gradebook.dao;

import edu.gatech.cs2340.gradebook.model.Lecture;
import edu.gatech.cs2340.gradebook.model.Section;

/**
 * Data Access Object for a Lecture
 *
 * @author Caroline Paulus
 */
public interface LectureDAO {

     Lecture addLecture(Lecture lecture);

     Lecture addSectionToLecture(Lecture lecture, Section section);

}

