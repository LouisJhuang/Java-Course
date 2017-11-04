/**
 *
 * @author louisJhuang
 */
 //滑鼠監聽事件

import java.awt.Color;

public class mouse001 extends javax.swing.JFrame {

    public mouse001() {
        initComponents();
    }


    private void jPanelPaintMouseClicked(java.awt.event.MouseEvent evt) {                                         
        jLabelPos.setText(String.format("clocked at [%d, %d]", evt.getX(), evt.getY()));
    }                                        

    private void jPanelPaintMouseEntered(java.awt.event.MouseEvent evt) {                                         
        jPanelPaint.setBackground(Color.red);
        jLabelPos.setText("mouse entered");
    }                                        
   
    private void jPanelPaintMouseExited(java.awt.event.MouseEvent evt) {                                        
        jPanelPaint.setBackground(Color.blue);
        jLabelPos.setText("mouse exited");
    }                                       

    private void jPanelPaintMouseDragged(java.awt.event.MouseEvent evt) {                                         
         jLabelPos.setText(String.format("moved at [%d,%d]", evt.getX(), evt.getY()));
    }                                        

    private void jPanelPaintMouseMoved(java.awt.event.MouseEvent evt) {                                       
         jLabelPos.setText(String.format("moved at[%d,%d]", evt.getX(), evt.getY()));
    }
    
}
