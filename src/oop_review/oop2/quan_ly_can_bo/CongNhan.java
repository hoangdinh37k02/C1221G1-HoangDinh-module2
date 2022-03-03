package oop_review.oop2.quan_ly_can_bo;

public class CongNhan extends Canbo{
    private int bac;

    public CongNhan(String hoTen, int namSinh, String gioiTinh, String diaChi, int bac) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                '}'+super.toString();
    }
}
