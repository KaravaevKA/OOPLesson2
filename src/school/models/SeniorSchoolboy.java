package school.models;

import school.models.base.Army;
import school.models.base.DriverLicense;
import school.models.base.Schoolboy;
import school.models.base.Smoking;

public class SeniorSchoolboy extends Schoolboy implements Smoking, Army, DriverLicense {
    @Override
    public void study(){
        System.out.println("Я должен учиться");
    }

    @Override
    public void isSmoking() {
        System.out.println("Я бросаю курить!");
    }

    @Override
    public void isVoenkomat() {
        System.out.println("Боюсь военкома");
    }

    @Override
    public void isStudyingDrive() {
        System.out.println("Я хочу водить");
    }
}
