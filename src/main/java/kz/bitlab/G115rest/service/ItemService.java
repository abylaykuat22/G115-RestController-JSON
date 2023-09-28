package kz.bitlab.G115rest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kz.bitlab.G115rest.model.Item;
import kz.bitlab.G115rest.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {
  private final ItemRepository itemRepository;

  public List<Item> getItems() {
    return itemRepository.findAll();
  }

  public Item addItem(Item item) {
    setAnotherCaption("COUNTRY KAZAKHSTAN", "123", "asdasd", "123213", "zxc");
    return itemRepository.save(item);
  }

  public void setAnotherCaption(String... text) {
    System.out.println(Arrays.toString(text));
  }

  public Item editItem(Item item) {
    return itemRepository.save(item);
  }

  public void deleteItemById(Long id) {
    itemRepository.deleteById(id);
  }

  public Item getItemById(Long id) {
    return itemRepository.findById(id).orElseThrow();
  }

  public List<Item> getFilteredItems(String search) {
    return itemRepository.findFilteredItems(search);
  }
}
