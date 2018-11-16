/*Matt Nicol
 * Student Unit
 * 16/11/18
 * Eclipse v4.9.0 * 
 */

package Tutorial3_P1;


public class uMenu {
	
	public static void sMenu(Unit u) {
		int sValue;
	    // Display Main menu
	    System.out.println("============================");
	    System.out.println("|   Hotel  Booking  Menu   |");
	    System.out.println("============================");
	    System.out.println("| Options:                 |");
	    System.out.println("|    1. Add Student        |");
	    System.out.println("|    2. Display Students   |");
	    System.out.println("|    3. Find Student       |");   
	    System.out.println("|    4. Students w/ Pass   |");
	    System.out.println("|    5. % Success Rate     |");
	    System.out.println("|    6. Remove Student     |");
	    System.out.println("|    0. Exit               |");
	    System.out.println("============================");
	    sValue = keyIn.inInt(" Select option: ");

	    // Switch construct
	    switch (sValue) 
	    {
	    default:
	      System.out.println("Invalid selection");
	      uMenu.sMenu(u); 					//Come back to Menu
	      break;							//Display error if input is not an int
	    case 1:
	      System.out.println("Add Student Selected");
	      Student.addAStudent(u);			//Add a student record
	      break;
	    case 2:
	      System.out.println("Display Students selected");
	      //View student records
	      break;
	    case 3:
	      System.out.println("Find a student selected");
	      //Locate a student from the array
	      break; 
	    case 4:
	      System.out.println("Student's with a pass mark selected");
	      //Show students who have passed
	      break; 
	    case 5:
	      System.out.println("% of students with a pass selected");
	      //Show percentage of students who've passed
	      break; 
	    case 6:
	      System.out.println("Remove a student selected");
	      //Remove student from array
	      break; 
	    case 0:
	      System.out.println("Exit selected");
	      System.out.println("Goodbye");
	      break;				//Exit program
	    }
	}

}
