package cycle2;

//Program to create a class for Employee having attributes eNo,
//eName eSalary. Read n employ information and Search for an
//employee given eNo, using the concept of Array of Objects

import java.util.*;

class Employee {

	int eNo;
	String eName;
	int eSalary;
	static Scanner sc = new Scanner(System.in);
	
	public void read() {
		
		System.out.print("Enter ID : ");
		eNo = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Name : ");
		eName = sc.nextLine();
		System.out.print("Enter monthly salary : ");
		eSalary = Integer.parseInt(sc.nextLine());
	}

	public String toString() {
		return "Name : " + eName + "\nSalary : "+ eSalary ;
	}

	public static void main(String[] args) {
		int i, n, No;
	
		System.out.println("Enter size of array:");
		n = Integer.parseInt(sc.nextLine());
		Employee emp[] = new Employee[n];
		
		for (i = 0; i < n; i++) {
			emp[i] = new Employee();
			emp[i].read();
		}
		
		System.out.println("Search");
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			
			
			for (i = 0; i < n; i++) {
				System.out.print("Enter ID : ");
				No = Integer.parseInt(sc.nextLine());
				if(No==0) {
					System.out.println("Exit!");
					System.exit(0);
				}
				if (emp[i].eNo == No) {
					System.out.println(emp[i]);				
				}else {
					System.out.println("id does not exist !");
				}
			}
		}
	}
}