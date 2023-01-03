package test;

import view.View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class test2 {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            JFrame jFrame=new JFrame("tees");
            jFrame.setDefaultCloseOperation(3);
            String[] columns={"cột 1", "cột 2", "cột 3"};
            String[][] data={{}};
            //JTable jTable=new JTable(data,columns);
            //jFrame.add(jTable);
            DefaultTableModel model=new DefaultTableModel(data, columns);
            JTable jTable=new JTable(model);
//            model.addColumn("Column");
//            model.addColumn("Column");
//            model.addColumn("Column");
//            model.addColumn("Column");
//            model.addColumn("Column");
            jFrame.add(jTable);
            model.addRow(new Object[]{
                    "1","2","3"
            });
            jFrame.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
