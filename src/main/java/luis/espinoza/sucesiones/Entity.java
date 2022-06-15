/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.espinoza.sucesiones;

/**
 *
 * @author Espinoza
 */
public class Entity {
    //terminos
    private double  an;
    private double  ao;
    private double  ap;
    
    //subindices
    private  int n;
    private  int o;
    private  int p;
    
    //variables necesarias de las formulas
    private double d;
    private double r;
    private double x;
    private String sucesion;

    public Entity() {
    }

    public Entity(double an, double ao, double ap, int n, 
            int o, int p, double d, double r, double x, String sucesion) {
        this.an = an;
        this.ao = ao;
        this.ap = ap;
        this.n = n;
        this.o = o;
        this.p = p;
        this.d = d;
        this.r = r;
        this.sucesion = sucesion;
    }

  

   

    public double getAn() {
        return an;
    }

    public void setAn(double an) {
        this.an = an;
    }

    public double getAo() {
        return ao;
    }

    public void setAo(double ao) {
        this.ao = ao;
    }

    public double getAp() {
        return ap;
    }

    public void setAp(double ap) {
        this.ap = ap;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getO() {
        return o;
    }

    public void setO(int o) {
        this.o = o;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getSucesion() {
        return sucesion;
    }

    public void setSucesion(String sucesion) {
        this.sucesion = sucesion;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

}
