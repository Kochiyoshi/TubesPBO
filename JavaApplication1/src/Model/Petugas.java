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
public class Petugas extends Orang {
    private String id;
    
    public Petugas(String id, String nama, Integer umur, String alamat){
        super(nama,umur,alamat);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
