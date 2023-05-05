package com.example.musichw.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;

  
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("message")
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer visitor;

    private String msg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVisitor() {
        return visitor;
    }

    public void setVisitor(Integer visitor) {
        this.visitor = visitor;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
