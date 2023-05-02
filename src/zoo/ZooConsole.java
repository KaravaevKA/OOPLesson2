package zoo;

import zoo.base.Console;

import java.util.HashSet;

public class ZooConsole extends Console {
    private HashSet<String> typeAnimals;
    private Zoo zooPark;

    private void initCommand() {
        commands.add(" Добавлять новых животных в зоопарк");
        commands.add(" Убрать животное из зоопарка");
        commands.add(" Показать информацию о конкретном животном");
        commands.add(" Показать информацию о всех животных в зоопарке на данный момент");
        commands.add(" Заставить животное издавать звук");
        commands.add(" заставлять издавать звук всех животных");
    }

    private void initAnimalList() {
        typeAnimals = new HashSet<>();
        typeAnimals.add("Кошка");
        typeAnimals.add("Курица");
        typeAnimals.add("Собака");
        typeAnimals.add("Тигр");
        typeAnimals.add("Волк");
        typeAnimals.add("Аист");
    }

    public ZooConsole() {
        super();
        zooPark = new Zoo();
        initCommand();
        initAnimalList();
        start();
    }

    @Override
    protected void compel(int num) {
        switch (num) {
            case 0:
                addAnimal();
                break;
            case 1:
                removeAnimal();
                break;
            case 2:
                infoAnimal();
                break;
            case 3:
                getInfoAll();
                break;
            case 4:
                voice();
                break;
            case 5:
                voiceAll();
                break;
        }
    }
    private void voiceAll(){
        zooPark.getVoice();
    }
    private void voice() {
        System.out.println("Введите номер из списка животного: ");
        int index = scanner.nextInt();
        zooPark.get(index).getVoice();
    }

    private void getInfoAll() {

        zooPark.getInfoAll();
    }

    private void infoAnimal() {
        System.out.println("Введите номер из списка животного");
        int index = scanner.nextInt();
        System.out.println(zooPark.get(index));
    }

    private void removeAnimal() {
        System.out.println("Убрать животное из списка напишите его индекс");
        int index = scanner.nextInt();
        zooPark.remove(index);
    }

    private void addAnimal() {
        System.out.println("Выберите животное ");
        for (var element : typeAnimals) {
            System.out.println(element);
        }
        String typeName = scanner.next();
        while (!typeAnimals.contains(typeName)) {
            System.out.println("Животное не найдено ");
            System.out.println("Выберите животное: ");
            for (var element : typeAnimals) {
                System.out.println(element);
            }
            typeName = scanner.next();
        }
        System.out.println("Введите рост животного : ");
        double height = scanner.nextDouble();
        System.out.println("Введите вес животного : ");
        double weight = scanner.nextDouble();
        System.out.println("Введите цвет глаз : ");
        String eyeColor = scanner.next();
        if (typeName.equals("Кошка") ||
                typeName.equals("Собака")) {
            System.out.println("Введите кличку: ");
            String name = scanner.next();
            System.out.println("Введите породу: ");
            String breed = scanner.next();
            System.out.println("Вакцинирован(+ :да, иначе-нет): ");
            String f = scanner.next();
            boolean isVaccinated = f.toLowerCase().equals('+');
            System.out.println("Введите цвет шерсти: ");
            String furColor = scanner.next();
            System.out.println("Введите дату рождения: ");
            String dateOfBirth = scanner.next();
            if (typeName.equals("Кошка")){
                System.out.println("Имеет шерсть (+ :да, иначе нет): ");
                String f1 = scanner.next();
                boolean hasWool = f1.toLowerCase().equals('+');
                zooPark.add(new Cat(height, weight, eyeColor, name, breed, furColor,dateOfBirth, isVaccinated));
            }
            if (typeName.equals("Собака")){
                System.out.println("Наличие дрессировки (+:да, иначе-нет): ");
                boolean isTrained = scanner.next().toLowerCase().equals('+');
                zooPark.add(new Cat(height, weight, eyeColor, name, breed,  furColor,dateOfBirth, isVaccinated));
            }
        }
        if (typeName.equals("Курица") ||
                typeName.equals("Аист")){

            System.out.println("Введите высоту полета : ");
            double flyingHeight = scanner.nextDouble();
            if(typeName.equals("Курица")){
                zooPark.add(new Chicken(height, weight, eyeColor,flyingHeight));
            }
            if(typeName.equals("Аист")){
                zooPark.add(new Stork(height, weight, eyeColor,flyingHeight));
            }
        }
        if (typeName.equals("Волк") ||
                typeName.equals("Тигр")){

            System.out.println("Введите местопложение : ");
            String location = scanner.next();
            System.out.println("Введите дату нахождения : ");
            Double dateOfLocation = Double.valueOf(scanner.next());
            if(typeName.equals("Волк")){
                System.out.println("Лидер? (+:да, иначе-нет): ");
                boolean isTrained = scanner.next().toLowerCase().equals("+");
                zooPark.add(new Wolf(height, weight, eyeColor, location, dateOfLocation, isTrained));
            }
            if(typeName.equals("Тигр")){
                zooPark.add(new Tiger(height, weight, eyeColor, location, dateOfLocation));
            }
        }
    }
}
