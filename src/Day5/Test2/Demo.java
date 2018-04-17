package Day5.Test2;

interface PCI {
    public void open();

    public void close();
}

class MainBoard {
    public void run() {
        System.out.println("main run");
    }

    public void usePCI(PCI p) {
        if (p == null) {

        } else {
            p.open();
            p.close();
        }
    }
}

class NetCard implements PCI {

    @Override
    public void open() {
        System.out.println("open");
    }

    @Override
    public void close() {
        System.out.println("close");
    }
}

public class Demo {

    public static void main(String[] args) {
        MainBoard mainBoard = new MainBoard();
        mainBoard.run();
        mainBoard.usePCI(null);
        mainBoard.usePCI(new NetCard());
    }
}
