package school.models;

import school.models.base.Aftercare;
import school.models.base.GameJuniorMiddle;
import school.models.base.Schoolboy;

public class JuniorSchoolboy extends Schoolboy implements GameJuniorMiddle, Aftercare {
    @Override
    public void study() {
        System.out.println("Я люблю учиться!");
    }

    @Override
    public void game() {
        System.out.println("Я играю в игрушки");
    }

    @Override
    public void isAftercare() {
        System.out.println("Я хожу в продлёнку!");
    }

}

