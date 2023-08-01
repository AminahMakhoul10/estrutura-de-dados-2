public class Arrays{
    public static void main(String[] args) {
        System.out.println("Arrays");
        String[] nomes = new String[]{
            "João", "Maria", "Teddy", "Joana", "Marta"
        };
        int i = 0;
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
        System.out.println(nomes[3]);
        System.out.println(nomes[4]);

        int i = 0;
        while(i< nomes.length){ //ou for no lugar do while
              System.out.println(nomes[i]);
              i = i +1;
              //for(String nome:nomes)
              //  System.out.println(nome)
    }
}
}