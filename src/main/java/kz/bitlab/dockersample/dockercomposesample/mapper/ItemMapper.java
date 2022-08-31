package kz.bitlab.dockersample.dockercomposesample.mapper;

import kz.bitlab.dockersample.dockercomposesample.dto.ItemDto;
import kz.bitlab.dockersample.dockercomposesample.model.Item;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    ItemDto toDto (Item item);
    Item toEntity (ItemDto itemDto);

    List<ItemDto> toItemDtoList(List<Item> itemList);
    List<Item> toItemList(List<ItemDto> itemDtoList);

}
