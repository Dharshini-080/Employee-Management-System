
import java.util.*;
public class App
{

	public static void main(String[] args) 
	{
		EmployeeIntr dao=new EmployeeImpl();
		System.out.print("Welcome to Employee management system\n");
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("1. Add employee\n" +
							"2. Show all Employee details\n" +
							"3. Show Employee based on id \n" +
							"4. Update the employee\n" +
							"5. Delete the employee\n");
			System.out.println("Enter choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				Employee emp=new Employee();
				System.out.println("Enter ID: ");
				int id=sc.nextInt();
				System.out.println("Enter Name: ");
				String name=sc.next();
				System.out.println("Enter Salary: ");
				double salary=sc.nextDouble();
				System.out.println("Enter Age: ");
				int age=sc.nextInt();
				emp.setId(id);
				emp.setName(name);
				emp.setSalary(salary);
				emp.setAge(age);
				dao.createEmployee(emp);
				break;
			case 2:
				dao.showAllEmployee();
				break;
			case 3:
				System.out.println("Enter id to show the details ");
				int empid=sc.nextInt();
				dao.showEmployeeBasedOnId(empid);
				break;
			case 4:
				System.out.println("Enter id to update the details ");
				int empid1=sc.nextInt();
				System.out.println("Enter the new Name ");
				String Name=sc.next();
				dao.updateEmployee(empid1,Name);
				break;
			case 5:
				System.out.println("Enter id to delete ");
				int Id=sc.nextInt();
				dao.deleteEmployee(Id);
				break;
			case 6:
				System.out.println("Thank you for using our Application!!!");
				System.exit(0);
			default:
				System.out.print("Enter valid choice");
				break;
			}
		}
	}

}

