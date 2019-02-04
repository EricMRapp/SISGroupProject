import java.util.ArrayList;
public class Student
	{
		private String name;
		private double GPA;
		private ArrayList<Course> classes;
		
		public Student(String n)
		{
			name = n;
			classes = new ArrayList<Course>();
		}

		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}

		public double getGPA()
			{
				return GPA;
			}
		public void setGPA(double gPA)
			{
				GPA = gPA;
			}

		public ArrayList<Course> getClasses()
			{
				return classes;
			}
		public void setClasses(ArrayList<Course> classes)
			{
				this.classes = classes;
			}
	}
