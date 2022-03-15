package case_study.models;

public class Contract {
    private String soHD, maBooking, soTienCoc, soTienThanhToan, maKH;

    public Contract(String soHD, String maBooking, String soTienCoc, String soTienThanhToan, String maKH) {
        this.soHD = soHD;
        this.maBooking = maBooking;
        this.soTienCoc = soTienCoc;
        this.soTienThanhToan = soTienThanhToan;
        this.maKH = maKH;
    }

    public String getSoHD() {
        return soHD;
    }

    public void setSoHD(String soHD) {
        this.soHD = soHD;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public String getSoTienCoc() {
        return soTienCoc;
    }

    public void setSoTienCoc(String soTienCoc) {
        this.soTienCoc = soTienCoc;
    }

    public String getSoTienThanhToan() {
        return soTienThanhToan;
    }

    public void setSoTienThanhToan(String soTienThanhToan) {
        this.soTienThanhToan = soTienThanhToan;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }
}
