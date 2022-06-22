package com.codedifferently.assessment01.part03;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<T>{

    private ArrayList<T> elements;
    public MyStack(){
        this.elements = new ArrayList<>();
    }

    public boolean isEmpty() { return elements.isEmpty(); }

    public void push(T element) {
        elements.add(element);
    }

    public T pop() throws EmptyStackException {
        if(elements.isEmpty()){
            throw new EmptyStackException();
        }
        T Top = elements.get(elements.size()-1);
        elements.remove(elements.size()-1);
        return Top;

    }

    public T peek() {
        if(elements.isEmpty()){
            return null;
        }
        else{
            return elements.get(elements.size()-1);
        }
    }

    public Integer size(){
        return elements.size();
    }
}
