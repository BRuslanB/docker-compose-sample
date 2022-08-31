package kz.bitlab.dockersample.dockercomposesample.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDto {
    private Long id;
    private String name;
    private int amount;
    private double price;
}
