package edu.gatech.cs2340.gradebook.service.impl;

import edu.gatech.cs2340.gradebook.model.Section;
import edu.gatech.cs2340.gradebook.model.Student;
import edu.gatech.cs2340.gradebook.service.SectionService;
import edu.gatech.cs2340.gradebook.dao.SectionDAO;
import edu.gatech.cs2340.gradebook.dao.mock.SectionDAOMock;

import java.util.ArrayList;

/**
 * Service for Sections
 *
 * @author Caroline Paulus
 */
public class SectionServiceImpl implements SectionService {

     private SectionDAO sectionDAO = new SectionDAOMock();

     @Override
     public Section addSection(Section section) {

          return sectionDAO.addSection(section);
     }

     @Override
     public Section addStudentToSection(Section section, Student student) {
          return sectionDAO.addStudentToSection(section, student);
     }

     @Override
     public Section addStudentsToSection(
               Section section, ArrayList<Student> students) {
          return sectionDAO.addStudentsToSection(section, students);
     }

}
