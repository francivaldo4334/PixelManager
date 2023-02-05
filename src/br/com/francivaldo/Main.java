package br.com.francivaldo;
public class Main{
    public static void main(String[] args) {
        new Main();
    }
    public Main(){
        Pixels pixels = new Pixels(7, 7,new int []{
            1,0,1,0,2,0,2,
            0,1,0,0,0,2,0,
            1,0,1,0,2,0,2,
            0,0,0,0,0,0,0,
            3,0,3,0,4,0,4,
            0,3,0,0,0,4,0,
            3,0,3,0,4,0,4
        });
        print(pixels);
        Pixels pixels1 = pixels.subPixels(0,0,3,3);
        print(pixels1);
        Pixels pixels2 = pixels.subPixels(4,4,3,3);
        print(pixels2);
        Pixels pixels3 = pixels.subPixels(4,4,6,6);
        print(pixels3);
        Pixels pixels4 = pixels.subPixels(-3,-3,3,3);
        print(pixels4);
        Pixels pixels5 = pixels.subPixels(3,3,-3,-3);
        print(pixels5);
        Pixels pixels6 = pixels.subPixels(5,5,3,3);
        print(pixels6);
    }
    private void print(Pixels pixels){
        int w = pixels.getW();
        int h = pixels.getH();
        int[] p = pixels.getArray();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(p[i*w+j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}