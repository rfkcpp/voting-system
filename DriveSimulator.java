//Rafi Keshishian
//CS 3560 - Fall 2020
//Dr. Sun
//Project #1



import java.util.*;

//DriverSimulator class simulates the whole process of the voting
public class DriveSimulator {

	public static void main(String[] args) {
	
		
		//setting up a single answer question
		SingleAnswerQuestion first_question=new SingleAnswerQuestion(4,"Single Answer Question");
		//setting the answers of first question
		first_question.add_choice("1.first choice");
		first_question.add_choice("2.second choice");
		first_question.add_choice("3.third choice");
		first_question.add_choice("4.forth choice");
		//setting the correct answer for the first question
		first_question.set_correct_answers("2");
		//setting the number of correct choices
		first_question.set_num_of_correct_answers(1);
		
		
		//setting up a multiple answer question
		MultipleAnswerQuestion second_question=new MultipleAnswerQuestion(3,"Multiple answer question");
		//setting the answers of the second question
		second_question.add_choice("1.first choice");
		second_question.add_choice("2.second choice");
		second_question.add_choice("3.third choice");
		//setting the correct answers for the second question
		second_question.set_correct_answers("13");
		//setting the number of correct choices
		second_question.set_num_of_correct_answers(2);
		
		
		//creating an array of 1000 students to participate in the voting
		Student[] my_students= new Student[1000];
		for(int i=1; i<=1000; i++)
			my_students[i-1]=new Student(i);
		
		
		//creating an IVote object for conducting the voting on first question
		IVote my_voter=new IVote(first_question,my_students);
		
		//a random generator object
		Random rand=new Random();
		
		//getting time to conduct a 5 second voting for each question
		long now= System.currentTimeMillis();
	    
	    System.out.print("the voting takes 5 seconds for each question , please wait for statistics...\n\n");
	    
	    
	    //conducting 5 second voting  
	    while (System.currentTimeMillis()-now <= 5000) {
	    	
	    	//System.out.println(System.currentTimeMillis());
	    	int random_number=rand.nextInt(1000);
	    	String answer=my_students[random_number].answer_question(first_question);
	    	my_voter.get_an_answer(my_students[random_number].get_id(), answer);
	    	
	    }
	    
	    
	    //getting statistics for first question from IVote object
	    my_voter.print_statistics();
	    
	    
	    
	    //changing the current question of IVote object to multiple answer question
	    my_voter.set_current_question(second_question);
		now=System.currentTimeMillis();
		
	    //conducting a 5 second vote on second question
	    while ((System.currentTimeMillis())-now<=5000) {
	    	
	    	int random_number=rand.nextInt(1000);
	    	String answer=my_students[random_number].answer_question(second_question);
	    	my_voter.get_an_answer(my_students[random_number].get_id(), answer);
	    	
	    }
	    
	    //getting statistics for the second question from IVote object
	     my_voter.print_statistics();
		
        
	}//end of main function

}//end class
