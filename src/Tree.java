public class Tree {
    static int nMax;
    public Tree(){
        nMax=0;
    }
    public static void drawTree(Turtle turtle, int l, int n, double lratio, int langle, int rangle){
        if(nMax==0){
            nMax=n;
        }
        if(n>=0) {
            turtle.penDown();
            turtle.forward(l);
            int x = turtle.getPosition().getX();
            int y = turtle.getPosition().getY();
            int heading = turtle.getHeading();
            turtle.left(heading-turtle.getHeading()+langle);
            drawTree(turtle, (int) (l * lratio), n - 1,lratio,langle,rangle);
            turtle.penUp();
            turtle.moveTo(x,y);
            turtle.penDown();
            turtle.right(heading-turtle.getHeading()+rangle);
            drawTree(turtle, (int) (l * lratio), n - 1,lratio,langle,rangle);
        }
    }
}
