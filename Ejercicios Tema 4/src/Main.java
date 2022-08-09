public class Main {
    public static void main(String[] args) throws Exception {
        int numeroif = 4;
        if(numeroif > 0){
            System.out.println("Es positivo.");
        }
        else if(numeroif < 0) {
            System.out.println("Es Negativo.");
        }
        else{
            System.out.println("Es 0.");
        }


        int numeroWhile = -2;

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }


        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while(numeroWhile < 3);

        for(int numeroFor = 0; numeroFor <= 3; System.out.println(numeroFor)){
            numeroFor++;
        };


        String estación = "Invierno";

        switch(estación){
            case "Verano":
                System.out.println("Es verano.");
                break;
            case "Otoño":
                System.out.println("Es otoño.");
                break;
            case "Invierno":
                System.out.println("Es invierno.");
                break;
            case "Primavera":
                System.out.println("Es primavera.");
                break;
            default:
                System.out.println("Estación inválida.");   
        }



    }
}
