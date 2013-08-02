package edu.gatech.cs2340.gradebook.creator;

import edu.gatech.cs2340.gradebook.model.Section;
import edu.gatech.cs2340.gradebook.model.Lecture;
import edu.gatech.cs2340.gradebook.model.Student;

import java.util.ArrayList;

/**
 * Creates a new Section
 *aa
 * @author Caroline Paulus
 */
public interface SectionCreator {

     Section createSection(String sectionId,
          Lecture lecture, ArrayList<Student> students);

     Section createSection(String sectionId, Lecture lecture);

     Section createSection(String sectionId);

}
