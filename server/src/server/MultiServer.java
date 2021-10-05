package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {

    public static final int PORT = 8080;


    public static void main(String[] args) throws IOException{             //crea un oggetto istanza di MultiServer
        MultiServer ms = new MultiServer();
    }

    MultiServer() throws IOException{  //invoca il metodo privato run.
        run();
    }

    private void run() throws IOException {                         //assegna ad una variabile locale s il riferimento ad una istanza della classe ServerSocket creata usando la porta PORT. s si pone in attesa di richieste di connessione da parte di client in risposta alle quali viene restituito l’oggetto Socket da passare come argomento al costruttore della classe ServerOneClient.

        ServerSocket s = new ServerSocket(PORT);
        System.out.println("Server avviato");

        try {
            while (true) {
                Socket socket = s.accept();
                try {
                    new ServerOneClient(socket);
                } catch (IOException e) {
                    socket.close();
                }
            }
        }
            finally{
            s.close();
            }
        }
    }




