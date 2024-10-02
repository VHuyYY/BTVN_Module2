package Ss6.Ke_Thua.Cirle_cylinder;

public class cylinder {
    private double height =1.0;
    private double volume = 1.0;
    public cylinder(){}
    //    public  Cylinder (double height,double volume){
//        this.height=height;
//        this.volume=volume;
//    }
    public cylinder(double height,double volume , double radius , String color){
        super();
        this.volume=volume;
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return volume *height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString (){
        return "Hinh tru co chieu cao bang " + this.height + " co the tich bang " + getVolume() + super.toString();
    }
}
