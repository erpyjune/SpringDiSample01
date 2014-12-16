package com.erpy.spring;


/**
 * Created by baeonejune on 14. 12. 16..
 */
public class User {
    private String userId;
    private String userName;
    private UserProperty userProperty;
    private UserInfo userInfo;
    private AddProperty addProperty;


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

    public UserProperty getUserProperty() {
        return userProperty;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setAddProperty(AddProperty addProperty) {
        this.addProperty = addProperty;
    }

    public AddProperty getAddProperty() {
        return addProperty;
    }
}
