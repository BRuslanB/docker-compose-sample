package kz.bitlab.dockersample.dockercomposesample.services;

import kz.bitlab.dockersample.dockercomposesample.dto.ItemDto;

import java.util.List;

public interface ItemService {
    List<ItemDto> getItems();
    ItemDto getItem(Long id);
    ItemDto addItem(ItemDto itemDto);
}
