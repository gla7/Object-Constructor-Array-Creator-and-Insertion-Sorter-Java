
public class StoreEmployeesInArray {
	public static Employee[] SortEmployees (Employee[] a) {
		for (int i = 1; i < a.length; i++) {// we start the comparison in array's second position
			Employee tempEmployee = a[i];// always look at the ith one and put it in a "box"
			for (int j = i - 1; j > - 1; j--) {// compare with each one below in descending order
				if (tempEmployee.employeeNumber < a[j].employeeNumber) {// if the one in box is lower, advance the one compared one up and temporarily place the ith in its former place
					a[j+1] = a[j];
					a[j] = tempEmployee;
				}
			}
		}
		return a;
	}
}
