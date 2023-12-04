package com.bootcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bootcore.beans.CreditReport;

@SpringBootApplication
public class BootCoreApplication {
	public static void main(String[] args) {
		
	ApplicationContext context=SpringApplication.run(BootCoreApplication.class);
	CreditReport creditReport=context.getBean("creditReport",CreditReport.class);
	System.out.println(creditReport);
	
}
}
