public class Shape {
    private double side = 1;
    private String color = "pink";

    public Shape(){
    }
    public Shape(double side, String color){
        this.side = side;
        this.color = color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public double[] getSide(){
        return new double[] {side};
    }
    public String toString(){
        return "side = "
                + side
                + ", color: "
                + color;
    }
}
