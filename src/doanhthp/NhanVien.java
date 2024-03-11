
package doanhthp;

public abstract  class NhanVien {
  private String ma,hoTen,NgaySinh,DiaChi;
  protected int soNgayLamViec;
  protected double luongcoBan;
  private boolean gioTinh;
public abstract double getTienLuong();

    public NhanVien() {
    }

    public NhanVien(String ma, String hoTen, String NgaySinh, String DiaChi, int soNgayLamViec, double luongcoBan, boolean gioTinh) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.soNgayLamViec = soNgayLamViec;
        this.luongcoBan = luongcoBan;
        this.gioTinh = gioTinh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public double getLuongcoBan() {
        return luongcoBan;
    }

    public void setLuongcoBan(double luongcoBan) {
        this.luongcoBan = luongcoBan;
    }

    public boolean isGioTinh() {
        return gioTinh;
    }

    public void setGioTinh(boolean gioTinh) {
        this.gioTinh = gioTinh;
    }

    @Override
    public String toString() {
        return  ma + ", " + hoTen + ", " + NgaySinh + ", " + DiaChi + ", " + soNgayLamViec + "," + luongcoBan + "," + ((gioTinh)?"Nam":"Nu") +",Tien Luong:"+getTienLuong()+",";
    }

  

}
