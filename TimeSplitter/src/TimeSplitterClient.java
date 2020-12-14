import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TimeSplitterClient {
    private String secPerTask;

    public void SetSec(String s) {
        this.secPerTask = s;
    }

    public String getSecPerTask() {
        return this.secPerTask;
    }

    public void startClient(TSPacket T) throws IOException, ClassNotFoundException {
        try (Socket socket = new Socket("localhost", 8080); Scanner scanner = new Scanner(System.in)) {

            System.out.println("connecting...");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            objectOutputStream.writeObject(T);
            String s = in.readLine();
            SetSec(s);

        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }
}
