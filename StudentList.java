package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

    private ArrayList<Student> studentList;

    // Constructor
    public StudentList() {
        studentList = new ArrayList<>();
    }

    // Nhap danh sach sin vien 
    public void enterStudentList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.print("=> Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        for (int i = 0; i < n; i++) {
            System.out.println("=> Nhap thong tin cho sinh vien thu " + (i + 1) + ": ");
            Student student = new Student();
            student.enterStudentInfo();
            studentList.add(student);
        }
    }

    // Hien thi danh sach sinh vien
    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("");
            System.out.println("=> Danh sach sinh vien trong!");
        } else {
            for (Student student : studentList) {
                student.displayStudentInfo();
            }
        }
    }

    // Tim sinh vien theo ID
    public Student findStudentById(String idToFind) {
        for (Student student : studentList) {
            if (student.studentId.equals(idToFind)) {
                return student;
            }
        }
        return null;
    }

    // Xoa sinh vien theo ID
    public boolean deleteStudentById(String idToDelete) {
        Student student = findStudentById(idToDelete);
        if (student != null) {
            studentList.remove(student);
            return true;
        }
        return false;
    }

    // Chinh sua thong tin sinh vien theo ID
    public boolean editStudentById(String idToEdit) {
        Student student = findStudentById(idToEdit);
        if (student != null) {
            System.out.println("");
            System.out.println("=> Chinh sua thong tin sinh vien:");
            student.enterStudentInfo();
            return true;
        }
        return false;
    }
}
