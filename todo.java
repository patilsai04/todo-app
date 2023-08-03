import java.util.*;

class Opration {
	String[] task = new String[10];
	Scanner input = new Scanner(System.in);
	int top = -1;

	public void add(String list) {
		task[++top] = list;
		System.out.println("Added the task..");
	}

	public String remove () {
		     System.out.println("The "+ task[top]+" Task is Removed " );
			 return task[top--];
	
	}

	public void view() {
		if(top==-1){
			System.out.println("Not any task Added!!");
		} else{
		System.out.println("All task List is:");
		for (int i = 0; i <= top; i++
		 ) {
			System.out.println(i+1 +"."+task[i]);
		}
	}
	}

	public void exit() {
		System.out.println("Exit from TODO..");
		System.exit(0);
	}

}

public class todo {
	public static void main(String[] args) 
	{

		System.out.println("Welcome to your Todo Manager!");
		System.out.println("\n"+"Please Enter your Name: ");
		try (Scanner in = new Scanner(System.in)) {
			String name = in.next();

			System.out.println("  -------------------");
			System.out.println("\tHello "+ name );
			System.out.println("  -------------------");

			int choice;

			Opration op=new Opration();

			do {
				System.out.println("\nPlease choose an option");
				System.out.println("1. Add a task ");
				System.out.println("2. Remove a task ");
				System.out.println("3. List all tasks ");
				System.out.println("4. Exit");
				 choice = in.nextInt();
				switch(choice) {
				case 1:   
				    String value;     
					System.out.println("Enter a task: ");
					value = in.next();
					op.add(value);
					break;
				case 2:
					op.remove();
					break;
				case 3:
					op.view();
					break;
				case 4:
					op.exit();
					break;
			} 	
}while (choice > 0);
		}	
  }
}
