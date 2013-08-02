package edu.gatech.cs2340.gradebook.service;

import edu.gatech.cs2340.gradebook.model.Lecture;
import edu.gatech.cs2340.gradebook.model.Section;

/**
 * Service for Lectures
 *
 * @author Caroline Paulus
 */
public interface LectureService {

     Lecture addLecture(Lecture lecture);

     Lecture addSectionToLecture(Lecture lecture, Section section);

}
