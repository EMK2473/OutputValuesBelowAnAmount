import java.util.Scanner; 

public class OutputValuesBelowAnAmount {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int NUM_ELEMENTS = scnr.nextInt();
      int[] userValues = new int[20];  
      int[] intValues = new int[NUM_ELEMENTS];
      
      for(int i = 0; i < NUM_ELEMENTS + 1; ++i){
        userValues[i] = scnr.nextInt();

        if(i < NUM_ELEMENTS){
            intValues[i] = userValues[i];
        }
      }
      
      for(int i = 0; i < intValues.length; ++i){
        if (intValues[i] < userValues[NUM_ELEMENTS]){
           System.out.print(intValues[i] + ",");
        }
      }
      System.out.println();
      scnr.close();
   }
}
