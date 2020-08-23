package piece;

import lasermaze.Board;

public class Splitter extends Piece{
	
	public Splitter(Board parent){
		face = Facing.N;
		id = "B";
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
					if(xcoord < 4)
					parent.getCell(ycoord,xcoord+1).laserStrike(Facing.E);
				}else{
					if(ycoord < 4)
					parent.getCell(ycoord+1,xcoord).laserStrike(Facing.S);
					if(xcoord < 4)
					parent.getCell(ycoord,xcoord+1).laserStrike(Facing.E);
				}
				break;
			case N:
//				if(face == Facing.N || face == Facing.S){
//					parent.board[xpos-1][ypos].laserStrike(Facing.N);
//					parent.board[xpos][ypos+1].laserStrike(Facing.E);
//				}else{
//					parent.board[xpos+1][ypos].laserStrike(Facing.S);
//					parent.board[xpos][ypos+1].laserStrike(Facing.E);
//				}
				break;
			case S:
//				if(face == Facing.N || face == Facing.S){
//					parent.board[xpos-1][ypos].laserStrike(Facing.N);
//					parent.board[xpos][ypos+1].laserStrike(Facing.E);
//				}else{
//					parent.board[xpos+1][ypos].laserStrike(Facing.S);
//					parent.board[xpos][ypos+1].laserStrike(Facing.E);
//				}
				break;
			case W:
				if(face == Facing.N || face == Facing.S){
					if(ycoord < 4)
					parent.getCell(ycoord+1,xcoord).laserStrike(Facing.S);
					if(xcoord > 0)
					parent.getCell(ycoord,xcoord-1).laserStrike(Facing.W);
				}else{
					if(ycoord > 0)
					parent.getCell(ycoord-1,xcoord).laserStrike(Facing.N);
					if(xcoord > 0)
					parent.getCell(ycoord,xcoord-1).laserStrike(Facing.W);
				}
				break;
			default:
				break;
			
			}
	}
}
