package vehicle_validate.models;

public class PhuongTien {
    private String bienKiemSoat, hangSanxuat, chuSoHuu, namSX;

    public PhuongTien(){}

    public PhuongTien(String bienKiemSoat, String hangSanxuat, String chuSoHuu, String namSX) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanxuat = hangSanxuat;
        this.chuSoHuu = chuSoHuu;
        this.namSX = namSX;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getHangSanxuat() {
        return hangSanxuat;
    }

    public void setHangSanxuat(String hangSanxuat) {
        this.hangSanxuat = hangSanxuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public String getNamSX() {
        return namSX;
    }

    public void setNamSX(String namSX) {
        this.namSX = namSX;
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", hangSanxuat='" + hangSanxuat + '\'' +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                ", namSX=" + namSX +
                '}';
    }
}
