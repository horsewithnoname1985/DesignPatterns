package chapter9;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator{
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> items) {
        this.items = items;

    }
    @Override
    public boolean hasNext() {
        if(position < items.size()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        MenuItem item = items.get(position);
        position += 1;
        return item;
    }
}
