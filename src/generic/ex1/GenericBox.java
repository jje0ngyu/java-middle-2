package generic.ex1;

/*
    ## 용어 정리 ##
    1. 제네릭 타입 (Generic Type)
        - 클래스, 인터페이스를 모두 합쳐서 호칭
        - GenericBox<T> 를 제네릭 타입이라 칭함
    2. 타입 매개변수 (Type Parameter)
        - GenericBox<T> 에서 T를 타입 매개변수라 칭함
        - 제네릭 타입이나 메서드에서 사용되는 변수. 실제 타입으로 대체
    3. 타입 인자 (Type Argument)
        - 제네릭 타입을 사용할 때 제공되는 실제 타입
        - ex) GenericBox<Integer> 에서 Integer 를 타입 인자라 칭함
 */
public class GenericBox<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}