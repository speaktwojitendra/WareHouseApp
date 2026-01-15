package com.autowiring;

public class Hospital {
Patient p;
public Patient getP() {
	return p;
}
public void setP(Patient p) {
	this.p = p;
}
public String getHospitalName() {
	return HospitalName;
}
public void setHospitalName(String hospitalName) {
	HospitalName = hospitalName;
}
String HospitalName;

}
