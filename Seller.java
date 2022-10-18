
 class Seller extends Employee {


	private float Turnover; 
	private float Salary;
	
	

public Seller(int id, String surname, String firstname, int telephonenumber, int dateofbirth, int dateofhire,
		float finalsalary, boolean senority, int state) {
	super(id, surname, firstname, telephonenumber, dateofbirth, dateofhire, finalsalary, senority, state);
	// TODO Auto-generated constructor stub
}



public float getTurnover() {
	return Turnover;
}

public void setTurnover(float Turnover) {
	this.Turnover = Turnover;

}

public float getSalary() {
	return Salary;
}


public void setSalary(float Salary) {
	this.Salary = Salary;
}
}
