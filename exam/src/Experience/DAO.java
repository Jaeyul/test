package Experience;

import java.util.ArrayList;

public class DAO {
	
	ArrayList<User> userList = new ArrayList<User>();
	
	public boolean insertUser(User user) {		
		return userList.add(user);		
	}
	
	
	
	
	
	

}
