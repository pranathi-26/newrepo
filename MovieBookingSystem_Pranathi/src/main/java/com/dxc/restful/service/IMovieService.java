package com.dxc.restful.service;
import java.util.List;

import com.dxc.restful.entity.Movie;

public interface IMovieService {

	public Movie addMovie(Movie movie);
	public void  deleteMovie(int movieID);
	public List<Movie> getAllMovies(); 
}
