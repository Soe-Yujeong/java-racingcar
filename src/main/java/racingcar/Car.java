package racingcar;

import java.util.Scanner;

public class Car {
    String carName;
    int position = 0;

    Scanner sc = new Scanner(System.in);

    public Car(String carName, int position){
        this.carName = carName;
        this.position = position;
    }

    public void writeName(String carName){
        carName = sc.nextLine();
        String[] carArr = carName.split(",");
    }
}
