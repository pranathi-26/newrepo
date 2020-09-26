package com.dxc.restful.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.restful.entity.Movie;
import com.dxc.restful.service.IMovieService;

/*import io.swagger.annotations.Api;*/
import io.swagger.annotations.ApiOperation;

/*@ApiOperation(value="/movie",tags="Movie Controller with Rest")*/
@Controller
@RestController
@RequestMapping(path="/movie")
public class MovieSysController{
	
	@Autowired
	IMovieService service;
	
	@Autowired
	Movie movie;

	
	@ApiOperation(value="Add Movie Details",produces="json data" , response=Movie.class)
	@PostMapping(path="/add")
	public  Movie add(@RequestBody Movie movie) {
		
		return service.addMovie(movie);
		
	}
	
	@ApiOperation(value="All Movies Details",produces="json data",response = Movie.class)
	@GetMapping(path="/allmoviesdetails")
	public List<Movie>  getAllMovies(){
		return service.getAllMovies();
		
	}
	@ApiOperation(value="Delete Movie")
	@DeleteMapping(path="/delete/{movieId}")
	public String deleteMovie(@PathVariable("movieId") int movieID) {
		service.deleteMovie(movieID);
		return "Movie deleted with movie ID"+movieID;
	}
	
}
