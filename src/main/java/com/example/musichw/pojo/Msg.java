package com.example.musichw.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Msg {

    @TableId(type = IdType.AUTO)
    Integer msgId;
    String msgName;
    String msgAge;
    String  msgGender;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msgId=" + msgId +
                ", msgName='" + msgName + '\'' +
                ", msgAge='" + msgAge + '\'' +
                ", msgGender='" + msgGender + '\'' +
                '}';
    }

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public String getMsgName() {
        return msgName;
    }

    public void setMsgName(String msgName) {
        this.msgName = msgName;
    }

    public String getMsgAge() {
        return msgAge;
    }

    public void setMsgAge(String msgAge) {
        this.msgAge = msgAge;
    }

    public String getMsgGender() {
        return msgGender;
    }

    public void setMsgGender(String msgGender) {
        this.msgGender = msgGender;
    }
}
