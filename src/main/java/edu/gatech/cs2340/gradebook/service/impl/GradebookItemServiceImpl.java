package edu.gatech.cs2340.gradebook.service.impl;

import edu.gatech.cs2340.gradebook.model.GradebookItem;
import edu.gatech.cs2340.gradebook.service.GradebookItemService;
import edu.gatech.cs2340.gradebook.dao.GradebookItemDAO;
import edu.gatech.cs2340.gradebook.dao.mock.GradebookItemDAOMock;


/**
 * Service for Gradebook Items
 *
 * @author Caroline Paulus
 */
public class GradebookItemServiceImpl implements GradebookItemService {

     private GradebookItemDAO gradebookItemDAO =
               new GradebookItemDAOMock();

     @Override
     public GradebookItem addGradebookItem(GradebookItem gradebookItem) {

          return gradebookItemDAO.addGradebookItem(
               gradebookItem);
     }

}
