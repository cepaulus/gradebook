package edu.gatech.cs2340.gradebook.service;

import edu.gatech.cs2340.gradebook.model.Section;
import edu.gatech.cs2340.gradebook.model.Student;

import java.util.ArrayList;

/**
 * Service for Sections
 *
 * @author Caroline Paulus
 */
public interface SectionService {

     Section addSection(Section section);

     Section addStudentToSection(Section section, Student student);

     Section addStudentsToSection(
          Section section, ArrayList<Student> students);

}
