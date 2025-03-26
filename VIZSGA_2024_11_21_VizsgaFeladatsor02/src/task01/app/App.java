package task01.app;

public class App {

	public static void main(String[] args) {
		
		TaskSolution taskSolutionObj = new TaskSolution();
		Employee employee = taskSolutionObj.getEmployeeData();
		String text = taskSolutionObj.getUserNameSize() ? "Felhasználónév hossza megfelelő" : "Felhasználónév hossza nem megfelelő";
		System.out.println(employee.toStringDivider());
		System.out.println(text);
		
		// Kész
		

	}

}
