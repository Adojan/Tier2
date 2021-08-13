package TierTwo.controllers;

import TierTwo.models.Item;
import TierTwo.services.IAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdministratorController
{
    @Autowired
    IAdministratorService administratorService;

    @PostMapping("/item")
    public String addItem(@RequestBody Item item)
    {
         return administratorService.addItem(item);
    }

    @GetMapping("/item/{id}")
        public List<Item> getItem(int itemId)
        {
            return administratorService.getItem(itemId);
        }
    @GetMapping("/item")
    public List<Item> getItems()
    {
        return administratorService.getItems();
    }


    @DeleteMapping("/item/{id}")
        public void deleteItem(@PathVariable int itemId)
        {
             administratorService.deleteItem(itemId);
        }

    @PutMapping("/item/{id}")
        public void editItem (@RequestBody Item item)
        {
             administratorService.editItem(item);
        }

}
