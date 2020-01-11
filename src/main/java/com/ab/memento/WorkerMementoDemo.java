package com.ab.memento;

public class WorkerMementoDemo {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Worker worker = new Worker();
        worker.setName("Arpit");
        worker.setAddress("BNB Layout");
        worker.setPhone("878675645");

        System.out.println("Worker before save " + worker);
        caretaker.save(worker);
        worker.setPhone("12345");
        caretaker.save(worker);
        System.out.println("Worker after changed number" + worker);
        worker.setPhone("767676767");
        caretaker.revert(worker);
        System.out.println("Revet to last save point" + worker);
        caretaker.revert(worker);
        System.out.println("Revet to original" + worker);
    }
}
