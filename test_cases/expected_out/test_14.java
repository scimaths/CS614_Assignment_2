class test_14 {
    public static void main(String[] args) {
        int ret;
        Object a;
        InheritanceTesting tester;
        a = new Mammal();
        tester = new InheritanceTesting();
        ret = tester.check();
        System.out.println(ret);
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
        t0 = 100;
        age = t0;
        return age;
    }
}

class Object {
}

class AnimateObject extends Object {
    public int age() {
        int age;
        age = 10;
        return age;
    }
}

class Animal extends AnimateObject {
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
