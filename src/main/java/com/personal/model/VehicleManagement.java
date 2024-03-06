package main.java.com.personal.model;

import java.util.ArrayList;
import java.util.Scanner;
public class VehicleManagement {

    public ArrayList<String> VehicleManagement  = new ArrayList<String>();
    String n,m;             //n để nhập dự liệu cho list
    public String get_n() {
        return n;
    }
    public void set_n(String new_n) {
        this.n = new_n;
    }

    public String get_m() {
        return m;
    }
    public void set_m(String new_m) {
        this.m = new_m;
    }



    public void addList() {
        VehicleManagement.add(n);
    }
    public void changeList() {
        if (VehicleManagement.contains(n)) {
            VehicleManagement.indexOf(n);
            VehicleManagement.remove(n);
            VehicleManagement.add(m);
        }
        else {
            System.out.println(n + " is not exit!");
        }

    }

    public void removeList() {
        VehicleManagement.remove(n);
    }

    public void printList() {
        if (VehicleManagement.isEmpty()) {
            System.out.println("The list is empty.");
        }
        else {
            for (String i : VehicleManagement) {
                System.out.println(i);
            }
        }
    }


}
