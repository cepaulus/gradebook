package edu.gatech.cs2340.gradebook.service.impl;

import edu.gatech.cs2340.gradebook.model.GradebookCategory;
import edu.gatech.cs2340.gradebook.service.GradebookCategoryService;
import edu.gatech.cs2340.gradebook.dao.GradebookCategoryDAO;
import edu.gatech.cs2340.gradebook.dao.mock.GradebookCategoryDAOMock;

/**
 * Service for Gradebook Categories
 *
 * @author Caroline Paulus
 */
public class GradebookCategoryServiceImpl
               implements GradebookCategoryService {

     private GradebookCategoryDAO gradebookCategoryDAO =
               new GradebookCategoryDAOMock();

     @Override
     public GradebookCategory addGradebookCategory(
               GradebookCategory gradebookCategory) {

          return gradebookCategoryDAO.addGradebookCategory(
               gradebookCategory);
     }

}
