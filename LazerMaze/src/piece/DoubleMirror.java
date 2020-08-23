package piece;

import lasermaze.Board;

public class DoubleMirror extends Piece{
	
	public DoubleMirror(Board parent){
		face = Facing.N;
		id = "M";
		updateName();
		this.parent = parent;
	}
	
	@Override
	public void laserStrike(Facing incoming){
			switch(incoming){
			case E:
				if(face == Facing.N || face == Facing.S){
					if(ycoord > 0)
						parent.getCell(ycoord-1,xcoord).laserStrike(Facing.N);
				}else if(face == Facing.E || face == Facing.W){
					if(ycoord < 4)
					parent.getCell(ycoord+1,xcoord).laserStrike(Facing.S);
				}
				break;
			case N:
				if(face == Facing.N || face == Facing.S){
					if(xcoord < 4)
					parent.getCell(ycoord,xcoord+1).laserStrike(Facing.E);
				}else if(face == Facing.W || face == Facing.E){
					if(xcoord > 0)
					parent.getCell(ycoord,xcoord-1).laserStrike(Facing.W);
				}
				break;
			case S:
				if(face == Facing.N || face == Facing.S){
					if(xcoord > 0)
					parent.getCell(ycoord,xcoord-1).laserStrike(Facing.W);
				}else if(face == Facing.W || face == Facing.E){
					if(xcoord < 4)
					parent.getCell(ycoord,xcoord+1).laserStrike(Facing.E);
				}
				break;
			case W:
				if(face == Facing.N || face == Facing.S){
					if(ycoord < 4)
						parent.getCell(ycoord+1,xcoord).laserStrike(Facing.S);
				}else if(face == Facing.W || face == Facing.E){
					if(ycoord > 0)
						parent.getCell(ycoord-1,xcoord).laserStrike(Facing.N);
				}
				break;
			default:
				break;
			
			}
	}
}
