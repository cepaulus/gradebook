package edu.gatech.cs2340.gradebook.creator;

import edu.gatech.cs2340.gradebook.model.Lecture;

/**
 * Creates a new Lecture
 *
 * @author Caroline Paulus
 */
public interface LectureCreator {

     Lecture createLecture(String description);

}
