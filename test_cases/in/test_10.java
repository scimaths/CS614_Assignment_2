/*
 * Separate parent-child hierarchies work correctly - 
 * Stadium-CricketStadium & Animal-Cat
 */

class Test_10 {
    public static void main(String[] this_args) {
        int age;
        age = 10;
    }
}

class Inheritance_Testing {
    public int check() {
        int age;
        CricketStadium stadium;
        Cat cat;

        cat = new Cat();
        stadium = new CricketStadium();
        age = stadium.age();
        age = cat.age();
        return age;
    }
}

class Stadium {
    public int age() {
        int age;
        age = 100;
        return age;
    }
}

class CricketStadium extends Stadium {}

class Animal {}

class Cat extends Animal {
    public int age() {
        int age;
        age = 10;
        return age;
    }
}