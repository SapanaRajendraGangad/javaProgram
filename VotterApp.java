class VoterException extends ArithmeticException{
      public String getVoterError(){
	return  "Invalid Voter because below 18";
    }
}
class VotingMachine{
    void verifyVoter(int age){
	if(age<18){
	 VoterException  ve = new VoterException();
	   throw ve;
	}
	else{
	  System.out.println("valid voter");
	}
   }
} 
public class VotterApp
{  public static void main(String x[])
   {
	try{
		VotingMachine vm = new VotingMachine();
		vm.verifyVoter(10);
	}
	catch(VoterException ve){
	  System.out.println(ve.getVoterError());
	}
   }
}


