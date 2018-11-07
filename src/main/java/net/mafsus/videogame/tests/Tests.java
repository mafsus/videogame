package net.mafsus.videogame.tests;

import java.util.ArrayList;
import java.util.List;

public class Tests {
    static List<ITest> tests;
    static{
        tests = new ArrayList();
    }
    public static void registerTest(ITest test){
        tests.add(test);
    }
    public static void runInitialTests(){
        for(ITest test : tests) test.runInitialTest();

    }
    public static void runContinuousTests(){
        for(ITest test : tests) test.runContinousTest();

    }
}
