/**
 * Rectangle
 */
public class Rectangle {

    double width,lenght;

    // Accessor (to access value)
    public double getWidth(){
        return width;
    }
    public double getLenght(){
        return lenght;
    }

    // Mutators (to overide the value)
    public void setWidth(double w){
        width = w;
    }
    public void setLenght(double l){
        lenght = l;
    }

    public double getArea(){
        return width*lenght;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setWidth(5);
        System.out.println("Width is " + r1.getWidth());
    }
}