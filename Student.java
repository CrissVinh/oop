package oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {

    public String studentId;
    public String fullName;
    public Date dateOfBirth;
    public String major;
    public float gpa;

    // Constructor
    public Student(String studentId, String fullName, Date dateOfBirth, String major, float gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
        this.gpa = gpa;
    }

    public Student() {
    }

    // Nhap thong tin sinh vien
    public void enterStudentInfo() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        System.out.print("Nhap ID sinh vien: ");
        studentId = scanner.nextLine();

        System.out.print("Nhap ten sinh vien: ");
        fullName = scanner.nextLine();

        System.out.print("Nhap ngay sinh sinh vien (dd-MM-yyyy): ");
        try {
            dateOfBirth = sdf.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Ngay sinh khong hop le!");
            dateOfBirth = null;
        }

        System.out.print("Nhap nganh hoc sinh vien: ");
        major = scanner.nextLine();

        System.out.print("Nhap GPA sinh vien: ");
        gpa = scanner.nextFloat();
        scanner.nextLine();
    }

    // Hien thi thong tin sinh vien
    public void displayStudentInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("");
        System.out.println("ID sinh vien: " + studentId);
        System.out.println("Tên sinh vien: " + fullName);
        System.out.println("Ngay sinh sinh vien: " + (dateOfBirth != null ? sdf.format(dateOfBirth) : "N/A"));
        System.out.println("Nganh hoc sinh vien: " + major);
        System.out.println("GPA sinh vien: " + gpa);
        System.out.println("-----------------------------");
    }
}
