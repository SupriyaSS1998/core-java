package com.xworkz.Hospital.app.Hospital;

public class HospitalTester {

	
	public static void main(String[] args) {
	
	Hospital hospital = new Hospital();
	hospital.updatePatientNames("ganesha");
	hospital.updatePatientNames("gowri");
	hospital.updatePatientNames("suma");
	hospital.updatePatientNames("navya");
	hospital.updatePatientNames("veena");
	hospital.updatePatientNames("kavya");
    hospital.getPatientNames();
    hospital.updatePatientNames("Guna","Guna Sarkar","");
	}
}
