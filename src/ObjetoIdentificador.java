import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
	public class ObjetoIdentificador extends UnicastRemoteObject implements Identificacion{
		public ObjetoIdentificador()throws RemoteException{
			super();
		}
		public String identificar(String s)throws RemoteException{
			return "se identifico al "+s;
		}
	}