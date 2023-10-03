public class Modulus{

  public static void main(String[] args){

  byte d1=30,d2=15,d3=25,d4=50;

  int mod2,mod3,mod4;
  
  mod2=d1%d2;   //rem=0

  mod3=d3%d2; //rem=10
 
  mod4=d3%d4; //rem=25
  
  System.out.println("Modulus of two numbers :"+mod2);

  System.out.println("Modulus of two numbers :"+mod3);
  
  System.out.println("Modulus of two numbers :"+mod4);
}

}