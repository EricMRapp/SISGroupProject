import java.util.Comparator;

public class NameSorter implements Comparator<Student>
	{

	@Override
	public int compare(Student s1, Student s2)
		{
			String[] name1 = s1.getName().split(" ");
			String[] name2 = s2.getName().split(" ");
			String l1 = name1[1].substring(0,1);
			String l2 = name2[1].substring(0,1);
			
			return l1.compareTo(l2);
		}
		
	}
