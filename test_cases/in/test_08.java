/*
 * Function correctly inherited from own implementation, not parent (using CHA)
 */

class Test_8 {
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

class Cat extends Animal {
    public int age() {
        int age;
        age = 100;
        return age;
    }
}
