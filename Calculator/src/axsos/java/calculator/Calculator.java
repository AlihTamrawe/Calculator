package axsos.java.calculator;

public class Calculator {
	private double OperandTwo;
	private char Operation;
	private double Operandone;
	private double 		result;
	Calculator(){
		this.Operandone=0.0;
		this.Operation='d';
		this.OperandTwo=0.0;
		this.result=0.0;
		
	}
	public double getOperandTwo() {
		return OperandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		OperandTwo = operandTwo;
	}
	public char getOperation() {
		return Operation;
	}
	public void setOperation(char operation) {
		this.Operation = operation;
	}
	public double getOperandone() {
		return Operandone;
	}
	public void setOperandone(double operandone) {
		Operandone = operandone;
	}
	public void performOperation() {
		double result=0.0;
		switch(this.Operation) {
		case '+':
			result = this.Operandone+this.OperandTwo;
			break;
		case '-':
			result = this.Operandone-this.OperandTwo;
			break;
		case '*':
			result = this.Operandone*this.OperandTwo;
			break;
		case '/':
			result = this.Operandone/this.OperandTwo;
			break;
			
		}
		this.result=result;
	}
	public double getResults() {
		return this.result;
	}
	
	

}
