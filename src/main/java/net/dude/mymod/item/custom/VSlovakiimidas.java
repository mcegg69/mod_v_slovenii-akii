package net.dude.mymod.item.custom;

import net.dude.mymod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.Map;
import java.util.Random;


public class VSlovakiimidas extends Item {
    public VSlovakiimidas(Settings settings) {
        super(settings);
    }
         @Override
        public ActionResult useOnBlock(ItemUsageContext test) {
            World world = test.getWorld();
            Block clickedBlock = world.getBlockState(test.getBlockPos()).getBlock();

            Map<Block, Block> V_SLOVAKII_MIDAS_MAP =
                 Map.of(
                         clickedBlock , ModBlocks.BLOCK_V_SLOVAKII
                    );

                if(!world.isClient() & clickedBlock != Blocks.BEDROCK) {
                world.setBlockState(test.getBlockPos(), V_SLOVAKII_MIDAS_MAP.get(clickedBlock).getDefaultState());

                test.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) test.getPlayer()),
                        item -> test.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));
                
                    world.playSound(null, test.getBlockPos(), SoundEvents.BLOCK_TRIAL_SPAWNER_OPEN_SHUTTER, SoundCategory.BLOCKS, 1f, 1f);
             }

            return ActionResult.SUCCESS;
     }
    }

