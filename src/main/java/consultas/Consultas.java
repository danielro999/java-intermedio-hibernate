package consultas;
import entities.Equipo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;
import java.util.Scanner;

public class Consultas {
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-persistence-unit");
    static EntityManager entityManager;

    public static List<Equipo> listEquipos (){
        entityManager = entityManagerFactory.createEntityManager();
        List<Equipo> listEquipos = entityManager.createQuery("FROM Equipo").getResultList();
        return listEquipos;
    }
    public static void imprimirEquipos() {
            List<Equipo> listEquipos = listEquipos();
            System.out.println("Equipos primera - Partidos jugados - Puntos campeonato");
            for (Equipo equipo : listEquipos) {
                System.out.println(equipo);
            }
    }

    public static void ingresarEquipo(){
        entityManager = entityManagerFactory.createEntityManager();
        Scanner scn = new Scanner(System.in);
        System.out.println("ingresar nombre de equipo:");
        String stringEquipo = scn.nextLine();
        Equipo nuevoEquipo = new Equipo(stringEquipo);
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(nuevoEquipo);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            System.out.println(e);
        }finally {
            entityManager.close();
        }
        imprimirEquipos();
    }
    public static void enfretarEquipos(){
        Equipo equipoLocal = null;
        Equipo equipoVisitante = null;
        while (equipoLocal ==null ){
            System.out.println("equipo local");
            equipoLocal = buscarEquipo();
            if (equipoLocal == null) {
                System.out.println("Ingresar bien el nombre del quipo");
            }
        }
        while (equipoVisitante == null ){
            System.out.println("equipo visitante");
            equipoVisitante = buscarEquipo();
            if (equipoVisitante == null) {
                System.out.println("Ingresar bien el nombre del quipo");
            }
        }
        System.out.println( equipoLocal.getNombre() + " - "+ equipoVisitante.getNombre());

        Scanner scn = new Scanner(System.in);
        System.out.println("ingresar goles de: " + equipoLocal.getNombre());
        int golesLocal = Integer.parseInt(scn.nextLine());

        scn = new Scanner(System.in);
        System.out.println("ingresar goles de: " + equipoVisitante.getNombre());
        int golesVistante = Integer.parseInt(scn.nextLine());
        System.out.println( equipoLocal.getNombre() + " " + golesLocal + " - " + equipoVisitante.getNombre() + " " + golesVistante);
        equipoLocal.enfrentamiento(equipoVisitante, golesLocal, golesVistante);
        equipoVisitante.enfrentamiento(equipoLocal, golesVistante, golesLocal);
        System.out.println(equipoLocal);
        System.out.println(equipoVisitante);
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(equipoLocal);
            entityManager.merge(equipoVisitante);
            entityManager.getTransaction().commit();
                } catch (Exception e) {
                    System.out.println(e);
                } finally {
                    entityManager.close();
                }
        //imprimirEquipos();
    }

     public static Equipo buscarEquipo(){
         Scanner scn = new Scanner(System.in);
         System.out.println("ingresar nombre de equipo:");
         String stringLocal = scn.nextLine();
         Equipo equipo = listEquipos().stream().filter(eq -> eq.getNombre().equals(stringLocal)).findFirst().orElse(null);
         return equipo;
     }

     public static void eliminarEquipo(){
        Equipo equipoEliminar = buscarEquipo();
         try {
             entityManager.getTransaction().begin();
             entityManager.remove(equipoEliminar);
             entityManager.getTransaction().commit();
         } catch (Exception e) {
             System.out.println(e);
         } finally {
             entityManager.close();
         }
     }

}

