package com.vedait.institute;
import java.util.ArrayList;
public class ApplicationMain {

	public static void main(String[] args) {
		
		String[] studentNames= {"Chandini","veni"};
		int[] studentId= {001,002};
		String[] email= {"chandini@gmail.com","veni@gmail.com"};
		String[] course= {"Java Full Stack","Java Full Stack"};
		String[] instructor={"dinesh","anil"};
		String[] batchTimings= {"7:00 AM to 9:00 AM","11:00 AM to 1:00 PM"};
				
		//Students chandini=new Students("chandini",001,"chandini@gmail.com","Java Full Stack","Dinesh","7:00 AM to 9:00 AM");
		//Students veni = new Students("Veni",002,"veni@gmail.com","Java Full Stack","Anil","11:00 AM to 1:00 PM");
		
		ArrayList<Students> student = new ArrayList<Students>(); 
		for(int i=0;i<email.length;i++) {
			Students studentdetails = new Students(studentNames[i],studentId[i],email[i],course[i],instructor[i],batchTimings[i]);
			student.add(studentdetails);
		
		}
		
		//Students[] students= {chandini,veni};
		
		//Employee dinesh = new Employee("Dinesh", 101,"dinesh@vedait.com","Java Full Stack", 2,"7:00 AM to 9:00 AM , 10:00 AM to 12:00 AM",2);
		//Employee anil = new Employee("anil", 102,"anil@vedait.com" ,"Java Full Stack", 2,"9:00 AM to 11:00 AM , 11:00 AM to 1:00 PM", 2);
		
		String[] employeeNames= {"Dinesh","anil"};
		int[] employeeId= {101,102};
		String[] employeeEmail= {"dinesh@gmail.com","anil@gmail.com"};
		String[] courseTeaching= {"Java Full Stack","Java Full Stack"};
		int[] noOfBatchesAlloted={2,2};
		String[] Timings= {"7:00 AM to 9:00 AM , 10:00 AM to 12:00 AM","9:00 AM to 11:00 AM , 11:00 AM to 1:00 PM"};
		int[] noOfHoursEachClass= {2,2};
		ArrayList<Employee> employee = new ArrayList<Employee>(); 
		for(int i=0;i<employeeEmail.length;i++) {
			Employee employeedetails = new Employee(employeeNames[i],employeeId[i],employeeEmail[i],courseTeaching[i],noOfBatchesAlloted[i],Timings[i],noOfHoursEachClass[i]);
			employee.add(employeedetails);
		
		}
		//Employee[] employees= {dinesh,anil};
		
		//Rooms room1 = new Rooms(101, "Theory class room",4,12,2,true);
		//Rooms room2 = new Rooms(1012, "Lab class room",4,12,2,true);
		int roomNumbers[]= {101,102};
		String[] roomType= {"Theory class room","Lab class room"};
		int[] noOfLights= {12,12};
		int[] noOfFans= {4,4};
		int[] noOfAcs= {2,2};
		boolean[] isProjectorAvailable= {true,false};
		ArrayList<Rooms> room = new ArrayList<Rooms>(); 
		for(int i=0;i<roomNumbers.length;i++) {
			Rooms roomdetails = new Rooms(roomNumbers[i],roomType[i],noOfFans[i],noOfLights[i],noOfAcs[i],isProjectorAvailable[i]);
			room.add(roomdetails);
		
		}
		//Rooms[] rooms= {room1,room2};
		
		Institute vedait = new Institute("VEDA IT",student,employee,room);
		
		
		vedait.printEmployeeDetails();
		vedait.printStudentDetails();
		vedait.printRoomDetails();
		}

}


