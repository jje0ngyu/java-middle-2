package generic.ex1;

public class RowTypeMain {

    /*
        원시 타입 / 로 타입 (row type)
        : 제네릭 타입을 사용할 때는 <> 를 사용해서 타입을 지정한다.
          그런데, <> 를 지정하지 않는 것을 로 타입(row type), 또는 원시 타입이라 한다.
          로 타입을 사용하면 타입 매개변수가 Object 로 자동 설정된다.

        * 로 타입 (row type)은 사용하지 않아야 한다.
        * Object 타입을 사용해야 한다면 타입 인자를 Object 로 지정해서 사용한다.
     */

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        //GenericBox<Object> integerBox = new GenericBox<>(); // 권장 !!
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}