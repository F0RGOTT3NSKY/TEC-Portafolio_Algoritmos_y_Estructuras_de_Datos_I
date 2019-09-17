package Application;

import Compuertas_Logicas.*;

public class Patron_Factory {
	
	Patron_Factory Logic_Gate;
	
	interface Compuerta extends Compuerta_Default{
		
	}	
	class GateAND implements Compuerta{
		@Override
		public void setInput1(int entrada) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setInput2(int entrada) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getOutput() {
			// TODO Auto-generated method stub
			return 0;
		}		
	}
	class GateOR implements Compuerta{
		@Override
		public void setInput1(int entrada) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setInput2(int entrada) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getOutput() {
			// TODO Auto-generated method stub
			return 0;
		}	
	}
	class GateNOT implements Compuerta{
		@Override
		public void setInput1(int entrada) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setInput2(int entrada) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getOutput() {
			// TODO Auto-generated method stub
			return 0;
		}	
	}
	class GateNAND implements Compuerta{
		@Override
		public void setInput1(int entrada) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setInput2(int entrada) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getOutput() {
			// TODO Auto-generated method stub
			return 0;
		}	
	}
	class GateNOR implements Compuerta{
		@Override
		public void setInput1(int entrada) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setInput2(int entrada) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getOutput() {
			// TODO Auto-generated method stub
			return 0;
		}	
	}
	class GateXOR implements Compuerta{
		@Override
		public void setInput1(int entrada) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setInput2(int entrada) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getOutput() {
			// TODO Auto-generated method stub
			return 0;
		}	
	}
	class GateXNOR implements Compuerta{
		@Override
		public void setInput1(int entrada) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setInput2(int entrada) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getOutput() {
			// TODO Auto-generated method stub
			return 0;
		}	
	}
	public void setLogic_Gate(Patron_Factory logic_Gate) {
		Logic_Gate = logic_Gate;
	}
	enum LogicType {
		type_AND,type_OR,type_NOT,type_NAND,type_NOR,type_XOR,type_XNOR
	}
	public class Factory{
		public Compuerta getLogic_Gate(LogicType Tipo) throws Exception {
			if(Tipo == LogicType.type_AND) {
				return new GateAND();
			}else if(Tipo == LogicType.type_OR) {
				return new GateOR();
			}else if(Tipo == LogicType.type_NOT) {
				return new GateNOT();
			}else if(Tipo == LogicType.type_NAND) {
				return new GateNAND();
			}else if(Tipo == LogicType.type_NOR) {
				return new GateNOR();
			}else if(Tipo == LogicType.type_XOR) {
				return new GateXOR();
			}else if(Tipo == LogicType.type_XNOR) {
				return new GateXNOR();
			}else {
				throw new Exception("Unknown Logic Type");
			}
		}
	}
}
