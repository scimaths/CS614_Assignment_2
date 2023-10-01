class test_08 {
    public static void main(String[] args) {
        InheritanceTesting tester;
        int ret;
        tester = new InheritanceTesting();
        ret = tester.check();
        System.out.println(ret);
    }
}

class InheritanceTesting {
    public int check() {
        Cat c;
        int age;
        Cat t1;
        int t0;
        c = new Cat();
        t1 = c;
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

class Cat extends Animal {
    public int age() {
        int age;
        age = 100;
        return age;
    }
}
