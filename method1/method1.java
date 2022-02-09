package out.simpli.method1;
// 4. wAP different methods of different return types
public class method1 {
	
	public void print()
	{
		System.out.println("Method without return type and with out parameters");
	}
	public void display(String name)
	{
		System.out.println("Name is "+name);
	}
	public int cube(int n)
	{
		return n*n*n;
	}
	public String fullName(String fname, String lname)
	{
		return fname+" "+lname;
	}
	
	public static void main(String args[]) {
		method1 obj=new method1();
		obj.display("Deepak");
		System.out.println(obj.fullName("Deepak", "Reddy"));
		System.out.println(obj.cube(6));
		obj.print();
	}

}
