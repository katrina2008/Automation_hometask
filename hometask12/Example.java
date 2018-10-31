package hometask12;

public class Example {

	public static void main(String[] args) {

		Page page = new Page();
		Button button1 = new Button();
		Button button2 = new Button();
		Button button3 = new Button();
		Button button = new Button();
		Button button4 = new Button();
		Button button5 = new Button();

		button.setName("Kate");
		button.setAction("Take");
		page.addButton(button1, button2, button3, button4, button5);
		page.removeButton(button1);
		page.setButton(button);
		page.printButton();

		Field field1 = new Field();
		Field field = new Field();
		Field field2 = new Field();
		Field field3 = new Field();
		Field field4 = new Field();
		Field field5 = new Field();

		page.addField(field1, field2, field3, field4, field5);
		page.removeField(field1);
		page.setField(field);
		page.printField();

		Label label = new Label();
		Label label1 = new Label();
		Label label2 = new Label();
		Label label3 = new Label();
		Label label4 = new Label();
		Label label5 = new Label();

		page.addLabel(label1, label2, label3, label4, label5);
		page.removeLabel(label1);
		page.setLabel(label, label4);
		page.printLabel();

		Dropdown dropdown = new Dropdown();
		Dropdown dropdown1 = new Dropdown();
		Dropdown dropdown2 = new Dropdown();
		Dropdown dropdown3 = new Dropdown();
		Dropdown dropdown4 = new Dropdown();
		Dropdown dropdown5 = new Dropdown();

		page.addDropdown("1", dropdown);
		page.addDropdown("2", dropdown1);
		page.addDropdown("3", dropdown2);
		page.addDropdown("4", dropdown3);
		page.addDropdown("5", dropdown4);

		page.removeDropdown(dropdown5);

		page.setDropdown("2", dropdown5);
		page.printDropdown();

	}

}
