package vehicle_validate.models;

public class OTo extends PhuongTien{
    private int soGhe;
    private String kieuXe;

    public OTo(){

    }

    public OTo(String bienKiemSoat, String hangSanxuat, String chuSoHuu, int namSX, int soGhe, String kieuXe) {
        super(bienKiemSoat, hangSanxuat, chuSoHuu, namSX);
        this.soGhe = soGhe;
        this.kieuXe = kieuXe;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }
}
