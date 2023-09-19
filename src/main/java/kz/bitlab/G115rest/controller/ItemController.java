package kz.bitlab.G115rest.controller;

import java.util.List;
import kz.bitlab.G115rest.model.Item;
import kz.bitlab.G115rest.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/items")
@RequiredArgsConstructor
public class ItemController {
  private final ItemService itemService;

  @GetMapping
  public List<Item> getItems() {
    return itemService.getItems();
  }

  @PostMapping
  public Item addItem(@RequestBody Item item) {
    return itemService.addItem(item);
  }

  @PutMapping
  public Item editItem(@RequestBody Item item) {
    return itemService.editItem(item);
  }

  @DeleteMapping("{id}")
  public void deleteItem(@PathVariable Long id) {
    itemService.deleteItemById(id);
  }

  @GetMapping("{id}")
  public Item getItem(@PathVariable Long id) {
    return itemService.getItemById(id);
  }

  @GetMapping("/search")
  public List<Item> getFilteredItems(@RequestParam String search) {
    return itemService.getFilteredItems(search);
  }
}
