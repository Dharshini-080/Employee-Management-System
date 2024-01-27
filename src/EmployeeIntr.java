public interface EmployeeIntr 
{
	//create emp
	public void createEmployee(Employee emp);
	//show emp
	public void showAllEmployee();
	//show emp based on id
	public void showEmployeeBasedOnId(int id);
	//update emp
	public void updateEmployee(int id,String name);
	//delete emp
	public void deleteEmployee(int id);
}

