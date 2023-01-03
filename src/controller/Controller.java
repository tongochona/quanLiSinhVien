package controller;

import view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private View view;
    public Controller(View view){
        this.view=view;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String sc =e.getActionCommand();
        if(sc.equals("Thêm")){
            view.buttonThem();
        }else if(sc.equals("Lưu")){
            view.buttonLuu();
        }else if(sc.equals("Cập nhật")){
            view.buttonCapNhat();
        }else if(sc.equals("Xoá")){
            view.buttonXoa();
        }else if(sc.equals("About me")){
            view.jMenuItemAbout();
        }else if(sc.equals("Exit")){
            view.jMenuItemExit();
        }else if(sc.equals("Open")){
            view.jMenuItemOpen();
        }else if(sc.equals("Save")){
            view.jMenuItemSave();
        }else if(sc.equals("Tìm Kiếm")){
            view.jButtonTimKiem();
        }
        else if(sc.equals("Huỷ")){
            view.jButtonHuy();
        }
    }
}
