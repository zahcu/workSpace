

public class rec {
  private int x;
  private int y;
  private int width;
  private int height;
  
  //constructor
  public rec() {
    x = 10;
    y = 10;
    width = 50;
    height = 100;
  }
  
  public rec(int x, int y, int w, int h) {
	  this.x = x;
	  this.y = y;
	  width = w;
	  height = h;

  }
  
  public int getX() {
	  return x;
  }
  
  public void setX(int x) {
	  this.x = x;
  }
  
  public void translate(int moveX, int moveY) {
	  x += moveX;
	  y += moveY;
  }
  public String toString() {
	  return "x: " + x + " y: " + y + " width: " + width + 
			  " Height: " + height;
  }
}
