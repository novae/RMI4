import java.rmi.Remote;
import java.rmi.RemoteException;
	public interface Identificacion extends Remote{
		public String identificar(String s)throws RemoteException;
	}