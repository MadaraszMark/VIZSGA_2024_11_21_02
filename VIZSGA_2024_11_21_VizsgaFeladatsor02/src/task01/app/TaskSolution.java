package task01.app;

public class TaskSolution {
	
	ReadDataFromConsole readDataFromConsoleObj = new ReadDataFromConsole();
	Employee employeeData = readDataFromConsoleObj.getEmployeeData();
	
	public Employee getEmployeeData() {
        return employeeData;
    }
	
	public Boolean getUserNameSize() {
		return employeeData.getUserName().length() >= 5 && employeeData.getUserName().length() <= 15;
	}

}
