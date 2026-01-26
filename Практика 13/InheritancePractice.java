// Родительский класс
import java.util.ArrayList;

class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void makeSound() {
        System.out.println("Животное издаёт звук");
    }
    
    // Дополнительное задание 1: метод info()
    public void info() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}

// Дочерний класс Dog
class Dog extends Animal {
    private String breed; // Дополнительное задание 2
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Порода: " + breed);
    }
}

// Дочерний класс Cat
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}

// Точка входа
public class InheritancePractice {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик", 3, "Немецкая овчарка");
        Cat cat = new Cat("Мурка", 2);
        
        // Дополнительное задание 3: ArrayList
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        
        // Добавляем птицу как пример
        class Bird extends Animal {
            public Bird(String name, int age) {
                super(name, age);
            }
            
            @Override
            public void makeSound() {
                System.out.println("Чирик!");
            }
        }
        
        animals.add(new Bird("Попугай", 1));
        
        // Вызываем методы
        for (Animal animal : animals) {
            animal.makeSound();
            animal.info();
        }
    }
}
