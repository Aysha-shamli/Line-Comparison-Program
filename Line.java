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

        Line line = new Line(15, 15, 20, 20);
        double lineLength = Math.sqrt(Math.pow((line.x2 - line.x1), 2) + Math.pow((line.y2 - line.y1), 2));
        System.out.println("Length of the line between Point 1 and Point 2 is: " + lineLength);
    }
}
