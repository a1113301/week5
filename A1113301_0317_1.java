import java.util.Scanner;

public class A1113301_0317_1 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n, m;

      
      System.out.print("請輸入N：");
      n = input.nextInt();
      System.out.print("請輸入M：");
      m = input.nextInt();

     
      int[][] nums = new int[n][m];
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            nums[i][j] = (i+1)*(j+1); 
         }
      }
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            System.out.print(nums[i][j] + " ");
         }
         System.out.println();
      	}
	}
}

      
