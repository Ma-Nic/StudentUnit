/*Matt Nicol
 * Student Unit
 * 16/11/18
 * Eclipse v4.9.0 * 
 */

package Tutorial3_P1;

public class Student {
	
	//Declare variables
	private int sNumber;
	private String forename;
	private String surname; 
	private String eAddr; 
	private int mobNumber;
	
	
	public Student() 
	{
		
	}

	public Student(int sNum, String forN, String surN, String eAdd, int mobNum) 
	{
		//Create student with predetermined values
		sNumber = sNum;
		forename = forN;
		surname = surN;
		eAddr = eAdd;
		mobNumber = mobNum;
	}
	
	public void displayStudent()
	{
		
	}
	
	//Set new student details
	public void setStuNumber()
	{
		int snoValue;
		snoValue = keyIn.inInt("Please enter student number: ");
		this.sNumber = snoValue;
	}
	
	public void setSForename()
	{
		String sforValue;
		sforValue = keyIn.inString("Please enter student's forename: ");
		this.forename = sforValue;
	}
	
	public void setSSurname()
	{
		String ssurValue;
		ssurValue = keyIn.inString("Please enter student's surname: ");
		this.surname = ssurValue;
	}
	
	public void setSEmail()
	{
		String seAddrValue;
		seAddrValue = keyIn.inString("Please enter student's email address: ");
		this.surname = seAddrValue;
	}
	
	public void setSmobNumber()
	{
		int snoValue;
		snoValue = keyIn.inInt("Please enter student's mobile number: ");
		this.sNumber = snoValue;
	}
	
	//Get student details
	public int getStuNumber()
	{
		return(sNumber);
	}
	
	public String getSForename()
	{
		return(forename);
	}
	
	public String getSSurname()
	{
		return(surname);
	}

	public String getSEmail()
	{
		return(surname);
	}
	
	public int getSmobNumber()
	{
		return(mobNumber);
	}
	
   @Override			//Override to string to display array values
   public String toString() 
   {
        return (" Student Number:"+this.getStuNumber()+
                " Forename: "+ this.getSForename() +
                " Surname: "+ this.getSSurname() +
                " Email : " + this.getSEmail() +
                " Mobile Number : " + this.getSmobNumber());
   }
	
	public static void addAStudent(Unit u) 
	{
		Student nStu = new Student();
		nStu.setStuNumber();
		nStu.setSForename();
		nStu.setSSurname();
		nStu.setSEmail();
		nStu.setSmobNumber();
		u.addStudent(nStu);
		uMenu.sMenu(u);
	}
	
}
