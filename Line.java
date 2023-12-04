
public class Line {
    private int x1, y1, x2, y2;
    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public static void display(){
        System.out.println("Welcome to Line Comparison Computation Program");
    }
    public static void main(String[] args) {

        display();

        Line line1 = new Line(15, 15, 20, 20);
        Line line2 = new Line(5, 5, 10, 10);
        double line1Length = Math.sqrt(Math.pow((line1.x2 - line1.x1), 2) + Math.pow((line1.y2 - line1.y1), 2));
        double line2Length = Math.sqrt(Math.pow((line2.x2 - line2.x1), 2) + Math.pow((line2.y2 - line2.y1), 2));
        if (line1Length == line2Length){
            System.out.println("The lines are equal");
        }
        else{
            System.out.println("The lines are not equal");
        }
    }
}
