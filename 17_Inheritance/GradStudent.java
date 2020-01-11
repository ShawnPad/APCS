class GradStudent extends Student{
  private String dissertationTopic;
  GradStudent(){
    super();
    dissertationTopic="";
  }
  GradStudent(String name, int id, int[] a, String grade, String topic){
    super(name,id,a,grade);
    dissertationTopic=topic;
  }
  public String getTopic(){
    return dissertationTopic;
  }
  public void setTopic(String a){
    dissertationTopic = a;
  }
  public void printWelcome(){
    System.out.println("Welcome to Graduate School");
  }
  public void computeGrade(){
    if(getTestAverage>=90)}{
      setGrade("Pass");
    } else {
      setGrade("Fail");
    }
  }
}
