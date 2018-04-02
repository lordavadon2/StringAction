package com.brainacad.prj2.Commands;

public abstract class AbstractStringTransform implements ICommandExec {
    String data;
//    static int invokeCount = 0;
    public AbstractStringTransform(String data){
        this.data = data;
//        invokeCount++;
    }

//    public abstract String transform();

    @Override
    public abstract String exec();
//    public static int getInvokeCount() {
//        return invokeCount;
//    }
}
