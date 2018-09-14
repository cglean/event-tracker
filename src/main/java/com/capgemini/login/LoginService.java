package com.capgemini.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("rahul") && password.equals("springone"))
			return true;

		return false;
	}

}
