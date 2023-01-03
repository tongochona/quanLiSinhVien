package test;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class test3 {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            JFrame jFrame=new JFrame("tees");
            String[] columns={"cột 1", "cột 2", "cột 3"};
            String[][] data={{}};
            //JTable table=new JTable(data, columns);
            JTable table=new JTable(0,3);
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3"});
            jFrame.add(table);
            jFrame.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
