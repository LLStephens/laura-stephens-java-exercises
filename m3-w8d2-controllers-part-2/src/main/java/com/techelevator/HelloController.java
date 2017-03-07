package com.techelevator;


import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;


@Controller 
public class HelloController {
	@Autowired
	private ReviewDao reviewDao;

	@RequestMapping("/greeting")
	public String displayGreeting() {
		return "greeting";
	}
	
	@RequestMapping(path="/reviewInput", method=RequestMethod.GET)
	public String showReviewInputPage() {
		return "reviewInput";
	}
	
	@RequestMapping(path="/reviewInput", method=RequestMethod.POST)
	public String processReviewSubmission(Review review){
		reviewDao.save(review);
		return "redirect:/reviewDisplay";
		}
	
	@RequestMapping(path="/reviewDisplay", method=RequestMethod.GET)
	public String showReviewDisplay(HttpServletRequest request) {
		List<Review> reviews = reviewDao.getAllReviews();
			request.setAttribute("reviews", reviews);
		return "reviewDisplay";
	}
	
}
