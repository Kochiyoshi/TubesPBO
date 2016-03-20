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
public class Barang 
{
    private String nama_bar;
    private String id_bar;
    
    public void setnama(String nama_bar){
        this.nama_bar = nama_bar;
    }
    
    public void setid(String id_bar){
        this.id_bar = id_bar;
    }
    
    public String getnama(){
        return this.nama_bar;
    }
    
    public String getid(){
        return this.id_bar;
    }
}
