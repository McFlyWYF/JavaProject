package JavaHomeWork.test;

import java.io.File;
import java.io.IOException;

public class Test8 {

    public static void main(String[] args) {

        File f = new File("E:");
            System.out.println(f.getName());
            System.out.println(f.getParent());
            System.out.println(f.getParentFile());
            System.out.println(f.mkdirs());
    }
}
