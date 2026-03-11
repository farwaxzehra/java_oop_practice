package AreaOfRectangle;

class Rectangle_area {
    int length;
    int width;

    Rectangle_area(int length, int width){
        this.length = length;
        this.width = width;
    }

    int area(){
        int a = length * width;
        return a;
    }
}

public class Area{
    public static void main(String[] args) {
        Rectangle_area R1 = new Rectangle_area(5, 7);

        System.out.println("Area of Rectangle: " + R1.area());
    }
}


