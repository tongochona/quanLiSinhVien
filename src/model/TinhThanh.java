package model;

import java.io.Serializable;
import java.util.ArrayList;

public class TinhThanh implements Serializable {
    private String tenTinh;
    private int maTinh;

    public TinhThanh(String tenTinh, int maTinh) {
        this.tenTinh = tenTinh;
        this.maTinh = maTinh;
    }

    public String getTenTinh() {
        return tenTinh;
    }

    public void setTenTinh(String tenTinh) {
        this.tenTinh = tenTinh;
    }

    public int getMaTinh() {
        return maTinh;
    }

    public void setMaTinh(int maTinh) {
        this.maTinh = maTinh;
    }

    @Override
    public String toString() {
        return "TinhThanh{" +
                "tenTinh='" + tenTinh + '\'' +
                ", maTinh=" + maTinh +
                '}';
    }
    public static String[] tenTinh(){
        String[] tenTinh=
                {       "",
                        "An Giang",
                        "Bà Rịa – Vũng Tàu",
                        "Bạc Liêu",
                        "Bắc Giang",
                        "Bắc Kạn",
                        "Bắc Ninh",
                        "Bến Tre",
                        "Bình Dương",
                        "Bình Định",
                        "Bình Phước",
                        "Bình Thuận",
                        "Cà Mau",
                        "Cao Bằng",
                        "Cần Thơ",
                        "Đà Nẵng",
                        "Đắk Lắk",
                        "Đắk Nông",
                        "Điện Biên",
                        "Đồng Nai",
                        "Đồng Tháp",
                        "Gia Lai",
                        "Hà Giang",
                        "Hà Nam",
                        "Hà Nội",
                        "Hà Tĩnh",
                        "Hải Dương",
                        "Hải Phòng",
                        "Hậu Giang",
                        "Hòa Bình",
                        "Hưng Yên",
                        "Khánh Hòa",
                        "Kiên Giang",
                        "Kon Tum",
                        "Lai Châu",
                        "Lạng Sơn",
                        "Lào Cai",
                        "Lâm Đồng",
                        "Long An",
                        "Nam Định",
                        "Nghệ An",
                        "Ninh Bình",
                        "Ninh Thuận",
                        "Phú Thọ",
                        "Phú Yên",
                        "Quảng Bình",
                        "Quảng Nam",
                        "Quảng Ngãi",
                        "Quảng Ninh",
                        "Quảng Trị",
                        "Sóc Trăng",
                        "Sơn La",
                        "Tây Ninh",
                        "Thái Bình",
                        "Thái Nguyên",
                        "Thanh Hóa",
                        "Thành phố Hồ Chí Minh",
                        "Thừa Thiên Huế",
                        "Tiền Giang",
                        "Trà Vinh",
                        "Tuyên Quang",
                        "Vĩnh Long",
                        "Vĩnh Phúc",
                        "Yên Bái"
                };

        return tenTinh;
    }
    public static ArrayList<TinhThanh> getTinh(){

        String[] tenTinh=
                       {"An Giang",
                        "Bà Rịa – Vũng Tàu",
                        "Bạc Liêu",
                        "Bắc Giang",
                        "Bắc Kạn",
                        "Bắc Ninh",
                        "Bến Tre",
                        "Bình Dương",
                        "Bình Định",
                        "Bình Phước",
                        "Bình Thuận",
                        "Cà Mau",
                        "Cao Bằng",
                        "Cần Thơ",
                        "Đà Nẵng",
                        "Đắk Lắk",
                        "Đắk Nông",
                        "Điện Biên",
                        "Đồng Nai",
                        "Đồng Tháp",
                        "Gia Lai",
                        "Hà Giang",
                        "Hà Nam",
                        "Hà Nội",
                        "Hà Tĩnh",
                        "Hải Dương",
                        "Hải Phòng",
                        "Hậu Giang",
                        "Hòa Bình",
                        "Hưng Yên",
                        "Khánh Hòa",
                        "Kiên Giang",
                        "Kon Tum",
                        "Lai Châu",
                        "Lạng Sơn",
                        "Lào Cai",
                        "Lâm Đồng",
                        "Long An",
                        "Nam Định",
                        "Nghệ An",
                        "Ninh Bình",
                        "Ninh Thuận",
                        "Phú Thọ",
                        "Phú Yên",
                        "Quảng Bình",
                        "Quảng Nam",
                        "Quảng Ngãi",
                        "Quảng Ninh",
                        "Quảng Trị",
                        "Sóc Trăng",
                        "Sơn La",
                        "Tây Ninh",
                        "Thái Bình",
                        "Thái Nguyên",
                        "Thanh Hóa",
                        "Thành phố Hồ Chí Minh",
                        "Thừa Thiên Huế",
                        "Tiền Giang",
                        "Trà Vinh",
                        "Tuyên Quang",
                        "Vĩnh Long",
                        "Vĩnh Phúc",
                        "Yên Bái"
                };
        ArrayList<TinhThanh> arrayList=new ArrayList<TinhThanh>();
        int i=0;
        for (String ten :
                tenTinh) {
            TinhThanh tinh = new TinhThanh(ten,i++);
            arrayList.add(tinh);
        }
        return arrayList;
    }
    public static TinhThanh getTinhTheoId(int maTinh){
        for(int i=0; i< getTinh().size(); i++){
            if(i==maTinh) return getTinh().get(i);
        }
        return null;
    }
}
