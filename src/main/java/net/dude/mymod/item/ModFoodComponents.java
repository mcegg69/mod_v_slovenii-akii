package net.dude.mymod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent RAW_V_SLOVENII = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(1)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200),0.3f)
            .build();

    public static final FoodComponent V_SLOVENII = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(4)
            .build();

    public static final FoodComponent RAW_V_SLOVAKII = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(1)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200),0.3f)
            .build();

    public static final FoodComponent V_SLOVAKII = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(4)
            .build();
}
