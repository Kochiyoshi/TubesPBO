/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author GL522JX
 */
public class Aplikasi {
    List<Object> listOrang  = new ArrayList<Object>();
 //   private ArrayList<Orang> listOrang;
    Gudang g;
    Scanner scr = new Scanner(System.in);
    
    public void addPenyedia(Penyedia p){
        listOrang.add(p);
    }
    
    public void addPetugas(Petugas pt){
        listOrang.add(pt);
    }
    
    public Penyedia getPenyedia(String id){
        int i = 0;
        boolean get = false;
        while ((i < listOrang.size()) && (!get)){
            if ((listOrang.get(i) instanceof Penyedia) 
                    && (((Penyedia)listOrang.get(i)).id_penyedia)
                            .equalsIgnoreCase(id)){
                get=true;
            }else{
                i++;
            }
        }
        if (get){
            return ((Penyedia)listOrang.get(i));
        }else{
            return null;
        }
    }
    
    public Petugas getPetugas(String id){
        int i = 0;
        boolean get = false;
        while ((i < listOrang.size()) && (!get)){
            if ((listOrang.get(i) instanceof Petugas) 
                    && (((Petugas)listOrang.get(i)).getId())
                            .equalsIgnoreCase(id)){
                get=true;
            }else{
                i++;
            }
        }
        if (get){
            return ((Petugas)listOrang.get(i));
        }else{
            return null;
        }
    }
    
    public void pCreateBarang (Penyedia p){
            System.out.println("Tambah Barang");
            scr.nextLine();
            System.out.print("Nama Barang : ");
            String nama_bar = scr.nextLine();
            System.out.print("Id Barang : ");
            String id_bar = scr.nextLine();
            System.out.print("Jumlah Barang : ");
            int jum_bar = scr.nextInt();
            p.createBarang(nama_bar, id_bar, jum_bar);
    }
    
    public void DaftarBarang(Penyedia p){
        if(p.getnBarang() != 1){
                for(int i=1;i<p.getnBarang();i++){
                    System.out.println("No. "+(i));
                    System.out.println("ID Barang  : " +p.getBarang(i).id_bar);
                    System.out.println("Nama Barang : "+ p.getBarang(i).nama_bar);
                    System.out.println("Jumlah Barang  : " +p.getBarang(i).jum_bar);
                    System.out.println();
                }
        }else{
                System.out.println("Belum Ada Barang");
                scr.nextLine();
                scr.nextLine();
        }
    }
    
       public void DaftarBarangGudang(Gudang g){
        if(g.getnBarangGudang() != 1){
                for(int i=1;i<g.getnBarangGudang();i++){
                    System.out.println("No. "+(i));
                    System.out.println("ID Barang  : " +g.getBarangGUdang(i).id_bar);
                    System.out.println("Nama Barang : "+ g.getBarangGUdang(i).nama_bar);
                    System.out.println("Jumlah Barang  : " +g.getBarangGUdang(i).jum_bar);
                    System.out.println();
                }
        }else{
                System.out.println("Belum Ada Barang");
                scr.nextLine();
                scr.nextLine();
        }
    }
    
    public void tambahBarang(Penyedia a,Gudang g, int n){
        scr.nextLine();
        System.out.print("Id Barang : ");
        String id_bar = scr.nextLine();
        int i = 0;
        boolean get = false;
        while ((i < listOrang.size()) && (!get)){
            if ((listOrang.get(i) instanceof Penyedia) 
                    && (((Penyedia)listOrang.get(i)).getBarang(n).id_bar)
                            .equalsIgnoreCase(id_bar)){
                get=true;
            }else{
                i++;
            }
        }
        if(get){
            g.addBarang(a.getBarang(i).nama_bar, a.getBarang(i).id_bar, a.getBarang(i).jum_bar);
        }else{
            System.out.println("Barang Tidak Ada.");
            scr.nextLine(); 
        }
    }
    
    public void hapusBarang(Penyedia p, int n){
        System.out.println("Nomor Barang yang akan dihapus : ");
        int i = scr.nextInt();
        p.deleteBarang(i);
    }
    
    public void login(String id){
        if (getPenyedia(id) != null){
            System.out.println("error");
            menuPenyedia(getPenyedia(id));
        }else if (getPetugas(id)!= null){
            menuPetugas(getPetugas(id));
        }else{
            System.out.println("Anda Tidak Terdaftar");
            scr.nextLine();
        }
    }
    
     public void tambahOrang(char a,String id, String nama, int umur, String alamat){
        switch(a){
            case '1':
                addPenyedia(new Penyedia(id,nama,umur,alamat));
                break;
            case '2':
                addPetugas(new Petugas(id,nama,umur,alamat));
                break;
        }
    }
     
     public void menuPenyedia(Penyedia p){
        char pil='z';
        while (pil != '0'){
            System.out.println("MENU");
            System.out.println("1. Data Diri");
            System.out.println("2. Input Barang");
            System.out.println("3. Daftar Barang");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pil = scr.next().charAt(0);
            switch(pil){
                case '1':
                    System.out.println(" Data Diri ");
                    System.out.println("ID : "+p.getId_penyedia());
                    System.out.println("Nama : "+p.getNama());
                    System.out.println("Umur : "+p.getUmur());
                    System.out.println("Alamat : "+p.getAlamat());
                    break;
                case '2' :
                    pCreateBarang(p);
                    break;
                case '3' :
                    DaftarBarang(p);
                    break;
            }
        }
    }
     
    public void menuPetugas(Petugas pt){
        char pil='z';
        while (pil != '0'){
            System.out.println("MENU");
            System.out.println("1. Data Diri");
            System.out.println("2. Tambah Barang");
            System.out.println("3. Daftar Barang Gudang");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pil = scr.next().charAt(0);
            switch(pil){
                case '1':
                    System.out.println(" Data Diri ");
                    System.out.println("ID : "+pt.getId());
                    System.out.println("Nama : "+pt.getNama());
                    System.out.println("Umur : "+pt.getUmur());
                    System.out.println("Alamat : "+pt.getAlamat());
                    break;
                case '2' :
                    System.out.println("Masukkan id Penyedia");
                    scr.nextLine();
                    String id = scr.nextLine();
                    Penyedia p = getPenyedia(id);
                    DaftarBarang(p);
                    System.out.println("Masukkan No Barang : ");
                    int i = scr.nextInt();
                    tambahBarang(p,g,i);
                    break;
                case '3' :
                    DaftarBarangGudang(g);
                    break;
            }
        }
    }
    
    public void mainMenu(){
        char pil='z';
        while(pil != '0'){
            System.out.println("Menu");
            System.out.println("1. Login");
            System.out.println("2. Tambah Orang");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pil= scr.next().charAt(0);
            switch(pil){
                case '1':
                    System.out.println("LOGIN");
                    System.out.print("Masukkan Id Anda : ");
                    scr.nextLine();
                    String nm = scr.nextLine();
                    login(nm);
                    break;
                case '2':
                    System.out.println("TAMBAH ORANG");
                    scr.nextLine();
                    System.out.print("Id : ");
                    String id = scr.nextLine();
                    System.out.print("Nama : ");
                    String nama = scr.nextLine();
                    System.out.print("Umur : ");
                    int umur= scr.nextInt();
                    System.out.print("Alamat : ");
                    scr.nextLine();
                    String alamat = scr.nextLine();
                    char a='z';
                    while (a!='1' && a!='2'){
                        System.out.println("1. Penyedia");
                        System.out.println("2. Petugas");
                        System.out.print("Pilih : ");
                        a = scr.next().charAt(0);
                        tambahOrang(a,id,nama,umur,alamat);
                    }
                    break;
            }
        }
    }
    
}
