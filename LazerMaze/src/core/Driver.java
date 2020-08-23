package core;

import lasermaze.*;
import piece.*;

public class Driver {
	public static void main(String[] args){

		System.out.println("Board 1");
		Board board = new Board();
		Piece p1 = new Laser(board);	
		Piece p2 = new TargetMirror(board);
		Piece p3 = new TargetMirror(board);
		Piece p4 = new TargetMirror(board);
		p1.setFace(Facing.N);
		p2.setFace(Facing.E);
		p3.setFace(Facing.W);
		p4.setFace(Facing.S);
		board.placeAt(p1, 4, 0);
		board.placeAt(p2, 3, 4);
		board.placeAt(p3, 3, 0);
		board.placeAt(p4, 0, 4);
		board.fire();
		System.out.println(board.draw());
		
		System.out.println("Board 2");
		Board board2 = new Board();
		Piece p5 = new Laser(board2);
		Piece p6 = new TargetMirror(board2);
		Piece p7 = new TargetMirror(board2);
		Piece p8 = new TargetMirror(board2);
		Piece p9 = new Checkpoint(board2);
		Piece p10 = new DoubleMirror(board2);
		p5.setFace(Facing.N);
		p6.setFace(Facing.W);
		p7.setFace(Facing.W);
		p8.setFace(Facing.W);
		board2.placeAt(p5, 4, 0);
		board2.placeAt(p6, 2, 0);
		board2.placeAt(p7, 0, 2);
		board2.placeAt(p8, 0, 4);
		board2.placeAt(p9, 1, 2);
		board2.placeAt(p10, 2, 2);
		board2.fire();
		System.out.println(board2.draw());
		
		System.out.println("Board 3");
		Board board3 = new Board();
		Piece p11 = new Laser(board3);
		Piece p12 = new DoubleMirror(board3);
		Piece p13 = new Checkpoint(board3);
		Piece p14 = new Splitter(board3);
		Piece p15 = new TargetMirror(board3);
		Piece p16 = new TargetMirror(board3);
		Piece p17 = new Blocker(board3);
		p11.setFace(Facing.S);
		p12.setFace(Facing.W);
		p13.setFace(Facing.W);
		p14.setFace(Facing.W);
		p15.setFace(Facing.W);
		board3.placeAt(p11, 0, 0);
		board3.placeAt(p12, 3, 0);
		board3.placeAt(p13, 3, 2);
		board3.placeAt(p14, 3, 3);
		board3.placeAt(p15, 3, 4);
		board3.placeAt(p16, 4, 3);
		board3.placeAt(p17, 0, 3);
		board3.fire();
		System.out.println(board3.draw());

		
		
	}

}
