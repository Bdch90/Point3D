
public class Point3D extends Point {
	private int z = 1;

	public Point3D() {}
	public Point3D(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	public int getZ()
	{
		return this.z;
	}
	public void setZ(int z)
	{
		this.z = z;
	}
	public void setXYZ(int x, int y, int z)
	{
		super.setX(x);
		super.setY(y);
		this.z = z;
	}
	public int[] getXYZ()
	{
		int[] arr = new int[3];
		arr[0] = super.getX();
		arr[1] = super.getY();
		arr[2] = this.getZ();
		return arr;
	}
	@Override
	public String toString()
	{
		return "(" + super.getX() + "," + super.getY() + "," + this.getZ() + ")";
	}
}