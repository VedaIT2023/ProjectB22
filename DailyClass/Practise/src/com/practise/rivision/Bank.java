package com.practise.rivision;

public abstract class Bank extends DivakaBank{
	
	private String aadhaar;
	private String pan;
	private String passport;
	
	

	public String getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	abstract public void openAccount();
	
	abstract public void closeAccount();
	
	public float homeloanPercent() {
		return 10.12f;
	}
	
	
	
}
