package ru.tinkoff.academy.libotanic.garden

import org.springframework.stereotype.Component

@Component
class GardenMapper {
    fun toDto(garden: Garden) = with(garden) {GardenDto(
        this.id,  this.name, this.gardenType.name
    )}
}