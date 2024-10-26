package OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Question1 {
	@Id
	private int QuesId;
	private String Ques;
	
	@OneToMany
	private List<Answer1> answer;

	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQuesId() {
		return QuesId;
	}

	public void setQuesId(int quesId) {
		QuesId = quesId;
	}

	public String getQues() {
		return Ques;
	}

	public void setQues(String ques) {
		Ques = ques;
	}

	public List<Answer1> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer1> answer) {
		this.answer = answer;
	}

	public Question1(int quesId, String ques, List<Answer1> answer) {
		super();
		QuesId = quesId;
		Ques = ques;
		this.answer = answer;
	}
	
	

}
