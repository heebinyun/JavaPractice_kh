package inherit.controller;

import inherit.model.vo.Rectangle;

public class RectangleController {

	Rectangle r = new Rectangle();
	
	// 면적
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		return "넓이 : " + r.toString() + " / " + (width * height);
	}
	
	// 둘레
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		return "둘레 : " + r.toString() + " / " + (2*(width + height));
	}
}
