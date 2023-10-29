package com.example.curso.entidades;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "courseassessmentdetails")
public class CourseAssessmentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int score;
    private String section;

    @ManyToOne
    @JoinColumn(name = "student")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "professor")
    private Professor professor;

    @ManyToOne
    @JoinColumn(name = "courseassessment")
    private CourseAssessment courseAssessment;

    private int sectionGroup;

    // Getter y setter para id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter y setter para score
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Getter y setter para section
    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    // Getter y setter para student
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    // Getter y setter para professor
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    // Getter y setter para courseAssessment
    public CourseAssessment getCourseAssessment() {
        return courseAssessment;
    }

    public void setCourseAssessment(CourseAssessment courseAssessment) {
        this.courseAssessment = courseAssessment;
    }

    // Getter y setter para sectionGroup
    public int getSectionGroup() {
        return sectionGroup;
    }

    public void setSectionGroup(int sectionGroup) {
        this.sectionGroup = sectionGroup;
    }
}
