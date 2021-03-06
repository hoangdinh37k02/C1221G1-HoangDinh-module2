package vehicle_validate.models;

public class XeTai extends PhuongTien{
    private int trongTai;

    public XeTai(){}

    public XeTai(String bienKiemSoat, String hangSanxuat, String chuSoHuu, String namSX, int trongTai) {
        super(bienKiemSoat, hangSanxuat, chuSoHuu, namSX);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    public String getBaseInfo(){
        return super.getBienKiemSoat()+","+this.getHangSanxuat()+","+this.getChuSoHuu()+","+this.getNamSX()+","+this.getTrongTai();
    }
}
