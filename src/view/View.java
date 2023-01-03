package view;

import controller.Controller;
import model.DanhSachSv;
import model.SinhVien;
import model.TinhThanh;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class View extends JFrame {
    private final JFileChooser jFileChooser;
    private JButton jButtonHuy;
    private DanhSachSv danhSachSv;
    private JMenuBar jMenuBar;
    private JMenu jMenuFile;
    private JMenu jMenuAbuot;
    private JMenuItem jMenuItemOpen;
    private JMenuItem jMenuItemSave;
    private JMenuItem jMenuItemExit;
    private JMenuItem jMenuItemAbout;
    private JButton jButtonTimKiem;


    private JTextField jTextFieldTen;
    private JTextField jTextFieldMaSinhVien;
    private JTable jTable;
    private JLabel jLabelTen;
    private JLabel jLabelTinhThanh;
    private JComboBox<String> jComboBoxTinhThanhTimKiem;
    private JComboBox<String> jComboBoxTinhThanh2;

    private JLabel jLabelNgaySinh;
    private JTextField jTextFieldNgaySinh;
    private JLabel jLabelGioiTinh;
    private JRadioButton jRadioButtonMale;
    private JRadioButton jRadioButtonFemale;
    private ButtonGroup buttonGroupGioiTinh;
    private JLabel jLabelDiem1;
    private JTextField jTextFieldDiem1;
    private JTextField jTextFieldDiem2;
    private JLabel jLabelDiem2;
    private JTextField jTextFieldDiem3;
    private JLabel jLabelDiem3;
    private JPanel jPanelTimKiem;
    private JScrollPane jScrollPane;
    //private JPanel jPanelBang;
    private JPanel jPanelThongTin;
    private JPanel jPanelYeuCau;
    private JPanel jPanelCenter;
    private JButton jButtonThem;
    private JButton jButtonCapNhat;
    private JButton jButtonLuu;
    private JButton jButtonCancel;
    private JButton jButtonXoa;
    private File file;

    public View(){
        this.setTitle("Quản lí sinh viên");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        Controller controller=new Controller(this);
        danhSachSv=new DanhSachSv();
        jFileChooser=new JFileChooser();

        Font font =new Font("Arial",Font.BOLD,14);
        Font font2 =new Font("Arial",Font.PLAIN,13);

        String[] columnName={"Mã sinh viên" ,"Họ và tên","Tỉnh thành","Ngày sinh", "Giới tính", "Điểm 1", "Điểm 2", "Điểm 3"};
        String[][] data= {};
        jTable=new JTable();
        jTable.setModel(new DefaultTableModel(data,columnName));
        //jTable= new JTable();
        jTable.setBounds(30, 40, 200, 300);;
        jTable.setFont(font2);
        //jScrollPane.add(jTable);

        jPanelTimKiem=new JPanel(new GridLayout(1,6));
        Border blacklineTimKiem = BorderFactory.createTitledBorder("Tìm kiếm");
        jPanelTimKiem.setBorder(blacklineTimKiem);
        jScrollPane=new JScrollPane(jTable);
        //jPanelBang=new JPanel(new BorderLayout());
        Border blacklineBang = BorderFactory.createTitledBorder("Thông tin sinh viên");
        jScrollPane.setBorder(blacklineBang);
        jPanelThongTin=new JPanel(new GridLayout(4,4,0,30));
        Border blacklineThongTin = BorderFactory.createTitledBorder("");
        jPanelThongTin.setBorder(blacklineThongTin);
        jPanelYeuCau=new JPanel(new FlowLayout());
        Border blacklineTuyChon = BorderFactory.createTitledBorder("Tuỳ chọn");
        jPanelYeuCau.setBorder(blacklineTuyChon);
        jPanelCenter=new JPanel(new GridLayout(2,1));

        this.setLayout(new BorderLayout());
        this.add(jPanelTimKiem, BorderLayout.NORTH);
        this.add(jPanelCenter, BorderLayout.CENTER);
        this.add(jPanelYeuCau, BorderLayout.SOUTH);
        jPanelCenter.add(jScrollPane,BorderLayout.NORTH);
        jPanelCenter.add(jPanelThongTin,BorderLayout.SOUTH);


        jMenuBar=new JMenuBar();
        jMenuFile=new JMenu("File");
        jMenuAbuot=new JMenu("About");
        jMenuItemOpen=new JMenuItem("Open");
        jMenuItemOpen.addActionListener(controller);
        jMenuItemSave=new JMenuItem("Save");
        jMenuItemSave.addActionListener(controller);
        jMenuItemExit=new JMenuItem("Exit");
        jMenuItemExit.addActionListener(controller);
        jMenuItemAbout =new JMenuItem("About me");
        jMenuItemAbout.addActionListener(controller);
        this.setJMenuBar(jMenuBar);
        jMenuBar.add(jMenuFile);
        jMenuBar.add(jMenuAbuot);
        jMenuFile.add(jMenuItemOpen);
        jMenuFile.add(jMenuItemSave);
        jMenuFile.addSeparator();
        jMenuFile.add(jMenuItemExit);
        jMenuAbuot.add(jMenuItemAbout);


        jComboBoxTinhThanhTimKiem =new JComboBox<String>(TinhThanh.tenTinh());
        jComboBoxTinhThanhTimKiem.setFont(font);
        jLabelTinhThanh=new JLabel("Tỉnh thành", JLabel.CENTER);
        jLabelTinhThanh.setFont(font);
        jButtonTimKiem=new JButton("Tìm Kiếm");
        jButtonTimKiem.addActionListener(controller);
        jButtonTimKiem.setFont(font);
        jButtonHuy = new JButton("Huỷ");
        jButtonHuy.addActionListener(controller);
        jButtonHuy.setFont(font);
        jPanelTimKiem.add(new JLabel("Tỉnh thành", JLabel.CENTER));
        jPanelTimKiem.add(jComboBoxTinhThanhTimKiem);
        jTextFieldMaSinhVien=new JTextField();
        jTextFieldMaSinhVien.setFont(font);
        jPanelTimKiem.add(new JLabel("Mã sinh viên",JLabel.CENTER));
        jPanelTimKiem.add(jTextFieldMaSinhVien);
        jPanelTimKiem.add(jButtonTimKiem);
        jPanelTimKiem.add(jButtonHuy);



        jLabelTen=new JLabel("Họ và Tên", JLabel.CENTER);
        jLabelTen.setFont(font);
        jTextFieldTen=new JTextField();
        jTextFieldTen.setFont(font2);
        jComboBoxTinhThanh2=new JComboBox<String>(TinhThanh.tenTinh());
        jComboBoxTinhThanh2.setFont(font);
        jLabelNgaySinh=new JLabel("Ngày sinh", JLabel.CENTER);
        jLabelNgaySinh.setFont(font);
        jTextFieldNgaySinh=new JTextField();
        jTextFieldNgaySinh.setFont(font2);
        jLabelGioiTinh =new JLabel("Giới tính", JLabel.CENTER);
        jLabelGioiTinh.setFont(font);
        jRadioButtonMale=new JRadioButton("Nam");
        jRadioButtonFemale=new JRadioButton("Nữ");
        buttonGroupGioiTinh=new ButtonGroup();
        buttonGroupGioiTinh.add(jRadioButtonMale);
        buttonGroupGioiTinh.add(jRadioButtonFemale);
        jLabelDiem1=new JLabel("Điểm 1", JLabel.CENTER);
        jLabelDiem1.setFont(font);
        jLabelDiem2=new JLabel("Điểm 2", JLabel.CENTER);
        jLabelDiem2.setFont(font);
        jLabelDiem3=new JLabel("Điểm 3", JLabel.CENTER);
        jLabelDiem3.setFont(font);
        jTextFieldDiem1=new JTextField();
        jTextFieldDiem1.setFont(font2);
        jTextFieldDiem2=new JTextField();
        jTextFieldDiem2.setFont(font2);
        jTextFieldDiem3=new JTextField();
        jTextFieldDiem3.setFont(font2);
        JPanel jPanelGioiTinh =new JPanel(new GridLayout(1,2));
        jPanelGioiTinh.add(jRadioButtonMale);
        jPanelGioiTinh.add(jRadioButtonFemale);
        jPanelGioiTinh.setFont(font);
        JLabel jLabelMaSinhVien=new JLabel("Mã sinh viên",JLabel.CENTER);
        jLabelMaSinhVien.setFont(font);
        jPanelThongTin.add(jLabelMaSinhVien);
        jPanelThongTin.add(jTextFieldMaSinhVien);
        jPanelThongTin.add(jLabelTen);
        jPanelThongTin.add(jTextFieldTen);
        jPanelThongTin.add(jLabelNgaySinh);
        jPanelThongTin.add(jTextFieldNgaySinh);
        jPanelThongTin.add(jLabelTinhThanh);
        jPanelThongTin.add(jComboBoxTinhThanh2);
        jPanelThongTin.add(jLabelGioiTinh);
        jPanelThongTin.add(jPanelGioiTinh);
        jPanelThongTin.add(jLabelDiem1);
        jPanelThongTin.add(jTextFieldDiem1);
        jPanelThongTin.add(jLabelDiem2);
        jPanelThongTin.add(jTextFieldDiem2);
        jPanelThongTin.add(jLabelDiem3);
        jPanelThongTin.add(jTextFieldDiem3);

        jButtonThem=new JButton("Thêm");
        jButtonThem.setFont(font);
        jButtonThem.addActionListener(controller);
        jButtonCapNhat=new JButton("Cập nhật");
        jButtonCapNhat.setFont(font);
        jButtonCapNhat.addActionListener(controller);
        jButtonXoa=new JButton("Xoá");
        jButtonXoa.setFont(font);
        jButtonXoa.addActionListener(controller);
        jButtonLuu=new JButton("Lưu");
        jButtonLuu.setFont(font);
        jButtonLuu.addActionListener(controller);
        jButtonCancel=new JButton("Huỷ bỏ");
        jButtonCancel.setFont(font);
        jPanelYeuCau.add(jButtonThem);
        jPanelYeuCau.add(jButtonCapNhat);
        jPanelYeuCau.add(jButtonXoa);
        jPanelYeuCau.add(jButtonLuu);
        jPanelYeuCau.add(jButtonCancel);

        this.setVisible(true);
    }
    public void buttonThem(){
        jTextFieldMaSinhVien.setText("");
        jTextFieldTen.setText("");
        jTextFieldNgaySinh.setText("");
        jComboBoxTinhThanh2.setSelectedItem("");
        buttonGroupGioiTinh.clearSelection();
        jTextFieldDiem1.setText("");
        jTextFieldDiem2.setText("");
        jTextFieldDiem3.setText("");
    }
    public void buttonLuu(){
        SinhVien sv=new SinhVien();
        sv.setMaSinhVien(jTextFieldMaSinhVien.getText());
        sv.setTenSinhVien(jTextFieldTen.getText());
        Date date=new Date(jTextFieldNgaySinh.getText());
        sv.setNgaySinh(date);
        int maTinh=jComboBoxTinhThanh2.getSelectedIndex();
        TinhThanh tinh =TinhThanh.getTinhTheoId(maTinh-1);
        sv.setTinhThanh(tinh);
        String gioiTinh;
        if(jRadioButtonMale.isSelected()){
            gioiTinh="Nam";
        }else gioiTinh="Nữ";
        if(gioiTinh.equals("Nam")){
            sv.setGioiTinh(true);
        }else sv.setGioiTinh(false);
        sv.setDiem1(Float.valueOf(jTextFieldDiem1.getText()));
        sv.setDiem2(Float.valueOf(jTextFieldDiem2.getText()));
        sv.setDiem3(Float.valueOf(jTextFieldDiem3.getText()));
        danhSachSv.themSinhVien(sv);
        hienThiSinhVien(sv);

    }
    public void buttonCapNhat(){
        DefaultTableModel modelTable = (DefaultTableModel) jTable.getModel();
        int iRow=jTable.getSelectedRow();
        try {
            String maSinhVien=String.valueOf(jTable.getValueAt(iRow,0));
            SinhVien sv=danhSachSv.timSinhVienTheoId(maSinhVien);
            jTextFieldMaSinhVien.setText(sv.getMaSinhVien());
            jTextFieldTen.setText(sv.getTenSinhVien());
            jTextFieldNgaySinh.setText(sv.getNgaySinh().getDate()+"/"+(sv.getNgaySinh().getMonth()+1)+"/"+(sv.getNgaySinh().getYear()+1900));
            jComboBoxTinhThanh2.setSelectedItem(sv.getTinhThanh().getTenTinh());
            if(sv.isGioiTinh()){
                jRadioButtonMale.doClick();
            }else jRadioButtonFemale.doClick();
            jTextFieldDiem1.setText(sv.getDiem1()+"");
            jTextFieldDiem2.setText(sv.getDiem2()+"");
            jTextFieldDiem3.setText(sv.getDiem3()+"");
            modelTable.removeRow(iRow);
            danhSachSv.xoaSinhVien(sv);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,
                    "Vui lòng chọn sinh viên muốn xoá",
                    "Thông báo",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    public void hienThiSinhVien(SinhVien sv){
        DefaultTableModel modelTable = (DefaultTableModel) jTable.getModel();
        modelTable.addRow(new Object[]{
                sv.getMaSinhVien()+"",
                sv.getTenSinhVien()+"",
                sv.getTinhThanh().getTenTinh()+"",
                sv.getNgaySinh().getDate()+"/"+(sv.getNgaySinh().getMonth()+1)+"/"+(sv.getNgaySinh().getYear()+1900)+"",
                (sv.isGioiTinh()?"Nam":"Nữ")+"",
                sv.getDiem1()+"",
                sv.getDiem2()+"",
                sv.getDiem3()+"",
        });
    }
    public void buttonXoa(){
        DefaultTableModel modelTable = (DefaultTableModel) jTable.getModel();
        int iRow=jTable.getSelectedRow();
        try {
            String maSinhVien=String.valueOf(jTable.getValueAt(iRow,0));
            SinhVien sv=danhSachSv.timSinhVienTheoId(maSinhVien);
            danhSachSv.xoaSinhVien(sv);
            modelTable.removeRow(iRow);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,
                    "Vui lòng chọn sinh viên muốn cập nhật",
                    "Thông báo",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void jMenuItemAbout() {
        JOptionPane.showMessageDialog(this, "Phần mền quản lí tân sinh viên","About me", JOptionPane.INFORMATION_MESSAGE);
    }

    public void jMenuItemSave() {
        if(file==null){
            jFileChooser.showOpenDialog(this);
            file=jFileChooser.getSelectedFile();
        }
        try{
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(danhSachSv);
            oos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void jMenuItemExit(){
        int sc= JOptionPane.showConfirmDialog(this,"Bạn muốn thoat chương trình", "Exit",JOptionPane.YES_NO_OPTION);
        if(sc==JOptionPane.YES_OPTION){
            System.exit(1);
        }

    }
    public void jMenuItemOpen() {
        jFileChooser.showOpenDialog(this);
        file=jFileChooser.getSelectedFile();
        try{
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            this.danhSachSv=(DanhSachSv) ois.readObject();
            ois.close();
            this.xoaBang();
            for (SinhVien sv:danhSachSv.getDssv()) {
                hienThiSinhVien(sv);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void jButtonTimKiem() {
        int sc=jComboBoxTinhThanhTimKiem.getSelectedIndex()-1;
        ArrayList<SinhVien> ddsv=new ArrayList<SinhVien>();
        if(sc>=0){
            for (SinhVien sinhVien: danhSachSv.getDssv()) {
                if(sc==sinhVien.getTinhThanh().getMaTinh()){
                    ddsv.add(sinhVien);
                }
            }
        }
         this.xoaBang();
        for (SinhVien sv:ddsv
             ) {
            this.hienThiSinhVien(sv);
        }

    }

    public void jButtonHuy() {
        this.xoaBang();
        for (SinhVien sv: danhSachSv.getDssv()) {
            this.hienThiSinhVien(sv);
        }
    }
    public void xoaBang(){
        DefaultTableModel modelTable = (DefaultTableModel) jTable.getModel();
        int iRowCount= modelTable.getRowCount();
        for(int i=iRowCount; i>0; i--){
            modelTable.removeRow(i-1);
        }
    }
}
