package edu.gatech.cs2340.gradebook.calculator;

import edu.gatech.cs2340.gradebook.model.Gradable;
import edu.gatech.cs2340.gradebook.model.Grade;

/**
 * An algorithm for computing a grade/score
 *
 * @author Caroline Paulus
 */
public interface GradeCalculator {

     Grade getGrade(Gradable gradable);

     double getScore(Gradable gradable);

     String getLetterGrade(Gradable gradable);

}
