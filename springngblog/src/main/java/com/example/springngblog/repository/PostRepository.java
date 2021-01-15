package com.example.springngblog.repository;
import com.example.springngblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> 

{
	
	
	

}
