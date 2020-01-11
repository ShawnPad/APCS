class UnderGrad extends Student{
  UnderGrad(){
    super();
  }
  UnderGrad(String name, int[] a, String grade){
    super(name,a,grade);
  }
  public void computeGrade(){
    if(getTestAverage>=70)}{
      setGrade("Pass");
    } else {
      setGrade("Fail");
    }
  }
}
