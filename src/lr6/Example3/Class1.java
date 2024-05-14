package lr6.Example3;


import java.util.Arrays;

public class Class1 {
   public static int[] nums = new int[] {1000,5,50,100,50};

   {

      Arrays.sort(nums);

      int[] arrayInt = new int[3];

      System.out.println("Наибольшее значение " + nums[4]);
      System.out.println("Среднее значение " + nums[2]);
      System.out.println("Наимеьшее значение " + nums[0]);


   }
}