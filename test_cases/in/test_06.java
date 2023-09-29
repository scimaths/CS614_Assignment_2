/*
 * "System.out.println" is inlined correctly.
 */

class test_06 {
    public static void main(String[] agrs) {
        Animal s;

        s = new Animal();
        System.out.println(s);
    }
}

class Animal {
    public int checkPrinting() {
        Animal s;
        int age;

        s = new Animal();
        age = s.age();
        return age;
    }

    public int age() {
        int age;
        age = 10;
        System.out.println(age);
        return age;
    }
}