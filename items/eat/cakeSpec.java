package items.eat;

import items.eat.enums.Glaze;
import items.eat.enums.Filling;

public record cakeSpec(
    Glaze glaze,
    Filling filling
) {}