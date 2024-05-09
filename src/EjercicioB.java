import java.util.Date;
import java.util.Scanner;

class EjercicioB{
    public static void main(String[] args){
        Date startime = new Date();

        Scanner ent = new Scanner(System.in);

        String input = ent.nextLine();
        ent.close();

        String[] lista = input.split(" ");

        for(int i = 0; i < 8; i++){
            if(lista[i].equals("9")){
                System.out.println("F");
                return;
            }
        }

        System.out.println("S");

        Date endTime = new Date();

        long elapsedTime = endTime.getTime() - startime.getTime(); // Diferencia en milisegundos
        System.out.println("Tiempo de ejecución en milisegundos: " + elapsedTime);
    }
}
