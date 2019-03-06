
public class Point
{
	private int[] arrXY = new int[2];
	private int x = 0;
	private int y = 0;
	public Point(){}
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public int getX()
	{
		return this.x;
	}
	public int getY()
	{
		return this.y;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public int[] getXY()
	{
		int[] arr = new int[2];
		arr[0] = this.getX();
		arr[1] = this.getY();
		return arr;
	}
	public void setXY(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public String toString()
	{
		return "(" + this.getX() + "," + this.getY() + ")";
	}
}
