package com.brainacad.prj2.Commands;

public enum  CommandNames {
    REMOVE,
    REPLACE,
    REVERSE,
    EXIT{
        public String toString() {
            return "";
        }
    };

    int Counter;

    private CommandNames() {
        Counter = 0;
    }

    public void incCounter(){
        Counter++;
    }
    public int getCounter(){
        return Counter;
    }

    @Override
    public String toString() {
        return this.name() + ": " + getCounter();
    }
}
