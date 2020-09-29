//Rafi Keshishian
//CS 3560 - Fall 2020
//Dr. Sun
//Project #1


import java.util.HashMap;
import java.util.Map;

public class IVote {

	//holds the current question which the ivote object is getting answers
	private Question asked_question;
	
	//an array of student objects which Ivote is getting the answers
	private Student[] participants;
	
	//a hashmap that stores answers for each student
	HashMap<Integer,String> submitted_answers= new HashMap<>();
	
	//constructor
	public IVote(Question current_question, Student[] current_participants) {
		asked_question=current_question;
		participants=current_participants;
	}
	
	
	//sets the asked question
	public void set_current_question(Question current_question) {
		asked_question=current_question;
	}
	
	//getting answers from students
	public void get_an_answer(Integer student_id, String answer) {
		
			submitted_answers.put(student_id,answer);
		
	}
	
	
	//prints the statistics of the voting
	public void print_statistics() {
		System.out.println("*****************************************************");
		System.out.print("Printing the statistics for the following Question: \n");
		System.out.println(asked_question.get_stem());
		System.out.println("\navailable choices are:");
		
		for (int i=0; i<asked_question.get_choices().size(); i++) {
			System.out.println( asked_question.get_choices().get(i) );
		}	
		
		System.out.print("$$$$$$$$$  the correct answer(s) for this question was choice(s): "+asked_question.get_correct_answers()+"   $$$$$$$$$$$$$\n\n");
		
		System.out.println(submitted_answers.size()+" students out of 1000 students answered this question");
		
		double num_of_correct_submissions=0;
	      for ( Map.Entry<Integer,String> e : submitted_answers.entrySet()) {
	    	  if (e.getValue().equals(asked_question.get_correct_answers())){
	    		  num_of_correct_submissions++;
	    	  }
	      }
	            
	    System.out.println(num_of_correct_submissions+ "students chose correct answer(s).");
		
	    double percentage= (num_of_correct_submissions/1000.0)*100;
		System.out.println(percentage+"percent of students submitted correct answer(s)");
		
		
		//getting the number of submission per answer choice
		for (int i=1; i<=asked_question.get_choices().size(); i++) {
			int counter=0;
		    for ( Map.Entry<Integer,String> e : submitted_answers.entrySet()) {
		    	if (e.getValue().contains(String.valueOf(i)))
		    		  counter++;
		    	  }
			System.out.println(counter+" students answered choice: "+i );
		}
		
		System.out.println("------------------------------------------------------------");
		
	}//end of print statistics
	



}//end of IVote class
