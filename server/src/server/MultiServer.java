package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {

    private static final int PORT = 8080;


    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * @param args
     * main
     */
    public static void main(String[] args) throws IOException{             //crea un oggetto istanza di MultiServer
        MultiServer ms = new MultiServer();
    }

    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * invoca il metodo privato run
     */
    protected MultiServer() throws IOException{
        run();
    }


    /**
     * @author Raffaele Di Anna, Alessandro Carella, Alessandro congedo
     * assegna ad una variabile locale s il riferimento ad una istanza della classe ServerSocket creata usando la
     * porta PORT. s si pone in attesa di richieste di connessione da parte di client in risposta alle quali viene
     * restituito l’oggetto Socket da passare come argomento al costruttore della classe ServerOneClient.
     */
    private void run() throws IOException {

        ServerSocket s = new ServerSocket(PORT);
        System.out.println("Server avviato");

        try {
            while (true) {
                Socket socket = s.accept();
                System.out.println("client connesso");
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




