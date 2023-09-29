/*
 * Inlining of dynamically-bound function using RTA
 */

class test_11 {
    public static void main(String[] args) {
        int number;

        number = 10;
        System.out.println(number);
    }
}

class InheritanceTesting {
    public int check() {
        int age;
        Mammal m;
        
        m = new Cat();
        age = m.age();
        return age;
    }
}

class Animal {
    public int age() {
        int age;

        age = 10;
        return age;
    }
}

class Mammal extends Animal {}

class Cat extends Mammal {
    public int age() {
        int age;

        age = 100;
        return age;
    }
}