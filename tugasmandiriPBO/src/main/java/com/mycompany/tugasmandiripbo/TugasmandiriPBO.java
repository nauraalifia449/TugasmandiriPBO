/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasmandiripbo;

/**
 *
 * @author DIYA NAURA ALIFA
 */
public class TugasmandiriPBO {

    private String namaBarang;
    private String kategori;
    private String lokasi;
    private String status;
    
    TugasmandiriPBO(String namaBarang, String kategori, String lokasi, String status) {
        setNamaBarang(namaBarang);
        setKategori(kategori);
        setLokasi(lokasi);
        setStatus(status);
    }
    public String getNamaBarang(){
        return namaBarang;
    }
    public String getKategori(){
        return kategori;
    }
    public String getLokasi(){
        return lokasi;
    }
    public String getStatus(){
        return status;
    }
    
    public void setNamaBarang(String namaBarang){
        if (namaBarang != null && !namaBarang.isEmpty()){
            this.namaBarang = namaBarang;
        }else {
            System.out.println("Nama barang tidak boleh kosong.");
        }
    }
    
    public void setKategori(String kategori){
        if (kategori !=null && !kategori.isEmpty()){
            this.kategori = kategori;
        } else {
            System.out.println("Kategori tidak boleh kosong.");
        }
    }
    
        public void setLokasi(String lokasi){
            if (lokasi !=null && !lokasi.isEmpty()){
                this.lokasi = lokasi;
            }else{
                System.out.println("Lokasi tidak boleh kosong.");
            }
        }
        
        public void setStatus(String status) {
            if (status.equals("Hilang") || status.equals("Ditemukan")){
                this.status = status;
            } else {
                System.out.println("Status harus hilang atau ditemukan.");
            }
        }
        
    void tampilkanInformasi() {
        System.out.println("=== LOSTLINK ===");
        System.out.println("Nama Barang : " + getNamaBarang());
        System.out.println("Kategori    : " + getKategori());
        System.out.println("Lokasi      : " + getLokasi());
        System.out.println("Status      : " + getStatus());
    }
    
    
    public static void main(String[] args){
   
        TugasmandiriPBO barang1 = new TugasmandiriPBO(
                "Dompet",
                "Barang Pribadi",
                "Gedung Ilmu Komputer",
                "Hilang"
        );
        
        barang1.tampilkanInformasi();
        System.out.println();
        barang1.setStatus("Ditemukan");
        System.out.println();
        barang1.tampilkanInformasi();
    }
}
