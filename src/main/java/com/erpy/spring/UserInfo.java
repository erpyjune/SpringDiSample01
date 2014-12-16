package com.erpy.spring;

/**
 * Created by baeonejune on 14. 12. 16..
 */
public class UserInfo {
    String job;
    String hobby;
    String sex;

    public UserInfo(String job, String hobby, String sex) {
        this.job = job;
        this.hobby = hobby;
        this.sex = sex;
    }

    public String getJob() {
        return job;
    }

    public String getHobby() {
        return hobby;
    }

    public String getSex() {
        return sex;
    }
}
