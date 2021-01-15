package com.example.springngblog.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.example.springngblog.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> 

{
	
	Optional<User> findByUserName(String username);

	

}
