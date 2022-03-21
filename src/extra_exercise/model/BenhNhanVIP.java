package extra_exercise.model;

public class BenhNhanVIP extends BenhNhan{
    private String loaiVIP, thoiHan;

    public BenhNhanVIP(int soThuTu, String maBenhAn, String tenBenhNhan, String ngayNhapvien,
                       String ngayXuatvien, String lydo, String loaiVIP, String thoiHan) {
        super(soThuTu, maBenhAn, tenBenhNhan, ngayNhapvien, ngayXuatvien, lydo);
        this.loaiVIP = loaiVIP;
        this.thoiHan = thoiHan;
    }

    public String getLoaiVIP() {
        return loaiVIP;
    }

    public void setLoaiVIP(String loaiVIP) {
        this.loaiVIP = loaiVIP;
    }

    public String getThoiHan() {
        return thoiHan;
    }

    public void setThoiHan(String thoiHan) {
        this.thoiHan = thoiHan;
    }

    @Override
    public String toString() {
        return super.toString() +
                "loaiVIP='" + loaiVIP + '\'' +
                ", thoiHan='" + thoiHan + '\'';
    }
//    int soThuTu, String maBenhAn, String tenBenhNhan, String ngayNhapvien,
//                       String ngayXuatvien, String lydo, String loaiVIP, String thoiHan
    public String getInFoToCSV(){
        return this.getSoThuTu()+","+this.getMaBenhAn()+","+this.getTenBenhNhan()
                +","+this.getNgayNhapvien()+","+this.getNgayXuatvien()+","+this.getLydo()
                +","+this.getLoaiVIP()+","+this.getThoiHan();
    }
}
