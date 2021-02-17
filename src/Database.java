import java.util.HashMap;

public class Database<KeyType, ValType> {
    private HashMap<KeyType, ValType> db;

    public Database() {
        db = new HashMap<KeyType, ValType>();
    }

    public Database(int capacity) {
        db = new HashMap<KeyType, ValType>(capacity);
    }

    public boolean put(KeyType key, ValType val) {
        db.put(key, val);
        return true;
    }

    public ValType get(KeyType key) {
        return db.get(key);
    }

    public int size() {
        return db.size();
    }
}
