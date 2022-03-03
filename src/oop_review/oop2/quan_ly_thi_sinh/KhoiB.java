package oop_review.oop2.quan_ly_thi_sinh;

public class KhoiB extends ThiSinh{
    private String monThi = "Toán, Hóa, Sinh";

    public KhoiB(int soBaoDanh, String hoTen, String diaChi, double diemUuTien, String monThi) {
        super(soBaoDanh, hoTen, diaChi, diemUuTien);
        this.monThi = monThi;
    }

    public String getMonThi() {
        return monThi;
    }

    public void setMonThi(String monThi) {
        this.monThi = monThi;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", monThi='" + monThi;
    }
}
