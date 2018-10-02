package hello_spring;

//Bean or Model or POJO(Plain Old Java Object)
public class HelloSpring {
	
	//Attributes
	String name;
	int val;
	LastName lname;
	
	//Methods
	public HelloSpring() {
		//System.out.println("--Objected Constructed--");
	}
	
	public HelloSpring(String name, int val, LastName lname) {
		this.name = name;
		this.val = val;
		this.lname = lname;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public LastName getLname() {
		return lname;
	}

	public void setLname(LastName lname) {
		this.lname = lname;
	}
	
	

	@Override
	public String toString() {
		return "HelloSpring [name=" + name + ", val=" + val + ", lname=" + lname + "]";
	}

	public void myInit() {
		System.out.println("--Object Initialized--");
	}
	
	public void myDestroy() {
		System.out.println("--Object Destroyed--");
	}
}
