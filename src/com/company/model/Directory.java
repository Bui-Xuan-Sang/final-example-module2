package com.company.model;

import java.io.Serializable;

public class Directory implements Serializable {
    private long numberPhone;
    private String directory;
    private String name;
    private String gender;
    private String address;
    private int date;
    private String email;

    public Directory(){

    }

    public Directory(long numberPhone, String directory, String name, String gender, String address, int date, String email) {
        this.numberPhone = numberPhone;
        this.directory = directory;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.date = date;
        this.email = email;
    }

    public long getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(long numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "numberPhone=" + numberPhone +
                ", directory='" + directory + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", date=" + date +
                ", email='" + email + '\'' +
                '}';
    }
}
