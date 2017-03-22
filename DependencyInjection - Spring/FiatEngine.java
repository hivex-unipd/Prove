package hello;

import org.springframework.stereotype.Component;

@Component
public class FiatEngine implements Engine{

	@Override
	public int cavalli() {
		// TODO Auto-generated method stub
		return 10;
	}
	
	public String toString(){
		return "Motore Fiat";	
	}

}
