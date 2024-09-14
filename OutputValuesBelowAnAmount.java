import java.util.Scanner; 

public class OutputValuesBelowAnAmount {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int NUM_ELEMENTS = scnr.nextInt();
      System.out.println("NUM_ELEMENTS: " + NUM_ELEMENTS);
      int[] userValues = new int[20];  
      int[] intValues = new int[NUM_ELEMENTS];
      
      for(int i = 0; i < NUM_ELEMENTS; ++i){
        userValues[i] = scnr.nextInt();

        if(i < NUM_ELEMENTS){
            System.out.println(userValues[i]);
            intValues[i] = userValues[i];
        }
      }

      
   }
}
