package vehicle_validate.models;

public class XeMay extends PhuongTien{
    private int congSuat;

    public XeMay(){}

    public XeMay(String bienKiemSoat, String hangSanxuat, String chuSoHuu, int namSX, int congSuat) {
        super(bienKiemSoat, hangSanxuat, chuSoHuu, namSX);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
}
