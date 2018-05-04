package com.Eugine.SamplePrgrm;

public class Contract_employee extends Employee{
	private String per_hour;
	private String contract_duration;
	
	public String getContract_duration() {
		return contract_duration;
	}
	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}
	
	public String getPer_hour() {
		return per_hour;
	}
	public void setPer_hour(String per_hour) {
		this.per_hour=per_hour;
	}

}
