package com.brainacad.prj2.Commands;

public class CommandReplace extends AbstractStringTransform{

    public CommandReplace(String data) {
        super(data);
//        invokeCount++;
    }

    @Override
    public String exec() {
        return this.data.replace("_", "");
    }
}
