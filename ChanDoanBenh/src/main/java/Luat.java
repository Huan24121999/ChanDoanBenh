package main.java;

public class Luat {
    public String vp;//ve phai luat
    public String vt;//ve trai luat

    public Luat()
    {}
    public Luat(String vt,String vp)
    {
        this.vt=vt;
        this.vp=vp;
    }

    public String toString()
    {
        return(this.vt+"  ->  "+this.vp);
    }

}
