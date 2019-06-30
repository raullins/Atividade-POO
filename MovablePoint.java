package tarefa;

public class MovablePoint implements Movable {

	int x;
	int y;
	int xSpeed;
	int ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;

	}

	@Override
	public String toString() {
		return "x = " + x + ", y = " + y + ", xSpeed = " + xSpeed + ", ySpeed = " + ySpeed;
	}

	@Override
	public void moveUp() {
		this.x += 1;

	}

	@Override
	public void moveDown() {
		this.x -= 1;
	}

	@Override
	public void moveLeft() {
		this.y -= 1;

	}

	@Override
	public void moveRight() {
		this.y += 1;

	}

}
