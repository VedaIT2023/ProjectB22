public  class ReportCard {
	public static void main(String[] args){
		String name = "Sunil";
		String email = "sunildadepogu@gmail.com";
		String qualification = "B-Tech";
		char gender  = 'M';
		boolean isQualified =  true;
		int lang1, lang2, lang3, sub1, sub2, sub3;
		lang1 = 35;
		lang2 = 35;
		lang3 = 34;
		sub1 = 35;
		sub2 = 35;
		sub3 = 35;
		int totalMarksAcquired = lang1+lang2+lang3+sub1+sub2+sub3;
		int totalMarks = 600;
		float percentage = ((float)(totalMarksAcquired)/(float)totalMarks)*((float)100);

		System.out.println("Name : " +name);
		System.out.println("Email ID :" +email);
		System.out.println("Qualification :" +qualification);
		System.out.println("Gender :" +gender);
		System.out.println("Total Marks :" +totalMarksAcquired);
		System.out.println("Percentage Acquired :" +percentage);
		System.out.println("Is  Qualified  :" +isQualified);
		System.out.println("Report:");
		System.out.println("  ");
		if(lang1>=35 && lang2>=35 && lang3>=35 && sub1>=35 && sub2>=35 && sub3>=35){
			if(percentage<35){
			System.out.println("Failed in the current Academics");
			}else if(percentage>=35 && percentage<=39){
			System.out.println("Considerable Scenario Please reach out  to Principal");
			}else if(percentage>=40 && percentage<=50){
			System.out.println("Acquired Grade C in the current Academics and Promoted to Next year.");
			}else if(percentage>=51 && percentage<=71){
			System.out.println("Acquired Grade B in the current Academics and Promoted to Next year.");
			}else if(percentage>=72 && percentage<=91){
			System.out.println("Acquired Grade A in the current Academics and Promoted to Next year.");
			}else if(percentage>92){
			System.out.println("Exceptional");
			}
		}
		else{
		System.out.println("Failed in the current Academics");
		}
	}
}