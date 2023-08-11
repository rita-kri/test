package com.example.demo.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserDto {
	
	private int id;
	
	@NotBlank
	@Size(min = 4, message = "Username must be min of 4 charcater !!")
	private String name;
	
	@Email(message = "Email address is not valid")
	private String email;
	
	@NotBlank
	@Size(min =3, max=10, message = "Password must be of 3 chars and max of 10 chars")
	private String password;
	
	@NotBlank
	private String about;
	
	

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

}
