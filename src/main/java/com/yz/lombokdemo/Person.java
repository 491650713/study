package com.yz.lombokdemo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Cleanup;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.SneakyThrows;
import lombok.Synchronized;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public  class Person {
	
	private String id;
	
	private String name;
	
	private String identity;
	
	
	
	public void testCleanUp() {
	    try {
	        @Cleanup ByteArrayOutputStream baos = new ByteArrayOutputStream();
	        baos.write(new byte[] {'Y','e','s'});
	        System.out.println(baos.toString());
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	
	private DateFormat format = new SimpleDateFormat("MM-dd-YYYY");

	@Synchronized
	public String synchronizedFormat(@NonNull Date date) {
	  
		 return format.format(date);
	}
	
	@SneakyThrows
	public void testSneakyThrows() {
	    throw new IllegalAccessException();
	}
}
