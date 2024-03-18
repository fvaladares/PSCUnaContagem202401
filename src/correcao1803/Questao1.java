package correcao1803;

import java.util.Scanner;

//Crie um algoritmo que leia um valor de hora (HH:MM) e informe (calcule)
// quantos minutos se passaram desde o início do dia (00:00).
public class Questao1 {

    public int minutos() {
        Scanner input = new Scanner(System.in);
        String horaString;
        int hora = 0;
        int minutos = 0;
        System.out.println();
        System.out.println("Por favor, informe a hora no formato HH:MM");
        horaString = input.next();
        String[] hora2 = horaString.split(":");

        hora = Integer.parseInt(hora2[0]);
        minutos = Integer.parseInt(hora2[1]);
        minutos += hora * 60;

        System.out.println("Se passaram " + minutos + " desde o início do dia.");



        return 10;
    }
}
