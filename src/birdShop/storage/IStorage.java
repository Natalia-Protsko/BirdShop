package birdShop.storage;

import birdShop.model.Bird;

import java.util.List;

public interface  IStorage {
    Bird add(Bird bird);

    Bird getByType(String type);

    Bird update(Bird bird);

    boolean delete (Bird bird);

    List<Bird> getAll();

    void printStorage();
    
}
