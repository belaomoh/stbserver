package fr.univ.stbserver.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.core.io.DefaultResourceLoader;

public class TestSTB {
	
	public String loadFileXML() throws IOException{
		StringBuilder message = new StringBuilder();
		org.springframework.core.io.Resource resource;
		
		resource = new DefaultResourceLoader().getResource("classpath:xml/smallSTB.xml");
		InputStream is = resource.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		while(br.readLine() != null) {
			message.append(br.readLine());
			}
		return message.toString();
		
	}}