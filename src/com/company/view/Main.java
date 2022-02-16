package com.company.view;

import com.company.controller.DirectoryManagement;
import com.company.model.Directory;
import com.company.view.ManagementMenu;

public class Main {
    public static DirectoryManagement directoryManagement = new DirectoryManagement();


    public static void main(String[] args) {
        ManagementMenu managementMenu = new ManagementMenu();
        managementMenu.run();
    }
}

