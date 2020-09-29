//Rafi Keshishian
//CS 3560 - Fall 2020
//Dr. Sun
//Project #1


public class SingleAnswerQuestion extends Question{
	
	//holds the correct answer of the question
	private String correct_answer;
	
	//constructor
	public SingleAnswerQuestion(int choice_number, String quest) {
		super(choice_number,quest);
	}
	
	//setting the correct choice of the question
	public void set_correct_answers(String correct) {
		correct_answer=correct;
	}
	
	
	//getting the correct answer
	public String get_correct_answers() {
		return correct_answer;
	}
	
	

}//end of AingleAnswerQuestion class
