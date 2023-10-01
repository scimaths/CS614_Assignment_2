/*
 * Inlining "age" inside instance methods but not static function "main"
 */

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

        s = new Animal();
        value = s.age();
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
