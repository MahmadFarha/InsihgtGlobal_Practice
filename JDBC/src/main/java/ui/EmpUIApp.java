package ui;

import java.util.Scanner;

import exception.EmpNotFoundException;
import model.Employee;
import service.EmpService;
import service.EmpServiceImp;

public class EmpUIApp {
	public static void main(String[] args) throws EmpNotFoundException, Exception {
		EmpService empService = new EmpServiceImp();
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag){
			int value;
			System.out.println("-->Press 1 to add employee");
			System.out.println("-->Press 2 to get all employee's");
			System.out.println("-->Press 3 to get employee by Id");
			System.out.println("-->Press 4 to update employee by Id");
			System.out.println("-->Press 5 to delete employee by Id");
			System.out.println("-->Press 6 to Exit\n");
			System.out.print("Enter Value To Process: ");
			value = sc.nextInt();
			switch (value) {
			case 1:
				System.out.print("Enter Employee ID: ");
				emp.setEid(sc.nextInt());
				sc.nextLine();
				
				System.out.print("Enter Employee Name: ");
				emp.setEname(sc.nextLine());

				System.out.print("Enter Employee Salary: ");
				emp.setEsalary(sc.nextDouble());
				System.out.println(empService.addEmp(emp)+ "\n");
				break;
			
			case 2:
				empService.getAllEmp().forEach(e -> System.out.println(e));
				System.out.println();
				break;
				
			case 3:
				System.out.print("Enter Employee Id: ");
				int id = sc.nextInt();
				System.out.println(empService.getEmpById(id)+ "\n");
				break;
			
			case 4:
				System.out.print("Enter Employee ID: ");
				int eid = sc.nextInt();
				sc.nextLine();
				if(empService.getEmpById(eid) != null) {
					System.out.print("Enter Employee Name To Update: ");
					String ename = sc.nextLine();

					System.out.print("Enter Employee Salary To Update: ");
					Double esalary = sc.nextDouble();
					System.out.println(empService.updateEmp(ename, esalary, eid)+ "\n");
				}else {
					System.out.println("Employee Id Does not exist"+ "\n");
				}
				break;
			
			case 5:
				System.out.print("Enter Employee Id to delete record: ");
				int id1 = sc.nextInt();
				if(empService.getEmpById(id1) != null) {
				System.out.println(empService.deleteById(id1)+ "\n");
				}else {
					System.out.println("Employee Id Does not exist"+ "\n");
				}
				break;
			
			case 6:
				flag = false;
				System.out.println("....Existing The Process....");
				break;
			default:
				break;
			}
		}
	}
}
