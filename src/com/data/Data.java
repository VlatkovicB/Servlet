package com.data;

import java.util.ArrayList;
import java.util.List;

public class Data {
	private static List<Item> itemList = new ArrayList<>();

	public Data() {

	}

	public static List<Item> getList() {
		if (itemList.isEmpty()) {
			itemList.add(new Item(1, "Tiganj", "Neki opis, malo duzi", true));
			itemList.add(new Item(2, "Serpa", "Neki opis, malo drugaciji", true));
			itemList.add(new Item(3, "Bojan", "Glupost od opisa", false));
		}

		return itemList;
	}

	public void insert(Item item) {
		itemList.add(item);
	}

}
