import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import javax.swing.JTextArea;
import java.util.ArrayList;

@SuppressWarnings({ "unused", "serial" })
public class SISRunner extends JPanel
	{
		static JPanel panel;
		static JFrame frame;
		static ArrayList<Student> students = new ArrayList<Student>();
		
		public static void main(String[] args) throws FileNotFoundException
			{
				readStudents();
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

	}
