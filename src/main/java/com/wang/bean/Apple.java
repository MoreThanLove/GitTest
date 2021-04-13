package com.wang.bean;

public class Apple {
	private String appleName;
	private Double appleWeight;
	public Apple() {
		super();
	}
	public Apple(String appleName, Double appleWeight) {
		super();
		this.appleName = appleName;
		this.appleWeight = appleWeight;
	}
	public String getAppleName() {
		return appleName;
	}
	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}
	public Double getAppleWeight() {
		return appleWeight;
	}
	public void setAppleWeight(Double appleWeight) {
		this.appleWeight = appleWeight;
	}
	@Override
	public String toString() {
		return "Apple [appleName=" + appleName + ", appleWeight=" + appleWeight
				+ "]";
	}
	
}
