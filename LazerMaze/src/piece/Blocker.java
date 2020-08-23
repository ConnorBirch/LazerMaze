package piece;

import lasermaze.Board;

public class Blocker extends Piece {
	
	public Blocker(Board parent){
		face = Facing.N;
		id = "K";
		updateName();
		this.parent = parent;
	}
	
	@Override
	public void laserStrike(Facing incoming){
	}

}
