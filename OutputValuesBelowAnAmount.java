import java.util.Scanner; 

public class OutputValuesBelowAnAmount {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int NUM_ELEMENTS = scnr.nextInt();
      int[] userValues = new int[NUM_ELEMENTS];  
      
      for(int i = 0; i < NUM_ELEMENTS; ++i){
        userValues[i] = scnr.nextInt();
      }
      
      int threshold = scnr.nextInt();

      for(int i = 0; i < userValues.length; ++i){
        if (userValues[i] < threshold){
           System.out.print(userValues[i] + ",");
        }
      }
      System.out.println();
      scnr.close();
   }
}
