class test_13 {
    public static void main(String[] args) {
        int number;
        Object a;
        number = 10;
        a = new Dog();
        System.out.println(a);
    }
}

class InheritanceTesting {
    public int check() {
        int age;
        Animal m;
        Animal t1;
        int t0;
        m = new Cat();
        t1 = m;
        t0 = 10;
        age = t0;
        return age;
    }
}

class Object {
}

class Animal extends Object {
    public int age() {
        int age;
        age = 10;
        return age;
    }
}

class Mammal extends Animal {
    public int age() {
        int age;
        age = 100;
        return age;
    }
}

class Cat extends Mammal {
}

class Dog extends Mammal {
}
