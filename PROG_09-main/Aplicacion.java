import java.util.Arrays;

public class Aplicacion {
    public static void main(String[] args) {

        Profesor[] profesores = new Profesor[5];
        System.out.println(" ");
        System.out.println("---LISTADO DE PROFESORES---");
        profesores[0] = new Profesor("Manolo", 34, "Entornos de desarrollo");
        profesores[1] = new Profesor("Marcos", 42, "FOL");
        profesores[2] = new Profesor("Clara", 32, "Sistemas Informáticos");
        profesores[3] = new Profesor("Laura", 45, "Lenguaje de Marcas");
        profesores[4] = new Profesor("Paco", 35, "Ingles");


        for(Profesor profe : profesores) {
            System.out.println(profe);
        }

        String[] listaAsignaturas = new String[6];

        listaAsignaturas[0] = "Entornos de desarrollo, ";
        listaAsignaturas[1] = "Programación";
        listaAsignaturas[2] = "FOL";
        listaAsignaturas[3] = "Bases de datos";
        listaAsignaturas[4] = "Sistemas informáticos";
        listaAsignaturas[5] = "Inglés";


        System.out.println(" ");

        Alumno[] alumnos = new Alumno[5];

        alumnos[0] = new Libre("Lucas", 18, 1, "Grado superior", listaAsignaturas, 10, 6);
        alumnos[1] = new Presencial("Lucia", 19, 1, "Grado superior" , listaAsignaturas, 250.50, 2, 25);
        alumnos[2] = new Libre("Jesus", 18, 1, "Grado superior", listaAsignaturas, 10, 6);
        alumnos[3] = new Presencial("Lorena", 19, 1, "Grado superior", listaAsignaturas, 250.50, 3, 25);
        alumnos[4] = new Presencial("Paula", 19, 1, "Grado superior", listaAsignaturas, 250.50, 4, 25);

        System.out.println("---LISTADO ESTUDIANTES/ASIGNATURAS--- ");
        for(int i = 0; i < alumnos.length; i++){
            System.out.println(alumnos[i].mostrarAsignaturas());
        }

        System.out.println(" ");
        System.out.println("---LISTADO PAGA AL MES---");
        for (int i = 0; i < alumnos.length; i++){
            System.out.println("El estudiante " + alumnos[i].getNombre() + " paga al mes: " + alumnos[i].pagoMensual());
        }
        double totalCobrado = alumnos[0].pagoMensual() + alumnos[1].pagoMensual() + alumnos[2].pagoMensual() + alumnos[3].pagoMensual() + alumnos[4].pagoMensual();
        System.out.println("La cantidad total cobrada al mes es de: " + totalCobrado);
            }
        }


