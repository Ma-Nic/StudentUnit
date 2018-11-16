/*Matt Nicol
 * Student Unit
 * 16/11/18
 * Eclipse v4.9.0 * 
 */

package Tutorial3_P1;

public class unitDriver {
	
	public static void main (String[] args) 
	{
		
		Unit unit1 = new Unit("12345","HND Computing");
		Student s1 = new Student(001,"S","1","s@1",123);
		Student s2 = new Student(002,"S","2","s@2",234);
		Student s3 = new Student(003,"S","3","s@3",345);
		Student s4 = new Student(004,"S","4","s@4",456);
		//uMenu.sMenu(unit1);
		unit1.displayUnit();
		unit1.addStudent(s1);
		unit1.addStudent(s2);
		unit1.addStudent(s3);
		unit1.addStudent(s4);
		unit1.getClasslist();
		
	}

}
