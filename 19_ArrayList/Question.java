import java.util.*;
class Question{
  private String question;
  private boolean isMultipleChoice;
  private String correctAnswer;
  private ArrayList<String> answers = new ArrayList<String>();
  public static final String[] LETTERS={"A. ", "B. ","C. ", "D. ", "E. "};
  Question(String question, boolean choice, String correctAnswer){
    this.question = question;
    isMultipleChoice = choice;
    this.correctAnswer = correctAnswer;
  }
  public boolean addChoice(String choice){
    if(answers.size()<LETTERS.length&&isMultipleChoice){
      answers.add(choice);
      return true;
    }
    return false;
  }
  public boolean addChoice(int index, String choice){
    if(answers.size()<LETTERS.length&&isMultipleChoice){
      answers.add(index, choice);
      return true;
    }
    return false;
  }
  public String toString(){
    String temp = question+"\n";
    if(isMultipleChoice){
      for(int i = 0; i<answers.size(); i++){
        temp += (LETTERS[i] + answers.get(i)+"\n");
      }
    } else {
      temp += "Answer: ";
    }
    return temp;
  }
  public void printAnswer(){
    System.out.println(correctAnswer);
  }
}
