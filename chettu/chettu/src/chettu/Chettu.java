package chettu;

public class Chettu {
	int value =0;
	int absX, absY;
	int limit;
	public int solution(int X, int Y) {
		absX = Math.abs(X);
		absY = Math.abs(Y);
		if(absX>absY) {
			limit = absX;
		} else {
			limit = absY;
		}
		if(!(absY<absX)){
			value = ((limit-1)*8)+(X+Y);
		} else
			if(Y<0){
				value = ((limit - 1) * 8) + (X + absY);
			
		}
		else {
			value = ((limit-1)*8)+(int)(Math.pow(2, limit+1))-(X+Y);
		}
		if(value < 0) {
			return 0;
		}
		return value;
	}
	public static void main(String args[]) {
		Chettu sol = new Chettu();
		System.out.println(sol.solution(-1, 2));
		
	}
}
