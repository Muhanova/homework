package myjava.npp.homework.march22;

/**
 * Created by Даша on 28.03.14.
 */
public class ComplexNumber {
    private double re, im;//re-real, im - imaginary

    public ComplexNumber(double re, double im){
        this.re=re;
        this.im=im;
    }

    public ComplexNumber(){
        this.re=0;
        this.im=0;
    }
    public void setRe(double re){ this.re=re; }

    public void setIm(double im){
        this.im=im;
    }

    public double getRe(){
        return this.re;
    }

    public double getIm(){
        return this.im;
    }

    public String toString(ComplexNumber x){
        String s=new String();
        s= this.re+"+i*"+this.im;
        return s;
    }

    public boolean equals(ComplexNumber x, ComplexNumber y){
        if((x.getRe()==y.getRe())&&(x.getIm()==y.getIm()))
            return true;
        return false;
    }

    public double getModule(){
        return Math.sqrt(re * re + im * im);
    }

    public double getArg(){
        return Math.atan(im / re);
    }

    public void conjugate(){
        this.im=this.im*(-1);
    }

    public void sum(ComplexNumber complex){
        this.re+=complex.getRe();
        this.im+=complex.getIm();
    }

    public void difference(ComplexNumber complex){
        this.re-=complex.getRe();
        this.im-=complex.getIm();
    }

    public void productOnNumber(double number){
        this.re*=number;
        this.im*=number;
    }
}
