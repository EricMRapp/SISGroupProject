import java.util.Scanner;

public class AddStudent
	{
		public static void addStudent()
			{
				//AddStudent.addStudent();
				
				System.out.println("What's the name of your new student?");
				Scanner userInput = new Scanner(System.in);
				String name = userInput.nextLine();
				
				
				Student newGuy = new Student(name);
				
				for(int i = 0; i < 3; i++)
					{
						int period = i+1;
						 
						System.out.println("What's their " + period + " class?");
						String className = userInput.nextLine();
						
						System.out.println("What's their " + period + " grade?");
						String grade = userInput.nextLine();
						
						newGuy.getClasses().add(new Course(period, className, grade));
					}
				
				
				//cant add student unless i have my class system done
				SISGP.students.add(newGuy);


			}
	}
