public class ProgressReport{
public static void main(String[] args){

  String name,qualification,email;
  int language1,language2,language3,sub1,sub2,sub3,totalmarks=600,totalobtained;
  boolean isqualified;
  char gender;
  float percentageacquired;


  name="Divakar";
  gender='M';
  email="divakar@gmail.com";
  qualification="Biotechnology";
  language1=40;
  language2=40;
  language3=40;
  sub1=40;
  sub2=40;
  sub3=40;
  
  totalobtained=language1+language2+language3+sub1+sub2+sub3;
  percentageacquired=(float)(totalobtained*100)/(float)(totalmarks);
  isqualified=(language1>=35)&&(language2>=35)&&(language3>=35)&&(sub1>=35)&&(sub2>=35)&&(sub3>=35);
  
  System.out.println("name : "+name);
  System.out.println("gender : "+gender);
  System.out.println("email : "+email);
  System.out.println("qualification : "+qualification);
  System.out.println("totalobtained : "+totalobtained);
  System.out.println(" percentageacquired : "+ percentageacquired);
  System.out.println("isqualified : "+isqualified);
  System.out.println("Report of Divakar:");
  if(isqualified){
     if ( percentageacquired>91)
	System.out.println("Exceptional");
     else if ( percentageacquired>=72 &&  percentageacquired<=91)
        System.out.println("Acquired Grade A in current Academics and promoted to next year");
     else if ( percentageacquired>=51 &&  percentageacquired<72)
        System.out.println("Acquired Grade B in current Academics and promoted to next year");
     else if ( percentageacquired>=40 &&  percentageacquired<=50)
        System.out.println("Acquired Grade C in current Academics and promoted to next year");
     else if ( percentageacquired>=35 &&  percentageacquired<40)
	System.out.println("Considerable scenario Please reach out to principal");
    else 
	System.out.println("You are failed in the current academics");
  }
  else
       System.out.println("You are failed in the academics");
  
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

  totalobtained=language1+language2+language3+sub1+sub2+sub3;
  percentageacquired=(float)(totalobtained*100)/(float)(totalmarks);
  isqualified=(language1>=35)&&(language2>=35)&&(language3>=35)&&(sub1>=35)&&(sub2>=35)&&(sub3>=35);

  System.out.println("name : "+name);
  System.out.println("gender : "+gender);
  System.out.println("email : "+email);
  System.out.println("qualification : "+qualification);
  System.out.println("totalobtained : "+totalobtained);
  System.out.println(" percentageacquired : "+ percentageacquired);
  System.out.println("isqualified : "+isqualified);
  System.out.println("Report of Valli:");
  if(isqualified){
     if ( percentageacquired>91)
	System.out.println("Exceptional");
     else if ( percentageacquired>=72 && percentageacquired<=91)
        System.out.println("Acquired Grade A in current Academics and promoted to next year");
     else if ( percentageacquired>=51 &&  percentageacquired<72)
        System.out.println("Acquired Grade B in current Academics and promoted to next year");
     else if ( percentageacquired>=40 &&  percentageacquired<=50)
        System.out.println("Acquired Grade C in current Academics and promoted to next year");
     else if ( percentageacquired>=35 &&  percentageacquired<40)
	System.out.println("Considerable scenario Please reach out to principal");
    else
	System.out.println("You are failed in the current academics");
  }
  else
       System.out.println("You are failed in the academics");
  
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

  totalobtained=language1+language2+language3+sub1+sub2+sub3;
  percentageacquired=(float)(totalobtained*100)/(float)(totalmarks);
  isqualified=(language1>=35)&&(language2>=35)&&(language3>=35)&&(sub1>=35)&&(sub2>=35)&&(sub3>=35);
  

  System.out.println("name : "+name);
  System.out.println("gender : "+gender);
  System.out.println("email : "+email);
  System.out.println("qualification : "+qualification);
  System.out.println("totalobtained : "+totalobtained);
  System.out.println(" percentageacquired : "+ percentageacquired);
  System.out.println("isqualified : "+isqualified);
  System.out.println("Report of Valli:");
  if(isqualified){
     if ( percentageacquired>91)
	System.out.println("Exceptional");
     else if ( percentageacquired>=72 && percentageacquired<=91)
        System.out.println("Acquired Grade A in current Academics and promoted to next year");
     else if ( percentageacquired>=51 && percentageacquired<72)
        System.out.println("Acquired Grade B in current Academics and promoted to next year");
     else if ( percentageacquired>=40 &&  percentageacquired<=50)
        System.out.println("Acquired Grade C in current Academics and promoted to next year");
     else if ( percentageacquired>=35 &&  percentageacquired<40)
	System.out.println("Considerable scenario Please reach out to principal");
    else 
	System.out.println("You are failed in the current academics");
  }
  else
       System.out.println("You are failed in the academics");
  

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

  totalobtained=language1+language2+language3+sub1+sub2+sub3;
  percentageacquired=(float)(totalobtained*100)/(float)(totalmarks);
  isqualified=(language1>=35)&&(language2>=35)&&(language3>=35)&&(sub1>=35)&&(sub2>=35)&&(sub3>=35);

  System.out.println("name : "+name);
  System.out.println("gender : "+gender);
  System.out.println("email : "+email);
  System.out.println("qualification : "+qualification);
  System.out.println("totalobtained : "+totalobtained);
  System.out.println(" percentageacquired : "+ percentageacquired);
  System.out.println("isqualified : "+isqualified);
  System.out.println("Report of Sindhu:");
  if(isqualified){
     if ( percentageacquired>91)
	System.out.println("Exceptional");
     else if ( percentageacquired>=72 &&  percentageacquired<=91)
        System.out.println("Acquired Grade A in current Academics and promoted to next year");
     else if ( percentageacquired>=51 &&  percentageacquired<72)
        System.out.println("Acquired Grade B in current Academics and promoted to next year");
     else if ( percentageacquired>=40 &&  percentageacquired<=50)
        System.out.println("Acquired Grade C in current Academics and promoted to next year");
     else if ( percentageacquired>=35 &&  percentageacquired<40)
	System.out.println("Considerable scenario Please reach out to principal");
    else 
	System.out.println("You are failed in the current academics");
  }
  else
       System.out.println("You are failed in the academics");
  
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
  

  totalobtained=language1+language2+language3+sub1+sub2+sub3;
  percentageacquired=(float)(totalobtained*100)/(float)(totalmarks);
  isqualified=(language1>=35)&&(language2>=35)&&(language3>=35)&&(sub1>=35)&&(sub2>=35)&&(sub3>=35);
  

  System.out.println("name : "+name);
  System.out.println("gender : "+gender);
  System.out.println("email : "+email);
  System.out.println("qualification : "+qualification);
  System.out.println("totalobtained : "+totalobtained);
  System.out.println(" percentageacquired : "+ percentageacquired);
  System.out.println("isqualified : "+isqualified);
  System.out.println("Report of Satya:");
  if(isqualified){
     if ( percentageacquired>91)
	System.out.println("Exceptional");
     else if ( percentageacquired>=72 &&  percentageacquired<=91)
        System.out.println("Acquired Grade A in current Academics and promoted to next year");
     else if ( percentageacquired>=51 &&  percentageacquired<72)
        System.out.println("Acquired Grade B in current Academics and promoted to next year");
     else if ( percentageacquired>=40 && percentageacquired<=50)
        System.out.println("Acquired Grade C in current Academics and promoted to next year");
     else if ( percentageacquired>=35 &&  percentageacquired<40)
	System.out.println("Considerable scenario Please reach out to principal");
    else 
	System.out.println("You are failed in the current academics");
  }
  else
       System.out.println("You are failed in the academics");
}
}
  


