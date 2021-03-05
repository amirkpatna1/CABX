import java.net.*;
import java.io.*;

public class UrlTextfile {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL(
                "https://docs.google.com/document/d/10G1uglWppd47udiAuPUy7reKWcTGijwEwQGkPbqf9Bo/edit?usp=sharing");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}