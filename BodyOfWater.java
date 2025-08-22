public class BodyOfWater {
    private String name;
    private int avgDepth;
    private int largestDiameter;
    private boolean isSaltWater;

    public BodyOfWater (String n, int a) {
        name = n;
        avgDepth = a; //meters
    }

    public BodyOfWater (String n, int a, int l, boolean i) {
        name = n;
        avgDepth = a; //meters
        largestDiameter = l; //kilometers
        isSaltWater = i;
    }

    public void setName (String n) {
        name = n;
    }

    public void setLargestDiameter (int l) {
        largestDiameter = l;
    }
     public void printState() {
        System.out.println("Name: " + name + "\nLargest Diameter: ");
     }
}
