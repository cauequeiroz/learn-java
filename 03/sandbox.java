class sandbox {
    public static void main(String[] args) {

        /*  Tipos Primitivos
         * ---------------------------- */

        // Inteiro
        int idade = 15;
        System.out.println(idade);

        int proxIdade = idade + 1;
        System.out.println(proxIdade);
        
        // Real
        double x = 3.14;
        System.out.println(x);
        
        // Boleano
        boolean adulto = idade > 18;
        System.out.println(adulto);

        // Char
        char letra = 'a';
        System.out.println(letra);

        /*  Casting
         * ---------------------------- */

        double pi = 3.14;
        int numero = (int) pi;
        System.out.println(numero);
        
        /*  Condicionais
         * ---------------------------- */

        int age = 19;
        boolean friend = false;

        if ( age < 18 && !friend ) {
            System.out.println("Não pode entrar.");
        } else {
            System.out.println("Pode entrar.");
        }
        
        /*  Loops
         * ----------------------------- */

        int i = 0;
        while( i < 10 ) {
            System.out.println(i);
            i = i + 1;
        }

        for (int b=0; b<10; b++) {
            System.out.println("Olá.");
        }

        System.out.println("-----------------");

        for (int c=0; c<20; c++) {
            if ( c > 5 && c < 10 ) {
                continue;
            } 
            System.out.println(c);
            if ( c == 13 ) {
                break;
            }
        }
    }
}
