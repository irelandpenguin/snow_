//import java.util.concurrent.TimeUnit;
class Snow_{
	public static void main(String[] args){
		int lineCounter=0;
		String blank_=" ";
		String blank2_="  ";
		String blank3_="   ";
		String star_="*";
		lineCounter++;
		for (int start_ = 1000;start_ > 0; start_--){
			if(lineCounter%2==0){
				for (int a=0;a<=10;a++){
					System.out.print(blank_+star_+blank2_+star_+star_+star_+blank_+star_+star_+blank2_+star_+blank3_);
				}
			}else{
				for (int a=0;a<=10;a++){
					System.out.print(blank_+star_+blank2_+star_+star_+blank2_+star_+star_+blank_+star_+star_+star_+star_+blank2_+star_+blank3_);
				}
			}
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("   /\\==========\\               /\\            /\\              ----------");
		System.out.println("  /  \\          \\             /  \\          /  \\           |");   
		System.out.println(" /____\\_________ \\           /    \\        /    \\          |");
		System.out.println(" |     |   ____   |         /      \\      /      \\         |");
		System.out.println(" |     |  |    |  |        /        \\    /        \\        |");
		System.out.println(" |     |  |    |  |       /          \\  /          \\       |");
		System.out.println(" |_____|__|____|__|      /            \\/            \\         ---------");
	}
}