package com.telusko.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	// container
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // create a container
//    	Alien obj = new Alien();
    	
    	// suppose we have two times of Alien obj, one time only object will created.
    	Alien obj = (Alien) context.getBean("alien");
    	obj.code();
    	
    	Laptop l = (Laptop) context.getBean("lap");
    	l.compile();
    	
    }
}
