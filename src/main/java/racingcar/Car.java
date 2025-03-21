package racingcar;

import java.util.ArrayList;
import java.util.List;
import static camp.nextstep.edu.missionutils.Console.readLine;
import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Car {

    public String getCar(String carName){
        return carName;
    }

    public void writeName(){ //차 이름 받기
        String cars = readLine();
        String[] carArr = cars.split(",");
        List<Car> carList = new ArrayList<>();

        for (int i =0; i < carList.size(); i++){ //리스트에 차 이름 넣기
            carList.get(i);
        }
    }

    public void moveCar(int position){ //차 움직이기
        int rand = pickNumberInRange(1, 9);

        if(rand >= 4){
            position +=1;
        }
    }


}
