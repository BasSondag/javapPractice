public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double sqrLegA = legA * legA;
        double sqrLegB = legB * legB;
        double legC =  Math.sqrt(sqrLegA + sqrLegB);
        return legC;
    }
}
