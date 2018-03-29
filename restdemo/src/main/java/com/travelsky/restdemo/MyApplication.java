package com.travelsky.restdemo;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@ApplicationPath("/root-path")
public class MyApplication extends Application{
    Set<Object> objectSet = new HashSet<Object>();  
    Set<Class<?>> classSet = new HashSet<Class<?>>();  
      
    public MyApplication()  
    {  
        objectSet.add(new Library());
    }  
    @Override  
    public Set<Class<?>> getClasses() {  
        return classSet;  
    }
    
  
    @Override  
    public Set<Object> getSingletons() {  
        return objectSet;  
    }  
}
