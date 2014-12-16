package com.erpy.spring;

/**
 * Created by baeonejune on 14. 12. 16..
 */
public class User {
    private String userId;
    private String userName;
    UserProperty userProperty;
    UserInfo userInfo;

    /*
    public User (String id, String name) {
        this.userId = id;
        this.userName = name;
    }
    */

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserProperty(UserProperty userProperty) {
        this.userProperty = userProperty;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
