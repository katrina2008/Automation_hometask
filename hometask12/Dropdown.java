package hometask12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dropdown {

	@Override
	public String toString() {
		return "Dropdown [name=" + name + ", options=" + options + ", isSelected=" + isSelected + "]";
	}

	private String name;
	private List<String> options;
	private boolean isSelected;

	public Dropdown() {
		this.name = "Enter countries";
		this.options = new ArrayList<>();
		this.options.add("China");
		this.options.add("Canada");
		this.options.add("Germany");
	}

	public Dropdown(String name, String... options) {
		this.name = name;
		this.options = new ArrayList<>();
		Collections.addAll(this.options, options);
	}

}
