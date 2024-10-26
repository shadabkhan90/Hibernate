package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Answer {
	@Id
	@Column(name = "ANSWER_ID")
	private int AnsId;
	private String Answers;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int ansId, String answers) {
		super();
		AnsId = ansId;
		Answers = answers;
	}
	public int getAnsId() {
		return AnsId;
	}
	public void setAnsId(int ansId) {
		AnsId = ansId;
	}
	public String getAnswers() {
		return Answers;
	}
	public void setAnswers(String answers) {
		Answers = answers;
	}
	@Override
	public String toString() {
		return "Answer [AnsId=" + AnsId + ", Answers=" + Answers + "]";
	}
	
	

}
