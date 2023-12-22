package com.example.entertainment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.websocket.server.PathParam;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/hack/info")
public class RestController {
	
	@Autowired	
	public DocRepo docQueries;
	
	public PatientRepo patientQueries;
	
	@GetMapping(path="/doctors")
	public List<DoctorEntity> getAllDoctorsList() {
		System.out.println("Doctors List Calling");
		return docQueries.findAll();
	}
	
	@GetMapping(path="/sayHello")
	public String sayHelloWorld() {
		return docQueries.myFunc();
	}
	
	@GetMapping(path="/doctor/{id}")
	public Optional<DoctorEntity> getInfoOfaDoctor(@PathVariable Long id) {
		return docQueries.findById(id);
	}
	
	@GetMapping(path="/doctors/{specialisation}")
	public List<DoctorEntity> getSpecialisationDoctors(@PathVariable String specialisation) {
		return docQueries.findBySpecialisation(specialisation);
	}
	
	@GetMapping(path="/doctors/gender:{gender}")
	public List<DoctorEntity> getGenderdoctors(@PathVariable String gender){
		return docQueries.findByGender(gender);
	}
	
	@PostMapping(path="/patientInfo")
	public ResponseEntity<PatientEntity> savePatientData(@RequestBody PatientEntity patient) {
		patientQueries.save(patient);
		return new ResponseEntity<>(patient, HttpStatus.CREATED);
	}
	
	public RestController(DocRepo docQueries,PatientRepo patientQueries) {
		this.docQueries = docQueries;
		this.patientQueries = patientQueries;
	}
		
	
	@GetMapping("/doctor/{gender}/{specialisation}/{experience}")
	public List<DoctorEntity> getDocsGenSpecExp(@PathVariable String gender, @PathVariable String specialisation, @PathVariable Long experience){
		
		return docQueries.findBygenExpSpec(gender,specialisation, experience);
	}
	
	
}
