import java.rmi.Naming;
public class ServidorIdentificacion{
	public ServidorIdentificacion(){}
	
	public static void main(String[]args){
		try{
			ObjetoIdentificador obj=new ObjetoIdentificador();
			Naming.rebind("rmi://localhost/SerIdent",obj);
			System.out.println("Objeto registrado en el servidor de nombres");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
