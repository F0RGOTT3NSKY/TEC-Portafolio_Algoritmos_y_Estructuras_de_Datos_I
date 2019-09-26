package Compuertas_Logicas;

public class Compuertas implements Compuerta_Default{
	private int Input1;
	private int Input2;
	private int Output;
	
	@Override
	public void setInput1(int Input1) {
		// TODO Auto-generated method stub
		this.Input1 = Input1;
	}

	@Override
	public void setInput2(int Input2) {
		// TODO Auto-generated method stub
		this.Input2 = Input2;
		
	}
	@Override
	public int getInput1() {
		// TODO Auto-generated method stub
		return Input1;
	}
	@Override
	public int getInput2() {
		// TODO Auto-generated method stub
		return Input2;
	}

	@Override
	public int getOutput() {
		// TODO Auto-generated method stub
		return Output;
	}
	@Override
	public void setOutput(int Input1, int Input2) {
		// TODO Auto-generated method stub
		int Valor = 0;
		this.Output = Valor;
		
	}
}
	
