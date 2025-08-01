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



public class VSloveniimidas extends Item {
    public VSloveniimidas(Settings settings) {
        super(settings);
    }
        @Override
        public ActionResult useOnBlock(ItemUsageContext context) {
            World world = context.getWorld();
            Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

            Map<Block, Block> V_SLOVENII_MIDAS_MAP =
                    Map.of(
                           clickedBlock , ModBlocks.BLOCK_V_SLOVENII

                    );

            if(!world.isClient() & clickedBlock != Blocks.BEDROCK) {
                world.setBlockState(context.getBlockPos(), V_SLOVENII_MIDAS_MAP.get(clickedBlock).getDefaultState());

                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));


                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_TRIAL_SPAWNER_OPEN_SHUTTER, SoundCategory.BLOCKS);
            }

            return ActionResult.SUCCESS;
        }
 }

