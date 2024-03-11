/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package doanhthp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author duccanh
 */
public class GUI extends javax.swing.JFrame {

    DefaultTableModel dtm;
    QuanLyNhanVien a;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        dtm = new DefaultTableModel();
        // G001, Toan, 2020, Giao Duc, 120, 200, 50, 7
        dtm.setColumnIdentifiers(new Object[]{"Mã", "Tên", "Ngày Sinh ", "Địa Chỉ ", "Giới Tính", "Lương Cơ Bản ", "Số Ngày làm ",
            "Số Lượng Hàng Bán ", "Bộ Phận", "Tiền Lương"});
        tblHienThi.setModel(dtm);
        a = new QuanLyNhanVien();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lblNhanVien = new javax.swing.JLabel();
        lblMa = new javax.swing.JLabel();
        lblGT = new javax.swing.JLabel();
        lblTen = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        lblhang = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblLuong = new javax.swing.JLabel();
        lblBoPhan = new javax.swing.JLabel();
        rbtNVBH = new javax.swing.JRadioButton();
        rbtNVQl = new javax.swing.JRadioButton();
        rbtNu = new javax.swing.JRadioButton();
        rbtNam = new javax.swing.JRadioButton();
        txtTen = new javax.swing.JTextField();
        txtMa = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        txtDiachi = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtBoPhan = new javax.swing.JTextField();
        txtHang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHienThi = new javax.swing.JTable();
        btnDocFile = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btnSapXep = new javax.swing.JButton();
        btnSlNV = new javax.swing.JButton();
        btnNVBanNhieuHangNhat = new javax.swing.JButton();
        btnNghiMax = new javax.swing.JButton();
        btnTach = new javax.swing.JButton();
        btnLuongMax = new javax.swing.JButton();
        lblNgay = new javax.swing.JLabel();
        txtNgay = new javax.swing.JTextField();
        btnGhiFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Al Nile", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("                                        Quản Lý Nhân Viên ");

        lblNhanVien.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblNhanVien.setText("Nhân Viên");

        lblMa.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblMa.setText("Mã");

        lblGT.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblGT.setText("Giới Tính");

        lblTen.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblTen.setText("Tên");

        lblDiaChi.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblDiaChi.setText("Địa Chỉ");

        lblhang.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblhang.setText("Sl Hàng Bán ");

        lblNgaySinh.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblNgaySinh.setText("Ngày Sinh");

        lblLuong.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblLuong.setText("Lương Cơ Bản");

        lblBoPhan.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblBoPhan.setText("Bộ Phận");

        buttonGroup1.add(rbtNVBH);
        rbtNVBH.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        rbtNVBH.setText("Nhân Viên Bán Hàng ");
        rbtNVBH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtNVBHMouseClicked(evt);
            }
        });
        rbtNVBH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rbtNVBHKeyTyped(evt);
            }
        });

        buttonGroup1.add(rbtNVQl);
        rbtNVQl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        rbtNVQl.setText("Nhân Viên Quản Lý");
        rbtNVQl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtNVQlMouseClicked(evt);
            }
        });

        buttonGroup2.add(rbtNu);
        rbtNu.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        rbtNu.setText("Nữ");
        rbtNu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtNuMouseClicked(evt);
            }
        });

        buttonGroup2.add(rbtNam);
        rbtNam.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        rbtNam.setText("Nam");
        rbtNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtNamMouseClicked(evt);
            }
        });

        tblHienThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblHienThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHienThiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHienThi);

        btnDocFile.setBackground(new java.awt.Color(51, 153, 0));
        btnDocFile.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnDocFile.setText("ĐỌC FILE");
        btnDocFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocFileActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 153, 0));
        btnUpdate.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(0, 153, 0));
        btnThem.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btXoa.setBackground(new java.awt.Color(51, 153, 0));
        btXoa.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btXoa.setText("XOÁ THEO MÃ");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btnSapXep.setBackground(new java.awt.Color(0, 153, 0));
        btnSapXep.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnSapXep.setText("SẮP XẾP GIẢM THEO TIỀN LƯƠNG ");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        btnSlNV.setBackground(new java.awt.Color(51, 153, 0));
        btnSlNV.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnSlNV.setText("THỐNG KÊ SL NHÂN VIÊN ");
        btnSlNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSlNVActionPerformed(evt);
            }
        });

        btnNVBanNhieuHangNhat.setBackground(new java.awt.Color(51, 153, 0));
        btnNVBanNhieuHangNhat.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnNVBanNhieuHangNhat.setText("NHÂN VIÊN BÁN NHIỀU HÀNG NHẤT ");
        btnNVBanNhieuHangNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNVBanNhieuHangNhatActionPerformed(evt);
            }
        });

        btnNghiMax.setBackground(new java.awt.Color(51, 153, 0));
        btnNghiMax.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnNghiMax.setText("NV NGHỈ NHIỀU NHẤT ");
        btnNghiMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNghiMaxActionPerformed(evt);
            }
        });

        btnTach.setBackground(new java.awt.Color(51, 153, 0));
        btnTach.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnTach.setText("TÁCH");
        btnTach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTachActionPerformed(evt);
            }
        });

        btnLuongMax.setBackground(new java.awt.Color(51, 153, 0));
        btnLuongMax.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnLuongMax.setText("NV CÓ LƯƠNG CAO NHẤT ");
        btnLuongMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuongMaxActionPerformed(evt);
            }
        });

        lblNgay.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblNgay.setText("Số Ngày Làm");

        btnGhiFile.setBackground(new java.awt.Color(51, 153, 0));
        btnGhiFile.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnGhiFile.setText("GHI FILE");
        btnGhiFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNgaySinh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLuong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNgay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblhang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHang, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDiaChi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiachi))
                            .addComponent(lblNhanVien)
                            .addComponent(lblGT)
                            .addComponent(rbtNVQl)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtNu))
                            .addComponent(rbtNVBH)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBoPhan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBoPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNVBanNhieuHangNhat)
                                .addGap(18, 18, 18)
                                .addComponent(btnNghiMax)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLuongMax)
                                .addGap(18, 18, 18)
                                .addComponent(btnTach)
                                .addGap(18, 18, 18)
                                .addComponent(btnGhiFile))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDocFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnThem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btXoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSlNV, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSapXep)))
                        .addGap(0, 59, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNhanVien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtNVBH)
                        .addGap(2, 2, 2)
                        .addComponent(rbtNVQl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMa)
                            .addComponent(lblMa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTen)
                            .addComponent(lblTen, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGT)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtNam)
                            .addComponent(rbtNu))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDiachi)
                                            .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(lblLuong))
                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblhang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBoPhan)
                            .addComponent(txtBoPhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDocFile)
                    .addComponent(btnUpdate)
                    .addComponent(btnThem)
                    .addComponent(btXoa)
                    .addComponent(btnSapXep)
                    .addComponent(btnSlNV))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNVBanNhieuHangNhat)
                    .addComponent(btnNghiMax)
                    .addComponent(btnTach)
                    .addComponent(btnLuongMax)
                    .addComponent(btnGhiFile)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNghiMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNghiMaxActionPerformed
        // TODO add your handling code here:
         NhanVien nvNghiNhieuNhat = a.nhanVienNghiNhieuNhat();

    if (nvNghiNhieuNhat != null) {
        JOptionPane.showMessageDialog(null, "Nhân viên nghỉ nhiều nhất: \n" + nvNghiNhieuNhat.toString());
    } else {
        JOptionPane.showMessageDialog(null, "Không có nhân viên nghỉ nhiều nhất.");
    }
    }//GEN-LAST:event_btnNghiMaxActionPerformed

    private void btnDocFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocFileActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        String tenFile = fc.getSelectedFile().getPath();
        a.docFile(tenFile);
        loadData(a.getA());
    }//GEN-LAST:event_btnDocFileActionPerformed

    public void loadData(ArrayList<NhanVien> b) {
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        for (NhanVien x : b) {
            String gioiTinh = x.isGioTinh() ? "Nam" : "Nữ";
            if (x instanceof NhanVienBanHang) {
                dtm.addRow(new Object[]{x.getMa(), x.getHoTen(), x.getNgaySinh(), x.getDiaChi(), gioiTinh, x.getLuongcoBan(), x.getSoNgayLamViec(), ((NhanVienBanHang) x).getSoLuongHangBan(), "", x.getTienLuong()});
            }
            if (x instanceof NhanVienQuanLy) {
                dtm.addRow(new Object[]{x.getMa(), x.getHoTen(), x.getNgaySinh(), x.getDiaChi(), gioiTinh, x.getLuongcoBan(), x.getSoNgayLamViec(), "", ((NhanVienQuanLy) x).getBoPhan(), x.getTienLuong()});
            }
        }
    }

    private void rbtNVBHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbtNVBHKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_rbtNVBHKeyTyped

    private void rbtNVQlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtNVQlMouseClicked
        // TODO add your handling code here:
        lblhang.setVisible(false);
        txtHang.setVisible(false);
        lblBoPhan.setVisible(true);
        txtBoPhan.setVisible(true);
    }//GEN-LAST:event_rbtNVQlMouseClicked

    private void rbtNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtNamMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtNamMouseClicked

    private void rbtNuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtNuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtNuMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int chon = JOptionPane.showConfirmDialog(null, "Bạn muốn lưu thông tin ");
        if (chon == 0) {
            int i = tblHienThi.getSelectedRow();
            String ma = txtMa.getText();
            String ten = txtTen.getText();
            boolean gt = rbtNam.isSelected(); // true là Nam, false là Nữ
            String dc = txtDiachi.getText();
            String ns = txtNgaySinh.getText();
            double luong = Double.parseDouble(txtLuong.getText());
            int ngay = Integer.parseInt(txtNgay.getText());
            int sl = Integer.parseInt(txtHang.getText());
            String bp = txtBoPhan.getText();
            NhanVien x;
            if (rbtNVBH.isSelected()) {
                x = new NhanVienBanHang(sl, ma, ten, ns, dc, ngay, luong, gt);
            } else {
                x = new NhanVienQuanLy(bp, ma, ten, ns, dc, ngay, luong, gt);
            }
            ArrayList<NhanVien> b = a.getA();
            b.set(i, x);
            a.setA(b);
            loadData(a.getA());
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void rbtNVBHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtNVBHMouseClicked
        // TODO add your handling code here:
        lblBoPhan.setVisible(false);
        txtBoPhan.setVisible(false);
        lblhang.setVisible(true);
        txtHang.setVisible(true);
    }//GEN-LAST:event_rbtNVBHMouseClicked

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        // TODO add your handling code here:

        a.sapXepGiamDanTheoTienLuong();
        loadData(a.getA());
    }//GEN-LAST:event_btnSapXepActionPerformed

    private void btnSlNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSlNVActionPerformed

    int countNhanVienBanHang = a.thongkeSLTungLoai(NhanVienBanHang.class.getSimpleName());
    int countNhanVienQuanLy = a.thongkeSLTungLoai(NhanVienQuanLy.class.getSimpleName());
    JOptionPane.showMessageDialog(this, "Số lượng Nhân Viên Bán Hàng: " + countNhanVienBanHang
            + "\nSố lượng Nhân viên Quản Lý: " + countNhanVienQuanLy);

    }//GEN-LAST:event_btnSlNVActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:

        String ma = txtMa.getText();
        String ten = txtTen.getText();
        boolean gt = rbtNam.isSelected(); // true là Nam, false là Nữ
        String dc = txtDiachi.getText();
        String ns = txtNgaySinh.getText();
        double luong = Double.parseDouble(txtLuong.getText());
        int ngay = Integer.parseInt(txtNgay.getText());
        int sl = Integer.parseInt(txtHang.getText());
        String bp = txtBoPhan.getText();
        NhanVien x;
        if (rbtNVBH.isSelected()) {
            x = new NhanVienBanHang(sl, ma, ten, ns, dc, ngay, luong, gt);
        } else {
            x = new NhanVienQuanLy(bp, ma, ten, ns, dc, ngay, luong, gt);
        }
        if (a.themNhaVien(x)) {
            loadData(a.getA());
        } else {
            JOptionPane.showMessageDialog(null, "Đã có mã " + ma + " này trong DS, nhập lại:");
        }


    }//GEN-LAST:event_btnThemActionPerformed

    private void tblHienThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHienThiMouseClicked
        // TODO add your handling code here:
        int i = tblHienThi.getSelectedRow();
        ArrayList<NhanVien> b = a.getA();
        NhanVien y = b.get(i);

        if (y instanceof NhanVienBanHang) {
            rbtNVBH.setSelected(true);
            txtHang.setText("" + ((NhanVienBanHang) y).getSoLuongHangBan());
            lblhang.setVisible(true);
            txtHang.setVisible(true);
            lblBoPhan.setVisible(false);
            txtBoPhan.setVisible(false);
        } else {
            rbtNVQl.setSelected(true);
            txtBoPhan.setText(((NhanVienQuanLy) y).getBoPhan());
            lblhang.setVisible(false);
            txtHang.setVisible(false);
            lblBoPhan.setVisible(true);
            txtBoPhan.setVisible(true);

        }
        txtMa.setText(y.getMa());
        txtTen.setText(y.getHoTen());
        txtNgaySinh.setText(y.getNgaySinh());
        txtDiachi.setText(y.getDiaChi());
        txtLuong.setText(String.valueOf(y.getLuongcoBan()));
        txtNgay.setText(String.valueOf(y.getSoNgayLamViec()));
        if (y.isGioTinh()) {
            rbtNam.setSelected(true);
        } else {
            rbtNu.setSelected(true);
        }


    }//GEN-LAST:event_tblHienThiMouseClicked

    private void btnLuongMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuongMaxActionPerformed
        // TODO add your handling code here:
 NhanVien nvLuongCaoNhat = a.nhanVienLuongCaoNhat();

    if (nvLuongCaoNhat != null) {
        JOptionPane.showMessageDialog(null, "Nhân viên có lương cao nhất: \n" + nvLuongCaoNhat.toString());
    } else {
        JOptionPane.showMessageDialog(null, "Không có nhân viên nào.");
    }
    
    }//GEN-LAST:event_btnLuongMaxActionPerformed

    private void btnTachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTachActionPerformed
        // TODO add your handling code here:
  String loai = JOptionPane.showInputDialog("Nhập loại nhân viên (NhanVienBanHang hoặc NhanVienQuanLy):");

if (loai != null && !loai.isEmpty()) {
    ArrayList<NhanVien> danhSachTheoLoai = a.layDanhSachTheoLoai(loai);

    if (!danhSachTheoLoai.isEmpty()) {
        StringBuilder message = new StringBuilder("Danh sách nhân viên loại " + loai + ":\n");

        for (NhanVien nhanVien : danhSachTheoLoai) {
            message.append(nhanVien.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, message.toString());
    } else {
        JOptionPane.showMessageDialog(null, "Không có nhân viên loại " + loai);
    }

}
    }//GEN-LAST:event_btnTachActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
       
    String maXoa = JOptionPane.showInputDialog("Nhập mã nhân viên cần xoá:");

    if (maXoa != null && !maXoa.isEmpty()) {
        boolean isDeleted = a.xoaTheoMa(maXoa);

        if (isDeleted) {
            JOptionPane.showMessageDialog(null, "Xoá nhân viên thành công!");
            loadData(a.getA()); // Reload the data after deletion
        } else {
            JOptionPane.showMessageDialog(null, "Không tìm thấy nhân viên có mã " + maXoa);
        }
    }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btnNVBanNhieuHangNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNVBanNhieuHangNhatActionPerformed
        // TODO add your handling code here:
           NhanVien mostSoldEmployee = a.nhanVienBanDuocNhieuNhat();
    if (mostSoldEmployee != null) {
        JOptionPane.showMessageDialog(null, "Nhân viên bán được nhiều hàng nhất: \n" + mostSoldEmployee.toString());
    } else {
        JOptionPane.showMessageDialog(null, "Không có dữ liệu bán hàng.");
    }
    }//GEN-LAST:event_btnNVBanNhieuHangNhatActionPerformed

    private void btnGhiFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiFileActionPerformed
        // TODO add your handling code here:
        a.ghiFile("NhanVien.txt");
        JOptionPane.showMessageDialog(null, "Ghi File Thành Công");
        
    }//GEN-LAST:event_btnGhiFileActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btXoa;
    private javax.swing.JButton btnDocFile;
    private javax.swing.JButton btnGhiFile;
    private javax.swing.JButton btnLuongMax;
    private javax.swing.JButton btnNVBanNhieuHangNhat;
    private javax.swing.JButton btnNghiMax;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnSlNV;
    private javax.swing.JButton btnTach;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBoPhan;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblGT;
    private javax.swing.JLabel lblLuong;
    private javax.swing.JLabel lblMa;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblTen;
    private javax.swing.JLabel lblhang;
    private javax.swing.JRadioButton rbtNVBH;
    private javax.swing.JRadioButton rbtNVQl;
    private javax.swing.JRadioButton rbtNam;
    private javax.swing.JRadioButton rbtNu;
    private javax.swing.JTable tblHienThi;
    private javax.swing.JTextField txtBoPhan;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtHang;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}