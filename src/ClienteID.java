import java.rmi.Naming;
	public class ClienteID{
		public static final String cliente="Cliente 123";
		public ClienteID(){}
		
		public static void main(String[]args){
			try{
				Identificacion obj=(Identificacion)Naming.lookup("rmi://localhost/SerIdent");
				System.out.println("El servidor respondio: "+obj.identificar("Cliente 123"));
			}
			catch(Exception e){
				System.out.println("No hay respuesta del servidor");
				e.printStackTrace();
			}
		}
	}