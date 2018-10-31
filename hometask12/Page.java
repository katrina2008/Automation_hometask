package hometask12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Page {

	// Button button = new Button ();
	private ArrayList<Button> list = new ArrayList<Button>();

	public void addButton(Button... buttons) {
		for (Button button : buttons)
			System.out.println(list.add(button));
	}

	public void removeButton(Button... buttons) {
		for (Button button : buttons)
			list.remove(button);

	}

	public void setButton(Button button) {
		list.set(2, button);
	}

	public void printButton() {
		Iterator<Button> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next().toString());
		}

	}

	private LinkedList<Field> list1 = new LinkedList<Field>();

	public void addField(Field... fields) {
		for (Field field : fields)
			System.out.println(list1.add(field));
	}

	public void removeField(Field... fields) {
		for (Field field : fields)
			list1.remove(field);

	}

	public void setField(Field field) {
		list1.set(2, field);
	}

	public void printField() {
		Iterator<Field> iter1 = list1.iterator();
		while (iter1.hasNext()) {
			System.out.println(iter1.next().toString());
		}

	}

	private HashSet<Label> list3 = new HashSet<Label>();

	public void addLabel(Label... labels) {
		for (Label label : labels)
			System.out.println(list3.add(label));
	}

	public void removeLabel(Label... labels) {
		for (Label label : labels)
			list3.remove(label);

	}

	public void setLabel(Label label, Label label4) {
		list3.remove(label);
		list3.add(label4);
	}

	public void printLabel() {
		Iterator<Label> iter3 = list3.iterator();
		while (iter3.hasNext()) {
			System.out.println(iter3.next().toString());
		}

	}

	private HashMap<String, Dropdown> list4 = new HashMap<String, Dropdown>();

	public void addDropdown(String key, Dropdown dropdown) {
		System.out.println(list4.put(key, dropdown));
	}

	public void removeDropdown(Dropdown dropdown) {

		list4.values().remove(dropdown);

	}

	public void setDropdown(String key, Dropdown dropdown) {
		list4.replace(key, dropdown);
	}

	public void printDropdown() {

		System.out.println(list4.toString());

	}

}
