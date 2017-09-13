package test;
import java.util.Scanner; 

 public class TestArrayInputViaConsole {
   public static void main(String args[]) {
     double sum = 0;
     double avg = 0;
     Scanner sc = new Scanner(System.in);
     int ArraySize = sc.nextInt();
     int[] a = new int[ArraySize];

     for(int i = 0; i < ArraySize; i++) {
       a[i] = sc.nextInt();
       sum = sum + a[i]; 
     }

     System.out.println(a);
     int updateSum = 0;
		int updateNum = 0;
		while (updateSum < sum) {
			for (Integer integer : a) {
				updateSum += updateNum;
			}
			updateNum++;
		}

		System.out.println(updateNum);
		
   } 
 }
