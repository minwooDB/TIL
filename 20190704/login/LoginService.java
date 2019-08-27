package service;

import org.springframework.stereotype.Service;
@Service
public class LoginService {
	public boolean login(String id, String passwd) {
		boolean result;
		if (id.equals("spring") && passwd.equals("@1234")) {
		result = true;				
		}
		else 
		result = false;	
		return result;
	}
}
