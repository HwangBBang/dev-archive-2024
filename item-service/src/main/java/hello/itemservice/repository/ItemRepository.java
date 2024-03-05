package hello.itemservice.repository;

import hello.itemservice.domain.item.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ItemRepository {
    // 멀티 쓰레드 환경에서 여러개가 동시에 접근하기에 실무에서 해쉬맵을 사용하면 안된다.
    //  ConcurrentHashMap
    private static final Map<Long, Item> store = new HashMap<>();
    private static long sequence = 0L;

    public Item save(Item item) {
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    public Item findById(Long id) {
        return store.get(id);
    }
    public List<Item> findAll() {
        return new ArrayList<>(store.values());
    }

    public void update(Long itemId, Item updataParam) {
        Item findId = findById(itemId);
        findId.setItemName(updataParam.getItemName());
        findId.setPrice(updataParam.getPrice());
        findId.setQuantity(updataParam.getQuantity());
    }
    public void clearStore() {
        store.clear();
    }

}
