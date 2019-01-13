package com.data;

import java.util.ArrayList;
import java.util.List;

public class Data {
	private static List<Item> itemList = new ArrayList<>();

	public Data() {

	}

	public static List<Item> getList() {
		if (itemList.isEmpty()) {
			itemList.add(new Item("Tiganj", "Neki opis, malo duzi", true));
			itemList.add(new Item("Serpa", "Neki opis, malo drugaciji", true));
			itemList.add(new Item("Bojan", "Glupost od opisa", false));
		}

		return itemList;
	}

	public void insert(Item item) {
		itemList.add(item);
	}

	public boolean delete(int id) {
		for (Item item : itemList) {
			if (item.getId() == id) {
				return itemList.remove(item);
			}
		}
		return false;
	}

}
