package hospital;

import java.util.ArrayList;

public class Doctors {


String docName;
String ranking;
int grade;
int teamNo;

public Doctors(String docName, String ranking, int grade, int teamNo) {
	super();
	this.docName = docName;
	this.ranking = ranking;
	this.grade = grade;
	this.teamNo = teamNo;
}


public Doctors() {
	
}


public int getTeamNo() {
	return teamNo;
}


public void setTeamNo(int teamNo) {
	this.teamNo = teamNo;
}


public String getDocName() {
	return docName;
}
public void setDocName(String docName) {
	this.docName = docName;
}
public String getRanking() {
	return ranking;
}
public void setRanking(String ranking) {
	this.ranking = ranking;
}
public int getGrade() {
	return grade;
}
public void setGrade(int grade) {
	this.grade = grade;
}

	

 public String promote(Doctors doctor) {
	
	String promote = "";

	
	if(doctor.grade >=3) {
		
		doctor.ranking = "Consultant";
		
		promote = doctor.docName + " has been promoted to " + doctor.ranking;
	
	}
	else { 
		promote = "Consultant requires a level of grade 3 minimum, cannot be promoted just yet";
		
	
	}
	
	return promote;
	
	 
	 
	
 }


public String getInformation(ArrayList<Doctors> doctors) {
	
	String info = "";
	
	String allInfo = "";
	
	for(int i=0; i<doctors.size(); i++) {
		
		info = "Doctors Name: " + doctors.get(i).docName + " , Doctors Ranking: " + doctors.get(i).ranking + " , Doctors Grade : " + 
					
				doctors.get(i).grade + " \n";
		
		allInfo = info + allInfo;
			
		
	}
	
	return allInfo;
	
}




//Verifies if consultant is above grade 3
 
 	public boolean checkConsultant(Doctors doctor) {
 		
 		Boolean verified = true;
 		
 		if( doctor.getGrade() >= 3) {
 			
 			verified = true;
 		
 			
 			
 		} else {
 			
 			verified = false;
 			
 		}
 		
		return verified ;
	 
 }





}
