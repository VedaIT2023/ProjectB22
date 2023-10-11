create table doctor_list(
doc_id int unique not null,
name varchar(20) not null,
specialisation varchar(30) not null,
email varchar(50),
phone_number varchar(12) unique,
working varchar(100) ,
experience varchar(10) not null,
degree varchar(90) not null, 
consultation int
);
rename table doctorlist to doctor_list
;
alter table doctor_list
modify column doc_id int unique not null;
insert into doctor_list( doc_id,name,specialisation,email,phone_number,working,experience,degree,consultation)
values
(1087,"Dr.Srikant jawalkar","Neurologist","Srikantha@gmail.com","9876543219","Dr.Srikanth Neuro And Ortho Clinic","57 Years","DM - Neurology | MD - General Medicine | MBBS",700),	
(1088,"Dr.G.Satyanarayana","Neurologist","Satyanarayana@gmail.com","9876543217","Care Hosiptal,Vijaya Health Care","45 Years","MBBS | MD - General Medicine | DM - Neurology",400),																																
(1089,"Dr.Gopal Poduval","Neurologist","Gopalpoduval2gmail.com","9876543216","Care Hosiptal","30 years","MBBS | MD - Medicine | DNB - Neurology",600),
(1090,"Dr.Umesh Thukaram","Neurologist","Umesh@gmail.com","9876543215","Vinn Hosiptal","30 Years","MD - General Medicine | MBBS | DM - Neurology | DNB - Neurology",600),
(1091,"Dr.Ateequr rehman","Neurologist","Ateequrrehman@gmail.com","987678549","Citizens Speciality Hosiptal,Virinchi Hosiptal","28 year","MD-GeneralMedicine|MBBS|DM-Neurology|DNB-Neurology",750),
(1092, "Dr.Aparna Kumar", "Neurologist", "Aparnakumar@gmail.com", "9876584321", "Himagiri Hospital, Citizens Speciality Hospital", "26 Years", "MBBS | MD - Medicine | DNB - Neurology", 650),
(1093,"Dr.V N Mathur","Neurologist","Marthurr@gmail.com","9876543220","Vivekananda Hosiptal","23 Years","MBBS | DM - Neurology | MD - Neuropsychiatry",600),
(1094,"Dr.UmeshPrasadSharma","Neurologist","Umeshprasad@gmail.com","9876543287","Vivekananda Hosiptal","22 Years","MBBS, DM - Neurology, Doctor of Medicine",600),
(1095,"Dr.ChandraSekhar","Neurologist","Chandrasheker@gmail.com","9876543286","Tanvir Hospital,Citi Neuro Centre","20 Years","MBBS, MD - General Medicine, DM -Neurology",600);
select * from doctor_list where consultation=600;
