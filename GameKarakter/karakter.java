package game;

public class Karakter {
    private String nama;
    private int kesehatan;
    private int serangan;
    private int pertahanan;

    public Karakter(String nama, int kesehatan, int serangan, int pertahanan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
        this.serangan = serangan;
        this.pertahanan = pertahanan;
    }

    public String getNama() {
        return nama;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public int getSerangan() {
        return serangan;
    }

    public int getPertahanan() {
        return pertahanan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    public void setSerangan(int serangan) {
        this.serangan = serangan;
    }

    public void setPertahanan(int pertahanan) {
        this.pertahanan = pertahanan;
    }

    public void serang(Karakter target) {
        int kerusakan = this.serangan - target.pertahanan;
        if (kerusakan > 0) {
            target.kesehatan -= kerusakan;
            System.out.println(this.nama + " menyerang " + target.nama + " sebesar " + kerusakan + " point kerusakan!");
            System.out.println(target.nama + " memiliki " + target.kesehatan + " kesehatan tersisa.");
        } else {
            System.out.println(this.nama + " menyerang " + target.nama + ", dan tidak berpengaruh!");
        }
    }
}