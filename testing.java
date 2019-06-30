package tarefa;

public class testing {

	public static void main(String[] args) {

		Movable m1 = new MovablePoint(5, 6, 10, 15);
		System.out.println(m1.toString());
		m1.moveLeft();
		System.out.println(m1.toString());

		Movable m2 = new MovableCircle(1, 2, 3, 4, 20);
		System.out.println(m2.toString());
		m2.moveRight();
		System.out.println(m2.toString());

		MovableRectangle m3 = new MovableRectangle(1, 2, 3, 4, 5, 6);
		System.out.println(m3.toString());
		m3.moveRight();
		System.out.println(m3.toString());
		m3.M2moveLeft();
		System.out.println(m3.toString());

	}

}
