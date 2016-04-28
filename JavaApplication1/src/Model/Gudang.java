/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author GL522JX
 */
public class Gudang {
    private Barang[] daftarGudang = new Barang[20];
    private int nBarangGudang = 1;

    public Gudang(){
    }
    
    public void addBarang(String nama_bar, String id_bar, Integer jum_bar){
        if (nBarangGudang<=20){
            setBarangGudang(nama_bar, id_bar, jum_bar);
            nBarangGudang++;
        }else{
            System.out.println("Tidak Dapat Menambah Barang");
        }
    }
        
    public void setBarangGudang(String nama_bar, String id_bar,int jum_bar){
        daftarGudang[nBarangGudang] = new Barang(nama_bar, id_bar, jum_bar);
    }
       
    public Barang getBarangGUdang(int index){
        return daftarGudang[index];
    }

    public int getnBarangGudang() {
        return nBarangGudang;
    }
    
    
}
