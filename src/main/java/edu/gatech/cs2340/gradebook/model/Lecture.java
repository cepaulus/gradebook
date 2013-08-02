package edu.gatech.cs2340.gradebook.model;

import java.util.ArrayList;

/**
 * An offering of a particular course in a particular semester
 * Corresponds to Class
 *
 * @author Caroline Paulus
 */
public class Lecture implements Gradable {

     private String description;
     private ArrayList<Section> sections;

     public Lecture(String description) {
          this.description = description;
     }

     public String getDescription() {
          return description;
     }

     public void setDescription(String description) {
          this.description = description;
     }

     public ArrayList<Section> getSections() {
          return sections;
     }

     public void setSections(ArrayList<Section> sections) {
          this.sections = sections;
     }

     public void addSection(Section section) {
          if (sections == null) {
               sections = new ArrayList<Section>();
          }
          sections.add(section);
     }

     public void removeSection(Section section) {
          sections.remove(section);
     }

}
