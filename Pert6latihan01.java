package pert6latihan01;

/**
 *
 * @author Ade Denha Gunawan 20104225
 */
public class luassegi3{

    /*
    Luas segi 3 = Alas + Tinggi * 0,5
    Luas Float/Double
    Tinggi= float/double
    alas= float/double
    */
    private float alas;
    private float tinggi;
    double luas;
    
    public luassegi3 (float AL, float TG){
       //this.setALAS(AL); cara kedua
      // this.setTINGGI(TG); cara kedua
      
       //this.HitungLuas();
       
       this.alas = AL;    //pakai yang ini
       this.tinggi = TG; //pakai yg ini
    }
    
    /*
    Method setALAS
    Parameter float AL
    Untuk set nilai ke property/Atribut alas
    */
    public void setAlas(float AL){
        // check validasi
        this.alas = AL;
    }
     /*
    Method setTINGGI
    Parameter float TG
    Untuk set nilai ke property/Atribut tinggi
    */
    public void setTinggi (float TG){
        this.tinggi = TG;
    }
    
    private double hitungluas(){
        this.luas = 0.5 * this.alas * this.tinggi;
        return this.luas;
    }
    public void CetakLuas(){
        this.HitungLuas();
        System.out.println("Hitung Luas Segi Tiga");
        System.out.println("---------------------");
        System.out.println("Nilai Alas   : "+this.alas+" cm");
        System.out.println("Nilai Tinggi : "+this.tinggi+" cm");
        System.out.println("Luas         : "+this.luas+" cm²");
        
        
    }
    
}