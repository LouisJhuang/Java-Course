/**
 *
 * @author Louis
 */
//for迴圈計算pi值
package week5_HW;
public class HW_2 {
    public static void main(String[] args) {

        int terms = 200000;
        double pi = 0, k = 1;               //k記得用double，不然結果會為整數

        for (int i = 1; i <= terms; i++, k += 2) {
            if (i % 2 == 0) {                        //如果為偶數個項則減
                pi -= 4 / k;
            } else {                                      //如果為奇數個項則加
                pi += 4 / k;
            }
        }
        System.out.printf("%.2f\n", pi);
        System.out.println(pi);
    }
}
