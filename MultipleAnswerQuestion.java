//Rafi Keshishian
//CS 3560 - Fall 2020
//Dr. Sun
//Project #1


public class MultipleAnswerQuestion extends Question{

	
	//holds the correct answers
	private String correct_answers;
	
	//constructor
	public MultipleAnswerQuestion(int choice_number, String quest) {
		super(choice_number,quest);
	}//end of constructor
	
	//sets the correct answers for this question
	public void set_correct_answers(String correct) {
		
		correct_answers=correct;
		
	}
	
	//returns the correct answers for this question
	public String get_correct_answers() {
		return correct_answers;
	}

}//end of MultipleAnswerQuestion class
