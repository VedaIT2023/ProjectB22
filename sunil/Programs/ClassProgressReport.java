public class ClassProgressReport {
	public static void main(String[] args){
		String  name = "Divakar";
		String qualification = "Bio Technology";
		String email = "divakar@gmail.com";
		char gender = 'M';
		int lang1, lang2, lang3, sub1,  sub2, sub3;
		lang1 = 40;
		lang2 = 40;
		lang3 = 40;
		sub1 = 40;
		sub2 = 40;
		sub3 = 40;
		int totalMarks = lang1+lang2+lang3+sub1+sub2+sub3;
		float percentage = ((float)totalMarks/((float) 600)*(float)(100));
		boolean isQualified ;

		System.out.println("Name : "+ name);
		System.out.println("Email  ID : "+ email);
		System.out.println("Qualification : "+ qualification);
		System.out.println("Gender : "+ gender);
		System.out.println("Total Marks : "+ totalMarks);
		System.out.println("Percentage Aqcuired : "+ percentage);
		System.out.println("Report : ");
		if(lang1>=35 && lang2>=35 && lang3>=35 && sub1>=35 && sub2>=35 && sub3>=35){
			if(percentage>40){
				isQualified = true;
				System.out.println("Is Qualified :"+isQualified);
			}
			if(percentage<40){
				isQualified = false;
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


		String  name1 = "Rama Krishna";
		String qualification1 = "BSc";
		String email1 = "ramakrishna@gmail.com";
		char gender1 = 'M';
		int langA1, langA2, langA3, subA1,  subA2, subA3;
		langA1 = 35;
		langA2 = 34;
		langA3 = 35;
		subA1 = 35;
		subA2 = 35;
		subA3 = 35;
		int totalMarks1 = langA1+langA2+langA3+subA1+subA2+subA3;
		float percentage1 = ((float)totalMarks1/((float) 600)*(float)(100));
		boolean isQualified1 ;

		System.out.println("Name : "+ name1);
		System.out.println("Email  ID : "+ email1);
		System.out.println("Qualification : "+ qualification1);
		System.out.println("Gender : "+ gender1);
		System.out.println("Total Marks : "+ totalMarks1);
		System.out.println("Percentage Aqcuired : "+ percentage1);
		System.out.println("Report : ");
		if(langA1>=35 && langA2>=35 && langA3>=35 && subA1>=35 && subA2>=35 && subA3>=35){
			if(percentage1>40){
				isQualified1 = true;
				System.out.println("Is Qualified :"+isQualified1);
			}
			if(percentage1<40){
				isQualified1 = false;
				System.out.println("Is Qualified :"+isQualified1);
			}
			if(percentage1<35){
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
		else {
		System.out.println("Failed in the current academics");
		}
		System.out.println(" ");


		String  name2 = "Valli";
		String qualification2 = "BSc";
		String email2 = "valli@gmail.com";
		char gender2 = 'M';
		int langB1, langB2, langB3, subB1,  subB2, subB3;
		langB1 = 40;
		langB2 = 50;
		langB3 = 60;
		subB1 = 35;
		subB2 = 34;
		subB3 = 37;
		int totalMarks2 = langB1+langB2+langB3+subB1+subB2+subB3;
		float percentage2 = ((float)totalMarks2/((float) 600)*(float)(100));
		boolean isQualified2 ;

		System.out.println("Name : "+ name2);
		System.out.println("Email  ID : "+ email2);
		System.out.println("Qualification : "+ qualification2);
		System.out.println("Gender : "+ gender2);
		System.out.println("Total Marks : "+ totalMarks2);
		System.out.println("Percentage Aqcuired : "+ percentage2);
		System.out.println("Report : ");
		if(langB1>=35 && langB2>=35 && langB3>=35 && subB1>=35 && subB2>=35 && subB3>=35){
			if(percentage2>40){
				isQualified2 = true;
				System.out.println("Is Qualified :"+isQualified2);
			}
			if(percentage2<40){
				isQualified2 = false;
				System.out.println("Is Qualified :"+isQualified2);
			}
			if(percentage2<35){
			System.out.println("Failed in the current academics");
			}else if (percentage2>=35 && percentage2<=39){
			System.out.println("Considerable scenario Please reach out to principal");
			}else if (percentage2>=40 && percentage2<=50){
			System.out.println("Acquired Grade C in the current Academics and promoted to next year.");
			}else if (percentage2>=51 && percentage2<=71){
			System.out.println("Acquired Grade B in the current Academics and promoted to next year.");
			}else if (percentage2>=72 && percentage2<=91){
			System.out.println("Acquired Grade A in the current Academics and promoted to next year.");
			}else if (percentage2>92){
			System.out.println("Exceptional");
			}
			
		}
		else {
		System.out.println("Failed in the current academics");
		}
		System.out.println(" ");


		String  name3 = "Sindhu";
		String qualification3 = "B-Tech";
		String email3 = "sindhu@gmail.com";
		char gender3 = 'F';
		int langC1, langC2, langC3, subC1,  subC2, subC3;
		langC1 = 50;
		langC2 = 40;
		langC3 = 23;
		subC1 = 49;
		subC2 = 24;
		subC3 = 77;
		int totalMarks3 = langC1+langC2+langC3+subC1+subC2+subC3;
		float percentage3 = ((float)totalMarks3/((float) 600)*(float)(100));
		boolean isQualified3 ;

		System.out.println("Name : "+ name3);
		System.out.println("Email  ID : "+ email3);
		System.out.println("Qualification : "+ qualification3);
		System.out.println("Gender : "+ gender3);
		System.out.println("Total Marks : "+ totalMarks3);
		System.out.println("Percentage Aqcuired : "+ percentage3);
		System.out.println("Report : ");
		if(langC1>=35 && langC2>=35 && langC3>=35 && subC1>=35 && subC2>=35 && subC3>=35){
			if(percentage3>40){
				isQualified3 = true;
				System.out.println("Is Qualified :"+isQualified3);
			}
			if(percentage3<40){
				isQualified3 = false;
				System.out.println("Is Qualified :"+isQualified3);
			}
			if(percentage3<35){
			System.out.println("Failed in the current academics");
			}else if (percentage3>=35 && percentage3<=39){
			System.out.println("Considerable scenario Please reach out to principal");
			}else if (percentage3>=40 && percentage3<=50){
			System.out.println("Acquired Grade C in the current Academics and promoted to next year.");
			}else if (percentage3>=51 && percentage3<=71){
			System.out.println("Acquired Grade B in the current Academics and promoted to next year.");
			}else if (percentage3>=72 && percentage3<=91){
			System.out.println("Acquired Grade A in the current Academics and promoted to next year.");
			}else if (percentage3>92){
			System.out.println("Exceptional");
			}
			
		}
		else {
		System.out.println("Failed in the current academics");
		}
		System.out.println(" ");


		String  name4 = "Satya";
		String qualification4 = "B-Tech";
		String email4 = "Satya@gmail.com";
		char gender4 = 'F';
		int langD1, langD2, langD3, subD1,  subD2, subD3;
		langD1 = 51;
		langD2 = 60;
		langD3 = 73;
		subD1 = 59;
		subD2 = 71;
		subD3 = 70;
		int totalMarks4 = langD1+langD2+langD3+subD1+subD2+subD3;
		float percentage4 = ((float)totalMarks4/((float) 600)*(float)(100));
		boolean isQualified4 ;

		System.out.println("Name : "+ name4);
		System.out.println("Email  ID : "+ email4);
		System.out.println("Qualification : "+ qualification4);
		System.out.println("Gender : "+ gender4);
		System.out.println("Total Marks : "+ totalMarks4);
		System.out.println("Percentage Aqcuired : "+ percentage4);
		System.out.println("Report : ");
		if(langD1>=35 && langD2>=35 && langD3>=35 && subD1>=35 && subD2>=35 && subD3>=35){
			if(percentage4>40){
				isQualified4 = true;
				System.out.println("Is Qualified :"+isQualified4);
			}
			if(percentage4<40){
				isQualified4 = false;
				System.out.println("Is Qualified :"+isQualified4);
			}
			if(percentage4<35){
			System.out.println("Failed in the current academics");
			}else if (percentage4>=35 && percentage4<=39){
			System.out.println("Considerable scenario Please reach out to principal");
			}else if (percentage4>=40 && percentage4<=50){
			System.out.println("Acquired Grade C in the current Academics and promoted to next year.");
			}else if (percentage4>=51 && percentage4<=71){
			System.out.println("Acquired Grade B in the current Academics and promoted to next year.");
			}else if (percentage4>=72 && percentage4<=91){
			System.out.println("Acquired Grade A in the current Academics and promoted to next year.");
			}else if (percentage4>92){
			System.out.println("Exceptional");
			}
			
		}
		else {
		System.out.println("Failed in the current academics");
		}
		System.out.println(" ");


		String  name5 = "Mani";
		String qualification5 = "B-Tech";
		String email5 = "mani@gmail.com";
		char gender5 = 'M';
		int langE1, langE2, langE3, subE1,  subE2, subE3;
		langE1 = 90;
		langE2 = 80;
		langE3 = 37;
		subE1 = 34;
		subE2 = 95;
		subE3 = 75;
		int totalMarks5 = langE1+langE2+langE3+subE1+subE2+subE3;
		float percentage5 = ((float)totalMarks5/((float) 600)*(float)(100));
		boolean isQualified5 ;

		System.out.println("Name : "+ name5);
		System.out.println("Email  ID : "+ email5);
		System.out.println("Qualification : "+ qualification5);
		System.out.println("Gender : "+ gender5);
		System.out.println("Total Marks : "+ totalMarks5);
		System.out.println("Percentage Aqcuired : "+ percentage5);
		System.out.println("Report : ");
		if(langE1>=35 && langE2>=35 && langE3>=35 && subE1>=35 && subE2>=35 && subE3>=35){
			if(percentage5>40){
				isQualified5 = true;
				System.out.println("Is Qualified :"+isQualified5);
			}
			if(percentage5<40){
				isQualified5 = false;
				System.out.println("Is Qualified :"+isQualified5);
			}
			if(percentage5<35){
			System.out.println("Failed in the current academics");
			}else if (percentage5>=35 && percentage5<=39){
			System.out.println("Considerable scenario Please reach out to principal");
			}else if (percentage5>=40 && percentage5<=50){
			System.out.println("Acquired Grade C in the current Academics and promoted to next year.");
			}else if (percentage5>=51 && percentage5<=71){
			System.out.println("Acquired Grade B in the current Academics and promoted to next year.");
			}else if (percentage5>=72 && percentage5<=91){
			System.out.println("Acquired Grade A in the current Academics and promoted to next year.");
			}else if (percentage5>92){
			System.out.println("Exceptional");
			}
			
		}
		else {
		System.out.println("Failed in the current academics");
		}
		System.out.println(" ");


		String  name6 = "Sandeep";
		String qualification6 = "B-Tech";
		String email6 = "sandeep@gmail.com";
		char gender6 = 'F';
		int langF1, langF2, langF3, subF1,  subF2, subF3;
		langF1 = 34;
		langF2 = 34;
		langF3 = 34;
		subF1 = 34;
		subF2 = 34;
		subF3 = 34;
		int totalMarks6 = langF1+langF2+langF3+subF1+subF2+subF3;
		float percentage6 = ((float)totalMarks6/((float) 600)*(float)(100));
		boolean isQualified6 ;

		System.out.println("Name : "+ name6);
		System.out.println("Email  ID : "+ email6);
		System.out.println("Qualification : "+ qualification6);
		System.out.println("Gender : "+ gender6);
		System.out.println("Total Marks : "+ totalMarks6);
		System.out.println("Percentage Aqcuired : "+ percentage6);
		System.out.println("Report : ");
		if(langF1>=35 && langF2>=35 && langF3>=35 && subF1>=35 && subF2>=35 && subF3>=35){
			if(percentage6>40){
				isQualified6 = true;
				System.out.println("Is Qualified :"+isQualified6);
			}
			if(percentage6<40){
				isQualified6 = false;
				System.out.println("Is Qualified :"+isQualified6);
			}
			if(percentage6<35){
			System.out.println("Failed in the current academics");
			}else if (percentage6>=35 && percentage6<=39){
			System.out.println("Considerable scenario Please reach out to principal");
			}else if (percentage6>=40 && percentage6<=50){
			System.out.println("Acquired Grade C in the current Academics and promoted to next year.");
			}else if (percentage6>=51 && percentage6<=71){
			System.out.println("Acquired Grade B in the current Academics and promoted to next year.");
			}else if (percentage6>=72 && percentage6<=91){
			System.out.println("Acquired Grade A in the current Academics and promoted to next year.");
			}else if (percentage6>92){
			System.out.println("Exceptional");
			}
			
		}
		else {
		System.out.println("Failed in the current academics");
		}
		System.out.println(" ");


		String  name7 = "Chandini";
		String qualification7 = "B-Tech";
		String email7 = "chandini@gmail.com";
		char gender7 = 'F';
		int langG1, langG2, langG3, subG1,  subG2, subG3;
		langG1 = 72;
		langG2 = 64;
		langG3 = 96;
		subG1 = 61;
		subG2 = 56;
		subG3 = 100;
		int totalMarks7 = langG1+langG2+langG3+subG1+subG2+subG3;
		float percentage7 = ((float)totalMarks7/((float) 600)*(float)(100));
		boolean isQualified7 ;

		System.out.println("Name : "+ name7);
		System.out.println("Email  ID : "+ email7);
		System.out.println("Qualification : "+ qualification7);
		System.out.println("Gender : "+ gender7);
		System.out.println("Total Marks : "+ totalMarks7);
		System.out.println("Percentage Aqcuired : "+ percentage7);
		System.out.println("Report : ");
		if(langG1>=35 && langG2>=35 && langG3>=35 && subG1>=35 && subG2>=35 && subG3>=35){
			if(percentage7>40){
				isQualified7 = true;
				System.out.println("Is Qualified :"+isQualified7);
			}
			if(percentage7<40){
				isQualified7 = false;
				System.out.println("Is Qualified :"+isQualified7);
			}
			if(percentage7<35){
			System.out.println("Failed in the current academics");
			}else if (percentage7>=35 && percentage7<=39){
			System.out.println("Considerable scenario Please reach out to principal");
			}else if (percentage7>=40 && percentage7<=50){
			System.out.println("Acquired Grade C in the current Academics and promoted to next year.");
			}else if (percentage7>=51 && percentage7<=71){
			System.out.println("Acquired Grade B in the current Academics and promoted to next year.");
			}else if (percentage7>=72 && percentage7<=91){
			System.out.println("Acquired Grade A in the current Academics and promoted to next year.");
			}else if (percentage7>92){
			System.out.println("Exceptional");
			}
			
		}
		else {
		System.out.println("Failed in the current academics");
		}
		System.out.println(" ");


		String  name8 = "Yaswanth";
		String qualification8 = "B-Tech";
		String email8 = "yaswanth@gmail.com";
		char gender8 = 'M';
		int langH1, langH2, langH3, subH1,  subH2, subH3;
		langH1 = 90;
		langH2 = 92;
		langH3 = 95;
		subH1 = 96;
		subH2 = 91;
		subH3 = 100;
		int totalMarks8 = langH1+langH2+langH3+subH1+subH2+subH3;
		float percentage8 = ((float)totalMarks8/((float) 600)*(float)(100));
		boolean isQualified8 ;

		System.out.println("Name : "+ name8);
		System.out.println("Email  ID : "+ email8);
		System.out.println("Qualification : "+ qualification8);
		System.out.println("Gender : "+ gender8);
		System.out.println("Total Marks : "+ totalMarks8);
		System.out.println("Percentage Aqcuired : "+ percentage8);
		System.out.println("Report : ");
		if(langH1>=35 && langH2>=35 && langH3>=35 && subH1>=35 && subH2>=35 && subH3>=35){
			if(percentage8>40){
				isQualified8 = true;
				System.out.println("Is Qualified :"+isQualified8);
			}
			if(percentage8<40){
				isQualified8 = false;
				System.out.println("Is Qualified :"+isQualified8);
			}
			if(percentage8<35){
			System.out.println("Failed in the current academics");
			}else if (percentage8>=35 && percentage8<=39){
			System.out.println("Considerable scenario Please reach out to principal");
			}else if (percentage8>=40 && percentage8<=50){
			System.out.println("Acquired Grade C in the current Academics and promoted to next year.");
			}else if (percentage8>=51 && percentage8<=71){
			System.out.println("Acquired Grade B in the current Academics and promoted to next year.");
			}else if (percentage8>=72 && percentage8<=91){
			System.out.println("Acquired Grade A in the current Academics and promoted to next year.");
			}else if (percentage8>92){
			System.out.println("Exceptional");
			}
			
		}
		else {
		System.out.println("Failed in the current academics");
		}




	}
}