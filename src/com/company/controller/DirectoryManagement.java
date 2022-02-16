package com.company.controller;

import com.company.model.Directory;
import read_write_file.Csv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DirectoryManagement {
    private static Scanner scanner = new Scanner(System.in);
    private ArrayList<Directory> directorys;
    public static final String Path = "files/danhBa.csv";
    private static Csv csv = new Csv() ;
    public DirectoryManagement() {
        directorys = csv.readFile(Path);
    }

    public void addDirectory(Directory directory, Csv csv) {
        directorys.add(directory);
        csv.writeFile(directorys,Path);
    }



    public void removeDirectory(Directory directory) {
        directorys.remove(directory);
    }

    public Directory findDirectoryByName(String name) {
        for (int i = 0; i < directorys.size(); i++) {
            if (directorys.get(i).getName().equalsIgnoreCase(name)) {
                return directorys.get(i);
            }
        }
        return null;
    }

    public void showListDirectory(){

        for (Directory directory : directorys){
            System.out.println(directory);
        }
    }

    public ArrayList<Directory> getDirectorys() {
        return directorys;
    }

    public void setDirectorys(ArrayList<Directory> directorys) {
        this.directorys = directorys;
    }

    public Directory inputDirectory(){
        System.out.println("Lựa chọn thêm mới");
        System.out.println("Số điện thoại: ");
        long numberPhone = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Nhóm của danh bạ: ");
        String directory = scanner.nextLine();
        System.out.println("Họ tên: ");
        String name = scanner.nextLine();
        System.out.println("Giới tính");
        String gender = scanner.nextLine();
        System.out.println("Địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Ngày sinh: ");
        int date = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Email:");
        String email = scanner.nextLine();
        Directory directory1 = new Directory(numberPhone,directory,name,gender,address,date,email);
        return directory1;

    }


    public void showUpdateDirectory(){
        System.out.println("Chỉnh sửa thông tin danh bạ");
        System.out.println("Nhập thông tin cần chỉnh sửa");
        String name = scanner.nextLine();
        Directory result = findDirectoryByName(name);

        if (result == null){
            System.out.println("Không tìm được");
        }else {
            System.out.println("Nhóm của danh bạ");
            String newDirectory = scanner.nextLine();
            result.setDirectory(newDirectory);
            System.out.println("Họ tên");
            String newName = scanner.nextLine();
            result.setName(newName);
            System.out.println("Giới tính");
            String newGender = scanner.nextLine();
            result.setGender(newGender);
            System.out.println("Địa chỉ");
            String newAddress = scanner.nextLine();
            result.setAddress(newAddress);
            System.out.println("Ngày sinh");
            int newDate = scanner.nextInt();
            result.setDate(newDate);
            System.out.println("Email");
            String newEmail = scanner.nextLine();
            result.setEmail(newEmail);
        }
        csv.writeFile(directorys,Path);
    }

    public void showDelete( ){
        System.out.println("Nhập tên muốn xóa");
        String name = scanner.nextLine();
        Directory result = findDirectoryByName(name);
        if (result == null){
            System.out.println("Không có trong danh bạ");
        }else {
            removeDirectory(result);
            System.out.println("Đã xóa!");
        }
    }

    public void searchDirectory(){
        System.out.println("Nhập tên ");
        String name = scanner.nextLine();
        Directory result = findDirectoryByName(name);
        if (result == null){
            System.out.println("Không có trong danh sách");
        }else {
            System.out.println(result);
        }
    }


}
