package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.model.FavoriteThings;

@Controller
@SessionAttributes("favoriteThings")
public class FavoritesController {
	
	@RequestMapping(path="/", method=RequestMethod.GET) 
	public String showLandingPage() {
		return "landingPage";
	}
	
	@RequestMapping(path="/favesPage1", method=RequestMethod.GET)
	public String showFavesPage1() {
		return "favesPage1";
	}
	
	@RequestMapping(path="/favesPage1",  method=RequestMethod.POST)
	public String getFavoriteColor(@RequestParam String faveColor, ModelMap map) {
		FavoriteThings things = new FavoriteThings();
		things.setColor(faveColor);
		map.put("favoriteThings", things);
		return "redirect:/favesPage2";
	}
	
	@RequestMapping(path="/favesPage2", method=RequestMethod.GET)
	public String showFavesPage2() {
		return "favesPage2";
	}
	
	@RequestMapping(path="/favesPage2", method=RequestMethod.POST)
	public String getFavoriteFood(@RequestParam String faveFood, ModelMap map) {
		FavoriteThings things = (FavoriteThings)map.get("favoriteThings");
		things.setFood(faveFood);
		return "redirect:/favesPage3";
	}
	
	@RequestMapping(path="/favesPage3", method=RequestMethod.GET)
	public String showFavesPage3() {
		return "favesPage3";
	}
	
	@RequestMapping(path="/favesPage3", method=RequestMethod.POST)
	public String getFavoriteSeason(@RequestParam String faveSeason, ModelMap map) {
		FavoriteThings things = (FavoriteThings)map.get("favoriteThings");
		things.setSeason(faveSeason);
		return "redirect:/summary";
	}
	
	@RequestMapping(path="/summary", method=RequestMethod.GET)
	public String showSummary() {
		return "summary";
	}
	
	
}
