package com.example.CankiriKaratekinUniversitesiApi;

public class Ders {

private	String isim;
private	String dersSayisi;
private	String dersHocasi;
public Ders(String isim, String dersSayisi, String dersHocasi) {
	super();
	this.isim = isim;
	this.dersSayisi = dersSayisi;
	this.dersHocasi = dersHocasi;
}


public String getIsim() {
	return isim;
}
public void setIsim(String isim) {
	this.isim = isim;
}
public String getDersSayisi() {
	return dersSayisi;
}
public void setDersSayisi(String dersSayisi) {
	this.dersSayisi = dersSayisi;
}
public String getDersHocasi() {
	return dersHocasi;
}
public void setDersHocasi(String dersHocasi) {
	this.dersHocasi = dersHocasi;
}
	
	
}
