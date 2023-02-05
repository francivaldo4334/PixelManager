package br.com.francivaldo;

public class Pixels {
    private int w,h;
    private int[] pixels;
    public Pixels(int w,int h){
        this.w = w;
        this.h = h;
        pixels = new int[w*h];
    }
    public Pixels(int w,int h,int[] p){
        this.w = w;
        this.h = h;
        this.pixels = new int[w*h];
        for (int i = 0;i < p.length; i++) {
            this.pixels[i] = p[i];
        }
    }
    public int getW() {
        return w;
    }
    public int getH() {
        return h;
    }
    public int[] getArray(){
        return pixels;
    }
    public Pixels subPixels(int x,int y,int w,int h){
        if(w+x>this.w)
            w -= (w+x)-this.w;
        if(h+y>this.h)
            h -= (h+y)-this.h;
        if(x<0) x = 0;
        if(y<0) y = 0;
        int[] sp;
        sp = new int[w*h];
        for (int i = 0; i < w; i++)
            for (int j = 0; j < h; j++)
                sp[j*w+i] = this.pixels[(j+y)*this.w+(i+x)];
        Pixels responsePixels = new Pixels(w, h,sp);
        System.out.println("w="+w+",h="+h+",x="+y+",y="+y);
        return responsePixels;
    }
    public void setPixel(int x,int y,int p){
        this.pixels[y*w+x] = p;
    }
    public int setPixel(int x,int y){
        return this.pixels[y*w+x];
    }
}
