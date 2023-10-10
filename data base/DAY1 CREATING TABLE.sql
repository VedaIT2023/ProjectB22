CREATE TABLE DOCTORDETAILS(
DR_ID  INT PRIMARY KEY AUTO_INCREMENT,
DR_NAME VARCHAR(100),
DR_SPECIALIZATION VARCHAR (100),
DR_DEGREE VARCHAR(100) ,
DR_EMAIL VARCHAR(200),
DR_PHONE_NUMBER VARCHAR(20),
DR_EXPERIENCE VARCHAR(100),
DR_CONSULTATION VARCHAR(50)
);

INSERT INTO DOCTORDETAILS(DR_ID ,DR_NAME ,DR_SPECIALIZATION ,DR_DEGREE ,DR_EMAIL ,DR_PHONE_NUMBER ,DR_EXPERIENCE ,DR_CONSULTATION )
VALUES(1126,"Dr.Anshul Warman","Dermatologist","MBBS,MD(Drema)","anshulwarman@gmail.com","7845961320","20 Years","Rs 800"),
(1127,"Dr.Balaganpathy R","Dermatologist","MBBS ,MD","balaganpathyr@gmail.com","9658741236","8 Years","Rs 450")	,
(1128,"Dr.D M Mahajan","Dermatologist","MBBS,MD(Dermatology)","dmmahajan@gmail.com","9856325873","35 Years","Rs 2000"),
(1129,"Dr.Pooja Solaniki Vysa","Dermatologist","MBBS,MD","poojasolanikivysa@gmail.com","9856321456","7 Years","Rs 700"),
(1130,"Dr.Jyothi Tiwari","Dermatologist","MBBS,BDS","jyothitiwari123@gmail.com","9874563210","5 Years","Rs 500"),
(1131,"Dr.Chanchal Chaudhary","Dermatologist","MBBS ,DDVL","chanchalchaudhary@gmail.com","8745896521","11 Years","Rs 700"),
(1132,"Dr.Akanshya Baruah","Dermatologist","MBBS,MD","akankshyabaruah@gmail.com","8214596378","3 Years","Rs 650"),
(1133,"Dr.Durai babu mukkara","Dermatologist","MBBS ,MD,DSTD","duraibabumukkara@gmail.com","6521478965","20 Years","Rs 1000"),
(1134,"Dr.Juvita Rasuinha","Dermatologist","MBBS MD","juvitarasquinha@gmail.com","6302010456","18 Years","Rs 500"),
(1135,"Dr.Parthasarathi Duttha Roy","Dermatologist","MBBS,DDVL,MD","parthasarathiduttharoy@gmail.com","6523417890","20 Years","Rs 1000");
					

SELECT * FROM DOCTORDETAILS;

DROP TABLE DOCTORDETAILS;