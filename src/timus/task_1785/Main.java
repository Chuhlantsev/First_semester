package timus.task_1785;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Введите количество монстров");
        int monsters = in.nextInt();

        if ((monsters >= 1) & (monsters <= 4)) {
            System.out.println("few");
        } else if ((monsters >= 5) & (monsters <= 9)) {
            System.out.println("several");
        } else if ((monsters >= 10) & (monsters <= 19)) {
            System.out.println("pack");
        } else if ((monsters >= 20) & (monsters <= 49)) {
            System.out.println("lots");
        } else if ((monsters >= 50) & (monsters <= 99)) {
            System.out.println("horde");
        } else if ((monsters >= 100) & (monsters <= 249)) {
            System.out.println("throng");
        } else if ((monsters >= 250) & (monsters <= 499)) {
            System.out.println("swarm");
        } else if ((monsters >= 500) & (monsters <= 999)) {
            System.out.println("zounds");
        } else if (monsters >= 1000) {
            System.out.println("legion");
        }
        }
    }