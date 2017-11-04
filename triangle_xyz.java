/**
 *
 * @author Louis
 */
//三角形三邊長的解法

package java_test_1;

public class HW_xyz {

    public static void main(String[] args) {

        for (int z = 1; z <= 100; z++) //第一層  嘗試所有z的可能性
        {
            for (int y = 1; y <= 100; y++) //第二層  嘗試所有y的可能性
            {
                for (int x = 1; x <= 100; x++) //第三層  嘗試所有x的可能性
                {
                    if (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2) && x + y + z < 100) 
                    //如果 X^2 + Y^2 = Z^2       且 加起來不超過100     才能列印值  
                    {
                        System.out.printf("%d %d %d\n", x, y, z);
                    }

                }
            }
        }

    }

}
