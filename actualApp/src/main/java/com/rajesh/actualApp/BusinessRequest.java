package com.rajesh.actualApp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BusinessRequest {

	String firstName;
	String lastName;
	String email;
	String phone;

}
