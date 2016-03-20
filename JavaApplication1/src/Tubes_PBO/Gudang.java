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
public class Gudang {
    private Barang[] daftar = new Barang[10];
    private int n;
    
    public void create_barang(Barang b){
        if (n > 10){
            System.out.println("Barang sudah penuh");
        }else{
            this.daftar[n] = b;
            this.n++;
        }
    }
    
    public Barang get_barang(int n){
        return this.daftar[n];
    }
    
    public void remove(){
        
    }
}
