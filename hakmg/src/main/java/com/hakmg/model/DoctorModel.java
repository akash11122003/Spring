package com.hakmg.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Doctor")
public class DoctorModel {
@Id
private int docid;
private String docname;
private String speciality;
private long phnno;


public int getDocid() {
	return docid;
}
public void setDocid(int docid) {
	this.docid = docid;
}
public String getDocname() {
	return docname;
}
public void setDocname(String docname) {
	this.docname = docname;
}
public String getSpeciality() {
	return speciality;
}
public void setSpeciality(String speciality) {
	this.speciality = speciality;
}
public long getPhnno() {
	return phnno;
}
public void setPhnno(long phnno) {
	this.phnno = phnno;
}
}
