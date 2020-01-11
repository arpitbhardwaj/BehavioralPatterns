package com.ab.memento;

import java.util.Stack;

public class Caretaker {

    Stack<WorkerMemento> workerMementoStack = new Stack<>();

    public void save(Worker worker){
        workerMementoStack.push(worker.save());
    }

    public void revert(Worker worker){
        worker.revert(workerMementoStack.pop());
    }
}
