package com.bootcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class CreditReport {
	@Autowired
	LoanApplication loanApplication;
	@Value("${cibilScore}")
	int cibilScore;
	@Value("${description}")
	String description;

}
