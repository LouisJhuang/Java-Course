/**
 *
 * @author Louis
 */
package HW2;

import HW1.GradeBook;


public class GradeBook2 {
      
    public static void main(String[] args) {
        
        int [][] array = {   { 30 , 70 , 75  ,  65  } , {   70,  85,  100  , 60 } ,  {100  , 55  ,90  ,20 }   }   ;
        //System.out.printf("平均為 %d",GradeBook.average(array.length)  ) ;
        //System.out.printf("%d ",array[2][1]);           //示範位置用
        System.out.println("(a)全班成績為");
        for (int i =0; i<array.length ;i++){
            for (int j =0;  j<  array[i].length  ;  j++){
                System.out.printf("%d ",array[i][j]);
                //System.out.printf("i值 = %d ",array[i].length);     //示範i值用   i值=4
                //System.out.printf("共有幾個陣列 = %d ",array.length);      //講解陣列有幾個  3個
                }
            }
        System.out.println();
        
       //平均成績
       int count =0  ;
       double average =0 ,total=0 ;
       for (int i =0 ; i <array.length ;i++){
           
           for (int j=0;j<array[i].length;j++)
              {
               total += array[i][j] ;
               count ++;
               //System.out.printf("總數為%d",total);
              }
            }
       average = total / count;
       System.out.printf("(b)平均成績為 %.2f\n" , average );
       
       
       
       //求最高分
       int high_3 =0 , high_4 = 0  ;
       high_3 = array[0][0] ;
       
       for (int i =0 ; i<array.length;i++){
           for(int j=0;j<array[i].length;j++){
               
               high_4 = array[i][j];
               if (high_4 > high_3){
                   high_3 = high_4 ; 
               }
           }
       }
       
       //用最高分尋找與它一樣的數
       for(int i =0; i<array.length;i++){
       
           for (int j=0 ; j<array[i].length;j++){
               if (array[i][j] == high_3) {
                   System.out.printf("最高分者在[%d][%d]陣列\n", i ,j );
                   //System.out.printf("值等於%d %d", y , z);
               }
           }
       }
       
       
       
       
       
       //求最高分
       int high_1 =0 , high_2 = 0  ;
       high_1 = array[0][0] ;
       
       for (int i =0 ; i<array.length;i++){
           
           for(int j=0;j<array[i].length;j++){
               
               high_2 = array[i][j];
               if (high_2 > high_1){
                   high_1 = high_2 ; 
               }
           }
       }
       System.out.printf("(d)全班最高分為 %d\n", high_1);     
       
       
       //求最低分
       int low_1 =0 , low_2 = 0  ;
       low_1 = array[0][0] ;
       
       for (int i =0 ; i<array.length;i++){
           
           for(int j=0;j<array[i].length;j++){
               
               low_2 = array[i][j];
               if (low_2 < low_1){
                   low_1 = low_2 ; 
               }
           }
       }
       System.out.printf("(e)全班最低分為 %d\n", low_1);     
       
       
       //求及格人數
       int pass_1 =0 , pass_people = 0  ;
       
       for (int i =0 ; i<array.length;i++){
           for(int j=0;j<array[i].length;j++){
               
               pass_1 = array[i][j];
               if (pass_1>=60){
                   pass_people +=1;
                    
               }
           }
       }
       System.out.printf("(f)及格人數為 %d\n", pass_people);    
       
       
       
       //求不及格人數
       int non_pass_1 =0 , non_people = 0  ;
       
       for (int i =0 ; i<array.length;i++){
           for(int j=0;j<array[i].length;j++){
               non_pass_1 = array[i][j];
               if (non_pass_1 < 60){
                   non_people +=1;
               }
           }
       }
       System.out.printf("(g)不及格人數為 %d\n",non_people); 
       
       
       
       //求等第
       int A=0 , B=0 ,C=0, D=0 ,E=0;
       
       for (int i=0 ; i < array.length;i++){
           for(int j =0 ; j < array[i].length ;  j++){
                        switch (array[i][j] /10){
                          case 10:
                          case 9:
                                A+=1;
                                break;
                          case 8:
                                B+=1;
                                break;
                          case 7:
                                C+=1;
                                break;
                          case 6:
                                D+=1;
                                break;  
                          default:
                              E+=1;
                              break;
                          }
                     }
               }
       System.out.printf("(h)各等第人數為 A=%d B=%d C=%d D=%d E=%d\n", A,B,C,D,E);
       
       
       
       
    }
}
