public class Main {
    public static void main(String[] args) {
        Shape s = new Shape(1,"red");
        System.out.println(s);

        Triangle tr1 = new Triangle(1);
        System.out.println(tr1);

        Triangle tr2 = new Triangle(4,5,6,"blue");
        System.out.println(tr2);

    }
}
