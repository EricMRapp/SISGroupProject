public class Course
	{
		private int period;
		private String name;
		private char grade;
		
		public Course(int p, String n, char g)
		{
			period = p;
			name = n;
			grade = g;
		}

		public int getPeriod()
			{
				return period;
			}
		public void setPeriod(int period)
			{
				this.period = period;
			}

		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}

		public char getGrade()
			{
				return grade;
			}
		public void setGrade(char grade)
			{
				this.grade = grade;
			}
	}
