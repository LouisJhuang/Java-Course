/**
 *
 * @author Louis
 */
//for迴圈列印聖誕樹

package week5_HW;
public class HW_1_tree {
    
    public static void main(String[] args) {
        
        //三角形部分
         for (int i = 0; i < 13; i++) {
            for (int j = 13; j > i; j--) {
                System.out.printf(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.printf("＊");
            }
            System.out.println();
        }
         
         
         //梯形部分        
         for (int i = 5; i < 10; i++) {              
            for (int j = 10; j > i; j--) {
                
                System.out.printf(" ");
            }
            for (int k = -4; k < i; k++) {
                if(i>=5)
                System.out.printf("＊"); 
            }
            System.out.println();
        }
                  
         //梯形部分
         for (int i = 5; i < 10; i++) {              
            for (int j = 10; j > i; j--) {
                
                System.out.printf(" ");
            }
            for (int k = -4; k < i; k++) {
                if(i>=5)
                System.out.printf("＊"); 
            }
            System.out.println();
        }
        //樹幹部分
         for (int x=0 ; x<=4 ;x++)
         {            
             for(int y =1 ; y <12 ;y++)
             {
                 System.out.printf(" ");
             }
             for(int y =1 ; y <4 ;y++)
             {
                 System.out.printf("＊");
             }
             System.out.println();
         }
        
         System.out.println();
            
         
           /*梯形部分
          for (int i = 0; i < 10; i++) {              
            for (int j = 10; j > i; j--) {
                if(i>=5)
                System.out.printf(" ");
            }
            for (int k = 0; k < i; k++) {
                if(i>=5)
                System.out.printf("＊"); 
            }
            System.out.println();
        }
        */
    
          /*樹幹的部分
         for (int x=0 ; x<=4 ;x++)
         {            
             for(int y =1 ; y <8 ;y++)
             {
                 System.out.printf(" ");
             }
             for(int y =1 ; y <4 ;y++)
             {
                 System.out.printf("＊");
             }
             System.out.println();
         }
        
         System.out.println();
          */ 
         
         
        
    }
    
}
