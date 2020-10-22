package answers.chapter3;

public class Sales {
	int num;
	static int cnt;
	
	Sales(){
		cnt++;
	}
	static int getSale() {
		return cnt;
	}
}
