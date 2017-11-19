/**
 *
 * @author Louis
 */
// 氣泡排序法的應用

package Hw10_Arrays;


public class MyArrays {

   public static void BubbleSortsort(int[] array){
        // 氣泡排序法  小到大   排序用
        int temp;
        System.out.println("氣泡排序法 小到大");
        for (int i =0; i<array.length-1;i++){
            for(int j=0 ; j<array.length-1 ; j++){
                if (array[j] > array[j+1] ){
                    temp = array[j];
                    array[j] =  array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        
        
        for (int i =0;  i<array.length ;i++){
            // 列印出所有數字用
            System.out.printf("%d " , array[i]);
        }
        
        System.out.println();
        System.out.println("---------------------");
    }

    public static void BubbleSort1(int[] array ){

        // 氣泡排序法  大到小  
        System.out.println("氣泡排序法 大到小");
        int temp;
        for (int i =0; i<array.length-1;i++){
            for(int j=0 ; j<array.length-1 ; j++){
                if (array[j+1] > array[j] ){
                    temp = array[j];
                    array[j] =  array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        
        for (int i =0 ;i<array.length;i++){
            //列印出所有數字
            System.out.printf("%d ",array[i]);
        }
        
        System.out.println();
        System.out.println("---------------------");
    }
    
    
    public static void BubbleSort2(int[] array , int type){
        // 氣泡排序法  小到大  大到小  都可以  
        
        if (type==0){
         // 氣泡排序法  小到大   排序用
        System.out.println("氣泡排序法 大到小，小到大都可以---小到大");
        int temp;
        for (int i =0; i<array.length-1;i++){
            for(int j=0 ; j<array.length-1 ; j++){
                if (array[j] > array[j+1] ){
                    temp = array[j];
                    array[j] =  array[j+1];
                    array[j+1] = temp;
                  }
              }
          }
        
         for (int i =0 ;i<array.length;i++){
            //列印出所有數字
            System.out.printf("%d ",array[i]);
        }
        System.out.println();
        System.out.println("---------------------");
       
        }else if (type==1){
        System.out.println("氣泡排序法 大到小，小到大都可以---大到小");
        //大到小
        int temp;
        for (int i =0; i<array.length-1;i++){
            for(int j=0 ; j<array.length-1 ; j++){
                if (array[j+1] > array[j] ){
                    temp = array[j];
                    array[j] =  array[j+1];
                    array[j+1] = temp;
                  }
              }
          }
        
            for (int i =0 ;i<array.length;i++){
                //列印出所有數字
                System.out.printf("%d ",array[i]);
            }
        
            System.out.println();
            System.out.println("---------------------");
        
      }
        
         
        
       
        
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        
    }
    
}
