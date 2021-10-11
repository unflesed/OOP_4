package OOP_4.Task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.println("Введите play или record для записи или проигрывания соответственно.");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.equals("play")) {
            player.play();
            System.out.println("Для остановки проигрывания введите pause или stop.");
            str = sc.next();
            if (str.equals("pause")) {
                player.pause();
            }else if (str.equals("stop")) {
                player.stop();
            }else{
                player.play();
            }
        }else if (str.equals("record")) {
            player.record();
            System.out.println("Для остановки записи введите pause или stop.");
            str = sc.next();
            if (str.equals("pause")) {
                player.pause();
            }else if (str.equals("stop")) {
                player.stop();
            }else{
                player.record();
            }
        }else{
            System.out.println("Вы ввели неверную комманду.");
        }
    }
}
