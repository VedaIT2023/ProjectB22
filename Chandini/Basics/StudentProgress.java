public class StudentProgress{
public static void main(String[] args){

  String name,qualification,email;
  int language1,language2,language3,sub1,sub2,sub3,totalmarks=600,totalobtained;
  boolean isqualified;
  char gender;
  float percentageacquired;

  name="Divakar";
  qualification="Biotechnology";
  language1=40;
  language2=40;
  language3=40;
  sub1=40;
  sub2=40;
  sub3=40;
  gender='M';
  email="divakar@gmail.com";
  isqualified=true;

  totalobtained=language1+language2+language3+sub1+sub2+sub3;
  percentageacquired=(float)(totalobtained*100)/(float)(600);

  System.out.println("name : "+name);
  System.out.println("email : "+email);
  System.out.println("gender : "+gender);
  System.out.println("qualification : "+qualification);
  System.out.println("totalobtained : "+totalobtained);
  System.out.println(" percentageacquired : "+ percentageacquired);
  System.out.println("isqualified : "+isqualified);
  
   name="Ramakrishna";
  qualification="BSC";
  language1=60;
  language2=70;
  language3=80;
  sub1=10;
  sub2=20;
  sub3=30;
  gender='M';
  email="ramakrishna@gmail.com";
  isqualified=false;

  totalobtained=language1+language2+language3+sub1+sub2+sub3;
  percentageacquired=(float)(totalobtained*100)/(float)(600);

  System.out.println("name : "+name);
  System.out.println("email : "+email);
  System.out.println("gender : "+gender);
  System.out.println("qualification : "+qualification);
  System.out.println("totalobtained : "+totalobtained);
  System.out.println(" percentageacquired : "+ percentageacquired);
  System.out.println("isqualified : "+isqualified);

  name="Valli";
  qualification="BSC";
  language1=40;
  language2=50;
  language3=60;
  sub1=35;
  sub2=34;
  sub3=37;
  gender='M';
  email="valli@gmail.com";
  isqualified=false;

  totalobtained=language1+language2+language3+sub1+sub2+sub3;
  percentageacquired=(float)(totalobtained*100)/(float)(600);

  System.out.println("name : "+name);
  System.out.println("email : "+email);
  System.out.println("gender : "+gender);
  System.out.println("qualification : "+qualification);
  System.out.println("totalobtained : "+totalobtained);
  System.out.println(" percentageacquired : "+ percentageacquired);
  System.out.println("isqualified : "+isqualified); 

  name="Sindhu";
  qualification="BTech";
  language1=50;
  language2=40;
  language3=23;
  sub1=49;
  sub2=24;
  sub3=77;
  gender='F';
  email="sindhu@gmail.com";
  isqualified=false;

  totalobtained=language1+language2+language3+sub1+sub2+sub3;
  percentageacquired=(float)(totalobtained*100)/(float)(600);

  System.out.println("name : "+name);
  System.out.println("email : "+email);
  System.out.println("gender : "+gender);
  System.out.println("qualification : "+qualification);
  System.out.println("totalobtained : "+totalobtained);
  System.out.println(" percentageacquired : "+ percentageacquired);
  System.out.println("isqualified : "+isqualified);

  name="Satya";
  qualification="BTech";
  language1=51;
  language2=23;
  language3=73;
  sub1=59;
  sub2=24;
  sub3=70;
  gender='F';
  email="satya@gmail.com";
  isqualified=false;

  totalobtained=language1+language2+language3+sub1+sub2+sub3;
  percentageacquired=(float)(totalobtained*100)/(float)(600);

  System.out.println("name : "+name);
  System.out.println("email : "+email);
  System.out.println("gender : "+gender);
  System.out.println("qualification : "+qualification);
  System.out.println("totalobtained : "+totalobtained);
  System.out.println(" percentageacquired : "+ percentageacquired);
  System.out.println("isqualified : "+isqualified);

}

}