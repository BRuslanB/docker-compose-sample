package kz.bitlab.dockersample.dockercomposesample.api;

import kz.bitlab.dockersample.dockercomposesample.dto.ItemDto;
import kz.bitlab.dockersample.dockercomposesample.services.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/items")
@RequiredArgsConstructor
public class MainRestController {

    private final ItemService itemService;

    @GetMapping
    public List<ItemDto> getItems(){
        return itemService.getItems();
    }

    @GetMapping(value = "{id}")
    public ItemDto getItem(@PathVariable(name = "id") Long id){
        return itemService.getItem(id);
    }

    @PostMapping
    public ItemDto addItem(@RequestBody ItemDto itemDto){
        return itemService.addItem(itemDto);
    }
}
