package test;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import hospital.Doctors;

public class MainTest {
	
	
@Test


public void arrayTest() {
	

	Doctors doctor1 = new Doctors("Nick", "Junior", 4,0);
	
	
	ArrayList<Doctors> doctor = new ArrayList<Doctors>();
	
	doctor.add(doctor1);
	
	assertEquals("Junior", doctor.get(0).getRanking());
	
}


	public void testGetRank() {
		
		Doctors testGetRank = new Doctors("Niaomi", "Junior", 3,0);
		

			testGetRank.setRanking("Consultant");
			assertEquals("Consultant", testGetRank.getRanking());
}
	
	
	
	public void testSetDegree() {
	
		Doctors doc = new Doctors("Hannah", "Pea", 3,0);
		doc.setGrade(5);
		assertEquals(5, doc.getGrade());
}





}
