package vehicle_validate.service;

import vehicle_validate.util.BienKSKhongHoply;

public interface IPhuongTien {
    void add();
    void display();
    void delete() throws BienKSKhongHoply;
}
