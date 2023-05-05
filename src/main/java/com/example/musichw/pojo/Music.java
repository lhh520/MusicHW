package com.example.musichw.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import java.security.*;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.annotation.TableId;
import java.util.Queue;
import com.baomidou.mybatisplus.annotation.TableField;
import java.util.Map;
import java.io.Serializable;
import java.util.ArrayList;
import lombok.Data;
import java.util.PriorityQueue;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("Music")
public class Music implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("Name")
    private String name;

    @TableField("Singer")
    private String singer;

    @TableField("Album")
    private String album;


    @TableField("ReleaseDate")
    private String releasedate;

    @TableField("Genre")
    private String genre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
