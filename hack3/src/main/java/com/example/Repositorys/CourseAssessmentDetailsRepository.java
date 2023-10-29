package com.example.Repositorys;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.curso.entidades.CourseAssessmentDetails;

@Repository
public interface CourseAssessmentDetailsRepository extends CrudRepository<CourseAssessmentDetails, Long> {
    // Puedes definir métodos de consulta personalizados si es necesario
    List<CourseAssessmentDetails> findAll();
}

