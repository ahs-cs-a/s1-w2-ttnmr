public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b1 = new BodyOfWater("Lake Tahoe", 304);
        BodyOfWater b = new BodyOfWater("Lake Superior", 147, 560, false);
        System.out.println("here");
        b.printState();
        b1.printState();
    }
}
