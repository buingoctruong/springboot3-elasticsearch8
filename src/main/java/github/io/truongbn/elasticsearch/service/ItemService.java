package github.io.truongbn.elasticsearch.service;

import java.util.List;

import github.io.truongbn.elasticsearch.model.Item;

public interface ItemService {
    List<Item> findByName(String itemName);

    List<Item> findByCategory(String category);

    List<Item> findByPriceBetween(double low, double high);
}
