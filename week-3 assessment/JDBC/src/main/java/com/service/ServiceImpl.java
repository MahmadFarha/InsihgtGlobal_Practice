package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.daoImpl;
import com.exception.ScholarNotFoundException;
import com.model.Scholar;

public class ServiceImpl implements Service{

    private daoImpl scholarDao;

    // Constructor to initialize the ScholarDao
    public ServiceImpl(){
        this.scholarDao = new daoImpl(); // Initialize the DAO
    }

    // Add a new scholar
    public void addScholar(Scholar scholar) throws SQLException {
        scholarDao.addScholar(scholar);  
    }

    // Get a scholar by rollno
    public Scholar getScholarById(int rollno) throws SQLException, ScholarNotFoundException {
        return scholarDao.getScholarById(rollno);  
    }

    // Update the email of an existing scholar by rollno
    public void updateEmail(int scholarId, String email) throws SQLException, ScholarNotFoundException {
        scholarDao.updateEmail(scholarId, email);  
    }

    // Delete a scholar by rollno
    public void deleteScholarById(int id) throws SQLException, ScholarNotFoundException {
        scholarDao.deleteScholarById(id); 
    }

    public List<Scholar> listAllScholars() throws SQLException {
        return scholarDao.listAllScholars();  
    }
	
}




