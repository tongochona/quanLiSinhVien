package model;

import java.io.Serializable;
import java.util.ArrayList;

public class DanhSachSv implements Serializable {
    private ArrayList<SinhVien> dssv;
    public DanhSachSv(){
        dssv=new ArrayList<SinhVien>();
    }
    public void themSinhVien(SinhVien sv){
        dssv.add(sv);
    }
    public void xoaSinhVien(SinhVien sv){
        dssv.remove(sv);
    }

    public ArrayList<SinhVien> getDssv() {
        return dssv;
    }
    public SinhVien timSinhVienTheoId(String maSinhVien){
        for(SinhVien sv:dssv){
            if(sv.getMaSinhVien().equals(maSinhVien)){
                return sv;
            }
        }
        return null;
    }
}
