package hospital;

import java.util.ArrayList;


public class Main {
	public static void main(String args[]) {
	
	Doctors doctor1 = new Doctors("James", "Consultant", 3,0);
	Doctors doctor2 = new Doctors("David", "Junior", 2 ,0);
	Doctors doctor3 = new Doctors("Sabrina", "Junior", 4 ,0);
	Doctors doctor4 = new Doctors("Harvey","Consultant", 4,0);
	Doctors doctor5 = new Doctors("Genie", "Junior" , 1,0);
	Doctors doctor6 = new Doctors("Maggie", "Junior", 2,0);
	Doctors doctor7 = new Doctors("Harry", "Junior", 2,0);
	Doctors doctor8 = new Doctors("Patrick", "Consultant", 5,0);
	Doctors doctor = new Doctors();
	
	ArrayList<Doctors> doctors = new ArrayList<Doctors>();	
	doctors.add(doctor1);
	doctors.add(doctor2);
	doctors.add(doctor3);
	doctors.add(doctor4);
	doctors.add(doctor5);
	doctors.add(doctor6);
	doctors.add(doctor7);
	doctors.add(doctor8);
	
	Patient patient = new Patient();
	Patient p = new Patient(null, "Alia", "Jane", 2, 0, 0);
	Patient p1 = new Patient(null,"Sarah", "Adam", 1,0,0);
	
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	patients.add(p);
	patients.add(p1);
	

	Team team = new Team();
	
    System.out.println(doctor.getInformation(doctors));
    
    
    System.out.println("\n");
    
	System.out.println("The doctor can treat patients above Grade Three: " + doctor.checkConsultant(doctor4));
	
	System.out.println("\n");
	
	
	
	

	System.out.println(team.generateTeam(doctors));
	
	System.out.println("\n");
	
	System.out.println("Patient : " + p.generateID(p) + " has been assigned to team Number " + team.admitPatient());
	
	
	System.out.println("\n");
	
    System.out.println("These are all doctors not part of team:  \n"  + doctor.getInformation(doctors));
    
	
	System.out.println("\n");
	
	System.out.println(doctor7.promote(doctor7));
	
	System.out.println("\n");
	
	
	
	
	System.out.print("Information of all the Patients " + patient.getInformationOfPatients(patients));
	team.removeDoctor(doctor4);

	

	}
	
	
		
}
	


