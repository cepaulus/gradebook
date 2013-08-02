package edu.gatech.cs2340.gradebook.model;


/**
 * A thing for which a student receives a score
 *
 * @author Caroline Paulus
 */
public class GradebookItem {

    private String name;
    private GradebookCategory gradebookCategory;
    private double score;

    private static final double TO_PERCENT = 100.;
    private static final int HASHCODE_INIT = 7;
    private static final int HASHCODE_MULT = 31;

    public GradebookItem(String name, GradebookCategory gradebookCategory) {
        this.name = name;
        this.gradebookCategory = gradebookCategory;
    }

    public GradebookItem(String name, GradebookCategory gradebookCategory,
              double score) {
        this.name = name;
        this.gradebookCategory = gradebookCategory;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GradebookCategory getGradebookCategory() {
        return gradebookCategory;
    }

    public void setGradebookCategory(GradebookCategory gradebookCategory) {
        this.gradebookCategory = gradebookCategory;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public GradebookItem copy() {
        GradebookItem copy = new GradebookItem(
                getName(), getGradebookCategory());
        if (getScore() != 0.0) {
            copy.setScore(getScore());
        }
        return copy;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof GradebookItem) {
            if (((GradebookItem) obj).getName().equals(name)
                    && ((GradebookItem) obj).getGradebookCategory().equals(
                    gradebookCategory)) {
                  return true;
              }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = HASHCODE_INIT;
        hash = HASHCODE_MULT * (hash + (int) (score * TO_PERCENT));
        int addHash;
        if (name == null) {
          addHash = 0;
        } else {
          addHash = name.hashCode();
        }
        hash = HASHCODE_INIT * hash + addHash;
        return hash;
    }

    @Override
    public String toString() {
        if (score != 0) {
            return (name + ": " + score);
        }
        return name;
    }

}
