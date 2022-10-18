
abstract class Producer extends Employee {


	private int ProdUnit; 
	private float Salary;
	
	
	public Producer(int ProdUnit, float Salary,int id, String surname,String firstname,int telephonenumber,int dateofbirth,int dateofhire, float finalsalary, boolean senority, int state) {
		super(id,surname, firstname,telephonenumber,dateofbirth,dateofhire,finalsalary,senority,state);
		this.ProdUnit = ProdUnit;
		this.Salary = Salary;
		// TODO Auto-generated constructor stub
	}

	
	public int getProdUnit() {
		return ProdUnit;
	}

	public void setProdUnit(int ProdUnit) {
		this.ProdUnit = ProdUnit;

	}

	public float getSalary() {
		return Salary;
	}


	public void setSalary(float Salary) {
		this.Salary = Salary;
	}
	}