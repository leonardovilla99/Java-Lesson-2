/**
 * Rectangle
 */
public class Rectangle {

    public double width,lenght;

    // Accessor (to access value)
    public double getWidth(){
        return width;
    }
    public double getLenght(){
        return lenght;
    }

    // Mutators (to overide the value)
    public void setWidth(double w){
        if(w>=0.0){
            width = w;
        }
    }
    public void setLenght(double l){
        if(l>=0.0){
            lenght = l;
        }
    }

    public double getArea(){
        return width*lenght;
    }

    // Costractor
    public Rectangle(double w, double l){
        width = w;
        lenght = l;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(20,40); // BUILD THE OBJECT (use new)
        System.out.println("Rectangle one is " + r1.getWidth() + " " + r1.getLenght());
        Rectangle r2 = new Rectangle(50,25);
        System.out.println("Rectangle two is " + r2.getWidth() + " " + r2.getLenght());

    }
}