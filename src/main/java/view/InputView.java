package view;

import java.util.*;

public class InputView {
    public static int inputTime() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return new Scanner(System.in).nextInt();
    }

    public static String inputNameOfCars() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return new Scanner(System.in).nextLine();
    }

}
