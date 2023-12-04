package com.bootcore.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class LoanApplication {
	@Value("${applicantName}")
	String applicantName;
	@Value("${age}")
	int age;
	@Value("${dob}")
	String dob;
	@Value("${gender}")
	String gender;
	@Value("${occupation}")
	String occupation;
	@Value("${annualGrossSalary}")
	double annualGrossSalary;
	@Value("${loanType}")
	String loanType;
	@Value("${tenure}")
	int tenure;
	@Value("${principleAmount}")
	double principleAmount;

}
