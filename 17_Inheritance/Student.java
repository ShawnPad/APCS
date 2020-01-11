class Student{
  private String name;
  public int id;
  private String grade;
  private static int NUM_TESTS=3;
  int[] tests = new int[NUM_TESTS];
  Student(){
    name = "";
    grade = "";
    id = (int)(900000*Math.random()+100000);
  }
  Student(String name, int id,int[] a, String grade){
    this.name = name;
    this.id = id;
    tests = a;
  }
  Student(String name,int[] a, String grade){
    this.name = name;
    tests = a;
    id = (int)(900000*Math.random()+100000);
  }
  public String getName(){
    return name;
  }
  public void setName(String a){
    name = a;
  }
  public void printWelcome(){
    System.out.println("Welcome");
  }
  public String getGrade(){
    return grade;
  }
  public void setGrade(String newGrade){
    grade=newGrade;
  }
  public int getTestAverage(){
    int sum;
    for(int i = 0; i<tests.length; i++){
      sum+=tests[i];
    }
    return sum/tests.length;
  }
  public void computeGrade(){
    if(getName().equals("")){
      setGrade("");
    } else if(getTestAverage>=65){
      setGrade("Pass");
    } else {
      setGrade("Fail");
    }
  }
}
