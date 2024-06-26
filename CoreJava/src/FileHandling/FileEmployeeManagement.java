package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEmployeeManagement {

	 private static final String FILE_NAME = "employee_records.txt";

	    public static void main(String[] args) {
	        try {
	            File file = new File(FILE_NAME);
	            if (!file.exists()) {
	                file.createNewFile();
	            }

	            Scanner scanner = new Scanner(System.in);
	            int choice;
	            do {
	                System.out.println("\n1. Add Employee Record");
	                System.out.println("2. Display All Employee Records");
	                System.out.println("3. Search Employee Record by ID");
	                System.out.println("4. Update Employee Salary by ID");
	                System.out.println("5. Delete Employee Record by ID");
	                System.out.println("6. Exit");
	                System.out.print("Enter your choice: ");
	                choice = scanner.nextInt();
	                scanner.nextLine(); // Consume newline
	                switch (choice) {
	                    case 1:
	                        addEmployeeRecord(scanner);
	                        break;
	                    case 2:
	                        displayAllEmployeeRecords();
	                        break;
	                    case 3:
	                        searchEmployeeByID(scanner);
	                        break;
	                    case 4:
	                        updateEmployeeSalary(scanner);
	                        break;
	                    case 5:
	                        deleteEmployeeRecord(scanner);
	                        break;
	                    case 6:
	                        System.out.println("Exiting...");
	                        break;
	                    default:
	                        System.out.println("Invalid choice. Please enter a number between 1 and 6.");
	                }
	            } while (choice != 6);
	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }

	    private static void addEmployeeRecord(Scanner scanner) throws IOException {
	        System.out.print("Enter Employee ID: ");
	        String id = scanner.nextLine().trim();

	        // Check if employee ID already exists
	        if (isEmployeeIdExists(id)) {
	            System.out.println("Employee with ID " + id + " already exists. Please use a different ID.");
	            return;
	        }

	        System.out.print("Enter Name: ");
	        String name = scanner.nextLine().trim();
	        System.out.print("Enter Department: ");
	        String department = scanner.nextLine().trim();
	        System.out.print("Enter Salary: $");
	        double salary = scanner.nextDouble();

	        Employee employee = new Employee(id, name, department, salary);

	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
	            writer.write(employee.toString());
	            writer.newLine();
	            System.out.println("Employee record added successfully.");
	        }
	    }

	    private static boolean isEmployeeIdExists(String id) throws IOException {
	        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                if (line.startsWith("ID: " + id)) {
	                    return true;
	                }
	            }
	            return false;
	        }
	    }

	    private static void displayAllEmployeeRecords() throws IOException {
	        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
	            String line;
	            System.out.println("\nEmployee Records:");
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        }
	    }

	    private static void searchEmployeeByID(Scanner scanner) throws IOException {
	        System.out.print("Enter Employee ID to search: ");
	        String searchID = scanner.nextLine().trim();

	        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
	            String line;
	            boolean found = false;
	            while ((line = reader.readLine()) != null) {
	                if (line.startsWith("ID: " + searchID)) {
	                    System.out.println("Employee Record found:");
	                    System.out.println(line);
	                    found = true;
	                    break;
	                }
	            }
	            if (!found) {
	                System.out.println("Employee with ID " + searchID + " not found.");
	            }
	        }
	    }

	    private static void updateEmployeeSalary(Scanner scanner) throws IOException {
	        System.out.print("Enter Employee ID to update salary: ");
	        String updateID = scanner.nextLine().trim();

	        StringBuilder newRecords = new StringBuilder();
	        boolean updated = false;

	        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                if (line.startsWith("ID: " + updateID)) {
	                    String[] parts = line.split(", ");
	                    System.out.print("Enter new Salary for " + parts[1] + ": $");
	                    double newSalary = scanner.nextDouble();
	                    parts[3] = "Salary: $" + newSalary;
	                    line = String.join(", ", parts);
	                    updated = true;
	                }
	                newRecords.append(line).append("\n");
	            }
	        }

	        if (!updated) {
	            System.out.println("Employee with ID " + updateID + " not found.");
	        } else {
	            try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
	                writer.write(newRecords.toString());
	                System.out.println("Salary updated successfully.");
	            }
	        }
	    }

	    private static void deleteEmployeeRecord(Scanner scanner) throws IOException {
	        System.out.print("Enter Employee ID to delete: ");
	        String deleteID = scanner.nextLine().trim();

	        StringBuilder newRecords = new StringBuilder();
	        boolean deleted = false;

	        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                if (!line.startsWith("ID: " + deleteID)) {
	                    newRecords.append(line).append("\n");
	                } else {
	                    deleted = true;
	                }
	            }
	        }

	        if (!deleted) {
	            System.out.println("Employee with ID " + deleteID + " not found.");
	        } else {
	            try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
	                writer.write(newRecords.toString());
	                System.out.println("Employee record deleted successfully.");
	            }
	        }
	    }
	}
