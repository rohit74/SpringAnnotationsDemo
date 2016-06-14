/**
 * 
 */
/**
 * @author rohit
 *
 */
package com.kushal.view;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kushal.beans.Profile;

public class MainApp{
	public static void main(String[] args){
		@SuppressWarnings({ "resource" })
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Profile profile = (Profile) context.getBean("profile");
		profile.printAge();
		profile.printName();
	
	}
}