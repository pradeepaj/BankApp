package com.hcl.bankingapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Authentication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int otpGen;
	
	private Integer otp;

	


	public int getOtpGen() {
		return otpGen;
	}

	public void setOtpGen(int otpGen) {
		this.otpGen = otpGen;
	}

	public Integer getOtp() {
		return otp;
	}

	public void setOtp(Integer otp) {
		this.otp = otp;
	}

	
	

}
