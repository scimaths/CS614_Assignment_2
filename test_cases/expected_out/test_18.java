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
        Animal t1;
        Animal t0;
        Animal t3;
        int t2;
        a = new Animal();
        t1 = a;
        t0 = t1;
        b = t0;
        t3 = b;
        t2 = 10;
        age = t2;
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
