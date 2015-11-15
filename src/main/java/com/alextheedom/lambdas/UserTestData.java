package com.alextheedom.lambdas;


import java.util.Random;

public class UserTestData {
    private static final String[] EXAMPLE_HANDLES = new String[]{"aaa", "bbb",
            "ccc", "ddd", "eee", "fff", "gee", "ggg", "hhh", "iii", "jjj",
            "kkk", "lll", "mmm", "nnn", "ooo", "ppp", "qqq", "rrr", "sss",
            "ttt", "uuu", "vvv", "www", "xxx", "yyy", "zzz"};

    public static void main(String[] args) {
        Random random = new Random();
        new StubService(() -> EXAMPLE_HANDLES[random.nextInt(27)]).run();
    }
}
