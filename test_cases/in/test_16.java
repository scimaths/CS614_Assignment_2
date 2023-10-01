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

        a = new Animal();
        age1 = a.age();
        age1 = age1 * age1;
        age2 = a.age();
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