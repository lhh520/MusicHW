package com.example.musichw.config;

import org.springframework.context.annotation.Configuration;
import java.security.acl.Acl;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import java.util.Map;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.yaml.snakeyaml.util.ArrayStack;

import java.util.*;
import java.security.cert.*;
@Configuration
class MyMvcConfig implements WebMvcConfigurer {
    public MyMvcConfig() {
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
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<9;i++){
            list.add(new Integer(1));
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "DELETE", "PUT")
                .maxAge(3600);
    }
}
