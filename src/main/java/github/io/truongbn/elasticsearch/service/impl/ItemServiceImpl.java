package github.io.truongbn.elasticsearch.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import github.io.truongbn.elasticsearch.model.Item;
import github.io.truongbn.elasticsearch.repository.ItemRepository;
import github.io.truongbn.elasticsearch.service.ItemService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;
    @Override
    public List<Item> findByName(String itemName) {
        return itemRepository.findByName(itemName);
    }

    @Override
    public List<Item> findByCategory(String category) {
        return itemRepository.findByCategory(category);
    }

    @Override
    public List<Item> findByPriceBetween(double low, double high) {
        return itemRepository.findByPriceBetween(low, high);
    }
}
