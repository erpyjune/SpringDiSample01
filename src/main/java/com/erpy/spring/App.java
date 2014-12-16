package com.erpy.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext("classpath:AppContext.xml");

        User user = ctx.getBean("userBean", User.class);

        System.out.println("id     : " + user.getUserId());
        System.out.println("name   : " + user.getUserName());
        System.out.println("age    : " + user.userProperty.getAge());
        System.out.println("height : " + user.userProperty.getHeight());
        System.out.println("weight : " + user.userProperty.getWeight());
        System.out.println("hobby : " + user.userInfo.getHobby());
        System.out.println("job : " + user.userInfo.getJob());
        System.out.println("sex : " + user.userInfo.getSex());
    }
}
