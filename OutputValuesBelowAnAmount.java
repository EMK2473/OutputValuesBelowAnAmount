import java.util.Scanner; 

public class OutputValuesBelowAnAmount {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int NUM_ELEMENTS = scnr.nextInt();
      System.out.println("NUM_ELEMENTS: " + NUM_ELEMENTS);
      int[] userValues = new int[20];  
      int[] intValues = new int[NUM_ELEMENTS];
      
      for(int i = 0; i < NUM_ELEMENTS + 1; ++i){
        userValues[i] = scnr.nextInt();

        if(i < NUM_ELEMENTS){
            System.out.println(userValues[i]);
            intValues[i] = userValues[i];
        }
      }
      
      for(int i = 0; i < intValues.length; ++i){
        System.out.println("NUM OF ELELEMTS " + NUM_ELEMENTS);
        if (intValues[i] < userValues[NUM_ELEMENTS]){
           System.out.println("IntegerValues: ");
           System.out.println(intValues[i] + ",");
        }
      }
      int threshold = userValues[NUM_ELEMENTS];
      System.out.println();
      System.out.print("Threshold: " + threshold);

      
   }
}
