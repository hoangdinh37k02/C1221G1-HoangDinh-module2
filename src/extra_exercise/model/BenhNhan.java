package extra_exercise.model;

public abstract class BenhNhan {
    private int SoThuTu;
    private String MaBenhAn;
    private String TenBenhNhan;
    private String NgayNhapvien;
    private String NgayXuatvien;
    private String Lydo;

    public BenhNhan(){}

    public BenhNhan(int soThuTu, String maBenhAn, String tenBenhNhan,
                    String ngayNhapvien, String ngayXuatvien, String lydo) {
        SoThuTu = soThuTu;
        MaBenhAn = maBenhAn;
        TenBenhNhan = tenBenhNhan;
        NgayNhapvien = ngayNhapvien;
        NgayXuatvien = ngayXuatvien;
        Lydo = lydo;
    }

    public int getSoThuTu() {
        return SoThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        SoThuTu = soThuTu;
    }

    public String getMaBenhAn() {
        return MaBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        MaBenhAn = maBenhAn;
    }

    public String getTenBenhNhan() {
        return TenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        TenBenhNhan = tenBenhNhan;
    }

    public String getNgayNhapvien() {
        return NgayNhapvien;
    }

    public void setNgayNhapvien(String ngayNhapvien) {
        NgayNhapvien = ngayNhapvien;
    }

    public String getNgayXuatvien() {
        return NgayXuatvien;
    }

    public void setNgayXuatvien(String ngayXuatvien) {
        NgayXuatvien = ngayXuatvien;
    }

    public String getLydo() {
        return Lydo;
    }

    public void setLydo(String lydo) {
        Lydo = lydo;
    }

    @Override
    public String toString() {
        return
                "SoThuTu=" + SoThuTu +
                ", MaBenhAn='" + MaBenhAn + '\'' +
                ", TenBenhNhan='" + TenBenhNhan + '\'' +
                ", NgayNhapvien='" + NgayNhapvien + '\'' +
                ", NgayXuatvien='" + NgayXuatvien + '\'' +
                ", Lydo='" + Lydo + '\'';
    }
}
