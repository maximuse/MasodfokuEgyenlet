package hu.nyirszikszi;

import hu.nyirszikszi.masodfokuegyenlet.MasodfokuEgyenlet;

public class Main {

    public static void main(String[] args) {
        MasodfokuEgyenlet m = new MasodfokuEgyenlet(4, 6, 1);
        System.out.println(m.getSzamol());
    }
}