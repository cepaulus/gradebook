package edu.gatech.cs2340.gradebook.creator.concrete;

import edu.gatech.cs2340.gradebook.model.Lecture;
import edu.gatech.cs2340.gradebook.creator.LectureCreator;

/**
 * Creates a new Lecture
 *
 * @author Caroline Paulus
 */
public class ConcreteLectureCreator implements LectureCreator {

     @Override
     public Lecture createLecture(String description) {

          Lecture lecture = new Lecture(description);
          return lecture;
     }

}
