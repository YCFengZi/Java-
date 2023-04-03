import java.util.Scanner;

public class Usb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        USB usb1 = new Mouse();
        usb1.work();
        usb1.stop();
        USB[] usbs = new USB[2];
        usbs[0] = new Upan();
        usbs[1] = new Mouse();
        for (USB u : usbs) {
            u.work();
            u.stop();
        }
    }
}
interface USB {
    void work();
    void stop();
}

class Mouse implements USB {
    @Override
    public void work() {
        System.out.println("我点点点");
    }
    @Override
    public void stop() {
        System.out.println("我不能点了");
    }
}

class Upan implements USB {
    @Override
    public void work() {
        System.out.println("我存存存");
    }
    @Override
    public void stop() {
        System.out.println("我走了");
    }
}
