
package com.Caluculator.java;

public class Caluculate implements iCalc
{

	private Double dbNum;
	private int iFirstNum;
	private int iSecondNum;
	private char cOperator;//cOperator1;
	private int results,results1,results2;
    private double results3,results4,results5;
	public Caluculate()
	{
    } 
//constructor for scientific calculations
Caluculate(Double dbNum,char cOperator1 ){
	this.dbNum=dbNum;
	//this.cOperator1=cOperator;
	
}
//constructor for basic calculations
Caluculate(int a,char c,int b ){
     iFirstNum=a;
	 cOperator=c;
     iSecondNum=b;
     System.out.println(this.cOperator);
     System.out.println(this.iFirstNum);
     System.out.println(this.iSecondNum);
	
}
//Calculate the result based on the Numbers and Operators Inputed by user
@Override
public void doCaluculation() {

	switch(this.cOperator) {

 case '+':
              results= (iFirstNum+iSecondNum);
	          break;

 case '-':
              results1=(iFirstNum-iSecondNum);
	          break;
 
 case '*':
              results2=(iFirstNum*iSecondNum);
             break;

case '/':
              results3= (iFirstNum/iSecondNum);
	          break;

case '%':
            results4= (iFirstNum%iSecondNum);
	         break;

case '^':
  
             results5=Math.pow(iFirstNum,iSecondNum);
	        break;

default:
            System.out.println("Invalid operator");
            break;
	}
}
//print the result of Calculation
@Override
public void getResult() {
	if(cOperator=='+') {
		 System.out.println("Result = "+ results);
	}
	if(cOperator=='-') {
		 System.out.println("Result = "+ results1);
	}
	if(cOperator=='*') {
		 System.out.println("Result = "+ results2);
	}
	if(cOperator=='/') {
		 System.out.println("Result = "+ results3);
	}
	if(cOperator=='%') {
		 System.out.println("Result = "+ results4);
	}
	if(cOperator=='^') {
		 System.out.println("Result = "+ results5);
	}
	 
}

public void checkSecondNum() {
	
}
//Checks if basic calculation is performed
public void checkInt() {
	
}
//checks if Scientific calculation is performed
public void checkDouble() {
	
}







}
