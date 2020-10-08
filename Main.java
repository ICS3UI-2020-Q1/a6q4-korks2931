import java.util.Scanner; 
/**
 *This program will calculate the dot product of the two vectors given 3 numbers in it.
 * @author Sevde 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner(System.in);
    // create a variable to store 3 
    final int NUM_VALUES = 3;
    // make an array to store 3 values in a vector
    int[] firstVector = new int[NUM_VALUES];
    // tell the user to enter in three values 
    System.out.println("Please enter the 3 values for the first vector");
    // make a for loop to go through the first array
     for(int i = 0; i < NUM_VALUES; i++){
       // prompt the user for the values
      firstVector[i] = input.nextInt();
      
    
     }
     // name the first value of the first vector for the equation 
     int x1 = firstVector[0];
     // name the second value of the first vector
      int y1 = firstVector [1];
     // name the third value of the first vector
      int z1 = firstVector[2];

     // tell the user to enter in three more values for the second vector
     System.out.println("Please enter the 3 values for the second vector");
     // make an array for the second vector 
     int [] secondVector = new int[NUM_VALUES];
     // make a for loop to go through the second array
     for(int i = 0; i < NUM_VALUES; i++){
       secondVector[i] = input.nextInt();
     }
     // name the three values the user entered to use in the equation 
     int x2 = secondVector[0];
     int y2 = secondVector[1];
     int z2 = secondVector[2];
     // declare a variable to store total 
     int total; 
     // make a for loop to go through to find the dot product of these two vectors 
    for ( int i = 0; i < NUM_VALUES; i++){
      // write the equation to find the dot product using the values the user entered 
     total = x1*x2 + y2*y1 + z1* z2;
     // tell the user the dot product 
    System.out.println("The dot product is " + total);
    // stop the loop 
    break;
    }
    
    
  }
}
