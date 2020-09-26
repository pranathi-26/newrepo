package com.dxc.restful.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.restful.entity.Movie;
import com.dxc.restful.repository.IMovieRepo;
@Service
public class MovieServiceImp implements IMovieService{

	@Autowired
	IMovieRepo repo;
	
	
	
	
	
	
	@Override
	public Movie addMovie(Movie movie) {
		
		return repo.save(movie);
	}

	@Override
	public void deleteMovie(int movieID) {
		
		
		repo.deleteById(movieID);
		
		
	}

	@Override
	public List<Movie> getAllMovies() {
		
		return repo.findAll();
	}

	
	

}
