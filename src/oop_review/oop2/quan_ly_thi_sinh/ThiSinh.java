package oop_review.oop2.quan_ly_thi_sinh;

public class ThiSinh {
    private int soBaoDanh;
    private String hoTen;
    private String diaChi;
    private double diemUuTien;

    public ThiSinh(){

    }

    public ThiSinh(int soBaoDanh, String hoTen, String diaChi, double diemUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.diemUuTien = diemUuTien;
    }

    public int getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(int soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getDiemUuTien() {
        return diemUuTien;
    }

    public void setDiemUuTien(double diemUuTien) {
        this.diemUuTien = diemUuTien;
    }

    @Override
    public String toString() {
        return
                "soBaoDanh=" + soBaoDanh +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", diemUuTien=" + diemUuTien;
    }
}
