
public class MoveablePoint extends Point
{
	private int xSpeed = 0;
	private int ySpeed = 0;

	public MoveablePoint() {
	}

	public MoveablePoint(int xSpeed, int ySpeed)
	{
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public MoveablePoint(int x, int y, int xSpeed, int ySpeed)
	{
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public int getXSpeed()
	{
		return this.xSpeed;
	}
	public int getYSpeed()
	{
		return this.ySpeed;
	}

	public void setXSpeed(int xSpeed)
	{
		this.xSpeed = xSpeed;
	}

	public void setYSpeed(int ySpeed)
	{
		this.ySpeed = ySpeed;
	}

	public void setSpeed(int xSpeed, int ySpeed)
	{
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public MoveablePoint move()
	{
		super.setXY((super.getX() + this.getXSpeed()), ((super.getY() + this.getYSpeed())))	;
		return this;
	}
	@Override
	public String toString() {
		return super.toString() + "\nxSpeed : " + this.getXSpeed() + " ySpeed : " + this.getYSpeed();
	}
}