package com.company;

public class Pair<Type_1, Type_2> {
    public Type_1 first;
    public Type_2 second;

    public Pair(Type_1 _first, Type_2 _second) {
        first = _first;
        second = _second;
    }

    public Type_1 getFirst(){
        return first;
    }
    public Type_2 getSecond(){
        return second;
    }
}