package school.view;

import school.models.base.*;
import school.models.JuniorSchoolboy;
import school.models.MiddleShoolboy;
import school.models.SeniorSchoolboy;

public class Program {
    public static void main(String[] args) {
        Schoolboy[] schoolboys = new Schoolboy[]{new JuniorSchoolboy(),new MiddleShoolboy(),new SeniorSchoolboy()};
        for (Schoolboy schoolboy: schoolboys) {
            getInfo(schoolboy);
        }
    }
    public static void getInfo(Schoolboy schoolboy){
            schoolboy.study();
        if(schoolboy instanceof GameJuniorMiddle gameJuniorMiddle){
            gameJuniorMiddle.game();
        }
        if(schoolboy instanceof Aftercare aftercare){
            aftercare.isAftercare();
        }
        if(schoolboy instanceof Army army){
            army.isVoenkomat();            
        }
        if(schoolboy instanceof Cards cards){
            cards.playCards();
        }
        if (schoolboy instanceof DriverLicense driverLicense){
            driverLicense.isStudyingDrive();
        }
        if(schoolboy instanceof  Smoking smoking){
            smoking.isSmoking();
        }
    }
}
