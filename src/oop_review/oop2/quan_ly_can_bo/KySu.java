package oop_review.oop2.quan_ly_can_bo;

public class KySu extends Canbo{
    private String nganhDaotao;

    public KySu(String hoTen, int namSinh, String gioiTinh, String diaChi, String nganhDaotao) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.nganhDaotao = nganhDaotao;
    }

    public String getNganhDaotao() {
        return nganhDaotao;
    }

    public void setNganhDaotao(String nganhDaotao) {
        this.nganhDaotao = nganhDaotao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "nganhDaotao='" + nganhDaotao + '\'' +
                '}'+super.toString();
    }
}
