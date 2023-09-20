public class Sss {
	public static void main(String[] args){
		String  name = "Divakar";
		String qualification = "BioTechnology";
		String email = "divakar@gmail.com";
		char gender = 'M';
		int lang1, lang2, lang3, sub1,  sub2, sub3;
		lang1 = 40;
		lang2 = 40;
		lang3 = 40;
		sub1 = 40;
		sub2 = 40;
		sub3 = 40;
		int totalMarksAcquired = lang1+lang2+lang3+sub1+sub2+sub3;
		int totalMarks = 600;
		float percentage = ((float)(totalMarksAcquired)/((float) (totalMarks))*(float)(100));
		boolean isQualified;

		System.out.println("Name : "+ name);
		System.out.println("Email  ID : "+ email);
		System.out.println("Qualification : "+ qualification);
		System.out.println("Gender : "+ gender);
		System.out.println("Total Marks : "+ totalMarks);
		System.out.println("Percentage Aqcuired : "+ percentage);
		System.out.println(" ");
		System.out.println("Report : ");
		if(lang1>=35 && lang2>=35 && lang3>=35 && sub1>=35 && sub2>=35 && sub3>=35){
			if (percentage<40){
				isQualified = false;
				System.out.println("Is Qualified :"+isQualified);
			}
			if (percentage>=40){
				isQualified = true;
				System.out.println("Is Qualified :"+isQualified);
			}
			if(percentage<35){
			System.out.println("Failed in the current academics");
			}else if (percentage>=35 && percentage<=39){
			System.out.println("Considerable scenario Please reach out to principal");
			}else if (percentage>=40 && percentage<=50){
			System.out.println("Acquired Grade C in the current Academics and promoted to next year.");
			}else if (percentage>=51 && percentage<=71){
			System.out.println("Acquired Grade B in the current Academics and promoted to next year.");
			}else if (percentage>=72 && percentage<=91){
			System.out.println("Acquired Grade A in the current Academics and promoted to next year.");
			}else if (percentage>92){
			System.out.println("Exceptional");
			}
			
		}
		else {
		System.out.println("Failed in the current academics");
		}
		System.out.println(" ");
		
		String name1 = "Sandya";
		String qualificarion1 = "BSc";
		String email1 = "sandya@gmail.com";
		char gender1 = 'F';
		boolean isQualified1 ;
		int langA1=99, langA2=99, langA3=99, subA1=99, subA2=99, subA3=99;
		int totalMarksAcquired1 = langA1+langA2+langA3+subA1+subA2+subA3;
		int totalMarks1 = 600;
		float  percentage1 = ((float)(totalMarksAcquired1)/(float)(totalMarks1))*((float)(100));
		boolean isQualified1;
		
		System.out.println("Name :" +name);
		System.out.println("Email ID :"+email);
		System.out.println("Qualification :" +qualification);
		System.out.println("Gender : "+gender);
		System.out.println("Total Marks :" +totalMarksAcquired1);
		System.out.println("Percentage :" +percentage1);
		System.out.println("  ");
		System.out.println("Report :");
		if(langA1>=35 && langA2>=35 && langA3>=35 && subA1>=35 && subA2>=35 && subA3>=35){
			if(percentage1>40){
				isQualified1 = true;
				System.out.println("Is Qualified :"+isQualified1);
			}
			if(percentage1<40){
				isQualified1 = false;
				System.out.println("Is Qualified :"+isQualified1);
			}
			if(percentage<35){
			System.out.println("Failed in the current academics");
			}else if (percentage1>=35 && percentage1<=39){
			System.out.println("Considerable scenario Please reach out to principal");
			}else if (percentage1>=40 && percentage1<=50){
			System.out.println("Acquired Grade C in the current Academics and promoted to next year.");
			}else if (percentage1>=51 && percentage1<=71){
			System.out.println("Acquired Grade B in the current Academics and promoted to next year.");
			}else if (percentage1>=72 && percentage1<=91){
			System.out.println("Acquired Grade A in the current Academics and promoted to next year.");
			}else if (percentage1>92){
			System.out.println("Exceptional");
			}
	}
}
