package case_study.models;

public class Customer extends Person{
    private String maKH, loaiKH, diaChi;

    public Customer(String hoTen, String ngaySinh, String gioiTinh, String soCMND, String dienThoai, String email, String maKH, String loaiKH, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, dienThoai, email);
        this.maKH = maKH;
        this.loaiKH = loaiKH;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
