package case_study.models;

public class Employee extends Person{
    private String maNV, trinhDo, viTri, luong;

    public Employee(String hoTen, String ngaySinh, String gioiTinh, String soCMND, String dienThoai, String email, String maNV, String trinhDo, String viTri, String luong) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, dienThoai, email);
        this.maNV = maNV;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }
}
