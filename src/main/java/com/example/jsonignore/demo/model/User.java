package com.example.jsonignore.demo.model;

import com.example.jsonignore.demo.annotation.MyJsonIgnore;
import org.springframework.stereotype.Component;

@Component
public class User{
    private String lastName;

    @MyJsonIgnore
    private String firstName;

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
}
