
package doanhthp;

public class NhanVienQuanLy extends NhanVien {
    private String boPhan;

    @Override
    public double getTienLuong() {
        int soNgayNghi=26-soNgayLamViec;
        if(soNgayLamViec==26){
        if(boPhan.equalsIgnoreCase("VIP") ){
            return luongcoBan+1000;
        } else
            return luongcoBan+500;
        }else
            return luongcoBan-(soNgayNghi*(luongcoBan/26));          
    }

    public NhanVienQuanLy() {
    }
    public NhanVienQuanLy(String boPhan, String ma, String hoTen, String NgaySinh, String DiaChi, int soNgayLamViec, double luongcoBan, boolean gioTinh) {
        super(ma, hoTen, NgaySinh, DiaChi, soNgayLamViec, luongcoBan, gioTinh);
        this.boPhan = boPhan;
    }

    public String getBoPhan() {
        return boPhan;
    }

    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }

    @Override
    public String toString() {
        return "NhanVienQuanLy{" +super.toString()+ "boPhan=" + boPhan + '}';
    }
    public static void main(String[] args) {
        NhanVienQuanLy a=new NhanVienQuanLy("VIP","Ql002","canh","16/07/2004","Quàn Ngai",20,10000,true);
        System.out.println(a);
    }
}
