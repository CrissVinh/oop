package oop;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList studentList = new StudentList();
        int choice;

        do {
            System.out.println("");
            System.out.println("==== Quan ly sinh vien ====");
            System.out.println("1. Nhap thong tin sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. tim sinh vien theo ID");
            System.out.println("4. Xoa sinh vien theo ID");
            System.out.println("5. Chinh sau thong tin theo ID");
            System.out.println("0. Thoat");
            System.out.print("  Nhap lua chon cau ban: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    studentList.enterStudentList();
                    break;
                case 2:
                    studentList.displayAllStudents();
                    break;
                case 3:
                    System.out.println("");
                    System.out.print("=> Nhap ID sinh vien can tim: ");
                    String idToFind = scanner.nextLine();
                    Student foundStudent = studentList.findStudentById(idToFind);
                    if (foundStudent != null) {
                        foundStudent.displayStudentInfo();
                    } else {
                        System.out.println("");
                        System.out.println("=> khong tim thay sinh vien!");
                    }
                    break;
                case 4:
                    System.out.println("");
                    System.out.print("=> Nhap ID sinh vien can xoa: ");
                    String idToDelete = scanner.nextLine();
                    if (studentList.deleteStudentById(idToDelete)) {
                        System.out.println("");
                        System.out.println("=> Xoa sinh vien xong!");
                    } else {
                        System.out.println("");
                        System.out.println("=> khong tim thay sinh vien!");
                    }
                    break;
                case 5:
                    System.out.println("");
                    System.out.print("=> Nhap ID sinh vien can chinh sua: ");
                    String idToEdit = scanner.nextLine();
                    if (studentList.editStudentById(idToEdit)) {
                        System.out.println("");
                        System.out.println("=> Chinh sua xong!");
                    } else {
                        System.out.println("");
                        System.out.println("=> khong tim thay sinh vien!");
                    }
                    break;
                case 0:
                    System.out.println("");
                    System.out.println("=> Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("");
                    System.out.println("=> Lua chon khong hop le! Vui long thu lai.");
            }
        } while (choice != 0);
    }
}
