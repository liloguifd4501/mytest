package com.Jay;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        Persion p =new Persion();
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());
//        int age = 19;
//        char c = 'A';
//        byte b = 120;
//        float weight = 45.5f;
//        float height = 1.7f;
//        boolean adult = true;
//        boolean enroll = false;
//        String name = "Tom";
    }
}
