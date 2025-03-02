// 1) Define RMI
import java.rmi.*; 
public interface RemoteInterface extends Remote{
    public int add(int x, int y) throws RemoteException;
}

// 2) Implement RMI
import java.rmi.*;
import java.rmi.server.*;
public class RemoteInterfaceImplement extends UnicastRemoteObject implements RemoteInterface(){
    super();

}
public int add(int x, int y){
    return (x+y);
}

// 3) Create Server
import java.rmi.*;
import java.rmi.registry.*;
public class Server{
    public static void main(String[] args){
        RemoteInterfaceImplement rii = new RemoteInterfaceImplement();
        LocateRegistry.createRegistry(1099);
        Naming.rebind("SERVICE",rii);
        s.o.pl("Server Started");
    }
}


import java.rmi.*;
import java.io.*;
public class Client{
    public static void main(String[] args){
        String ip="rmi://127.0.0.1/SERVICE";
        RemoteInterface ri= Naming.lookup(ip)
        S.o.pl("Sum is:"+ri.add(1,3));
    }
}