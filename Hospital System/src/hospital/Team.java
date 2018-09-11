package hospital;


 

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;

import java.util.Map;


public class Team extends Doctors {


	
	public Team() {

	}

	public Team(String docName, String ranking, int grade, int teamNo) {

		super(docName, ranking, grade, teamNo);

	}
	

	
	
	HashMap<Integer, String> group = new HashMap<Integer , String>(); 
	HashMap<Integer, String> temp = new HashMap<Integer , String>(); 
	
	public HashMap<Integer,String> generateTeam(ArrayList<Doctors> doctors) {

		String consultant = "Consultant";
		String teamMember = " ";
		
		
		String team = "";
		
		int teamID = (int)(Math.random()*10);
		
		
		Collections.shuffle(doctors);
		
		
		
		
		for (int i = 0; i <=3 ; i++) {
			

			teamMember = doctors.get(i).ranking + doctors.get(i).docName ;
			
			
			
			doctors.get(i).setTeamNo(teamID);
		
			temp.put(teamID, teamMember);
			
			team =  temp + team ;
			
	
			doctors.remove(i);  //Ensures that same doctor can't be in another team as removes from list;
			
			
			
				
		
		}

		if (team.contains(consultant) && team.length() >=2 || team.length() <=4){
		
			group.put(teamID, team);
			
			

		} 
		
		
		return group;

	}
	
	
	

	
	


public int admitPatient() {
	//Assigns patient a teamNumber 
	
	
	for(Map.Entry<Integer,String> entry: group.entrySet()) {
		
		teamNo = entry.getKey();
	
	
	}
	
	return teamNo;
	
	

}
	
	


public String removeDoctor(Doctors doctor) {
	
	String res = "" ;
	

			
				

				
					
					for(Map.Entry<Integer,String> entry: group.entrySet()) {
		
		
							for(Map.Entry<Integer,String> entry2: temp.entrySet()) {	
								
					
						if((doctor.ranking.equals("Consultant"))) {

				int freq = Collections.frequency(group.values(), "Consultant");
					
						if(freq>1) {
							
					group.remove(doctor.ranking, doctor.docName);
					
					res = group  + "doc removed";
			
				
			}
				else {
					
					res = "Cannot Remove, team requires 1 consultant ";
					
			
				}
			
			
		}
		
		
}
					return res;

	
	


	


}
	return res;
}
}






		
	
	
	
	
	
	
	
	
		
		
		




		
	
		
	


