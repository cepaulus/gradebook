package edu.gatech.cs2340.gradebook.model;

/**
 * Name, tag, or category for Gradebook Items
 *
 * @author Caroline Paulus
 */
public class GradebookCategory {

    private String name;
    private double weight;

    private static final double TO_PERCENT = 100.;
    private static final int HASHCODE_INIT = 7;
    private static final int HASHCODE_MULT = 31;

    public GradebookCategory(String name, double weight) {
         this.name = name;
         this.weight = weight;
    }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public double getWeight() {
          return weight;
     }

     public void setWeight(double weight) {
          this.weight = weight;
     }

     @Override
     public boolean equals(Object obj) {
          if (obj instanceof GradebookCategory) {
               if (((GradebookCategory) obj).getName().equals(name)
                      && ((GradebookCategory) obj).getWeight() == weight) {
                    return true;
                }
          }
        return false;
     }

     @Override
     public int hashCode() {
        int hash = HASHCODE_INIT;
        hash = HASHCODE_MULT * (hash + (int) (weight * TO_PERCENT));
        int addHash;
        if (name == null) {
          addHash = 0;
        } else {
          addHash = name.hashCode();
        }
        hash = HASHCODE_MULT * hash + addHash;
        return hash;
     }

     @Override
     public String toString() {
          return (name + ": " + (weight * TO_PERCENT) + "%");
     }
}
