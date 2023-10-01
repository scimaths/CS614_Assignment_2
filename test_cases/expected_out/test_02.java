class test_02 {
    public static void main(String[] no_arg) {
        int ret;
        Test_Age_Inlining tester;
        tester = new Test_Age_Inlining();
        ret = tester.checkInlining();
        System.out.println(ret);
    }
}

class Test_Age_Inlining {
    public int checkInlining() {
        int value;
        Animal s;
        Animal t1;
        int t0;
        s = new Animal();
        t1 = s;
        t0 = 100;
        value = t0;
        return value;
    }
}

class Animal {
    public int age() {
        int age;
        age = 100;
        return age;
    }
}
