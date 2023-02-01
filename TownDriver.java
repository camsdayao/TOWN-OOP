/**
 * 
 */
package Town;

import java.util.Scanner;

/**
 * @author CamilleDayao
 *@Description : To know the updated statistics of Town
 *@DateCreated : 20/05/2022
 */
public class TownDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Town newHome = new Town();
			
		System.out.print("Initial Number of Adult: ");		// initialMethod process
		int adultNum = scan.nextInt();
		System.out.print("Initial Number of Children: ");
		int childNum = scan.nextInt();
		newHome.initialMethod(childNum, adultNum);		//calls initial method
		
		newHome.simulateBirth();					//Simulate the birth of pair of twin
		newHome.simulateBirth();
		
		newHome.printStatistics();					//Statistics
	}

}
