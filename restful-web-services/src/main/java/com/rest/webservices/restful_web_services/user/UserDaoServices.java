package com.rest.webservices.restful_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;


@Component
public class UserDaoServices {
	
	
	private static List<User>  users= new ArrayList<>();
	private static int usersCount =0;
	static {
		
		users.add(new User(++usersCount,"Harshad",LocalDate.now().minusYears(30)));
		users.add(new User(++usersCount,"Shankar",LocalDate.now().minusYears(25)));
		users.add(new User(++usersCount,"Sachin",LocalDate.now().minusYears(20)));

	}
	public List<User> FindAll(){
		return users;
	}
	
	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
		
	}
	
	public User findOne(int id) {
		 	Predicate<? super User> predicate = user -> user.getId().equals(id);
			return users.stream().filter(predicate).findFirst().orElse(null);
	}
			
	public void DeleteById(int id) {
			 
		     Predicate<? super User> predicate = user -> user.getId().equals(id);
		   	 users.removeIf(predicate);

	}
}
