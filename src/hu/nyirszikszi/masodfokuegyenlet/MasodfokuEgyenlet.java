package hu.nyirszikszi.masodfokuegyenlet;

public class MasodfokuEgyenlet {
    private int a;
    private int b;
    private int c;

    public MasodfokuEgyenlet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getSzamol() {
        double d = this.b * this.b - 4 * this.a * this.c;
        String z;

        if (d < 0) {
            z = "Az egyenletnek nincs megoldása!";
        }
        else {
            double x1 = -1 * this.b + Math.sqrt(d) / 2 * this.a;
            double x2 = -1 * this.b - Math.sqrt(d) / 2 * this.a;

            z = "X1 = " + (int)x1 + "\nX2 = " + (int)x2;
        }

        return z;
    }
}