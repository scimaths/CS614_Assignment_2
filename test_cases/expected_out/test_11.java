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
        Mammal t1;
        int t0;
        m = new Cat();
        t1 = m;
        t0 = 100;
        age = t0;
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

class Mammal extends Animal {
}

class Cat extends Mammal {
    public int age() {
        int age;
        age = 100;
        return age;
    }
}
