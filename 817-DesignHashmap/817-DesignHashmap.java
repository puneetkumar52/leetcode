// Last updated: 7/1/2026, 10:55:56 PM
class MyHashMap {
    List<Integer> keys;
    List<Integer> values;

    public MyHashMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(int key, int value) {
        if (keys.contains(key))
            values.set(keys.indexOf(key), value);
        else {
            keys.add(key);
            values.add(value);
        }
    }

    public int get(int key) {
        if (!keys.contains(key))
            return -1;
        return values.get(keys.indexOf(key));
    }

    public void remove(int key) {
        if (!keys.contains(key))
            return;
        int index = keys.indexOf(key);
        keys.remove(index);
        values.remove(index);
    }
}