public class Main {
    public static void main(String[] args) {
        Turtle turtle = new Turtle(500, 500);
        turtle.moveTo(250,500);
        turtle.left(90);
        Tree.drawTree(turtle, 100, 5, 0.666, -5,30);
        Turtle turtle2 = new Turtle(200, 500);
        turtle2.moveTo(100,500);
        turtle2.left(90);
        Tree.drawTree(turtle2, 100, 5, 0.666, 15,15);
    }
}