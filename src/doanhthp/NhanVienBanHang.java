
package doanhthp;

public class NhanVienBanHang extends NhanVien {
    private int soLuongHangBan;

    public NhanVienBanHang() {
    }

    public NhanVienBanHang(int soLuongHangBan, String ma, String hoTen, String NgaySinh, String DiaChi, int soNgayLamViec, double luongcoBan, boolean gioTinh) {
        super(ma, hoTen, NgaySinh, DiaChi, soNgayLamViec, luongcoBan, gioTinh);
        this.soLuongHangBan = soLuongHangBan;
    }

    @Override
    public double getTienLuong() {
        int soNgayNghi=26-soNgayLamViec;
        if(soNgayNghi==0 ){
            if(soLuongHangBan>300){
                return luongcoBan+300;
            }else
              return luongcoBan;    
        }
        else
            return luongcoBan-(soNgayNghi*(luongcoBan/26));
    }

    public int getSoLuongHangBan() {
        return soLuongHangBan;
    }

    public void setSoLuongHangBan(int soLuongHangBan) {
        this.soLuongHangBan = soLuongHangBan;
    }

    @Override
    public String toString() {
        return "NhanVienBanHang{" +super.toString()+ "soLuongHangBan=" + soLuongHangBan + '}';
    }
    public static void main(String[] args) {
        NhanVienBanHang a=new NhanVienBanHang(100,"Ql002","canh","16/07/2004","Quàn Ngai",20,10000,true);
        System.out.println(a);
    }
    
}
