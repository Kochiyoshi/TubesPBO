/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author GL522JX
 */
public class Penyedia extends Orang {
    String id_penyedia;
    private Barang[] daftarBarang = new Barang[10];
    private int nBarang = 1;
    
    public Penyedia(String id_penyedia, String nama, Integer umur, String alamat){
        super(nama,umur,alamat);
        this.id_penyedia = id_penyedia;
    }
    
    public void createBarang(String nama_bar, String id_bar, Integer jum_bar){
        if (nBarang<=10){
            setBarang(nama_bar, id_bar, jum_bar);
            nBarang++;
        }else{
            System.out.println("Tidak Dapat Menambah Barang");
        }     
    }
    
    public void setBarang(String nama_bar, String id_bar, Integer jum_bar){
        daftarBarang[nBarang] = new Barang(nama_bar,id_bar,jum_bar);
    }

    public Barang getBarang(int index){
        return daftarBarang[index];
    }
    
    public void deleteBarang(int index){
        if (index == (nBarang-1)){
            daftarBarang[index] = null;     
            nBarang--;
        }else if (index < (nBarang-1)){
            for (int i = index; i<10; i++){
                daftarBarang[i]=daftarBarang[i+1];
            }
            nBarang--;
        }else{
            System.out.println("Index Barang Tidak Ada");
        }
    }

    public int getnBarang() {
        return nBarang;
    }
    
    public String getId_penyedia() {
        return id_penyedia;
    }

    public void setId_penyedia(String id_penyedia) {
        this.id_penyedia = id_penyedia;
    }
   
}
