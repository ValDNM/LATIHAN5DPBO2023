/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmahasiswa;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String nilai;
    private String gender;
    
    public Mahasiswa(String p_nim, String p_nama, String p_nilai, String p_gender){
        nim = p_nim;
        nama = p_nama;
        nilai = p_nilai;
        gender = p_gender;
    }
    
    public void setNim(String p_nim) {
        nim = p_nim;
    }
    
    public void setNama(String p_nama) {
        nama = p_nama;
    }
    
    public void setNilai(String p_nilai) {
        nilai = p_nilai;
    }
    
    public void setGender(String p_gender){
        gender = p_gender;
    }
    
    public String getNim() {
        return nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getNilai() {
        return nilai;
    }
    
    public String getGender(){
        return gender;
    }
}
