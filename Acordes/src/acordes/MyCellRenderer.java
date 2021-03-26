/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acordes;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Juan
 */

    public class MyCellRenderer extends DefaultTableCellRenderer {

   @Override 
   


   public Component getTableCellRendererComponent(JTable table,
      Object value,
      boolean isSelected,
      boolean hasFocus,
      int row,
      int column)
   {
       
      super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);
      if (value=="DO"||value=="DO#/REb") {
         this.setOpaque(true);
         this.setBackground(Color.RED);

      }else if(value=="RE"||value=="RE#/MIb"){
       this.setBackground(Color.ORANGE);
      } else if(value=="MI"||value=="FA"){
          this.setBackground(Color.LIGHT_GRAY);
      } else if(value=="SOL"||value=="SOL#/LAb"){
          this.setBackground(Color.GREEN);
      }else if(value=="LA#/SIb"||value=="SI"){
          this.setBackground(Color.YELLOW);
      }else if(value=="LA"||value=="FA#/SOLb"){
          this.setBackground(Color.PINK);
      } else{
       this.setBackground(Color.WHITE);
   }
      
    
       

      return this;
   }}

    

