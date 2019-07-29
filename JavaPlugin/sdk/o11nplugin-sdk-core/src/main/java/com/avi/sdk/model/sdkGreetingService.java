package com.avi.sdk.model;

import org.springframework.stereotype.Component;

import com.vmware.o11n.plugin.sdk.annotation.*;

@Component
public class sdkGreetingService  {
    
    public sdkGreetingService() {
        
    }
   
   public String greet(String name) {
       return "Hello, " + name +"! Welcome to 'avisdk' plug-in";
   }
}

