package com.brainacad.prj2.Commands;

public class CommandRemove extends AbstractStringTransform {

    int symbolCount;

//    public CommandRemove(String data, int symbolCount) {
//        super(data);
//        this.symbolCount = symbolCount;
//    }

    public CommandRemove(String data) {
        super(data);
        this.symbolCount = 1;
    }

    @Override
    public String exec() {
        String result = "";
        if (data != null && data.length() > this.symbolCount)
        result = this.data.substring(0, data.length()-this.symbolCount);
        return result;
    }
}
