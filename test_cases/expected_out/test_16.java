class test_16 {
    public static void main(String[] args) {
        int ret;
        Test_Single_Method_Multiple_Calls tester;
        tester = new Test_Single_Method_Multiple_Calls();
        ret = tester.check();
        System.out.println(ret);
    }
}

class Test_Single_Method_Multiple_Calls {
    public int check() {
        Animal a;
        int age1;
        int age2;
        Animal t3;
        int t2;
        Animal t1;
        int t0;
        a = new Animal();
        t1 = a;
        t0 = 10;
        age1 = t0;
        age1 = age1 * age1;
        t3 = a;
        t2 = 10;
        age2 = t2;
        return age2;
    }
}

class Animal {
    public int age() {
        int age;
        age = 10;
        return age;
    }
}
