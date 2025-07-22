public class Circle{  //Nested class example
    static double x,y;
    static double r;
    @SuppressWarnings("static-access")
    Circle(double r){
        this.r = r;
    }
    public static class point{
        double x,y;
        void display(){
            System.out.println("(x,y) : (" +this.x+","+this.y+")");
        }
        point(double a ,double b){
            this.x = a;
            this.y = b;
        }
    } 
    public boolean inInside(point p){
        double dx = p.x-x;
        double dy = p.y-y;
        double distance = Math.sqrt((dx*dx)+(dy*dy));
        return distance < r;
    }
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Circle a = new Circle(2.0);
        point pa = new point(1,2);
        pa.display();
        System.out.println(a.inInside(pa));
        Circle b = new Circle(1);
        point pb = new point(3,3 );
        System.out.println(b.inInside(pb));;
    }

}

