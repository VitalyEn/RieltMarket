import java.net.SocketOption;
import java.io.*;

public class Parser {
    public static void main(String[] args) {
        Flat flat_1 = new Flat(40, 4000000,1);
        System.out.println(flat_1.getSquare());
    }
}
