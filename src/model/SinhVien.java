package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class SinhVien implements Serializable {
    private String tenSinhVien;
    private TinhThanh tinhThanh;
    private Date ngaySinh;
    private float diem1, diem2, diem3;
    private boolean gioiTinh;
    private String maSinhVien;

    public SinhVien() {
        this.tenSinhVien = "";
        this.tinhThanh = new TinhThanh("", 0);
        this.ngaySinh = new Date();
        this.diem1 = 0;
        this.diem2 = 0;
        this.diem3 = 0;
        gioiTinh=true;
        this.maSinhVien="";
    }

    public SinhVien(String tenSinhVien, TinhThanh tinhThanh, Date ngaySinh, float diem1, float diem2, float diem3, boolean gioiTinh, String maSinhVien) {
        this.tenSinhVien = tenSinhVien;
        this.tinhThanh = tinhThanh;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.gioiTinh=gioiTinh;
        this.maSinhVien=maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public TinhThanh getTinhThanh() {
        return tinhThanh;
    }

    public void setTinhThanh(TinhThanh tinhThanh) {
        this.tinhThanh = tinhThanh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "tenSinhVien='" + tenSinhVien + '\'' +
                ", tinhThanh=" + tinhThanh +
                ", ngaySinh=" + ngaySinh +
                ", diem1=" + diem1 +
                ", diem2=" + diem2 +
                ", diem3=" + diem3 +
                ", gioiTinh=" + gioiTinh +
                ", maSinhVien='" + maSinhVien + '\'' +
                '}';
    }

}
