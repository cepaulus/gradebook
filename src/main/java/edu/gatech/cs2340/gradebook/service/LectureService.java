package edu.gatech.cs2340.gradebook.service;

import edu.gatech.cs2340.gradebook.model.Lecture;
import edu.gatech.cs2340.gradebook.model.Section;

/**
 * Service for Lectures
 *
 * @author Caroline Paulus
 */
public interface LectureService {
     /**
      * Adds a lecture to a database and returns it
      *
      * @param Lecture being added
      * @return Lecture that was added
      */
     Lecture addLecture(Lecture lecture);
     /**
      * Adds a section to a lecture and returns the lecture
      *
      * @param Lecture getting a section added to it
      * @oaram Section being added to the lecture
      * @return Lecture with the section added to it
      */
     Lecture addSectionToLecture(Lecture lecture, Section section);

}
