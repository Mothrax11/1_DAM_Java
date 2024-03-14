package clases;

public class MainArrayDeInt {
    public static void main(String[] args) {
        ArrayDeInt arr = new ArrayDeInt();

        arr.setLenght(100);
        arr.setValue(4, 11);
        System.out.println(arr.get(4));
        System.out.println(arr.lenght());

    }
}
