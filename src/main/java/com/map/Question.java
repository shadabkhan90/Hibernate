package com.map;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Question {
	
	@Id
	@Column(name = "QUESTION_ID")
	private int QuesId;
	
	
	@Column(name = "QUESTIONS")
	private String Question;
	
	@OneToOne
	private Answer ans;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Question(int quesId, String question, Answer ans) {
		super();
		QuesId = quesId;
		Question = question;
		this.ans = ans;
	}




	public int getQuesId() {
		return QuesId;
	}
	public void setQuesId(int quesId) {
		QuesId = quesId;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	}




	@Override
	public String toString() {
		return "Question [QuesId=" + QuesId + ", Question=" + Question + ", ans=" + ans + "]";
	}


	}
	
	
	
	
	

