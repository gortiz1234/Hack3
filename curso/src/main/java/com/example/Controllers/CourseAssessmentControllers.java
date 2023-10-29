import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course_assessment_details")
public class CourseAssessmentDetailsController {
    private final CourseAssessmentDetailsService courseAssessmentDetailsService;

    @Autowired
    public CourseAssessmentDetailsController(CourseAssessmentDetailsService courseAssessmentDetailsService) {
        this.courseAssessmentDetailsService = courseAssessmentDetailsService;
    }

    @GetMapping
    public ResponseEntity<List<CourseAssessmentDetails>> getAllCourseAssessmentDetails() {
        List<CourseAssessmentDetails> details = courseAssessmentDetailsService.getAllCourseAssessmentDetails();
        return new ResponseEntity<>(details, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseAssessmentDetails> getCourseAssessmentDetailsById(@PathVariable Long id) {
        CourseAssessmentDetails details = courseAssessmentDetailsService.getCourseAssessmentDetailsById(id);
        if (details != null) {
            return new ResponseEntity<>(details, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<String> createCourseAssessmentDetails(@RequestBody CourseAssessmentDetails details) {
        courseAssessmentDetailsService.createCourseAssessmentDetails(details);
        return new ResponseEntity<>("New item created", HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCourseAssessmentDetails(@PathVariable Long id, @RequestBody CourseAssessmentDetails details) {
        if (courseAssessmentDetailsService.updateCourseAssessmentDetails(id, details)) {
            return new ResponseEntity<>("Item updated", HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCourseAssessmentDetails(@PathVariable Long id) {
        if (courseAssessmentDetailsService.deleteCourseAssessmentDetails(id)) {
            return new ResponseEntity<>("Item deleted", HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
