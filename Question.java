//Rafi Keshishian
//CS 3560 - Fall 2020
//Dr. Sun
//Project #1


import java.util.*;

public abstract class Question {

	
	// holds the stem of the question(stem is the wording phrase of the question)
	private String stem;
	// an ArrayList to hold the answers
	private ArrayList<String> choices=new ArrayList<String>();
	//holds the number of available choices
	private int num_of_choices;
	//number of correct answers
	private int num_of_correct_answers;
	
	
	//constructor
	public Question(int choice_number, String quest){
		
		stem=quest;
		num_of_choices=choice_number;
	}
	
	//returns stem of the question
	public String get_stem() {
		return stem;
	}
	
	//adds a choice to the possible choices of the question
	public void add_choice(String choice) {
		if (choices.size()<num_of_choices) 
			choices.add(choice);
			
	}
	
	//returns the available answer choices for this question
	public ArrayList<String> get_choices(){
		return choices;
	}
	
	
	
	//returns number of choices which should be selected for a question
	public int get_number_of_correct_choices() {
		return num_of_correct_answers;
	}
	
	//setting number of correct answers
	public void set_num_of_correct_answers(int num) {
		num_of_correct_answers=num;
	}
	
	//a method which sets the correct choices
	abstract void set_correct_answers(String correct);
	
	
	//a method which returns the correct choices
	abstract String get_correct_answers();
	
	
	

}//end of class Question
