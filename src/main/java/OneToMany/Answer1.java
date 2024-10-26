package OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer1 {
	@Id
	private int AnsId;
	private String Ans;
	
	@ManyToOne
	private Question1 ques; 
	public Question1 getQues() {
		return ques;
	}
	public void setQues(Question1 ques) {
		this.ques = ques;
	}
	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer1(int ansId, String ans) {
		super();
		AnsId = ansId;
		Ans = ans;
	}
	public int getAnsId() {
		return AnsId;
	}
	public void setAnsId(int ansId) {
		AnsId = ansId;
	}
	public String getAns() {
		return Ans;
	}
	public void setAns(String ans) {
		Ans = ans;
	}
	
	

}
