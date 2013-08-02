package edu.gatech.cs2340.gradebook.model;

import edu.gatech.cs2340.gradebook.model.Section;
import edu.gatech.cs2340.gradebook.model.Student;
import edu.gatech.cs2340.gradebook.creator.SectionCreator;
import edu.gatech.cs2340.gradebook.creator.concrete.ConcreteSectionCreator;
import edu.gatech.cs2340.gradebook.service.SectionService;
import edu.gatech.cs2340.gradebook.service.impl.SectionServiceImpl;

import static org.junit.Assert.*; 
import org.junit.Test;
import java.util.ArrayList;

/**
 * Test for Courses
 *
 * @author Caroline Paulus
 */
public class SectionTest {

     @Test
     public void testCreateSectionA() {
          SectionCreator sectionCreator = new ConcreteSectionCreator();

          String sectionId = "A";
          Section section = sectionCreator.createSection(sectionId);
          assertEquals("A", section.getSectionId());
     }

     @Test
     public void testCreateSectionB() {
          SectionCreator sectionCreator = new ConcreteSectionCreator();

          String sectionId = "B";
          Lecture lecture = new Lecture("Test lecture");
          Section section = sectionCreator.createSection(sectionId, lecture);
          assertEquals("Test lecture", section.getLecture().getDescription());
     }

     @Test
     public void testAddStudentToSection() {
          SectionService sectionService = new SectionServiceImpl();

          Section section = new Section("C");
          Student student = new Student("Anna");
          section = sectionService.addStudentToSection(section, student);
          assertEquals(section.getStudents().get(0).getName(), "Anna");
     }


     @Test
     public void testAddStudentsToSection() {
          SectionService sectionService = new SectionServiceImpl();
          ArrayList<Student> students = new ArrayList<Student>();

          Section section = new Section("C");
          Student student1 = new Student("Anna");
          Student student2 = new Student("David");

          students.add(student1);
          students.add(student2);
          section = sectionService.addStudentsToSection(section, students);
          assertEquals(section.getStudents().get(1).getName(), "David");
     }

}
