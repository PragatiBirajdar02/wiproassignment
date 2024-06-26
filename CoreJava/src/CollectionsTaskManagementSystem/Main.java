package CollectionsTaskManagementSystem;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// Create tasks
		 Task task1 = new Task("Complete assignment", "Finish the programming assignment", LocalDate.now().plusDays(5), 1);
		 Task task2 = new Task("Buy groceries", "Purchase fruits and vegetables", 
		LocalDate.now().plusDays(2), 2);
		 Task task3 = new Task("Study Assignment", "Study and Complete the givne assignment", LocalDate.now().plusDays(2), 2);
		 Task task4 = new Task("Clean the room", "Wipe and arrange the items in room", 
		LocalDate.now().plusDays(2), 2);
		 
		 // Create a task list
	        TaskList taskList = new TaskList();

	       // Add tasks to task list
	        taskList.addTask(task1);
	        taskList.addTask(task2);
	        taskList.addTask(task3);
	        taskList.addTask(task4);

	        // Display tasks in the task list
            System.out.println("Tasks in the task list:");
	        taskList.getTasks().forEach(task -> System.out.println(task.getTitle()));

	        // Remove a task from the task list 
	        taskList.removeTask(task2);

	        // Display tasks after removal
	        System.out.println("\nTasks after removing 'Buy groceries':");
	        taskList.getTasks().forEach(task -> System.out.println(task.getTitle()));

	        // Sort tasks by name
	        taskList.sortTasksByName();

	        // Display tasks after removal
	        System.out.println("\nTasks after sorting by name:");
	        taskList.getTasks().forEach(task -> System.out.println(task.getTitle()));
	    

	}

}
