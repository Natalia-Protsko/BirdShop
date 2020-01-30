package birdShop.storage;

import birdShop.model.Bird;

import java.util.ArrayList;
import java.util.List;

public class ListStorage implements IStorage {

    List<Bird> birds;

    public ListStorage() {
        this.birds = new ArrayList<Bird>();
    }

    public List<Bird> getBirds() {
        return birds;
    }


    @Override
    public Bird add(Bird bird) {
        Bird birdInList = getByType(bird.getType());
        if (birdInList==null){
            birds.add(bird);
            return bird;
        }
        else{
            birdInList.setAmount(birdInList.getAmount()+bird.getAmount());
            return birdInList;
        }
    }


    @Override
    public Bird getByType(String type) {
        for (Bird bird : birds) {
            if (bird.getType().equals(type)  ){
                return bird;
            }
        }
        return null;
    }

    @Override
    public Bird update(Bird bird) {
        return null;
    }

    @Override
    public boolean delete(Bird bird) {
        return false;
    }

    @Override
    public List<Bird> getAll() {
        return birds;
    }

    @Override
    public void printStorage(){
        for (Bird bird : birds) {
            System.out.println(bird);

        }

    }
}
