public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	//returns the score of a single frame
	public int score(){
		int skor = getFirstThrow() + getSecondThrow();
		return skor;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(getFirstThrow() == 10){
			return true;
		} else {
			return false;
		}		
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if(getFirstThrow() != 10 && (10 - (getFirstThrow() + getSecondThrow()) == 0)){
			return true;
		} else {
			return false;
		}
	}
}
