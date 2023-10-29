package com.example.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repositorys.CourseAssessmentDetailsRepository;
import com.example.curso.entidades.CourseAssessmentDetails;

import java.util.List;
import java.util.Optional;

@Service
public class CourseAssessmentDetailsService {
    private final CourseAssessmentDetailsRepository courseAssessmentDetailsRepository;

    @Autowired
    public CourseAssessmentDetailsService(CourseAssessmentDetailsRepository courseAssessmentDetailsRepository) {
        this.courseAssessmentDetailsRepository = courseAssessmentDetailsRepository;
    }

    public List<CourseAssessmentDetails> getAllCourseAssessmentDetails() {
        return (List<CourseAssessmentDetails>) courseAssessmentDetailsRepository.findAll();
    }

    public CourseAssessmentDetails getCourseAssessmentDetailsById(Long id) {
        Optional<CourseAssessmentDetails> optionalDetails = courseAssessmentDetailsRepository.findById(id);
        return optionalDetails.orElse(null);
    }

    public void createCourseAssessmentDetails(CourseAssessmentDetails details) {
        courseAssessmentDetailsRepository.save(details);
    }

    public boolean updateCourseAssessmentDetails(Long id, CourseAssessmentDetails details) {
        if (courseAssessmentDetailsRepository.existsById(id)) {
            details.setId(id);
            courseAssessmentDetailsRepository.save(details);
            return true;
        }
        return false;
    }

    public boolean deleteCourseAssessmentDetails(Long id) {
        if (courseAssessmentDetailsRepository.existsById(id)) {
            courseAssessmentDetailsRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
