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
        System.out.println("age    : " + user.getUserProperty().getAge());
        System.out.println("height : " + user.getUserProperty().getHeight());
        System.out.println("weight : " + user.getUserProperty().getWeight());
        System.out.println("hobby : " + user.getUserInfo().getHobby());
        System.out.println("job : " + user.getUserInfo().getJob());
        System.out.println("sex : " + user.getUserInfo().getSex());
    }
}
