public class DataTypesTask{
	public static void main(String[] args){
		String name = "Sindhu";
		String qualification = "B-Tech";
		int lang1 = 74;
		int lang2 = 66;
		int lang3 = 82;
		int sub1 = 46;
		int sub2 = 38;
		int sub3 = 77;
		char gender = 'F';
		String emailId = "sindhu@gmail.com";
		int totalMarks = lang1+lang2+lang3+sub1+sub2+sub3;
		float percentage = (float)totalMarks/(float)6;
		boolean isqualified = true;
	System.out.println("Name : "+name);
	System.out.println("Qualification : "+qualification);
	System.out.println("Gender : "+gender);
	System.out.println("E-Mail : "+emailId);
	System.out.println("Total Marks : "+totalMarks);
	System.out.println("Percentage Acquired : "+percentage);
	System.out.println("Is Qualified : "+isqualified);
	}
}
	
