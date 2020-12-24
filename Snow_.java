//import java.util.concurrent.TimeUnit;
class Snow_{
	public static void main(String[] args){
		int lineCounter=0;
		String blank_=" ";
		String blank2_="  ";
		String blank3_="   ";
		String star_="*";
		while(true){
			lineCounter++;
			if(lineCounter%2==0){
				for (int a=0;a<=10;a++){
					System.out.print(blank_+star_+blank2_+star_+star_+star_+blank_+star_+star_+blank2_+star_+blank3_);					
				}
			}else{
				for (int a=0;a<=10;a++){
				System.out.print(blank_+star_+blank2_+star_+star_+blank2_+star_+star_+blank_+star_+star_+star_+star_+blank2_+star_+blank3_);
				}
			}
			//TimeUnit.MINUTES.sleep(1);
			//Thread.sleep(1000);
			//wait(1000);
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}