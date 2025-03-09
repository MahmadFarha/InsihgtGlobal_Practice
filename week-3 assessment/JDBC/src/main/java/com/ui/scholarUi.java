package com.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.exception.ScholarNotFoundException;
import com.model.Scholar;
import com.service.Service;
import com.service.ServiceImpl;

public class scholarUi {

	public static void main(String[] args) throws SQLException,ScholarNotFoundException {
		Service s=new ServiceImpl();
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter scholar details");
		Scholar scholar=new Scholar();
		scholar.setRollno(1);
		scholar.setName("farha");
		scholar.setMobile("623456789");
		scholar.setEmail("sonu@gmail");
		
		Scholar s1=new Scholar();
		s1.setRollno(2);
		s1.setName("nisha");
		s1.setMobile("5678");
		s1.setEmail("nisha@786");
		
		Scholar s2=new Scholar();
		s2.setRollno(4);
		s2.setName("chanda");
		s2.setMobile("6789567");
		s2.setEmail("chans@34567");
		
		System.out.println("===add scholar===");
		s.addScholar(scholar);
		s.addScholar(s1);
		s.addScholar(s2);
		
		System.out.println("===list all scholars===");
		s.listAllScholars().forEach(x->System.out.println(x));
		
		System.out.println("===get scholar by id===");
		Scholar gets=s.getScholarById(sc.nextInt());
		System.out.println(gets);
		
		
		
        System.out.println("===update email===");
        int rollno=sc.nextInt();
        System.out.println("enter new email");
        String e=sc.next();
        s.updateEmail(rollno,e );
        
		System.out.println("===list all scholars===");
		s.listAllScholars().forEach(x->System.out.println(x));
		
		System.out.println("===delete scholar by id===");
		s.deleteScholarById(sc.nextInt());
		
		System.out.println("===list all scholars===");
		s.listAllScholars().forEach(x->System.out.println(x));
	}

}
