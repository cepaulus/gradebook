package edu.gatech.cs2340.gradebook.dao.impl;

import edu.gatech.cs2340.gradebook.model.Section;
import edu.gatech.cs2340.gradebook.model.Student;
import edu.gatech.cs2340.gradebook.dao.SectionDAO;

import java.util.ArrayList;

/**
 * Data Access Object for a Section
 * Can be implemented with a database
 *
 * @author Caroline Paulus
 */
public class SectionDAOImpl implements SectionDAO {

     @Override
     public Section addSection(Section section) {
          // TODO - for use with a database
          return null;
     }

     @Override
     public Section addStudentToSection(Section section, Student student) {
          // TODO - for use with a database
          return null;
     }

     @Override
     public Section addStudentsToSection(
          Section section, ArrayList<Student> students) {
          // TODO - for use with a database
          return null;
     }

}

