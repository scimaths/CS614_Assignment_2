class test_17 {
    public static void main(String[] args) {
        int ret;
        Test_Conditional_Loop_And_Array tester;
        tester = new Test_Conditional_Loop_And_Array();
        ret = tester.check();
        System.out.println(ret);
    }
}

class Test_Conditional_Loop_And_Array {
    public int check() {
        Array a;
        int number1;
        int number2;
        int arraysize;
        boolean addall;
        int t11;
        boolean t12;
        Array t21;
        int[] t18;
        Array t19;
        int t20;
        int t16;
        int t15;
        int t14;
        int t13;
        boolean t17;
        int t0;
        boolean t1;
        Array t10;
        int[] t7;
        Array t8;
        int t9;
        int t5;
        int t4;
        int t3;
        int t2;
        boolean t6;
        arraysize = 5;
        addall = true;
        a = new Array();
        t0 = arraysize;
        t1 = addall;
        t10 = a;
        t9 = 0;
        t2 = 0;
        t4 = 1;
        t8 = new Array();
        t7 = t8.init(t0);
        if (t1) {
            t9 = t2;
        } else {
            t5 = t0 - t4;
            t6 = t2 <= t5;
            while (t6) {
                t3 = t7[t5];
                t9 = t9 + t3;
                t5 = t5 - t4;
                t6 = t2 <= t5;
            }
        }
        number1 = t9;
        addall = false;
        t11 = arraysize;
        t12 = addall;
        t21 = a;
        t20 = 0;
        t13 = 0;
        t15 = 1;
        t19 = new Array();
        t18 = t19.init(t11);
        if (t12) {
            t20 = t13;
        } else {
            t16 = t11 - t15;
            t17 = t13 <= t16;
            while (t17) {
                t14 = t18[t16];
                t20 = t20 + t14;
                t16 = t16 - t15;
                t17 = t13 <= t16;
            }
        }
        number2 = t20;
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
        int[] t4;
        int t5;
        int t3;
        int t2;
        boolean t1;
        sum = 0;
        zero = 0;
        one = 1;
        dummy = new Array();
        t0 = size;
        t6 = dummy;
        t3 = 0;
        t2 = 1;
        t5 = t0 - t2;
        t4 = new int[t0];
        t1 = t3 <= t5;
        while (t1) {
            t4[t5] = t5;
            t5 = t5 - t2;
            t1 = t3 <= t5;
        }
        array = t4;
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
