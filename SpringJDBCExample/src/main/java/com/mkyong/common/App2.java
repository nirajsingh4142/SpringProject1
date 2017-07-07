package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mkyong.customer.dao.CustomerDAO;
import com.mkyong.customer.model.Customer;

public class App 
{
	/* 
	 * Main method to start 
	 * Added Customer 1
	 * Added Customer 2
	 * 
	 * */
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        Customer customer3 = new Customer(3, "mkyong",28);
        Customer customer4 = new Customer(4,"niraj", 30)
        customerDAO.insert(customer3);
        customerDAO.insert(customer4);
    	
        Customer customer3 = customerDAO.findByCustomerId(3);
        System.out.println(customer3);
        
        Customer customer4 = customerDAO.findByCustomerId(4);
        System.out.println(customer4);
        
    }
}
