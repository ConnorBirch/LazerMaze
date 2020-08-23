package piece;

import lasermaze.Board;

public class EmptyPiece extends Piece{
	
	public EmptyPiece(Board parent){
		setName("  ");
		this.parent = parent;
	}
	
	@Override
	public void laserStrike(Facing incoming){
		setName("* ");
		switch(incoming){
		case E:
			if(xcoord < 4)
				parent.getCell(ycoord,xcoord+1).laserStrike(incoming);
			break;
		case N:
			if(ycoord > 0)
				parent.getCell(ycoord-1,xcoord).laserStrike(incoming);
			break;
		case S:
			if(ycoord < 4)
				parent.getCell(ycoord+1,xcoord).laserStrike(incoming);
			break;
		case W:
			if(xcoord > 0)
				parent.getCell(ycoord,xcoord-1).laserStrike(incoming);
			break;
		default:
			break;
		
		}
		
	}
}
