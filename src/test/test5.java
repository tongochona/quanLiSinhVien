package test;

import javax.swing.*;
import java.awt.*;

public class test5 extends JFrame {
    public test5 (){
        this.setTitle("Quản lí sinh viên");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);


        JLabel jLabel=new JLabel("test");
        jLabel.setBounds(20,20, 20, 20);
        this.add(jLabel);
        this.setVisible(true);
    }
    public static void main(String[] args) {

        new test5();
    }
}
