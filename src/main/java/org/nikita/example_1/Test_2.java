package org.nikita.example_1;

import java.util.Random;

public class Test_2 {

    public static void main(String[] args) {

        //Задача продемонстрировать, когда while предпочтительнее
        //Задача:
        //Попробуем реализовать игру в казино

        Player player = new Player("Витя АК", 100);
        Azino777 azino777 = new Azino777(player);
        azino777.playGame();
    }

}

class Player{

    String name;
    int bank;

    public Player(String name, int bank) {
        this.name = name;
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", bank=" + bank +
                '}';
    }
}

class Azino777 {

    Player player;

    public Azino777(Player player) {
        this.player = player;
    }

    public void playGame (){
        System.out.println("***Начало игры***");
        System.out.println("Игрок: " + player.name);
        System.out.println("Банк игрока: " + player.bank);
        //Представим, что хотим создать видимость того, что выйграть реально,
        // дадим игроку выйграть 4 раза подряд
        for (int i = 0; i < 4; i++){
            giveHope();
        }
        while (player.bank > 0) {
            steal();
        }
        System.out.println("---Конец игры, Azino выйграл---");
    }

    private void giveHope() {
        Random random = new Random();
        int chance = random.nextInt(8,11);
        System.out.println("На костях выпало: " + chance);
        System.out.println("Игрок " + player.name + " выйграл 10$");
        player.bank += 10;
        System.out.println(player);
    }

    private void steal() {
        Random random = new Random();
        int chance = random.nextInt(11);
        System.out.println("На костях выпало: " + chance);
        if (chance < 8){
            System.out.println("Игрок " + player.name + " проиграл 10$");
            player.bank = player.bank - 10;
        } else {
            System.out.println("Игрок " + player.name + " выйграл 10$");
            player.bank += 10;
        }
        System.out.println(player);
    }

}
