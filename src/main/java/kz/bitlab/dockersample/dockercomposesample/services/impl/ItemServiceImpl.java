package kz.bitlab.dockersample.dockercomposesample.services.impl;

import kz.bitlab.dockersample.dockercomposesample.dto.ItemDto;
import kz.bitlab.dockersample.dockercomposesample.mapper.ItemMapper;
import kz.bitlab.dockersample.dockercomposesample.repository.ItemRepository;
import kz.bitlab.dockersample.dockercomposesample.services.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    @Override
    public List<ItemDto> getItems() {
        return itemMapper.toItemDtoList(itemRepository.findAll());
    }

    @Override
    public ItemDto getItem(Long id) {
        return itemMapper.toDto(itemRepository.findById(id).orElseThrow());
    }

    @Override
    public ItemDto addItem(ItemDto itemDto) {
        return itemMapper.toDto(itemRepository.save(itemMapper.toEntity(itemDto)));
    }
}
