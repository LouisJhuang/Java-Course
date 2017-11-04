/**
 *
 * @author Louis
 */
//while迴圈 & Switch條件式的應用

package java_test_1;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        int count = 0, A = 0, B = 0, C = 0, D = 0, E = 0,  grade = 0 , x = 0 , y=0  , z=0  ;
        double average = 0 ,total=0  ;
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入成績，-1結束輸入");
        grade = input.nextInt();
        z = grade;
        while (grade != -1) {            
            System.out.println("請輸入成績，-1結束輸入");            
            total += grade;
            y = grade;  
            
            switch (grade / 10) {
                case 10:
                case 9:
                    A += 1;
                    break;
                case 8:
                    B += 1;
                    break;
                case 7:
                    C += 1;
                    break;
                case 6:
                    D += 1;
                    break;
                default:
                    E += 1;
                    break;
            }
            
               
               if (grade >x){
                   x = grade ;
               }
               
               if ( y < z )
               {
                   z = y;
               }
               
            grade = input.nextInt();
            count +=1 ;
            
        }

        average = total / count;
        System.out.printf("各區間人數\nA=%d\nB=%d\nC=%d\nD=%d\nE=%d\n", A, B, C, D, E);
        System.out.printf("平均分數為 %.2f\n", average);
        System.out.printf("總人數 %d\n", count);
        
        System.out.printf("最大值%d\n", x);
        System.out.printf("最小值%d\n", z);
        
    }

}
