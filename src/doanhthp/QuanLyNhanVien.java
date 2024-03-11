package doanhthp;

import java.io.File;
import java.io.PrintStream;
import java.util.*;

public class QuanLyNhanVien {

    private ArrayList<NhanVien> a = new ArrayList<>();

    public void docFile(String tenFile) {
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                System.out.println("OK");
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    String s[] = read.nextLine().split(",");

                    String ma = s[0];
                    String ten = s[1];
                    String ns = s[2];
                    String dc = s[3];
                    int sn = Integer.parseInt(s[4]);
                    double luong = Double.parseDouble(s[5]);
                    boolean gt = Boolean.parseBoolean(s[6]);
                    if (s[0].startsWith("N")) {
                        int sl = Integer.parseInt(s[7]);

                        a.add(new NhanVienBanHang(sl, ma, ten, ns, dc, sn, luong, gt));
                    } else {
                        String bp = s[7];
                        a.add(new NhanVienQuanLy(bp, ma, ten, ns, dc, sn, luong, gt));
                    }
                }
            } else {
                System.out.println("k co file");
            }

        } catch (Exception e) {

        }
    }

    public void ghiFile(String tenFile) {
        try {
            File f = new File(tenFile);
            if (!f.exists()) {
                PrintStream out = new PrintStream(f);
                for (NhanVien x : a) {
                    if (x instanceof NhanVienBanHang)
                    {
                        out.println(x.getMa() + "," + x.getHoTen() + "," + x.getNgaySinh() + "," + x.getDiaChi() + "," + x.getSoNgayLamViec() + "," + x.getLuongcoBan() + "," + x.isGioTinh() + "," + ((NhanVienBanHang) x).getSoLuongHangBan());
                    }
                    if (x instanceof NhanVienQuanLy) {
                        out.println(x.getMa() + "," + x.getHoTen() + "," + x.getNgaySinh() + "," + x.getDiaChi() + "," + x.getSoNgayLamViec() + "," + x.getLuongcoBan() + "," + x.isGioTinh() + "," + ((NhanVienQuanLy) x).getBoPhan());
                    }
                }
                out.close();
            } else {
                System.out.println("File da co,khong ghi");
            }

        } catch (Exception e) {
        }
    }

    public ArrayList<NhanVien> getA() {
        return a;
    }

    public void setA(ArrayList<NhanVien> a) {
        this.a = a;
    }

    public boolean xoaTheoMa(String ma) {
        for (NhanVien x : a) {
            if (x.getMa().equalsIgnoreCase(ma)) {
                a.remove(x);
                return true;
            }
        }
        return false;
    }

    public boolean themNhaVien(NhanVien y) {
        for (NhanVien x : a) {
            if (x.getMa().equalsIgnoreCase(y.getMa())) {
                return false;
            }
        }
        a.add(y);
        return true;
    }

    public void xuat(ArrayList a) {
        for (Object x : a) {
            System.out.println(x);
        }
    }

    public ArrayList layDanhSachTheoLoai(String loai) {
        ArrayList b = new ArrayList<>();
        for (NhanVien x : a) {
            if (x.getClass().getSimpleName().equalsIgnoreCase(loai)) {
                b.add(x);
            }
        }

        return b;

    }
    public int thongkeSLTungLoai(String tenlop) {
        int s = 0;
        for (NhanVien x : a) {
            if (x.getClass().getSimpleName().equalsIgnoreCase(tenlop)) {
                s++;
            }
        }
        return s;

    }

    public NhanVien nhanVienLuongCaoNhat() {
        NhanVien nhanVienLuongCaoNhat = null;
        double luongMax = Double.MIN_VALUE;

        for (NhanVien x : a) {
            double luong = x.getTienLuong();
            if (luong > luongMax) {
                luongMax = luong;
                nhanVienLuongCaoNhat = x;
            }
        }
        return nhanVienLuongCaoNhat;
    }

    public NhanVien nhanVienBanDuocNhieuNhat() {
        NhanVien nhanVienBanNhieuNhat = null;
        int maxSoLuongHangBan = Integer.MIN_VALUE;

        for (NhanVien x : a) {
            if (x instanceof NhanVienBanHang) {
                int soLuongHangBan = ((NhanVienBanHang) x).getSoLuongHangBan();
                if (soLuongHangBan > maxSoLuongHangBan) {
                    maxSoLuongHangBan = soLuongHangBan;
                    nhanVienBanNhieuNhat = x;
                }
            }
        }

        return nhanVienBanNhieuNhat;
    }

    public void sapXepGiamDanTheoTienLuong() {
        Collections.sort(a, Comparator.comparingDouble(NhanVien::getTienLuong).reversed());
    }

    public NhanVien nhanVienNghiNhieuNhat() {
        NhanVien nhanVienNhieuNhat = null;
        int ngayNghiMax = Integer.MIN_VALUE;

        for (NhanVien x : a) {
            int ngayNghi = 26 - x.getSoNgayLamViec();
            if (ngayNghi > ngayNghiMax) {
                ngayNghiMax = ngayNghi;
                nhanVienNhieuNhat = x;
            }
        }

        return nhanVienNhieuNhat;
    }

    public void output() {
        xuat(a);
        System.out.println("Nhan Vien Ban Hang");
        xuat(layDanhSachTheoLoai("NhanVienBanHang"));
        System.out.println("Nhan Vien Quan Ly");
        xuat(layDanhSachTheoLoai("NhanVienQuanLy"));
        System.out.println("");
        System.out.println("Nhan Vien Nghi Nhieu Nhat" + nhanVienNghiNhieuNhat());
        System.out.println("Nhan vien co Luong cao Nhat" + nhanVienBanDuocNhieuNhat());
        System.out.println("Giam Dan Theo Luong");
        sapXepGiamDanTheoTienLuong();
        xuat(a);

    }

    public static void main(String[] args) {
        QuanLyNhanVien a = new QuanLyNhanVien();
        a.docFile("NhanVien.txt");
        a.output();
        a.ghiFile("NhanVien.txt");
    }

}
