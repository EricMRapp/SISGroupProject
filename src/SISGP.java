import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class SISGP
	{
		static ArrayList<Student> students = new ArrayList<Student>();
		
		public static void main(String[] args) throws FileNotFoundException
			{
				readStudents();
				printStudents();
			}
		
		public static void readStudents() throws FileNotFoundException
		{
			Scanner fileReader = new Scanner(new File("Students.txt"));
			while(fileReader.hasNextLine())
				{
					String input = fileReader.nextLine();
					String[] info = input.split(" ");
					
					String name = (info[0] + " " + info[1]);
					Student s = new Student(name);
					
					for(int i = 0; i < 3; i++)
						{
							int period = i+1;
							String className = info[2 + (i*2)];
							String grade = info[3 + (i*2)];
							s.getClasses().add(new Course(period, className, grade));
						}
					
					students.add(s);
				}
		}
		public static void printStudents()
		{
			for(Student s: students)
				{
					System.out.print((students.indexOf(s) + 1) + ") " + s.getName() + " ");
					System.out.printf("%.2f", s.getGPA());
					for(Course c: s.getClasses())
						{
							System.out.print(", " + c.getName() + " " + c.getGrade());
						}
					System.out.print("\n");
				}
		}

	}
