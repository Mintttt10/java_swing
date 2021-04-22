package javaapplication4;
import java.text.NumberFormat;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class DH {
   private string Ten;
   private long Ma;
   private long SoDT;
   private string DiaChiDH;
   private string TenNgGui;
   private string TenNgNhan;
   private string DiaChiG;
   private string DiaChiN;

    public DH() {
    }

    public DH(string Ten, long Ma, long SoDT, string DiaChiDH, string TenNgGui, string TenNgNhan, string DiaChiG, string DiaChiN) {
        this.Ten = Ten;
        this.Ma = Ma;
        this.SoDT = SoDT;
        this.DiaChiDH = DiaChiDH;
        this.TenNgGui = TenNgGui;
        this.TenNgNhan = TenNgNhan;
        this.DiaChiG = DiaChiG;
        this.DiaChiN = DiaChiN;
    }

    public string getTen() {
        return Ten;
    }

    public void setTen(string Ten) {
        this.Ten = Ten;
    }

    public long getMa() {
        return Ma;
    }

    public void setMa(long Ma) {
        this.Ma = Ma;
    }

    public long getSoDT() {
        return SoDT;
    }

    public void setSoDT(long SoDT) {
        this.SoDT = SoDT;
    }

    public string getDiaChiDH() {
        return DiaChiDH;
    }

    public void setDiaChiDH(string DiaChiDH) {
        this.DiaChiDH = DiaChiDH;
    }

    public string getTenNgGui() {
        return TenNgGui;
    }

    public void setTenNgGui(string TenNgGui) {
        this.TenNgGui = TenNgGui;
    }

    public string getTenNgNhan() {
        return TenNgNhan;
    }

    public void setTenNgNhan(string TenNgNhan) {
        this.TenNgNhan = TenNgNhan;
    }

    public string getDiaChiG() {
        return DiaChiG;
    }

    public void setDiaChiG(string DiaChiG) {
        this.DiaChiG = DiaChiG;
    }

    public string getDiaChiN() {
        return DiaChiN;
    }

    public void setDiaChiN(string DiaChiN) {
        this.DiaChiN = DiaChiN;
    }
   
   }
  
   
    
    

