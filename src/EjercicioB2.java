import java.io.*;
import java.util.Date;

public class EjercicioB2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = reader.readLine();

        for(int i = 0 ; i < 16 ; i+=2){
            if(inputLine.charAt(i) == '9'){
                System.out.println("F");
                return;
            }
        }
        System.out.println("S");
    }
}



