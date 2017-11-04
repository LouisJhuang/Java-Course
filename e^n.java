/**
 *
 * @author Louis
 */
//for迴圈計算e指數函數
package week5_HW;
import java.util.Scanner;

public class HW_3_2_input {
    
    public static void main(String[] args) {
        
        double e = 1, x = 1, z = 1;
        int tern = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入x次方值");
        tern = input.nextInt();

        for (int i = 1; i < tern; i++, z++) {
            x *= i;
            //  1  ,   2     ,   3
            e += Math.pow(5, z)  /   x  ;
            // 1  +   5^1 / (1*1)  ,    5^2/  (2*1)   ,  5^3  /    (3*2)  ,   5^4  /   (4*6)  
            System.out.printf("執行%d次迴圈\n", i);
        }
        System.out.printf("e = %f\n", e);
        System.out.println(e);
        
        
        
        
    }
    
}
