package com.example.musichw.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.Queue;
import java.util.List;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.io.Serializable;
import java.nio.Buffer;
import lombok.Data;
import java.util.Map;
import lombok.EqualsAndHashCode;

  
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("UserDetails")
public class Userdetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    private String nickname;

    private String password;

    private String enabled;

    private String email;

    private String userface;

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Userdetails{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", enabled='" + enabled + '\'' +
                ", email='" + email + '\'' +
                ", userface='" + userface + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserface() {
        return userface;
    }

    public void setUserface(String userface) {
        this.userface = userface;
    }
}
