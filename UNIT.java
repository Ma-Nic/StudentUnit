/*Matt Nicol
 * Student Unit
 * 16/11/18
 * Eclipse v4.9.0 * 
 */

package Tutorial3_P1;

import java.util.Arrays;

public class Unit 
{
	//Declare variables, create arrays for students and results
	private String unitNumber;
	private String unitTitle;
	private Student classlist[] = new Student[10];
	private String result[] = new String[10];

	
	public Unit(String unos, String utitle)
	{
		//Set unit number and title
		unitNumber = unos;
		unitTitle = utitle;
	}
	
	public void displayUnit()
	{
		//Display unit number and title
		System.out.println(unitNumber);
		System.out.println(unitTitle);		
	}
	
	public void getClasslist()
	{
		for (int x=0; x<classlist.length;x++)
		{
			
		}

	}
	
	
	public void addStudent(Student temp)
	{
		//Check for free space in the student array, add student if there is space
		boolean space = false;
		for (int x=0; x<classlist.length;x++)
		{
			if (classlist[x]==null)
			{
				classlist[x] = temp;
				space = true;
				break;
			}
		}
	if (space==true) System.out.println("Student inserted"); else System.out.println("No space avaliable");
	}

}
