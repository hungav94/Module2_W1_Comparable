public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        double percent;
//        percent = Math.random() * 100;
//        circle.resize(percent);

        Circle[] circles = new Circle[3];

        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle();
        }

        for (int i = 0; i < circles.length; i++) {
            percent = Math.random() * 100;
            circles[i].resize(percent);
        }

        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i].toString());
        }
    }
}
