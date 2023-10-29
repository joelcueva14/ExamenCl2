package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductocl2;

public class CrudProducto implements IProducto {

	@Override
	public void RegistrarProducto(TblProductocl2 tblpro) {
		//Establecemos la conexion con  la unidad de persistencia...
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_CUEVAMONTALBAN");		
		//Gestionar entidades como registrar, actulizar , eliminar, etc...
		EntityManager emanager=conex.createEntityManager();
		//Iniciamos la transaccion...
		emanager.getTransaction().begin();
		
		//Insertamos la base de datos...
		emanager.persist(tblpro);
		//emitimos un mensaje por consola...
		System.out.println("Dato Registrado en BD");
		//confirmamos...
		emanager.getTransaction().commit();
		//cerramos...
		emanager.close();	
		
	}

	@Override
	public void ActualizarProducto(TblProductocl2 tblpro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarProducto(TblProductocl2 tblpro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblProductocl2> ListadoProducto() {
		 //Establecemos la conexion con  la unidad de persistencia...
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL1_CUEVAMONTALBAN");
		//Gestionar entidades como registrar, actulizar , eliminar, etc...
		EntityManager emanager=conex.createEntityManager();
		//Iniciamos la transaccion...
		emanager.getTransaction().begin();

        List<TblProductocl2> listado=emanager.createQuery("select e from TblProductocl2 e",TblProductocl2.class).getResultList();

        //confirmamos...
        emanager.getTransaction().commit();
        //cerramos...
        emanager.close();

        return listado;
	}

	@Override
	public TblProductocl2 BuscarProductoCodigo(TblProductocl2 tblpro) {
		// TODO Auto-generated method stub
		return null;
	}

}
