/*
 * Inlining "age" inside instance methods but not static function "main"
 */

class test_02 {
    public static void main(String[] no_arg) {
        Animal s;
        int ret;

        s = new Animal();
        ret = s.age();
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
