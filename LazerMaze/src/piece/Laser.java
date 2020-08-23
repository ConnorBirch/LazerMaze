package piece;

import lasermaze.Board;

public class Laser extends Piece{
	
	public Laser(Board parent){
		face = Facing.N;
		id = "L";
		updateName();
		this.parent = parent;
	}
	
	public void fire(){
		switch(face){
		case E:
			if(xcoord < 4)
			parent.getCell(ycoord,xcoord+1).laserStrike(face);
			break;
		case N:
			if(ycoord > 0)
			parent.getCell(ycoord-1,xcoord).laserStrike(face);
			break;
		case S:
			if(ycoord < 4)
			parent.getCell(ycoord+1,xcoord).laserStrike(face);
			break;
		case W:
			if(xcoord > 0)
			parent.getCell(ycoord,xcoord-1).laserStrike(face);
			break;
		default:
			break;
		
		}
	}

}
