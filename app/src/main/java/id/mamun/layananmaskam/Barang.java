package id.mamun.layananmaskam;

public class Barang {
    private String namaBarang;
    private String icon;
    private String tersedia;
    private String totalDefault;
    private String deskripsi;
    private String harga;
    private String img;

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    public String getNamaBarang() {
        return namaBarang;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getIcon() {
        return icon;
    }
    public void setTersedia(String tersedia) {
        this.tersedia = tersedia;
    }
    public String getTersedia() {
        return tersedia;
    }

    public void setTotalDefault(String totalDefault) {
        this.totalDefault = totalDefault;
    }

    public String getTotalDefault() {
        return totalDefault;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getHarga() {
        return harga;
    }

    public String getImg() {
        return img;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void setImg(String img) {
        this.img = img;
    }
}