package com.summer.rabbitmq.demo.mq.msg;

import java.io.Serializable;

public class MqMsg implements Serializable {
    private String userName;
    private Integer age;
    private Long time;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "MqMsg{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", time=" + time +
                '}';
    }
}
