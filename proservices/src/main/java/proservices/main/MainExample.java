package proservices.main;

import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;
import proservices.servicios.Servicio;

import javax.persistence.EntityTransaction;
import java.util.List;

public class MainExample implements WithSimplePersistenceUnit {

    public static void main(String[] args) {
        new MainExample().start();
    }

    private void start() {




    }

    private void recuperarTodosLosServicios() {
        List<Servicio> servicios = entityManager().createQuery("from "+Servicio.class.getName()).getResultList();
        System.out.println(servicios);

    }

    private void recuperarJardineriaPorNombre(){
        Servicio unServicio = (Servicio) entityManager()
                .createQuery("FROM " + Servicio.class.getName() + " WHERE nombre = :nombre")
                .setParameter("nombre","Jardineria")
                .getSingleResult();
        //Busqueda por parametros nomenclados

        System.out.println(unServicio);

    }

    private void recuperarJardineriaPorId() {
        Servicio jardineria = entityManager().find(Servicio.class,1);
        //Buscame una instancia de servicio cuyo id sea 1
        System.out.println(jardineria.toString());
    }

    private void guardarJardineria() {
        Servicio unServicio = new Servicio();
        unServicio.setNombre("Jardineria");

        //en caso q el constructor este vacio va a romper


        EntityTransaction tx = entityManager().getTransaction(); // Cuando le decimos al EM q nos devuelva una
        // transaccion lo que le vamos a decir es ahora EM
        // prepara todas las sentencias, pero no los ejecutes todavia, ejecutalo cuando llame a transaction commit()
        //entityManager objeto de tipo dataMapper, es el responsable de ayudarnos con la conexion de la base
        //em esta en la capa de datos
        tx.begin();
        entityManager().persist(unServicio); // INSERT INTO ......
        tx.commit();
        //el concepto de transaccion es un concepto de BD relacional y lo que nos dice es que todas estas sentencias se
        // van a ejecutar y van a pasar todas juntas, y si alguna falla, todas fallan
        // concepto de rollback deshace todas las sentencias q habian pasado si una fallo, justamente las tx nos
        // aseguran q todas se van a ejecutar en su conjunto y si alguna no pasa, ninguna pasa. Para q la BD quede en un estado consistente

        //ACLARACION: las tx funcionan si tengo que hacer una operacion de INSERT, UPDATE, DELETE
        //si tengo que BUSCAR no tengo q meterlo en una tx

        //Las tablas se van a bloquear siempre que haya una FK

    }
}
