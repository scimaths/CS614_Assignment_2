/*
 * Not inlining "age" inside static function "main"
 */

class test_01 {
    public static void main(String[] args) {
        Animal s;
        int ret;

        s = new Animal();
        ret = s.age();
        System.out.println(ret);
    }
}

class Animal {
    public int age() {
        int age;
        age = 100;
        return age;
    }
}