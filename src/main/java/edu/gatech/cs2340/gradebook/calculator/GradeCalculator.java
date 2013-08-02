package edu.gatech.cs2340.gradebook.calculator;

import edu.gatech.cs2340.gradebook.model.Gradable;
import edu.gatech.cs2340.gradebook.model.Grade;

/**
 * An algorithm for computing a grade/score
 *
 * @author Caroline Paulus
 */
public interface GradeCalculator {
      /**
      * Calculates and returns a Grade for a Gradable object
      *
      * @param Gradable object (student, section, lecture, course)
      * @return Grade object containing score and letter grade
      */
     Grade getGrade(Gradable gradable);
     /**
      * Returns the score portion of a Grade for any Gradable object
      *
      * @param Gradable object (student, section, lecture, course)
      * @return Score for the Gradable object
      */
     double getScore(Gradable gradable);
      /**
      * Returns the letter grade portion of a Grade for any Gradable object
      *
      * @param Gradable object (student, section, lecture, course)
      * @return Letter grade for the Gradable object
      */
     String getLetterGrade(Gradable gradable);

}
