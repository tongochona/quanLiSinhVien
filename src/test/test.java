package test;

import view.View;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new View();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
