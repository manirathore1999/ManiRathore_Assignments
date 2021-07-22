package CoreJavaA2;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager(10000,5000);
		Labour l = new Labour(5000,3000);
		System.out.println("Manager Salary : " + m.getSalary());
		System.out.println("Labour Salary : " + l.getSalary());

	}

}

class Employee {
	protected double salary;

	public Employee() {

	}

	public Employee(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
}

class Manager extends Employee {
	private double incentive;
	
	public Manager(double salary, double incentive) {
		super(salary);
		this.incentive = incentive;
	}

	@Override
	public double getSalary() {

		return salary + incentive;
	}
}

class Labour extends Employee {
	private double overtime;

	public Labour(double salary, double overtime) {
		super(salary);
		this.overtime = overtime;
	}

	@Override
	public double getSalary() {
		return salary + overtime;
	}
}
