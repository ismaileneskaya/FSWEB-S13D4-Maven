package org.example;

public class Point {
   private int x;
   private int y;


   public Point(int x, int y) {
       this.x = x;
       this.y = y;
   }

   public int getX(){
       return x;
   }
   public void setX(int x){
       this.x=x;
   }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }

    public double distance(){
        return Math.sqrt(x*x+y*y);
    }

    public double distance(Point p){
       int xDiff=this.x- p.getX();
       int yDiff=this.y- p.getY();
       return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    public double distance(int a,int b){
       int xDiff =this.x-a;
       int yDiff=this.y-b;
       return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }

}
