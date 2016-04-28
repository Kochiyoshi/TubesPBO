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
public class Barang 
{
    String nama_bar;
    String id_bar;
    int jum_bar;

    public Barang(){
        
    }
    
    public Barang(String nama_bar, String id_bar, int jum_bar){
        this.nama_bar = nama_bar;
        this.id_bar = id_bar;
    }
    
    public String getNama_bar() {
        return nama_bar;
    }

    public void setNama_bar(String nama_bar) {
        this.nama_bar = nama_bar;
    }

    public String getId_bar() {
        return id_bar;
    }

    public void setId_bar(String id_bar) {
        this.id_bar = id_bar;
    }

    public int getJum_bar() {
        return jum_bar;
    }

    public void setJum_bar(int jum_bar) {
        this.jum_bar = jum_bar;
    }
    
    @Override
    public String toString() {
        String s = "nama_bar=" + nama_bar +"\n"+ ", id_bar=" + id_bar +"\n"+ ", jum_bar=" + jum_bar;
        return s;
    }    
}
