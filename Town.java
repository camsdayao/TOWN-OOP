/**
 * 
 */
package Town;

/**
 * @author CamilleDayao
 *@Description : To know the updated statistics of Town
 *@DateCreated : 20/05/2022
 */
public class Town {
	private int numberAdult;
	private int numberChild;
	
	public void initialMethod(int childNum, int adultNum) {		// method to store the number of child and adult
		
		numberAdult = adultNum;
		numberChild = childNum;
	}
	
	public void simulateBirth() {					//children birth simulator
	numberChild ++;
	System.out.println("The updated Number of Children is: " + numberChild);
	}
	
	public void printStatistics() {				//printing of the updated statistics
		System.out.println("Number of Adult: " + numberAdult);
		System.out.println("Number of Children: " + numberChild);
	}

}



