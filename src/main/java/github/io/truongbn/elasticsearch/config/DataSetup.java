package github.io.truongbn.elasticsearch.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;

import github.io.truongbn.elasticsearch.model.Item;
import github.io.truongbn.elasticsearch.repository.ItemRepository;
import github.io.truongbn.elasticsearch.service.CSVParser;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class DataSetup {
    private final ItemRepository itemRepository;
    private final CSVParser csvParser;
    @PostConstruct
    public void setupData() {
        List<Item> itemList = csvParser.csvParser("items.csv");
        itemRepository.saveAll(itemList);
    }
}
