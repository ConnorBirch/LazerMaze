package lasermaze;

public class BoardDrawer {
	
	Board parent;
	String text;
	
	public BoardDrawer(Board parent){
		this.parent = parent;
	}

	public String draw(){
		text = "";
		for(int i=0;i < 5; i++){
			for(int j=0;j<5;j++){
				text = text + "|"+parent.board[i][j].getName()+"";	
			}
			text = text + "|\n";
		}
		return text;
	}
}
	

