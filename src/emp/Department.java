package emp;

public enum Department {
HR(520),RND(8620),SALES(8520),FINANCE(520),PRODUCTION(1000);
private int id; 
private Department(int id) {
	this.id=id;
}
}
