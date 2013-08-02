package edu.gatech.cs2340.gradebook.dao;

import edu.gatech.cs2340.gradebook.model.Section;
import edu.gatech.cs2340.gradebook.model.Student;

import java.util.ArrayList;

/**
 * Data Access Object for a Section
 *
 * @author Caroline Paulus
 */
public interface SectionDAO {
     /**
      * Adds a section to a database and returns it
      *
      * @param Section being added
      * @return Section that was added
      */
     Section addSection(Section section);
     /**
      * Adds a student to an existing section and returns it
      *
      * @param Section getting a student added to it
      * @param Student being added to the section
      * @return Section with student added to it
      */
     Section addStudentToSection(Section section, Student student);
     /**
      * Adds multiple students to an existing section and returns it
      *
      * @param Section getting students added to it
      * @param Students being added to the section
      * @return Section with students added to it
      */
     Section addStudentsToSection(
          Section section, ArrayList<Student> students);

}

