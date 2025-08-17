package com.vladproduction.lilies_on_lake;

import java.util.Scanner;

public class FlowersLily01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        FlowersLily01 flowers = new FlowersLily01();
        flowers.run(n);
    }

    private void run(int n) {
        int dayNumber = countDay(n);
        System.out.println(dayNumber);
    }

    private int countDay(int n) {
        return n - 1;
    }
}
//На лісовому озері почали цвісти лілії, У перший день розцвіла одна лілія, а потім кожен день
// кількість квітучих лілій подвоювалась. На n-ий день все озеро було покрите квітучими лілямі.
// А на який день була покрита квітучими ліліями половина поверхні озера?
//Вхідні дані
//Номер дня n (1 < n ≤ 200), на який вся поверхня озера була покрита квітучими ліліями.
//Вихідні дані
//День, на який була покрита ліліями половина поверхні озера.
