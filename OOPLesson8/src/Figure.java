public class Figure {
double pi = 3.14;
    void findCircle( int r){

        System.out.println(pi*r);
    }

    void findRectangle ( int w, int h){

        System.out.println(w*h);
    }

    void findCylinder(int r, int h){

        System.out.println(r*h);
    }



}

class Circle extends Figure{


}

class Rectangle extends Figure{


}

class Cylinder extends Figure{


}

class Test1 {
    public static void main(String[] args) {
    Circle c = new Circle();
    c.findCircle(4);

    Rectangle r = new Rectangle();
    r.findRectangle(3, 4);

    Cylinder d = new Cylinder();
    d.findCircle(5);

    }

}