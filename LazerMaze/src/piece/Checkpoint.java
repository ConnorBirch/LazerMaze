package piece;

import lasermaze.Board;

public class Checkpoint extends Piece{
	
	public Checkpoint(Board parent){
		face = Facing.N;
		id = "P";
		updateName();
		this.parent = parent;
	}
	
	@Override
	public void laserStrike(Facing incoming){
		switch(incoming){
		case E:
			if(face == Facing.N || face == Facing.S){
			}else if(face == Facing.E || face == Facing.W){
				if(xcoord < 4)
					parent.getCell(ycoord,xcoord+1).laserStrike(Facing.E);
			}
			break;
		case N:
			if(face == Facing.N || face == Facing.S){
				if(ycoord > 0)
				parent.getCell(ycoord-1,xcoord).laserStrike(Facing.N);
			}else if(face == Facing.W || face == Facing.E){
			}
			break;
		case S:
			if(face == Facing.N || face == Facing.S){
				if(ycoord < 4)
					parent.getCell(ycoord+1,xcoord).laserStrike(Facing.S);
			}else if(face == Facing.W || face == Facing.E){
			}
			break;
		case W:
			if(face == Facing.N || face == Facing.S){
			}else if(face == Facing.W || face == Facing.E){
				if(xcoord > 0)
					parent.getCell(ycoord,xcoord-1).laserStrike(Facing.W);
			}
			break;
		default:
			break;
		}
	}
}
