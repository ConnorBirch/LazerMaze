package piece;

import lasermaze.Board;

public class TargetMirror extends Piece{
		
	public TargetMirror(Board parent){
		face = Facing.N;
		id = "T";
		updateName();
		this.parent = parent;
	}
	
	@Override
	public void laserStrike(Facing incoming){
			switch(incoming){
			case E:
				if(face == Facing.W){
					id = "Z";
					updateName();
				}
				else if(face == Facing.N){
					if(ycoord < 4)
					parent.getCell(ycoord+1,xcoord).laserStrike(Facing.S);
				}else if(face == Facing.E){
					if(ycoord > 0)
					parent.getCell(ycoord-1,xcoord).laserStrike(Facing.N);
				}
				break;
			case N:
				if(face == Facing.S){
					id = "Z";
					updateName();
				}
				else if(face == Facing.N){
					if(xcoord > 0)
					parent.getCell(ycoord,xcoord-1).laserStrike(Facing.W);
				}else if(face == Facing.W){
					if(xcoord < 4)
					parent.getCell(ycoord,xcoord+1).laserStrike(Facing.E);
				}
				break;
			case S:
				if(face == Facing.N){
					id = "Z";
					updateName();
				}
				else if(face == Facing.E){
					if(xcoord > 0)
					parent.getCell(ycoord,xcoord-1).laserStrike(Facing.W);
				}else if(face == Facing.S){
					if(xcoord < 4)
					parent.getCell(ycoord,xcoord+1).laserStrike(Facing.E);
				}
				break;
			case W:
				if(face == Facing.E){
					id = "Z";
					updateName();
				}
				else if(face == Facing.S){
					if(ycoord > 0)
					parent.getCell(ycoord-1,xcoord).laserStrike(Facing.N);
				}else if(face == Facing.W){
					if(ycoord < 4)
					parent.getCell(ycoord+1,xcoord).laserStrike(Facing.S);
				}
				break;
			default:
				break;
			
			}
		
	}
	
}
