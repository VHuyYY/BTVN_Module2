package Ss6.Ke_Thua.Cirle_cylinder;

public class Main {
    public static void main(String[] args) {
        circle circle = new circle(2.5,"red");
        System.out.println(circle.toString());

        cylinder cylinder =new cylinder(300,10000,3.5,"none");
        System.out.println(cylinder.toString());
    }
}
