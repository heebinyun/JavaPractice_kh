package inherit.controller;

import inherit.model.vo.Circle;

public class CircleController {

	Circle c = new Circle();
	double PI = 3.141592653589793;
	
	// 면적
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return "넓이 : " + c.toString() + " / " + (PI * radius * radius);
	}
	
	// 둘레
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return "둘레 : " + c.toString() + " / " + (PI * radius * 2);
	}
}
