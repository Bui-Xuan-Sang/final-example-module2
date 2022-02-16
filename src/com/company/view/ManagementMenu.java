package com.company.view;

import com.company.controller.DirectoryManagement;
import com.company.model.Directory;
import read_write_file.Csv;

import java.util.Scanner;

public class ManagementMenu {
    private static Scanner scanner = new Scanner(System.in);
    Csv csv = new Csv();

    public void run() {

            int choice = -1;
            do {
                menu();
                System.out.println("Chọn chức năng:");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1: {
                        Main.directoryManagement.showListDirectory();
                        break;
                    }
                    case 2: {
                        Directory d = Main.directoryManagement.inputDirectory();
                        Main.directoryManagement.addDirectory(d,csv);

                        break;
                    }
                    case 3: {
                        Main.directoryManagement.showUpdateDirectory();
                        break;
                    }
                    case 4: {
                        Main.directoryManagement.showDelete();
                        break;
                    }
                    case 5: {
                        Main.directoryManagement.searchDirectory();
                        break;
                    }
                    case 6: {
                        System.out.println("Đọc file thành công");
                        break;
                    }
                    case 7: {
                        break;
                    }
                }
            } while (choice != 0);
        }

    private void menu() {
        System.out.println("--- CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ ---");
        System.out.println("Chọn chức năng theo số ( để tiếp tục ):");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
    }
}


