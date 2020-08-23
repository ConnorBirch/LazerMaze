package lasermaze;

import piece.EmptyPiece;
import piece.Laser;
import piece.Piece;

public class Board {
	Piece[][] board;
	BoardDrawer drawer;
	Laser laser;
	
	public Board(){
		board = new Piece[5][5];
		fillEmpty();
		drawer = new BoardDrawer(this);
	}
	
	public void fire(){
		laser.fire();
	}
	
	public String draw(){
		return drawer.draw();
	}
	
	public void placeAt(Piece piece, int y, int x){
		if(piece instanceof Laser){
			laser = (Laser) piece;
		}
		board[y][x] = piece;
		piece.setYcoord(y);
		piece.setXcoord(x);
	}
	
	private void fillEmpty(){
		for(int i=0;i < 5; i++){
			for(int j=0;j<5;j++){
				placeAt(new EmptyPiece(this),j, i);
			}
		}
	}
	
	public Piece getCell(int y, int x){
		return board[y][x];
	}

}
