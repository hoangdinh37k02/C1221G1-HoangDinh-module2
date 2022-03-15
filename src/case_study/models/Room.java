package case_study.models;

public class Room extends Facility{
    private String dichVuThem;

    public Room(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue, String dichVuThem) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.dichVuThem = dichVuThem;
    }

    public String getDichVuThem() {
        return dichVuThem;
    }

    public void setDichVuThem(String dichVuThem) {
        this.dichVuThem = dichVuThem;
    }
}
