/**
 * Write a description of class Horse here.
 * 
 * @author (your name) 
 * @version1 (a version number or a date)
 */

 public class Horse
 {
     //Fields of class Horse
     private String name;
     private char symbol;
     private int distance=0;
     private boolean fallen;
     private double confidence;
     
       
     //Constructor of class Horse
     /**
     
      * Constructor for objects of class Horse
      */
     public Horse(char horseSymbol, String horseName, double horseConfidence){
         this.name = horseName;
         this.symbol = horseSymbol;
         this.confidence = horseConfidence;
     }
     //Other methods of class Horse
        
     //this methos sets the value in the class variable fall to true
     public void fall(){
         fallen = true;
     }
 
     //this returns the value stored in the class variable confidence
     public double getConfidence(){
         return confidence;
     }
 
     //this returns the value stored in the class distance 
     public int getDistanceTravelled(){
         return distance;
     }
 
     //this returns the value stored in the class variable name 
     public String getName(){
         return name;
     }
 
     //this returns the value stored in the class variable symbol
     public char getSymbol(){
         return symbol;
     }
 
    // this changes the value of the variable distance
     public void goBackToStart(){
         distance =0;
     }

     //this returns the value stored in the class variable fall
     public boolean hasFallen(){
         return fallen;
     }
 
     // this adds 1 to the value of the variable distance
     public void moveForward(){
         distance +=1;
     }

     // this changes the value of the class variable confidence to the value stored in newConfidence
     public void setConfidence(double newConfidence){
         confidence = newConfidence;
     }
 
     
     // this changes the value of the class variable symbol to the value stored in newSymbol
     public void setSymbol(char newSymbol){
         symbol = newSymbol;
     }
 
 }


class Test{
    public static void main(String []args) {
        Horse h1 = new Horse( '♘', "betty", 0.5);
        System.out.println("The name of h1 is " +h1.getName());
        System.out.println("The confidence of h1 is " +h1.getConfidence());
        System.out.println("The symbol of h1 is " +h1.getSymbol());

        h1.setConfidence(1.0);
        System.out.println("The confidence of h1 is " +h1.getConfidence());

        h1.fall();
        System.out.println(h1.hasFallen());

        System.out.println("The distance travelled by h1 is " + h1.getDistanceTravelled());
        h1.moveForward();
        System.out.println("The distance travelled by h1 is " + h1.getDistanceTravelled());
        h1.goBackToStart();
        System.out.println("The distance travelled by h1 is " + h1.getDistanceTravelled());

        h1.setSymbol('&');
        System.out.println("The symbol of h1 is " +h1.getSymbol());

        
    }
    
}
