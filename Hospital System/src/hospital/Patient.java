package hospital;

import java.util.ArrayList;
import java.util.UUID;

public class Patient {


UUID patientID;
String firstName;
String lastName;
int levelOfInjury;
int wardNo;
int teamNo;





public Patient(UUID patientID, String firstName, String lastName, int levelOfInjury, int wardNo, int teamNo) {
	super();
	this.patientID = patientID;
	this.firstName = firstName;
	this.lastName = lastName;
	this.levelOfInjury = levelOfInjury;
	this.wardNo = wardNo;
	this.teamNo = teamNo;
}


public Patient() {
	
}


public UUID generateID(Patient p)	{
	
	UUID patientID = UUID.randomUUID();
	
	
	p.setPatientID(patientID);
	
	return patientID;

}


public int getLevelOfInjury() {
	return levelOfInjury;
}
public void setLevelOfInjury(int levelOfInjury) {
	this.levelOfInjury = levelOfInjury;
}
public int getTeamNo() {
	return teamNo;
}
public void setTeamNo(int teamNo) {
	this.teamNo = teamNo;
}
public UUID getPatientID() {
	return patientID;
}

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getWardNo() {
	return wardNo;
}
public void setWardNo(int wardNo) {
	this.wardNo = wardNo;
	
}
public void setPatientID(UUID patientID) {
this.patientID = patientID;
	
}


public String getInformationOfPatients(ArrayList<Patient> patient) {
	
	String info = "";
	
	String allInfo = "";
	
	for(int i=0; i<patient.size(); i++) {
		
		info = "Patients Name: " + patient.get(i).firstName +  " "  + patient.get(i).lastName +
		
				"  PatientsID: " + patient.get(i).patientID + " , level of Injury : " + 
				
					
				patient.get(i).levelOfInjury + ", Doctors allocated are of team  " + patient.get(i).teamNo
				+ " , Ward Number:    " + patient.get(i).wardNo + " \n";
					
				
		
		allInfo = info + allInfo;
			
		
	}
	
	return allInfo;
	
}


	
}







