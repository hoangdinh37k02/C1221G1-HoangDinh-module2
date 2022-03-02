package oop_review.extra_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Oto> otoList = new ArrayList<>();
        ArrayList<Truck> truckList = new ArrayList<>();
        ArrayList<Motor> motorList = new ArrayList<>();

//        otoList.add(new Oto("75H7652", "TOYOTA", 2015, "Hai", 23, "Dulich"));
//        System.out.println(otoList.get(0).getNumberPlate());
        Scanner input=new Scanner(System.in);
        int choice;
        int addingChoice;
        int displayChoice;

        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Thoát");
            System.out.println("Vui lòng lựa chọn");
            choice = input.nextInt();

            switch (choice){
                case 1:
                        System.out.println("1. Thêm xe tải");
                        System.out.println("2. Thêm ô tô");
                        System.out.println("3. Thêm xe máy");
                        System.out.println("Vui lòng lựa chọn");
                        addingChoice=input.nextInt();

                        switch (addingChoice){
                            case 1:
                                Truck truck1=new Truck();
                                truck1.add();
                                truckList.add(truck1);
//                                Truck truck2=new Truck();
//                                truck2.add();
//                                truckList.add(truck2);
//                                Truck truck3=new Truck();
//                                truck3.add();
//                                truckList.add(truck3);
                                break;
                            case 2:
                                Oto oto1=new Oto();
                                oto1.add();
                                otoList.add(oto1);
//                                Oto oto2=new Oto();
//                                oto2.add();
//                                otoList.add(oto2);
//                                Oto oto3=new Oto();
//                                oto3.add();
//                                otoList.add(oto3);
                                break;
                            case 3:
                                Motor motor1=new Motor();
                                motor1.add();
                                motorList.add(motor1);
//                                Motor motor2=new Motor();
//                                motor2.add();
//                                motorList.add(motor2);
//                                Motor motor3=new Motor();
//                                motor3.add();
//                                motorList.add(motor3);
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ");
                                break;
                        }
                        break;
                case 2:

                        System.out.println("1. Hiển thị xe tải");
                        System.out.println("2. Hiển thị ô tô");
                        System.out.println("3. Hiển thị xe máy");
                        System.out.println("4. Thoát");
                        System.out.println("Vui lòng lựa chọn");
                        displayChoice=input.nextInt();

                        switch (displayChoice) {
                            case 1:
                                for (int i = 0; i < truckList.size(); i++) {
                                    System.out.println(truckList.get(i).getNumberPlate()+","
                                            + truckList.get(i).getManufacturer()+","
                                            + truckList.get(i).getYearOfManufacture()+","
                                            + truckList.get(i).getHost()+","
                                            + truckList.get(i).getTruckLoad());
                                }
                                break;
                            case 2:
                                for (int i = 0; i < otoList.size(); i++) {
                                    System.out.println(otoList.get(i).getNumberPlate()+","
                                            + otoList.get(i).getManufacturer()+","
                                            + otoList.get(i).getYearOfManufacture()+","
                                            + otoList.get(i).getHost()+","
                                            + otoList.get(i).getNumberOfSeat()+","
                                            + otoList.get(i).getTypeOf());
                                }
                                break;
                            case 3:
                                for (int i = 0; i < motorList.size(); i++) {
                                    System.out.println(motorList.get(i).getNumberPlate()+","
                                            + motorList.get(i).getManufacturer()+","
                                            + motorList.get(i).getYearOfManufacture()+","
                                            + motorList.get(i).getHost()+","
                                            + motorList.get(i).getCapacity());
                                }
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ");
                                break;
                        }
                        break;
                case 3:
                    System.out.println("Vui lòng nhập biển số xe cần xóa: ");
                    String deleteNumberPlate;
                    deleteNumberPlate = input.nextLine();deleteNumberPlate = input.nextLine();
                    for (int i=0; i<truckList.size(); i++){
                        if (truckList.get(i).getNumberPlate().equals(deleteNumberPlate)){
                            truckList.remove(i);
                            System.out.println("Xe tải đã được xóa: " +truckList.get(i).getNumberPlate());
                        }
                    }
                    for (int i=0; i<otoList.size(); i++){
                        if (otoList.get(i).getNumberPlate().equals(deleteNumberPlate)){
                            otoList.remove(i);
                            System.out.println("Oto đã được xóa: " +otoList.get(i).getNumberPlate());
                        }
                    }
                    for (int i=0; i<motorList.size(); i++){
                        if (motorList.get(i).getNumberPlate().equals(deleteNumberPlate)){
                            motorList.remove(i);
                            System.out.println("Xe máy đã được xóa: " +motorList.get(i).getNumberPlate());
                        }
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        } while (choice!=4);
    }
}
