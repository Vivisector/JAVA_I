package src3.tasks;

public class Laptop {
    private String model;
    private int ram;
    private int hdd;
    private String os;
    private String color;

    
    public Laptop(String model, int ram, int hdd, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }        
    @Override
    public String toString() {
        return String.format("model:%s ram:%s hdd:%s OS:%s color: %s", model, ram, hdd, os, color);    
    }

    public String getModel() {
        return model;
    }
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }
    public String getColor() {
        return color;
    }

}
