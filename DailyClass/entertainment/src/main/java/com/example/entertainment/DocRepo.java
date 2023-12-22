package com.example.entertainment;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;


@Repository
public interface DocRepo extends JpaRepository<DoctorEntity, Long>{

	List<DoctorEntity> findAll();
	
	default String myFunc() {
		return "HEllo WOrld";
	}
	
	Optional<DoctorEntity> findById(Long doc_Id);
	
	List<DoctorEntity> findBySpecialisation(String specialisation);
	
	List<DoctorEntity> findByGender(String gender);
		
	@Query("select d from DoctorEntity d where d.gender = :param1 AND d.specialisation = :param2 AND d.experience > :param3")
	List<DoctorEntity> findBygenExpSpec(@Param("param1") String gender, @Param("param2") String specialisation, @Param("param3") Long experience);
		
	
}
