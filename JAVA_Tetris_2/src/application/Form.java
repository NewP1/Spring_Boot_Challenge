package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Form {
	Rectangle a;
	Rectangle b;
	Rectangle c;
	Rectangle d;
	Color color;
	
	private String name;
	public int form = 1;
	
	public Form (Rectangle a, Rectangle b, Rectangle c, Rectangle d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public Form (Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.name = name;
		
		//set color of the stones
		switch (name) {
			case "j" :
				color = Color.SLATEGRAY;
				break;
			case "l" :
				color = Color.DARKGOLDENROD;
				break;
			case "o" : 
				color = Color.INDIANRED;
				break;
			case "s" :
				color = Color.FORESTGREEN;
				break;
			case "t" :
				color = Color.CADETBLUE;
				break;
			case "z" :
				color = color.HOTPINK;
				break;
			case "i" :
				color = color.SANDYBROWN;
				break;
		}
		this.a.setFill(color);
		this.b.setFill(color);
		this.c.setFill(color);
		this.d.setFill(color);
	}
		//getter
		
	public String getName() {
		return name;
	}
	
	public void changeForm() {
		if(form != 4) {
			form++;
		}else form = 1;
	}
}