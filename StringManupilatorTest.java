public class StringManupilatorTest {
    public static void main(String[] args) {
        StringManupilator manupilator = new StringManupilator();
        String str = manupilator.trimAndConcat(" Hello ", " World ");
        System.out.println(str); // HelloWorld

        char letter = 'o';
        Integer a = manupilator.getIndexOrNull("Coding", letter);
        Integer b = manupilator.getIndexOrNull("Hello World", letter);
        Integer c = manupilator.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null

        String word = "Hello";
        String subStr = "llo";
        String notSubStr ="World";

        Integer d = manupilator.getIndexOrNull(word, subStr);
        Integer e = manupilator.getIndexOrNull(word, notSubStr);
        System.out.println(d); //2
        System.out.println(e); // null
    }
}
