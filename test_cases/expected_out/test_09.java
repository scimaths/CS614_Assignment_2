class test_09 {
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
        Cat t1;
        int t0;
        c = new Cat();
        t1 = c;
        t0 = 10;
        age = t0;
        return age;
    }
}

class Object {
    public int age() {
        int age;
        age = 0;
        return age;
    }
}

class AnimateObject extends Object {
}

class Animal extends AnimateObject {
    public int age() {
        int age;
        age = 10;
        return age;
    }
}

class Mammal extends Animal {
}

class Cat extends Mammal {
}
