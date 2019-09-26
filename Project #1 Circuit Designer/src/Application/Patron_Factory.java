package Application;

import Compuertas_Logicas.*;

public class Patron_Factory {
	Patron_Factory Logic_Gate;
	
	interface Compuerta extends Compuerta_Default{
	}	
	class GateAND implements Compuerta{
		//TODO GateAND
		private int Input1;
		private int Input2;
		private int Output;
		@Override
		public void setInput1(int Input1) {
			this.Input1 = Input1;
		}

		@Override
		public void setInput2(int Input2) {
			this.Input2 = Input2;
		}
		@Override
		public int getOutput() {
			return Output;
		}

		@Override
		public int getInput1() {
			return Input1;
		}

		@Override
		public int getInput2() {
			return Input2;
		}

		@Override
		public void setOutput(int Input1, int Input2) {
			int Valor = 0;
			if(Input1 == 1 && Input2 == 1) {
				Valor = 1;
			}
			this.Output = Valor;
		}
		
	}
	class GateOR implements Compuerta{
		// TODO GateOR
		private int Input1;
		private int Input2;
		private int Output;
		@Override
		public void setInput1(int Input1) {
			this.Input1 = Input1;
		}

		@Override
		public void setInput2(int Input2) {
			this.Input2 = Input2;
		}
		@Override
		public int getOutput() {
			return Output;
		}

		@Override
		public int getInput1() {
			return Input1;
		}

		@Override
		public int getInput2() {
			return Input2;
		}

		@Override
		public void setOutput(int Input1, int Input2) {
			int Valor = 0;
			if(Input1 == 1 || Input2 == 1) {
				Valor = 1;
			}
			this.Output = Valor;
		}	
	}
	class GateNOT implements Compuerta{
		// TODO GateNOT
		private int Input1;
		private int Input2;
		private int Output;
		@Override
		public void setInput1(int Input1) {
			this.Input1 = Input1;
		}

		@Override
		public void setInput2(int Input2) {
			this.Input2 = Input2;
		}
		@Override
		public int getOutput() {
			return Output;
		}

		@Override
		public int getInput1() {
			return Input1;
		}

		@Override
		public int getInput2() {
			return Input2;
		}

		@Override
		public void setOutput(int Input1, int Input2) {
			int Valor = 0;
			if(Input1 == 1 ) {
				Valor = 0;
			}else {
				Valor = 1;
			}
			this.Output = Valor;
		}	
	}
	class GateNAND implements Compuerta{
		//TODO GateNAND
		private int Input1;
		private int Input2;
		private int Output;
		@Override
		public void setInput1(int Input1) {
			this.Input1 = Input1;
		}

		@Override
		public void setInput2(int Input2) {
			this.Input2 = Input2;
		}
		@Override
		public int getOutput() {
			return Output;
		}

		@Override
		public int getInput1() {
			return Input1;
		}

		@Override
		public int getInput2() {
			return Input2;
		}

		@Override
		public void setOutput(int Input1, int Input2) {
			int Valor = 1;
			if(Input1 == 1 && Input2 == 1) {
				Valor = 0;
			}
			this.Output = Valor;
		}
	}
	class GateNOR implements Compuerta{
		//TODO GateNOR
		private int Input1;
		private int Input2;
		private int Output;
		@Override
		public void setInput1(int Input1) {
			this.Input1 = Input1;
		}

		@Override
		public void setInput2(int Input2) {
			this.Input2 = Input2;
		}
		@Override
		public int getOutput() {
			return Output;
		}

		@Override
		public int getInput1() {
			return Input1;
		}

		@Override
		public int getInput2() {
			return Input2;
		}

		@Override
		public void setOutput(int Input1, int Input2) {
			int Valor = 1;
			if(Input1 == 1 || Input2 == 1) {
				Valor = 0;
			}
			this.Output = Valor;
		}	
	}
	class GateXOR implements Compuerta{
		//TODO GateXOR
		private int Input1;
		private int Input2;
		private int Output;
		@Override
		public void setInput1(int Input1) {
			this.Input1 = Input1;
		}

		@Override
		public void setInput2(int Input2) {
			this.Input2 = Input2;
		}
		@Override
		public int getOutput() {
			return Output;
		}

		@Override
		public int getInput1() {
			return Input1;
		}

		@Override
		public int getInput2() {
			return Input2;
		}

		@Override
		public void setOutput(int Input1, int Input2) {
			int Valor = 0;
			if((Input1 == 1 && Input2 == 0) || (Input1 == 0 && Input2 == 1)) {
				Valor = 1;
			}
			this.Output = Valor;
		}	
	}
	class GateXNOR implements Compuerta{
		//GateXNOR
		private int Input1;
		private int Input2;
		private int Output;
		@Override
		public void setInput1(int Input1) {
			this.Input1 = Input1;
		}

		@Override
		public void setInput2(int Input2) {
			this.Input2 = Input2;
		}
		@Override
		public int getOutput() {
			return Output;
		}

		@Override
		public int getInput1() {
			return Input1;
		}

		@Override
		public int getInput2() {
			return Input2;
		}

		@Override
		public void setOutput(int Input1, int Input2) {
			int Valor = 1;
			if((Input1 == 1 && Input2 == 0) || (Input1 == 0 && Input2 == 1)) {
				Valor = 0;
			}
			this.Output = Valor;
		}	
	}
	public void setLogic_Gate(Patron_Factory logic_Gate, LogicType Tipo, int Input1 , int Input2){
		if(Tipo == LogicType.type_AND) {
			GateAND GateAND = new GateAND();	
			GateAND.setInput1(Input1);
			GateAND.setInput2(Input2);
			GateAND.setOutput(GateAND.getInput1(), GateAND.getInput2());
			System.out.println("AND OUTPUT = "+GateAND.getOutput());
		}else if(Tipo == LogicType.type_OR) {
			GateOR GateOR = new GateOR();	
			GateOR.setInput1(Input1);
			GateOR.setInput2(Input2);
			GateOR.setOutput(GateOR.getInput1(), GateOR.getInput2());
			System.out.println("OR OUTPUT = "+GateOR.getOutput());
		}else if(Tipo == LogicType.type_NOT) {
			GateNOT GateNOT = new GateNOT();	
			GateNOT.setInput1(Input1);
			GateNOT.setOutput(GateNOT.getInput1(), GateNOT.getInput2());
			System.out.println("NOT OUTPUT = "+GateNOT.getOutput());
		}else if(Tipo == LogicType.type_NAND) {
			GateNAND GateNAND = new GateNAND();	
			GateNAND.setInput1(Input1);
			GateNAND.setInput2(Input2);
			GateNAND.setOutput(GateNAND.getInput1(), GateNAND.getInput2());
			System.out.println("NAND OUTPUT = "+GateNAND.getOutput());
		}else if(Tipo == LogicType.type_NOR) {
			GateNOR GateNOR = new GateNOR();	
			GateNOR.setInput1(Input1);
			GateNOR.setInput2(Input2);
			GateNOR.setOutput(GateNOR.getInput1(), GateNOR.getInput2());
			System.out.println("NOR OUTPUT = "+GateNOR.getOutput());
		}else if(Tipo == LogicType.type_XOR) {
			GateXOR GateXOR = new GateXOR();	
			GateXOR.setInput1(Input1);
			GateXOR.setInput2(Input2);
			GateXOR.setOutput(GateXOR.getInput1(), GateXOR.getInput2());
			System.out.println("XOR OUTPUT = "+GateXOR.getOutput());
		}else if(Tipo == LogicType.type_XNOR) {
			GateXNOR GateXNOR = new GateXNOR();	
			GateXNOR.setInput1(Input1);
			GateXNOR.setInput2(Input2);
			GateXNOR.setOutput(GateXNOR.getInput1(), GateXNOR.getInput2());
			System.out.println("XNOR OUTPUT = "+GateXNOR.getOutput());
		}
		this.Logic_Gate = logic_Gate;
	}
	enum LogicType {
		type_AND,type_OR,type_NOT,type_NAND,type_NOR,type_XOR,type_XNOR
	}
	public Patron_Factory getLogic_Gate() {
		return Logic_Gate;
	}
	
}
