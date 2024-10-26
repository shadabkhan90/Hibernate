package ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	
	
	@Id
	private int emp_id;
	private String emp_name;
	
	@ManyToMany
	private List<Project> pro;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public List<Project> getPro() {
		return pro;
	}

	public void setPro(List<Project> pro) {
		this.pro = pro;
	}

	public Emp(int emp_id, String emp_name, List<Project> pro) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.pro = pro;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
