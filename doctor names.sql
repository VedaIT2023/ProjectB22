create schema doctor;
use doctor;
CREATE TABLE doc_details(
doc_Id INT,
gender VARCHAR (5),
name VARCHAR(200),
specilization VARCHAR(200),
email VARCHAR(500),
phone_number VARCHAR(10),
workplace VARCHAR(300),
experience VARCHAR(10),
Qualification VARCHAR(50),
consultation_fee VARCHAR(10) 
);

INSERT INTO doc_details
 
 VALUES 
 (1433 ,"M", "SriRam", "pediatrician", "Sriram@gmail.com","9121923206","St.Thereses","30","MBBS PDC","300"),
 (1435,"F", "Mausami", "pediatrician" ,"Mausmai@gmail.com","7993970074","Apollo Hospitals","20","MBBS PDC","700"),
 (1437,"F", "khazakat ", "pediatrician" ,"khazakat@gmail.com","7993970065","care Hospitals","23","MBBS MD PDC","500"),
 (1439,"M", "Manohar", "pediatrician" ,"Manohar@gmail.com","9993970047","Zab Hospitals","25", "MBBS PDC","800"),
 (1441,"M", "Manidhar", "pediatrician" ,"Mani@gmail.com","6993970079","Sundown Hospitals","21","MBBS PDC","1000"),
 (1443,"M", "Mallik", "pediatrician" ,"Mallik@gmail.com","8993970060","Sunrise Hospitals","40","MBBS PDC","2000");
 











































































































































create table doc_details doc_Id int
