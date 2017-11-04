/**
 *
 * @author Louis
 */
//一維陣列的應用 - 計算成績
package HW1;
public class GradeBook {

    public static void display(int[] array) {
        System.out.println("(a)全班成績為" );
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
      
    }
    
    public static double average(int[] array) {
        
        double total = 0, average = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
            count++;
        }
        average = total / count;
        return average;
    }

    public static void topStudent(int[] array) {
        
        //取得陣列最中最高分
        int total1 = 0 ,total2=0 ;
        total1 = array[0];
        
        for (int i = 0; i < array.length; i++) {            
           total2 = array[i];
           if (total2 > total1){
               total1 = total2;    
           }   
        }
        
        
        //用最高分尋找與它一樣的數
        
        for (int i =0 ; i < array.length; i++){
            
            if (array[i]== total1){
                System.out.printf("最高分者在陣列 [%d]\n",i);
            }
        }
        
        
        
    }
    
    public static int  maximum(int[] array) {
        
        int total1 = 0 ,total2=0 ;
        total1 = array[0];
        
        for (int i = 0; i < array.length; i++) {            
            
           total2 = array[i];
           if (total2 > total1){
               total1 = total2; 
           }
           
        }
        return total1 ;
    }
    
    
    public static int minimum (int [] array)
    {
        int total1=0 , total2=0 ;
        total1 = array[0];
        for (int i =0 ; i < array.length ; i++){
            total2 = array[i] ;
            if   (total2 < total1 ){
                total1 = total2;
            }
            
        }
        return total1;
    }
    
    public  static int getPass(int [] array)
    {
        int pass =0 , total1=0 ; 
        for(int i=0; i<array.length ;i++)
        {
            total1 = array[i];
            if (total1 >=60)
            {
                pass +=1;
            }
        }
        return pass ;
    }
    
    
    public  static int getFailed(int [] array)
    {
        int nonpass =0 , total1=0 ; 
        for(int i=0; i<array.length ;i++)
        {
            total1 = array[i];
            if (total1 < 60)
            {
                nonpass +=1;
            }
        }
        return nonpass ;
    }
    
    
    public static void printGradeLevel (int [] array)
    {
        int A =0 , B=0, C=0, D=0, E=0  ; 
        for (int i =0; i < array.length ;i++ ){
            switch(array[i]/10){
                case 10:
                case 9:    
                    A +=1;
                    break;
                case 8:    
                    B +=1;
                    break;
                case 7:    
                    C +=1;
                    break;
                case 6:    
                    D +=1;
                    break;
                 default:
                     E +=1;
                     break;
            }
        }
        System.out.printf("(h)成績等第為 A =%d B =%d C =%d D =%d E =%d\n", A,B,C,D,E);
    }
    
    
    
    
    

    public static void main(String[] args) {

        int[] array = {50, 70, 100, 85, 65, 75, 55, 40, 30, 100};
        GradeBook.display(array);
        System.out.println();
        System.out.printf("(b)平均分 = " + GradeBook.average(array));
        System.out.println();
        GradeBook.topStudent(array) ;
        System.out.println("(d)最高分 = " + GradeBook.maximum(array)  );
        System.out.println("(e)最低分 = " +GradeBook.minimum(array));
        System.out.println("(f)及格人數 = " + GradeBook.getPass(array));
        System.out.println("(g)不及格人數 = " + GradeBook.getFailed(array) );
        GradeBook.printGradeLevel(array);
        
    }

}
