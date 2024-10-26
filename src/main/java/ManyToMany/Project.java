package ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int pro_id;
	private String pro_name;
	
	
	@ManyToMany
	private List<Emp> emp;

	public int getPro_id() {
		return pro_id;
	}

	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public List<Emp> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pro_id, String pro_name, List<Emp> emp) {
		super();
		this.pro_id = pro_id;
		this.pro_name = pro_name;
		this.emp = emp;
	}

}
