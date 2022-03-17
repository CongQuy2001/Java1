/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment.FpolyHN;

import Assigment.FpolyHN.Employee;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JosCongQuy
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
// tránh dư thừa bộ nhớ
    public static void main(String[] args) {
        List<Employee> listNV = new ArrayList<>();
        menu(listNV);
    }

    public static void menu(List<Employee> listNV) {
        while (true) {
            System.out.println(" ==========================================================");
            System.out.println("|1. Nhập danh sách nhân viên từ bàn phím                   |");
            System.out.println("|2. Xuất danh sách nhân viên ra màn hình.                  |");
            System.out.println("|3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím     |");
            System.out.println("|4. Xóa nhân viên theo mã nhập từ bàn phím.                |");
            System.out.println("|5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím  |");
            System.out.println("|6. Sắp xếp nhân viên theo họ và tên                       |");
            System.out.println("|7. Sắp xếp nhân viên theo thu nhập                        |");
            System.out.println("|8. Xuất 5 nhân viên có thu nhập cao nhất.                 |");
            System.out.println("|0. kết thúc                                               |");
            System.out.println(" ==========================================================");
            System.out.println(">> chọn chức năng:...");
            String so = sc.nextLine();
            switch (so) {
                case "1":
                    input(listNV);
                    break;
                case "2":
                    outputEmployee(listNV);
                    break;
                case "3":
                    FindAndDisplayemployees(listNV);
                    break;
                case "4":
                    deleteEmployee(listNV);
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "0":
                    break;
                default:
                    System.out.println("chọn sai r chọn lại đi");
            }
        }
    }
// thông tin nhân viên hành chính
    public static void inputInfoEmployeeAdministrative(List<Employee> listEmployees) {
        while (true) {
            System.out.println("nhap code");
            String code = sc.nextLine();
            System.out.println("nhap name");
            String name = sc.nextLine();
            System.out.println("nhập basicSalary");
            Float basicSalary = Float.parseFloat(sc.nextLine());
            System.out.println("nhap ngay cong");
            Integer workdays = Integer.parseInt(sc.nextLine());
            Employee employee = new Employee(code, name, basicSalary, workdays, null);
            listEmployees.add(employee);
            System.out.println("nhập tiếp hay không y/n");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }

    }
//thông tin nhân viên kinh doanh
    public static void inputInfoEmployeeBusiness(List<Employee> listEmployees) {
        while (true) {
            System.out.println("nhap code");
            String code = sc.nextLine();
            System.out.println("nhap name");
            String name = sc.nextLine();
            System.out.println("nhập basicSalary");
            Float basicSalary = Float.parseFloat(sc.nextLine());
            System.out.println("nhập business Salary");
            Float businessSalary = Float.parseFloat(sc.nextLine());
            Employee employee = new Employee(code, name, basicSalary, null, businessSalary);
            listEmployees.add(employee);
            System.out.println("nhập tiếp hay không y/n");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }

    }

    /**
     *
     * 1. Nhập danh sách nhân viên từ bàn phím
     *
     * @param listEmployees
     */
    public static void input(List<Employee> listEmployees) {
        System.out.println("mời bạn chọn");
        System.out.println("1. Nhập danh sách nhân viên hành chính");
        System.out.println("2. Nhập danh sách nhân viên kinh doanh");
        System.out.println("0. kết thúc");
        String option = sc.nextLine();
        while (true) {
            switch (option) {
                case "1":
                    inputInfoEmployeeAdministrative(listEmployees);
                    break;
                case "2":
                    inputInfoEmployeeBusiness(listEmployees);
                    break;
                default:
                    System.out.println("nhap ds xong");
            }
        }

    }

    /**
     *
     * 2. Xuất danh sách nhân viên ra màn hình.
     *
     * @param listEmployees
     */
    public static void outputEmployee(List<Employee> listEmployees) {
        listEmployees.stream().forEach((staffcollection) -> System.out.println(staffcollection.toString()));
    }

    /**
     *
     * 3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím
     *
     * @param listEmployees
     */
    public static void FindAndDisplayemployees(List<Employee> listEmployees) {
        System.out.println("nhập code");
        String code = sc.nextLine();
        for (Employee staffCollection : listEmployees) {
            if (staffCollection.getCode().equalsIgnoreCase(code)) {
                System.out.println(staffCollection.toString());
            } else {
                System.out.println("k tim thay");
            }
        }
    }

    /**
     *
     * 4. Xóa nhân viên theo mã nhập từ bàn phím.
     *
     * @param listEmployees
     */
    public static void deleteEmployee(List<Employee> listEmployees) {
        System.out.println("nhập code");
        String code = sc.nextLine();
        for (Employee staffCollection : listEmployees) {
            if (staffCollection.getCode().equalsIgnoreCase(code)) {
                listEmployees.remove(staffCollection);
            }else{
                System.out.println("không tìm thấy mã nhân viên");
            }
        }
    }
    /**
     * 6. sắp xếp nhân viên theo tên
     * @param listEmployees
     */
    public static void staffArrangements(List<Employee> listEmployees) {
        Comparator <Employee> comp = (Employee o1, Employee o2) -> o1.getName().compareTo(o2.getName());
             for (Employee staffCollection : listEmployees){
        System.out.println(staffCollection);
    }  
        }
    /**
     * 7. sắp xếp nhân viên theo thu nhập
     */
    public static void arrangeEmployeesByIncome() {
        
    }
}
