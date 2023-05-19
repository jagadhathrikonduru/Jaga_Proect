class Sales
{
	static int customers=10;
	static void selling()
	{
		System.out.println("selling....");
	}

}
class HR
{
	static int employees=60;
	static void payroll()
	{
		System.out.println("salary");
	}
}
class Administration
{
	static int admins=20;
	static void monitor()
	{
		System.out.println("monitoring.....");
	}
	public static void main(String[] args) 
	{
		System.out.println(Sales.customers);
		Sales.selling();

		System.out.println(HR.employees);
		HR.payroll();

		System.out.println(admins);
		monitor();
	}

}