package p04;
import java.util.Random;

public class RndGuiDemo extends javax.swing.JFrame {
    
    private int guess;
    private int count=0;          
    //如果不設定在全域變數，放在區域變數就不會累加
    private double ans;
    
    
    public RndGuiDemo() {
        initComponents();
    }
        

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {                                          
       //列印出題目
         
        int Rnd1 =0 ,  Rnd2 =0 , Rnd3=0   ;
        String msg="";
        Random rnd = new Random();
        Rnd1 =  (  1+rnd.nextInt(10)  );        //亂數值1~10
        Rnd2 =  (  1+rnd.nextInt(10)  );        //亂數值1~10
        Rnd3 =  ( rnd.nextInt(4)  ) ;               //亂數值0~3
        
        if (Rnd3==0 ) {
            ans = Rnd1+Rnd2;
            msg = String.format( "%s + %s =",Rnd1,Rnd2 );
        }else if(Rnd3==1){
            ans = Rnd1-Rnd2;
            msg = String.format( "%s - %s =",Rnd1,Rnd2 ) ;
        }else if(Rnd3==2){
            ans = Rnd1*Rnd2;
            msg = String.format( "%s * %s =",Rnd1,Rnd2 );
        }else {
            ans = Rnd1/Rnd2;
            msg = String.format( "%s / %s =",Rnd1,Rnd2 );
        }
        
         
         jLabelSubject.setText( msg  );
    }                                         

    private void jButtonCheckActionPerformed(java.awt.event.ActionEvent evt) {                                             
        //比較使用者輸入的數值是否有錯
        
        guess = Integer.parseInt(   jTextFieldInput.getText() ) ;   //把輸入的值轉數值存入  guess
        
        //這邊不需要用while  因為使用者每按一次按鈕就刷新一次  所以需要全域變數
        if( guess == ans    ){
             String msg="輸入正確!\n";
             jTextAreaDisplay.append(msg);
        }else if ( guess != ans ){
             count ++ ;
             String msg = String.format("猜錯%d次\n",count ) ;
             jTextAreaDisplay.append(msg);
        }
            
    }
