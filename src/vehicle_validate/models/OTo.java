package vehicle_validate.models;

public class OTo extends PhuongTien{
    private String kieuXe, soGhe;

    public OTo(){

    }

    public OTo(String bienKiemSoat, String hangSanxuat, String chuSoHuu, String namSX, String soGhe, String kieuXe) {
        super(bienKiemSoat, hangSanxuat, chuSoHuu, namSX);
        this.soGhe = soGhe;
        this.kieuXe = kieuXe;
    }

    public String getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(String soGhe) {
        this.soGhe = soGhe;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    public String getBaseInfo(){
        return super.getBienKiemSoat()+","+this.getHangSanxuat()+","+this.getChuSoHuu()+","+this.getNamSX()+","+this.soGhe+","+this.kieuXe;
    }
}
