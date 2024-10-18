package generic.ex1;

public class BoxMain2 {

    /*
        ObjectBox 를 사용할 경우, 재사용성이 높지만 타입 안정성이 떨어진다.
        IntegerBox / StringBox 를 사용할 경우, 타입 안정성이 높아진다.

        이 둘의 장점을 합한 것을 GenericBox 로 활용할 수 있다. -> BoxMain3
     */

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); //Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); //Object -> Integer 캐스팅
        System.out.println("str = " + str);

        //잘못된 타입의 인수 전달시
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외
        System.out.println("result = " + result);
    }

}