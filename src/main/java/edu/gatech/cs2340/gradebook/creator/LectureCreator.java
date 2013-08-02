package edu.gatech.cs2340.gradebook.creator;

import edu.gatech.cs2340.gradebook.model.Lecture;

/**
 * Creates a new Lecture
 *
 * @author Caroline Paulus
 */
public interface LectureCreator {
     /**
      * Creates a new Lecture and returns it
      *
      * @param description  Description of lecture (time, date, etc)
      * @return new Lecture
      */
     Lecture createLecture(String description);

}
