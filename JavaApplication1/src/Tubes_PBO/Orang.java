/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tubes_PBO;

/**
 *
 * @author GL522JX
 */
public abstract class Orang 
{
    private String nama;
    private int umur;
    private String alamat;
    
    public void set_nama(String nama){
        this.nama = nama;
    }
    
     public void set_umur(int umur){
        this.umur = umur;
    }
    
     public void set_alamat(String alamat){
        this.alamat = alamat;
    }
    
    public String get_nama(){
        return this.nama;
    }
    
     public int get_umur(){
        return this.umur;
    }
    
     public String get_alamat(){
        return this.alamat;
    }
}
