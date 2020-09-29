import java.util.*;


//student object has a unique id
//student object gets a question object as an input
//receives available choices as well as the number of choices which should be selected 
//student object returns its chosen answer choice(s) via the answer_question() method

//Rafi Keshishian
//CS 3560 - Fall 2020
//Dr. Sun
//Project #1


public class Student {
	
	
	//holds the unique id of the student
	private int id;
	
	
	//a random generator object
	Random rand=new Random();
	
	
	//constructor
	Student(int new_id){
		id=new_id;
	}//end of constructor
	

	
	//method which gets a Question object as an input and returns the answer choice(s) of this student
	public String answer_question(Question given_question) {
	    
		
		//a string which holds the chosen answers of the student
		String my_answer="";
		ArrayList<String> available_answers=given_question.get_choices();
		
		
		//getting the number of correct choices which must be chosen
		int number_of_choices=given_question.get_number_of_correct_choices();
		
		//if the number of correct choices is one then one random choice is selected
		if (number_of_choices==1)
			my_answer=String.valueOf(rand.nextInt(available_answers.size())+1);
		//else multiple choices are selected
		else {
			int i=1;
			while (i<=number_of_choices) {
				int random_number=rand.nextInt(available_answers.size())+1;
				if(!my_answer.contains(String.valueOf(random_number))) {
					my_answer=my_answer+String.valueOf(random_number);
					i++;
				}
                 
			}
		}
	    
		//returns the string which holds the chosen answer choices for this student
		return my_answer;
	
	}//end of answer_question() method
	
	
	
	//returns the id of the student
	public int get_id() {
		return id;
	}//end of get_id() method
	
	

}//end of class Student
