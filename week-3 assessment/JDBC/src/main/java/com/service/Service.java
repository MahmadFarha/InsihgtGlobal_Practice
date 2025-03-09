package com.service;

import java.sql.SQLException;
import java.util.List;

import com.exception.ScholarNotFoundException;
import com.model.Scholar;

public interface Service {
	public void addScholar(Scholar scholar) throws SQLException ;
	public List<Scholar> listAllScholars() throws SQLException ;
	public Scholar getScholarById(int scholarId) throws SQLException, ScholarNotFoundException;
	public void updateEmail(int scholar_id,String email) throws SQLException, ScholarNotFoundException;
	public void deleteScholarById(int id) throws SQLException, ScholarNotFoundException;
}
