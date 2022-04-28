package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Request {
	//"data": [“A”,”1”,”334”,”4”,”R”]
	
	private String[]  alphabets;
}
