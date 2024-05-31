import java.util.Arrays;
import java.util.List;

public class Esercizi 
{
    static List<Student> students;
    static List<Classroom> classrooms;
    static List<Professor> professors;


    public static void init()
    {
         // Creazione di studenti
         students = Arrays.asList(
            new Student("Alice", 20, 85.5),
            new Student("Bob", 22, 90.0),
            new Student("Charlie", 21, 78.0),
            new Student("Diana", 23, 92.5),
            new Student("Eve", 20, 88.0),
            new Student("Frank", 24, 65.5),
            new Student("Grace", 21, 72.0),
            new Student("Hank", 22, 80.0),
            new Student("Ivy", 23, 91.0),
            new Student("Jack", 20, 84.0)
            );

        // Creazione di professori
        Professor profSmith = new Professor("Smith", "Mathematics");
        Professor profJones = new Professor("Jones", "Physics");
        Professor profTaylor = new Professor("Taylor", "Chemistry");
        Professor profBrown = new Professor("Brown", "Biology");
        professors = Arrays.asList(profSmith, profJones, profTaylor, profBrown);
        
        // Creazione di classi
        Classroom mathClass = new Classroom("Math 101");
        Classroom physicsClass = new Classroom("Physics 101");
        Classroom chemistryClass = new Classroom("Chemistry 101");
        Classroom biologyClass = new Classroom("Biology 101");

        // Assegnazione di professori alle classi
        mathClass.setProfessor(profSmith);
        physicsClass.setProfessor(profJones);
        chemistryClass.setProfessor(profTaylor);
        biologyClass.setProfessor(profBrown);

        // Assegnazione di studenti alle classi
        mathClass.addStudent(students.get(0));
        mathClass.addStudent(students.get(1));
        mathClass.addStudent(students.get(2));

        physicsClass.addStudent(students.get(2));
        physicsClass.addStudent(students.get(3));
        physicsClass.addStudent(students.get(4));

        chemistryClass.addStudent(students.get(5));
        chemistryClass.addStudent(students.get(6));
        chemistryClass.addStudent(students.get(7));

        biologyClass.addStudent(students.get(8));
        biologyClass.addStudent(students.get(9));

        classrooms = Arrays.asList(mathClass, physicsClass, chemistryClass, biologyClass);
    }
    
    public static void main(String[] args) 
    {
        init();
        //usare questo per fare le prove
        //i metodi devono stampare la richiesta
        es1();
    }

    // Esercizio 1: Elenca tutti gli studenti di tutte le classi
    private static void es1() 
    {

    }

    // Esercizio 2: Trova tutti gli studenti con un voto superiore a 85

    // Esercizio 3: Calcola la media dei voti di tutti gli studenti

    // Esercizio 4: Elenca i nomi di tutti i professori

    // Esercizio 5: Trova lo studente con il voto più alto

    // Esercizio 6: Raggruppa gli studenti per età

    // Esercizio 7: Conta il numero di studenti in ogni classe

    // Esercizio 8: Trova l'età media degli studenti in ogni classe

    // Esercizio 9: Trova i nomi degli studenti che iniziano con una lettera specifica

    // Esercizio 10: Elenca tutti i soggetti insegnati dai professori
}
