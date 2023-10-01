class test_18 {
    public static void main(String[] args) {
        int ret;
        Test_This_Usage tester;

        tester = new Test_This_Usage();
        ret = tester.check();
        System.out.println(ret);
    }
}

class Test_This_Usage {
    public int check() {
        Animal a;
        Animal b;
        int age;

        a = new Animal();
        b = a.copy();
        age = b.age();
        return age;
    }
}

class Animal {
    public Animal copy() {
        Animal x;
        x = this;
        return x;
    }

    public int age() {
        int age;
        age = 10;
        return age;
    }
}