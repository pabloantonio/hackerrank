package mx.cactux.day12;

class Student extends Person{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here

    public Student(String firstName , String lastName , Integer id , int[] testScores){
        super(firstName, lastName , id);
        this.testScores = testScores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public char calculate(){
       char grado = 'T';
        int numElementos = this.testScores.length;
        int suma = 0;
        for(int i=0;i<this.testScores.length;i++){
              suma = this.testScores[i]+suma;
        }

       int promedio = suma / numElementos;

        if(promedio>=90 && promedio<=100){
            grado = 'O';
        }else if(promedio>=80 && promedio<=90){
            grado = 'E';
        }else if(promedio>=70 && promedio<80){
            grado = 'A';
        }else if(promedio>=55 && promedio<70){
            grado = 'P';
        }else if(promedio>=40 && promedio<55){
            grado = 'D';
        }else if(promedio<40){
            grado = 'T';
        }

        return grado;
    }
}
