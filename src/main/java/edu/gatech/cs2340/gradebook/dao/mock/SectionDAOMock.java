package edu.gatech.cs2340.gradebook.dao.mock;

import edu.gatech.cs2340.gradebook.model.Section;
import edu.gatech.cs2340.gradebook.model.Student;
import edu.gatech.cs2340.gradebook.dao.SectionDAO;

import java.util.ArrayList;

/**
 * Mock Data Access Object for Sections
 * Used for testing purposes without a database
 *
 * @author Caroline Paulus
 */
public class SectionDAOMock implements SectionDAO {

     @Override
     public Section addSection(Section section) {
          // TODO - add to mock "database"
          return section;
     }

     @Override
     public Section addStudentToSection(Section section, Student student) {

          section.addStudent(student);
          return section;
     }

     @Override
     public Section addStudentsToSection(
          Section section, ArrayList<Student> students) {

          for (Student student : students) {
               section.addStudent(student);
          }
          return section;
     }


}

