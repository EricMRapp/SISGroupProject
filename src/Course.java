public class Course
	{
		private int period;
		private String name;
		private String grade;
		
		public Course(int p, String n, String g)
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

		public String getGrade()
			{
				return grade;
			}
		public void setGrade(String grade)
			{
				this.grade = grade;
			}
	}
