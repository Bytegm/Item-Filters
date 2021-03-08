package dev.latvian.mods.itemfilters.item;

import dev.latvian.mods.itemfilters.api.ItemFiltersAPI;
import net.minecraft.world.item.ItemStack;

import java.util.List;

/**
 * @author LatvianModder
 */
public class NOTFilterItem extends InventoryFilterItem {
	@Override
	public boolean filter(ItemStack filter, ItemStack stack) {
		ItemInventory inventory = getInventory(filter);
		return !inventory.getItems().isEmpty() && !ItemFiltersAPI.filter(inventory.getItems().get(0), stack);
	}

	@Override
	public int getInventorySize(ItemStack filter) {
		return 1;
	}

	@Override
	public void addSlots(ItemStack filter, List<FilterSlot> list) {
		list.add(new FilterSlot(80, 34));
	}
}