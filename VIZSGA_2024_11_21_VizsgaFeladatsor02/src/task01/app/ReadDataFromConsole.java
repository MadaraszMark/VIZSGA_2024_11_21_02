package task01.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class ReadDataFromConsole {
	
	public Employee getEmployeeData() {
		String firstName;
		String lastName;
		String userName = null;
		LocalDate dateOfBirth;
		Boolean status;
		Employee employeeObj = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Kérem adja meg az alkalmazott adatait: ");
			System.out.print("Keresztnév(szöveg): ");
			firstName = br.readLine();
			System.out.print("Vezetéknév(szöveg): ");
			lastName = br.readLine();
			System.out.print("Felhasználónév(szöveg, 5 és 15 karakter között): ");
			userName = br.readLine();
			System.out.print("Születési dátum(yyyy-MM-dd): ");
			dateOfBirth = LocalDate.parse(br.readLine());
			System.out.print("Állapot(igaz: 1, hamis: 2): ");
			status = br.readLine().equalsIgnoreCase("1");
			
            employeeObj = new Employee(firstName, lastName, userName, dateOfBirth, status);
           
		} catch (Exception e) {
			// TODO: handle exception
		}
		return employeeObj;
    }

}
