package JavaHomeWork.MidExam.five;

import JavaHomeWork.MidExam.five.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("自行车启动了");

    }

    @Override
    public void stop() {
        System.out.println("自行车停止了");

    }
}
