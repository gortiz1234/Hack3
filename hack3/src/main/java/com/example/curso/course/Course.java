package com.example.curso.course;

import com.example.curso.courseType.CourseType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {
    @Id
    private Long id;
    private String name;
    private Integer credits;
    private  String courseContent;
    private String area;
    private String code;
    private Integer cycle;
    @ManyToOne
    CourseType courseType;
    private String VRGroup;

    public Course(){}
    public Course(Long id, String name, Integer credits, String courseContent, String area, String code, Integer cycle, CourseType courseType, String VRGroup) {
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.courseContent = courseContent;
        this.area = area;
        this.code = code;
        this.cycle = cycle;
        this.courseType = courseType;
        this.VRGroup = VRGroup;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Integer getCredits() {
        return credits;
    }
    public String getCourseContent() {
        return courseContent;
    }
    public String getArea() {
        return area;
    }
    public String getCode() {
        return code;
    }

    public Integer getCycle() {
        return cycle;
    }
    public CourseType getCourseType() {
        return courseType;
    }
    public String getVRGroup() {
        return VRGroup;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCredits(Integer credits) {
        this.credits = credits;
    }
    public void setCourseContent(String courseContent) {
        this.courseContent = courseContent;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }
    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }
    public void setVRGroup(String VRGroup) {
        this.VRGroup = VRGroup;
    }

}
