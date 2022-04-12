package pert6latihan01;
/**
 *
 * @ade denha gunawan 20104225
 */
public class luassegi3 {
    private float alas;
    private float tinggi;
    double luas;
    
public luassegi3 (float AL,float TG){
    this.setAlas (AL);
    this.setTinggi (TG);
    
    this.alas = AL;
    this.tinggi = TG;
}
    public void setAlas(float AL) {
        this.alas = AL;
    }
    public void setTinggi(float TG) {
        this.tinggi = TG; 
    }
    double hitungluas(){
        this.luas = 0.5 * this.alas * this.tinggi; 
        return this.luas;
    }
    public void cetakluas() {
        this.hitungluas();
        System.out.println("********HITUNG LUAS SEGITIGA**********");
        System.out.println("NILAI Alas   :"+this.alas+"cm");
        System.out.println("NILAI Tinggi :"+this.tinggi+"cm");
        System.out.println("LUAS         :"+this.luas+"cm");
    }
}