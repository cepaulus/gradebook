package edu.gatech.cs2340.gradebook.creator.concrete;

import edu.gatech.cs2340.gradebook.model.Student;
import edu.gatech.cs2340.gradebook.creator.StudentCreator;

/**
 * Creates a new Student
 *
 * @author Caroline Paulus
 */
public class ConcreteStudentCreator implements StudentCreator {

     @Override
     public Student createStudent(String name) {

         Student student = new Student(name);
         return student;
     }

}
