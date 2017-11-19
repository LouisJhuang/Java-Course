/**
 *
 * @author Louis
 */
//呼叫方法用
package Hw10_Arrays;

public class ArrayDemo {

   
    public static void main(String[] args) {
       
        int [] array ={   15,90,65,87,100,63,73,59,60,40  } ;   //10個數字
        
        MyArrays.BubbleSortsort(array);                    //小到大
        MyArrays.BubbleSort1(array);      //大到小
        MyArrays.BubbleSort2(array,0);   //參數用0  是小到大   用1是大到小
        
        
    }
    
    
    
}
