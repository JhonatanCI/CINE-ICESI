package model;

public class Sala {

	public static int SMALL = 1;
	public static int BIG = 2;
	public static int ROW_SMALL = 4;
	public static int COLUMN = 7;
	public static int ROW_BIG = 6;
	
	private int type;
	private Chair[][] chairs;
	private Function function;

	public Sala(int type) {
		this.type = type;
		initialiceSala(type);		
	}
	
	public void initialiceSala(int type) {
		if(type == SMALL) {
			chairs = new Chair[ROW_SMALL][COLUMN];
		}else if(type == BIG) {
			chairs = new Chair[ROW_BIG][COLUMN];
		}
	}
	
	public boolean isEmpty(String ubicacion) {
		for(int i = 0; i < chairs.length; i++) {
			for(int j = 0; j < chairs[0].length; j++) {
				if(chairs[i][j].getUbication().equalsIgnoreCase(ubicacion)) {
					if(chairs[i][j].getIsEmpty() == false) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	
	
}
