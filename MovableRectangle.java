package tarefa;

public class MovableRectangle implements Movable {

	private MovablePoint m1;
	private MovablePoint m2;

	public MovableRectangle(int x, int y, int x2, int y2, int xSpeed, int ySpeed) {
		this.m1 = new MovablePoint(x, y, xSpeed, ySpeed);
		this.m2 = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	public void moveUp() {
		this.m1.moveUp();

	}

	public void moveDown() {
		this.m1.moveDown();

	}

	public void moveLeft() {
		this.m1.moveLeft();

	}

	public void moveRight() {
		this.m1.moveRight();

	}

	public void M2moveUp() {
		this.m2.moveUp();

	}

	public void M2moveDown() {
		this.m2.moveDown();

	}

	public void M2moveLeft() {
		this.m2.moveLeft();

	}

	public void M2moveRight() {
		this.m2.moveRight();

	}

	public String toString() {
		return "M1: " + m1.toString() + ", M2: " + m2.toString();
	}

}
