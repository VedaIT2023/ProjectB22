package ConceptsOfJava;

public class ApplicationMain {
	
	public static void main(String[] args) {
        System.out.println("Welcome To the VEDHA-IT ");
        Employees ramya = new Employees("Ramya", "ramya123@gmail.com", "Receptionist", 3457, 703453579, 15000, 'F');
        Employees sashi = new Employees("Sashi", "sashi123@gmail.com", "Computer Operator", 2314, 87627328, 20000, 'M');
        Employees chitti = new Employees("Chitti", "chitti2006@gmail.com", "System Analysist", 1243, 796263277, 25000, 'F');
        Employees saggu = new Employees("Saggu", "saggu2001@gmail.com", "Security Analsist", 2021, 703615692, 30000, 'M');
        Employees yash = new Employees("Yash", "yash2001@gmail.com", "Maintanence Operator", 2324, 627482647, 25000, 'M');
       
        Teachers anil = new Teachers("Anil", "Anil23@gmail.com", "Teaching", 30000, "Mtech", 792472874, 'M');
        Teachers dinesh = new Teachers("Dinesh", "dinesh2323@gmail.com", "Teaching", 30000, "Btech", 782372874, 'M');
        Teachers samba = new Teachers("Samba", "samba1523@gmail.com", "BDM", 25000, "Btech", 892322874, 'M'); 
        Teachers swetha = new Teachers("Swetha", "swetha2323@gmail.com", "Tutor", 15000, "Btech", 782372874, 'F');
        Teachers kavya = new Teachers("Kavya", "kavya23@gmail.com", "Tutor", 12000, "Btech", 988839274, 'F');
        
        Students satish = new Students("Satish", "satishpendhem052@gmail.com", "Btech" , " JavaFullStack", 1211, 703615692, 'M');
        Students balaji = new Students("Balaji", "balajinakka2001@gmail.com", "Btech" , " JavaFullStack", 1208, 787627113, 'M');
        Students sathwik = new Students("Sathwik", "Sathwik2001@gmail.com", "Btech" , " JavaFullStack", 1209, 993297323, 'M');
        Students pavan = new Students("Pavan", "pavancherry143@gmail.com", "Btech" , " JavaFullStack", 1214, 748934832, 'M');
        Students lucky = new Students("Lakshman", "lucky2001@gmail.com", "Btech" , " JavaFullStack", 1210, 893756292, 'M');
        
        Employees emp[] = {ramya,sashi,chitti,saggu,yash};
        Teachers ts[] = {anil,dinesh, samba, swetha, kavya};
        Students st[] = {satish,balaji,sathwik,pavan,lucky};
       
        Organisation institute = new Organisation("VEDHAIT", "Vedha2022@gmail.com", "JAVA FULL STACK", 790832848, 2022, 200, 25000, emp, ts, st);
        System.out.println("No of Employees in Organisation : " + institute.emp.length);
        System.out.println("No of Teachers in Organisation : " + institute.ts.length);
        System.out.println("No of Students in Organisation : " + institute.st.length);
        
        // Print the employee details
        System.out.println("");
        System.out.println("Organisation Details:\n" + institute.OrganisationDetails());
        
        
        System.out.println("");
        System.out.println("Employee Details:\n" + ramya.EmployeeDetails());
        System.out.println("Employee Details:\n" + sashi.EmployeeDetails());
        System.out.println("Employee Details:\n" + chitti.EmployeeDetails());
        System.out.println("Employee Details:\n" + saggu.EmployeeDetails());
        System.out.println("Employee Details:\n" + yash.EmployeeDetails());
        ramya.decisionMaking();
        ramya.problemSolving();
        
        
        System.out.println("");
        System.out.println("Lecture Details:\n" + anil.LecturerDetails());
        System.out.println("Lecture Details:\n" + dinesh.LecturerDetails());
        System.out.println("Lecture Details:\n" + samba.LecturerDetails());
        System.out.println("Lecture Details:\n" + swetha.LecturerDetails());
        System.out.println("Lecture Details:\n" + kavya.LecturerDetails());
        anil.doubtClarification();
        anil.assesment();
        
        System.out.println("");
        System.out.println("Student Details:\n" + satish.StudentDetails());
        System.out.println("Student Details:\n" + balaji.StudentDetails());
        System.out.println("Student Details:\n" + sathwik.StudentDetails());
        System.out.println("Student Details:\n" + pavan.StudentDetails());
        System.out.println("Student Details:\n" + lucky.StudentDetails());
        satish.progress();
        satish.tasks();
    }
}
