package JavaHomeWork.MidExam.five;

import JavaHomeWork.MidExam.five.Vehicle;

public class Bus implements Vehicle {
    @Override
    public void start() {
        System.out.println("公交车启动了");
    }

    @Override
    public void stop() {
        System.out.println("公交车停止了");


    }
}
