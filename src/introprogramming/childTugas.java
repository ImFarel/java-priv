package introprogramming;

public class childTugas {
    private int panjang;
    private int lebar;

    public int getLebar() {
        return lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void tidakJelas() {
        System.out.println("Bentuk nya abstrak");
    }

    public void tidakJelas(String s) {
        System.out.println(s);
    }

}
