package br.com.rd.calculadoraCompleta;

public class Calcular {
	private Integer val1;
	private Integer val2;

	
	
	public Calcular(Integer val1, Integer val2) {
		
		this.val1 = val1;
		this.val2 = val2;
	}
	public Integer somar() {
		
		
		return val1 + val2;
	}
	public Integer subtrair() {
			
			
			return val1 - val2;
		}
	public Integer multiplicar() {
		
		
		return val1 * val2;
	}
	public Integer dividir() {
		
		
		return val1 / val2;
	}
	
}



