package com.example.jsonignore.demo.controller;

import com.example.jsonignore.demo.common.DisablingMyJsonIgnoreIntrospector;
import com.example.jsonignore.demo.model.User;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/")
public class HomeController{

    //https://stackoverflow.com/questions/38208692/serialize-jsonignore-d-field

    @Autowired
    User user;

    @RequestMapping(value = "/custom", method = RequestMethod.POST,produces = "application/json")
    public List<User> test() {
        String jsonString = "";
        List<User> userList = new ArrayList();
        ObjectMapper mapper = new ObjectMapper();;
        StringWriter buffer = new StringWriter();
        user.setLastName("last name");
        user.setFirstName("first name");
        userList.add(user);

        User user1 = new User();
        user1.setFirstName("2 - first name");
        user1.setLastName("2 - last name");

        userList.add(user1);
        List<User> data = new ArrayList();

        try{
           //new line 1

            mapper.setAnnotationIntrospector(new DisablingMyJsonIgnoreIntrospector());

            mapper.writerWithDefaultPrettyPrinter().writeValue(buffer, userList);

            //jsonString = buffer.toString();
            //data = mapper.readValue(jsonString, new TypeReference<List<User>>(){});

            //return mapper.writeValueAsString(cardService.getCommonInfo(id));
            //return mapper.convertValue(data,User.class);

        }catch(Exception ex) {

        }

        return userList;

    }
}
