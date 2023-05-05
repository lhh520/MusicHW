package com.example.musichw.controller;
import com.example.musichw.pojo.Userdetails;
import java.util.List;
import com.example.musichw.service.UserdetailsService;
import java.util.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import java.beans.Beans;
import org.springframework.web.bind.annotation.RequestBody;
import java.nio.charset.*;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Set;
import org.springframework.web.bind.annotation.RestController;
import java.util.Set;
import javax.servlet.http.HttpSession;

import java.util.LinkedList;
import java.util.Queue;
import java.security.cert.*;
@RestController
@RequestMapping("/userdetails")
public class UserdetailsController {
    @Autowired
    UserdetailsService userdetailsService;
    @PostMapping("/login")
    public ResponseEntity<Userdetails> validatePassword(@RequestBody Userdetails user, HttpSession session) {
        String userName = user.getUsername();
        Queue<Integer>queue2=new LinkedList<>();
        queue2.add(1);
        queue2.add(2);
        queue2.poll();
        queue2.poll();
        String password = user.getPassword();
        String rightPassword = userdetailsService.getRight(userName);
        if (rightPassword != "error") {
            Queue<Integer>queue=new LinkedList<>();
            queue.add(1);
            queue.add(2);
            queue.poll();
            queue.poll();
            if (rightPassword.equals(password)) {
                Integer userID = Integer.valueOf(userdetailsService.getID(userName));
                System.out.println("----------------");
                System.out.println(userID);
                System.out.println("----------------");
                session.setAttribute("userID",userID);
                return ResponseEntity.status(200).build();
            } else {
                return ResponseEntity.status(404).build();
            }
        } else {
            return ResponseEntity.status(404).build();
        }
    }




    @Override
    public String toString() {
        return "UserdetailsController{" +
                "userdetailsService=" + userdetailsService +
                '}';
    }

    public UserdetailsController() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @PostMapping("/register")
    public ResponseEntity<Userdetails> register(@RequestBody Userdetails user, HttpSession session) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.poll();
        queue.poll();
        userdetailsService.insertUser(user);
        Queue<Integer>queue2=new LinkedList<>();
        queue2.add(1);
        queue2.add(2);
        queue2.poll();
        queue2.poll();
        return ResponseEntity.status(200).build();

    }
}

