package np.com.dhirajsah.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String,String> payload) {
        return new ResponseEntity<Review>(reviewService.createReview(payload.get("reviewbody"), payload.get("imdbId")), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Review>> getAllReviews() {
        System.out.println("hhh--------------");
        return new ResponseEntity<List<Review>>(reviewService.findAllReview(),HttpStatus.OK);
    }
}
