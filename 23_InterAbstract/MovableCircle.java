class MovableCircle implements Movable{
  MovablePoint p;
  private int radius;
  MovableCircle(int x, int y, int r){
    p = new MovablePoint(x,y);
    radius = r;
  }
  public String toString(){
    return p+ "Radius: "+radius;
  }
  public void moveUp(){
    p.moveUp();
  }
  public void moveDown(){
    p.moveDown();
  }
  public void moveLeft(){
    p.moveLeft();
  }
  public void moveRight(){
    p.moveRight();
  }
}
