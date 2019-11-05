/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118031.latihan47.nilaimahasiswa;

/**
 *
 * @author Vendetta
 */
public class Nilai {
 private double NA;
    private double Quiz;
    private double UTS;
    private double UAS;
    private char indeks;

    public double getQuiz() {
        return Quiz;
    }

    public void setQuiz(double Quiz) {
        this.Quiz = Quiz;
    }

    public double getUTS() {
        return UTS;
    }

    public void setUTS(double UTS) {
        this.UTS = UTS;
    }

    public double getUAS() {
        return UAS;
    }

    public void setUAS(double UAS) {
        this.UAS = UAS;
    }

    public double getNA() {
        return NA;
    }

    public void setNA(double NA) {
        this.NA = NA;
    }
    
    public char Indeks (){
        
        if ((NA > 80) && (NA <= 100)) {
        indeks = 'A';
    }   else if ((NA > 68) && (NA <= 80)) {
        indeks = 'B';
    }   else if ((NA > 56) && (NA <= 68)) {
        indeks = 'C';
    }   else if ((NA > 45) && (NA <= 56)) {
        indeks = 'D';
    }   else if ((NA >= 0) && (NA <= 45)) {
        indeks = 'E';
    }
        
        return indeks;
    }
    
    public String aturanKeterangan (){
        String keterangan = null;
        
        switch (indeks){
            case 'A' : 
                keterangan = ("Sangat Baik");
                break;
            case 'B' :
                keterangan = ("Baik");
                break;
            case 'C' :
                keterangan = ("Cukup");
                break;
            case 'D' :
                keterangan = ("Kurang");
                break;
            case 'E' :
                keterangan = ("Sangat Kurang");
                break;
            default :
                break;
        }
        
        return keterangan;
    }
    
    public double nilaiAkhir() {
        
        return NA = (Quiz * 0.2) + (UTS * 0.3) + (UAS * 0.5);
    }
}
