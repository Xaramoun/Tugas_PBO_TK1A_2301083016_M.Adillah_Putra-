/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083016.p04062024;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author konto
 */
public class AnggotaDao {
    private List<Anggota> data = new ArrayList();
    
    public AnggotaDao(){
        data.add(new Anggota("A001","Asep","Padang","L"));
        data.add(new Anggota("A002","Siti","Padang","P"));
    }
    
    public void insert(Anggota anggota){
        data.add(anggota);
    }
    
    public void update(int index,Anggota anggota){
        data.set(index, anggota);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    
    public List<Anggota> getAll(){
        return data;
    }
    
}