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

     Section addSection(Section section);

     Section addStudentToSection(Section section, Student student);

     Section addStudentsToSection(
          Section section, ArrayList<Student> students);

}

