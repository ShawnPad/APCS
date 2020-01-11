class MovablePoint implements Movable{
  private int x,y;
  MovablePoint(int x, int y){
    this.x=x;
    this.y=y;
  }
  public String toString(){
    return "("+x+","+y+")";
  }
  public void moveUp(){
    y+=1;
  }
  public void moveDown(){
    y-=1;
  }
  public void moveLeft(){
    x-=1;
  }
  public void moveRight(){
    x+=1;
  }
}
