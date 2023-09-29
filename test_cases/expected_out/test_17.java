class test_17 {
    public static void main(String[] args) {
        int number;
        number = 10;
        System.out.println(number);
    }
}

class Test_Conditional_Loop_And_Array {
    public int check() {
        Array a;
        int number1;
        int number2;
        int arraysize;
        boolean addall;
        int t0;
        boolean t1;
        Array t10;
        int[] t6;
        Array t7;
        int t8;
        int t9;
        int t5;
        int t4;
        int t3;
        boolean t2;
        int t11;
        boolean t12;
        Array t21;
        int[] t17;
        Array t18;
        int t19;
        int t20;
        int t16;
        int t15;
        int t14;
        boolean t13;
        arraysize = 5;
        addall = true;
        a = new Array();
        t0 = arraysize;
        t1 = addall;
        t10 = a;
        t8 = 0;
        t3 = 0;
        t5 = 1;
        t7 = new Array();
        t6 = t7.init(t0);
        if (t1) {
            t8 = t3;
        } else {
            t9 = t0 - t5;
            t2 = t3 <= t9;
            while (t2) {
                t4 = t6[t9];
                t8 = t8 + t4;
                t9 = t9 - t5;
                t2 = t3 <= t9;
            }
        }
        number1 = t8;
        addall = false;
        t11 = arraysize;
        t12 = addall;
        t21 = a;
        t19 = 0;
        t14 = 0;
        t16 = 1;
        t18 = new Array();
        t17 = t18.init(t11);
        if (t12) {
            t19 = t14;
        } else {
            t20 = t11 - t16;
            t13 = t14 <= t20;
            while (t13) {
                t15 = t17[t20];
                t19 = t19 + t15;
                t20 = t20 - t16;
                t13 = t14 <= t20;
            }
        }
        number2 = t19;
        return number1;
    }
}

class Array {
    public int[] init(int size) {
        int[] array;
        int index;
        int zero;
        int one;
        boolean checkbound;
        zero = 0;
        one = 1;
        index = size - one;
        array = new int[size];
        checkbound = zero <= index;
        while (checkbound) {
            array[index] = index;
            index = index - one;
            checkbound = zero <= index;
        }
        return array;
    }

    public int sum(int size, boolean addall) {
        int[] array;
        Array dummy;
        int sum;
        int index;
        int one;
        int element;
        int zero;
        boolean checkbound;
        int t0;
        Array t6;
        int[] t1;
        int t4;
        int t5;
        int t3;
        boolean t2;
        sum = 0;
        zero = 0;
        one = 1;
        dummy = new Array();
        t0 = size;
        t6 = dummy;
        t5 = 0;
        t3 = 1;
        t4 = t0 - t3;
        t1 = new int[t0];
        t2 = t5 <= t4;
        while (t2) {
            t1[t4] = t4;
            t4 = t4 - t3;
            t2 = t5 <= t4;
        }
        array = t1;
        if (addall) {
            sum = zero;
        } else {
            index = size - one;
            checkbound = zero <= index;
            while (checkbound) {
                element = array[index];
                sum = sum + element;
                index = index - one;
                checkbound = zero <= index;
            }
        }
        return sum;
    }
}
