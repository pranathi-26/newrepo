package com.dxc.restful.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dxc.restful.entity.Movie;
@Repository
public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	
	
	

}
