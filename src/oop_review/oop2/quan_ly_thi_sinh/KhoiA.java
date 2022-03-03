package oop_review.oop2.quan_ly_thi_sinh;

public class KhoiA extends ThiSinh{
    private String monThi = "Toán, Lý, Hóa";

    public KhoiA(int soBaoDanh, String hoTen, String diaChi, double diemUuTien) {
        super(soBaoDanh, hoTen, diaChi, diemUuTien);
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
