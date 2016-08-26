public class DataStructures6 {// in this exercise we make an Employee object constructor, a mechanism to put them into an array of employees, and then we sort said array using an insertion sort algorithm

	public static void main(String[] args) {
		Employee[] EmployeeArray = {new Employee(2,"Pete","Marlowe","pete@marlowe")};
		Employee[] EmployeeArrayLarge = addElement(new Employee(1,"Steven","Carpenter","steven@carpenter"),4,addElement(new Employee(3,"Sam","Contapay","sam@contapay"),3,addElement(new Employee(4,"Nolan","Garrido","nolan@garrido"),2,addElement(new Employee(0,"Chris","Rauh","chris@rauh"),1,EmployeeArray))));
		System.out.println("THIS IS THE UNSORTED EMPLOYEE ARRAY!");
		System.out.println(EmployeeArrayLarge[0].firstName + " " + EmployeeArrayLarge[0].lastName);
		System.out.println(EmployeeArrayLarge[0].employeeNumber);
		System.out.println(EmployeeArrayLarge[1].firstName + " " + EmployeeArrayLarge[1].lastName);
		System.out.println(EmployeeArrayLarge[1].employeeNumber);
		System.out.println(EmployeeArrayLarge[2].firstName + " " + EmployeeArrayLarge[2].lastName);
		System.out.println(EmployeeArrayLarge[2].employeeNumber);
		System.out.println(EmployeeArrayLarge[3].firstName + " " + EmployeeArrayLarge[3].lastName);
		System.out.println(EmployeeArrayLarge[3].employeeNumber);
		System.out.println(EmployeeArrayLarge[4].firstName + " " + EmployeeArrayLarge[4].lastName);
		System.out.println(EmployeeArrayLarge[4].employeeNumber);
		System.out.println("THIS IS THE SORTED EMPLOYEE ARRAY!");
		System.out.println(StoreEmployeesInArray.SortEmployees(EmployeeArrayLarge)[0].firstName);
		System.out.println(StoreEmployeesInArray.SortEmployees(EmployeeArrayLarge)[0].employeeNumber);
		System.out.println(StoreEmployeesInArray.SortEmployees(EmployeeArrayLarge)[1].firstName);
		System.out.println(StoreEmployeesInArray.SortEmployees(EmployeeArrayLarge)[1].employeeNumber);
		System.out.println(StoreEmployeesInArray.SortEmployees(EmployeeArrayLarge)[2].firstName);
		System.out.println(StoreEmployeesInArray.SortEmployees(EmployeeArrayLarge)[2].employeeNumber);
		System.out.println(StoreEmployeesInArray.SortEmployees(EmployeeArrayLarge)[3].firstName);
		System.out.println(StoreEmployeesInArray.SortEmployees(EmployeeArrayLarge)[3].employeeNumber);
		System.out.println(StoreEmployeesInArray.SortEmployees(EmployeeArrayLarge)[4].firstName);
		System.out.println(StoreEmployeesInArray.SortEmployees(EmployeeArrayLarge)[4].employeeNumber);
	}
	
	public static Employee[] addElement(Employee employeeToAdd, int indexTo, Employee[] arr) {// creates new array with one more element (includes said element)
		Employee[] modifiedArray = new Employee[arr.length + 1];
		for (int i = 0; i < indexTo; i++) {
			modifiedArray[i] = arr[i];
		}
		modifiedArray[indexTo] = employeeToAdd;
		for (int j = indexTo + 1; j <= arr.length; j++) {
			modifiedArray[j] = arr[j-1];
		}
		return modifiedArray;
	}

}
