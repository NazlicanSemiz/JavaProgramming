package day20_Arrays;

import com.sun.security.jgss.GSSUtil;

public class task_1Array {
    public static void main(String[] args) {

        String [] names={"gulsah","havva","sumeyra","nazli","selcuk"};

for (int i=0; i < names.length; i++){
    String name= names[i];
    System.out.println(name);
}


        System.out.println("======================"); // for each

        for (String name: names){
            System.out.println(name);
        }
    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */