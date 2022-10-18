
public class Employee {
	
	protected int id;
	protected String surname;
	protected String firstname;
	protected int telephonenumber;
	protected int dateofbirth; // type undifined 
	protected int dateofhire;
	protected float finalsalary;
	protected boolean senority;
	protected int state;
	

	
public Employee (int id, String surname,String firstname,int telephonenumber,int dateofbirth,int dateofhire, float finalsalary, boolean senority, int state){
	this.id= id;
	this.surname = surname;
	this.firstname = firstname;
	this.telephonenumber = telephonenumber;
	this.dateofbirth = dateofbirth;
	this.dateofhire = dateofhire;
	this.finalsalary = finalsalary;
	this.senority = senority;
	this.state = state;

}



public int getId() {
	return id;
}

public String getFirstname() {
	return firstname;
}

public String getSurname() {
	return surname;
}

public int getTelephonenumber() {
	return telephonenumber;
}

public int getDateofbirth() {
	return dateofbirth;
}

public int getDateofhire() {
	return dateofhire;
}

public float getSalary() {
	return finalsalary;
}

public boolean getsenority(){
	return senority;
}

public int getstate() {
	return state;
}


public void setId(int id) {
	this.id = id;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public void Firstname(String firstname) {
	this.firstname = firstname;
}

public void setTelephonenumber(int telephonenumber) {
	this.telephonenumber = telephonenumber;
}

public void setDateofbirth(int dateofbirth) {
	this.dateofbirth = dateofbirth;
}

public void setDateofhire(int dateofhire) {
	this.dateofhire = dateofhire;
}

public void setFinalSalary(float finalsalary) {
	this.finalsalary= finalsalary;
}

public void setSenority(boolean senority) {
	this.senority = senority;
}

public void setState(int state){
	this.state = state;
}



}
