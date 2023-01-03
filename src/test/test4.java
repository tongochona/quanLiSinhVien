package test;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class test4 {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("tees");
        jFrame.setDefaultCloseOperation(3);
        JTable table=new JTable(2,5);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
//        model.addColumn("Column");
//        model.addColumn("Column");
//        model.addColumn("Column");
//        model.addColumn("Column");
//        model.addColumn("Column");
        model.addRow(new Object[]{"Column 1", "Column 2", "Column 3","Column 4","Column 5"});
        jFrame.add(table);
        jFrame.setVisible(true);
    }
}
