import java.util.Comparator;

public class PeriodSorter implements Comparator<Student>
	{

		int per;
		public PeriodSorter(int per)
		{
			this.per = per;
		}
		@Override
		public int compare(Student s1, Student s2)
		{
			String p1 = s1.getClasses().get(per).getName().substring(0,1);
			String p2 = s2.getClasses().get(per).getName().substring(0,1);
			return p1.compareTo(p2);
		}
		
	}
