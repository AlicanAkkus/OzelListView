package com.ozellistview;

public class Kisi {
	private String name;
	private boolean kadinMi;

	Kisi(final String name, final boolean kadinMi) {
		this.name = name;
		this.kadinMi = kadinMi;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean isKadinMi() {
		return kadinMi;
	}

	public void setKadinMi(final boolean kadinMi) {
		this.kadinMi = kadinMi;
	}

	public String getInformation() {
		return "Ad : " + name + "\nCins : " + (kadinMi ? "Kadýn" : "Erkek");
	}

}
