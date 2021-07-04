/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pyramids;

/**
 *
 * @author hp
 */
public class Pyramids {
    private String Pharaoh	       ;
    private String Ancient_name	       ;
    private String Modern_name	       ;
    private int Dynasty	       ;
    private String Site	               ;
    private double Base1_m	       ;
    private double Base2_m	       ;
    private double Height_m	       ;


    public String getPharaoh() {
        return Pharaoh;
    }

    public void setPharaoh(String Pharaoh) {
        this.Pharaoh = Pharaoh;
    }

    public String getAncient_name() {
        return Ancient_name;
    }

    public void setAncient_name(String Ancient_name) {
        this.Ancient_name = Ancient_name;
    }

    public String getModern_name() {
        return Modern_name;
    }

    public void setModern_name(String Modern_name) {
        this.Modern_name = Modern_name;
    }

    public int getDynasty() {
        return Dynasty;
    }

    public void setDynasty(int Dynasty) {
        this.Dynasty = Dynasty;
    }

    public String getSite() {
        return Site;
    }

    public void setSite(String Site) {
        this.Site = Site;
    }

    public double getBase1_m() {
        return Base1_m;
    }

    public void setBase1_m(double Base1_m) {
        this.Base1_m = Base1_m;
    }

    public double getBase2_m() {
        return Base2_m;
    }

    public void setBase2_m(double Base2_m) {
        this.Base2_m = Base2_m;
    }

    public double getHeight_m() {
        return Height_m;
    }

    public void setHeight_m(double Height_m) {
        this.Height_m = Height_m;
    }


    public Pyramids(String Pharaoh, String Ancient_name, String Modern_name, int Dynasty, String Site, double Base1_m, double Base2_m, double Height_m) {
        this.Pharaoh = Pharaoh;
        this.Ancient_name = Ancient_name;
        this.Modern_name = Modern_name;
        this.Dynasty = Dynasty;
        this.Site = Site;
        this.Base1_m = Base1_m;
        this.Base2_m = Base2_m;
        this.Height_m = Height_m;
    }

    @Override
    public String toString() {
        return "Pyramids{" + "Pharaoh=" + Pharaoh + ", Ancient_name=" + Ancient_name + ", Modern_name=" + Modern_name + ", Dynasty=" + Dynasty + ", Site=" + Site + ", Base1_m=" + Base1_m + ", Base2_m=" + Base2_m + ", Height_m=" + Height_m + '}';
    }


    
    
    
}
