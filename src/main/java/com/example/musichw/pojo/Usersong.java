package com.example.musichw.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.List;
import java.nio.Buffer;
import java.sql.Blob;
import com.baomidou.mybatisplus.annotation.TableId;
import java.util.Date;
import java.util.Map;
import java.io.Serializable;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

  
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("userSong")
public class Usersong implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer usercode;

    private Integer songcode;

    @Override
    public String toString() {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        return "Usersong{" +
                "id=" + id +
                ", usercode=" + usercode +
                ", songcode=" + songcode +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsercode() {
        return usercode;
    }

    public void setUsercode(Integer usercode) {
        this.usercode = usercode;
    }

    public Integer getSongcode() {
        return songcode;
    }

    public void setSongcode(Integer songcode) {
        this.songcode = songcode;
    }
}
