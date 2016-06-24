package com.java.Interface;

import java.util.Arrays;

class Processor{
    public String name(){
        return getClass().getSimpleName();
    }
    //��������д�δ˷���ʱ������������string  int ��
    Object process(Object input){
        return input;
    }
}

class Upcase extends Processor{
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}

class Downcase extends Processor{
    String process(Object input){
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor{
    String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}

public class Apply{
    public static void process(Processor p,Object s){
        System.out.println("Using Processor"+p.name());
        System.out.println(p.process(s));
    }
    public static String s="this is a Sup--Sub Coupling";
    public static void main(String[] args){
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }
}