package com.alextheedom.functionalinterface;

import java.util.Arrays;

/**
 * Created by developer on 15/11/2015.
 */
public class UseVarArgInterface {

static String useOp(){

    VarArgInterface var = Arrays::toString;
    // VarArgInterface var = Object::toString;
    var = args -> String.valueOf(args.length);


    return var.op(new String[]{"", ""});
}

}
