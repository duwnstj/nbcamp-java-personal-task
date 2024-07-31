package calculator;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {
    public static final double circumference = 3.14;
    // 사칙 연산을 할 때는 원주율의 값이 필요가 없기 때문에 static을 사용하여 클래스 멤버로 만들어준다.
    // 원주율의 값인 3.14는 절대 바뀌지 않는 상수이기때문에 final을 사용해준다.
    private final List<Double> results;


    public Calculator(List<Double> results) {
        this.results = results;
    }


    public void removeResult(int index) {
        this.results.remove(index);
    }

    abstract void inquiryResults();


    public List<Double> getResults() {
        return results;
    }


}
