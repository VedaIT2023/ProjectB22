package encapsulation;
import java.util.*;

public class Hash1 {

    String studentName;
    int studentId;
    String eMail;
    String courseName;
    String batchTimings;
    String Instructor;

    Hash1(String sName, int sId, String eMail, String cName, String Instructor, String batchTimings) {
        this.studentName = sName;
        this.studentId = sId;
        this.eMail = eMail;
        this.courseName = cName;
        this.Instructor = Instructor;
        this.batchTimings = batchTimings;
    }

    public static void main(String args[]) {
        HashMap<Integer, Object> map = new HashMap<Integer, Object>();
        Hash1 narendra = new Hash1("Narendra", 1, "chandini@gmail.com", "Java Full Stack", "Dinesh", "7:00 AM to 9:00 AM");
        Hash1 chandini = new Hash1("chandini", 2, "chandini@gmail.com", "Java Full Stack", "Dinesh", "7:00 AM to 9:00 AM");
        Hash1 chandu = new Hash1("sunanda", 3, "chandini@gmail.com", "Java Full Stack", "Dinesh", "7:00 AM to 9:00 AM");
        Hash1 sudheer = new Hash1("satya", 4, "chandini@gmail.com", "Java Full Stack", "Dinesh", "7:00 AM to 9:00 AM");
        map.put(1, narendra);
        map.put(2, chandini);
        map.put(3, chandu);
        map.put(4, sudheer);

        for (Map.Entry<Integer, Object> entry : map.entrySet()) {
            int key = entry.getKey();
            Hash1 student = (Hash1) entry.getValue(); 
            System.out.println("Student Details for Key " + key + ":");
            System.out.println("Student Name: " + student.studentName);
            System.out.println("Student ID: " + student.studentId);
            System.out.println("Student EMAIL: " + student.eMail);
            System.out.println("Student Course: " + student.courseName);
            System.out.println("Instructor : " + student.Instructor);
            System.out.println("Batch : " + student.batchTimings);
            System.out.println();
        }
    }
}
