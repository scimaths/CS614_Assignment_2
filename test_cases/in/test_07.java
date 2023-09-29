/*
 * Function correctly inherited from parent (using CHA)
 */

class test_07 {
    public static void main(String[] args) {
        Animal s;

        s = new Animal();
        System.out.println(s);
    }
}

class Inheritance_Testing {
    public int check() {
        Cat c;
        int age;

        c = new Cat();
        age = c.age();
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

class Cat extends Animal {}
