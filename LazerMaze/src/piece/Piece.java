package piece;

import lasermaze.Board;

public abstract class Piece implements Strikable{
	
	protected int ycoord, xcoord;
	protected Facing face;
	protected String id;
	private String name;
	protected Board parent;
	
	
	public void laserStrike(Facing incoming){
	}


	public void setFace(Facing face) {
		this.face = face;
		updateName();
	}
	
	
	protected void updateName(){
		setName(id + face);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	public int getXcoord(){
		return xcoord;
	}
	public void setXcoord(int xcoord){
		this.xcoord = xcoord;
	}
	public int getYcoord(){
		return ycoord;
	}
	public void setYcoord(int ycoord){
		this.ycoord = ycoord;
	}
	
	

}
