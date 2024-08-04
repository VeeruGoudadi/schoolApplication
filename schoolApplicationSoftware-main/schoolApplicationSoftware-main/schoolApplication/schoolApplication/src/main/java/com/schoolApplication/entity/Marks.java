package com.schoolApplication.entity;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Marks {

	private int sudentId;
	private String studentName;
	private List<String> tecaherNAme;
	private String subject;
	private int marks;

	public int getSudentId() {
		return sudentId;
	}

	public void setSudentId(int sudentId) {
		this.sudentId = sudentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<String> getTecaherNAme() {
		return tecaherNAme;
	}

	public void setTecaherNAme(List<String> tecaherNAme) {
		this.tecaherNAme = tecaherNAme;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Marks [sudentId=" + sudentId + ", studentName=" + studentName + ", tecaherNAme=" + tecaherNAme
				+ ", subject=" + subject + ", marks=" + marks + "]";
	}

}
