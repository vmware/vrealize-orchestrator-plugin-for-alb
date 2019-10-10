package com.avi.avi.model;

import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.codec.binary.Base64;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class AviSession {
	
	public String createObject(String controllerIP,String username, String password, String objectType, String data) throws IOException {
				   	   
		String postUrl = controllerIP + "/api/"+ objectType;
		String auth = username + ":" + password;		   
		byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
		String authHeader = "Basic " + new String(encodedAuth);
		   		   
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", authHeader);
		headers.set("X-Avi-Version", "18.2.3");
		   
		headers.setContentType(MediaType.APPLICATION_JSON);
		   
		RestTemplate restTemplate = new RestTemplate();
		   
		HttpEntity<String> request = new HttpEntity<String>(data, headers);
		    
		
		ResponseEntity<String>  response = restTemplate.exchange(postUrl, HttpMethod.POST, request, String.class);
		data = response.getBody();
		return data;		   
	}
		
	public String deleteObject(String controllerIP, String username, String password, String objectType, String data) throws IOException {
			
			
		JSONObject jObject = new JSONObject(data);
		String uuid = (String) jObject.get("uuid");
		String postUrl = controllerIP + "/api/"+objectType+"/"+ uuid;
		
		String auth = username + ":" + password;		   
		byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
		String authHeader = "Basic " + new String(encodedAuth);
		   		   
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", authHeader);
		headers.set("X-Avi-Version", "18.2.3");
		   
		RestTemplate restTemplate = new RestTemplate();
		
		HttpEntity<String> request = new HttpEntity<String>(headers);
		  		     
		ResponseEntity<String>  response = restTemplate.exchange(postUrl, HttpMethod.DELETE, request, String.class);
		String result = response.getStatusCode().toString();
		
		return "Object Deleted!: "+ result;
	}
		
		
	public String getObject(String controllerIP, String username, String password, String objectType, String objectName) throws IOException {
		   	   
		String postUrl;
		if (objectName != null || objectName == "" ) {
			postUrl = controllerIP + "/api/"+ objectType + "?name="+ objectName; 
		}else {
			postUrl = controllerIP + "/api/"+ objectType;
		}
		
	   	String auth = username + ":" + password;		   
	   	byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
	   	String authHeader = "Basic " + new String(encodedAuth);
	   		   
	   	HttpHeaders headers = new HttpHeaders();
	   	headers.set("Authorization", authHeader);
	   	headers.set("X-Avi-Version", "18.2.3");
	   
	   	headers.setContentType(MediaType.APPLICATION_JSON);
	   
	   	RestTemplate restTemplate = new RestTemplate();
	   
	   	HttpEntity<String> request = new HttpEntity<String>(headers);
	    
	   
	   	ResponseEntity<String>  response = restTemplate.exchange(postUrl, HttpMethod.GET, request, String.class);
	   	return response.getBody();		   
		}
	
}
