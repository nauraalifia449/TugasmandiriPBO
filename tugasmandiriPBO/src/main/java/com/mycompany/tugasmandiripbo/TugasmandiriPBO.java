/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasmandiripbo;

/**
 *
 * @author DIYA NAURA ALIFA
 */
public class TugasmandiriPBO {

    String namaBarang;
    String kategori;
    String lokasi;
    String status;
    
    TugasmandiriPBO(String namaBarang, String kategori, String lokasi, String status) {
        this.namaBarang = namaBarang;
        this.kategori = kategori;
        this.lokasi = lokasi;
        this.status = status;
    }
    
    void tampilkanInformasi() {
        System.out.println("=== LOSTLINK ===");
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Kategori    : " + kategori);
        System.out.println("Lokasi      : " + lokasi);
        System.out.println("Status      : " + status);
    }
    
    void ubahStatus(String statusBaru) {
        status = statusBaru;
        System.out.println("Status barang berhasil diperbarui!");
    }

    public static void main(String[] args) {
        
        TugasmandiriPBO barang1 = new TugasmandiriPBO(
                "Dompet",
                "Barang Pribadi",
                "Gedung Ilmu Komputer",
                "Hilang"
        );
        
        barang1.tampilkanInformasi();
        System.out.println();
        barang1.ubahStatus("Ditemukan");
        System.out.println();
        barang1.tampilkanInformasi();
    }
}
