package edu.gatech.cs2340.gradebook.creator.concrete;

import edu.gatech.cs2340.gradebook.model.Section;
import edu.gatech.cs2340.gradebook.model.Lecture;
import edu.gatech.cs2340.gradebook.model.Student;
import edu.gatech.cs2340.gradebook.creator.SectionCreator;

import java.util.ArrayList;

/**
 * Creates a new Section
 *
 * @author Caroline Paulus
 */
public class ConcreteSectionCreator implements SectionCreator {

     @Override
     public Section createSection(
               String sectionId, Lecture lecture,
               ArrayList<Student> students) {

          Section section = new Section(sectionId, lecture, students);
          return section;
     }

     @Override
     public Section createSection(String sectionId, Lecture lecture) {

          Section section = new Section(sectionId, lecture,
               new ArrayList<Student>());
          return section;
     }

     @Override
     public Section createSection(String sectionId) {

          Section section = new Section(sectionId);
          return section;
     }

}
