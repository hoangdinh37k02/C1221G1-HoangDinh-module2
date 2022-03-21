package extra_exercise.model;

import java.util.ArrayList;
import java.util.List;

public class BenhNhanThuong extends BenhNhan{
    private double VienPhi;


    public BenhNhanThuong(int soThuTu, String maBenhAn, String tenBenhNhan,
                          String ngayNhapvien, String ngayXuatvien, String lydo, double vienPhi) {
        super(soThuTu, maBenhAn, tenBenhNhan, ngayNhapvien, ngayXuatvien, lydo);
        VienPhi = vienPhi;
    }

    public double getVienPhi() {
        return VienPhi;
    }

    public void setVienPhi(double vienPhi) {
        VienPhi = vienPhi;
    }

    @Override
    public String toString() {
        return super.toString() +
                "VienPhi=" + VienPhi;
    }

    public String getInFoToCSV(){
        return this.getSoThuTu()+","+this.getMaBenhAn()+","+this.getTenBenhNhan()
                +","+this.getNgayNhapvien()+","+this.getNgayXuatvien()+","+this.getLydo()
                +","+this.getVienPhi();
    }
}
