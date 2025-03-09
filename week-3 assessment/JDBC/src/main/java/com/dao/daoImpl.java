package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exception.ScholarNotFoundException;
import com.model.Scholar;
import com.util.DbUtil;

public class daoImpl implements dao {
	public void addScholar(Scholar scholar) throws SQLException {
		String query="insert into scholar (rollno,name,email,mobile) values (?,?,?,?)";
		try(Connection con=DbUtil.getConnection();
			PreparedStatement pst=con.prepareStatement(query)){
			pst.setInt(1, scholar.getRollno());
			pst.setString(2,scholar.getName());
			pst.setString(3, scholar.getEmail());
            pst.setString(4, scholar.getMobile());
            pst.executeUpdate();
            System.out.println("scholar added successfully");
			
		}
		
	}
	public List<Scholar> listAllScholars() throws SQLException {
		String query="select * from scholar";
		List<Scholar> scholars=new ArrayList<>();
		try(Connection con=DbUtil.getConnection();
			PreparedStatement pst=con.prepareStatement(query);
			ResultSet rst=pst.executeQuery()){
			while(rst.next()) {
				scholars.add(new Scholar(
						rst.getInt("rollno"),
						rst.getString("name"),
	                    rst.getString("email"),
	                    rst.getString("mobile")
						
						));
			}
		}
		return scholars;
	} 
	public Scholar getScholarById(int scholarId) throws SQLException,ScholarNotFoundException{
		String query="select * from scholar where rollno=?";
		Scholar scholar=null;
		try(Connection con=DbUtil.getConnection();
				PreparedStatement pst=con.prepareStatement(query)){
			pst.setInt(1, scholarId);
			ResultSet rst=pst.executeQuery();
			if(rst.next()) {
				scholar =new Scholar(
	                    rst.getInt("rollno"),
	                    rst.getString("name"),
	                    rst.getString("email"),
	                    rst.getString("mobile")
	                );
			}
			else {
				throw new ScholarNotFoundException("schoalr with rollnum"+scholarId+"not found");
			}
		}
		return scholar;
	}
	public void updateEmail(int scholar_id,String email) throws SQLException, ScholarNotFoundException{
		String query="update scholar set email=? where rollno=?";
		Scholar scholar=new Scholar();
		try(Connection con=DbUtil.getConnection();
				PreparedStatement pst=con.prepareStatement(query)){
			pst.setString(1,email);
			pst.setInt(2, scholar_id);
			int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Scholar email updated successfully!");
            } else {
                System.out.println("Scholar not found.");
            }
		}
		
	}
	
	public void deleteScholarById(int id) throws SQLException, ScholarNotFoundException{
		String query="delete from scholar where rollno=?";
		try(Connection con=DbUtil.getConnection();
				PreparedStatement pst=con.prepareStatement(query)){
			pst.setInt(1, id);
			int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Scholar deleted successfully!");
            } else {
                System.out.println("Scholar not found.");
            }
			
		}
	}
}

//
//public void updateScholarEmail(int scholarId, String newEmail) throws SQLException, ScholarNotFoundException {
//    String sql = "UPDATE scholar SET email = ? WHERE rollno = ?";
//    try (Connection conn = DbUtil.getConnection();
//         PreparedStatement stmt = conn.prepareStatement(sql)) {
//
//        stmt.setString(1, newEmail);
//        stmt.setInt(2, scholarId);
//        int rowsAffected = stmt.executeUpdate();
//        if (rowsAffected == 0) {
//            throw new ScholarNotFoundException("Scholar ID " + scholarId + " Not Found!");
//        }
//    } catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}


