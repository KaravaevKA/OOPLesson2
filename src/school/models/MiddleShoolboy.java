package school.models;

import school.models.base.Cards;
import school.models.base.GameJuniorMiddle;
import school.models.base.Schoolboy;
import school.models.base.Smoking;

public class MiddleShoolboy extends Schoolboy implements GameJuniorMiddle, Smoking, Cards {

    @Override
    public void study() {
        System.out.println("Я ненавижу учиться!");
    }

    @Override
    public void game() {
        System.out.println("Я играю в Minecraft!");
    }
    @Override
    public void isSmoking(){
        System.out.println("Я начинаю курить...");
    }

    @Override
    public void playCards() {
        System.out.println("Я играю в Мафию");
    }
}
