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
     /**
      * Creates a new Section and returns it
      *
      * @param sectionId  Identification letter/number combo for the section
      * @param lecture  Lecture the Section is part of
      * @param students  List of students enrolled in the section
      * @return new Section
      */
     Section createSection(String sectionId,
          Lecture lecture, ArrayList<Student> students);
    /**
      * Creates a new Section and returns it
      *
      * @param sectionId  Identification letter/number combo for the section
      * @param lecture  Lecture the Section is part of
      * @return new Section
      */
     Section createSection(String sectionId, Lecture lecture);
    /**
      * Creates a new Section and returns it
      *
      * @param sectionId  Identification letter/number combo for the section
      * @return new Section
      */
     Section createSection(String sectionId);

}
